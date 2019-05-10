package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.Freezable;

public abstract interface PlacePhotoMetadata
  extends Freezable
{
  public abstract CharSequence getAttributions();
  
  public abstract int getMaxHeight();
  
  public abstract int getMaxWidth();
  
  public abstract PendingResult getPhoto(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult getScaledPhoto(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacePhotoMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */