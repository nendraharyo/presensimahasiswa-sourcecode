package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class PlayerEntityCreator
  implements Parcelable.Creator
{
  static void zza(PlayerEntity paramPlayerEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPlayerEntity.getPlayerId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    localObject = paramPlayerEntity.getDisplayName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramPlayerEntity.getIconImageUri();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramPlayerEntity.getHiResImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    long l = paramPlayerEntity.getRetrievedTimestamp();
    zzb.zza(paramParcel, 5, l);
    int j = paramPlayerEntity.zzvG();
    zzb.zzc(paramParcel, 6, j);
    l = paramPlayerEntity.getLastPlayedWithTimestamp();
    zzb.zza(paramParcel, 7, l);
    localObject = paramPlayerEntity.getIconImageUrl();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramPlayerEntity.getHiResImageUrl();
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramPlayerEntity.getTitle();
    zzb.zza(paramParcel, 14, (String)localObject, false);
    localObject = paramPlayerEntity.zzvI();
    zzb.zza(paramParcel, 15, (Parcelable)localObject, paramInt, false);
    localObject = paramPlayerEntity.getLevelInfo();
    zzb.zza(paramParcel, 16, (Parcelable)localObject, paramInt, false);
    j = paramPlayerEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramPlayerEntity.zzvF();
    zzb.zza(paramParcel, 19, bool);
    bool = paramPlayerEntity.zzvH();
    zzb.zza(paramParcel, 18, bool);
    localObject = paramPlayerEntity.getName();
    zzb.zza(paramParcel, 21, (String)localObject, false);
    localObject = paramPlayerEntity.zzvE();
    zzb.zza(paramParcel, 20, (String)localObject, false);
    localObject = paramPlayerEntity.getBannerImageLandscapeUrl();
    zzb.zza(paramParcel, 23, (String)localObject, false);
    localObject = paramPlayerEntity.getBannerImageLandscapeUri();
    zzb.zza(paramParcel, 22, (Parcelable)localObject, paramInt, false);
    localObject = paramPlayerEntity.getBannerImagePortraitUrl();
    zzb.zza(paramParcel, 25, (String)localObject, false);
    localObject = paramPlayerEntity.getBannerImagePortraitUri();
    zzb.zza(paramParcel, 24, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlayerEntity zzeb(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    long l1 = 0L;
    int k = 0;
    long l2 = 0L;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    String str6 = null;
    String str7 = null;
    Object localObject6 = null;
    String str8 = null;
    Object localObject7 = null;
    String str9 = null;
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
        str1 = zza.zzp(paramParcel, m);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        localObject2 = Uri.CREATOR;
        localObject8 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject8;
        break;
      case 4: 
        localObject3 = Uri.CREATOR;
        localObject8 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject8;
        break;
      case 5: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 6: 
        k = zza.zzg(paramParcel, m);
        break;
      case 7: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 8: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 9: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 14: 
        str5 = zza.zzp(paramParcel, m);
        break;
      case 15: 
        localObject4 = MostRecentGameInfoEntity.CREATOR;
        localObject8 = (MostRecentGameInfoEntity)zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject8;
        break;
      case 16: 
        localObject5 = PlayerLevelInfo.CREATOR;
        localObject8 = (PlayerLevelInfo)zza.zza(paramParcel, m, (Parcelable.Creator)localObject5);
        localObject5 = localObject8;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 19: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 18: 
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 21: 
        str7 = zza.zzp(paramParcel, m);
        break;
      case 20: 
        str6 = zza.zzp(paramParcel, m);
        break;
      case 23: 
        str8 = zza.zzp(paramParcel, m);
        break;
      case 22: 
        localObject6 = Uri.CREATOR;
        localObject8 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject6);
        localObject6 = localObject8;
        break;
      case 25: 
        str9 = zza.zzp(paramParcel, m);
        break;
      case 24: 
        localObject7 = Uri.CREATOR;
        localObject8 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject7);
        localObject7 = localObject8;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject8 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject8).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject8);
    }
    Object localObject8 = new com/google/android/gms/games/PlayerEntity;
    ((PlayerEntity)localObject8).<init>(j, str1, str2, (Uri)localObject2, (Uri)localObject3, l1, k, l2, str3, str4, str5, (MostRecentGameInfoEntity)localObject4, (PlayerLevelInfo)localObject5, bool1, bool2, str6, str7, (Uri)localObject6, str8, (Uri)localObject7, str9);
    return (PlayerEntity)localObject8;
  }
  
  public PlayerEntity[] zzgd(int paramInt)
  {
    return new PlayerEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */