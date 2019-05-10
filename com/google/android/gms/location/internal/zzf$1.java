package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

class zzf$1
  extends zzf.zza
{
  zzf$1(zzf paramzzf, GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    GeofencingRequest localGeofencingRequest = this.zzaOD;
    PendingIntent localPendingIntent = this.zzaAp;
    paramzzl.zza(localGeofencingRequest, localPendingIntent, this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */