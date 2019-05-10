package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zza
  extends zzl.zzb
{
  public zzl$zza(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected AutocompletePredictionBuffer zzaV(Status paramStatus)
  {
    AutocompletePredictionBuffer localAutocompletePredictionBuffer = new com/google/android/gms/location/places/AutocompletePredictionBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(paramStatus.getStatusCode());
    localAutocompletePredictionBuffer.<init>(localDataHolder);
    return localAutocompletePredictionBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */