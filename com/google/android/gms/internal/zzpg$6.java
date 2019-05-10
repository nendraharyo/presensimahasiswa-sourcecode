package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

class zzpg$6
  extends zzof.zzc
{
  zzpg$6(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionUnregistrationRequest localSessionUnregistrationRequest = new com/google/android/gms/fitness/request/SessionUnregistrationRequest;
    PendingIntent localPendingIntent = this.zzaAl;
    localSessionUnregistrationRequest.<init>(localPendingIntent, localzzph);
    localzzoq.zza(localSessionUnregistrationRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */