package io.fabric.sdk.android.services.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.IBinder;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.crypto.Cipher;

public class CommonUtils
{
  static final int BYTES_IN_A_GIGABYTE = 1073741824;
  static final int BYTES_IN_A_KILOBYTE = 1024;
  static final int BYTES_IN_A_MEGABYTE = 1048576;
  private static final String CLS_SHARED_PREFERENCES_NAME = "com.crashlytics.prefs";
  static final boolean CLS_TRACE_DEFAULT = false;
  static final String CLS_TRACE_PREFERENCE_NAME = "com.crashlytics.Trace";
  static final String CRASHLYTICS_BUILD_ID = "com.crashlytics.android.build_id";
  public static final int DEVICE_STATE_BETAOS = 8;
  public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
  public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
  public static final int DEVICE_STATE_ISSIMULATOR = 1;
  public static final int DEVICE_STATE_JAILBROKEN = 2;
  public static final int DEVICE_STATE_VENDORINTERNAL = 16;
  static final String FABRIC_BUILD_ID = "io.fabric.android.build_id";
  public static final Comparator FILE_MODIFIED_COMPARATOR;
  public static final String GOOGLE_SDK = "google_sdk";
  private static final char[] HEX_VALUES;
  private static final String LOG_PRIORITY_NAME_ASSERT = "A";
  private static final String LOG_PRIORITY_NAME_DEBUG = "D";
  private static final String LOG_PRIORITY_NAME_ERROR = "E";
  private static final String LOG_PRIORITY_NAME_INFO = "I";
  private static final String LOG_PRIORITY_NAME_UNKNOWN = "?";
  private static final String LOG_PRIORITY_NAME_VERBOSE = "V";
  private static final String LOG_PRIORITY_NAME_WARN = "W";
  public static final String SDK = "sdk";
  public static final String SHA1_INSTANCE = "SHA-1";
  public static final String SHA256_INSTANCE = "SHA-256";
  private static final long UNCALCULATED_TOTAL_RAM = 255L;
  private static Boolean clsTrace = null;
  private static long totalRamInBytes;
  
  static
  {
    Object localObject = new char[16];
    localObject[0] = 48;
    localObject[1] = 49;
    localObject[2] = 50;
    localObject[3] = 51;
    localObject[4] = 52;
    localObject[5] = 53;
    localObject[6] = 54;
    localObject[7] = 55;
    localObject[8] = 56;
    localObject[9] = 57;
    localObject[10] = 97;
    localObject[11] = 98;
    localObject[12] = 99;
    localObject[13] = 100;
    localObject[14] = 101;
    localObject[15] = 102;
    HEX_VALUES = (char[])localObject;
    totalRamInBytes = -1;
    localObject = new io/fabric/sdk/android/services/common/CommonUtils$1;
    ((CommonUtils.1)localObject).<init>();
    FILE_MODIFIED_COMPARATOR = (Comparator)localObject;
  }
  
  public static long calculateFreeRamInBytes(Context paramContext)
  {
    ActivityManager.MemoryInfo localMemoryInfo = new android/app/ActivityManager$MemoryInfo;
    localMemoryInfo.<init>();
    ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem;
  }
  
  public static long calculateUsedDiskSpaceInBytes(String paramString)
  {
    StatFs localStatFs = new android/os/StatFs;
    localStatFs.<init>(paramString);
    long l1 = localStatFs.getBlockSize();
    long l2 = localStatFs.getBlockCount() * l1;
    long l3 = localStatFs.getAvailableBlocks() * l1;
    return l2 - l3;
  }
  
  public static boolean canTryConnection(Context paramContext)
  {
    boolean bool1 = true;
    Object localObject = "android.permission.ACCESS_NETWORK_STATE";
    boolean bool2 = checkPermission(paramContext, (String)localObject);
    if (bool2)
    {
      localObject = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localObject != null)
      {
        bool2 = ((NetworkInfo)localObject).isConnectedOrConnecting();
        if (bool2) {
          bool2 = bool1;
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
      continue;
      bool2 = bool1;
    }
  }
  
  public static boolean checkPermission(Context paramContext, String paramString)
  {
    int i = paramContext.checkCallingOrSelfPermission(paramString);
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static void closeOrLog(Closeable paramCloseable, String paramString)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str = "Fabric";
        localLogger.e(str, paramString, localIOException);
      }
    }
  }
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static long convertMemInfoToBytes(String paramString1, String paramString2, int paramInt)
  {
    long l1 = Long.parseLong(paramString1.split(paramString2)[0].trim());
    long l2 = paramInt;
    return l1 * l2;
  }
  
  public static void copyStream(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    for (;;)
    {
      int i = paramInputStream.read(paramArrayOfByte);
      int j = -1;
      if (i == j) {
        break;
      }
      j = 0;
      paramOutputStream.write(paramArrayOfByte, 0, i);
    }
  }
  
  public static Cipher createCipher(int paramInt, String paramString)
  {
    InvalidKeyException localInvalidKeyException = new java/security/InvalidKeyException;
    localInvalidKeyException.<init>("This method is deprecated");
    throw localInvalidKeyException;
  }
  
  public static String createInstanceIdFrom(String... paramVarArgs)
  {
    int i;
    String str1;
    if (paramVarArgs != null)
    {
      i = paramVarArgs.length;
      if (i != 0) {}
    }
    else
    {
      i = 0;
      str1 = null;
    }
    for (;;)
    {
      return str1;
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int j = paramVarArgs.length;
      i = 0;
      str1 = null;
      while (i < j)
      {
        String str2 = paramVarArgs[i];
        if (str2 != null)
        {
          String str3 = "";
          str2 = str2.replace("-", str3);
          Locale localLocale = Locale.US;
          str2 = str2.toLowerCase(localLocale);
          ((List)localObject).add(str2);
        }
        i += 1;
      }
      Collections.sort((List)localObject);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = ((List)localObject).iterator();
      boolean bool;
      for (;;)
      {
        bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        str1 = (String)((Iterator)localObject).next();
        localStringBuilder.append(str1);
      }
      str1 = localStringBuilder.toString();
      int k = str1.length();
      if (k > 0)
      {
        str1 = sha1(str1);
      }
      else
      {
        bool = false;
        str1 = null;
      }
    }
  }
  
  public static byte[] dehexify(String paramString)
  {
    int i = 16;
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int k = 0;
    while (k < j)
    {
      int m = k / 2;
      int n = Character.digit(paramString.charAt(k), i) << 4;
      int i1 = k + 1;
      i1 = Character.digit(paramString.charAt(i1), i);
      n = (byte)(n + i1);
      arrayOfByte[m] = n;
      k += 2;
    }
    return arrayOfByte;
  }
  
  /* Error */
  public static String extractFieldFromSystemFile(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: aload_0
    //   5: invokevirtual 295	java/io/File:exists	()Z
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +128 -> 140
    //   15: new 297	java/io/BufferedReader
    //   18: astore 5
    //   20: new 299	java/io/FileReader
    //   23: astore 6
    //   25: aload 6
    //   27: aload_0
    //   28: invokespecial 302	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   31: sipush 1024
    //   34: istore 7
    //   36: aload 5
    //   38: aload 6
    //   40: iload 7
    //   42: invokespecial 306	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   45: aload 5
    //   47: invokevirtual 309	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore 6
    //   52: aload 6
    //   54: ifnull +74 -> 128
    //   57: ldc_w 311
    //   60: astore 8
    //   62: aload 8
    //   64: invokestatic 317	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   67: astore 8
    //   69: iconst_2
    //   70: istore 9
    //   72: aload 8
    //   74: aload 6
    //   76: iload 9
    //   78: invokevirtual 321	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;I)[Ljava/lang/String;
    //   81: astore 6
    //   83: aload 6
    //   85: arraylength
    //   86: istore 7
    //   88: iload 7
    //   90: iload_3
    //   91: if_icmple -46 -> 45
    //   94: iconst_0
    //   95: istore 7
    //   97: aconst_null
    //   98: astore 8
    //   100: aload 6
    //   102: iconst_0
    //   103: aaload
    //   104: astore 8
    //   106: aload 8
    //   108: aload_1
    //   109: invokevirtual 324	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   112: istore 7
    //   114: iload 7
    //   116: ifeq -71 -> 45
    //   119: iconst_1
    //   120: istore 7
    //   122: aload 6
    //   124: iload 7
    //   126: aaload
    //   127: astore_2
    //   128: ldc_w 326
    //   131: astore 6
    //   133: aload 5
    //   135: aload 6
    //   137: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   140: aload_2
    //   141: areturn
    //   142: astore 6
    //   144: aconst_null
    //   145: astore 5
    //   147: invokestatic 170	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   150: astore 8
    //   152: ldc -84
    //   154: astore 10
    //   156: new 252	java/lang/StringBuilder
    //   159: astore 11
    //   161: aload 11
    //   163: invokespecial 253	java/lang/StringBuilder:<init>	()V
    //   166: ldc_w 332
    //   169: astore 12
    //   171: aload 11
    //   173: aload 12
    //   175: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: astore 11
    //   180: aload 11
    //   182: aload_0
    //   183: invokevirtual 335	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   186: astore 11
    //   188: aload 11
    //   190: invokevirtual 273	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: astore 11
    //   195: aload 8
    //   197: aload 10
    //   199: aload 11
    //   201: aload 6
    //   203: invokeinterface 178 4 0
    //   208: ldc_w 326
    //   211: astore 6
    //   213: aload 5
    //   215: aload 6
    //   217: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   220: goto -80 -> 140
    //   223: astore 6
    //   225: aconst_null
    //   226: astore 5
    //   228: aload 6
    //   230: astore_2
    //   231: aload 5
    //   233: ldc_w 326
    //   236: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   239: aload_2
    //   240: athrow
    //   241: astore_2
    //   242: goto -11 -> 231
    //   245: astore 6
    //   247: goto -100 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	paramFile	File
    //   0	250	1	paramString	String
    //   1	239	2	localObject1	Object
    //   241	1	2	localObject2	Object
    //   3	89	3	i	int
    //   8	3	4	bool1	boolean
    //   18	214	5	localBufferedReader	java.io.BufferedReader
    //   23	113	6	localObject3	Object
    //   142	60	6	localException1	Exception
    //   211	5	6	str1	String
    //   223	6	6	localObject4	Object
    //   245	1	6	localException2	Exception
    //   34	62	7	j	int
    //   112	13	7	bool2	boolean
    //   60	136	8	localObject5	Object
    //   70	7	9	k	int
    //   154	44	10	str2	String
    //   159	41	11	localObject6	Object
    //   169	5	12	str3	String
    // Exception table:
    //   from	to	target	type
    //   15	18	142	java/lang/Exception
    //   20	23	142	java/lang/Exception
    //   27	31	142	java/lang/Exception
    //   40	45	142	java/lang/Exception
    //   15	18	223	finally
    //   20	23	223	finally
    //   27	31	223	finally
    //   40	45	223	finally
    //   45	50	241	finally
    //   62	67	241	finally
    //   76	81	241	finally
    //   83	86	241	finally
    //   102	104	241	finally
    //   108	112	241	finally
    //   124	127	241	finally
    //   147	150	241	finally
    //   156	159	241	finally
    //   161	166	241	finally
    //   173	178	241	finally
    //   182	186	241	finally
    //   188	193	241	finally
    //   201	208	241	finally
    //   45	50	245	java/lang/Exception
    //   62	67	245	java/lang/Exception
    //   76	81	245	java/lang/Exception
    //   83	86	245	java/lang/Exception
    //   102	104	245	java/lang/Exception
    //   108	112	245	java/lang/Exception
    //   124	127	245	java/lang/Exception
  }
  
  public static void finishAffinity(Activity paramActivity, int paramInt)
  {
    if (paramActivity == null) {}
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j)
      {
        paramActivity.finishAffinity();
      }
      else
      {
        paramActivity.setResult(paramInt);
        paramActivity.finish();
      }
    }
  }
  
  public static void finishAffinity(Context paramContext, int paramInt)
  {
    boolean bool = paramContext instanceof Activity;
    if (bool)
    {
      paramContext = (Activity)paramContext;
      finishAffinity(paramContext, paramInt);
    }
  }
  
  public static void flushOrLog(Flushable paramFlushable, String paramString)
  {
    if (paramFlushable != null) {}
    try
    {
      paramFlushable.flush();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str = "Fabric";
        localLogger.e(str, paramString, localIOException);
      }
    }
  }
  
  /* Error */
  public static String getAppIconHashOrNull(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 364	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   6: astore_2
    //   7: aload_0
    //   8: invokestatic 368	io/fabric/sdk/android/services/common/CommonUtils:getAppIconResourceId	(Landroid/content/Context;)I
    //   11: istore_3
    //   12: aload_2
    //   13: iload_3
    //   14: invokevirtual 374	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   17: astore 4
    //   19: aload 4
    //   21: invokestatic 377	io/fabric/sdk/android/services/common/CommonUtils:sha1	(Ljava/io/InputStream;)Ljava/lang/String;
    //   24: astore_2
    //   25: aload_2
    //   26: invokestatic 381	io/fabric/sdk/android/services/common/CommonUtils:isNullOrEmpty	(Ljava/lang/String;)Z
    //   29: istore 5
    //   31: iload 5
    //   33: ifeq +15 -> 48
    //   36: ldc_w 383
    //   39: astore_2
    //   40: aload 4
    //   42: aload_2
    //   43: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   46: aload_1
    //   47: areturn
    //   48: aload_2
    //   49: astore_1
    //   50: goto -14 -> 36
    //   53: astore_2
    //   54: iconst_0
    //   55: istore_3
    //   56: aconst_null
    //   57: astore 4
    //   59: invokestatic 170	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   62: astore 6
    //   64: ldc -84
    //   66: astore 7
    //   68: ldc_w 385
    //   71: astore 8
    //   73: aload 6
    //   75: aload 7
    //   77: aload 8
    //   79: aload_2
    //   80: invokeinterface 178 4 0
    //   85: ldc_w 383
    //   88: astore_2
    //   89: aload 4
    //   91: aload_2
    //   92: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   95: goto -49 -> 46
    //   98: astore_2
    //   99: iconst_0
    //   100: istore_3
    //   101: aconst_null
    //   102: astore 4
    //   104: aload_2
    //   105: astore_1
    //   106: aload 4
    //   108: ldc_w 383
    //   111: invokestatic 330	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   114: aload_1
    //   115: athrow
    //   116: astore_1
    //   117: goto -11 -> 106
    //   120: astore_2
    //   121: goto -62 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	paramContext	Context
    //   1	114	1	localObject1	Object
    //   116	1	1	localObject2	Object
    //   6	43	2	localObject3	Object
    //   53	27	2	localException1	Exception
    //   88	4	2	str1	String
    //   98	7	2	localObject4	Object
    //   120	1	2	localException2	Exception
    //   11	90	3	i	int
    //   17	90	4	localInputStream	InputStream
    //   29	3	5	bool	boolean
    //   62	12	6	localLogger	Logger
    //   66	10	7	str2	String
    //   71	7	8	str3	String
    // Exception table:
    //   from	to	target	type
    //   2	6	53	java/lang/Exception
    //   7	11	53	java/lang/Exception
    //   13	17	53	java/lang/Exception
    //   2	6	98	finally
    //   7	11	98	finally
    //   13	17	98	finally
    //   19	24	116	finally
    //   25	29	116	finally
    //   59	62	116	finally
    //   79	85	116	finally
    //   19	24	120	java/lang/Exception
    //   25	29	120	java/lang/Exception
  }
  
  public static int getAppIconResourceId(Context paramContext)
  {
    return paramContext.getApplicationContext().getApplicationInfo().icon;
  }
  
  public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String paramString, Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    boolean bool1;
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      boolean bool2;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        String str = ((ActivityManager.RunningAppProcessInfo)localObject).processName;
        bool2 = str.equals(paramString);
      } while (!bool2);
    }
    for (;;)
    {
      return (ActivityManager.RunningAppProcessInfo)localObject;
      bool1 = false;
      localObject = null;
    }
  }
  
  public static Float getBatteryLevel(Context paramContext)
  {
    int i = 0;
    float f1 = 0.0F;
    Float localFloat = null;
    int j = -1;
    Object localObject = new android/content/IntentFilter;
    String str = "android.intent.action.BATTERY_CHANGED";
    ((IntentFilter)localObject).<init>(str);
    localObject = paramContext.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null) {}
    for (;;)
    {
      return localFloat;
      i = ((Intent)localObject).getIntExtra("level", j);
      str = "scale";
      int k = ((Intent)localObject).getIntExtra(str, j);
      f1 = i;
      float f2 = k;
      f1 /= f2;
      localFloat = Float.valueOf(f1);
    }
  }
  
  public static int getBatteryVelocity(Context paramContext, boolean paramBoolean)
  {
    double d1 = 99.0D;
    Float localFloat = getBatteryLevel(paramContext);
    int i;
    float f1;
    if ((!paramBoolean) || (localFloat == null))
    {
      i = 1;
      f1 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return i;
      float f2 = localFloat.floatValue();
      double d2 = f2;
      boolean bool2 = d2 < d1;
      if (!bool2)
      {
        i = 3;
        f1 = 4.2E-45F;
      }
      else
      {
        f1 = localFloat.floatValue();
        double d3 = f1;
        boolean bool1 = d3 < d1;
        int j;
        if (bool1)
        {
          j = 2;
          f1 = 2.8E-45F;
        }
        else
        {
          j = 0;
          f1 = 0.0F;
          localFloat = null;
        }
      }
    }
  }
  
  public static boolean getBooleanResourceValue(Context paramContext, String paramString, boolean paramBoolean)
  {
    Object localObject;
    if (paramContext != null)
    {
      localObject = paramContext.getResources();
      if (localObject != null)
      {
        String str = "bool";
        int i = getResourcesIdentifier(paramContext, paramString, str);
        if (i <= 0) {
          break label41;
        }
        paramBoolean = ((Resources)localObject).getBoolean(i);
      }
    }
    for (;;)
    {
      return paramBoolean;
      label41:
      localObject = "string";
      int j = getResourcesIdentifier(paramContext, paramString, (String)localObject);
      if (j > 0)
      {
        localObject = paramContext.getString(j);
        paramBoolean = Boolean.parseBoolean((String)localObject);
      }
    }
  }
  
  public static int getCpuArchitectureInt()
  {
    return CommonUtils.Architecture.getValue().ordinal();
  }
  
  public static int getDeviceState(Context paramContext)
  {
    int i = 0;
    boolean bool = isEmulator(paramContext);
    if (bool) {
      i = 1;
    }
    bool = isRooted(paramContext);
    if (bool) {
      i |= 0x2;
    }
    bool = isDebuggerAttached();
    if (bool) {
      i |= 0x4;
    }
    return i;
  }
  
  public static boolean getProximitySensorEnabled(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = isEmulator(paramContext);
    if (bool2) {
      return bool1;
    }
    Object localObject = (SensorManager)paramContext.getSystemService("sensor");
    int i = 8;
    localObject = ((SensorManager)localObject).getDefaultSensor(i);
    if (localObject != null) {
      bool2 = true;
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = false;
      localObject = null;
    }
  }
  
  public static String getResourcePackageName(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext().getApplicationInfo();
    int i = ((ApplicationInfo)localObject).icon;
    Resources localResources;
    if (i > 0) {
      localResources = paramContext.getResources();
    }
    for (localObject = localResources.getResourcePackageName(i);; localObject = paramContext.getPackageName()) {
      return (String)localObject;
    }
  }
  
  public static int getResourcesIdentifier(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    String str = getResourcePackageName(paramContext);
    return localResources.getIdentifier(paramString1, paramString2, str);
  }
  
  public static SharedPreferences getSharedPrefs(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.crashlytics.prefs", 0);
  }
  
  public static String getStringsFileValue(Context paramContext, String paramString)
  {
    String str = "string";
    int i = getResourcesIdentifier(paramContext, paramString, str);
    if (i > 0) {}
    for (str = paramContext.getString(i);; str = "") {
      return str;
    }
  }
  
  public static long getTotalRamInBytes()
  {
    Object localObject2;
    synchronized (CommonUtils.class)
    {
      long l1 = totalRamInBytes;
      long l2 = -1;
      boolean bool1 = l1 < l2;
      if (!bool1)
      {
        l1 = 0L;
        localObject1 = new java/io/File;
        localObject2 = "/proc/meminfo";
        ((File)localObject1).<init>((String)localObject2);
        localObject2 = "MemTotal";
        localObject1 = extractFieldFromSystemFile((File)localObject1, (String)localObject2);
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool2)
        {
          localObject2 = Locale.US;
          localObject2 = ((String)localObject1).toUpperCase((Locale)localObject2);
          localObject1 = "KB";
        }
      }
      for (;;)
      {
        try
        {
          bool3 = ((String)localObject2).endsWith((String)localObject1);
          if (!bool3) {
            continue;
          }
          localObject1 = "KB";
          i = 1024;
          l1 = convertMemInfoToBytes((String)localObject2, (String)localObject1, i);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          boolean bool3;
          int i;
          Object localObject3 = Fabric.getLogger();
          Object localObject4 = "Fabric";
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          String str = "Unexpected meminfo format while computing RAM: ";
          localObject5 = ((StringBuilder)localObject5).append(str);
          localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
          localObject2 = ((StringBuilder)localObject2).toString();
          ((Logger)localObject3).e((String)localObject4, (String)localObject2, localNumberFormatException);
          continue;
        }
        totalRamInBytes = l1;
        l1 = totalRamInBytes;
        return l1;
        localObject1 = "MB";
        bool3 = ((String)localObject2).endsWith((String)localObject1);
        if (bool3)
        {
          localObject1 = "MB";
          i = 1048576;
          l1 = convertMemInfoToBytes((String)localObject2, (String)localObject1, i);
        }
        else
        {
          localObject1 = "GB";
          bool3 = ((String)localObject2).endsWith((String)localObject1);
          if (!bool3) {
            continue;
          }
          localObject1 = "GB";
          i = 1073741824;
          l1 = convertMemInfoToBytes((String)localObject2, (String)localObject1, i);
        }
      }
      Object localObject1 = Fabric.getLogger();
      localObject3 = "Fabric";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "Unexpected meminfo format while computing RAM: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject2);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((Logger)localObject1).d((String)localObject3, (String)localObject4);
    }
  }
  
  private static String hash(InputStream paramInputStream, String paramString)
  {
    Object localObject1;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
      int i = 1024;
      Object localObject2 = new byte[i];
      String str1;
      for (;;)
      {
        int j = paramInputStream.read((byte[])localObject2);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        str1 = null;
        localMessageDigest.update((byte[])localObject2, 0, j);
      }
      String str2;
      return (String)localObject1;
    }
    catch (Exception localException)
    {
      localObject2 = Fabric.getLogger();
      str2 = "Fabric";
      str1 = "Could not calculate hash for app icon.";
      ((Logger)localObject2).e(str2, str1, localException);
      localObject1 = "";
    }
    for (;;)
    {
      localObject1 = ((MessageDigest)localObject1).digest();
      localObject1 = hexify((byte[])localObject1);
    }
  }
  
  private static String hash(String paramString1, String paramString2)
  {
    return hash(paramString1.getBytes(), paramString2);
  }
  
  private static String hash(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      localObject1 = MessageDigest.getInstance(paramString);
      ((MessageDigest)localObject1).update(paramArrayOfByte);
      localObject1 = hexify(((MessageDigest)localObject1).digest());
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        String str2 = "Fabric";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Could not create hashing algorithm: ").append(paramString);
        String str3 = ", returning empty string.";
        localObject2 = str3;
        localLogger.e(str2, (String)localObject2, localNoSuchAlgorithmException);
        String str1 = "";
      }
    }
    return (String)localObject1;
  }
  
  public static String hexify(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[paramArrayOfByte.length * 2];
    int i = 0;
    String str = null;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      char[] arrayOfChar2 = HEX_VALUES;
      int m = j >>> 4;
      int n = arrayOfChar2[m];
      arrayOfChar1[k] = n;
      k = i * 2 + 1;
      arrayOfChar2 = HEX_VALUES;
      j &= 0xF;
      j = arrayOfChar2[j];
      arrayOfChar1[k] = j;
      i += 1;
    }
    str = new java/lang/String;
    str.<init>(arrayOfChar1);
    return str;
  }
  
  public static void hideKeyboard(Context paramContext, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      IBinder localIBinder = paramView.getWindowToken();
      localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
    }
  }
  
  public static boolean isAppDebuggable(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    int i = localApplicationInfo.flags & 0x2;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localApplicationInfo = null;
    }
  }
  
  public static boolean isClsTrace(Context paramContext)
  {
    Boolean localBoolean = clsTrace;
    if (localBoolean == null)
    {
      boolean bool = getBooleanResourceValue(paramContext, "com.crashlytics.Trace", false);
      localBoolean = Boolean.valueOf(bool);
      clsTrace = localBoolean;
    }
    return clsTrace.booleanValue();
  }
  
  public static boolean isDebuggerAttached()
  {
    boolean bool = Debug.isDebuggerConnected();
    if (!bool)
    {
      bool = Debug.waitingForDebugger();
      if (!bool) {
        break label20;
      }
    }
    label20:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isEmulator(Context paramContext)
  {
    String str1 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    String str2 = "sdk";
    String str3 = Build.PRODUCT;
    boolean bool1 = str2.equals(str3);
    boolean bool2;
    if (!bool1)
    {
      str2 = "google_sdk";
      str3 = Build.PRODUCT;
      bool1 = str2.equals(str3);
      if ((!bool1) && (str1 != null)) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      str1 = null;
    }
  }
  
  public static boolean isLoggingEnabled(Context paramContext)
  {
    return false;
  }
  
  public static boolean isNullOrEmpty(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean isRooted(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = isEmulator(paramContext);
    Object localObject = Build.TAGS;
    String str;
    boolean bool3;
    if ((!bool2) && (localObject != null))
    {
      str = "test-keys";
      bool3 = ((String)localObject).contains(str);
      if (!bool3) {}
    }
    for (;;)
    {
      return bool1;
      localObject = new java/io/File;
      str = "/system/app/Superuser.apk";
      ((File)localObject).<init>(str);
      bool3 = ((File)localObject).exists();
      if (!bool3)
      {
        localObject = new java/io/File;
        str = "/system/xbin/su";
        ((File)localObject).<init>(str);
        if (!bool2)
        {
          bool2 = ((File)localObject).exists();
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public static void logControlled(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = isClsTrace(paramContext);
    if (bool)
    {
      Logger localLogger = Fabric.getLogger();
      String str = "Fabric";
      localLogger.log(paramInt, str, paramString2);
    }
  }
  
  public static void logControlled(Context paramContext, String paramString)
  {
    boolean bool = isClsTrace(paramContext);
    if (bool)
    {
      Logger localLogger = Fabric.getLogger();
      String str = "Fabric";
      localLogger.d(str, paramString);
    }
  }
  
  public static void logControlledError(Context paramContext, String paramString, Throwable paramThrowable)
  {
    boolean bool = isClsTrace(paramContext);
    if (bool)
    {
      Logger localLogger = Fabric.getLogger();
      String str = "Fabric";
      localLogger.e(str, paramString);
    }
  }
  
  public static void logOrThrowIllegalArgumentException(String paramString1, String paramString2)
  {
    boolean bool = Fabric.isDebuggable();
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString2);
      throw localIllegalArgumentException;
    }
    Fabric.getLogger().w(paramString1, paramString2);
  }
  
  public static void logOrThrowIllegalStateException(String paramString1, String paramString2)
  {
    boolean bool = Fabric.isDebuggable();
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(paramString2);
      throw localIllegalStateException;
    }
    Fabric.getLogger().w(paramString1, paramString2);
  }
  
  public static String logPriorityToString(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "?";
    }
    for (;;)
    {
      return str;
      str = "A";
      continue;
      str = "D";
      continue;
      str = "E";
      continue;
      str = "I";
      continue;
      str = "V";
      continue;
      str = "W";
    }
  }
  
  public static void openKeyboard(Context paramContext, View paramView)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      IBinder localIBinder = paramView.getWindowToken();
      localInputMethodManager.showSoftInputFromInputMethod(localIBinder, 0);
    }
  }
  
  public static String padWithZerosToMaxIntWidth(int paramInt)
  {
    if (paramInt < 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("value must be zero or greater");
      throw ((Throwable)localObject);
    }
    Object localObject = Locale.US;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return String.format((Locale)localObject, "%1$10s", arrayOfObject).replace(' ', '0');
  }
  
  public static String resolveBuildId(Context paramContext)
  {
    String str1 = null;
    Object localObject1 = "io.fabric.android.build_id";
    String str2 = "string";
    int i = getResourcesIdentifier(paramContext, (String)localObject1, str2);
    if (i == 0)
    {
      localObject1 = "com.crashlytics.android.build_id";
      str2 = "string";
      i = getResourcesIdentifier(paramContext, (String)localObject1, str2);
    }
    if (i != 0)
    {
      str1 = paramContext.getResources().getString(i);
      localObject1 = Fabric.getLogger();
      str2 = "Fabric";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = "Build ID is: ";
      localObject2 = str3 + str1;
      ((Logger)localObject1).d(str2, (String)localObject2);
    }
    return str1;
  }
  
  public static String sha1(InputStream paramInputStream)
  {
    return hash(paramInputStream, "SHA-1");
  }
  
  public static String sha1(String paramString)
  {
    return hash(paramString, "SHA-1");
  }
  
  public static String sha256(String paramString)
  {
    return hash(paramString, "SHA-256");
  }
  
  public static String streamToString(InputStream paramInputStream)
  {
    Object localObject = new java/util/Scanner;
    ((Scanner)localObject).<init>(paramInputStream);
    String str = "\\A";
    localObject = ((Scanner)localObject).useDelimiter(str);
    boolean bool = ((Scanner)localObject).hasNext();
    if (bool) {}
    for (localObject = ((Scanner)localObject).next();; localObject = "") {
      return (String)localObject;
    }
  }
  
  public static boolean stringsEqualIncludingNull(String paramString1, String paramString2)
  {
    boolean bool;
    if (paramString1 == paramString2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramString1 != null) {
        bool = paramString1.equals(paramString2);
      } else {
        bool = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\CommonUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */