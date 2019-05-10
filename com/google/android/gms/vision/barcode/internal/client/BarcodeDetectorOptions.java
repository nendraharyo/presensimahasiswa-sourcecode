package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class BarcodeDetectorOptions
  implements SafeParcelable
{
  public static final zza CREATOR;
  final int versionCode;
  public int zzbnw;
  
  static
  {
    zza localzza = new com/google/android/gms/vision/barcode/internal/client/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public BarcodeDetectorOptions()
  {
    this.versionCode = 1;
  }
  
  public BarcodeDetectorOptions(int paramInt1, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.zzbnw = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\BarcodeDetectorOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */