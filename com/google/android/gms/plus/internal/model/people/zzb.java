package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb
  implements Parcelable.Creator
{
  static void zza(PersonEntity.AgeRangeEntity paramAgeRangeEntity, Parcel paramParcel, int paramInt)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Set localSet = paramAgeRangeEntity.zzbeN;
    Integer localInteger = Integer.valueOf(k);
    boolean bool1 = localSet.contains(localInteger);
    if (bool1)
    {
      int n = paramAgeRangeEntity.mVersionCode;
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, k, n);
    }
    localInteger = Integer.valueOf(j);
    boolean bool2 = localSet.contains(localInteger);
    if (bool2)
    {
      int i1 = paramAgeRangeEntity.zzbge;
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, j, i1);
    }
    localInteger = Integer.valueOf(i);
    boolean bool3 = localSet.contains(localInteger);
    if (bool3)
    {
      int i2 = paramAgeRangeEntity.zzbgf;
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, i, i2);
    }
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, m);
  }
  
  public PersonEntity.AgeRangeEntity zzgF(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int k = 0;
    Object localObject = null;
    int m = 0;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      Integer localInteger;
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        n = 1;
        localInteger = Integer.valueOf(n);
        localHashSet.add(localInteger);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        n = 2;
        localInteger = Integer.valueOf(n);
        localHashSet.add(localInteger);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        n = 3;
        localInteger = Integer.valueOf(n);
        localHashSet.add(localInteger);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    PersonEntity.AgeRangeEntity localAgeRangeEntity = new com/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity;
    localAgeRangeEntity.<init>(localHashSet, m, k, i);
    return localAgeRangeEntity;
  }
  
  public PersonEntity.AgeRangeEntity[] zzjM(int paramInt)
  {
    return new PersonEntity.AgeRangeEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */