package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$4
  extends Cast.zza
{
  Cast$CastApi$zza$4(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, JoinOptions paramJoinOptions)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    try
    {
      String str1 = this.zzZI;
      String str2 = this.val$sessionId;
      JoinOptions localJoinOptions = this.zzZK;
      paramzze.zza(str1, str2, localJoinOptions, this);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */