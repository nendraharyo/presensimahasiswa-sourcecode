package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import java.util.List;

public class TurnBasedMatchEntityCreator
  implements Parcelable.Creator
{
  static void zza(TurnBasedMatchEntity paramTurnBasedMatchEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramTurnBasedMatchEntity.getGame();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    localObject = paramTurnBasedMatchEntity.getMatchId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramTurnBasedMatchEntity.getCreatorId();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    long l = paramTurnBasedMatchEntity.getCreationTimestamp();
    zzb.zza(paramParcel, 4, l);
    localObject = paramTurnBasedMatchEntity.getLastUpdaterId();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    l = paramTurnBasedMatchEntity.getLastUpdatedTimestamp();
    zzb.zza(paramParcel, 6, l);
    localObject = paramTurnBasedMatchEntity.getPendingParticipantId();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    int j = paramTurnBasedMatchEntity.getStatus();
    zzb.zzc(paramParcel, 8, j);
    j = paramTurnBasedMatchEntity.getVariant();
    zzb.zzc(paramParcel, 10, j);
    j = paramTurnBasedMatchEntity.getVersion();
    zzb.zzc(paramParcel, 11, j);
    localObject = paramTurnBasedMatchEntity.getData();
    zzb.zza(paramParcel, 12, (byte[])localObject, false);
    localObject = paramTurnBasedMatchEntity.getParticipants();
    zzb.zzc(paramParcel, 13, (List)localObject, false);
    localObject = paramTurnBasedMatchEntity.getRematchId();
    zzb.zza(paramParcel, 14, (String)localObject, false);
    localObject = paramTurnBasedMatchEntity.getPreviousMatchData();
    zzb.zza(paramParcel, 15, (byte[])localObject, false);
    localObject = paramTurnBasedMatchEntity.getAutoMatchCriteria();
    zzb.zza(paramParcel, 17, (Bundle)localObject, false);
    j = paramTurnBasedMatchEntity.getMatchNumber();
    zzb.zzc(paramParcel, 16, j);
    j = paramTurnBasedMatchEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramTurnBasedMatchEntity.isLocallyModified();
    zzb.zza(paramParcel, 19, bool);
    int k = paramTurnBasedMatchEntity.getTurnStatus();
    zzb.zzc(paramParcel, 18, k);
    localObject = paramTurnBasedMatchEntity.getDescriptionParticipantId();
    zzb.zza(paramParcel, 21, (String)localObject, false);
    localObject = paramTurnBasedMatchEntity.getDescription();
    zzb.zza(paramParcel, 20, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public TurnBasedMatchEntity zzew(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    long l1 = 0L;
    String str3 = null;
    long l2 = 0L;
    String str4 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    byte[] arrayOfByte1 = null;
    Object localObject3 = null;
    String str5 = null;
    byte[] arrayOfByte2 = null;
    int i1 = 0;
    Bundle localBundle = null;
    int i2 = 0;
    boolean bool = false;
    String str6 = null;
    String str7 = null;
    for (;;)
    {
      i3 = paramParcel.dataPosition();
      if (i3 >= i) {
        break;
      }
      i3 = zza.zzat(paramParcel);
      int i4 = zza.zzca(i3);
      switch (i4)
      {
      default: 
        zza.zzb(paramParcel, i3);
        break;
      case 1: 
        localObject2 = GameEntity.CREATOR;
        localObject4 = (GameEntity)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, i3);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, i3);
        break;
      case 4: 
        l1 = zza.zzi(paramParcel, i3);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, i3);
        break;
      case 6: 
        l2 = zza.zzi(paramParcel, i3);
        break;
      case 7: 
        str4 = zza.zzp(paramParcel, i3);
        break;
      case 8: 
        k = zza.zzg(paramParcel, i3);
        break;
      case 10: 
        m = zza.zzg(paramParcel, i3);
        break;
      case 11: 
        n = zza.zzg(paramParcel, i3);
        break;
      case 12: 
        arrayOfByte1 = zza.zzs(paramParcel, i3);
        break;
      case 13: 
        localObject3 = ParticipantEntity.CREATOR;
        localObject3 = zza.zzc(paramParcel, i3, (Parcelable.Creator)localObject3);
        break;
      case 14: 
        str5 = zza.zzp(paramParcel, i3);
        break;
      case 15: 
        arrayOfByte2 = zza.zzs(paramParcel, i3);
        break;
      case 17: 
        localBundle = zza.zzr(paramParcel, i3);
        break;
      case 16: 
        i1 = zza.zzg(paramParcel, i3);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, i3);
        break;
      case 19: 
        bool = zza.zzc(paramParcel, i3);
        break;
      case 18: 
        i2 = zza.zzg(paramParcel, i3);
        break;
      case 21: 
        str7 = zza.zzp(paramParcel, i3);
        break;
      case 20: 
        str6 = zza.zzp(paramParcel, i3);
      }
    }
    int i3 = paramParcel.dataPosition();
    if (i3 != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;
    ((TurnBasedMatchEntity)localObject4).<init>(j, (GameEntity)localObject2, str1, str2, l1, str3, l2, str4, k, m, n, arrayOfByte1, (ArrayList)localObject3, str5, arrayOfByte2, i1, localBundle, i2, bool, str6, str7);
    return (TurnBasedMatchEntity)localObject4;
  }
  
  public TurnBasedMatchEntity[] zzgM(int paramInt)
  {
    return new TurnBasedMatchEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */