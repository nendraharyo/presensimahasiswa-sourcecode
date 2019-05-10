package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class GameEntityCreator
  implements Parcelable.Creator
{
  static void zza(GameEntity paramGameEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramGameEntity.getApplicationId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    localObject = paramGameEntity.getDisplayName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramGameEntity.getPrimaryCategory();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramGameEntity.getSecondaryCategory();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGameEntity.getDescription();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramGameEntity.getDeveloperName();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramGameEntity.getIconImageUri();
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramGameEntity.getHiResImageUri();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramGameEntity.getFeaturedImageUri();
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    boolean bool1 = paramGameEntity.zzvx();
    zzb.zza(paramParcel, 10, bool1);
    bool1 = paramGameEntity.zzvz();
    zzb.zza(paramParcel, 11, bool1);
    localObject = paramGameEntity.zzvA();
    zzb.zza(paramParcel, 12, (String)localObject, false);
    int j = paramGameEntity.zzvB();
    zzb.zzc(paramParcel, 13, j);
    j = paramGameEntity.getAchievementTotalCount();
    zzb.zzc(paramParcel, 14, j);
    j = paramGameEntity.getLeaderboardCount();
    zzb.zzc(paramParcel, 15, j);
    boolean bool2 = paramGameEntity.isTurnBasedMultiplayerEnabled();
    zzb.zza(paramParcel, 17, bool2);
    bool2 = paramGameEntity.isRealTimeMultiplayerEnabled();
    zzb.zza(paramParcel, 16, bool2);
    int k = paramGameEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, k);
    localObject = paramGameEntity.getHiResImageUrl();
    zzb.zza(paramParcel, 19, (String)localObject, false);
    localObject = paramGameEntity.getIconImageUrl();
    zzb.zza(paramParcel, 18, (String)localObject, false);
    boolean bool3 = paramGameEntity.isMuted();
    zzb.zza(paramParcel, 21, bool3);
    localObject = paramGameEntity.getFeaturedImageUrl();
    zzb.zza(paramParcel, 20, (String)localObject, false);
    bool3 = paramGameEntity.areSnapshotsEnabled();
    zzb.zza(paramParcel, 23, bool3);
    bool3 = paramGameEntity.zzvy();
    zzb.zza(paramParcel, 22, bool3);
    bool3 = paramGameEntity.hasGamepadSupport();
    zzb.zza(paramParcel, 25, bool3);
    localObject = paramGameEntity.getThemeColor();
    zzb.zza(paramParcel, 24, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GameEntity zzea(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    String str7 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    boolean bool3 = false;
    boolean bool4 = false;
    String str8 = null;
    String str9 = null;
    String str10 = null;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    String str11 = null;
    boolean bool8 = false;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= i) {
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
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, i1);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, i1);
        break;
      case 5: 
        str5 = zza.zzp(paramParcel, i1);
        break;
      case 6: 
        str6 = zza.zzp(paramParcel, i1);
        break;
      case 7: 
        localObject2 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 8: 
        localObject3 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 9: 
        localObject4 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 10: 
        bool1 = zza.zzc(paramParcel, i1);
        break;
      case 11: 
        bool2 = zza.zzc(paramParcel, i1);
        break;
      case 12: 
        str7 = zza.zzp(paramParcel, i1);
        break;
      case 13: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 14: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 15: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 17: 
        bool4 = zza.zzc(paramParcel, i1);
        break;
      case 16: 
        bool3 = zza.zzc(paramParcel, i1);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 19: 
        str9 = zza.zzp(paramParcel, i1);
        break;
      case 18: 
        str8 = zza.zzp(paramParcel, i1);
        break;
      case 21: 
        bool5 = zza.zzc(paramParcel, i1);
        break;
      case 20: 
        str10 = zza.zzp(paramParcel, i1);
        break;
      case 23: 
        bool7 = zza.zzc(paramParcel, i1);
        break;
      case 22: 
        bool6 = zza.zzc(paramParcel, i1);
        break;
      case 25: 
        bool8 = zza.zzc(paramParcel, i1);
        break;
      case 24: 
        str11 = zza.zzp(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/games/GameEntity;
    ((GameEntity)localObject5).<init>(j, str1, str2, str3, str4, str5, str6, (Uri)localObject2, (Uri)localObject3, (Uri)localObject4, bool1, bool2, str7, k, m, n, bool3, bool4, str8, str9, str10, bool5, bool6, bool7, str11, bool8);
    return (GameEntity)localObject5;
  }
  
  public GameEntity[] zzgb(int paramInt)
  {
    return new GameEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\GameEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */