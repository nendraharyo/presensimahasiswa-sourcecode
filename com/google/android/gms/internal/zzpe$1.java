package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

class zzpe$1
  extends zzod.zza
{
  zzpe$1(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient)
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
    localListSubscriptionsRequest.<init>(null, localzza);
    localzzoo.zza(localListSubscriptionsRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */