package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(NearbyDeviceId paramNearbyDeviceId, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNearbyDeviceId.getType();
    zzb.zzc(paramParcel, 1, j);
    j = paramNearbyDeviceId.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    byte[] arrayOfByte = paramNearbyDeviceId.zzbbY;
    zzb.zza(paramParcel, 2, arrayOfByte, false);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyDeviceId zzgf(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
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
        i = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject2 = zza.zzs(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    NearbyDeviceId localNearbyDeviceId = new com/google/android/gms/nearby/messages/devices/NearbyDeviceId;
    localNearbyDeviceId.<init>(k, i, (byte[])localObject2);
    return localNearbyDeviceId;
  }
  
  public NearbyDeviceId[] zzjk(int paramInt)
  {
    return new NearbyDeviceId[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */