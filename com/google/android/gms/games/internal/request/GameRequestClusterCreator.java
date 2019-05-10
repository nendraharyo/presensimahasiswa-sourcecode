package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public class GameRequestClusterCreator
  implements Parcelable.Creator
{
  static void zza(GameRequestCluster paramGameRequestCluster, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    ArrayList localArrayList = paramGameRequestCluster.zzxF();
    zzb.zzc(paramParcel, 1, localArrayList, false);
    int j = paramGameRequestCluster.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GameRequestCluster zzeq(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = GameRequestEntity.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    GameRequestCluster localGameRequestCluster = new com/google/android/gms/games/internal/request/GameRequestCluster;
    localGameRequestCluster.<init>(j, (ArrayList)localObject2);
    return localGameRequestCluster;
  }
  
  public GameRequestCluster[] zzgF(int paramInt)
  {
    return new GameRequestCluster[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\request\GameRequestClusterCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */