package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import java.util.Set;

public class zzj$zzf
  implements GoogleApiClient.zza
{
  public zzj$zzf(zzj paramzzj) {}
  
  public void zza(ConnectionResult paramConnectionResult)
  {
    boolean bool = paramConnectionResult.isSuccess();
    Object localObject;
    if (bool)
    {
      localObject = this.zzalL;
      Set localSet = zzj.zze(this.zzalL);
      ((zzj)localObject).zza(null, localSet);
    }
    for (;;)
    {
      return;
      localObject = zzj.zzf(this.zzalL);
      if (localObject != null)
      {
        localObject = zzj.zzf(this.zzalL);
        ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */