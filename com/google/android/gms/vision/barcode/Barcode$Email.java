package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Email
  implements SafeParcelable
{
  public static final zzg CREATOR;
  public static final int HOME = 2;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String address;
  public String body;
  public String subject;
  public int type;
  final int versionCode;
  
  static
  {
    zzg localzzg = new com/google/android/gms/vision/barcode/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  public Barcode$Email()
  {
    this.versionCode = 1;
  }
  
  public Barcode$Email(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    this.versionCode = paramInt1;
    this.type = paramInt2;
    this.address = paramString1;
    this.subject = paramString2;
    this.body = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$Email.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */