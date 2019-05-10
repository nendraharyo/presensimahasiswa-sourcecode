package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class AppContentSectionEntityCreator
  implements Parcelable.Creator
{
  static void zza(AppContentSectionEntity paramAppContentSectionEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAppContentSectionEntity.getActions();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramAppContentSectionEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAppContentSectionEntity.zzwk();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramAppContentSectionEntity.zzvQ();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramAppContentSectionEntity.getExtras();
    zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    localObject = paramAppContentSectionEntity.zzwc();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAppContentSectionEntity.getTitle();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramAppContentSectionEntity.getType();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramAppContentSectionEntity.getId();
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramAppContentSectionEntity.zzwl();
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramAppContentSectionEntity.zzwa();
    zzb.zzc(paramParcel, 14, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentSectionEntity zzej(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Bundle localBundle = null;
    String str6 = null;
    Object localObject2 = null;
    Object localObject3 = null;
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
        localObject3 = AppContentActionEntity.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 3: 
        localObject2 = AppContentCardEntity.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 4: 
        str6 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, k);
        break;
      case 6: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 10: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 14: 
        localObject1 = AppContentAnnotationEntity.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject4, paramParcel);
      throw localzza;
    }
    Object localObject4 = new com/google/android/gms/games/appcontent/AppContentSectionEntity;
    ((AppContentSectionEntity)localObject4).<init>(j, (ArrayList)localObject3, (ArrayList)localObject2, str6, localBundle, str5, str4, str3, str2, str1, (ArrayList)localObject1);
    return (AppContentSectionEntity)localObject4;
  }
  
  public AppContentSectionEntity[] zzgl(int paramInt)
  {
    return new AppContentSectionEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentSectionEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */