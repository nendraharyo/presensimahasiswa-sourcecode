package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

class zzd$1
  extends zzd.zza
{
  zzd$1(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationRequest localLocationRequest = this.zzaOv;
    LocationListener localLocationListener = this.zzaOw;
    paramzzl.zza(localLocationRequest, localLocationListener, null, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */