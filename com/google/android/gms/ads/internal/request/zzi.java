package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(CapabilityParcel paramCapabilityParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCapabilityParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramCapabilityParcel.zzIn;
    zzb.zza(paramParcel, 2, bool);
    bool = paramCapabilityParcel.zzIo;
    zzb.zza(paramParcel, 3, bool);
    bool = paramCapabilityParcel.zzIp;
    zzb.zza(paramParcel, 4, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public CapabilityParcel[] zzI(int paramInt)
  {
    return new CapabilityParcel[paramInt];
  }
  
  public CapabilityParcel zzk(Parcel paramParcel)
  {
    boolean bool1 = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Object localObject = null;
    boolean bool3 = false;
    int j = 0;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    CapabilityParcel localCapabilityParcel = new com/google/android/gms/ads/internal/request/CapabilityParcel;
    localCapabilityParcel.<init>(j, bool3, bool2, bool1);
    return localCapabilityParcel;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */