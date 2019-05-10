package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzj
  implements Parcelable.Creator
{
  static void zza(PersonEntity.UrlsEntity paramUrlsEntity, Parcel paramParcel, int paramInt)
  {
    int i = 6;
    int j = 5;
    int k = 4;
    int m = 3;
    int n = 1;
    int i1 = zzb.zzav(paramParcel);
    Set localSet = paramUrlsEntity.zzbeN;
    Object localObject = Integer.valueOf(n);
    boolean bool1 = localSet.contains(localObject);
    if (bool1)
    {
      int i2 = paramUrlsEntity.mVersionCode;
      zzb.zzc(paramParcel, n, i2);
    }
    localObject = Integer.valueOf(m);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      int i3 = paramUrlsEntity.zzFy();
      zzb.zzc(paramParcel, m, i3);
    }
    localObject = Integer.valueOf(k);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramUrlsEntity.mValue;
      zzb.zza(paramParcel, k, (String)localObject, n);
    }
    localObject = Integer.valueOf(j);
    bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramUrlsEntity.zzaUO;
      zzb.zza(paramParcel, j, (String)localObject, n);
    }
    localObject = Integer.valueOf(i);
    boolean bool4 = localSet.contains(localObject);
    if (bool4)
    {
      int i4 = paramUrlsEntity.zzabB;
      zzb.zzc(paramParcel, i, i4);
    }
    zzb.zzI(paramParcel, i1);
  }
  
  public PersonEntity.UrlsEntity zzgN(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int k = 0;
    String str2 = null;
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
      case 2: 
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        n = 1;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        n = 3;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
        n = 4;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, n);
        n = 5;
        localInteger = Integer.valueOf(n);
        ((Set)localObject1).add(localInteger);
        break;
      case 6: 
        k = zza.zzg(paramParcel, n);
        n = 6;
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
    Object localObject2 = new com/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity;
    ((PersonEntity.UrlsEntity)localObject2).<init>((Set)localObject1, m, str2, k, str1, i);
    return (PersonEntity.UrlsEntity)localObject2;
  }
  
  public PersonEntity.UrlsEntity[] zzjU(int paramInt)
  {
    return new PersonEntity.UrlsEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */