package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Barcode paramBarcode, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramBarcode.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    j = paramBarcode.format;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    Object localObject = paramBarcode.rawValue;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramBarcode.displayValue;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    j = paramBarcode.valueFormat;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 5, j);
    localObject = paramBarcode.cornerPoints;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (Parcelable[])localObject, paramInt, false);
    localObject = paramBarcode.email;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.phone;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.sms;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.wifi;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.url;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 11, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.geoPoint;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 12, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.calendarEvent;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 13, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.contactInfo;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 14, (Parcelable)localObject, paramInt, false);
    localObject = paramBarcode.driverLicense;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 15, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public Barcode zzgX(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    String str1 = null;
    String str2 = null;
    int m = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        m = zza.zzg(paramParcel, n);
        break;
      case 6: 
        localObject2 = Point.CREATOR;
        localObject12 = (Point[])zza.zzb(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject12;
        break;
      case 7: 
        localObject3 = Barcode.Email.CREATOR;
        localObject12 = (Barcode.Email)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject12;
        break;
      case 8: 
        localObject4 = Barcode.Phone.CREATOR;
        localObject12 = (Barcode.Phone)zza.zza(paramParcel, n, (Parcelable.Creator)localObject4);
        localObject4 = localObject12;
        break;
      case 9: 
        localObject5 = Barcode.Sms.CREATOR;
        localObject12 = (Barcode.Sms)zza.zza(paramParcel, n, (Parcelable.Creator)localObject5);
        localObject5 = localObject12;
        break;
      case 10: 
        localObject6 = Barcode.WiFi.CREATOR;
        localObject12 = (Barcode.WiFi)zza.zza(paramParcel, n, (Parcelable.Creator)localObject6);
        localObject6 = localObject12;
        break;
      case 11: 
        localObject7 = Barcode.UrlBookmark.CREATOR;
        localObject12 = (Barcode.UrlBookmark)zza.zza(paramParcel, n, (Parcelable.Creator)localObject7);
        localObject7 = localObject12;
        break;
      case 12: 
        localObject8 = Barcode.GeoPoint.CREATOR;
        localObject12 = (Barcode.GeoPoint)zza.zza(paramParcel, n, (Parcelable.Creator)localObject8);
        localObject8 = localObject12;
        break;
      case 13: 
        localObject9 = Barcode.CalendarEvent.CREATOR;
        localObject12 = (Barcode.CalendarEvent)zza.zza(paramParcel, n, (Parcelable.Creator)localObject9);
        localObject9 = localObject12;
        break;
      case 14: 
        localObject10 = Barcode.ContactInfo.CREATOR;
        localObject12 = (Barcode.ContactInfo)zza.zza(paramParcel, n, (Parcelable.Creator)localObject10);
        localObject10 = localObject12;
        break;
      case 15: 
        localObject11 = Barcode.DriverLicense.CREATOR;
        localObject12 = (Barcode.DriverLicense)zza.zza(paramParcel, n, (Parcelable.Creator)localObject11);
        localObject11 = localObject12;
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject12 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject12).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject12);
    }
    Object localObject12 = new com/google/android/gms/vision/barcode/Barcode;
    ((Barcode)localObject12).<init>(j, k, str1, str2, m, (Point[])localObject2, (Barcode.Email)localObject3, (Barcode.Phone)localObject4, (Barcode.Sms)localObject5, (Barcode.WiFi)localObject6, (Barcode.UrlBookmark)localObject7, (Barcode.GeoPoint)localObject8, (Barcode.CalendarEvent)localObject9, (Barcode.ContactInfo)localObject10, (Barcode.DriverLicense)localObject11);
    return (Barcode)localObject12;
  }
  
  public Barcode[] zzku(int paramInt)
  {
    return new Barcode[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */