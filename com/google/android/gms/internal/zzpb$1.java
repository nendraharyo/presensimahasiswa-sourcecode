package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

class zzpb$1
  extends zzoa.zza
{
  zzpb$1(zzpb paramzzpb, GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataTypeResult zzJ(Status paramStatus)
  {
    return DataTypeResult.zzS(paramStatus);
  }
  
  protected void zza(zzoa paramzzoa)
  {
    zzpb.zza localzza = new com/google/android/gms/internal/zzpb$zza;
    localzza.<init>(this, null);
    zzol localzzol = (zzol)paramzzoa.zzqJ();
    DataTypeCreateRequest localDataTypeCreateRequest1 = new com/google/android/gms/fitness/request/DataTypeCreateRequest;
    DataTypeCreateRequest localDataTypeCreateRequest2 = this.zzazR;
    localDataTypeCreateRequest1.<init>(localDataTypeCreateRequest2, localzza);
    localzzol.zza(localDataTypeCreateRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */