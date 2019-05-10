package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zzc
  extends zzl.zzb
{
  public zzl$zzc(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlaceBuffer zzaW(Status paramStatus)
  {
    PlaceBuffer localPlaceBuffer = new com/google/android/gms/location/places/PlaceBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(paramStatus.getStatusCode());
    localPlaceBuffer.<init>(localDataHolder, null);
    return localPlaceBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzl$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */