package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.internal.zzmu;

public final class zzg
{
  public static String zzc(Context paramContext, int paramInt, String paramString)
  {
    int i = 1;
    Object localObject = paramContext.getResources();
    Object[] arrayOfObject;
    switch (paramInt)
    {
    default: 
      int j = R.string.common_google_play_services_unknown_issue;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      localObject = ((Resources)localObject).getString(j, arrayOfObject);
    }
    for (;;)
    {
      return (String)localObject;
      boolean bool = zzmu.zzb((Resources)localObject);
      int k;
      if (bool)
      {
        k = R.string.common_google_play_services_install_text_tablet;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
      }
      else
      {
        k = R.string.common_google_play_services_install_text_phone;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_enable_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_updating_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_update_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_wear_update_text;
        localObject = ((Resources)localObject).getString(k);
        continue;
        k = R.string.common_google_play_services_unsupported_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_network_error_text;
        localObject = ((Resources)localObject).getString(k);
        continue;
        k = R.string.common_google_play_services_invalid_account_text;
        localObject = ((Resources)localObject).getString(k);
        continue;
        k = R.string.common_google_play_services_api_unavailable_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = R.string.common_google_play_services_sign_in_failed_text;
        localObject = ((Resources)localObject).getString(k);
        continue;
        k = R.string.common_google_play_services_restricted_profile_text;
        localObject = ((Resources)localObject).getString(k);
      }
    }
  }
  
  public static final String zzg(Context paramContext, int paramInt)
  {
    int i = 0;
    String str1 = null;
    Object localObject1 = paramContext.getResources();
    Object localObject2;
    switch (paramInt)
    {
    default: 
      localObject1 = "GoogleApiAvailability";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "Unexpected error code ";
      localObject2 = str2 + paramInt;
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return str1;
      i = R.string.common_google_play_services_install_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      i = R.string.common_google_play_services_enable_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      i = R.string.common_google_play_services_updating_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      i = R.string.common_google_play_services_update_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      localObject2 = "Google Play services is invalid. Cannot recover.";
      Log.e("GoogleApiAvailability", (String)localObject2);
      i = R.string.common_google_play_services_unsupported_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      localObject2 = "Network error occurred. Please retry request later.";
      Log.e("GoogleApiAvailability", (String)localObject2);
      i = R.string.common_google_play_services_network_error_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      localObject1 = "GoogleApiAvailability";
      localObject2 = "Internal error occurred. Please see logs for detailed information";
      Log.e((String)localObject1, (String)localObject2);
      continue;
      localObject1 = "GoogleApiAvailability";
      localObject2 = "Developer error occurred. Please see logs for detailed information";
      Log.e((String)localObject1, (String)localObject2);
      continue;
      localObject2 = "An invalid account was specified when connecting. Please provide a valid account.";
      Log.e("GoogleApiAvailability", (String)localObject2);
      i = R.string.common_google_play_services_invalid_account_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      localObject1 = "GoogleApiAvailability";
      localObject2 = "The application is not licensed to the user.";
      Log.e((String)localObject1, (String)localObject2);
      continue;
      localObject1 = "GoogleApiAvailability";
      localObject2 = "One of the API components you attempted to connect to is not available.";
      Log.e((String)localObject1, (String)localObject2);
      continue;
      localObject2 = "The specified account could not be signed in.";
      Log.e("GoogleApiAvailability", (String)localObject2);
      i = R.string.common_google_play_services_sign_in_failed_title;
      str1 = ((Resources)localObject1).getString(i);
      continue;
      localObject2 = "The current user profile is restricted and could not use authenticated features.";
      Log.e("GoogleApiAvailability", (String)localObject2);
      i = R.string.common_google_play_services_restricted_profile_title;
      str1 = ((Resources)localObject1).getString(i);
    }
  }
  
  public static String zzh(Context paramContext, int paramInt)
  {
    Object localObject = paramContext.getResources();
    int i;
    switch (paramInt)
    {
    default: 
      i = 17039370;
      localObject = ((Resources)localObject).getString(i);
    }
    for (;;)
    {
      return (String)localObject;
      i = R.string.common_google_play_services_install_button;
      localObject = ((Resources)localObject).getString(i);
      continue;
      i = R.string.common_google_play_services_enable_button;
      localObject = ((Resources)localObject).getString(i);
      continue;
      i = R.string.common_google_play_services_update_button;
      localObject = ((Resources)localObject).getString(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */