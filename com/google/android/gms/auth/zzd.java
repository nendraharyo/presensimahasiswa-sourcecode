package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zze;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class zzd
{
  public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
  public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME;
  public static final String KEY_CALLER_UID;
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  private static final ComponentName zzVe;
  private static final ComponentName zzVf;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    if (i >= j)
    {
      localObject = "callerUid";
      KEY_CALLER_UID = (String)localObject;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i < j) {
        break label77;
      }
    }
    label77:
    for (Object localObject = "androidPackageName";; localObject = "androidPackageName")
    {
      KEY_ANDROID_PACKAGE_NAME = (String)localObject;
      localObject = new android/content/ComponentName;
      ((ComponentName)localObject).<init>("com.google.android.gms", "com.google.android.gms.auth.GetToken");
      zzVe = (ComponentName)localObject;
      localObject = new android/content/ComponentName;
      ((ComponentName)localObject).<init>("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
      zzVf = (ComponentName)localObject;
      return;
      localObject = "callerUid";
      break;
    }
  }
  
  public static void clearToken(Context paramContext, String paramString)
  {
    zzx.zzcE("Calling this from your main thread can lead to deadlock");
    zzad(paramContext);
    Object localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    Object localObject2 = paramContext.getApplicationInfo().packageName;
    ((Bundle)localObject1).putString("clientPackageName", (String)localObject2);
    String str = KEY_ANDROID_PACKAGE_NAME;
    boolean bool = ((Bundle)localObject1).containsKey(str);
    if (!bool)
    {
      str = KEY_ANDROID_PACKAGE_NAME;
      ((Bundle)localObject1).putString(str, (String)localObject2);
    }
    localObject2 = new com/google/android/gms/auth/zzd$2;
    ((zzd.2)localObject2).<init>(paramString, (Bundle)localObject1);
    localObject1 = zzVe;
    zza(paramContext, (ComponentName)localObject1, (zzd.zza)localObject2);
  }
  
  public static List getAccountChangeEvents(Context paramContext, int paramInt, String paramString)
  {
    zzx.zzh(paramString, "accountName must be provided");
    zzx.zzcE("Calling this from your main thread can lead to deadlock");
    zzad(paramContext);
    zzd.3 local3 = new com/google/android/gms/auth/zzd$3;
    local3.<init>(paramString, paramInt);
    ComponentName localComponentName = zzVe;
    return (List)zza(paramContext, localComponentName, local3);
  }
  
  public static String getAccountId(Context paramContext, String paramString)
  {
    zzx.zzh(paramString, "accountName must be provided");
    zzx.zzcE("Calling this from your main thread can lead to deadlock");
    zzad(paramContext);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return getToken(paramContext, paramString, "^^_account_id_^^", localBundle);
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return getToken(paramContext, paramAccount, paramString, localBundle);
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return zzc(paramContext, paramAccount, paramString, paramBundle).getToken();
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2)
  {
    Account localAccount = new android/accounts/Account;
    localAccount.<init>(paramString1, "com.google");
    return getToken(paramContext, localAccount, paramString2);
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Account localAccount = new android/accounts/Account;
    localAccount.<init>(paramString1, "com.google");
    return getToken(paramContext, localAccount, paramString2, paramBundle);
  }
  
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  /* Error */
  private static Object zza(Context paramContext, ComponentName paramComponentName, zzd.zza paramzza)
  {
    // Byte code:
    //   0: new 156	com/google/android/gms/common/zza
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 157	com/google/android/gms/common/zza:<init>	()V
    //   8: aload_0
    //   9: invokestatic 163	com/google/android/gms/common/internal/zzl:zzau	(Landroid/content/Context;)Lcom/google/android/gms/common/internal/zzl;
    //   12: astore 4
    //   14: ldc -91
    //   16: astore 5
    //   18: aload 4
    //   20: aload_1
    //   21: aload_3
    //   22: aload 5
    //   24: invokevirtual 168	com/google/android/gms/common/internal/zzl:zza	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   27: istore 6
    //   29: iload 6
    //   31: ifeq +86 -> 117
    //   34: aload_3
    //   35: invokevirtual 172	com/google/android/gms/common/zza:zzoJ	()Landroid/os/IBinder;
    //   38: astore 5
    //   40: aload_2
    //   41: aload 5
    //   43: invokeinterface 178 2 0
    //   48: astore 5
    //   50: aload 4
    //   52: aload_1
    //   53: aload_3
    //   54: ldc -91
    //   56: invokevirtual 182	com/google/android/gms/common/internal/zzl:zzb	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   59: aload 5
    //   61: areturn
    //   62: astore 5
    //   64: ldc -91
    //   66: astore 7
    //   68: ldc -72
    //   70: astore 8
    //   72: aload 7
    //   74: aload 8
    //   76: aload 5
    //   78: invokestatic 190	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: new 192	java/io/IOException
    //   85: astore 7
    //   87: ldc -72
    //   89: astore 8
    //   91: aload 7
    //   93: aload 8
    //   95: aload 5
    //   97: invokespecial 195	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: aload 7
    //   102: athrow
    //   103: astore 5
    //   105: aload 4
    //   107: aload_1
    //   108: aload_3
    //   109: ldc -91
    //   111: invokevirtual 182	com/google/android/gms/common/internal/zzl:zzb	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   114: aload 5
    //   116: athrow
    //   117: new 192	java/io/IOException
    //   120: astore 5
    //   122: aload 5
    //   124: ldc -59
    //   126: invokespecial 199	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   129: aload 5
    //   131: athrow
    //   132: astore 5
    //   134: goto -70 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramContext	Context
    //   0	137	1	paramComponentName	ComponentName
    //   0	137	2	paramzza	zzd.zza
    //   3	106	3	localzza	com.google.android.gms.common.zza
    //   12	94	4	localzzl	com.google.android.gms.common.internal.zzl
    //   16	44	5	localObject1	Object
    //   62	34	5	localInterruptedException	InterruptedException
    //   103	12	5	localObject2	Object
    //   120	10	5	localIOException	IOException
    //   132	1	5	localRemoteException	android.os.RemoteException
    //   27	3	6	bool	boolean
    //   66	35	7	localObject3	Object
    //   70	24	8	str	String
    // Exception table:
    //   from	to	target	type
    //   34	38	62	java/lang/InterruptedException
    //   41	48	62	java/lang/InterruptedException
    //   34	38	103	finally
    //   41	48	103	finally
    //   76	82	103	finally
    //   82	85	103	finally
    //   95	100	103	finally
    //   100	103	103	finally
    //   34	38	132	android/os/RemoteException
    //   41	48	132	android/os/RemoteException
  }
  
  private static void zzad(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.getApplicationContext();
      zze.zzad(localContext);
      return;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      localObject = new com/google/android/gms/auth/GooglePlayServicesAvailabilityException;
      int i = localGooglePlayServicesRepairableException.getConnectionStatusCode();
      String str2 = localGooglePlayServicesRepairableException.getMessage();
      Intent localIntent = localGooglePlayServicesRepairableException.getIntent();
      ((GooglePlayServicesAvailabilityException)localObject).<init>(i, str2, localIntent);
      throw ((Throwable)localObject);
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      Object localObject = new com/google/android/gms/auth/GoogleAuthException;
      String str1 = localGooglePlayServicesNotAvailableException.getMessage();
      ((GoogleAuthException)localObject).<init>(str1);
      throw ((Throwable)localObject);
    }
  }
  
  public static TokenData zzc(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    zzx.zzcE((String)localObject1);
    zzad(paramContext);
    if (paramBundle == null)
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
    }
    for (;;)
    {
      Object localObject2 = paramContext.getApplicationInfo().packageName;
      ((Bundle)localObject1).putString("clientPackageName", (String)localObject2);
      String str = KEY_ANDROID_PACKAGE_NAME;
      str = ((Bundle)localObject1).getString(str);
      boolean bool = TextUtils.isEmpty(str);
      if (bool)
      {
        str = KEY_ANDROID_PACKAGE_NAME;
        ((Bundle)localObject1).putString(str, (String)localObject2);
      }
      long l = SystemClock.elapsedRealtime();
      ((Bundle)localObject1).putLong("service_connection_start_time_millis", l);
      localObject2 = new com/google/android/gms/auth/zzd$1;
      ((zzd.1)localObject2).<init>(paramAccount, paramString, (Bundle)localObject1);
      localObject1 = zzVe;
      return (TokenData)zza(paramContext, (ComponentName)localObject1, (zzd.zza)localObject2);
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>(paramBundle);
    }
  }
  
  static void zzi(Intent paramIntent)
  {
    int i = 1;
    if (paramIntent == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Callback cannot be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = paramIntent.toUri(i);
    int j = 1;
    try
    {
      Intent.parseUri((String)localObject, j);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
      throw localIllegalArgumentException;
    }
  }
  
  private static Object zzm(Object paramObject)
  {
    if (paramObject == null)
    {
      Log.w("GoogleAuthUtil", "Binder call returned null.");
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Service unavailable.");
      throw localIOException;
    }
    return paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */