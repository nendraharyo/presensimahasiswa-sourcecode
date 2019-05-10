package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(DataReadResult paramDataReadResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataReadResult.zzvl();
    zzb.zzd(paramParcel, 1, (List)localObject, false);
    int j = paramDataReadResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataReadResult.getStatus();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramDataReadResult.zzvk();
    zzb.zzd(paramParcel, 3, (List)localObject, false);
    j = paramDataReadResult.zzvj();
    zzb.zzc(paramParcel, 5, j);
    localObject = paramDataReadResult.zzul();
    zzb.zzc(paramParcel, 6, (List)localObject, false);
    localObject = paramDataReadResult.zzvm();
    zzb.zzc(paramParcel, 7, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataReadResult zzdP(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    Object localObject2 = null;
    Object localObject3 = null;
    int k = 0;
    Object localObject4 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      ClassLoader localClassLoader;
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        localClassLoader = getClass().getClassLoader();
        zza.zza(paramParcel, m, localArrayList1, localClassLoader);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject3 = Status.CREATOR;
        localObject5 = (Status)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        localClassLoader = getClass().getClassLoader();
        zza.zza(paramParcel, m, localArrayList2, localClassLoader);
        break;
      case 5: 
        i = zza.zzg(paramParcel, m);
        break;
      case 6: 
        localObject2 = DataSource.CREATOR;
        localObject2 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
        break;
      case 7: 
        localObject1 = DataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + j;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/fitness/result/DataReadResult;
    ((DataReadResult)localObject5).<init>(k, localArrayList1, (Status)localObject3, localArrayList2, i, (List)localObject2, (List)localObject1);
    return (DataReadResult)localObject5;
  }
  
  public DataReadResult[] zzfQ(int paramInt)
  {
    return new DataReadResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */