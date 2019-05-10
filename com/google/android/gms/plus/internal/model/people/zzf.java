package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzf
  implements Parcelable.Creator
{
  static void zza(PersonEntity.ImageEntity paramImageEntity, Parcel paramParcel, int paramInt)
  {
    int i = 2;
    int j = 1;
    int k = zzb.zzav(paramParcel);
    Object localObject = paramImageEntity.zzbeN;
    Integer localInteger = Integer.valueOf(j);
    boolean bool1 = ((Set)localObject).contains(localInteger);
    if (bool1)
    {
      int m = paramImageEntity.mVersionCode;
      zzb.zzc(paramParcel, j, m);
    }
    localInteger = Integer.valueOf(i);
    boolean bool2 = ((Set)localObject).contains(localInteger);
    if (bool2)
    {
      localObject = paramImageEntity.zzF;
      zzb.zza(paramParcel, i, (String)localObject, j);
    }
    zzb.zzI(paramParcel, k);
  }
  
  public PersonEntity.ImageEntity zzgJ(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
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
      Integer localInteger;
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        k = 1;
        localInteger = Integer.valueOf(k);
        localHashSet.add(localInteger);
        break;
      case 2: 
        localObject2 = zza.zzp(paramParcel, k);
        k = 2;
        localInteger = Integer.valueOf(k);
        localHashSet.add(localInteger);
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
    PersonEntity.ImageEntity localImageEntity = new com/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;
    localImageEntity.<init>(localHashSet, j, (String)localObject2);
    return localImageEntity;
  }
  
  public PersonEntity.ImageEntity[] zzjQ(int paramInt)
  {
    return new PersonEntity.ImageEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */