package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.List;

public class InvitationEntityCreator
  implements Parcelable.Creator
{
  static void zza(InvitationEntity paramInvitationEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramInvitationEntity.getGame();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramInvitationEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramInvitationEntity.getInvitationId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramInvitationEntity.getCreationTimestamp();
    zzb.zza(paramParcel, 3, l);
    j = paramInvitationEntity.getInvitationType();
    zzb.zzc(paramParcel, 4, j);
    localObject = paramInvitationEntity.getInviter();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramInvitationEntity.getParticipants();
    zzb.zzc(paramParcel, 6, (List)localObject, false);
    j = paramInvitationEntity.getVariant();
    zzb.zzc(paramParcel, 7, j);
    j = paramInvitationEntity.getAvailableAutoMatchSlots();
    zzb.zzc(paramParcel, 8, j);
    zzb.zzI(paramParcel, i);
  }
  
  public InvitationEntity zzer(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    String str = null;
    Object localObject3 = null;
    int n = 0;
    Object localObject4 = null;
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
        localObject3 = GameEntity.CREATOR;
        localObject5 = (GameEntity)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 1000: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        str = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        l = zza.zzi(paramParcel, i1);
        break;
      case 4: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        localObject2 = ParticipantEntity.CREATOR;
        localObject5 = (ParticipantEntity)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 6: 
        localObject1 = ParticipantEntity.CREATOR;
        localObject1 = zza.zzc(paramParcel, i1, (Parcelable.Creator)localObject1);
        break;
      case 7: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 8: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + j;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/games/multiplayer/InvitationEntity;
    ((InvitationEntity)localObject5).<init>(n, (GameEntity)localObject3, str, l, m, (ParticipantEntity)localObject2, (ArrayList)localObject1, k, i);
    return (InvitationEntity)localObject5;
  }
  
  public InvitationEntity[] zzgH(int paramInt)
  {
    return new InvitationEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\InvitationEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */