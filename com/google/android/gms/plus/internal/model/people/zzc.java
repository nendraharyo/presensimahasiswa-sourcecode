package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzc
  implements Parcelable.Creator
{
  static void zza(PersonEntity.CoverEntity paramCoverEntity, Parcel paramParcel, int paramInt)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = zzb.zzav(paramParcel);
    Set localSet = paramCoverEntity.zzbeN;
    Object localObject = Integer.valueOf(m);
    boolean bool1 = localSet.contains(localObject);
    if (bool1)
    {
      int i1 = paramCoverEntity.mVersionCode;
      zzb.zzc(paramParcel, m, i1);
    }
    localObject = Integer.valueOf(k);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramCoverEntity.zzbgg;
      zzb.zza(paramParcel, k, (Parcelable)localObject, paramInt, m);
    }
    localObject = Integer.valueOf(j);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramCoverEntity.zzbgh;
      zzb.zza(paramParcel, j, (Parcelable)localObject, paramInt, m);
    }
    localObject = Integer.valueOf(i);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      int i2 = paramCoverEntity.zzbgi;
      zzb.zzc(paramParcel, i, i2);
    }
    zzb.zzI(paramParcel, n);
  }
  
  public PersonEntity.CoverEntity zzgG(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    int k = zza.zzau(paramParcel);
    Object localObject2 = new java/util/HashSet;
    ((HashSet)localObject2).<init>();
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= k) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        i1 = 1;
        localObject4 = Integer.valueOf(i1);
        ((Set)localObject2).add(localObject4);
        break;
      case 2: 
        localObject3 = PersonEntity.CoverEntity.CoverInfoEntity.CREATOR;
        localObject4 = (PersonEntity.CoverEntity.CoverInfoEntity)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        m = 2;
        localObject3 = Integer.valueOf(m);
        ((Set)localObject2).add(localObject3);
        localObject3 = localObject4;
        break;
      case 3: 
        localObject1 = PersonEntity.CoverEntity.CoverPhotoEntity.CREATOR;
        localObject4 = (PersonEntity.CoverEntity.CoverPhotoEntity)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        i = 3;
        localObject1 = Integer.valueOf(i);
        ((Set)localObject2).add(localObject1);
        localObject1 = localObject4;
        break;
      case 4: 
        j = zza.zzg(paramParcel, i1);
        i1 = 4;
        localObject4 = Integer.valueOf(i1);
        ((Set)localObject2).add(localObject4);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != k)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + k;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity;
    ((PersonEntity.CoverEntity)localObject4).<init>((Set)localObject2, n, (PersonEntity.CoverEntity.CoverInfoEntity)localObject3, (PersonEntity.CoverEntity.CoverPhotoEntity)localObject1, j);
    return (PersonEntity.CoverEntity)localObject4;
  }
  
  public PersonEntity.CoverEntity[] zzjN(int paramInt)
  {
    return new PersonEntity.CoverEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */