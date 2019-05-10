package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzg
  implements Parcelable.Creator
{
  static void zza(PersonEntity.NameEntity paramNameEntity, Parcel paramParcel, int paramInt)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    int i1 = zzb.zzav(paramParcel);
    Set localSet = paramNameEntity.zzbeN;
    Object localObject = Integer.valueOf(n);
    boolean bool1 = localSet.contains(localObject);
    if (bool1)
    {
      int i2 = paramNameEntity.mVersionCode;
      zzb.zzc(paramParcel, n, i2);
    }
    localObject = Integer.valueOf(m);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramNameEntity.zzbfl;
      zzb.zza(paramParcel, m, (String)localObject, n);
    }
    localObject = Integer.valueOf(k);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramNameEntity.zzbgl;
      zzb.zza(paramParcel, k, (String)localObject, n);
    }
    localObject = Integer.valueOf(j);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramNameEntity.zzbfo;
      zzb.zza(paramParcel, j, (String)localObject, n);
    }
    localObject = Integer.valueOf(i);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramNameEntity.zzbgm;
      zzb.zza(paramParcel, i, (String)localObject, n);
    }
    localObject = Integer.valueOf(6);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      i3 = 6;
      String str = paramNameEntity.zzbgn;
      zzb.zza(paramParcel, i3, str, n);
    }
    int i3 = 7;
    localObject = Integer.valueOf(i3);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      int i4 = 7;
      localObject = paramNameEntity.zzbgo;
      zzb.zza(paramParcel, i4, (String)localObject, n);
    }
    zzb.zzI(paramParcel, i1);
  }
  
  public PersonEntity.NameEntity zzgK(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
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
        ((Set)localObject1).add(localInteger);
        break;
      case 2: 
        str6 = zza.zzp(paramParcel, k);
        k = 2;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, k);
        k = 3;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, k);
        k = 4;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        k = 5;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        k = 6;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, k);
        k = 7;
        localInteger = Integer.valueOf(k);
        ((Set)localObject1).add(localInteger);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new com/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity;
    ((PersonEntity.NameEntity)localObject2).<init>((Set)localObject1, j, str6, str5, str4, str3, str2, str1);
    return (PersonEntity.NameEntity)localObject2;
  }
  
  public PersonEntity.NameEntity[] zzjR(int paramInt)
  {
    return new PersonEntity.NameEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */