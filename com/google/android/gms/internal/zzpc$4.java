package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;

class zzpc$4
  extends zzob.zza
{
  zzpc$4(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataReadResult zzK(Status paramStatus)
  {
    DataReadRequest localDataReadRequest = this.zzazZ;
    return DataReadResult.zza(paramStatus, localDataReadRequest);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzpc.zza localzza = new com/google/android/gms/internal/zzpc$zza;
    localzza.<init>(this, null);
    zzom localzzom = (zzom)paramzzob.zzqJ();
    DataReadRequest localDataReadRequest1 = new com/google/android/gms/fitness/request/DataReadRequest;
    DataReadRequest localDataReadRequest2 = this.zzazZ;
    localDataReadRequest1.<init>(localDataReadRequest2, localzza);
    localzzom.zza(localDataReadRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */