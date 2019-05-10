package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PlayerLevelCreator
  implements Parcelable.Creator
{
  static void zza(PlayerLevel paramPlayerLevel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPlayerLevel.getLevelNumber();
    zzb.zzc(paramParcel, 1, j);
    j = paramPlayerLevel.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramPlayerLevel.getMinXp();
    zzb.zza(paramParcel, 2, l);
    l = paramPlayerLevel.getMaxXp();
    zzb.zza(paramParcel, 3, l);
    zzb.zzI(paramParcel, i);
  }
  
  public PlayerLevel zzec(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l2 = l1;
    int k = 0;
    StringBuilder localStringBuilder = null;
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
        l2 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + j;
      ((zza.zza)localObject).<init>(str, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/games/PlayerLevel;
    ((PlayerLevel)localObject).<init>(k, i, l2, l1);
    return (PlayerLevel)localObject;
  }
  
  public PlayerLevel[] zzge(int paramInt)
  {
    return new PlayerLevel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerLevelCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */