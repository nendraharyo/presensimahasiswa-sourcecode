package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;

class zzd$9
  extends zzd.zza
{
  zzd$9(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationListener paramLocationListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationListener localLocationListener = this.zzaOw;
    paramzzl.zza(localLocationListener, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */