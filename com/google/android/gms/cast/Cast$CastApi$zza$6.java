package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$6
  extends zzh
{
  Cast$CastApi$zza$6(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    String str = "";
    try
    {
      paramzze.zza(str, this);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */