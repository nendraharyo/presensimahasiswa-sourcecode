package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StopBleScanRequest;

class zzpa$2
  extends zznz.zzc
{
  zzpa$2(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzok localzzok = (zzok)paramzznz.zzqJ();
    StopBleScanRequest localStopBleScanRequest = new com/google/android/gms/fitness/request/StopBleScanRequest;
    BleScanCallback localBleScanCallback = this.zzazO;
    localStopBleScanRequest.<init>(localBleScanCallback, localzzph);
    localzzok.zza(localStopBleScanRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */