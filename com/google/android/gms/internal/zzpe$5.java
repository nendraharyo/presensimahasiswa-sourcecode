package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

class zzpe$5
  extends zzod.zzc
{
  zzpe$5(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoo localzzoo = (zzoo)paramzzod.zzqJ();
    UnsubscribeRequest localUnsubscribeRequest = new com/google/android/gms/fitness/request/UnsubscribeRequest;
    DataSource localDataSource = this.zzaAg;
    localUnsubscribeRequest.<init>(null, localDataSource, localzzph);
    localzzoo.zza(localUnsubscribeRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */