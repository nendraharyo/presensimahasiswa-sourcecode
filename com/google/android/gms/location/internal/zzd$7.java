package com.google.android.gms.location.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

class zzd$7
  extends zzd.zza
{
  zzd$7(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationCallback paramLocationCallback, Looper paramLooper)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationRequestInternal localLocationRequestInternal = LocationRequestInternal.zzb(this.zzaOv);
    LocationCallback localLocationCallback = this.zzaOy;
    Looper localLooper = this.zzaOB;
    paramzzl.zza(localLocationRequestInternal, localLocationCallback, localLooper, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */