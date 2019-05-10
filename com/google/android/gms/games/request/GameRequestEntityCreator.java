package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.List;

public class GameRequestEntityCreator
  implements Parcelable.Creator
{
  static void zza(GameRequestEntity paramGameRequestEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramGameRequestEntity.getGame();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramGameRequestEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramGameRequestEntity.getSender();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramGameRequestEntity.getData();
    zzb.zza(paramParcel, 3, (byte[])localObject, false);
    localObject = paramGameRequestEntity.getRequestId();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGameRequestEntity.getRecipients();
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    j = paramGameRequestEntity.getType();
    zzb.zzc(paramParcel, 7, j);
    long l = paramGameRequestEntity.getCreationTimestamp();
    zzb.zza(paramParcel, 9, l);
    l = paramGameRequestEntity.getExpirationTimestamp();
    zzb.zza(paramParcel, 10, l);
    localObject = paramGameRequestEntity.zzxT();
    zzb.zza(paramParcel, 11, (Bundle)localObject, false);
    j = paramGameRequestEntity.getStatus();
    zzb.zzc(paramParcel, 12, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GameRequestEntity zzez(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    byte[] arrayOfByte = null;
    String str = null;
    Object localObject4 = null;
    int k = 0;
    long l1 = 0L;
    long l2 = 0L;
    Bundle localBundle = null;
    int m = 0;
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
        localObject5 = (GameEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject3 = PlayerEntity.CREATOR;
        localObject5 = (PlayerEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        arrayOfByte = zza.zzs(paramParcel, n);
        break;
      case 4: 
        str = zza.zzp(paramParcel, n);
        break;
      case 5: 
        localObject4 = PlayerEntity.CREATOR;
        localObject4 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject4);
        break;
      case 7: 
        k = zza.zzg(paramParcel, n);
        break;
      case 9: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 10: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 11: 
        localBundle = zza.zzr(paramParcel, n);
        break;
      case 12: 
        m = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/games/request/GameRequestEntity;
    ((GameRequestEntity)localObject5).<init>(j, (GameEntity)localObject2, (PlayerEntity)localObject3, arrayOfByte, str, (ArrayList)localObject4, k, l1, l2, localBundle, m);
    return (GameRequestEntity)localObject5;
  }
  
  public GameRequestEntity[] zzgP(int paramInt)
  {
    return new GameRequestEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\GameRequestEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */