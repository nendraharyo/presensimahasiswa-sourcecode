package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class AppContentAnnotationEntityCreator
  implements Parcelable.Creator
{
  static void zza(AppContentAnnotationEntity paramAppContentAnnotationEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAppContentAnnotationEntity.getDescription();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramAppContentAnnotationEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAppContentAnnotationEntity.zzvV();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramAppContentAnnotationEntity.getTitle();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAppContentAnnotationEntity.getId();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramAppContentAnnotationEntity.zzvY();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAppContentAnnotationEntity.zzvT();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    j = paramAppContentAnnotationEntity.zzvU();
    zzb.zzc(paramParcel, 8, j);
    j = paramAppContentAnnotationEntity.zzvX();
    zzb.zzc(paramParcel, 9, j);
    localObject = paramAppContentAnnotationEntity.zzvW();
    zzb.zza(paramParcel, 10, (Bundle)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentAnnotationEntity zzeg(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject1 = null;
    String str5 = null;
    int m = 0;
    Object localObject2 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        str5 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = Uri.CREATOR;
        localObject3 = (Uri)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 8: 
        k = zza.zzg(paramParcel, n);
        break;
      case 9: 
        i = zza.zzg(paramParcel, n);
        break;
      case 10: 
        localBundle = zza.zzr(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/games/appcontent/AppContentAnnotationEntity;
    ((AppContentAnnotationEntity)localObject3).<init>(m, str5, (Uri)localObject1, str4, str3, str2, str1, k, i, localBundle);
    return (AppContentAnnotationEntity)localObject3;
  }
  
  public AppContentAnnotationEntity[] zzgi(int paramInt)
  {
    return new AppContentAnnotationEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentAnnotationEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */