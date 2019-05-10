package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.zza;

public final class zzj$zzh
  extends zzj.zza
{
  public zzj$zzh(zzj paramzzj, int paramInt)
  {
    super(paramzzj, paramInt, null);
  }
  
  protected void zzj(ConnectionResult paramConnectionResult)
  {
    zzj.zzb(this.zzalL).zza(paramConnectionResult);
    this.zzalL.onConnectionFailed(paramConnectionResult);
  }
  
  protected boolean zzqL()
  {
    GoogleApiClient.zza localzza = zzj.zzb(this.zzalL);
    ConnectionResult localConnectionResult = ConnectionResult.zzafB;
    localzza.zza(localConnectionResult);
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */