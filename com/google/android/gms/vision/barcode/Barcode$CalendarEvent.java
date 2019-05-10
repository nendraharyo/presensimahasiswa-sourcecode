package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$CalendarEvent
  implements SafeParcelable
{
  public static final zzd CREATOR;
  public String description;
  public Barcode.CalendarDateTime end;
  public String location;
  public String organizer;
  public Barcode.CalendarDateTime start;
  public String status;
  public String summary;
  final int versionCode;
  
  static
  {
    zzd localzzd = new com/google/android/gms/vision/barcode/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  public Barcode$CalendarEvent()
  {
    this.versionCode = 1;
  }
  
  public Barcode$CalendarEvent(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Barcode.CalendarDateTime paramCalendarDateTime1, Barcode.CalendarDateTime paramCalendarDateTime2)
  {
    this.versionCode = paramInt;
    this.summary = paramString1;
    this.description = paramString2;
    this.location = paramString3;
    this.organizer = paramString4;
    this.status = paramString5;
    this.start = paramCalendarDateTime1;
    this.end = paramCalendarDateTime2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$CalendarEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */