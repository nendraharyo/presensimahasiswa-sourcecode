package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.List;

public class QuestEntityCreator
  implements Parcelable.Creator
{
  static void zza(QuestEntity paramQuestEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramQuestEntity.getGame();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    localObject = paramQuestEntity.getQuestId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramQuestEntity.getAcceptedTimestamp();
    zzb.zza(paramParcel, 3, l);
    localObject = paramQuestEntity.getBannerImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramQuestEntity.getBannerImageUrl();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramQuestEntity.getDescription();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    l = paramQuestEntity.getEndTimestamp();
    zzb.zza(paramParcel, 7, l);
    l = paramQuestEntity.getLastUpdatedTimestamp();
    zzb.zza(paramParcel, 8, l);
    localObject = paramQuestEntity.getIconImageUri();
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    localObject = paramQuestEntity.getIconImageUrl();
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramQuestEntity.getName();
    zzb.zza(paramParcel, 12, (String)localObject, false);
    l = paramQuestEntity.zzxS();
    zzb.zza(paramParcel, 13, l);
    l = paramQuestEntity.getStartTimestamp();
    zzb.zza(paramParcel, 14, l);
    int j = paramQuestEntity.getState();
    zzb.zzc(paramParcel, 15, j);
    localObject = paramQuestEntity.zzxR();
    zzb.zzc(paramParcel, 17, (List)localObject, false);
    j = paramQuestEntity.getType();
    zzb.zzc(paramParcel, 16, j);
    j = paramQuestEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public QuestEntity zzey(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    long l1 = 0L;
    Object localObject3 = null;
    String str2 = null;
    String str3 = null;
    long l2 = 0L;
    long l3 = 0L;
    Object localObject4 = null;
    String str4 = null;
    String str5 = null;
    long l4 = 0L;
    long l5 = 0L;
    int k = 0;
    int m = 0;
    Object localObject5 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        localObject2 = GameEntity.CREATOR;
        localObject6 = (GameEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 4: 
        localObject3 = Uri.CREATOR;
        localObject6 = (Uri)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 7: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 8: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 9: 
        localObject4 = Uri.CREATOR;
        localObject6 = (Uri)zza.zza(paramParcel, n, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 10: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 12: 
        str5 = zza.zzp(paramParcel, n);
        break;
      case 13: 
        l4 = zza.zzi(paramParcel, n);
        break;
      case 14: 
        l5 = zza.zzi(paramParcel, n);
        break;
      case 15: 
        k = zza.zzg(paramParcel, n);
        break;
      case 17: 
        localObject5 = MilestoneEntity.CREATOR;
        localObject5 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject5);
        break;
      case 16: 
        m = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject6).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/games/quest/QuestEntity;
    ((QuestEntity)localObject6).<init>(j, (GameEntity)localObject2, str1, l1, (Uri)localObject3, str2, str3, l2, l3, (Uri)localObject4, str4, str5, l4, l5, k, m, (ArrayList)localObject5);
    return (QuestEntity)localObject6;
  }
  
  public QuestEntity[] zzgO(int paramInt)
  {
    return new QuestEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\QuestEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */