package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices.zza;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

class zzq$1
  extends LocationServices.zza
{
  zzq$1(zzq paramzzq, GoogleApiClient paramGoogleApiClient, LocationSettingsRequest paramLocationSettingsRequest, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    LocationSettingsRequest localLocationSettingsRequest = this.zzaPa;
    String str = this.zzaHU;
    paramzzl.zza(localLocationSettingsRequest, this, str);
  }
  
  public LocationSettingsResult zzaR(Status paramStatus)
  {
    LocationSettingsResult localLocationSettingsResult = new com/google/android/gms/location/LocationSettingsResult;
    localLocationSettingsResult.<init>(paramStatus);
    return localLocationSettingsResult;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzq$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */