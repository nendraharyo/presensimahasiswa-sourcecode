package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class AppContentConditionEntityCreator
  implements Parcelable.Creator
{
  static void zza(AppContentConditionEntity paramAppContentConditionEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAppContentConditionEntity.zzwf();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramAppContentConditionEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAppContentConditionEntity.zzwg();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramAppContentConditionEntity.zzwh();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAppContentConditionEntity.zzwi();
    zzb.zza(paramParcel, 4, (Bundle)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentConditionEntity zzei(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    String str1 = null;
    String str2 = null;
    Object localObject1 = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localBundle = zza.zzr(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/games/appcontent/AppContentConditionEntity;
    ((AppContentConditionEntity)localObject2).<init>(j, (String)localObject1, str2, str1, localBundle);
    return (AppContentConditionEntity)localObject2;
  }
  
  public AppContentConditionEntity[] zzgk(int paramInt)
  {
    return new AppContentConditionEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentConditionEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */