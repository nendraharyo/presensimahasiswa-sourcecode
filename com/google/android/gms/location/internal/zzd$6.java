package com.google.android.gms.location.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

class zzd$6
  extends zzd.zza
{
  zzd$6(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationRequest localLocationRequest = this.zzaOv;
    LocationListener localLocationListener = this.zzaOw;
    Looper localLooper = this.zzaOB;
    paramzzl.zza(localLocationRequest, localLocationListener, localLooper, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */