package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzg
  implements Parcelable.Creator
{
  static void zza(DataType paramDataType, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataType.getName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramDataType.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataType.getFields();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataType zzcT(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
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
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = Field.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    DataType localDataType = new com/google/android/gms/fitness/data/DataType;
    localDataType.<init>(j, (String)localObject2, (List)localObject1);
    return localDataType;
  }
  
  public DataType[] zzeS(int paramInt)
  {
    return new DataType[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */