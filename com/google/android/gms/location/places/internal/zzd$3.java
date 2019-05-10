package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.location.places.zzl.zza;
import com.google.android.gms.maps.model.LatLngBounds;

class zzd$3
  extends zzl.zza
{
  zzd$3(zzd paramzzd, Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    zzl localzzl = new com/google/android/gms/location/places/zzl;
    localzzl.<init>(this);
    String str = this.zzaGh;
    LatLngBounds localLatLngBounds = this.zzaQn;
    AutocompleteFilter localAutocompleteFilter = this.zzaQo;
    paramzze.zza(localzzl, str, localLatLngBounds, localAutocompleteFilter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzd$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */