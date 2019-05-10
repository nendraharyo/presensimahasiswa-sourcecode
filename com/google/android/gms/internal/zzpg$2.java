package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.result.SessionStopResult;

class zzpg$2
  extends zzof.zza
{
  zzpg$2(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected SessionStopResult zzO(Status paramStatus)
  {
    return SessionStopResult.zzV(paramStatus);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzpg.zzb localzzb = new com/google/android/gms/internal/zzpg$zzb;
    localzzb.<init>(this, null);
    zzoq localzzoq = (zzoq)paramzzof.zzqJ();
    SessionStopRequest localSessionStopRequest = new com/google/android/gms/fitness/request/SessionStopRequest;
    String str1 = this.val$name;
    String str2 = this.zzaAt;
    localSessionStopRequest.<init>(str1, str2, localzzb);
    localzzoq.zza(localSessionStopRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */