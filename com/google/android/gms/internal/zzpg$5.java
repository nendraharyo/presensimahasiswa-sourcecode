package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;

class zzpg$5
  extends zzof.zzc
{
  zzpg$5(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionRegistrationRequest localSessionRegistrationRequest = new com/google/android/gms/fitness/request/SessionRegistrationRequest;
    PendingIntent localPendingIntent = this.zzaAl;
    int i = this.zzaAw;
    localSessionRegistrationRequest.<init>(localPendingIntent, localzzph, i);
    localzzoq.zza(localSessionRegistrationRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */