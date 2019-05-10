package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$WiFi
  implements SafeParcelable
{
  public static final zzm CREATOR;
  public static final int OPEN = 1;
  public static final int WEP = 3;
  public static final int WPA = 2;
  public int encryptionType;
  public String password;
  public String ssid;
  final int versionCode;
  
  static
  {
    zzm localzzm = new com/google/android/gms/vision/barcode/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  public Barcode$WiFi()
  {
    this.versionCode = 1;
  }
  
  public Barcode$WiFi(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.ssid = paramString1;
    this.password = paramString2;
    this.encryptionType = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$WiFi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */