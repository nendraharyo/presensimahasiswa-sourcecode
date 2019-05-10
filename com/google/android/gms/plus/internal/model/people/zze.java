package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zze
  implements Parcelable.Creator
{
  static void zza(PersonEntity.CoverEntity.CoverPhotoEntity paramCoverPhotoEntity, Parcel paramParcel, int paramInt)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = zzb.zzav(paramParcel);
    Set localSet = paramCoverPhotoEntity.zzbeN;
    Object localObject = Integer.valueOf(m);
    boolean bool1 = localSet.contains(localObject);
    if (bool1)
    {
      int i1 = paramCoverPhotoEntity.mVersionCode;
      zzb.zzc(paramParcel, m, i1);
    }
    localObject = Integer.valueOf(k);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      int i2 = paramCoverPhotoEntity.zzoH;
      zzb.zzc(paramParcel, k, i2);
    }
    localObject = Integer.valueOf(j);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramCoverPhotoEntity.zzF;
      zzb.zza(paramParcel, j, (String)localObject, m);
    }
    localObject = Integer.valueOf(i);
    boolean bool4 = localSet.contains(localObject);
    if (bool4)
    {
      int i3 = paramCoverPhotoEntity.zzoG;
      zzb.zzc(paramParcel, i, i3);
    }
    zzb.zzI(paramParcel, n);
  }
  
  public PersonEntity.CoverEntity.CoverPhotoEntity zzgI(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    String str = null;
    int k = 0;
    int m = 0;
    StringBuilder localStringBuilder = null;
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
        ((Set)localObject1).add(localInteger);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        n = 2;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 3: 
        str = zza.zzp(paramParcel, n);
        n = 3;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 4: 
        i = zza.zzg(paramParcel, n);
        n = 4;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity;
    ((PersonEntity.CoverEntity.CoverPhotoEntity)localObject2).<init>((Set)localObject1, m, k, str, i);
    return (PersonEntity.CoverEntity.CoverPhotoEntity)localObject2;
  }
  
  public PersonEntity.CoverEntity.CoverPhotoEntity[] zzjP(int paramInt)
  {
    return new PersonEntity.CoverEntity.CoverPhotoEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */