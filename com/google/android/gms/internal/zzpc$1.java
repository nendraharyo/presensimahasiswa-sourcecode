package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataInsertRequest;

class zzpc$1
  extends zzob.zzc
{
  zzpc$1(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataSet paramDataSet, boolean paramBoolean)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzom localzzom = (zzom)paramzzob.zzqJ();
    DataInsertRequest localDataInsertRequest = new com/google/android/gms/fitness/request/DataInsertRequest;
    DataSet localDataSet = this.zzazU;
    boolean bool = this.zzazV;
    localDataInsertRequest.<init>(localDataSet, localzzph, bool);
    localzzom.zza(localDataInsertRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */