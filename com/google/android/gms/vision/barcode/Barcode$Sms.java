package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Sms
  implements SafeParcelable
{
  public static final zzk CREATOR;
  public String message;
  public String phoneNumber;
  final int versionCode;
  
  static
  {
    zzk localzzk = new com/google/android/gms/vision/barcode/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  public Barcode$Sms()
  {
    this.versionCode = 1;
  }
  
  public Barcode$Sms(int paramInt, String paramString1, String paramString2)
  {
    this.versionCode = paramInt;
    this.message = paramString1;
    this.phoneNumber = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$Sms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */