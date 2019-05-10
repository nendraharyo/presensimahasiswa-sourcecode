package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataDeleteRequest;

class zzpc$2
  extends zzob.zzc
{
  zzpc$2(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzom localzzom = (zzom)paramzzob.zzqJ();
    DataDeleteRequest localDataDeleteRequest1 = new com/google/android/gms/fitness/request/DataDeleteRequest;
    DataDeleteRequest localDataDeleteRequest2 = this.zzazX;
    localDataDeleteRequest1.<init>(localDataDeleteRequest2, localzzph);
    localzzom.zza(localDataDeleteRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */