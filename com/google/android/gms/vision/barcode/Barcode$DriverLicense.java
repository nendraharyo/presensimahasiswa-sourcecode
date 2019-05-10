package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$DriverLicense
  implements SafeParcelable
{
  public static final zzf CREATOR;
  public String addressCity;
  public String addressState;
  public String addressStreet;
  public String addressZip;
  public String birthDate;
  public String documentType;
  public String expiryDate;
  public String firstName;
  public String gender;
  public String issueDate;
  public String issuingCountry;
  public String lastName;
  public String licenseNumber;
  public String middleName;
  final int versionCode;
  
  static
  {
    zzf localzzf = new com/google/android/gms/vision/barcode/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  public Barcode$DriverLicense()
  {
    this.versionCode = 1;
  }
  
  public Barcode$DriverLicense(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14)
  {
    this.versionCode = paramInt;
    this.documentType = paramString1;
    this.firstName = paramString2;
    this.middleName = paramString3;
    this.lastName = paramString4;
    this.gender = paramString5;
    this.addressStreet = paramString6;
    this.addressCity = paramString7;
    this.addressState = paramString8;
    this.addressZip = paramString9;
    this.licenseNumber = paramString10;
    this.issueDate = paramString11;
    this.expiryDate = paramString12;
    this.birthDate = paramString13;
    this.issuingCountry = paramString14;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$DriverLicense.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */