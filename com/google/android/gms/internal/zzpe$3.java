package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.SubscribeRequest;

class zzpe$3
  extends zzod.zzc
{
  zzpe$3(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoo localzzoo = (zzoo)paramzzod.zzqJ();
    SubscribeRequest localSubscribeRequest = new com/google/android/gms/fitness/request/SubscribeRequest;
    Subscription localSubscription = this.zzaAf;
    localSubscribeRequest.<init>(localSubscription, false, localzzph);
    localzzoo.zza(localSubscribeRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */