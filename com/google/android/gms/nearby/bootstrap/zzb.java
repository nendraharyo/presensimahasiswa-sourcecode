package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Device paramDevice, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    String str = paramDevice.getName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, str, false);
    int j = paramDevice.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    str = paramDevice.getDescription();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, str, false);
    str = paramDevice.getDeviceId();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, str, false);
    j = paramDevice.zzEb();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, j);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public Device zzfP(Parcel paramParcel)
  {
    byte b = 0;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    Object localObject1 = null;
    int j = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        b = zza.zze(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/nearby/bootstrap/Device;
    ((Device)localObject2).<init>(j, (String)localObject1, str2, str1, b);
    return (Device)localObject2;
  }
  
  public Device[] zziL(int paramInt)
  {
    return new Device[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */