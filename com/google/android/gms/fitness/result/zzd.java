package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DataSourceStatsResult paramDataSourceStatsResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    DataSource localDataSource = paramDataSourceStatsResult.zzavU;
    zzb.zza(paramParcel, 1, localDataSource, paramInt, false);
    int j = paramDataSourceStatsResult.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    long l = paramDataSourceStatsResult.zzUZ;
    zzb.zza(paramParcel, 2, l);
    boolean bool = paramDataSourceStatsResult.zzaBI;
    zzb.zza(paramParcel, 3, bool);
    l = paramDataSourceStatsResult.zzaBJ;
    zzb.zza(paramParcel, 4, l);
    l = paramDataSourceStatsResult.zzaBK;
    zzb.zza(paramParcel, 5, l);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSourceStatsResult zzdQ(Parcel paramParcel)
  {
    boolean bool = false;
    long l1 = 0L;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    long l2 = l1;
    long l3 = l1;
    int j = 0;
    Object localObject2 = null;
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
        localObject3 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l3 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 4: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 5: 
        l1 = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/result/DataSourceStatsResult;
    ((DataSourceStatsResult)localObject3).<init>(j, (DataSource)localObject1, l3, bool, l2, l1);
    return (DataSourceStatsResult)localObject3;
  }
  
  public DataSourceStatsResult[] zzfR(int paramInt)
  {
    return new DataSourceStatsResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */