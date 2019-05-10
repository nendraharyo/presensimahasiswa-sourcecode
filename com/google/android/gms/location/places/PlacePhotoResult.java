package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlacePhotoResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final Bitmap mBitmap;
  final int mVersionCode;
  private final Status zzUX;
  final BitmapTeleporter zzaPG;
  
  static
  {
    zzi localzzi = new com/google/android/gms/location/places/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  PlacePhotoResult(int paramInt, Status paramStatus, BitmapTeleporter paramBitmapTeleporter)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaPG = paramBitmapTeleporter;
    Object localObject = this.zzaPG;
    if (localObject != null) {
      localObject = paramBitmapTeleporter.zzqa();
    }
    for (this.mBitmap = ((Bitmap)localObject);; this.mBitmap = null)
    {
      return;
      localObject = null;
    }
  }
  
  public PlacePhotoResult(Status paramStatus, BitmapTeleporter paramBitmapTeleporter)
  {
    this.mVersionCode = 0;
    this.zzUX = paramStatus;
    this.zzaPG = paramBitmapTeleporter;
    Object localObject = this.zzaPG;
    if (localObject != null) {
      localObject = paramBitmapTeleporter.zzqa();
    }
    for (this.mBitmap = ((Bitmap)localObject);; this.mBitmap = null)
    {
      return;
      localObject = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bitmap getBitmap()
  {
    return this.mBitmap;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.mBitmap;
    return localzza.zzg("bitmap", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlacePhotoResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */