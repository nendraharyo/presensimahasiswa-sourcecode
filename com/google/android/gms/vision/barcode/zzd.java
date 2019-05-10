package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(Barcode.CalendarEvent paramCalendarEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCalendarEvent.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCalendarEvent.summary;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCalendarEvent.description;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramCalendarEvent.location;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramCalendarEvent.organizer;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramCalendarEvent.status;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramCalendarEvent.start;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramCalendarEvent.end;
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.CalendarEvent zzgZ(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        localObject3 = Barcode.CalendarDateTime.CREATOR;
        localObject4 = (Barcode.CalendarDateTime)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 8: 
        localObject1 = Barcode.CalendarDateTime.CREATOR;
        localObject4 = (Barcode.CalendarDateTime)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/vision/barcode/Barcode$CalendarEvent;
    ((Barcode.CalendarEvent)localObject4).<init>(j, str5, str4, str3, str2, str1, (Barcode.CalendarDateTime)localObject3, (Barcode.CalendarDateTime)localObject1);
    return (Barcode.CalendarEvent)localObject4;
  }
  
  public Barcode.CalendarEvent[] zzkw(int paramInt)
  {
    return new Barcode.CalendarEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */