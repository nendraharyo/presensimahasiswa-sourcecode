package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.StartBleScanRequest;

class zzpa$1
  extends zznz.zzc
{
  zzpa$1(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzok localzzok = (zzok)paramzznz.zzqJ();
    StartBleScanRequest localStartBleScanRequest1 = new com/google/android/gms/fitness/request/StartBleScanRequest;
    StartBleScanRequest localStartBleScanRequest2 = this.zzazM;
    localStartBleScanRequest1.<init>(localStartBleScanRequest2, localzzph);
    localzzok.zza(localStartBleScanRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */