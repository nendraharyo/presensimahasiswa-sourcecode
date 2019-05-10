package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DataPoint paramDataPoint, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataPoint.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramDataPoint.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramDataPoint.getTimestampNanos();
    zzb.zza(paramParcel, 3, l);
    l = paramDataPoint.zzuj();
    zzb.zza(paramParcel, 4, l);
    localObject = paramDataPoint.zzuf();
    zzb.zza(paramParcel, 5, (Parcelable[])localObject, paramInt, false);
    localObject = paramDataPoint.getOriginalDataSource();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    l = paramDataPoint.zzug();
    zzb.zza(paramParcel, 7, l);
    l = paramDataPoint.zzuh();
    zzb.zza(paramParcel, 8, l);
    zzb.zzI(paramParcel, i);
  }
  
  public DataPoint zzcQ(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    Object localObject1 = null;
    long l1 = 0L;
    long l2 = 0L;
    Object localObject2 = null;
    Object localObject3 = null;
    long l3 = 0L;
    long l4 = 0L;
    Object localObject4;
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
        localObject1 = DataSource.CREATOR;
        localObject4 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 4: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 5: 
        localObject2 = Value.CREATOR;
        localObject4 = (Value[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 6: 
        localObject3 = DataSource.CREATOR;
        localObject4 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 7: 
        l3 = zza.zzi(paramParcel, k);
        break;
      case 8: 
        l4 = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject5 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject5, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject5 = new com/google/android/gms/fitness/data/DataPoint;
    ((DataPoint)localObject5).<init>(j, (DataSource)localObject1, l1, l2, (Value[])localObject2, (DataSource)localObject3, l3, l4);
    return (DataPoint)localObject5;
  }
  
  public DataPoint[] zzeP(int paramInt)
  {
    return new DataPoint[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */