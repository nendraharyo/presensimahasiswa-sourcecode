package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(FitnessDataSourcesRequest paramFitnessDataSourcesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    List localList = paramFitnessDataSourcesRequest.getDataTypes();
    zzb.zzc(paramParcel, 1, localList, false);
    int j = paramFitnessDataSourcesRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public FitnessDataSourcesRequest zzdf(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = DataType.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    FitnessDataSourcesRequest localFitnessDataSourcesRequest = new com/google/android/gms/fitness/internal/service/FitnessDataSourcesRequest;
    localFitnessDataSourcesRequest.<init>(j, (List)localObject2);
    return localFitnessDataSourcesRequest;
  }
  
  public FitnessDataSourcesRequest[] zzff(int paramInt)
  {
    return new FitnessDataSourcesRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\internal\service\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */