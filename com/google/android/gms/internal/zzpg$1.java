package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionStartRequest;

class zzpg$1
  extends zzof.zzc
{
  zzpg$1(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, Session paramSession)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionStartRequest localSessionStartRequest = new com/google/android/gms/fitness/request/SessionStartRequest;
    Session localSession = this.zzaAr;
    localSessionStartRequest.<init>(localSession, localzzph);
    localzzoq.zza(localSessionStartRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */