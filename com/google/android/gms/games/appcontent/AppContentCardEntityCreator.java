package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class AppContentCardEntityCreator
  implements Parcelable.Creator
{
  static void zza(AppContentCardEntity paramAppContentCardEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAppContentCardEntity.getActions();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramAppContentCardEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAppContentCardEntity.zzwa();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramAppContentCardEntity.zzvP();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramAppContentCardEntity.zzvQ();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    j = paramAppContentCardEntity.zzwb();
    zzb.zzc(paramParcel, 5, j);
    localObject = paramAppContentCardEntity.getDescription();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAppContentCardEntity.getExtras();
    zzb.zza(paramParcel, 7, (Bundle)localObject, false);
    localObject = paramAppContentCardEntity.zzwc();
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramAppContentCardEntity.getTitle();
    zzb.zza(paramParcel, 11, (String)localObject, false);
    j = paramAppContentCardEntity.zzwd();
    zzb.zzc(paramParcel, 12, j);
    localObject = paramAppContentCardEntity.getType();
    zzb.zza(paramParcel, 13, (String)localObject, false);
    localObject = paramAppContentCardEntity.getId();
    zzb.zza(paramParcel, 14, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentCardEntity zzeh(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str1 = null;
    int k = 0;
    String str2 = null;
    Bundle localBundle = null;
    String str3 = null;
    String str4 = null;
    int m = 0;
    String str5 = null;
    String str6 = null;
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
        localObject1 = AppContentActionEntity.CREATOR;
        localObject1 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject1);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject2 = AppContentAnnotationEntity.CREATOR;
        localObject2 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject2);
        break;
      case 3: 
        localObject3 = AppContentConditionEntity.CREATOR;
        localObject3 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject3);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        k = zza.zzg(paramParcel, n);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 7: 
        localBundle = zza.zzr(paramParcel, n);
        break;
      case 10: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 11: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 12: 
        m = zza.zzg(paramParcel, n);
        break;
      case 13: 
        str5 = zza.zzp(paramParcel, n);
        break;
      case 14: 
        str6 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject4, paramParcel);
      throw localzza;
    }
    Object localObject4 = new com/google/android/gms/games/appcontent/AppContentCardEntity;
    ((AppContentCardEntity)localObject4).<init>(j, (ArrayList)localObject1, (ArrayList)localObject2, (ArrayList)localObject3, str1, k, str2, localBundle, str3, str4, m, str5, str6);
    return (AppContentCardEntity)localObject4;
  }
  
  public AppContentCardEntity[] zzgj(int paramInt)
  {
    return new AppContentCardEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentCardEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */