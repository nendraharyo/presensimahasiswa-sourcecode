package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.R.string;

public enum zzd
{
  private final String zzVY;
  private final String zzXj;
  private final int zzXk;
  
  static
  {
    int i = 1;
    Object localObject = new com/google/android/gms/auth/api/signin/zzd;
    int j = R.string.auth_google_play_services_client_google_display_name;
    ((zzd)localObject).<init>("GOOGLE", 0, "google.com", j, "https://accounts.google.com");
    zzXh = (zzd)localObject;
    zzd localzzd1 = new com/google/android/gms/auth/api/signin/zzd;
    int k = R.string.auth_google_play_services_client_facebook_display_name;
    localzzd1.<init>("FACEBOOK", i, "facebook.com", k, "https://www.facebook.com");
    zzXi = localzzd1;
    localObject = new zzd[2];
    zzd localzzd2 = zzXh;
    localObject[0] = localzzd2;
    localzzd2 = zzXi;
    localObject[i] = localzzd2;
    zzXl = (zzd[])localObject;
  }
  
  private zzd(String paramString2, int paramInt1, String paramString3)
  {
    this.zzXj = paramString2;
    this.zzXk = paramInt1;
    this.zzVY = paramString3;
  }
  
  public static zzd zzbL(String paramString)
  {
    Object localObject1;
    int j;
    Object localObject2;
    int k;
    Object localObject3;
    if (paramString != null)
    {
      localObject1 = values();
      int i = localObject1.length;
      j = 0;
      localObject2 = null;
      k = 0;
      localObject3 = null;
      if (k < i)
      {
        localObject2 = localObject1[k];
        String str = ((zzd)localObject2).zzmT();
        boolean bool = str.equals(paramString);
        if (!bool) {}
      }
    }
    for (;;)
    {
      return (zzd)localObject2;
      j = k + 1;
      k = j;
      break;
      localObject2 = "IdProvider";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = "Unrecognized providerId: ";
      localObject3 = (String)localObject1 + paramString;
      Log.w((String)localObject2, (String)localObject3);
      j = 0;
      localObject2 = null;
    }
  }
  
  public String toString()
  {
    return this.zzXj;
  }
  
  public CharSequence zzae(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = this.zzXk;
    return localResources.getString(i);
  }
  
  public String zzmT()
  {
    return this.zzXj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */