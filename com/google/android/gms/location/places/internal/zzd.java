package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;

public class zzd
  implements GeoDataApi
{
  public PendingResult addPlace(GoogleApiClient paramGoogleApiClient, AddPlaceRequest paramAddPlaceRequest)
  {
    zzd.1 local1 = new com/google/android/gms/location/places/internal/zzd$1;
    Api.zzc localzzc = Places.zzaPN;
    local1.<init>(this, localzzc, paramGoogleApiClient, paramAddPlaceRequest);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public PendingResult getAutocompletePredictions(GoogleApiClient paramGoogleApiClient, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    zzd.3 local3 = new com/google/android/gms/location/places/internal/zzd$3;
    Api.zzc localzzc = Places.zzaPN;
    local3.<init>(this, localzzc, paramGoogleApiClient, paramString, paramLatLngBounds, paramAutocompleteFilter);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult getPlaceById(GoogleApiClient paramGoogleApiClient, String... paramVarArgs)
  {
    int i = 1;
    if (paramVarArgs != null)
    {
      int j = paramVarArgs.length;
      if (j < i) {}
    }
    for (;;)
    {
      zzx.zzac(i);
      zzd.2 local2 = new com/google/android/gms/location/places/internal/zzd$2;
      Api.zzc localzzc = Places.zzaPN;
      local2.<init>(this, localzzc, paramGoogleApiClient, paramVarArgs);
      return paramGoogleApiClient.zza(local2);
      i = 0;
      local2 = null;
    }
  }
  
  public PendingResult getPlacePhotos(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzd.4 local4 = new com/google/android/gms/location/places/internal/zzd$4;
    Api.zzc localzzc = Places.zzaPN;
    local4.<init>(this, localzzc, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */