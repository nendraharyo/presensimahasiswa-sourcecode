package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public abstract class zzf$zzb
  extends zzl.zzb
{
  public zzf$zzb(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlacePhotoMetadataResult zzaT(Status paramStatus)
  {
    PlacePhotoMetadataResult localPlacePhotoMetadataResult = new com/google/android/gms/location/places/PlacePhotoMetadataResult;
    localPlacePhotoMetadataResult.<init>(paramStatus, null);
    return localPlacePhotoMetadataResult;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzf$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */