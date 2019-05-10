package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

class zzpe$2
  extends zzod.zza
{
  zzpe$2(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    super(paramGoogleApiClient);
  }
  
  protected ListSubscriptionsResult zzM(Status paramStatus)
  {
    return ListSubscriptionsResult.zzT(paramStatus);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzpe.zza localzza = new com/google/android/gms/internal/zzpe$zza;
    localzza.<init>(this, null);
    zzoo localzzoo = (zzoo)paramzzod.zzqJ();
    ListSubscriptionsRequest localListSubscriptionsRequest = new com/google/android/gms/fitness/request/ListSubscriptionsRequest;
    DataType localDataType = this.zzaAa;
    localListSubscriptionsRequest.<init>(localDataType, localzza);
    localzzoo.zza(localListSubscriptionsRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */