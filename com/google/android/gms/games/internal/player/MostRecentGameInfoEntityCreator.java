package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class MostRecentGameInfoEntityCreator
  implements Parcelable.Creator
{
  static void zza(MostRecentGameInfoEntity paramMostRecentGameInfoEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramMostRecentGameInfoEntity.zzxy();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramMostRecentGameInfoEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramMostRecentGameInfoEntity.zzxz();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramMostRecentGameInfoEntity.zzxA();
    zzb.zza(paramParcel, 3, l);
    localObject = paramMostRecentGameInfoEntity.zzxB();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramMostRecentGameInfoEntity.zzxC();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramMostRecentGameInfoEntity.zzxD();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public MostRecentGameInfoEntity zzep(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    long l = 0L;
    Object localObject3 = null;
    Object localObject4 = null;
    String str1 = null;
    String str2 = null;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        l = zza.zzi(paramParcel, k);
        break;
      case 4: 
        localObject4 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 5: 
        localObject3 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 6: 
        localObject1 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
    ((MostRecentGameInfoEntity)localObject5).<init>(j, str2, str1, l, (Uri)localObject4, (Uri)localObject3, (Uri)localObject1);
    return (MostRecentGameInfoEntity)localObject5;
  }
  
  public MostRecentGameInfoEntity[] zzgE(int paramInt)
  {
    return new MostRecentGameInfoEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\player\MostRecentGameInfoEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */