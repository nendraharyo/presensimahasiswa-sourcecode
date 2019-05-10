package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class AchievementEntityCreator
  implements Parcelable.Creator
{
  static void zza(AchievementEntity paramAchievementEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAchievementEntity.getAchievementId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramAchievementEntity.getType();
    zzb.zzc(paramParcel, 2, j);
    localObject = paramAchievementEntity.getName();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAchievementEntity.getDescription();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramAchievementEntity.getUnlockedImageUri();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramAchievementEntity.getUnlockedImageUrl();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAchievementEntity.getRevealedImageUri();
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramAchievementEntity.getRevealedImageUrl();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    j = paramAchievementEntity.zzvK();
    zzb.zzc(paramParcel, 9, j);
    localObject = paramAchievementEntity.zzvL();
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramAchievementEntity.getPlayer();
    zzb.zza(paramParcel, 11, (Parcelable)localObject, paramInt, false);
    j = paramAchievementEntity.getState();
    zzb.zzc(paramParcel, 12, j);
    j = paramAchievementEntity.zzvM();
    zzb.zzc(paramParcel, 13, j);
    localObject = paramAchievementEntity.zzvN();
    zzb.zza(paramParcel, 14, (String)localObject, false);
    long l = paramAchievementEntity.getLastUpdatedTimestamp();
    zzb.zza(paramParcel, 15, l);
    l = paramAchievementEntity.getXpValue();
    zzb.zza(paramParcel, 16, l);
    j = paramAchievementEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public AchievementEntity zzee(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    int k = 0;
    String str2 = null;
    String str3 = null;
    Object localObject2 = null;
    String str4 = null;
    Object localObject3 = null;
    String str5 = null;
    int m = 0;
    String str6 = null;
    Object localObject4 = null;
    int n = 0;
    int i1 = 0;
    String str7 = null;
    long l1 = 0L;
    long l2 = 0L;
    for (;;)
    {
      i2 = paramParcel.dataPosition();
      if (i2 >= i) {
        break;
      }
      i2 = zza.zzat(paramParcel);
      int i3 = zza.zzca(i2);
      switch (i3)
      {
      default: 
        zza.zzb(paramParcel, i2);
        break;
      case 1: 
        str1 = zza.zzp(paramParcel, i2);
        break;
      case 2: 
        k = zza.zzg(paramParcel, i2);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, i2);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, i2);
        break;
      case 5: 
        localObject2 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, i2, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 6: 
        str4 = zza.zzp(paramParcel, i2);
        break;
      case 7: 
        localObject3 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, i2, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 8: 
        str5 = zza.zzp(paramParcel, i2);
        break;
      case 9: 
        m = zza.zzg(paramParcel, i2);
        break;
      case 10: 
        str6 = zza.zzp(paramParcel, i2);
        break;
      case 11: 
        localObject4 = PlayerEntity.CREATOR;
        localObject5 = (PlayerEntity)zza.zza(paramParcel, i2, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 12: 
        n = zza.zzg(paramParcel, i2);
        break;
      case 13: 
        i1 = zza.zzg(paramParcel, i2);
        break;
      case 14: 
        str7 = zza.zzp(paramParcel, i2);
        break;
      case 15: 
        l1 = zza.zzi(paramParcel, i2);
        break;
      case 16: 
        l2 = zza.zzi(paramParcel, i2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, i2);
      }
    }
    int i2 = paramParcel.dataPosition();
    if (i2 != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/games/achievement/AchievementEntity;
    ((AchievementEntity)localObject5).<init>(j, str1, k, str2, str3, (Uri)localObject2, str4, (Uri)localObject3, str5, m, str6, (PlayerEntity)localObject4, n, i1, str7, l1, l2);
    return (AchievementEntity)localObject5;
  }
  
  public AchievementEntity[] zzgg(int paramInt)
  {
    return new AchievementEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\AchievementEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */