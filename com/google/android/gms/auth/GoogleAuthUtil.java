package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public final class GoogleAuthUtil
  extends zzd
{
  public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
  public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME = zzd.KEY_ANDROID_PACKAGE_NAME;
  public static final String KEY_CALLER_UID = zzd.KEY_CALLER_UID;
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  
  public static void clearToken(Context paramContext, String paramString)
  {
    zzd.clearToken(paramContext, paramString);
  }
  
  public static List getAccountChangeEvents(Context paramContext, int paramInt, String paramString)
  {
    return zzd.getAccountChangeEvents(paramContext, paramInt, paramString);
  }
  
  public static String getAccountId(Context paramContext, String paramString)
  {
    return zzd.getAccountId(paramContext, paramString);
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString)
  {
    return zzd.getToken(paramContext, paramAccount, paramString);
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return zzd.getToken(paramContext, paramAccount, paramString, paramBundle);
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2)
  {
    return zzd.getToken(paramContext, paramString1, paramString2);
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    return zzd.getToken(paramContext, paramString1, paramString2, paramBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    return zza(paramContext, paramAccount, paramString, paramBundle).getToken();
  }
  
  public static String getTokenWithNotification(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle, Intent paramIntent)
  {
    zzi(paramIntent);
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    paramBundle.putParcelable("callback_intent", paramIntent);
    paramBundle.putBoolean("handle_notification", true);
    return zzb(paramContext, paramAccount, paramString, paramBundle).getToken();
  }
  
  public static String getTokenWithNotification(Context paramContext, Account paramAccount, String paramString1, Bundle paramBundle1, String paramString2, Bundle paramBundle2)
  {
    String str = "Authority cannot be empty or null.";
    zzx.zzh(paramString2, str);
    if (paramBundle1 == null)
    {
      paramBundle1 = new android/os/Bundle;
      paramBundle1.<init>();
    }
    if (paramBundle2 == null)
    {
      paramBundle2 = new android/os/Bundle;
      paramBundle2.<init>();
    }
    ContentResolver.validateSyncExtrasBundle(paramBundle2);
    paramBundle1.putString("authority", paramString2);
    paramBundle1.putBundle("sync_extras", paramBundle2);
    paramBundle1.putBoolean("handle_notification", true);
    return zzb(paramContext, paramAccount, paramString1, paramBundle1).getToken();
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Account localAccount = new android/accounts/Account;
    localAccount.<init>(paramString1, "com.google");
    return getTokenWithNotification(paramContext, localAccount, paramString2, paramBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, Intent paramIntent)
  {
    Account localAccount = new android/accounts/Account;
    localAccount.<init>(paramString1, "com.google");
    return getTokenWithNotification(paramContext, localAccount, paramString2, paramBundle, paramIntent);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle1, String paramString3, Bundle paramBundle2)
  {
    Account localAccount = new android/accounts/Account;
    localAccount.<init>(paramString1, "com.google");
    return getTokenWithNotification(paramContext, localAccount, paramString2, paramBundle1, paramString3, paramBundle2);
  }
  
  public static void invalidateToken(Context paramContext, String paramString)
  {
    zzd.invalidateToken(paramContext, paramString);
  }
  
  public static TokenData zza(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    paramBundle.putBoolean("handle_notification", true);
    return zzb(paramContext, paramAccount, paramString, paramBundle);
  }
  
  private static TokenData zzb(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    try
    {
      localObject = zzc(paramContext, paramAccount, paramString, paramBundle);
      GooglePlayServicesUtil.zzal(paramContext);
      return (TokenData)localObject;
    }
    catch (GooglePlayServicesAvailabilityException localGooglePlayServicesAvailabilityException)
    {
      GooglePlayServicesUtil.showErrorNotification(localGooglePlayServicesAvailabilityException.getConnectionStatusCode(), paramContext);
      Object localObject = new com/google/android/gms/auth/UserRecoverableNotifiedException;
      ((UserRecoverableNotifiedException)localObject).<init>("User intervention required. Notification has been pushed.");
      throw ((Throwable)localObject);
    }
    catch (UserRecoverableAuthException localUserRecoverableAuthException)
    {
      GooglePlayServicesUtil.zzal(paramContext);
      UserRecoverableNotifiedException localUserRecoverableNotifiedException = new com/google/android/gms/auth/UserRecoverableNotifiedException;
      localUserRecoverableNotifiedException.<init>("User intervention required. Notification has been pushed.");
      throw localUserRecoverableNotifiedException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\GoogleAuthUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */