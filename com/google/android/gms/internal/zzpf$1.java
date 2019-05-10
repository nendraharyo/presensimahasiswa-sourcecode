package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

class zzpf$1
  extends zzoe.zza
{
  zzpf$1(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataSourcesResult zzN(Status paramStatus)
  {
    return DataSourcesResult.zzR(paramStatus);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzpf.zzb localzzb = new com/google/android/gms/internal/zzpf$zzb;
    localzzb.<init>(this, null);
    zzop localzzop = (zzop)paramzzoe.zzqJ();
    DataSourcesRequest localDataSourcesRequest1 = new com/google/android/gms/fitness/request/DataSourcesRequest;
    DataSourcesRequest localDataSourcesRequest2 = this.zzaAh;
    localDataSourcesRequest1.<init>(localDataSourcesRequest2, localzzb);
    localzzop.zza(localDataSourcesRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */