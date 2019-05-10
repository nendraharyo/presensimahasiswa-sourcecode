package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionInsertRequest;

class zzpg$3
  extends zzof.zzc
{
  zzpg$3(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionInsertRequest localSessionInsertRequest1 = new com/google/android/gms/fitness/request/SessionInsertRequest;
    SessionInsertRequest localSessionInsertRequest2 = this.zzaAu;
    localSessionInsertRequest1.<init>(localSessionInsertRequest2, localzzph);
    localzzoq.zza(localSessionInsertRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */