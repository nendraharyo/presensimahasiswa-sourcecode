package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$1
  extends zzh
{
  Cast$CastApi$zza$1(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    try
    {
      String str1 = this.zzZG;
      String str2 = this.zzzW;
      paramzze.zza(str1, str2, this);
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
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */