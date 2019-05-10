package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm
  implements Parcelable.Creator
{
  static void zza(MapValue paramMapValue, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramMapValue.getFormat();
    zzb.zzc(paramParcel, 1, j);
    j = paramMapValue.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    float f = paramMapValue.zzuv();
    zzb.zza(paramParcel, 2, f);
    zzb.zzI(paramParcel, i);
  }
  
  public MapValue zzcX(Parcel paramParcel)
  {
    int i = 0;
    Object localObject = null;
    int j = zza.zzau(paramParcel);
    float f = 0.0F;
    zza.zza localzza = null;
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
        f = zza.zzl(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    MapValue localMapValue = new com/google/android/gms/fitness/data/MapValue;
    localMapValue.<init>(k, i, f);
    return localMapValue;
  }
  
  public MapValue[] zzeW(int paramInt)
  {
    return new MapValue[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */