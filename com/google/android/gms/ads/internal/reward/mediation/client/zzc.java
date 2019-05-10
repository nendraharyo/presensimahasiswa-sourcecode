package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(RewardItemParcel paramRewardItemParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRewardItemParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramRewardItemParcel.type;
    zzb.zza(paramParcel, 2, str, false);
    j = paramRewardItemParcel.zzKS;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public RewardItemParcel[] zzO(int paramInt)
  {
    return new RewardItemParcel[paramInt];
  }
  
  public RewardItemParcel zzo(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    Object localObject = null;
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject = zza.zzp(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
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
    RewardItemParcel localRewardItemParcel = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
    localRewardItemParcel.<init>(k, (String)localObject, i);
    return localRewardItemParcel;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\mediation\client\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */