package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class AppContentActionEntityCreator
  implements Parcelable.Creator
{
  static void zza(AppContentActionEntity paramAppContentActionEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAppContentActionEntity.zzvP();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramAppContentActionEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAppContentActionEntity.zzvQ();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramAppContentActionEntity.getExtras();
    zzb.zza(paramParcel, 3, (Bundle)localObject, false);
    localObject = paramAppContentActionEntity.getType();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAppContentActionEntity.getId();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramAppContentActionEntity.zzvO();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramAppContentActionEntity.zzvR();
    zzb.zza(paramParcel, 9, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentActionEntity zzef(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str2 = null;
    String str3 = null;
    Bundle localBundle = null;
    String str4 = null;
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
        localObject3 = AppContentConditionEntity.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localBundle = zza.zzr(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        localObject2 = AppContentAnnotationEntity.CREATOR;
        localObject4 = (AppContentAnnotationEntity)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/games/appcontent/AppContentActionEntity;
    ((AppContentActionEntity)localObject4).<init>(j, (ArrayList)localObject3, str4, localBundle, str3, str2, (AppContentAnnotationEntity)localObject2, str1);
    return (AppContentActionEntity)localObject4;
  }
  
  public AppContentActionEntity[] zzgh(int paramInt)
  {
    return new AppContentActionEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentActionEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */