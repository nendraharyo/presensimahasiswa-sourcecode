package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;

class zzpg$4
  extends zzof.zza
{
  zzpg$4(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected SessionReadResult zzP(Status paramStatus)
  {
    return SessionReadResult.zzU(paramStatus);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzpg.zza localzza = new com/google/android/gms/internal/zzpg$zza;
    localzza.<init>(this, null);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionReadRequest localSessionReadRequest1 = new com/google/android/gms/fitness/request/SessionReadRequest;
    SessionReadRequest localSessionReadRequest2 = this.zzaAv;
    localSessionReadRequest1.<init>(localSessionReadRequest2, localzza);
    localzzoq.zza(localSessionReadRequest1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */