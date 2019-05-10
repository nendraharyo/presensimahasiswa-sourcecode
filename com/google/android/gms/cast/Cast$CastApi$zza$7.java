package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$7
  extends zzh
{
  Cast$CastApi$zza$7(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    int i = 2001;
    String str = this.val$sessionId;
    boolean bool = TextUtils.isEmpty(str);
    if (bool)
    {
      str = "IllegalArgument: sessionId cannot be null or empty";
      zze(i, str);
    }
    for (;;)
    {
      return;
      try
      {
        str = this.val$sessionId;
        paramzze.zza(str, this);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        zzbj(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */