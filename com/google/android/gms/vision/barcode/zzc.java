package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(Barcode.CalendarDateTime paramCalendarDateTime, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCalendarDateTime.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramCalendarDateTime.year;
    zzb.zzc(paramParcel, 2, j);
    j = paramCalendarDateTime.month;
    zzb.zzc(paramParcel, 3, j);
    j = paramCalendarDateTime.day;
    zzb.zzc(paramParcel, 4, j);
    j = paramCalendarDateTime.hours;
    zzb.zzc(paramParcel, 5, j);
    j = paramCalendarDateTime.minutes;
    zzb.zzc(paramParcel, 6, j);
    j = paramCalendarDateTime.seconds;
    zzb.zzc(paramParcel, 7, j);
    boolean bool = paramCalendarDateTime.isUtc;
    zzb.zza(paramParcel, 8, bool);
    String str = paramCalendarDateTime.rawValue;
    zzb.zza(paramParcel, 9, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.CalendarDateTime zzgY(Parcel paramParcel)
  {
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    String str = null;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    StringBuilder localStringBuilder = null;
    int i3 = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i4 = paramParcel.dataPosition();
      if (i4 >= i) {
        break;
      }
      i4 = zza.zzat(paramParcel);
      int i5 = zza.zzca(i4);
      switch (i5)
      {
      default: 
        zza.zzb(paramParcel, i4);
        break;
      case 1: 
        i3 = zza.zzg(paramParcel, i4);
        break;
      case 2: 
        i2 = zza.zzg(paramParcel, i4);
        break;
      case 3: 
        i1 = zza.zzg(paramParcel, i4);
        break;
      case 4: 
        n = zza.zzg(paramParcel, i4);
        break;
      case 5: 
        m = zza.zzg(paramParcel, i4);
        break;
      case 6: 
        k = zza.zzg(paramParcel, i4);
        break;
      case 7: 
        j = zza.zzg(paramParcel, i4);
        break;
      case 8: 
        bool = zza.zzc(paramParcel, i4);
        break;
      case 9: 
        str = zza.zzp(paramParcel, i4);
      }
    }
    int i4 = paramParcel.dataPosition();
    if (i4 != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/vision/barcode/Barcode$CalendarDateTime;
    ((Barcode.CalendarDateTime)localObject).<init>(i3, i2, i1, n, m, k, j, bool, str);
    return (Barcode.CalendarDateTime)localObject;
  }
  
  public Barcode.CalendarDateTime[] zzkv(int paramInt)
  {
    return new Barcode.CalendarDateTime[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */