package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import java.util.List;

public class RoomEntityCreator
  implements Parcelable.Creator
{
  static void zza(RoomEntity paramRoomEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramRoomEntity.getRoomId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramRoomEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramRoomEntity.getCreatorId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramRoomEntity.getCreationTimestamp();
    zzb.zza(paramParcel, 3, l);
    j = paramRoomEntity.getStatus();
    zzb.zzc(paramParcel, 4, j);
    localObject = paramRoomEntity.getDescription();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    j = paramRoomEntity.getVariant();
    zzb.zzc(paramParcel, 6, j);
    localObject = paramRoomEntity.getAutoMatchCriteria();
    zzb.zza(paramParcel, 7, (Bundle)localObject, false);
    localObject = paramRoomEntity.getParticipants();
    zzb.zzc(paramParcel, 8, (List)localObject, false);
    j = paramRoomEntity.getAutoMatchWaitEstimateSeconds();
    zzb.zzc(paramParcel, 9, j);
    zzb.zzI(paramParcel, i);
  }
  
  public RoomEntity zzev(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    Bundle localBundle = null;
    int k = 0;
    String str1 = null;
    int m = 0;
    String str2 = null;
    Object localObject2 = null;
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
        localObject2 = zza.zzp(paramParcel, i1);
        break;
      case 1000: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        l = zza.zzi(paramParcel, i1);
        break;
      case 4: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 6: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 7: 
        localBundle = zza.zzr(paramParcel, i1);
        break;
      case 8: 
        localObject1 = ParticipantEntity.CREATOR;
        localObject1 = zza.zzc(paramParcel, i1, (Parcelable.Creator)localObject1);
        break;
      case 9: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject3, paramParcel);
      throw localzza;
    }
    Object localObject3 = new com/google/android/gms/games/multiplayer/realtime/RoomEntity;
    ((RoomEntity)localObject3).<init>(n, (String)localObject2, str2, l, m, str1, k, localBundle, (ArrayList)localObject1, i);
    return (RoomEntity)localObject3;
  }
  
  public RoomEntity[] zzgL(int paramInt)
  {
    return new RoomEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */