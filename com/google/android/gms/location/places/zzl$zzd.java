package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zzd
  extends zzl.zzb
{
  public zzl$zzd(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlaceLikelihoodBuffer zzaX(Status paramStatus)
  {
    PlaceLikelihoodBuffer localPlaceLikelihoodBuffer = new com/google/android/gms/location/places/PlaceLikelihoodBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(paramStatus.getStatusCode());
    localPlaceLikelihoodBuffer.<init>(localDataHolder, 100, null);
    return localPlaceLikelihoodBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzl$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */