package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zze
  implements Parcelable.Creator
{
  static void zza(DataSet paramDataSet, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataSet.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramDataSet.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataSet.getDataType();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramDataSet.zzuk();
    zzb.zzd(paramParcel, 3, (List)localObject, false);
    localObject = paramDataSet.zzul();
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    boolean bool = paramDataSet.zzuc();
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSet zzcR(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = null;
    Object localObject3 = null;
    int j = 0;
    Object localObject4 = null;
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
        localObject3 = DataSource.CREATOR;
        localObject5 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = DataType.CREATOR;
        localObject5 = (DataType)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 3: 
        ClassLoader localClassLoader = getClass().getClassLoader();
        zza.zza(paramParcel, k, localArrayList, localClassLoader);
        break;
      case 4: 
        localObject1 = DataSource.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/fitness/data/DataSet;
    ((DataSet)localObject5).<init>(j, (DataSource)localObject3, (DataType)localObject2, localArrayList, (List)localObject1, bool);
    return (DataSet)localObject5;
  }
  
  public DataSet[] zzeQ(int paramInt)
  {
    return new DataSet[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */