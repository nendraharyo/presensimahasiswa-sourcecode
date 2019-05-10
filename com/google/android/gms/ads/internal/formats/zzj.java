package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNativeAdOptionsParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool1 = paramNativeAdOptionsParcel.zzyA;
    zzb.zza(paramParcel, 2, bool1);
    int k = paramNativeAdOptionsParcel.zzyB;
    zzb.zzc(paramParcel, 3, k);
    boolean bool2 = paramNativeAdOptionsParcel.zzyC;
    zzb.zza(paramParcel, 4, bool2);
    zzb.zzI(paramParcel, i);
  }
  
  public NativeAdOptionsParcel zze(Parcel paramParcel)
  {
    boolean bool1 = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
    boolean bool2 = false;
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
        break;
      case 4: 
        bool1 = zza.zzc(paramParcel, m);
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
    NativeAdOptionsParcel localNativeAdOptionsParcel = new com/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
    localNativeAdOptionsParcel.<init>(k, bool2, j, bool1);
    return localNativeAdOptionsParcel;
  }
  
  public NativeAdOptionsParcel[] zzp(int paramInt)
  {
    return new NativeAdOptionsParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */