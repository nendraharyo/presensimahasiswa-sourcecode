package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

public class CrashlyticsCore
  extends Kit
{
  static final float CLS_DEFAULT_PROCESS_DELAY = 1.0F;
  static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
  static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
  static final String CRASH_MARKER_FILE_NAME = "crash_marker";
  static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
  private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
  static final int MAX_ATTRIBUTES = 64;
  static final int MAX_ATTRIBUTE_SIZE = 1024;
  private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
  private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
  public static final String TAG = "CrashlyticsCore";
  private final ConcurrentHashMap attributes;
  private CrashlyticsBackgroundWorker backgroundWorker;
  private CrashlyticsController controller;
  private CrashlyticsFileMarker crashMarker;
  private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
  private float delay;
  private boolean disabled;
  private HttpRequestFactory httpRequestFactory;
  private CrashlyticsFileMarker initializationMarker;
  private CrashlyticsListener listener;
  private final PinningInfoProvider pinningInfo;
  private final long startTime;
  private String userEmail = null;
  private String userId = null;
  private String userName = null;
  
  public CrashlyticsCore()
  {
    this(1.0F, null, null, false);
  }
  
  CrashlyticsCore(float paramFloat, CrashlyticsListener paramCrashlyticsListener, PinningInfoProvider paramPinningInfoProvider, boolean paramBoolean)
  {
    this(paramFloat, paramCrashlyticsListener, paramPinningInfoProvider, paramBoolean, localExecutorService);
  }
  
  CrashlyticsCore(float paramFloat, CrashlyticsListener paramCrashlyticsListener, PinningInfoProvider paramPinningInfoProvider, boolean paramBoolean, ExecutorService paramExecutorService)
  {
    this.delay = paramFloat;
    if (paramCrashlyticsListener != null) {}
    for (;;)
    {
      this.listener = paramCrashlyticsListener;
      this.pinningInfo = paramPinningInfoProvider;
      this.disabled = paramBoolean;
      localObject = new com/crashlytics/android/core/CrashlyticsBackgroundWorker;
      ((CrashlyticsBackgroundWorker)localObject).<init>(paramExecutorService);
      this.backgroundWorker = ((CrashlyticsBackgroundWorker)localObject);
      localObject = new java/util/concurrent/ConcurrentHashMap;
      ((ConcurrentHashMap)localObject).<init>();
      this.attributes = ((ConcurrentHashMap)localObject);
      long l = System.currentTimeMillis();
      this.startTime = l;
      return;
      paramCrashlyticsListener = new com/crashlytics/android/core/CrashlyticsCore$NoOpListener;
      paramCrashlyticsListener.<init>(null);
    }
  }
  
  private void checkForPreviousCrash()
  {
    Object localObject1 = this.backgroundWorker;
    Object localObject2 = new com/crashlytics/android/core/CrashlyticsCore$CrashMarkerCheck;
    Object localObject3 = this.crashMarker;
    ((CrashlyticsCore.CrashMarkerCheck)localObject2).<init>((CrashlyticsFileMarker)localObject3);
    localObject1 = (Boolean)((CrashlyticsBackgroundWorker)localObject1).submitAndWait((Callable)localObject2);
    localObject2 = Boolean.TRUE;
    boolean bool = ((Boolean)localObject2).equals(localObject1);
    if (!bool) {}
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.listener;
        ((CrashlyticsListener)localObject1).crashlyticsDidDetectCrashDuringPreviousExecution();
      }
      catch (Exception localException)
      {
        localObject2 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        String str = "Exception thrown by CrashlyticsListener while notifying of previous crash.";
        ((Logger)localObject2).e((String)localObject3, str, localException);
      }
    }
  }
  
  private void doLog(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.disabled;
    if (bool) {}
    for (;;)
    {
      return;
      String str1 = "prior to logging messages.";
      bool = ensureFabricWithCalled(str1);
      if (bool)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.startTime;
        l1 -= l2;
        CrashlyticsController localCrashlyticsController = this.controller;
        String str2 = formatLogMessage(paramInt, paramString1, paramString2);
        localCrashlyticsController.writeToLog(l1, str2);
      }
    }
  }
  
  private static boolean ensureFabricWithCalled(String paramString)
  {
    Object localObject1 = getInstance();
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = ((CrashlyticsCore)localObject1).controller;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = Fabric.getLogger();
      String str = "CrashlyticsCore";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Crashlytics must be initialized by calling Fabric.with(Context) " + paramString;
      ((Logger)localObject1).e(str, (String)localObject2, null);
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  private void finishInitSynchronously()
  {
    Object localObject1 = new com/crashlytics/android/core/CrashlyticsCore$1;
    ((CrashlyticsCore.1)localObject1).<init>(this);
    Object localObject2 = getDependencies();
    Object localObject3 = ((Collection)localObject2).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Task)((Iterator)localObject3).next();
      ((PriorityCallable)localObject1).addDependency((Task)localObject2);
    }
    localObject2 = getFabric().getExecutorService().submit((Callable)localObject1);
    localObject1 = Fabric.getLogger();
    localObject3 = "CrashlyticsCore";
    String str = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.";
    ((Logger)localObject1).d((String)localObject3, str);
    long l = 4;
    try
    {
      localObject1 = TimeUnit.SECONDS;
      ((Future)localObject2).get(l, (TimeUnit)localObject1);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject1 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        str = "Crashlytics was interrupted during initialization.";
        ((Logger)localObject1).e((String)localObject3, str, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        localObject1 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        str = "Problem encountered during Crashlytics initialization.";
        ((Logger)localObject1).e((String)localObject3, str, localExecutionException);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        localObject1 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        str = "Crashlytics timed out during initialization.";
        ((Logger)localObject1).e((String)localObject3, str, localTimeoutException);
      }
    }
  }
  
  private static String formatLogMessage(int paramInt, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = CommonUtils.logPriorityToString(paramInt);
    return str + "/" + paramString1 + " " + paramString2;
  }
  
  public static CrashlyticsCore getInstance()
  {
    return (CrashlyticsCore)Fabric.getKit(CrashlyticsCore.class);
  }
  
  static boolean isBuildIdValid(String paramString, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject;
    if (!paramBoolean)
    {
      localObject = Fabric.getLogger();
      String str1 = "CrashlyticsCore";
      String str2 = "Configured not to require a build ID.";
      ((Logger)localObject).d(str1, str2);
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = CommonUtils.isNullOrEmpty(paramString);
      if (bool2)
      {
        Log.e("CrashlyticsCore", ".");
        Log.e("CrashlyticsCore", ".     |  | ");
        Log.e("CrashlyticsCore", ".     |  |");
        Log.e("CrashlyticsCore", ".     |  |");
        Log.e("CrashlyticsCore", ".   \\ |  | /");
        Log.e("CrashlyticsCore", ".    \\    /");
        Log.e("CrashlyticsCore", ".     \\  /");
        Log.e("CrashlyticsCore", ".      \\/");
        Log.e("CrashlyticsCore", ".");
        Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
        Log.e("CrashlyticsCore", ".");
        Log.e("CrashlyticsCore", ".      /\\");
        Log.e("CrashlyticsCore", ".     /  \\");
        Log.e("CrashlyticsCore", ".    /    \\");
        Log.e("CrashlyticsCore", ".   / |  | \\");
        Log.e("CrashlyticsCore", ".     |  |");
        Log.e("CrashlyticsCore", ".     |  |");
        Log.e("CrashlyticsCore", ".     |  |");
        localObject = ".";
        Log.e("CrashlyticsCore", (String)localObject);
        bool1 = false;
      }
    }
  }
  
  private static String sanitizeAttribute(String paramString)
  {
    int i = 1024;
    if (paramString != null)
    {
      paramString = paramString.trim();
      int j = paramString.length();
      if (j > i)
      {
        j = 0;
        paramString = paramString.substring(0, i);
      }
    }
    return paramString;
  }
  
  public void crash()
  {
    CrashTest localCrashTest = new com/crashlytics/android/core/CrashTest;
    localCrashTest.<init>();
    localCrashTest.indexOutOfBounds();
  }
  
  void createCrashMarker()
  {
    this.crashMarker.create();
  }
  
  boolean didPreviousInitializationFail()
  {
    return this.initializationMarker.isPresent();
  }
  
  protected Void doInBackground()
  {
    markInitializationStarted();
    Object localObject1 = this.controller;
    ((CrashlyticsController)localObject1).cleanInvalidTempFiles();
    for (;;)
    {
      try
      {
        localObject1 = this.controller;
        ((CrashlyticsController)localObject1).registerDevicePowerStateListener();
        localObject1 = Settings.getInstance();
        localObject1 = ((Settings)localObject1).awaitSettingsData();
        if (localObject1 != null) {
          continue;
        }
        localObject1 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        localObject4 = "Received null settings, skipping report submission!";
        ((Logger)localObject1).w((String)localObject3, (String)localObject4);
      }
      catch (Exception localException)
      {
        boolean bool;
        float f;
        Object localObject3 = Fabric.getLogger();
        Object localObject4 = "CrashlyticsCore";
        String str = "Crashlytics encountered a problem during asynchronous initialization.";
        ((Logger)localObject3).e((String)localObject4, str, localException);
        markInitializationComplete();
        continue;
      }
      finally
      {
        markInitializationComplete();
      }
      return null;
      localObject3 = this.controller;
      ((CrashlyticsController)localObject3).registerAnalyticsEventListener((SettingsData)localObject1);
      localObject3 = ((SettingsData)localObject1).featuresData;
      bool = ((FeaturesSettingsData)localObject3).collectReports;
      if (!bool)
      {
        localObject1 = Fabric.getLogger();
        localObject3 = "CrashlyticsCore";
        localObject4 = "Collection of crash reports disabled in Crashlytics settings.";
        ((Logger)localObject1).d((String)localObject3, (String)localObject4);
        markInitializationComplete();
      }
      else
      {
        localObject3 = new io/fabric/sdk/android/services/common/FirebaseInfo;
        ((FirebaseInfo)localObject3).<init>();
        localObject4 = getContext();
        bool = ((FirebaseInfo)localObject3).isDataCollectionDefaultEnabled((Context)localObject4);
        if (!bool)
        {
          localObject1 = Fabric.getLogger();
          localObject3 = "CrashlyticsCore";
          localObject4 = "Automatic collection of crash reports disabled by Firebase settings.";
          ((Logger)localObject1).d((String)localObject3, (String)localObject4);
          markInitializationComplete();
        }
        else
        {
          localObject3 = getNativeCrashData();
          if (localObject3 != null)
          {
            localObject4 = this.controller;
            bool = ((CrashlyticsController)localObject4).finalizeNativeReport((CrashlyticsNdkData)localObject3);
            if (!bool)
            {
              localObject3 = Fabric.getLogger();
              localObject4 = "CrashlyticsCore";
              str = "Could not finalize previous NDK sessions.";
              ((Logger)localObject3).d((String)localObject4, str);
            }
          }
          localObject3 = this.controller;
          localObject4 = ((SettingsData)localObject1).sessionData;
          bool = ((CrashlyticsController)localObject3).finalizeSessions((SessionSettingsData)localObject4);
          if (!bool)
          {
            localObject3 = Fabric.getLogger();
            localObject4 = "CrashlyticsCore";
            str = "Could not finalize previous sessions.";
            ((Logger)localObject3).d((String)localObject4, str);
          }
          localObject3 = this.controller;
          f = this.delay;
          ((CrashlyticsController)localObject3).submitAllReports(f, (SettingsData)localObject1);
          markInitializationComplete();
        }
      }
    }
  }
  
  Map getAttributes()
  {
    return Collections.unmodifiableMap(this.attributes);
  }
  
  CrashlyticsController getController()
  {
    return this.controller;
  }
  
  public String getIdentifier()
  {
    return "com.crashlytics.sdk.android.crashlytics-core";
  }
  
  CrashlyticsNdkData getNativeCrashData()
  {
    Object localObject = this.crashlyticsNdkDataProvider;
    if (localObject != null) {}
    for (localObject = this.crashlyticsNdkDataProvider.getCrashlyticsNdkData();; localObject = null) {
      return (CrashlyticsNdkData)localObject;
    }
  }
  
  public PinningInfoProvider getPinningInfoProvider()
  {
    boolean bool = this.disabled;
    if (!bool) {}
    for (PinningInfoProvider localPinningInfoProvider = this.pinningInfo;; localPinningInfoProvider = null)
    {
      return localPinningInfoProvider;
      bool = false;
    }
  }
  
  String getUserEmail()
  {
    Object localObject = getIdManager();
    boolean bool = ((IdManager)localObject).canCollectUserIds();
    if (bool) {}
    for (localObject = this.userEmail;; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  String getUserIdentifier()
  {
    Object localObject = getIdManager();
    boolean bool = ((IdManager)localObject).canCollectUserIds();
    if (bool) {}
    for (localObject = this.userId;; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  String getUserName()
  {
    Object localObject = getIdManager();
    boolean bool = ((IdManager)localObject).canCollectUserIds();
    if (bool) {}
    for (localObject = this.userName;; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  public String getVersion()
  {
    return "2.6.4.27";
  }
  
  boolean internalVerifyPinning(URL paramURL)
  {
    Object localObject1 = getPinningInfoProvider();
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = this.httpRequestFactory;
      Object localObject2 = HttpMethod.GET;
      String str = paramURL.toString();
      localObject2 = ((HttpRequestFactory)localObject1).buildHttpRequest((HttpMethod)localObject2, str);
      localObject1 = (HttpsURLConnection)((HttpRequest)localObject2).getConnection();
      ((HttpsURLConnection)localObject1).setInstanceFollowRedirects(false);
      ((HttpRequest)localObject2).code();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public void log(int paramInt, String paramString1, String paramString2)
  {
    doLog(paramInt, paramString1, paramString2);
    Logger localLogger = Fabric.getLogger();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "" + paramString1;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "" + paramString2;
    localLogger.log(paramInt, (String)localObject1, (String)localObject2, true);
  }
  
  public void log(String paramString)
  {
    doLog(3, "CrashlyticsCore", paramString);
  }
  
  public void logException(Throwable paramThrowable)
  {
    boolean bool = this.disabled;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = "prior to logging exceptions.";
      bool = ensureFabricWithCalled((String)localObject);
      if (bool) {
        if (paramThrowable == null)
        {
          localObject = Fabric.getLogger();
          int i = 5;
          String str1 = "CrashlyticsCore";
          String str2 = "Crashlytics is ignoring a request to log a null exception.";
          ((Logger)localObject).log(i, str1, str2);
        }
        else
        {
          localObject = this.controller;
          Thread localThread = Thread.currentThread();
          ((CrashlyticsController)localObject).writeNonFatalException(localThread, paramThrowable);
        }
      }
    }
  }
  
  void markInitializationComplete()
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsCore.3 local3 = new com/crashlytics/android/core/CrashlyticsCore$3;
    local3.<init>(this);
    localCrashlyticsBackgroundWorker.submit(local3);
  }
  
  void markInitializationStarted()
  {
    CrashlyticsBackgroundWorker localCrashlyticsBackgroundWorker = this.backgroundWorker;
    CrashlyticsCore.2 local2 = new com/crashlytics/android/core/CrashlyticsCore$2;
    local2.<init>(this);
    localCrashlyticsBackgroundWorker.submitAndWait(local2);
  }
  
  protected boolean onPreExecute()
  {
    Context localContext = super.getContext();
    return onPreExecute(localContext);
  }
  
  boolean onPreExecute(Context paramContext)
  {
    boolean bool1 = true;
    Object localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject1).<init>();
    boolean bool2 = ((FirebaseInfo)localObject1).isDataCollectionDefaultEnabled(paramContext);
    Object localObject2;
    Object localObject3;
    if (!bool2)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      localObject3 = "Crashlytics is disabled, because data collection is disabled by Firebase.";
      ((Logger)localObject1).d((String)localObject2, (String)localObject3);
      this.disabled = bool1;
    }
    bool2 = this.disabled;
    if (bool2)
    {
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      localObject1 = new io/fabric/sdk/android/services/common/ApiKey;
      ((ApiKey)localObject1).<init>();
      localObject2 = ((ApiKey)localObject1).getValue(paramContext);
      if (localObject2 == null)
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        localObject3 = CommonUtils.resolveBuildId(paramContext);
        localObject1 = "com.crashlytics.RequireBuildId";
        bool2 = CommonUtils.getBooleanResourceValue(paramContext, (String)localObject1, bool1);
        bool2 = isBuildIdValid((String)localObject3, bool2);
        if (!bool2)
        {
          localObject1 = new io/fabric/sdk/android/services/concurrency/UnmetDependencyException;
          ((UnmetDependencyException)localObject1).<init>("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
          throw ((Throwable)localObject1);
        }
        try
        {
          localObject1 = Fabric.getLogger();
          localObject4 = "CrashlyticsCore";
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          Object localObject6 = "Initializing Crashlytics ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject6 = getVersion();
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject5 = ((StringBuilder)localObject5).toString();
          ((Logger)localObject1).i((String)localObject4, (String)localObject5);
          FileStoreImpl localFileStoreImpl = new io/fabric/sdk/android/services/persistence/FileStoreImpl;
          localFileStoreImpl.<init>(this);
          localObject1 = new com/crashlytics/android/core/CrashlyticsFileMarker;
          localObject4 = "crash_marker";
          ((CrashlyticsFileMarker)localObject1).<init>((String)localObject4, localFileStoreImpl);
          this.crashMarker = ((CrashlyticsFileMarker)localObject1);
          localObject1 = new com/crashlytics/android/core/CrashlyticsFileMarker;
          localObject4 = "initialization_marker";
          ((CrashlyticsFileMarker)localObject1).<init>((String)localObject4, localFileStoreImpl);
          this.initializationMarker = ((CrashlyticsFileMarker)localObject1);
          localObject1 = new io/fabric/sdk/android/services/persistence/PreferenceStoreImpl;
          localObject4 = getContext();
          localObject5 = "com.crashlytics.android.core.CrashlyticsCore";
          ((PreferenceStoreImpl)localObject1).<init>((Context)localObject4, (String)localObject5);
          localObject6 = PreferenceManager.create((PreferenceStore)localObject1, this);
          localObject1 = this.pinningInfo;
          if (localObject1 != null)
          {
            localObject1 = new com/crashlytics/android/core/CrashlyticsPinningInfoProvider;
            localObject4 = this.pinningInfo;
            ((CrashlyticsPinningInfoProvider)localObject1).<init>((PinningInfoProvider)localObject4);
          }
          for (;;)
          {
            localObject4 = new io/fabric/sdk/android/services/network/DefaultHttpRequestFactory;
            localObject5 = Fabric.getLogger();
            ((DefaultHttpRequestFactory)localObject4).<init>((Logger)localObject5);
            this.httpRequestFactory = ((HttpRequestFactory)localObject4);
            localObject4 = this.httpRequestFactory;
            ((HttpRequestFactory)localObject4).setPinningInfoProvider((io.fabric.sdk.android.services.network.PinningInfoProvider)localObject1);
            localObject5 = getIdManager();
            AppData localAppData = AppData.create(paramContext, (IdManager)localObject5, (String)localObject2, (String)localObject3);
            ManifestUnityVersionProvider localManifestUnityVersionProvider = new com/crashlytics/android/core/ManifestUnityVersionProvider;
            localObject1 = localAppData.packageName;
            localManifestUnityVersionProvider.<init>(paramContext, (String)localObject1);
            AppMeasurementEventListenerRegistrar localAppMeasurementEventListenerRegistrar = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
            EventLogger localEventLogger = AppMeasurementEventLogger.getEventLogger(paramContext);
            localObject1 = Fabric.getLogger();
            localObject2 = "CrashlyticsCore";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Installer package name is: ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = localAppData.installerPackageName;
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject3 = ((StringBuilder)localObject3).toString();
            ((Logger)localObject1).d((String)localObject2, (String)localObject3);
            localObject1 = new com/crashlytics/android/core/CrashlyticsController;
            localObject3 = this.backgroundWorker;
            localObject4 = this.httpRequestFactory;
            localObject2 = this;
            ((CrashlyticsController)localObject1).<init>(this, (CrashlyticsBackgroundWorker)localObject3, (HttpRequestFactory)localObject4, (IdManager)localObject5, (PreferenceManager)localObject6, localFileStoreImpl, localAppData, localManifestUnityVersionProvider, localAppMeasurementEventListenerRegistrar, localEventLogger);
            this.controller = ((CrashlyticsController)localObject1);
            bool2 = didPreviousInitializationFail();
            checkForPreviousCrash();
            localObject2 = new io/fabric/sdk/android/services/common/FirebaseInfo;
            ((FirebaseInfo)localObject2).<init>();
            boolean bool3 = ((FirebaseInfo)localObject2).isFirebaseCrashlyticsEnabled(paramContext);
            localObject3 = this.controller;
            localObject4 = Thread.getDefaultUncaughtExceptionHandler();
            ((CrashlyticsController)localObject3).enableExceptionHandling((Thread.UncaughtExceptionHandler)localObject4, bool3);
            if (!bool2) {
              break label655;
            }
            bool2 = CommonUtils.canTryConnection(paramContext);
            if (!bool2) {
              break label655;
            }
            localObject1 = Fabric.getLogger();
            localObject2 = "CrashlyticsCore";
            localObject3 = "Crashlytics did not finish previous background initialization. Initializing synchronously.";
            ((Logger)localObject1).d((String)localObject2, (String)localObject3);
            finishInitSynchronously();
            bool2 = false;
            localObject1 = null;
            break;
            bool2 = false;
            localObject1 = null;
          }
        }
        catch (Exception localException)
        {
          localObject2 = Fabric.getLogger();
          localObject3 = "CrashlyticsCore";
          Object localObject4 = "Crashlytics was not started due to an exception during initialization";
          ((Logger)localObject2).e((String)localObject3, (String)localObject4, localException);
          this.controller = null;
          bool2 = false;
          localLogger = null;
        }
        label655:
        Logger localLogger = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        localObject3 = "Exception handling initialization successful";
        localLogger.d((String)localObject2, (String)localObject3);
        bool2 = bool1;
      }
    }
  }
  
  public void setBool(String paramString, boolean paramBoolean)
  {
    String str = Boolean.toString(paramBoolean);
    setString(paramString, str);
  }
  
  void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider paramCrashlyticsNdkDataProvider)
  {
    this.crashlyticsNdkDataProvider = paramCrashlyticsNdkDataProvider;
  }
  
  public void setDouble(String paramString, double paramDouble)
  {
    String str = Double.toString(paramDouble);
    setString(paramString, str);
  }
  
  public void setFloat(String paramString, float paramFloat)
  {
    String str = Float.toString(paramFloat);
    setString(paramString, str);
  }
  
  public void setInt(String paramString, int paramInt)
  {
    String str = Integer.toString(paramInt);
    setString(paramString, str);
  }
  
  public void setListener(CrashlyticsListener paramCrashlyticsListener)
  {
    try
    {
      Object localObject1 = Fabric.getLogger();
      String str1 = "CrashlyticsCore";
      String str2 = "Use of setListener is deprecated.";
      ((Logger)localObject1).w(str1, str2);
      if (paramCrashlyticsListener == null)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        str1 = "listener must not be null.";
        ((IllegalArgumentException)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    this.listener = paramCrashlyticsListener;
  }
  
  public void setLong(String paramString, long paramLong)
  {
    String str = Long.toString(paramLong);
    setString(paramString, str);
  }
  
  public void setString(String paramString1, String paramString2)
  {
    boolean bool1 = this.disabled;
    if (bool1) {}
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      return;
      localObject1 = "prior to setting keys.";
      bool1 = ensureFabricWithCalled((String)localObject1);
      if (bool1) {
        if (paramString1 == null)
        {
          localObject1 = getContext();
          if (localObject1 != null)
          {
            bool1 = CommonUtils.isAppDebuggable((Context)localObject1);
            if (bool1)
            {
              localObject1 = new java/lang/IllegalArgumentException;
              ((IllegalArgumentException)localObject1).<init>("Custom attribute key must not be null.");
              throw ((Throwable)localObject1);
            }
          }
          localObject1 = Fabric.getLogger();
          localObject2 = "CrashlyticsCore";
          localObject3 = "Attempting to set custom attribute with null key, ignoring.";
          ((Logger)localObject1).e((String)localObject2, (String)localObject3, null);
        }
        else
        {
          localObject2 = sanitizeAttribute(paramString1);
          localObject1 = this.attributes;
          int i = ((ConcurrentHashMap)localObject1).size();
          int j = 64;
          if (i < j) {
            break;
          }
          localObject1 = this.attributes;
          boolean bool2 = ((ConcurrentHashMap)localObject1).containsKey(localObject2);
          if (bool2) {
            break;
          }
          localObject1 = Fabric.getLogger();
          localObject2 = "CrashlyticsCore";
          localObject3 = "Exceeded maximum number of custom attributes (64)";
          ((Logger)localObject1).d((String)localObject2, (String)localObject3);
        }
      }
    }
    if (paramString2 == null) {}
    for (Object localObject1 = "";; localObject1 = sanitizeAttribute(paramString2))
    {
      localObject3 = this.attributes;
      ((ConcurrentHashMap)localObject3).put(localObject2, localObject1);
      localObject1 = this.controller;
      localObject2 = this.attributes;
      ((CrashlyticsController)localObject1).cacheKeyData((Map)localObject2);
      break;
    }
  }
  
  public void setUserEmail(String paramString)
  {
    boolean bool = this.disabled;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = "prior to setting user data.";
      bool = ensureFabricWithCalled((String)localObject);
      if (bool)
      {
        localObject = sanitizeAttribute(paramString);
        this.userEmail = ((String)localObject);
        localObject = this.controller;
        String str1 = this.userId;
        String str2 = this.userName;
        String str3 = this.userEmail;
        ((CrashlyticsController)localObject).cacheUserData(str1, str2, str3);
      }
    }
  }
  
  public void setUserIdentifier(String paramString)
  {
    boolean bool = this.disabled;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = "prior to setting user data.";
      bool = ensureFabricWithCalled((String)localObject);
      if (bool)
      {
        localObject = sanitizeAttribute(paramString);
        this.userId = ((String)localObject);
        localObject = this.controller;
        String str1 = this.userId;
        String str2 = this.userName;
        String str3 = this.userEmail;
        ((CrashlyticsController)localObject).cacheUserData(str1, str2, str3);
      }
    }
  }
  
  public void setUserName(String paramString)
  {
    boolean bool = this.disabled;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject = "prior to setting user data.";
      bool = ensureFabricWithCalled((String)localObject);
      if (bool)
      {
        localObject = sanitizeAttribute(paramString);
        this.userName = ((String)localObject);
        localObject = this.controller;
        String str1 = this.userId;
        String str2 = this.userName;
        String str3 = this.userEmail;
        ((CrashlyticsController)localObject).cacheUserData(str1, str2, str3);
      }
    }
  }
  
  public boolean verifyPinning(URL paramURL)
  {
    try
    {
      bool = internalVerifyPinning(paramURL);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Could not verify SSL pinning";
        localLogger.e(str1, str2, localException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */