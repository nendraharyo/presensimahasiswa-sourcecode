package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(NearbyDeviceFilter paramNearbyDeviceFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNearbyDeviceFilter.zzbci;
    zzb.zzc(paramParcel, 1, j);
    j = paramNearbyDeviceFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    byte[] arrayOfByte = paramNearbyDeviceFilter.zzbcj;
    zzb.zza(paramParcel, 2, arrayOfByte, false);
    boolean bool = paramNearbyDeviceFilter.zzbck;
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyDeviceFilter zzge(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    Object localObject = null;
    int j = 0;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        j = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject = zza.zzs(paramParcel, m);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    NearbyDeviceFilter localNearbyDeviceFilter = new com/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;
    localNearbyDeviceFilter.<init>(k, j, (byte[])localObject, bool);
    return localNearbyDeviceFilter;
  }
  
  public NearbyDeviceFilter[] zzjj(int paramInt)
  {
    return new NearbyDeviceFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */