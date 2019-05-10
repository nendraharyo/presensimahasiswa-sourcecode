package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Address
  implements SafeParcelable
{
  public static final zza CREATOR;
  public static final int HOME = 2;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String[] addressLines;
  public int type;
  final int versionCode;
  
  static
  {
    zza localzza = new com/google/android/gms/vision/barcode/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public Barcode$Address()
  {
    this.versionCode = 1;
  }
  
  public Barcode$Address(int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    this.versionCode = paramInt1;
    this.type = paramInt2;
    this.addressLines = paramArrayOfString;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$Address.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */