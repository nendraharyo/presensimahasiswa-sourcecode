package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;

class zzpf$2
  extends zzoe.zzc
{
  zzpf$2(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzop localzzop = (zzop)paramzzoe.zzqJ();
    SensorRegistrationRequest localSensorRegistrationRequest = new com/google/android/gms/fitness/request/SensorRegistrationRequest;
    SensorRequest localSensorRequest = this.zzaAj;
    zzk localzzk = this.zzaAk;
    PendingIntent localPendingIntent = this.zzaAl;
    localSensorRegistrationRequest.<init>(localSensorRequest, localzzk, localPendingIntent, localzzph);
    localzzop.zza(localSensorRegistrationRequest);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpf$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */