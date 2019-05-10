package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public abstract class zzf$zza
  extends zzl.zzb
{
  public zzf$zza(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlacePhotoResult zzaS(Status paramStatus)
  {
    PlacePhotoResult localPlacePhotoResult = new com/google/android/gms/location/places/PlacePhotoResult;
    localPlacePhotoResult.<init>(paramStatus, null);
    return localPlacePhotoResult;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */