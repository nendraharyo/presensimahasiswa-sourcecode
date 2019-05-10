package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$3
  extends Cast.zza
{
  Cast$CastApi$zza$3(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString, LaunchOptions paramLaunchOptions)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    try
    {
      String str = this.zzZI;
      LaunchOptions localLaunchOptions = this.zzZJ;
      paramzze.zza(str, localLaunchOptions, this);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        int i = 2001;
        zzbj(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */