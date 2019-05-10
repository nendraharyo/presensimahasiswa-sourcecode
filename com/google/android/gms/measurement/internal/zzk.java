package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(EventParcel paramEventParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramEventParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramEventParcel.name;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramEventParcel.zzaVV;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramEventParcel.zzaVW;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    long l = paramEventParcel.zzaVX;
    zzb.zza(paramParcel, 5, l);
    zzb.zzI(paramParcel, i);
  }
  
  public EventParcel zzfN(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l = 0L;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject1 = EventParams.CREATOR;
        localObject2 = (EventParams)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        l = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = new com/google/android/gms/measurement/internal/EventParcel;
    ((EventParcel)localObject3).<init>(j, str2, (EventParams)localObject1, str1, l);
    return (EventParcel)localObject3;
  }
  
  public EventParcel[] zziJ(int paramInt)
  {
    return new EventParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */