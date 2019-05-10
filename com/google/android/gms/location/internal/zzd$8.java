package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

class zzd$8
  extends zzd.zza
{
  zzd$8(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationRequest localLocationRequest = this.zzaOv;
    PendingIntent localPendingIntent = this.zzaOq;
    paramzzl.zza(localLocationRequest, localPendingIntent, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */