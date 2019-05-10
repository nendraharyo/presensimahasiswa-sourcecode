package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzg
  implements Parcelable.Creator
{
  static void zza(DataSourceQueryParams paramDataSourceQueryParams, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    DataSource localDataSource = paramDataSourceQueryParams.zzavU;
    zzb.zza(paramParcel, 1, localDataSource, paramInt, false);
    int j = paramDataSourceQueryParams.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    long l = paramDataSourceQueryParams.zzUZ;
    zzb.zza(paramParcel, 2, l);
    l = paramDataSourceQueryParams.zzawk;
    zzb.zza(paramParcel, 3, l);
    l = paramDataSourceQueryParams.zzaAT;
    zzb.zza(paramParcel, 4, l);
    j = paramDataSourceQueryParams.zzaAO;
    zzb.zzc(paramParcel, 5, j);
    j = paramDataSourceQueryParams.zzaAU;
    zzb.zzc(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSourceQueryParams zzdm(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    int k = 0;
    long l2 = l1;
    long l3 = l1;
    int m = 0;
    StringBuilder localStringBuilder = null;
    Object localObject2;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        localObject1 = DataSource.CREATOR;
        localObject2 = (DataSource)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 4: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 5: 
        k = zza.zzg(paramParcel, n);
        break;
      case 6: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = new com/google/android/gms/fitness/request/DataSourceQueryParams;
    ((DataSourceQueryParams)localObject3).<init>(m, (DataSource)localObject1, l3, l2, l1, k, i);
    return (DataSourceQueryParams)localObject3;
  }
  
  public DataSourceQueryParams[] zzfm(int paramInt)
  {
    return new DataSourceQueryParams[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */