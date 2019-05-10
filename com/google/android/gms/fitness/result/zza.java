package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(BleDevicesResult paramBleDevicesResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramBleDevicesResult.getClaimedBleDevices();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramBleDevicesResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramBleDevicesResult.getStatus();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public BleDevicesResult zzdN(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
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
        localObject2 = BleDevice.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = Status.CREATOR;
        localObject1 = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    BleDevicesResult localBleDevicesResult = new com/google/android/gms/fitness/result/BleDevicesResult;
    localBleDevicesResult.<init>(j, (List)localObject2, (Status)localObject1);
    return localBleDevicesResult;
  }
  
  public BleDevicesResult[] zzfO(int paramInt)
  {
    return new BleDevicesResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */