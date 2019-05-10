package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.ArrayList;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(BleDevice paramBleDevice, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Object localObject = paramBleDevice.getAddress();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramBleDevice.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    localObject = paramBleDevice.getName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramBleDevice.getSupportedProfiles();
    com.google.android.gms.common.internal.safeparcel.zzb.zzb(paramParcel, 3, (List)localObject, false);
    localObject = paramBleDevice.getDataTypes();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, (List)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public BleDevice zzcO(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    ArrayList localArrayList = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 4: 
        localObject1 = DataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject3, paramParcel);
      throw localzza;
    }
    Object localObject3 = new com/google/android/gms/fitness/data/BleDevice;
    ((BleDevice)localObject3).<init>(j, (String)localObject2, str, localArrayList, (List)localObject1);
    return (BleDevice)localObject3;
  }
  
  public BleDevice[] zzeL(int paramInt)
  {
    return new BleDevice[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */