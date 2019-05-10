package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;

class zzpc$5
  extends zzob.zza
{
  zzpc$5(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    super(paramGoogleApiClient);
  }
  
  protected DailyTotalResult zzL(Status paramStatus)
  {
    DataType localDataType = this.zzaAa;
    return DailyTotalResult.zza(paramStatus, localDataType);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzpc.5.1 local1 = new com/google/android/gms/internal/zzpc$5$1;
    local1.<init>(this);
    DailyTotalRequest localDailyTotalRequest = new com/google/android/gms/fitness/request/DailyTotalRequest;
    DataType localDataType = this.zzaAa;
    localDailyTotalRequest.<init>(local1, localDataType);
    ((zzom)paramzzob.zzqJ()).zza(localDailyTotalRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */