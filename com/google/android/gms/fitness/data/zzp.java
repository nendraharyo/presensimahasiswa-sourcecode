package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzp
  implements Parcelable.Creator
{
  static void zza(RawDataSet paramRawDataSet, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRawDataSet.zzaxg;
    zzb.zzc(paramParcel, 1, j);
    j = paramRawDataSet.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    j = paramRawDataSet.zzaxi;
    zzb.zzc(paramParcel, 2, j);
    List localList = paramRawDataSet.zzaxj;
    zzb.zzc(paramParcel, 3, localList, false);
    boolean bool = paramRawDataSet.zzawi;
    zzb.zza(paramParcel, 4, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public RawDataSet zzda(Parcel paramParcel)
  {
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    int j = 0;
    int k = 0;
    StringBuilder localStringBuilder = null;
    int m = 0;
    zza.zza localzza = null;
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
        k = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        break;
      case 3: 
        localObject1 = RawDataPoint.CREATOR;
        localObject1 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject1);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/fitness/data/RawDataSet;
    ((RawDataSet)localObject2).<init>(m, k, j, (List)localObject1, bool);
    return (RawDataSet)localObject2;
  }
  
  public RawDataSet[] zzeZ(int paramInt)
  {
    return new RawDataSet[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */