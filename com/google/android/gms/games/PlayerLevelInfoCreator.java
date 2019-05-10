package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerLevelInfoCreator
  implements Parcelable.Creator
{
  static void zza(PlayerLevelInfo paramPlayerLevelInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramPlayerLevelInfo.getCurrentXpTotal();
    zzb.zza(paramParcel, 1, l);
    int j = paramPlayerLevelInfo.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    l = paramPlayerLevelInfo.getLastLevelUpTimestamp();
    zzb.zza(paramParcel, 2, l);
    PlayerLevel localPlayerLevel = paramPlayerLevelInfo.getCurrentLevel();
    zzb.zza(paramParcel, 3, localPlayerLevel, paramInt, false);
    localPlayerLevel = paramPlayerLevelInfo.getNextLevel();
    zzb.zza(paramParcel, 4, localPlayerLevel, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlayerLevelInfo zzed(Parcel paramParcel)
  {
    long l1 = 0L;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    long l2 = l1;
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
        l2 = zza.zzi(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        localObject3 = PlayerLevel.CREATOR;
        localObject4 = (PlayerLevel)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 4: 
        localObject1 = PlayerLevel.CREATOR;
        localObject4 = (PlayerLevel)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/games/PlayerLevelInfo;
    ((PlayerLevelInfo)localObject4).<init>(j, l2, l1, (PlayerLevel)localObject3, (PlayerLevel)localObject1);
    return (PlayerLevelInfo)localObject4;
  }
  
  public PlayerLevelInfo[] zzgf(int paramInt)
  {
    return new PlayerLevelInfo[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerLevelInfoCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */