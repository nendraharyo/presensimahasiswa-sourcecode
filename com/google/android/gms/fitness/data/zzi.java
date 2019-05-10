package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(Device paramDevice, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramDevice.getManufacturer();
    zzb.zza(paramParcel, 1, str, false);
    int j = paramDevice.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    str = paramDevice.getModel();
    zzb.zza(paramParcel, 2, str, false);
    str = paramDevice.getVersion();
    zzb.zza(paramParcel, 3, str, false);
    str = paramDevice.zzut();
    zzb.zza(paramParcel, 4, str, false);
    j = paramDevice.getType();
    zzb.zzc(paramParcel, 5, j);
    j = paramDevice.zzur();
    zzb.zzc(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
  
  public Device zzcV(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    String str2 = null;
    String str3 = null;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        k = zza.zzg(paramParcel, n);
        break;
      case 6: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/fitness/data/Device;
    ((Device)localObject2).<init>(m, (String)localObject1, str3, str2, str1, k, i);
    return (Device)localObject2;
  }
  
  public Device[] zzeU(int paramInt)
  {
    return new Device[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */