package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.fitness.data.DataSource;

public class zzb
  implements Parcelable.Creator
{
  static void zza(FitnessUnregistrationRequest paramFitnessUnregistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    DataSource localDataSource = paramFitnessUnregistrationRequest.getDataSource();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, localDataSource, paramInt, false);
    int j = paramFitnessUnregistrationRequest.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public FitnessUnregistrationRequest zzdg(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
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
        localObject2 = DataSource.CREATOR;
        localObject2 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
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
    FitnessUnregistrationRequest localFitnessUnregistrationRequest = new com/google/android/gms/fitness/internal/service/FitnessUnregistrationRequest;
    localFitnessUnregistrationRequest.<init>(j, (DataSource)localObject2);
    return localFitnessUnregistrationRequest;
  }
  
  public FitnessUnregistrationRequest[] zzfg(int paramInt)
  {
    return new FitnessUnregistrationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\internal\service\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */