package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerStatsEntityCreator
  implements Parcelable.Creator
{
  static void zza(PlayerStatsEntity paramPlayerStatsEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    float f = paramPlayerStatsEntity.getAverageSessionLength();
    zzb.zza(paramParcel, 1, f);
    int j = paramPlayerStatsEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    f = paramPlayerStatsEntity.getChurnProbability();
    zzb.zza(paramParcel, 2, f);
    j = paramPlayerStatsEntity.getDaysSinceLastPlayed();
    zzb.zzc(paramParcel, 3, j);
    j = paramPlayerStatsEntity.getNumberOfPurchases();
    zzb.zzc(paramParcel, 4, j);
    j = paramPlayerStatsEntity.getNumberOfSessions();
    zzb.zzc(paramParcel, 5, j);
    f = paramPlayerStatsEntity.getSessionPercentile();
    zzb.zza(paramParcel, 6, f);
    f = paramPlayerStatsEntity.getSpendPercentile();
    zzb.zza(paramParcel, 7, f);
    Bundle localBundle = paramPlayerStatsEntity.zzxV();
    zzb.zza(paramParcel, 8, localBundle, false);
    f = paramPlayerStatsEntity.getSpendProbability();
    zzb.zza(paramParcel, 9, f);
    zzb.zzI(paramParcel, i);
  }
  
  public PlayerStatsEntity zzeE(Parcel paramParcel)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = zza.zzau(paramParcel);
    Bundle localBundle = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
    int k = 0;
    int m = 0;
    float f4 = 0.0F;
    StringBuilder localStringBuilder = null;
    float f5 = 0.0F;
    int n = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        f5 = zza.zzl(paramParcel, i1);
        break;
      case 1000: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        f4 = zza.zzl(paramParcel, i1);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        i = zza.zzg(paramParcel, i1);
        break;
      case 6: 
        f3 = zza.zzl(paramParcel, i1);
        break;
      case 7: 
        f2 = zza.zzl(paramParcel, i1);
        break;
      case 8: 
        localBundle = zza.zzr(paramParcel, i1);
        break;
      case 9: 
        f1 = zza.zzl(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/games/stats/PlayerStatsEntity;
    ((PlayerStatsEntity)localObject).<init>(n, f5, f4, m, k, i, f3, f2, localBundle, f1);
    return (PlayerStatsEntity)localObject;
  }
  
  public PlayerStatsEntity[] zzgW(int paramInt)
  {
    return new PlayerStatsEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\PlayerStatsEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */