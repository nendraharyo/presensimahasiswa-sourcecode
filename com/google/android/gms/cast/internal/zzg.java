package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(DeviceStatus paramDeviceStatus, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramDeviceStatus.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    double d = paramDeviceStatus.zzok();
    zzb.zza(paramParcel, 2, d);
    boolean bool = paramDeviceStatus.zzot();
    zzb.zza(paramParcel, 3, bool);
    int k = paramDeviceStatus.zzol();
    zzb.zzc(paramParcel, 4, k);
    ApplicationMetadata localApplicationMetadata = paramDeviceStatus.getApplicationMetadata();
    zzb.zza(paramParcel, 5, localApplicationMetadata, paramInt, false);
    k = paramDeviceStatus.zzom();
    zzb.zzc(paramParcel, 6, k);
    zzb.zzI(paramParcel, i);
  }
  
  public DeviceStatus zzae(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    double d = 0.0D;
    Object localObject1 = null;
    int k = 0;
    boolean bool = false;
    int m = 0;
    Object localObject2 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        d = zza.zzn(paramParcel, n);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        localObject1 = ApplicationMetadata.CREATOR;
        localObject3 = (ApplicationMetadata)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 6: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/cast/internal/DeviceStatus;
    ((DeviceStatus)localObject3).<init>(m, d, bool, k, (ApplicationMetadata)localObject1, i);
    return (DeviceStatus)localObject3;
  }
  
  public DeviceStatus[] zzbo(int paramInt)
  {
    return new DeviceStatus[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */