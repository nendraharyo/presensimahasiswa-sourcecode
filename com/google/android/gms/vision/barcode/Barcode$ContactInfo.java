package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$ContactInfo
  implements SafeParcelable
{
  public static final zze CREATOR;
  public Barcode.Address[] addresses;
  public Barcode.Email[] emails;
  public Barcode.PersonName name;
  public String organization;
  public Barcode.Phone[] phones;
  public String title;
  public String[] urls;
  final int versionCode;
  
  static
  {
    zze localzze = new com/google/android/gms/vision/barcode/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  public Barcode$ContactInfo()
  {
    this.versionCode = 1;
  }
  
  public Barcode$ContactInfo(int paramInt, Barcode.PersonName paramPersonName, String paramString1, String paramString2, Barcode.Phone[] paramArrayOfPhone, Barcode.Email[] paramArrayOfEmail, String[] paramArrayOfString, Barcode.Address[] paramArrayOfAddress)
  {
    this.versionCode = paramInt;
    this.name = paramPersonName;
    this.organization = paramString1;
    this.title = paramString2;
    this.phones = paramArrayOfPhone;
    this.emails = paramArrayOfEmail;
    this.urls = paramArrayOfString;
    this.addresses = paramArrayOfAddress;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$ContactInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */