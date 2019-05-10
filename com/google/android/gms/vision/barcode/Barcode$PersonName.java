package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$PersonName
  implements SafeParcelable
{
  public static final zzi CREATOR;
  public String first;
  public String formattedName;
  public String last;
  public String middle;
  public String prefix;
  public String pronunciation;
  public String suffix;
  final int versionCode;
  
  static
  {
    zzi localzzi = new com/google/android/gms/vision/barcode/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  public Barcode$PersonName()
  {
    this.versionCode = 1;
  }
  
  public Barcode$PersonName(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.versionCode = paramInt;
    this.formattedName = paramString1;
    this.pronunciation = paramString2;
    this.prefix = paramString3;
    this.first = paramString4;
    this.middle = paramString5;
    this.last = paramString6;
    this.suffix = paramString7;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$PersonName.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */