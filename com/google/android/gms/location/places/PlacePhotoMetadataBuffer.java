package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzq;

public class PlacePhotoMetadataBuffer
  extends AbstractDataBuffer
{
  public PlacePhotoMetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public PlacePhotoMetadata get(int paramInt)
  {
    zzq localzzq = new com/google/android/gms/location/places/internal/zzq;
    DataHolder localDataHolder = this.zzahi;
    localzzq.<init>(localDataHolder, paramInt);
    return localzzq;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacePhotoMetadataBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */