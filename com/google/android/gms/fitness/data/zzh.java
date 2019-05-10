package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(DataUpdateNotification paramDataUpdateNotification, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramDataUpdateNotification.zzup();
    zzb.zza(paramParcel, 1, l);
    int j = paramDataUpdateNotification.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    l = paramDataUpdateNotification.zzuq();
    zzb.zza(paramParcel, 2, l);
    j = paramDataUpdateNotification.getOperationType();
    zzb.zzc(paramParcel, 3, j);
    Object localObject = paramDataUpdateNotification.getDataSource();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramDataUpdateNotification.getDataType();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataUpdateNotification zzcU(Parcel paramParcel)
  {
    long l1 = 0L;
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    long l2 = l1;
    int k = 0;
    Object localObject3 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localObject2 = DataSource.CREATOR;
        localObject4 = (DataSource)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        localObject1 = DataType.CREATOR;
        localObject4 = (DataType)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/fitness/data/DataUpdateNotification;
    ((DataUpdateNotification)localObject4).<init>(k, l2, l1, i, (DataSource)localObject2, (DataType)localObject1);
    return (DataUpdateNotification)localObject4;
  }
  
  public DataUpdateNotification[] zzeT(int paramInt)
  {
    return new DataUpdateNotification[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */