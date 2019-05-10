package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;

class zzd$2
  extends zzd.zza
{
  zzd$2(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationCallback paramLocationCallback)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new com/google/android/gms/location/internal/zzd$zzb;
    localzzb.<init>(this);
    LocationCallback localLocationCallback = this.zzaOy;
    paramzzl.zza(localLocationCallback, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */