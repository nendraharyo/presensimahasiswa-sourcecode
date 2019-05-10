package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PersonEntity.OrganizationsEntity paramOrganizationsEntity, Parcel paramParcel, int paramInt)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    int i1 = zzb.zzav(paramParcel);
    Set localSet = paramOrganizationsEntity.zzbeN;
    Object localObject = Integer.valueOf(n);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      int i2 = paramOrganizationsEntity.mVersionCode;
      zzb.zzc(paramParcel, n, i2);
    }
    localObject = Integer.valueOf(m);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramOrganizationsEntity.zzbgp;
      zzb.zza(paramParcel, m, (String)localObject, n);
    }
    localObject = Integer.valueOf(k);
    bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramOrganizationsEntity.zzaxl;
      zzb.zza(paramParcel, k, (String)localObject, n);
    }
    localObject = Integer.valueOf(j);
    bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramOrganizationsEntity.zzbfk;
      zzb.zza(paramParcel, j, (String)localObject, n);
    }
    localObject = Integer.valueOf(i);
    bool3 = localSet.contains(localObject);
    if (bool3)
    {
      localObject = paramOrganizationsEntity.zzbgq;
      zzb.zza(paramParcel, i, (String)localObject, n);
    }
    localObject = Integer.valueOf(6);
    bool3 = localSet.contains(localObject);
    String str;
    if (bool3)
    {
      int i3 = 6;
      str = paramOrganizationsEntity.mName;
      zzb.zza(paramParcel, i3, str, n);
    }
    localObject = Integer.valueOf(7);
    boolean bool4 = localSet.contains(localObject);
    if (bool4)
    {
      int i4 = 7;
      boolean bool1 = paramOrganizationsEntity.zzbgr;
      zzb.zza(paramParcel, i4, bool1);
    }
    localObject = Integer.valueOf(8);
    boolean bool5 = localSet.contains(localObject);
    if (bool5)
    {
      int i5 = 8;
      str = paramOrganizationsEntity.zzbfA;
      zzb.zza(paramParcel, i5, str, n);
    }
    localObject = Integer.valueOf(9);
    boolean bool6 = localSet.contains(localObject);
    if (bool6)
    {
      i6 = 9;
      str = paramOrganizationsEntity.zzapg;
      zzb.zza(paramParcel, i6, str, n);
    }
    int i6 = 10;
    localObject = Integer.valueOf(i6);
    boolean bool7 = localSet.contains(localObject);
    if (bool7)
    {
      int i7 = 10;
      i6 = paramOrganizationsEntity.zzabB;
      zzb.zzc(paramParcel, i7, i6);
    }
    zzb.zzI(paramParcel, i1);
  }
  
  public PersonEntity.OrganizationsEntity zzgL(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    String str2 = null;
    boolean bool = false;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      Integer localInteger;
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        m = 1;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 2: 
        str7 = zza.zzp(paramParcel, m);
        m = 2;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 3: 
        str6 = zza.zzp(paramParcel, m);
        m = 3;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, m);
        m = 4;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, m);
        m = 5;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, m);
        m = 6;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 7: 
        bool = zza.zzc(paramParcel, m);
        m = 7;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 8: 
        str2 = zza.zzp(paramParcel, m);
        m = 8;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, m);
        m = 9;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
        break;
      case 10: 
        i = zza.zzg(paramParcel, m);
        m = 10;
        localInteger = Integer.valueOf(m);
        ((Set)localObject1).add(localInteger);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new com/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity;
    ((PersonEntity.OrganizationsEntity)localObject2).<init>((Set)localObject1, k, str7, str6, str5, str4, str3, bool, str2, str1, i);
    return (PersonEntity.OrganizationsEntity)localObject2;
  }
  
  public PersonEntity.OrganizationsEntity[] zzjS(int paramInt)
  {
    return new PersonEntity.OrganizationsEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */