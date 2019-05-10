package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

class zzpe$4
  extends zzod.zzc
{
  zzpe$4(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoo localzzoo = (zzoo)paramzzod.zzqJ();
    UnsubscribeRequest localUnsubscribeRequest = new com/google/android/gms/fitness/request/UnsubscribeRequest;
    DataType localDataType = this.zzaAa;
    localUnsubscribeRequest.<init>(localDataType, null, localzzph);
    localzzoo.zza(localUnsubscribeRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */