package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;

class zzj$4
  implements GoogleApiClient.OnConnectionFailedListener
{
  zzj$4(zzj paramzzj, zzv paramzzv) {}
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzv localzzv = this.zzaif;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(8);
    localzzv.zza(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */