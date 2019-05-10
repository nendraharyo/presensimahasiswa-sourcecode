package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class AppInviteReferral
{
  public static Intent addPlayStoreReferrerToIntent(Intent paramIntent1, Intent paramIntent2)
  {
    Bundle localBundle = zzh(paramIntent1);
    if ((localBundle != null) && (paramIntent2 != null))
    {
      String str = "com.google.android.gms.appinvite.REFERRAL_BUNDLE";
      paramIntent2.putExtra(str, localBundle);
    }
    return paramIntent2;
  }
  
  public static Intent addReferralDataToIntent(String paramString1, String paramString2, Intent paramIntent)
  {
    if (paramIntent == null) {}
    Bundle localBundle;
    for (Intent localIntent = null;; localIntent = paramIntent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", localBundle))
    {
      return localIntent;
      localBundle = zza(paramString1, paramString2, false);
    }
  }
  
  public static String getDeepLink(Intent paramIntent)
  {
    String str;
    if (paramIntent != null)
    {
      localObject = paramIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
      if (localObject != null) {
        str = "com.google.android.gms.appinvite.DEEP_LINK";
      }
    }
    for (Object localObject = ((Bundle)localObject).getString(str);; localObject = null) {
      return (String)localObject;
    }
  }
  
  public static String getInvitationId(Intent paramIntent)
  {
    String str;
    if (paramIntent != null)
    {
      localObject = paramIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
      if (localObject != null) {
        str = "com.google.android.gms.appinvite.INVITATION_ID";
      }
    }
    for (Object localObject = ((Bundle)localObject).getString(str);; localObject = null) {
      return (String)localObject;
    }
  }
  
  public static boolean hasReferral(Intent paramIntent)
  {
    Bundle localBundle;
    boolean bool;
    if (paramIntent != null)
    {
      localBundle = paramIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
      if (localBundle != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localBundle = null;
    }
  }
  
  public static boolean isOpenedFromPlayStore(Intent paramIntent)
  {
    boolean bool1 = false;
    boolean bool2 = hasReferral(paramIntent);
    if (bool2)
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
      String str = "com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE";
      bool2 = localBundle.getBoolean(str, false);
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static Bundle zza(String paramString1, String paramString2, boolean paramBoolean)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("com.google.android.gms.appinvite.INVITATION_ID", paramString1);
    localBundle.putString("com.google.android.gms.appinvite.DEEP_LINK", paramString2);
    localBundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", paramBoolean);
    return localBundle;
  }
  
  private static Bundle zzh(Intent paramIntent)
  {
    boolean bool1 = false;
    Bundle localBundle = null;
    String str1;
    Object localObject1;
    if (paramIntent != null)
    {
      str1 = paramIntent.getAction();
      localObject1 = "com.android.vending.INSTALL_REFERRER";
      boolean bool2 = str1.equals(localObject1);
      if (bool2)
      {
        str1 = paramIntent.getStringExtra("referrer");
        if (str1 != null) {
          break label43;
        }
      }
    }
    for (;;)
    {
      return localBundle;
      label43:
      str1 = paramIntent.getStringExtra("referrer");
      localObject1 = "UTF-8";
      Object localObject2;
      String str2;
      try
      {
        str1 = URLDecoder.decode(str1, (String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = Uri.parse("s://a.b.c?" + str1);
        localObject2 = ((Uri)localObject1).getQueryParameter("invitation_id");
        str3 = "deep_link_id";
        localObject1 = ((Uri)localObject1).getQueryParameter(str3);
        if ((localObject2 != null) || (localObject1 != null)) {
          break label218;
        }
        localObject1 = "AppInviteRef";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str3 = "Missing  Referrer query params: ";
        localObject2 = ((StringBuilder)localObject2).append(str3);
        str1 = str1;
        Log.w((String)localObject1, str1);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        str2 = "AppInviteRef";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str3 = "Error parsing Play Store referrer URL: ";
        localObject2 = ((StringBuilder)localObject2).append(str3);
        str1 = str1;
        Log.e(str2, str1);
      }
      continue;
      label218:
      bool1 = true;
      localBundle = zza((String)localObject2, str2, bool1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\AppInviteReferral.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */