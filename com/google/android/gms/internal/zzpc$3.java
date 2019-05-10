package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataUpdateRequest;

class zzpc$3
  extends zzob.zzc
{
  zzpc$3(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataUpdateRequest paramDataUpdateRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzom localzzom = (zzom)paramzzob.zzqJ();
    DataUpdateRequest localDataUpdateRequest1 = new com/google/android/gms/fitness/request/DataUpdateRequest;
    DataUpdateRequest localDataUpdateRequest2 = this.zzazY;
    localDataUpdateRequest1.<init>(localDataUpdateRequest2, localzzph);
    localzzom.zza(localDataUpdateRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */