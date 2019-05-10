package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash.FatalException;
import io.fabric.sdk.android.services.common.Crash.LoggedException;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CrashlyticsController
{
  private static final int ANALYZER_VERSION = 1;
  private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
  private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
  private static final String EVENT_TYPE_CRASH = "crash";
  private static final String EVENT_TYPE_LOGGED = "error";
  static final String FATAL_SESSION_DIR = "fatal-sessions";
  static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
  static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
  static final String FIREBASE_CRASH_TYPE = "fatal";
  static final int FIREBASE_CRASH_TYPE_FATAL = 1;
  static final String FIREBASE_REALTIME = "_r";
  static final String FIREBASE_TIMESTAMP = "timestamp";
  private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
  private static final String[] INITIAL_SESSION_PART_TAGS;
  static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
  static final Comparator LARGEST_FILE_NAME_FIRST;
  static final int MAX_INVALID_SESSIONS = 4;
  private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
  static final int MAX_OPEN_SESSIONS = 8;
  static final int MAX_STACK_SIZE = 1024;
  static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
  static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
  private static final Map SEND_AT_CRASHTIME_HEADER;
  static final String SESSION_APP_TAG = "SessionApp";
  static final FilenameFilter SESSION_BEGIN_FILE_FILTER;
  static final String SESSION_BEGIN_TAG = "BeginSession";
  static final String SESSION_DEVICE_TAG = "SessionDevice";
  static final FileFilter SESSION_DIRECTORY_FILTER;
  static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
  static final String SESSION_FATAL_TAG = "SessionCrash";
  static final FilenameFilter SESSION_FILE_FILTER;
  private static final Pattern SESSION_FILE_PATTERN;
  private static final int SESSION_ID_LENGTH = 35;
  static final String SESSION_JSON_SUFFIX = ".json";
  static final String SESSION_NON_FATAL_TAG = "SessionEvent";
  static final String SESSION_OS_TAG = "SessionOS";
  static final String SESSION_USER_TAG = "SessionUser";
  private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT;
  static final Comparator SMALLEST_FILE_NAME_FIRST;
  private final AppData appData;
  private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
  private final CrashlyticsBackgroundWorker backgroundWorker;
  private CrashlyticsUncaughtExceptionHandler crashHandler;
  private final CrashlyticsCore crashlyticsCore;
  private final DevicePowerStateListener devicePowerStateListener;
  private final AtomicInteger eventCounter;
  private final FileStore fileStore;
  private final EventLogger firebaseAnalyticsLogger;
  private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
  private final HttpRequestFactory httpRequestFactory;
  private final IdManager idManager;
  private final CrashlyticsController.LogFileDirectoryProvider logFileDirectoryProvider;
  private final LogFileManager logFileManager;
  private final PreferenceManager preferenceManager;
  private final ReportUploader.ReportFilesProvider reportFilesProvider;
  private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
  private final String unityVersion;
  
  static
  {
    Object localObject = new com/crashlytics/android/core/CrashlyticsController$1;
    ((CrashlyticsController.1)localObject).<init>("BeginSession");
    SESSION_BEGIN_FILE_FILTER = (FilenameFilter)localObject;
    localObject = new com/crashlytics/android/core/CrashlyticsController$2;
    ((CrashlyticsController.2)localObject).<init>();
    SESSION_FILE_FILTER = (FilenameFilter)localObject;
    localObject = new com/crashlytics/android/core/CrashlyticsController$3;
    ((CrashlyticsController.3)localObject).<init>();
    SESSION_DIRECTORY_FILTER = (FileFilter)localObject;
    localObject = new com/crashlytics/android/core/CrashlyticsController$4;
    ((CrashlyticsController.4)localObject).<init>();
    LARGEST_FILE_NAME_FIRST = (Comparator)localObject;
    localObject = new com/crashlytics/android/core/CrashlyticsController$5;
    ((CrashlyticsController.5)localObject).<init>();
    SMALLEST_FILE_NAME_FIRST = (Comparator)localObject;
    SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    localObject = new String[4];
    localObject[0] = "SessionUser";
    localObject[1] = "SessionApp";
    localObject[2] = "SessionOS";
    localObject[3] = "SessionDevice";
    INITIAL_SESSION_PART_TAGS = (String[])localObject;
  }
  
  CrashlyticsController(CrashlyticsCore paramCrashlyticsCore, CrashlyticsBackgroundWorker paramCrashlyticsBackgroundWorker, HttpRequestFactory paramHttpRequestFactory, IdManager paramIdManager, PreferenceManager paramPreferenceManager, FileStore paramFileStore, AppData paramAppData, UnityVersionProvider paramUnityVersionProvider, AppMeasurementEventListenerRegistrar paramAppMeasurementEventListenerRegistrar, EventLogger paramEventLogger)
  {
    Object localObject1 = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject1).<init>(0);
    this.eventCounter = ((AtomicInteger)localObject1);
    this.crashlyticsCore = paramCrashlyticsCore;
    this.backgroundWorker = paramCrashlyticsBackgroundWorker;
    this.httpRequestFactory = paramHttpRequestFactory;
    this.idManager = paramIdManager;
    this.preferenceManager = paramPreferenceManager;
    this.fileStore = paramFileStore;
    this.appData = paramAppData;
    localObject1 = paramUnityVersionProvider.getUnityVersion();
    this.unityVersion = ((String)localObject1);
    this.appMeasurementEventListenerRegistrar = paramAppMeasurementEventListenerRegistrar;
    this.firebaseAnalyticsLogger = paramEventLogger;
    localObject1 = paramCrashlyticsCore.getContext();
    Object localObject2 = new com/crashlytics/android/core/CrashlyticsController$LogFileDirectoryProvider;
    ((CrashlyticsController.LogFileDirectoryProvider)localObject2).<init>(paramFileStore);
    this.logFileDirectoryProvider = ((CrashlyticsController.LogFileDirectoryProvider)localObject2);
    localObject2 = new com/crashlytics/android/core/LogFileManager;
    Object localObject3 = this.logFileDirectoryProvider;
    ((LogFileManager)localObject2).<init>((Context)localObject1, (LogFileManager.DirectoryProvider)localObject3);
    this.logFileManager = ((LogFileManager)localObject2);
    localObject2 = new com/crashlytics/android/core/CrashlyticsController$ReportUploaderFilesProvider;
    ((CrashlyticsController.ReportUploaderFilesProvider)localObject2).<init>(this, null);
    this.reportFilesProvider = ((ReportUploader.ReportFilesProvider)localObject2);
    localObject2 = new com/crashlytics/android/core/CrashlyticsController$ReportUploaderHandlingExceptionCheck;
    ((CrashlyticsController.ReportUploaderHandlingExceptionCheck)localObject2).<init>(this, null);
    this.handlingExceptionCheck = ((ReportUploader.HandlingExceptionCheck)localObject2);
    localObject2 = new com/crashlytics/android/core/DevicePowerStateListener;
    ((DevicePowerStateListener)localObject2).<init>((Context)localObject1);
    this.devicePowerStateListener = ((DevicePowerStateListener)localObject2);
    localObject1 = new com/crashlytics/android/core/MiddleOutFallbackStrategy;
    localObject3 = new StackTraceTrimmingStrategy[1];
    RemoveRepeatsStrategy localRemoveRepeatsStrategy = new com/crashlytics/android/core/RemoveRepeatsStrategy;
    localRemoveRepeatsStrategy.<init>(10);
    localObject3[0] = localRemoveRepeatsStrategy;
    ((MiddleOutFallbackStrategy)localObject1).<init>(1024, (StackTraceTrimmingStrategy[])localObject3);
    this.stackTraceTrimmingStrategy = ((StackTraceTrimmingStrategy)localObject1);
  }
  
  private void closeOpenSessions(File[] paramArrayOfFile, int paramInt1, int paramInt2)
  {
    Object localObject1 = Fabric.getLogger();
    String str1 = "CrashlyticsCore";
    Object localObject2 = "Closing open sessions.";
    ((Logger)localObject1).d(str1, (String)localObject2);
    for (;;)
    {
      int i = paramArrayOfFile.length;
      if (paramInt1 >= i) {
        break;
      }
      localObject1 = paramArrayOfFile[paramInt1];
      str1 = getSessionIdFromSessionFile((File)localObject1);
      localObject2 = Fabric.getLogger();
      String str2 = "CrashlyticsCore";
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str3 = "Closing session: ";
      localObject3 = str3 + str1;
      ((Logger)localObject2).d(str2, (String)localObject3);
      writeSessionPartsToSessionFile((File)localObject1, str1, paramInt2);
      paramInt1 += 1;
    }
  }
  
  private void closeWithoutRenamingOrLog(ClsFileOutputStream paramClsFileOutputStream)
  {
    if (paramClsFileOutputStream == null) {}
    for (;;)
    {
      return;
      try
      {
        paramClsFileOutputStream.closeInProgressStream();
      }
      catch (IOException localIOException)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Error closing session file stream in the presence of an exception";
        localLogger.e(str1, str2, localIOException);
      }
    }
  }
  
  private static void copyToCodedOutputStream(InputStream paramInputStream, CodedOutputStream paramCodedOutputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    for (;;)
    {
      int j = arrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = arrayOfByte.length - i;
      j = paramInputStream.read(arrayOfByte, i, j);
      if (j < 0) {
        break;
      }
      i += j;
    }
    paramCodedOutputStream.writeRawBytes(arrayOfByte);
  }
  
  private void deleteSessionPartFilesFor(String paramString)
  {
    File[] arrayOfFile = listSessionPartFilesFor(paramString);
    int i = arrayOfFile.length;
    int j = 0;
    while (j < i)
    {
      File localFile = arrayOfFile[j];
      localFile.delete();
      j += 1;
    }
  }
  
  private void doCloseSessions(SessionSettingsData paramSessionSettingsData, boolean paramBoolean)
  {
    int i;
    Object localObject;
    int k;
    Logger localLogger;
    String str;
    if (paramBoolean)
    {
      i = 1;
      int j = i + 8;
      trimOpenSessions(j);
      localObject = listSortedSessionBeginFiles();
      k = localObject.length;
      if (k > i) {
        break label70;
      }
      localLogger = Fabric.getLogger();
      localObject = "CrashlyticsCore";
      str = "No open sessions to be closed.";
      localLogger.d((String)localObject, str);
    }
    for (;;)
    {
      return;
      i = 0;
      localLogger = null;
      break;
      label70:
      str = getSessionIdFromSessionFile(localObject[i]);
      writeSessionUser(str);
      if (paramSessionSettingsData == null)
      {
        localLogger = Fabric.getLogger();
        localObject = "CrashlyticsCore";
        str = "Unable to close session. Settings are not loaded.";
        localLogger.d((String)localObject, str);
      }
      else
      {
        k = paramSessionSettingsData.maxCustomExceptionEvents;
        closeOpenSessions((File[])localObject, i, k);
      }
    }
  }
  
  private void doOpenSession()
  {
    Date localDate = new java/util/Date;
    localDate.<init>();
    Object localObject1 = new com/crashlytics/android/core/CLSUUID;
    Object localObject2 = this.idManager;
    ((CLSUUID)localObject1).<init>((IdManager)localObject2);
    localObject1 = ((CLSUUID)localObject1).toString();
    localObject2 = Fabric.getLogger();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = "Opening a new session with ID " + (String)localObject1;
    ((Logger)localObject2).d("CrashlyticsCore", (String)localObject3);
    writeBeginSession((String)localObject1, localDate);
    writeSessionApp((String)localObject1);
    writeSessionOS((String)localObject1);
    writeSessionDevice((String)localObject1);
    this.logFileManager.setCurrentSession((String)localObject1);
  }
  
  /* Error */
  private void doWriteNonFatal(Date paramDate, Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokespecial 293	com/crashlytics/android/core/CrashlyticsController:getCurrentSessionId	()Ljava/lang/String;
    //   7: astore 5
    //   9: aload 5
    //   11: ifnonnull +31 -> 42
    //   14: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   17: astore 6
    //   19: ldc_w 338
    //   22: astore 7
    //   24: ldc_w 453
    //   27: astore 8
    //   29: aload 6
    //   31: aload 7
    //   33: aload 8
    //   35: aconst_null
    //   36: invokeinterface 377 4 0
    //   41: return
    //   42: aload_3
    //   43: invokevirtual 457	java/lang/Object:getClass	()Ljava/lang/Class;
    //   46: invokevirtual 462	java/lang/Class:getName	()Ljava/lang/String;
    //   49: astore 6
    //   51: aload 5
    //   53: aload 6
    //   55: invokestatic 465	com/crashlytics/android/core/CrashlyticsController:recordLoggedExceptionAnswersEvent	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   61: astore 6
    //   63: ldc_w 338
    //   66: astore 7
    //   68: new 352	java/lang/StringBuilder
    //   71: astore 8
    //   73: aload 8
    //   75: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   78: ldc_w 467
    //   81: astore 9
    //   83: aload 8
    //   85: aload 9
    //   87: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: astore 8
    //   92: aload 8
    //   94: aload_3
    //   95: invokevirtual 470	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: astore 8
    //   100: ldc_w 472
    //   103: astore 9
    //   105: aload 8
    //   107: aload 9
    //   109: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: astore 8
    //   114: aload_2
    //   115: invokevirtual 475	java/lang/Thread:getName	()Ljava/lang/String;
    //   118: astore 9
    //   120: aload 8
    //   122: aload 9
    //   124: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: astore 8
    //   129: aload 8
    //   131: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: astore 8
    //   136: aload 6
    //   138: aload 7
    //   140: aload 8
    //   142: invokeinterface 346 3 0
    //   147: aload_0
    //   148: getfield 207	com/crashlytics/android/core/CrashlyticsController:eventCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   151: astore 6
    //   153: aload 6
    //   155: invokevirtual 479	java/util/concurrent/atomic/AtomicInteger:getAndIncrement	()I
    //   158: istore 10
    //   160: iload 10
    //   162: invokestatic 485	io/fabric/sdk/android/services/common/CommonUtils:padWithZerosToMaxIntWidth	(I)Ljava/lang/String;
    //   165: astore 6
    //   167: new 352	java/lang/StringBuilder
    //   170: astore 7
    //   172: aload 7
    //   174: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   177: aload 7
    //   179: aload 5
    //   181: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: astore 7
    //   186: ldc 95
    //   188: astore 8
    //   190: aload 7
    //   192: aload 8
    //   194: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: astore 7
    //   199: aload 7
    //   201: aload 6
    //   203: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: astore 6
    //   208: aload 6
    //   210: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: astore 6
    //   215: new 368	com/crashlytics/android/core/ClsFileOutputStream
    //   218: astore 11
    //   220: aload_0
    //   221: invokevirtual 489	com/crashlytics/android/core/CrashlyticsController:getFilesDir	()Ljava/io/File;
    //   224: astore 7
    //   226: aload 11
    //   228: aload 7
    //   230: aload 6
    //   232: invokespecial 492	com/crashlytics/android/core/ClsFileOutputStream:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   235: aload 11
    //   237: invokestatic 496	com/crashlytics/android/core/CodedOutputStream:newInstance	(Ljava/io/OutputStream;)Lcom/crashlytics/android/core/CodedOutputStream;
    //   240: astore 4
    //   242: ldc 21
    //   244: astore 12
    //   246: aload_0
    //   247: astore 6
    //   249: aload_1
    //   250: astore 7
    //   252: aload_2
    //   253: astore 8
    //   255: aload_3
    //   256: astore 9
    //   258: aload_0
    //   259: aload 4
    //   261: aload_1
    //   262: aload_2
    //   263: aload_3
    //   264: aload 12
    //   266: iconst_0
    //   267: invokespecial 500	com/crashlytics/android/core/CrashlyticsController:writeSessionEvent	(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    //   270: aload 4
    //   272: ldc_w 502
    //   275: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   278: ldc_w 508
    //   281: astore 6
    //   283: aload 11
    //   285: aload 6
    //   287: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   290: bipush 64
    //   292: istore 10
    //   294: aload_0
    //   295: aload 5
    //   297: iload 10
    //   299: invokespecial 517	com/crashlytics/android/core/CrashlyticsController:trimSessionEventFiles	(Ljava/lang/String;I)V
    //   302: goto -261 -> 41
    //   305: astore 6
    //   307: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   310: astore 4
    //   312: ldc_w 338
    //   315: astore 7
    //   317: ldc_w 519
    //   320: astore 8
    //   322: aload 4
    //   324: aload 7
    //   326: aload 8
    //   328: aload 6
    //   330: invokeinterface 377 4 0
    //   335: goto -294 -> 41
    //   338: astore 6
    //   340: aconst_null
    //   341: astore 7
    //   343: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   346: astore 8
    //   348: ldc_w 338
    //   351: astore 9
    //   353: ldc_w 521
    //   356: astore 12
    //   358: aload 8
    //   360: aload 9
    //   362: aload 12
    //   364: aload 6
    //   366: invokeinterface 377 4 0
    //   371: aload 4
    //   373: ldc_w 502
    //   376: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   379: ldc_w 508
    //   382: astore 6
    //   384: aload 7
    //   386: aload 6
    //   388: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   391: goto -101 -> 290
    //   394: astore 6
    //   396: aconst_null
    //   397: astore 7
    //   399: aload 4
    //   401: ldc_w 502
    //   404: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   407: aload 7
    //   409: ldc_w 508
    //   412: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   415: aload 6
    //   417: athrow
    //   418: astore 6
    //   420: aload 11
    //   422: astore 7
    //   424: goto -25 -> 399
    //   427: astore 6
    //   429: goto -30 -> 399
    //   432: astore 6
    //   434: aload 11
    //   436: astore 7
    //   438: goto -95 -> 343
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	441	0	this	CrashlyticsController
    //   0	441	1	paramDate	Date
    //   0	441	2	paramThread	Thread
    //   0	441	3	paramThrowable	Throwable
    //   1	399	4	localObject1	Object
    //   7	289	5	str1	String
    //   17	269	6	localObject2	Object
    //   305	24	6	localException1	Exception
    //   338	27	6	localException2	Exception
    //   382	5	6	str2	String
    //   394	22	6	localObject3	Object
    //   418	1	6	localObject4	Object
    //   427	1	6	localObject5	Object
    //   432	1	6	localException3	Exception
    //   22	415	7	localObject6	Object
    //   27	332	8	localObject7	Object
    //   81	280	9	localObject8	Object
    //   158	140	10	i	int
    //   218	217	11	localClsFileOutputStream	ClsFileOutputStream
    //   244	119	12	str3	String
    // Exception table:
    //   from	to	target	type
    //   297	302	305	java/lang/Exception
    //   58	61	338	java/lang/Exception
    //   68	71	338	java/lang/Exception
    //   73	78	338	java/lang/Exception
    //   85	90	338	java/lang/Exception
    //   94	98	338	java/lang/Exception
    //   107	112	338	java/lang/Exception
    //   114	118	338	java/lang/Exception
    //   122	127	338	java/lang/Exception
    //   129	134	338	java/lang/Exception
    //   140	147	338	java/lang/Exception
    //   147	151	338	java/lang/Exception
    //   153	158	338	java/lang/Exception
    //   160	165	338	java/lang/Exception
    //   167	170	338	java/lang/Exception
    //   172	177	338	java/lang/Exception
    //   179	184	338	java/lang/Exception
    //   192	197	338	java/lang/Exception
    //   201	206	338	java/lang/Exception
    //   208	213	338	java/lang/Exception
    //   215	218	338	java/lang/Exception
    //   220	224	338	java/lang/Exception
    //   230	235	338	java/lang/Exception
    //   58	61	394	finally
    //   68	71	394	finally
    //   73	78	394	finally
    //   85	90	394	finally
    //   94	98	394	finally
    //   107	112	394	finally
    //   114	118	394	finally
    //   122	127	394	finally
    //   129	134	394	finally
    //   140	147	394	finally
    //   147	151	394	finally
    //   153	158	394	finally
    //   160	165	394	finally
    //   167	170	394	finally
    //   172	177	394	finally
    //   179	184	394	finally
    //   192	197	394	finally
    //   201	206	394	finally
    //   208	213	394	finally
    //   215	218	394	finally
    //   220	224	394	finally
    //   230	235	394	finally
    //   235	240	418	finally
    //   266	270	418	finally
    //   343	346	427	finally
    //   364	371	427	finally
    //   235	240	432	java/lang/Exception
    //   266	270	432	java/lang/Exception
  }
  
  private File[] ensureFileArrayNotNull(File[] paramArrayOfFile)
  {
    if (paramArrayOfFile == null) {
      paramArrayOfFile = new File[0];
    }
    return paramArrayOfFile;
  }
  
  private void finalizeMostRecentNativeCrash(Context paramContext, File paramFile, String paramString)
  {
    Object localObject1 = NativeFileUtils.minidumpFromDirectory(paramFile);
    Object localObject2 = NativeFileUtils.metadataJsonFromDirectory(paramFile);
    Object localObject3 = NativeFileUtils.binaryImagesJsonFromDirectory(paramFile, paramContext);
    Object localObject4;
    if (localObject1 != null)
    {
      int i = localObject1.length;
      if (i != 0) {}
    }
    else
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "No minidump data found in directory ";
      localObject3 = (String)localObject4 + paramFile;
      ((Logger)localObject1).w((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      return;
      recordFatalExceptionAnswersEvent(paramString, "<native-crash: minidump>");
      localObject4 = readFile(paramString, "BeginSession.json");
      byte[] arrayOfByte1 = readFile(paramString, "SessionApp.json");
      byte[] arrayOfByte2 = readFile(paramString, "SessionDevice.json");
      byte[] arrayOfByte3 = readFile(paramString, "SessionOS.json");
      Object localObject5 = new com/crashlytics/android/core/MetaDataStore;
      Object localObject6 = getFilesDir();
      ((MetaDataStore)localObject5).<init>((File)localObject6);
      localObject5 = NativeFileUtils.readFile(((MetaDataStore)localObject5).getUserDataFileForSession(paramString));
      localObject6 = new com/crashlytics/android/core/LogFileManager;
      Object localObject7 = this.crashlyticsCore.getContext();
      Object localObject8 = this.logFileDirectoryProvider;
      ((LogFileManager)localObject6).<init>((Context)localObject7, (LogFileManager.DirectoryProvider)localObject8, paramString);
      localObject7 = ((LogFileManager)localObject6).getBytesForLog();
      ((LogFileManager)localObject6).clearLog();
      localObject6 = new com/crashlytics/android/core/MetaDataStore;
      localObject8 = getFilesDir();
      ((MetaDataStore)localObject6).<init>((File)localObject8);
      localObject6 = NativeFileUtils.readFile(((MetaDataStore)localObject6).getKeysFileForSession(paramString));
      localObject8 = new java/io/File;
      Object localObject9 = this.fileStore.getFilesDir();
      ((File)localObject8).<init>((File)localObject9, paramString);
      boolean bool = ((File)localObject8).mkdir();
      if (!bool)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        localObject3 = "Couldn't create native sessions directory";
        ((Logger)localObject1).d((String)localObject2, (String)localObject3);
      }
      else
      {
        localObject9 = new java/io/File;
        String str = "minidump";
        ((File)localObject9).<init>((File)localObject8, str);
        gzipIfNotEmpty((byte[])localObject1, (File)localObject9);
        localObject1 = new java/io/File;
        localObject9 = "metadata";
        ((File)localObject1).<init>((File)localObject8, (String)localObject9);
        gzipIfNotEmpty((byte[])localObject2, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "binaryImages");
        gzipIfNotEmpty((byte[])localObject3, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "session");
        gzipIfNotEmpty((byte[])localObject4, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "app");
        gzipIfNotEmpty(arrayOfByte1, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "device");
        gzipIfNotEmpty(arrayOfByte2, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "os");
        gzipIfNotEmpty(arrayOfByte3, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "user");
        gzipIfNotEmpty((byte[])localObject5, (File)localObject1);
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((File)localObject8, "logs");
        gzipIfNotEmpty((byte[])localObject7, (File)localObject1);
        localObject1 = new java/io/File;
        localObject2 = "keys";
        ((File)localObject1).<init>((File)localObject8, (String)localObject2);
        gzipIfNotEmpty((byte[])localObject6, (File)localObject1);
      }
    }
  }
  
  private boolean firebaseCrashExists()
  {
    String str = "com.google.firebase.crash.FirebaseCrash";
    try
    {
      Class.forName(str);
      bool = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  private CreateReportSpiCall getCreateReportSpiCall(String paramString1, String paramString2)
  {
    Object localObject1 = CommonUtils.getStringsFileValue(this.crashlyticsCore.getContext(), "com.crashlytics.ApiEndpoint");
    DefaultCreateReportSpiCall localDefaultCreateReportSpiCall = new com/crashlytics/android/core/DefaultCreateReportSpiCall;
    Object localObject2 = this.crashlyticsCore;
    Object localObject3 = this.httpRequestFactory;
    localDefaultCreateReportSpiCall.<init>((Kit)localObject2, (String)localObject1, paramString1, (HttpRequestFactory)localObject3);
    localObject2 = new com/crashlytics/android/core/NativeCreateReportSpiCall;
    localObject3 = this.crashlyticsCore;
    HttpRequestFactory localHttpRequestFactory = this.httpRequestFactory;
    ((NativeCreateReportSpiCall)localObject2).<init>((Kit)localObject3, (String)localObject1, paramString2, localHttpRequestFactory);
    localObject1 = new com/crashlytics/android/core/CompositeCreateReportSpiCall;
    ((CompositeCreateReportSpiCall)localObject1).<init>(localDefaultCreateReportSpiCall, (NativeCreateReportSpiCall)localObject2);
    return (CreateReportSpiCall)localObject1;
  }
  
  private String getCurrentSessionId()
  {
    Object localObject = listSortedSessionBeginFiles();
    int i = localObject.length;
    if (i > 0) {
      i = 0;
    }
    for (localObject = getSessionIdFromSessionFile(localObject[0]);; localObject = null) {
      return (String)localObject;
    }
  }
  
  private String getPreviousSessionId()
  {
    int i = 1;
    Object localObject = listSortedSessionBeginFiles();
    int j = localObject.length;
    if (j > i) {}
    for (localObject = getSessionIdFromSessionFile(localObject[i]);; localObject = null) {
      return (String)localObject;
    }
  }
  
  static String getSessionIdFromSessionFile(File paramFile)
  {
    return paramFile.getName().substring(0, 35);
  }
  
  private File[] getTrimmedNonFatalFiles(String paramString, File[] paramArrayOfFile, int paramInt)
  {
    int i = paramArrayOfFile.length;
    if (i > paramInt)
    {
      Object localObject1 = Fabric.getLogger();
      Object localObject2 = Locale.US;
      String str = "Trimming down to %d logged exceptions.";
      int j = 1;
      Object[] arrayOfObject = new Object[j];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      localObject2 = String.format((Locale)localObject2, str, arrayOfObject);
      ((Logger)localObject1).d("CrashlyticsCore", (String)localObject2);
      trimSessionEventFiles(paramString, paramInt);
      localObject1 = new com/crashlytics/android/core/CrashlyticsController$FileNameContainsFilter;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(paramString);
      localObject2 = "SessionEvent";
      localObject3 = (String)localObject2;
      ((CrashlyticsController.FileNameContainsFilter)localObject1).<init>((String)localObject3);
      paramArrayOfFile = listFilesMatching((FilenameFilter)localObject1);
    }
    return paramArrayOfFile;
  }
  
  private UserMetaData getUserMetaData(String paramString)
  {
    boolean bool = isHandlingException();
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = new com/crashlytics/android/core/UserMetaData;
      localObject2 = this.crashlyticsCore.getUserIdentifier();
      String str1 = this.crashlyticsCore.getUserName();
      String str2 = this.crashlyticsCore.getUserEmail();
      ((UserMetaData)localObject1).<init>((String)localObject2, str1, str2);
    }
    for (;;)
    {
      return (UserMetaData)localObject1;
      localObject1 = new com/crashlytics/android/core/MetaDataStore;
      localObject2 = getFilesDir();
      ((MetaDataStore)localObject1).<init>((File)localObject2);
      localObject1 = ((MetaDataStore)localObject1).readUserData(paramString);
    }
  }
  
  /* Error */
  private void gzip(byte[] paramArrayOfByte, File paramFile)
  {
    // Byte code:
    //   0: new 690	java/util/zip/GZIPOutputStream
    //   3: astore_3
    //   4: new 692	java/io/FileOutputStream
    //   7: astore 4
    //   9: aload 4
    //   11: aload_2
    //   12: invokespecial 693	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   15: aload_3
    //   16: aload 4
    //   18: invokespecial 696	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: aload_3
    //   22: aload_1
    //   23: invokevirtual 699	java/util/zip/GZIPOutputStream:write	([B)V
    //   26: aload_3
    //   27: invokevirtual 702	java/util/zip/GZIPOutputStream:finish	()V
    //   30: aload_3
    //   31: invokestatic 706	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   34: return
    //   35: astore 4
    //   37: aconst_null
    //   38: astore_3
    //   39: aload_3
    //   40: invokestatic 706	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   43: aload 4
    //   45: athrow
    //   46: astore 4
    //   48: goto -9 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	CrashlyticsController
    //   0	51	1	paramArrayOfByte	byte[]
    //   0	51	2	paramFile	File
    //   3	37	3	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   7	10	4	localFileOutputStream	FileOutputStream
    //   35	9	4	localObject1	Object
    //   46	1	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	3	35	finally
    //   4	7	35	finally
    //   11	15	35	finally
    //   16	21	35	finally
    //   22	26	46	finally
    //   26	30	46	finally
  }
  
  private void gzipIfNotEmpty(byte[] paramArrayOfByte, File paramFile)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i > 0) {
        gzip(paramArrayOfByte, paramFile);
      }
    }
  }
  
  private File[] listFiles(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    return ensureFileArrayNotNull(arrayOfFile);
  }
  
  private File[] listFilesMatching(File paramFile, FilenameFilter paramFilenameFilter)
  {
    File[] arrayOfFile = paramFile.listFiles(paramFilenameFilter);
    return ensureFileArrayNotNull(arrayOfFile);
  }
  
  private File[] listFilesMatching(FileFilter paramFileFilter)
  {
    File[] arrayOfFile = getFilesDir().listFiles(paramFileFilter);
    return ensureFileArrayNotNull(arrayOfFile);
  }
  
  private File[] listFilesMatching(FilenameFilter paramFilenameFilter)
  {
    File localFile = getFilesDir();
    return listFilesMatching(localFile, paramFilenameFilter);
  }
  
  private File[] listSessionPartFilesFor(String paramString)
  {
    CrashlyticsController.SessionPartFileFilter localSessionPartFileFilter = new com/crashlytics/android/core/CrashlyticsController$SessionPartFileFilter;
    localSessionPartFileFilter.<init>(paramString);
    return listFilesMatching(localSessionPartFileFilter);
  }
  
  private File[] listSortedSessionBeginFiles()
  {
    File[] arrayOfFile = listSessionBeginFiles();
    Comparator localComparator = LARGEST_FILE_NAME_FIRST;
    Arrays.sort(arrayOfFile, localComparator);
    return arrayOfFile;
  }
  
  private byte[] readFile(String paramString1, String paramString2)
  {
    File localFile1 = new java/io/File;
    File localFile2 = getFilesDir();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString1 + paramString2;
    localFile1.<init>(localFile2, (String)localObject);
    return NativeFileUtils.readFile(localFile1);
  }
  
  private static void recordFatalExceptionAnswersEvent(String paramString1, String paramString2)
  {
    Object localObject1 = (Answers)Fabric.getKit(Answers.class);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      String str = "Answers is not available";
      ((Logger)localObject1).d((String)localObject2, str);
    }
    for (;;)
    {
      return;
      localObject2 = new io/fabric/sdk/android/services/common/Crash$FatalException;
      ((Crash.FatalException)localObject2).<init>(paramString1, paramString2);
      ((Answers)localObject1).onException((Crash.FatalException)localObject2);
    }
  }
  
  private void recordFatalFirebaseEvent(long paramLong)
  {
    int i = 1;
    boolean bool = firebaseCrashExists();
    Object localObject1;
    Object localObject2;
    String str1;
    if (bool)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      str1 = "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists";
      ((Logger)localObject1).d((String)localObject2, str1);
    }
    for (;;)
    {
      return;
      localObject1 = this.firebaseAnalyticsLogger;
      if (localObject1 != null)
      {
        Fabric.getLogger().d("CrashlyticsCore", "Logging Crashlytics event to Firebase");
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putInt("_r", i);
        ((Bundle)localObject1).putInt("fatal", i);
        ((Bundle)localObject1).putLong("timestamp", paramLong);
        localObject2 = this.firebaseAnalyticsLogger;
        str1 = "clx";
        String str2 = "_ae";
        ((EventLogger)localObject2).logEvent(str1, str2, (Bundle)localObject1);
      }
      else
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        str1 = "Skipping logging Crashlytics event to Firebase, no Firebase Analytics";
        ((Logger)localObject1).d((String)localObject2, str1);
      }
    }
  }
  
  private static void recordLoggedExceptionAnswersEvent(String paramString1, String paramString2)
  {
    Object localObject1 = (Answers)Fabric.getKit(Answers.class);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      String str = "Answers is not available";
      ((Logger)localObject1).d((String)localObject2, str);
    }
    for (;;)
    {
      return;
      localObject2 = new io/fabric/sdk/android/services/common/Crash$LoggedException;
      ((Crash.LoggedException)localObject2).<init>(paramString1, paramString2);
      ((Answers)localObject1).onException((Crash.LoggedException)localObject2);
    }
  }
  
  private void recursiveDelete(File paramFile)
  {
    int i = paramFile.isDirectory();
    if (i != 0)
    {
      File[] arrayOfFile = paramFile.listFiles();
      int k = arrayOfFile.length;
      i = 0;
      while (i < k)
      {
        File localFile = arrayOfFile[i];
        recursiveDelete(localFile);
        int j;
        i += 1;
      }
    }
    paramFile.delete();
  }
  
  private void recursiveDelete(Set paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      File localFile = (File)localIterator.next();
      recursiveDelete(localFile);
    }
  }
  
  private void retainSessions(File[] paramArrayOfFile, Set paramSet)
  {
    int i = paramArrayOfFile.length;
    int j = 0;
    if (j < i)
    {
      File localFile = paramArrayOfFile[j];
      String str1 = localFile.getName();
      Object localObject = SESSION_FILE_PATTERN.matcher(str1);
      int k = ((Matcher)localObject).matches();
      String str2;
      StringBuilder localStringBuilder;
      String str3;
      if (k == 0)
      {
        localObject = Fabric.getLogger();
        str2 = "CrashlyticsCore";
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        str3 = "Deleting unknown file: ";
        localStringBuilder = localStringBuilder.append(str3);
        str1 = str1;
        ((Logger)localObject).d(str2, str1);
        localFile.delete();
      }
      for (;;)
      {
        j += 1;
        break;
        k = 1;
        localObject = ((Matcher)localObject).group(k);
        boolean bool = paramSet.contains(localObject);
        if (!bool)
        {
          localObject = Fabric.getLogger();
          str2 = "CrashlyticsCore";
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          str3 = "Trimming session file: ";
          localStringBuilder = localStringBuilder.append(str3);
          str1 = str1;
          ((Logger)localObject).d(str2, str1);
          localFile.delete();
        }
      }
    }
  }
  
  private void sendSessionReports(SettingsData paramSettingsData)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramSettingsData == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      localObject3 = "Cannot send reports. Settings are unavailable.";
      ((Logger)localObject1).w((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject2 = this.crashlyticsCore.getContext();
      localObject1 = paramSettingsData.appData.reportsUrl;
      localObject3 = paramSettingsData.appData.ndkReportsUrl;
      localObject1 = getCreateReportSpiCall((String)localObject1, (String)localObject3);
      localObject3 = new com/crashlytics/android/core/ReportUploader;
      Object localObject4 = this.appData.apiKey;
      ReportUploader.ReportFilesProvider localReportFilesProvider = this.reportFilesProvider;
      Object localObject5 = this.handlingExceptionCheck;
      ((ReportUploader)localObject3).<init>((String)localObject4, (CreateReportSpiCall)localObject1, localReportFilesProvider, (ReportUploader.HandlingExceptionCheck)localObject5);
      localObject4 = listCompleteSessionFiles();
      int i = localObject4.length;
      int j = 0;
      localObject1 = null;
      while (j < i)
      {
        localObject5 = localObject4[j];
        SessionReport localSessionReport = new com/crashlytics/android/core/SessionReport;
        Object localObject6 = SEND_AT_CRASHTIME_HEADER;
        localSessionReport.<init>((File)localObject5, (Map)localObject6);
        localObject5 = this.backgroundWorker;
        localObject6 = new com/crashlytics/android/core/CrashlyticsController$SendReportRunnable;
        ((CrashlyticsController.SendReportRunnable)localObject6).<init>((Context)localObject2, localSessionReport, (ReportUploader)localObject3);
        ((CrashlyticsBackgroundWorker)localObject5).submit((Runnable)localObject6);
        j += 1;
      }
    }
  }
  
  private boolean shouldPromptUserBeforeSendingCrashReports(SettingsData paramSettingsData)
  {
    boolean bool1 = false;
    if (paramSettingsData == null) {}
    for (;;)
    {
      return bool1;
      Object localObject = paramSettingsData.featuresData;
      boolean bool2 = ((FeaturesSettingsData)localObject).promptEnabled;
      if (bool2)
      {
        localObject = this.preferenceManager;
        bool2 = ((PreferenceManager)localObject).shouldAlwaysSendReports();
        if (!bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  /* Error */
  private void synthesizeSessionFile(File paramFile1, String paramString, File[] paramArrayOfFile, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: iconst_1
    //   4: istore 6
    //   6: aload 4
    //   8: ifnull +254 -> 262
    //   11: iload 6
    //   13: istore 7
    //   15: iload 7
    //   17: ifeq +260 -> 277
    //   20: aload_0
    //   21: invokevirtual 888	com/crashlytics/android/core/CrashlyticsController:getFatalSessionFilesDir	()Ljava/io/File;
    //   24: astore 8
    //   26: aload 8
    //   28: invokevirtual 891	java/io/File:exists	()Z
    //   31: istore 9
    //   33: iload 9
    //   35: ifne +9 -> 44
    //   38: aload 8
    //   40: invokevirtual 894	java/io/File:mkdirs	()Z
    //   43: pop
    //   44: new 368	com/crashlytics/android/core/ClsFileOutputStream
    //   47: astore 10
    //   49: aload 10
    //   51: aload 8
    //   53: aload_2
    //   54: invokespecial 492	com/crashlytics/android/core/ClsFileOutputStream:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   57: aload 10
    //   59: invokestatic 496	com/crashlytics/android/core/CodedOutputStream:newInstance	(Ljava/io/OutputStream;)Lcom/crashlytics/android/core/CodedOutputStream;
    //   62: astore 5
    //   64: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   67: astore 8
    //   69: ldc_w 338
    //   72: astore 11
    //   74: new 352	java/lang/StringBuilder
    //   77: astore 12
    //   79: aload 12
    //   81: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   84: ldc_w 896
    //   87: astore 13
    //   89: aload 12
    //   91: aload 13
    //   93: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: astore 12
    //   98: aload 12
    //   100: aload_2
    //   101: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: astore 12
    //   106: aload 12
    //   108: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore 12
    //   113: aload 8
    //   115: aload 11
    //   117: aload 12
    //   119: invokeinterface 346 3 0
    //   124: aload 5
    //   126: aload_1
    //   127: invokestatic 900	com/crashlytics/android/core/CrashlyticsController:writeToCosFromFile	(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/io/File;)V
    //   130: iconst_4
    //   131: istore 6
    //   133: new 426	java/util/Date
    //   136: astore 11
    //   138: aload 11
    //   140: invokespecial 427	java/util/Date:<init>	()V
    //   143: aload 11
    //   145: invokevirtual 904	java/util/Date:getTime	()J
    //   148: lstore 14
    //   150: ldc2_w 905
    //   153: lstore 16
    //   155: lload 14
    //   157: lload 16
    //   159: ldiv
    //   160: lstore 14
    //   162: aload 5
    //   164: iload 6
    //   166: lload 14
    //   168: invokevirtual 912	com/crashlytics/android/core/CodedOutputStream:writeUInt64	(IJ)V
    //   171: iconst_5
    //   172: istore 6
    //   174: aload 5
    //   176: iload 6
    //   178: iload 7
    //   180: invokevirtual 917	com/crashlytics/android/core/CodedOutputStream:writeBool	(IZ)V
    //   183: bipush 11
    //   185: istore 6
    //   187: iconst_1
    //   188: istore 18
    //   190: aload 5
    //   192: iload 6
    //   194: iload 18
    //   196: invokevirtual 922	com/crashlytics/android/core/CodedOutputStream:writeUInt32	(II)V
    //   199: bipush 12
    //   201: istore 6
    //   203: iconst_3
    //   204: istore 18
    //   206: aload 5
    //   208: iload 6
    //   210: iload 18
    //   212: invokevirtual 926	com/crashlytics/android/core/CodedOutputStream:writeEnum	(II)V
    //   215: aload_0
    //   216: aload 5
    //   218: aload_2
    //   219: invokespecial 930	com/crashlytics/android/core/CrashlyticsController:writeInitialPartsTo	(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;)V
    //   222: aload 5
    //   224: aload_3
    //   225: aload_2
    //   226: invokestatic 934	com/crashlytics/android/core/CrashlyticsController:writeNonFatalEventsTo	(Lcom/crashlytics/android/core/CodedOutputStream;[Ljava/io/File;Ljava/lang/String;)V
    //   229: iload 7
    //   231: ifeq +10 -> 241
    //   234: aload 5
    //   236: aload 4
    //   238: invokestatic 900	com/crashlytics/android/core/CrashlyticsController:writeToCosFromFile	(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/io/File;)V
    //   241: aload 5
    //   243: ldc_w 936
    //   246: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   249: ldc_w 938
    //   252: astore 8
    //   254: aload 10
    //   256: aload 8
    //   258: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   261: return
    //   262: iconst_0
    //   263: istore 6
    //   265: aconst_null
    //   266: astore 8
    //   268: iconst_0
    //   269: istore 7
    //   271: aconst_null
    //   272: astore 19
    //   274: goto -259 -> 15
    //   277: aload_0
    //   278: invokevirtual 941	com/crashlytics/android/core/CrashlyticsController:getNonFatalSessionFilesDir	()Ljava/io/File;
    //   281: astore 8
    //   283: goto -257 -> 26
    //   286: astore 8
    //   288: iconst_0
    //   289: istore 9
    //   291: aconst_null
    //   292: astore 10
    //   294: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   297: astore 19
    //   299: ldc_w 338
    //   302: astore 11
    //   304: new 352	java/lang/StringBuilder
    //   307: astore 12
    //   309: aload 12
    //   311: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   314: ldc_w 943
    //   317: astore 13
    //   319: aload 12
    //   321: aload 13
    //   323: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: astore 12
    //   328: aload 12
    //   330: aload_2
    //   331: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: astore 12
    //   336: aload 12
    //   338: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   341: astore 12
    //   343: aload 19
    //   345: aload 11
    //   347: aload 12
    //   349: aload 8
    //   351: invokeinterface 377 4 0
    //   356: ldc_w 936
    //   359: astore 8
    //   361: aload 5
    //   363: aload 8
    //   365: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   368: aload_0
    //   369: aload 10
    //   371: invokespecial 947	com/crashlytics/android/core/CrashlyticsController:closeWithoutRenamingOrLog	(Lcom/crashlytics/android/core/ClsFileOutputStream;)V
    //   374: goto -113 -> 261
    //   377: astore 8
    //   379: iconst_0
    //   380: istore 9
    //   382: aconst_null
    //   383: astore 10
    //   385: aload 5
    //   387: ldc_w 936
    //   390: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   393: aload 10
    //   395: ldc_w 938
    //   398: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   401: aload 8
    //   403: athrow
    //   404: astore 8
    //   406: goto -21 -> 385
    //   409: astore 8
    //   411: goto -117 -> 294
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	414	0	this	CrashlyticsController
    //   0	414	1	paramFile1	File
    //   0	414	2	paramString	String
    //   0	414	3	paramArrayOfFile	File[]
    //   0	414	4	paramFile2	File
    //   1	385	5	localCodedOutputStream	CodedOutputStream
    //   4	260	6	i	int
    //   13	217	7	j	int
    //   269	1	7	k	int
    //   24	258	8	localObject1	Object
    //   286	64	8	localException1	Exception
    //   359	5	8	str1	String
    //   377	25	8	localObject2	Object
    //   404	1	8	localObject3	Object
    //   409	1	8	localException2	Exception
    //   31	350	9	bool	boolean
    //   47	347	10	localClsFileOutputStream	ClsFileOutputStream
    //   72	274	11	localObject4	Object
    //   77	271	12	localObject5	Object
    //   87	235	13	str2	String
    //   148	19	14	l1	long
    //   153	5	16	l2	long
    //   188	23	18	m	int
    //   272	72	19	localLogger	Logger
    // Exception table:
    //   from	to	target	type
    //   44	47	286	java/lang/Exception
    //   53	57	286	java/lang/Exception
    //   44	47	377	finally
    //   53	57	377	finally
    //   57	62	404	finally
    //   64	67	404	finally
    //   74	77	404	finally
    //   79	84	404	finally
    //   91	96	404	finally
    //   100	104	404	finally
    //   106	111	404	finally
    //   117	124	404	finally
    //   126	130	404	finally
    //   133	136	404	finally
    //   138	143	404	finally
    //   143	148	404	finally
    //   157	160	404	finally
    //   166	171	404	finally
    //   178	183	404	finally
    //   194	199	404	finally
    //   210	215	404	finally
    //   218	222	404	finally
    //   225	229	404	finally
    //   236	241	404	finally
    //   294	297	404	finally
    //   304	307	404	finally
    //   309	314	404	finally
    //   321	326	404	finally
    //   330	334	404	finally
    //   336	341	404	finally
    //   349	356	404	finally
    //   57	62	409	java/lang/Exception
    //   64	67	409	java/lang/Exception
    //   74	77	409	java/lang/Exception
    //   79	84	409	java/lang/Exception
    //   91	96	409	java/lang/Exception
    //   100	104	409	java/lang/Exception
    //   106	111	409	java/lang/Exception
    //   117	124	409	java/lang/Exception
    //   126	130	409	java/lang/Exception
    //   133	136	409	java/lang/Exception
    //   138	143	409	java/lang/Exception
    //   143	148	409	java/lang/Exception
    //   157	160	409	java/lang/Exception
    //   166	171	409	java/lang/Exception
    //   178	183	409	java/lang/Exception
    //   194	199	409	java/lang/Exception
    //   210	215	409	java/lang/Exception
    //   218	222	409	java/lang/Exception
    //   225	229	409	java/lang/Exception
    //   236	241	409	java/lang/Exception
  }
  
  private void trimInvalidSessionFiles()
  {
    File localFile = getInvalidFilesDir();
    int i = localFile.exists();
    if (i == 0) {}
    for (;;)
    {
      return;
      Object localObject = new com/crashlytics/android/core/CrashlyticsController$InvalidPartFileFilter;
      ((CrashlyticsController.InvalidPartFileFilter)localObject).<init>();
      File[] arrayOfFile = listFilesMatching(localFile, (FilenameFilter)localObject);
      localObject = Collections.reverseOrder();
      Arrays.sort(arrayOfFile, (Comparator)localObject);
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      i = 0;
      localObject = null;
      for (;;)
      {
        int k = arrayOfFile.length;
        if (i >= k) {
          break;
        }
        int m = localHashSet.size();
        int n = 4;
        if (m >= n) {
          break;
        }
        String str = getSessionIdFromSessionFile(arrayOfFile[i]);
        localHashSet.add(str);
        int j;
        i += 1;
      }
      localObject = listFiles(localFile);
      retainSessions((File[])localObject, localHashSet);
    }
  }
  
  private void trimOpenSessions(int paramInt)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    File[] arrayOfFile = listSortedSessionBeginFiles();
    int i = arrayOfFile.length;
    int j = Math.min(paramInt, i);
    i = 0;
    Object localObject = null;
    while (i < j)
    {
      String str = getSessionIdFromSessionFile(arrayOfFile[i]);
      localHashSet.add(str);
      i += 1;
    }
    this.logFileManager.discardOldLogFiles(localHashSet);
    localObject = new com/crashlytics/android/core/CrashlyticsController$AnySessionPartFileFilter;
    ((CrashlyticsController.AnySessionPartFileFilter)localObject).<init>(null);
    localObject = listFilesMatching((FilenameFilter)localObject);
    retainSessions((File[])localObject, localHashSet);
  }
  
  private void trimSessionEventFiles(String paramString, int paramInt)
  {
    File localFile = getFilesDir();
    CrashlyticsController.FileNameContainsFilter localFileNameContainsFilter = new com/crashlytics/android/core/CrashlyticsController$FileNameContainsFilter;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "SessionEvent";
    localFileNameContainsFilter.<init>((String)localObject);
    localObject = SMALLEST_FILE_NAME_FIRST;
    Utils.capFileCount(localFile, localFileNameContainsFilter, paramInt, (Comparator)localObject);
  }
  
  private void writeBeginSession(String paramString, Date paramDate)
  {
    Object localObject1 = Locale.US;
    Object localObject2 = new Object[1];
    String str1 = this.crashlyticsCore.getVersion();
    localObject2[0] = str1;
    String str2 = String.format((Locale)localObject1, "Crashlytics Android SDK/%s", (Object[])localObject2);
    long l = paramDate.getTime() / 1000L;
    localObject1 = new com/crashlytics/android/core/CrashlyticsController$17;
    localObject2 = paramString;
    ((CrashlyticsController.17)localObject1).<init>(this, paramString, str2, l);
    writeSessionPartFile(paramString, "BeginSession", (CrashlyticsController.CodedOutputStreamWriteAction)localObject1);
    localObject1 = new com/crashlytics/android/core/CrashlyticsController$18;
    ((CrashlyticsController.18)localObject1).<init>(this, paramString, str2, l);
    writeFile(paramString, "BeginSession.json", (CrashlyticsController.FileOutputStreamWriteAction)localObject1);
  }
  
  /* Error */
  private void writeFatal(Date paramDate, Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokespecial 293	com/crashlytics/android/core/CrashlyticsController:getCurrentSessionId	()Ljava/lang/String;
    //   7: astore 5
    //   9: aload 5
    //   11: ifnonnull +52 -> 63
    //   14: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   17: astore 5
    //   19: ldc_w 338
    //   22: astore 6
    //   24: ldc_w 1014
    //   27: astore 7
    //   29: aconst_null
    //   30: astore 8
    //   32: aload 5
    //   34: aload 6
    //   36: aload 7
    //   38: aconst_null
    //   39: invokeinterface 377 4 0
    //   44: aconst_null
    //   45: ldc_w 1016
    //   48: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   51: ldc_w 1018
    //   54: astore 5
    //   56: aconst_null
    //   57: aload 5
    //   59: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   62: return
    //   63: aload_3
    //   64: invokevirtual 457	java/lang/Object:getClass	()Ljava/lang/Class;
    //   67: astore 6
    //   69: aload 6
    //   71: invokevirtual 462	java/lang/Class:getName	()Ljava/lang/String;
    //   74: astore 6
    //   76: aload 5
    //   78: aload 6
    //   80: invokestatic 546	com/crashlytics/android/core/CrashlyticsController:recordFatalExceptionAnswersEvent	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: new 368	com/crashlytics/android/core/ClsFileOutputStream
    //   86: astore 9
    //   88: aload_0
    //   89: invokevirtual 489	com/crashlytics/android/core/CrashlyticsController:getFilesDir	()Ljava/io/File;
    //   92: astore 6
    //   94: new 352	java/lang/StringBuilder
    //   97: astore 7
    //   99: aload 7
    //   101: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   104: aload 7
    //   106: aload 5
    //   108: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: astore 5
    //   113: ldc 84
    //   115: astore 7
    //   117: aload 5
    //   119: aload 7
    //   121: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: astore 5
    //   126: aload 5
    //   128: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 5
    //   133: aload 9
    //   135: aload 6
    //   137: aload 5
    //   139: invokespecial 492	com/crashlytics/android/core/ClsFileOutputStream:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   142: aload 9
    //   144: invokestatic 496	com/crashlytics/android/core/CodedOutputStream:newInstance	(Ljava/io/OutputStream;)Lcom/crashlytics/android/core/CodedOutputStream;
    //   147: astore 4
    //   149: ldc 18
    //   151: astore 10
    //   153: iconst_1
    //   154: istore 11
    //   156: aload_0
    //   157: astore 5
    //   159: aload_1
    //   160: astore 6
    //   162: aload_2
    //   163: astore 7
    //   165: aload_3
    //   166: astore 8
    //   168: aload_0
    //   169: aload 4
    //   171: aload_1
    //   172: aload_2
    //   173: aload_3
    //   174: aload 10
    //   176: iload 11
    //   178: invokespecial 500	com/crashlytics/android/core/CrashlyticsController:writeSessionEvent	(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    //   181: aload 4
    //   183: ldc_w 1016
    //   186: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   189: ldc_w 1018
    //   192: astore 5
    //   194: aload 9
    //   196: aload 5
    //   198: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   201: goto -139 -> 62
    //   204: astore 5
    //   206: aconst_null
    //   207: astore 6
    //   209: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   212: astore 7
    //   214: ldc_w 338
    //   217: astore 8
    //   219: ldc_w 1020
    //   222: astore 10
    //   224: aload 7
    //   226: aload 8
    //   228: aload 10
    //   230: aload 5
    //   232: invokeinterface 377 4 0
    //   237: aload 4
    //   239: ldc_w 1016
    //   242: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   245: ldc_w 1018
    //   248: astore 5
    //   250: aload 6
    //   252: aload 5
    //   254: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   257: goto -195 -> 62
    //   260: astore 5
    //   262: aconst_null
    //   263: astore 6
    //   265: aload 4
    //   267: ldc_w 1016
    //   270: invokestatic 506	io/fabric/sdk/android/services/common/CommonUtils:flushOrLog	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   273: aload 6
    //   275: ldc_w 1018
    //   278: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   281: aload 5
    //   283: athrow
    //   284: astore 5
    //   286: aload 9
    //   288: astore 6
    //   290: goto -25 -> 265
    //   293: astore 5
    //   295: goto -30 -> 265
    //   298: astore 5
    //   300: aload 9
    //   302: astore 6
    //   304: goto -95 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	CrashlyticsController
    //   0	307	1	paramDate	Date
    //   0	307	2	paramThread	Thread
    //   0	307	3	paramThrowable	Throwable
    //   1	265	4	localCodedOutputStream	CodedOutputStream
    //   7	190	5	localObject1	Object
    //   204	27	5	localException1	Exception
    //   248	5	5	str1	String
    //   260	22	5	localObject2	Object
    //   284	1	5	localObject3	Object
    //   293	1	5	localObject4	Object
    //   298	1	5	localException2	Exception
    //   22	281	6	localObject5	Object
    //   27	198	7	localObject6	Object
    //   30	197	8	localObject7	Object
    //   86	215	9	localClsFileOutputStream	ClsFileOutputStream
    //   151	78	10	str2	String
    //   154	23	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	204	java/lang/Exception
    //   14	17	204	java/lang/Exception
    //   38	44	204	java/lang/Exception
    //   63	67	204	java/lang/Exception
    //   69	74	204	java/lang/Exception
    //   78	83	204	java/lang/Exception
    //   83	86	204	java/lang/Exception
    //   88	92	204	java/lang/Exception
    //   94	97	204	java/lang/Exception
    //   99	104	204	java/lang/Exception
    //   106	111	204	java/lang/Exception
    //   119	124	204	java/lang/Exception
    //   126	131	204	java/lang/Exception
    //   137	142	204	java/lang/Exception
    //   3	7	260	finally
    //   14	17	260	finally
    //   38	44	260	finally
    //   63	67	260	finally
    //   69	74	260	finally
    //   78	83	260	finally
    //   83	86	260	finally
    //   88	92	260	finally
    //   94	97	260	finally
    //   99	104	260	finally
    //   106	111	260	finally
    //   119	124	260	finally
    //   126	131	260	finally
    //   137	142	260	finally
    //   142	147	284	finally
    //   176	181	284	finally
    //   209	212	293	finally
    //   230	237	293	finally
    //   142	147	298	java/lang/Exception
    //   176	181	298	java/lang/Exception
  }
  
  private void writeFile(String paramString1, String paramString2, CrashlyticsController.FileOutputStreamWriteAction paramFileOutputStreamWriteAction)
  {
    Object localObject1 = null;
    FileOutputStream localFileOutputStream;
    try
    {
      localFileOutputStream = new java/io/FileOutputStream;
      Object localObject2 = new java/io/File;
      File localFile = getFilesDir();
      Object localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append(paramString1);
      localObject5 = ((StringBuilder)localObject5).append(paramString2);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((File)localObject2).<init>(localFile, (String)localObject5);
      localFileOutputStream.<init>((File)localObject2);
      localObject1 = new java/lang/StringBuilder;
    }
    finally
    {
      try
      {
        paramFileOutputStreamWriteAction.writeTo(localFileOutputStream);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Failed to close " + paramString2 + " file.";
        CommonUtils.closeOrLog(localFileOutputStream, (String)localObject2);
        return;
      }
      finally {}
      localObject3 = finally;
      localFileOutputStream = null;
    }
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Failed to close " + paramString2 + " file.";
    CommonUtils.closeOrLog(localFileOutputStream, (String)localObject1);
    throw ((Throwable)localObject3);
  }
  
  private void writeInitialPartsTo(CodedOutputStream paramCodedOutputStream, String paramString)
  {
    String[] arrayOfString = INITIAL_SESSION_PART_TAGS;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      Object localObject1 = arrayOfString[j];
      Object localObject2 = new com/crashlytics/android/core/CrashlyticsController$FileNameContainsFilter;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(paramString).append((String)localObject1);
      Object localObject4 = ".cls";
      localObject3 = (String)localObject4;
      ((CrashlyticsController.FileNameContainsFilter)localObject2).<init>((String)localObject3);
      localObject2 = listFilesMatching((FilenameFilter)localObject2);
      int k = localObject2.length;
      Object localObject5;
      if (k == 0)
      {
        localObject2 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "Can't find ";
        localObject1 = (String)localObject5 + (String)localObject1 + " data for session ID " + paramString;
        localObject4 = null;
        ((Logger)localObject2).e((String)localObject3, (String)localObject1, null);
      }
      for (;;)
      {
        j += 1;
        break;
        localObject3 = Fabric.getLogger();
        localObject4 = "CrashlyticsCore";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        String str = "Collecting ";
        localObject1 = ((StringBuilder)localObject5).append(str).append((String)localObject1);
        localObject5 = " data for session ID ";
        localObject1 = (String)localObject5 + paramString;
        ((Logger)localObject3).d((String)localObject4, (String)localObject1);
        localObject1 = localObject2[0];
        writeToCosFromFile(paramCodedOutputStream, (File)localObject1);
      }
    }
  }
  
  private static void writeNonFatalEventsTo(CodedOutputStream paramCodedOutputStream, File[] paramArrayOfFile, String paramString)
  {
    int i = 0;
    File localFile = null;
    Comparator localComparator = CommonUtils.FILE_MODIFIED_COMPARATOR;
    Arrays.sort(paramArrayOfFile, localComparator);
    int j = paramArrayOfFile.length;
    int k = 0;
    localComparator = null;
    for (;;)
    {
      if (k >= j) {
        return;
      }
      localFile = paramArrayOfFile[k];
      try
      {
        localLogger = Fabric.getLogger();
        str1 = "CrashlyticsCore";
        localObject = Locale.US;
        String str2 = "Found Non Fatal for session ID %s in %s ";
        int m = 2;
        Object[] arrayOfObject = new Object[m];
        int n = 0;
        arrayOfObject[0] = paramString;
        n = 1;
        String str3 = localFile.getName();
        arrayOfObject[n] = str3;
        localObject = String.format((Locale)localObject, str2, arrayOfObject);
        localLogger.d(str1, (String)localObject);
        writeToCosFromFile(paramCodedOutputStream, localFile);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Logger localLogger = Fabric.getLogger();
          String str1 = "CrashlyticsCore";
          Object localObject = "Error writting non-fatal to session.";
          localLogger.e(str1, (String)localObject, localException);
        }
      }
      i = k + 1;
      k = i;
    }
  }
  
  private void writeSessionApp(String paramString)
  {
    String str1 = this.idManager.getAppIdentifier();
    String str2 = this.appData.versionCode;
    String str3 = this.appData.versionName;
    String str4 = this.idManager.getAppInstallIdentifier();
    int i = DeliveryMechanism.determineFrom(this.appData.installerPackageName).getId();
    Object localObject = new com/crashlytics/android/core/CrashlyticsController$19;
    ((CrashlyticsController.19)localObject).<init>(this, str1, str2, str3, str4, i);
    writeSessionPartFile(paramString, "SessionApp", (CrashlyticsController.CodedOutputStreamWriteAction)localObject);
    localObject = new com/crashlytics/android/core/CrashlyticsController$20;
    ((CrashlyticsController.20)localObject).<init>(this, str1, str2, str3, str4, i);
    writeFile(paramString, "SessionApp.json", (CrashlyticsController.FileOutputStreamWriteAction)localObject);
  }
  
  private void writeSessionDevice(String paramString)
  {
    Object localObject1 = this.crashlyticsCore.getContext();
    Object localObject2 = new android/os/StatFs;
    String str = Environment.getDataDirectory().getPath();
    ((StatFs)localObject2).<init>(str);
    int i = CommonUtils.getCpuArchitectureInt();
    int j = Runtime.getRuntime().availableProcessors();
    long l1 = CommonUtils.getTotalRamInBytes();
    long l2 = ((StatFs)localObject2).getBlockCount();
    long l3 = ((StatFs)localObject2).getBlockSize();
    l2 *= l3;
    boolean bool = CommonUtils.isEmulator((Context)localObject1);
    Map localMap = this.idManager.getDeviceIdentifiers();
    int k = CommonUtils.getDeviceState((Context)localObject1);
    localObject1 = new com/crashlytics/android/core/CrashlyticsController$23;
    localObject2 = this;
    ((CrashlyticsController.23)localObject1).<init>(this, i, j, l1, l2, bool, localMap, k);
    writeSessionPartFile(paramString, "SessionDevice", (CrashlyticsController.CodedOutputStreamWriteAction)localObject1);
    localObject1 = new com/crashlytics/android/core/CrashlyticsController$24;
    ((CrashlyticsController.24)localObject1).<init>(this, i, j, l1, l2, bool, localMap, k);
    writeFile(paramString, "SessionDevice.json", (CrashlyticsController.FileOutputStreamWriteAction)localObject1);
  }
  
  private void writeSessionEvent(CodedOutputStream paramCodedOutputStream, Date paramDate, Thread paramThread, Throwable paramThrowable, String paramString, boolean paramBoolean)
  {
    TrimmedThrowableData localTrimmedThrowableData = new com/crashlytics/android/core/TrimmedThrowableData;
    Object localObject1 = this.stackTraceTrimmingStrategy;
    localTrimmedThrowableData.<init>(paramThrowable, (StackTraceTrimmingStrategy)localObject1);
    Object localObject2 = this.crashlyticsCore.getContext();
    long l1 = paramDate.getTime();
    long l2 = 1000L;
    long l3 = l1 / l2;
    Float localFloat = CommonUtils.getBatteryLevel((Context)localObject2);
    boolean bool1 = this.devicePowerStateListener.isPowerConnected();
    int j = CommonUtils.getBatteryVelocity((Context)localObject2, bool1);
    boolean bool3 = CommonUtils.getProximitySensorEnabled((Context)localObject2);
    int k = ((Context)localObject2).getResources().getConfiguration().orientation;
    long l4 = CommonUtils.getTotalRamInBytes();
    long l5 = CommonUtils.calculateFreeRamInBytes((Context)localObject2);
    long l6 = l4 - l5;
    long l7 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = CommonUtils.getAppProcessInfo(((Context)localObject2).getPackageName(), (Context)localObject2);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    StackTraceElement[] arrayOfStackTraceElement = localTrimmedThrowableData.stacktrace;
    String str1 = this.appData.buildId;
    localObject1 = this.idManager;
    String str2 = ((IdManager)localObject1).getAppIdentifier();
    Object localObject3;
    Object localObject4;
    int m;
    if (paramBoolean)
    {
      localObject3 = Thread.getAllStackTraces();
      arrayOfThread = new Thread[((Map)localObject3).size()];
      bool1 = false;
      localObject1 = null;
      localObject3 = ((Map)localObject3).entrySet();
      localObject4 = ((Set)localObject3).iterator();
      for (m = 0;; m = i)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject4).next();
        localObject3 = (Thread)((Map.Entry)localObject1).getKey();
        arrayOfThread[m] = localObject3;
        localObject3 = this.stackTraceTrimmingStrategy;
        localObject1 = (StackTraceElement[])((Map.Entry)localObject1).getValue();
        localObject1 = ((StackTraceTrimmingStrategy)localObject3).getTrimmedStackTrace((StackTraceElement[])localObject1);
        localLinkedList.add(localObject1);
        i = m + 1;
      }
    }
    int i = 0;
    localObject1 = null;
    Thread[] arrayOfThread = new Thread[0];
    localObject1 = "com.crashlytics.CollectCustomKeys";
    boolean bool4 = true;
    boolean bool2 = CommonUtils.getBooleanResourceValue((Context)localObject2, (String)localObject1, bool4);
    if (!bool2)
    {
      localObject2 = new java/util/TreeMap;
      ((TreeMap)localObject2).<init>();
    }
    for (;;)
    {
      localObject4 = this.logFileManager;
      localObject1 = paramCodedOutputStream;
      localObject3 = paramString;
      SessionProtobufHelper.writeSessionEvent(paramCodedOutputStream, l3, paramString, localTrimmedThrowableData, paramThread, arrayOfStackTraceElement, arrayOfThread, localLinkedList, (Map)localObject2, (LogFileManager)localObject4, localRunningAppProcessInfo, k, str2, str1, localFloat, j, bool3, l6, l7);
      return;
      localObject1 = this.crashlyticsCore.getAttributes();
      if (localObject1 != null)
      {
        int n = ((Map)localObject1).size();
        m = 1;
        if (n > m)
        {
          localObject2 = new java/util/TreeMap;
          ((TreeMap)localObject2).<init>((Map)localObject1);
          continue;
        }
      }
      localObject2 = localObject1;
    }
  }
  
  private void writeSessionOS(String paramString)
  {
    boolean bool = CommonUtils.isRooted(this.crashlyticsCore.getContext());
    Object localObject = new com/crashlytics/android/core/CrashlyticsController$21;
    ((CrashlyticsController.21)localObject).<init>(this, bool);
    writeSessionPartFile(paramString, "SessionOS", (CrashlyticsController.CodedOutputStreamWriteAction)localObject);
    localObject = new com/crashlytics/android/core/CrashlyticsController$22;
    ((CrashlyticsController.22)localObject).<init>(this, bool);
    writeFile(paramString, "SessionOS.json", (CrashlyticsController.FileOutputStreamWriteAction)localObject);
  }
  
  private void writeSessionPartFile(String paramString1, String paramString2, CrashlyticsController.CodedOutputStreamWriteAction paramCodedOutputStreamWriteAction)
  {
    Object localObject1 = null;
    try
    {
      localClsFileOutputStream = new com/crashlytics/android/core/ClsFileOutputStream;
      Object localObject2 = getFilesDir();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append(paramString1);
      localObject5 = ((StringBuilder)localObject5).append(paramString2);
      localObject5 = ((StringBuilder)localObject5).toString();
      localClsFileOutputStream.<init>((File)localObject2, (String)localObject5);
      localObject5 = new java/lang/StringBuilder;
    }
    finally
    {
      try
      {
        localObject1 = CodedOutputStream.newInstance(localClsFileOutputStream);
        paramCodedOutputStreamWriteAction.writeTo((CodedOutputStream)localObject1);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Failed to flush to session " + paramString2 + " file.";
        CommonUtils.flushOrLog((Flushable)localObject1, (String)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Failed to close session " + paramString2 + " file.";
        CommonUtils.closeOrLog(localClsFileOutputStream, (String)localObject2);
        return;
      }
      finally
      {
        ClsFileOutputStream localClsFileOutputStream;
        Object localObject5;
        for (;;) {}
      }
      localObject3 = finally;
      localClsFileOutputStream = null;
    }
    ((StringBuilder)localObject5).<init>();
    localObject5 = "Failed to flush to session " + paramString2 + " file.";
    CommonUtils.flushOrLog((Flushable)localObject1, (String)localObject5);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Failed to close session " + paramString2 + " file.";
    CommonUtils.closeOrLog(localClsFileOutputStream, (String)localObject1);
    throw ((Throwable)localObject3);
  }
  
  private void writeSessionPartsToSessionFile(File paramFile, String paramString, int paramInt)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = null;
    Object localObject2 = Fabric.getLogger();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = "Collecting session parts for ID ";
    localObject3 = (String)localObject4 + paramString;
    ((Logger)localObject2).d("CrashlyticsCore", (String)localObject3);
    localObject2 = new com/crashlytics/android/core/CrashlyticsController$FileNameContainsFilter;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = paramString + "SessionCrash";
    ((CrashlyticsController.FileNameContainsFilter)localObject2).<init>((String)localObject5);
    localObject3 = listFilesMatching((FilenameFilter)localObject2);
    label259:
    Object localObject9;
    if (localObject3 != null)
    {
      int k = localObject3.length;
      if (k > 0)
      {
        k = j;
        localObject5 = Fabric.getLogger();
        Object localObject6 = Locale.US;
        String str = "Session %s has fatal exception: %s";
        Object localObject7 = new Object[i];
        localObject7[0] = paramString;
        Object localObject8 = Boolean.valueOf(k);
        localObject7[j] = localObject8;
        localObject6 = String.format((Locale)localObject6, str, (Object[])localObject7);
        ((Logger)localObject5).d("CrashlyticsCore", (String)localObject6);
        localObject5 = new com/crashlytics/android/core/CrashlyticsController$FileNameContainsFilter;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append(paramString);
        localObject6 = "SessionEvent";
        localObject4 = (String)localObject6;
        ((CrashlyticsController.FileNameContainsFilter)localObject5).<init>((String)localObject4);
        localObject4 = listFilesMatching((FilenameFilter)localObject5);
        if (localObject4 == null) {
          break label427;
        }
        int n = localObject4.length;
        if (n <= 0) {
          break label427;
        }
        n = j;
        localObject6 = Fabric.getLogger();
        str = "CrashlyticsCore";
        localObject7 = Locale.US;
        localObject8 = "Session %s has non-fatal exceptions: %s";
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        Boolean localBoolean = Boolean.valueOf(n);
        arrayOfObject[j] = localBoolean;
        localObject9 = String.format((Locale)localObject7, (String)localObject8, arrayOfObject);
        ((Logger)localObject6).d(str, (String)localObject9);
        if ((k == 0) && (n == 0)) {
          break label445;
        }
        localObject9 = getTrimmedNonFatalFiles(paramString, (File[])localObject4, paramInt);
        if (k == 0) {
          break label436;
        }
        localObject2 = localObject3[0];
        label358:
        synthesizeSessionFile(paramFile, paramString, (File[])localObject9, (File)localObject2);
      }
    }
    for (;;)
    {
      localObject2 = Fabric.getLogger();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Removing session part files for ID " + paramString;
      ((Logger)localObject2).d("CrashlyticsCore", (String)localObject1);
      deleteSessionPartFilesFor(paramString);
      return;
      int m = 0;
      localObject2 = null;
      break;
      label427:
      int i1 = 0;
      localObject5 = null;
      break label259;
      label436:
      m = 0;
      localObject2 = null;
      break label358;
      label445:
      localObject2 = Fabric.getLogger();
      localObject9 = "CrashlyticsCore";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject5 = "No events present for session ID ";
      localObject1 = (String)localObject5 + paramString;
      ((Logger)localObject2).d((String)localObject9, (String)localObject1);
    }
  }
  
  private void writeSessionUser(String paramString)
  {
    UserMetaData localUserMetaData = getUserMetaData(paramString);
    CrashlyticsController.25 local25 = new com/crashlytics/android/core/CrashlyticsController$25;
    local25.<init>(this, localUserMetaData);
    writeSessionPartFile(paramString, "SessionUser", local25);
  }
  
  /* Error */
  private static void writeToCosFromFile(CodedOutputStream paramCodedOutputStream, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 891	java/io/File:exists	()Z
    //   4: istore_2
    //   5: iload_2
    //   6: ifne +62 -> 68
    //   9: invokestatic 336	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   12: astore_3
    //   13: ldc_w 338
    //   16: astore 4
    //   18: new 352	java/lang/StringBuilder
    //   21: astore 5
    //   23: aload 5
    //   25: invokespecial 353	java/lang/StringBuilder:<init>	()V
    //   28: aload 5
    //   30: ldc_w 1292
    //   33: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: astore 5
    //   38: aload_1
    //   39: invokevirtual 641	java/io/File:getName	()Ljava/lang/String;
    //   42: astore 6
    //   44: aload 5
    //   46: aload 6
    //   48: invokevirtual 359	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 362	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 5
    //   56: aload_3
    //   57: aload 4
    //   59: aload 5
    //   61: aconst_null
    //   62: invokeinterface 377 4 0
    //   67: return
    //   68: new 1294	java/io/FileInputStream
    //   71: astore 4
    //   73: aload 4
    //   75: aload_1
    //   76: invokespecial 1295	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   79: aload_1
    //   80: invokevirtual 1298	java/io/File:length	()J
    //   83: lstore 7
    //   85: lload 7
    //   87: l2i
    //   88: istore_2
    //   89: aload 4
    //   91: aload_0
    //   92: iload_2
    //   93: invokestatic 1302	com/crashlytics/android/core/CrashlyticsController:copyToCodedOutputStream	(Ljava/io/InputStream;Lcom/crashlytics/android/core/CodedOutputStream;I)V
    //   96: ldc_w 1304
    //   99: astore_3
    //   100: aload 4
    //   102: aload_3
    //   103: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   106: goto -39 -> 67
    //   109: astore_3
    //   110: aconst_null
    //   111: astore 4
    //   113: aload 4
    //   115: ldc_w 1304
    //   118: invokestatic 512	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   121: aload_3
    //   122: athrow
    //   123: astore_3
    //   124: goto -11 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramCodedOutputStream	CodedOutputStream
    //   0	127	1	paramFile	File
    //   4	2	2	bool	boolean
    //   88	5	2	i	int
    //   12	91	3	localObject1	Object
    //   109	13	3	localObject2	Object
    //   123	1	3	localObject3	Object
    //   16	98	4	localObject4	Object
    //   21	39	5	localObject5	Object
    //   42	5	6	str	String
    //   83	3	7	l	long
    // Exception table:
    //   from	to	target	type
    //   68	71	109	finally
    //   75	79	109	finally
    //   79	83	123	finally
    //   92	96	123	finally
  }
  
  void cacheKeyData(Map paramMap)
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.11 local11 = new com/crashlytics/android/core/CrashlyticsController$11;
    local11.<init>(this, paramMap);
    localCrashlyticsBackgroundWorker.submit(local11);
  }
  
  void cacheUserData(String paramString1, String paramString2, String paramString3)
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.10 local10 = new com/crashlytics/android/core/CrashlyticsController$10;
    local10.<init>(this, paramString1, paramString2, paramString3);
    localCrashlyticsBackgroundWorker.submit(local10);
  }
  
  void cleanInvalidTempFiles()
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.14 local14 = new com/crashlytics/android/core/CrashlyticsController$14;
    local14.<init>(this);
    localCrashlyticsBackgroundWorker.submit(local14);
  }
  
  void doCleanInvalidTempFiles(File[] paramArrayOfFile)
  {
    int i = 0;
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int j = paramArrayOfFile.length;
    int m = 0;
    File localFile = null;
    Object localObject2;
    Object localObject3;
    String str1;
    Object localObject4;
    String str2;
    while (m < j)
    {
      localObject2 = paramArrayOfFile[m];
      localObject3 = Fabric.getLogger();
      str1 = "CrashlyticsCore";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str2 = "Found invalid session part file: ";
      localObject4 = str2 + localObject2;
      ((Logger)localObject3).d(str1, (String)localObject4);
      localObject2 = getSessionIdFromSessionFile((File)localObject2);
      ((Set)localObject1).add(localObject2);
      m += 1;
    }
    boolean bool2 = ((Set)localObject1).isEmpty();
    if (bool2) {}
    for (;;)
    {
      return;
      localFile = getInvalidFilesDir();
      boolean bool1 = localFile.exists();
      if (!bool1) {
        localFile.mkdir();
      }
      CrashlyticsController.15 local15 = new com/crashlytics/android/core/CrashlyticsController$15;
      local15.<init>(this, (Set)localObject1);
      localObject1 = listFilesMatching(local15);
      int k = localObject1.length;
      while (i < k)
      {
        localObject2 = localObject1[i];
        localObject3 = Fabric.getLogger();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str2 = "Moving session file: ";
        localObject4 = str2 + localObject2;
        ((Logger)localObject3).d("CrashlyticsCore", (String)localObject4);
        localObject3 = new java/io/File;
        str1 = ((File)localObject2).getName();
        ((File)localObject3).<init>(localFile, str1);
        boolean bool3 = ((File)localObject2).renameTo((File)localObject3);
        if (!bool3)
        {
          localObject3 = Fabric.getLogger();
          str1 = "CrashlyticsCore";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str2 = "Could not move session file. Deleting ";
          localObject4 = str2 + localObject2;
          ((Logger)localObject3).d(str1, (String)localObject4);
          ((File)localObject2).delete();
        }
        i += 1;
      }
      trimInvalidSessionFiles();
    }
  }
  
  void doCloseSessions(SessionSettingsData paramSessionSettingsData)
  {
    doCloseSessions(paramSessionSettingsData, false);
  }
  
  void enableExceptionHandling(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, boolean paramBoolean)
  {
    openSession();
    CrashlyticsController.6 local6 = new com/crashlytics/android/core/CrashlyticsController$6;
    local6.<init>(this);
    CrashlyticsUncaughtExceptionHandler localCrashlyticsUncaughtExceptionHandler = new com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler;
    CrashlyticsController.DefaultSettingsDataProvider localDefaultSettingsDataProvider = new com/crashlytics/android/core/CrashlyticsController$DefaultSettingsDataProvider;
    localDefaultSettingsDataProvider.<init>(null);
    localCrashlyticsUncaughtExceptionHandler.<init>(local6, localDefaultSettingsDataProvider, paramBoolean, paramUncaughtExceptionHandler);
    this.crashHandler = localCrashlyticsUncaughtExceptionHandler;
    Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
  }
  
  boolean finalizeNativeReport(CrashlyticsNdkData paramCrashlyticsNdkData)
  {
    if (paramCrashlyticsNdkData == null) {}
    Object localObject;
    for (boolean bool = true;; bool = ((Boolean)localObject).booleanValue())
    {
      return bool;
      localObject = this.backgroundWorker;
      CrashlyticsController.16 local16 = new com/crashlytics/android/core/CrashlyticsController$16;
      local16.<init>(this, paramCrashlyticsNdkData);
      localObject = (Boolean)((CrashlyticsBackgroundWorker)localObject).submitAndWait(local16);
    }
  }
  
  boolean finalizeSessions(SessionSettingsData paramSessionSettingsData)
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.13 local13 = new com/crashlytics/android/core/CrashlyticsController$13;
    local13.<init>(this, paramSessionSettingsData);
    return ((Boolean)localCrashlyticsBackgroundWorker.submitAndWait(local13)).booleanValue();
  }
  
  File getFatalSessionFilesDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = getFilesDir();
    localFile1.<init>(localFile2, "fatal-sessions");
    return localFile1;
  }
  
  File getFilesDir()
  {
    return this.fileStore.getFilesDir();
  }
  
  File getInvalidFilesDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = getFilesDir();
    localFile1.<init>(localFile2, "invalidClsFiles");
    return localFile1;
  }
  
  File getNonFatalSessionFilesDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = getFilesDir();
    localFile1.<init>(localFile2, "nonfatal-sessions");
    return localFile1;
  }
  
  void handleUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider paramSettingsDataProvider, Thread paramThread, Throwable paramThrowable, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = Fabric.getLogger();
      Object localObject3 = "CrashlyticsCore";
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      Object localObject5 = "Crashlytics is handling uncaught exception \"";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).append(paramThrowable);
      localObject5 = "\" from thread ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject5 = paramThread.getName();
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((Logger)localObject1).d((String)localObject3, (String)localObject4);
      localObject1 = this.devicePowerStateListener;
      ((DevicePowerStateListener)localObject1).dispose();
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
      localObject1 = new com/crashlytics/android/core/CrashlyticsController$7;
      localObject3 = this;
      localObject5 = paramThread;
      ((CrashlyticsController.7)localObject1).<init>(this, (Date)localObject4, paramThread, paramThrowable, paramSettingsDataProvider, paramBoolean);
      localCrashlyticsBackgroundWorker.submitAndWait((Callable)localObject1);
      return;
    }
    finally {}
  }
  
  boolean hasOpenSession()
  {
    File[] arrayOfFile = listSessionBeginFiles();
    int i = arrayOfFile.length;
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfFile = null;
    }
  }
  
  boolean isHandlingException()
  {
    CrashlyticsUncaughtExceptionHandler localCrashlyticsUncaughtExceptionHandler = this.crashHandler;
    boolean bool;
    if (localCrashlyticsUncaughtExceptionHandler != null)
    {
      localCrashlyticsUncaughtExceptionHandler = this.crashHandler;
      bool = localCrashlyticsUncaughtExceptionHandler.isHandlingException();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCrashlyticsUncaughtExceptionHandler = null;
    }
  }
  
  File[] listCompleteSessionFiles()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    Object localObject = getFatalSessionFilesDir();
    FilenameFilter localFilenameFilter = SESSION_FILE_FILTER;
    localObject = listFilesMatching((File)localObject, localFilenameFilter);
    Collections.addAll(localLinkedList, (Object[])localObject);
    localObject = getNonFatalSessionFilesDir();
    localFilenameFilter = SESSION_FILE_FILTER;
    localObject = listFilesMatching((File)localObject, localFilenameFilter);
    Collections.addAll(localLinkedList, (Object[])localObject);
    localObject = getFilesDir();
    localFilenameFilter = SESSION_FILE_FILTER;
    localObject = listFilesMatching((File)localObject, localFilenameFilter);
    Collections.addAll(localLinkedList, (Object[])localObject);
    localObject = new File[localLinkedList.size()];
    return (File[])localLinkedList.toArray((Object[])localObject);
  }
  
  File[] listNativeSessionFileDirectories()
  {
    FileFilter localFileFilter = SESSION_DIRECTORY_FILTER;
    return listFilesMatching(localFileFilter);
  }
  
  File[] listSessionBeginFiles()
  {
    FilenameFilter localFilenameFilter = SESSION_BEGIN_FILE_FILTER;
    return listFilesMatching(localFilenameFilter);
  }
  
  void openSession()
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.12 local12 = new com/crashlytics/android/core/CrashlyticsController$12;
    local12.<init>(this);
    localCrashlyticsBackgroundWorker.submit(local12);
  }
  
  void registerAnalyticsEventListener(SettingsData paramSettingsData)
  {
    Object localObject = paramSettingsData.featuresData;
    boolean bool = ((FeaturesSettingsData)localObject).firebaseCrashlyticsEnabled;
    if (bool)
    {
      localObject = this.appMeasurementEventListenerRegistrar;
      bool = ((AppMeasurementEventListenerRegistrar)localObject).register();
      if (bool)
      {
        localObject = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Registered Firebase Analytics event listener";
        ((Logger)localObject).d(str1, str2);
      }
    }
  }
  
  void registerDevicePowerStateListener()
  {
    this.devicePowerStateListener.initialize();
  }
  
  void submitAllReports(float paramFloat, SettingsData paramSettingsData)
  {
    Object localObject3;
    if (paramSettingsData == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      localObject3 = "Could not send reports. Settings are not available.";
      ((Logger)localObject1).w((String)localObject2, (String)localObject3);
      return;
    }
    Object localObject1 = paramSettingsData.appData.reportsUrl;
    Object localObject2 = paramSettingsData.appData.ndkReportsUrl;
    localObject2 = getCreateReportSpiCall((String)localObject1, (String)localObject2);
    boolean bool = shouldPromptUserBeforeSendingCrashReports(paramSettingsData);
    Object localObject4;
    Object localObject5;
    if (bool)
    {
      localObject1 = new com/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;
      localObject3 = this.crashlyticsCore;
      localObject4 = this.preferenceManager;
      localObject5 = paramSettingsData.promptData;
      ((CrashlyticsController.PrivacyDialogCheck)localObject1).<init>((Kit)localObject3, (PreferenceManager)localObject4, (PromptSettingsData)localObject5);
    }
    for (;;)
    {
      localObject3 = new com/crashlytics/android/core/ReportUploader;
      localObject4 = this.appData.apiKey;
      localObject5 = this.reportFilesProvider;
      ReportUploader.HandlingExceptionCheck localHandlingExceptionCheck = this.handlingExceptionCheck;
      ((ReportUploader)localObject3).<init>((String)localObject4, (CreateReportSpiCall)localObject2, (ReportUploader.ReportFilesProvider)localObject5, localHandlingExceptionCheck);
      ((ReportUploader)localObject3).uploadReports(paramFloat, (ReportUploader.SendCheck)localObject1);
      break;
      localObject1 = new com/crashlytics/android/core/ReportUploader$AlwaysSendCheck;
      ((ReportUploader.AlwaysSendCheck)localObject1).<init>();
    }
  }
  
  void trimSessionFiles(int paramInt)
  {
    File localFile = getFatalSessionFilesDir();
    Object localObject1 = SMALLEST_FILE_NAME_FIRST;
    int i = Utils.capFileCount(localFile, paramInt, (Comparator)localObject1);
    i = paramInt - i;
    localObject1 = getNonFatalSessionFilesDir();
    Object localObject2 = SMALLEST_FILE_NAME_FIRST;
    int j = Utils.capFileCount((File)localObject1, i, (Comparator)localObject2);
    i -= j;
    localObject1 = getFilesDir();
    localObject2 = SESSION_FILE_FILTER;
    Comparator localComparator = SMALLEST_FILE_NAME_FIRST;
    Utils.capFileCount((File)localObject1, (FilenameFilter)localObject2, i, localComparator);
  }
  
  void writeNonFatalException(Thread paramThread, Throwable paramThrowable)
  {
    Date localDate = new java/util/Date;
    localDate.<init>();
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.9 local9 = new com/crashlytics/android/core/CrashlyticsController$9;
    local9.<init>(this, localDate, paramThread, paramThrowable);
    localCrashlyticsBackgroundWorker.submit(local9);
  }
  
  void writeToLog(long paramLong, String paramString)
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsController.8 local8 = new com/crashlytics/android/core/CrashlyticsController$8;
    local8.<init>(this, paramLong, paramString);
    localCrashlyticsBackgroundWorker.submit(local8);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */