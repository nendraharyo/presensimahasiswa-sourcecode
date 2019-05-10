package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(InterstitialAdParameterParcel paramInterstitialAdParameterParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramInterstitialAdParameterParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramInterstitialAdParameterParcel.zzql;
    zzb.zza(paramParcel, 2, bool);
    bool = paramInterstitialAdParameterParcel.zzqm;
    zzb.zza(paramParcel, 3, bool);
    String str = paramInterstitialAdParameterParcel.zzqn;
    zzb.zza(paramParcel, 4, str, false);
    bool = paramInterstitialAdParameterParcel.zzqo;
    zzb.zza(paramParcel, 5, bool);
    float f = paramInterstitialAdParameterParcel.zzqp;
    zzb.zza(paramParcel, 6, f);
    zzb.zzI(paramParcel, i);
  }
  
  public InterstitialAdParameterParcel zza(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    String str = null;
    float f = 0.0F;
    boolean bool2 = false;
    boolean bool3 = false;
    StringBuilder localStringBuilder = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        f = zza.zzl(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/ads/internal/InterstitialAdParameterParcel;
    ((InterstitialAdParameterParcel)localObject).<init>(j, bool3, bool2, str, bool1, f);
    return (InterstitialAdParameterParcel)localObject;
  }
  
  public InterstitialAdParameterParcel[] zzg(int paramInt)
  {
    return new InterstitialAdParameterParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */