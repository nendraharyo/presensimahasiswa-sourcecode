package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode
  implements SafeParcelable
{
  public static final int ALL_FORMATS = 0;
  public static final int AZTEC = 4096;
  public static final int CALENDAR_EVENT = 11;
  public static final int CODABAR = 8;
  public static final int CODE_128 = 1;
  public static final int CODE_39 = 2;
  public static final int CODE_93 = 4;
  public static final int CONTACT_INFO = 1;
  public static final zzb CREATOR;
  public static final int DATA_MATRIX = 16;
  public static final int DRIVER_LICENSE = 12;
  public static final int EAN_13 = 32;
  public static final int EAN_8 = 64;
  public static final int EMAIL = 2;
  public static final int GEO = 10;
  public static final int ISBN = 3;
  public static final int ITF = 128;
  public static final int PDF417 = 2048;
  public static final int PHONE = 4;
  public static final int PRODUCT = 5;
  public static final int QR_CODE = 256;
  public static final int SMS = 6;
  public static final int TEXT = 7;
  public static final int UPC_A = 512;
  public static final int UPC_E = 1024;
  public static final int URL = 8;
  public static final int WIFI = 9;
  public Barcode.CalendarEvent calendarEvent;
  public Barcode.ContactInfo contactInfo;
  public Point[] cornerPoints;
  public String displayValue;
  public Barcode.DriverLicense driverLicense;
  public Barcode.Email email;
  public int format;
  public Barcode.GeoPoint geoPoint;
  public Barcode.Phone phone;
  public String rawValue;
  public Barcode.Sms sms;
  public Barcode.UrlBookmark url;
  public int valueFormat;
  final int versionCode;
  public Barcode.WiFi wifi;
  
  static
  {
    zzb localzzb = new com/google/android/gms/vision/barcode/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  public Barcode()
  {
    this.versionCode = 1;
  }
  
  public Barcode(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, Point[] paramArrayOfPoint, Barcode.Email paramEmail, Barcode.Phone paramPhone, Barcode.Sms paramSms, Barcode.WiFi paramWiFi, Barcode.UrlBookmark paramUrlBookmark, Barcode.GeoPoint paramGeoPoint, Barcode.CalendarEvent paramCalendarEvent, Barcode.ContactInfo paramContactInfo, Barcode.DriverLicense paramDriverLicense)
  {
    this.versionCode = paramInt1;
    this.format = paramInt2;
    this.rawValue = paramString1;
    this.displayValue = paramString2;
    this.valueFormat = paramInt3;
    this.cornerPoints = paramArrayOfPoint;
    this.email = paramEmail;
    this.phone = paramPhone;
    this.sms = paramSms;
    this.wifi = paramWiFi;
    this.url = paramUrlBookmark;
    this.geoPoint = paramGeoPoint;
    this.calendarEvent = paramCalendarEvent;
    this.contactInfo = paramContactInfo;
    this.driverLicense = paramDriverLicense;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Rect getBoundingBox()
  {
    int i = -1 >>> 1;
    int j = -1 << -1;
    int k = 0;
    Rect localRect = null;
    int m = j;
    int n = i;
    for (;;)
    {
      Object localObject = this.cornerPoints;
      int i1 = localObject.length;
      if (k >= i1) {
        break;
      }
      localObject = this.cornerPoints[k];
      int i2 = ((Point)localObject).x;
      n = Math.min(n, i2);
      i2 = ((Point)localObject).x;
      m = Math.max(m, i2);
      i2 = ((Point)localObject).y;
      i = Math.min(i, i2);
      i1 = ((Point)localObject).y;
      j = Math.max(j, i1);
      k += 1;
    }
    localRect = new android/graphics/Rect;
    localRect.<init>(n, i, m, j);
    return localRect;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */