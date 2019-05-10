package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzi
  implements Parcelable.Creator
{
  static void zza(PersonEntity.PlacesLivedEntity paramPlacesLivedEntity, Parcel paramParcel, int paramInt)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = zzb.zzav(paramParcel);
    Object localObject = paramPlacesLivedEntity.zzbeN;
    Integer localInteger = Integer.valueOf(k);
    boolean bool1 = ((Set)localObject).contains(localInteger);
    if (bool1)
    {
      int n = paramPlacesLivedEntity.mVersionCode;
      zzb.zzc(paramParcel, k, n);
    }
    localInteger = Integer.valueOf(j);
    boolean bool2 = ((Set)localObject).contains(localInteger);
    if (bool2)
    {
      bool2 = paramPlacesLivedEntity.zzbgr;
      zzb.zza(paramParcel, j, bool2);
    }
    localInteger = Integer.valueOf(i);
    boolean bool3 = ((Set)localObject).contains(localInteger);
    if (bool3)
    {
      localObject = paramPlacesLivedEntity.mValue;
      zzb.zza(paramParcel, i, (String)localObject, k);
    }
    zzb.zzI(paramParcel, m);
  }
  
  public PersonEntity.PlacesLivedEntity zzgM(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject2 = null;
    int j = 0;
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
        bool = zza.zzc(paramParcel, k);
        k = 2;
        localInteger = Integer.valueOf(k);
        localHashSet.add(localInteger);
        break;
      case 3: 
        localObject2 = zza.zzp(paramParcel, k);
        k = 3;
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
    PersonEntity.PlacesLivedEntity localPlacesLivedEntity = new com/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity;
    localPlacesLivedEntity.<init>(localHashSet, j, bool, (String)localObject2);
    return localPlacesLivedEntity;
  }
  
  public PersonEntity.PlacesLivedEntity[] zzjT(int paramInt)
  {
    return new PersonEntity.PlacesLivedEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */