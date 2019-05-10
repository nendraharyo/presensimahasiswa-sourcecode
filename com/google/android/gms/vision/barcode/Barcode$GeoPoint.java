package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$GeoPoint
  implements SafeParcelable
{
  public static final zzh CREATOR;
  public double lat;
  public double lng;
  final int versionCode;
  
  static
  {
    zzh localzzh = new com/google/android/gms/vision/barcode/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  public Barcode$GeoPoint()
  {
    this.versionCode = 1;
  }
  
  public Barcode$GeoPoint(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.versionCode = paramInt;
    this.lat = paramDouble1;
    this.lng = paramDouble2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$GeoPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */