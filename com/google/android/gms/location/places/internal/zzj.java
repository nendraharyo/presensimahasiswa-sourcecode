package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;

public class zzj
  implements PlaceDetectionApi
{
  public PendingResult getCurrentPlace(GoogleApiClient paramGoogleApiClient, PlaceFilter paramPlaceFilter)
  {
    zzj.1 local1 = new com/google/android/gms/location/places/internal/zzj$1;
    Api.zzc localzzc = Places.zzaPO;
    local1.<init>(this, localzzc, paramGoogleApiClient, paramPlaceFilter);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult reportDeviceAtPlace(GoogleApiClient paramGoogleApiClient, PlaceReport paramPlaceReport)
  {
    zzj.2 local2 = new com/google/android/gms/location/places/internal/zzj$2;
    Api.zzc localzzc = Places.zzaPO;
    local2.<init>(this, localzzc, paramGoogleApiClient, paramPlaceReport);
    return paramGoogleApiClient.zzb(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */