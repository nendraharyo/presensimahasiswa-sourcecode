package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PlacePhotoMetadataResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Status zzUX;
  final DataHolder zzaPE;
  private final PlacePhotoMetadataBuffer zzaPF;
  
  static
  {
    zzh localzzh = new com/google/android/gms/location/places/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  PlacePhotoMetadataResult(int paramInt, Status paramStatus, DataHolder paramDataHolder)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaPE = paramDataHolder;
    PlacePhotoMetadataBuffer localPlacePhotoMetadataBuffer;
    if (paramDataHolder == null) {
      localPlacePhotoMetadataBuffer = null;
    }
    for (this.zzaPF = null;; this.zzaPF = localPlacePhotoMetadataBuffer)
    {
      return;
      localPlacePhotoMetadataBuffer = new com/google/android/gms/location/places/PlacePhotoMetadataBuffer;
      DataHolder localDataHolder = this.zzaPE;
      localPlacePhotoMetadataBuffer.<init>(localDataHolder);
    }
  }
  
  public PlacePhotoMetadataResult(Status paramStatus, DataHolder paramDataHolder)
  {
    this(0, paramStatus, paramDataHolder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PlacePhotoMetadataBuffer getPhotoMetadata()
  {
    return this.zzaPF;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacePhotoMetadataResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */