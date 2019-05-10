package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(DataSource paramDataSource, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataSource.getDataType();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramDataSource.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataSource.getName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    j = paramDataSource.getType();
    zzb.zzc(paramParcel, 3, j);
    localObject = paramDataSource.getDevice();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramDataSource.zzum();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramDataSource.getStreamName();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSource zzcS(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    Object localObject2 = null;
    String str2 = null;
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
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        localObject3 = DataType.CREATOR;
        localObject5 = (DataType)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localObject2 = Device.CREATOR;
        localObject5 = (Device)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 5: 
        localObject1 = Application.CREATOR;
        localObject5 = (Application)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, m);
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
    Object localObject5 = new com/google/android/gms/fitness/data/DataSource;
    ((DataSource)localObject5).<init>(k, (DataType)localObject3, str2, i, (Device)localObject2, (Application)localObject1, str1);
    return (DataSource)localObject5;
  }
  
  public DataSource[] zzeR(int paramInt)
  {
    return new DataSource[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */