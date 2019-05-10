package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Phone
  implements SafeParcelable
{
  public static final zzj CREATOR;
  public static final int FAX = 3;
  public static final int HOME = 2;
  public static final int MOBILE = 4;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String number;
  public int type;
  final int versionCode;
  
  static
  {
    zzj localzzj = new com/google/android/gms/vision/barcode/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  public Barcode$Phone()
  {
    this.versionCode = 1;
  }
  
  public Barcode$Phone(int paramInt1, int paramInt2, String paramString)
  {
    this.versionCode = paramInt1;
    this.type = paramInt2;
    this.number = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$Phone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */