package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

class zzpb$2
  extends zzoa.zza
{
  zzpb$2(zzpb paramzzpb, GoogleApiClient paramGoogleApiClient, String paramString)
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
    DataTypeReadRequest localDataTypeReadRequest = new com/google/android/gms/fitness/request/DataTypeReadRequest;
    String str = this.zzazT;
    localDataTypeReadRequest.<init>(str, localzza);
    localzzol.zza(localDataTypeReadRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpb$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */