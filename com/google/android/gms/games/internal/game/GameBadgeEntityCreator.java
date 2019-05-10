package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class GameBadgeEntityCreator
  implements Parcelable.Creator
{
  static void zza(GameBadgeEntity paramGameBadgeEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGameBadgeEntity.getType();
    zzb.zzc(paramParcel, 1, j);
    j = paramGameBadgeEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramGameBadgeEntity.getTitle();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramGameBadgeEntity.getDescription();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramGameBadgeEntity.getIconImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GameBadgeEntity zzen(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    String str1 = null;
    String str2 = null;
    int k = 0;
    Object localObject2 = null;
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
        str2 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        localObject1 = Uri.CREATOR;
        localObject3 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/games/internal/game/GameBadgeEntity;
    ((GameBadgeEntity)localObject3).<init>(k, i, str2, str1, (Uri)localObject1);
    return (GameBadgeEntity)localObject3;
  }
  
  public GameBadgeEntity[] zzgz(int paramInt)
  {
    return new GameBadgeEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameBadgeEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */