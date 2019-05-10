package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$CalendarDateTime
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public int day;
  public int hours;
  public boolean isUtc;
  public int minutes;
  public int month;
  public String rawValue;
  public int seconds;
  final int versionCode;
  public int year;
  
  static
  {
    zzc localzzc = new com/google/android/gms/vision/barcode/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public Barcode$CalendarDateTime()
  {
    this.versionCode = 1;
  }
  
  public Barcode$CalendarDateTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, String paramString)
  {
    this.versionCode = paramInt1;
    this.year = paramInt2;
    this.month = paramInt3;
    this.day = paramInt4;
    this.hours = paramInt5;
    this.minutes = paramInt6;
    this.seconds = paramInt7;
    this.isUtc = paramBoolean;
    this.rawValue = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$CalendarDateTime.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */