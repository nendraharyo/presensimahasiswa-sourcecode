package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class ParticipantEntityCreator
  implements Parcelable.Creator
{
  static void zza(ParticipantEntity paramParticipantEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramParticipantEntity.getParticipantId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramParticipantEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramParticipantEntity.getDisplayName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramParticipantEntity.getIconImageUri();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramParticipantEntity.getHiResImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    j = paramParticipantEntity.getStatus();
    zzb.zzc(paramParcel, 5, j);
    localObject = paramParticipantEntity.zzwt();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    boolean bool = paramParticipantEntity.isConnectedToRoom();
    zzb.zza(paramParcel, 7, bool);
    localObject = paramParticipantEntity.getPlayer();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    int k = paramParticipantEntity.getCapabilities();
    zzb.zzc(paramParcel, 9, k);
    localObject = paramParticipantEntity.getResult();
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    localObject = paramParticipantEntity.getIconImageUrl();
    zzb.zza(paramParcel, 11, (String)localObject, false);
    localObject = paramParticipantEntity.getHiResImageUrl();
    zzb.zza(paramParcel, 12, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParticipantEntity zzes(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int k = 0;
    String str3 = null;
    boolean bool = false;
    Object localObject4 = null;
    int m = 0;
    Object localObject5 = null;
    String str4 = null;
    String str5 = null;
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
        str1 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        localObject2 = Uri.CREATOR;
        localObject6 = (Uri)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 4: 
        localObject3 = Uri.CREATOR;
        localObject6 = (Uri)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 5: 
        k = zza.zzg(paramParcel, n);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 7: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 8: 
        localObject4 = PlayerEntity.CREATOR;
        localObject6 = (PlayerEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 9: 
        m = zza.zzg(paramParcel, n);
        break;
      case 10: 
        localObject5 = ParticipantResult.CREATOR;
        localObject6 = (ParticipantResult)zza.zza(paramParcel, n, (Parcelable.Creator)localObject5);
        localObject5 = localObject6;
        break;
      case 11: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 12: 
        str5 = zza.zzp(paramParcel, n);
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
    Object localObject6 = new com/google/android/gms/games/multiplayer/ParticipantEntity;
    ((ParticipantEntity)localObject6).<init>(j, str1, str2, (Uri)localObject2, (Uri)localObject3, k, str3, bool, (PlayerEntity)localObject4, m, (ParticipantResult)localObject5, str4, str5);
    return (ParticipantEntity)localObject6;
  }
  
  public ParticipantEntity[] zzgI(int paramInt)
  {
    return new ParticipantEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */