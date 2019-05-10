package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

class zzpf$4
  extends zzoe.zzc
{
  zzpf$4(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, zzpf.zza paramzza, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzpf.zzc localzzc = new com/google/android/gms/internal/zzpf$zzc;
    Object localObject = this.zzaAn;
    localzzc.<init>(this, (zzpf.zza)localObject, null);
    localObject = (zzop)paramzzoe.zzqJ();
    SensorUnregistrationRequest localSensorUnregistrationRequest = new com/google/android/gms/fitness/request/SensorUnregistrationRequest;
    zzk localzzk = this.zzaAo;
    PendingIntent localPendingIntent = this.zzaAp;
    localSensorUnregistrationRequest.<init>(localzzk, localPendingIntent, localzzc);
    ((zzop)localObject).zza(localSensorUnregistrationRequest);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpf$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */