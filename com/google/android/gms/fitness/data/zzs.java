package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzs
  implements Parcelable.Creator
{
  static void zza(Subscription paramSubscription, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSubscription.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSubscription.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSubscription.getDataType();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    long l = paramSubscription.zzux();
    zzb.zza(paramParcel, 3, l);
    j = paramSubscription.getAccuracyMode();
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public Subscription zzdd(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    Object localObject2 = null;
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
        localObject2 = DataSource.CREATOR;
        localObject4 = (DataSource)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = DataType.CREATOR;
        localObject4 = (DataType)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 3: 
        l = zza.zzi(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
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
    Object localObject4 = new com/google/android/gms/fitness/data/Subscription;
    ((Subscription)localObject4).<init>(k, (DataSource)localObject2, (DataType)localObject1, l, i);
    return (Subscription)localObject4;
  }
  
  public Subscription[] zzfd(int paramInt)
  {
    return new Subscription[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */