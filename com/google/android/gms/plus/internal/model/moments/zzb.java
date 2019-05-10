package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb
  implements Parcelable.Creator
{
  static void zza(MomentEntity paramMomentEntity, Parcel paramParcel, int paramInt)
  {
    int i = 6;
    int j = 5;
    int k = 4;
    int m = 2;
    int n = 1;
    int i1 = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Set localSet = paramMomentEntity.zzbeN;
    Object localObject = Integer.valueOf(n);
    boolean bool1 = localSet.contains(localObject);
    if (bool1)
    {
      int i2 = paramMomentEntity.mVersionCode;
      com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, n, i2);
    }
    localObject = Integer.valueOf(m);
    boolean bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramMomentEntity.zzyv;
      com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, m, (String)localObject, n);
    }
    localObject = Integer.valueOf(k);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramMomentEntity.zzbfI;
      com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, k, (Parcelable)localObject, paramInt, n);
    }
    localObject = Integer.valueOf(j);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramMomentEntity.zzbfA;
      com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, j, (String)localObject, n);
    }
    localObject = Integer.valueOf(i);
    bool2 = localSet.contains(localObject);
    if (bool2)
    {
      localObject = paramMomentEntity.zzbfJ;
      com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, i, (Parcelable)localObject, paramInt, n);
    }
    int i3 = 7;
    localObject = Integer.valueOf(i3);
    boolean bool3 = localSet.contains(localObject);
    if (bool3)
    {
      int i4 = 7;
      localObject = paramMomentEntity.zzJN;
      com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, i4, (String)localObject, n);
    }
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i1);
  }
  
  public MomentEntity zzgD(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    String str2 = null;
    int m = 0;
    Object localObject3 = null;
    String str3 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      case 3: 
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        j = zza.zzg(paramParcel, n);
        n = 1;
        localObject4 = Integer.valueOf(n);
        ((Set)localObject1).add(localObject4);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, n);
        n = 2;
        localObject4 = Integer.valueOf(n);
        ((Set)localObject1).add(localObject4);
        break;
      case 4: 
        localObject3 = ItemScopeEntity.CREATOR;
        localObject4 = (ItemScopeEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        m = 4;
        localObject3 = Integer.valueOf(m);
        ((Set)localObject1).add(localObject3);
        localObject3 = localObject4;
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, n);
        n = 5;
        localObject4 = Integer.valueOf(n);
        ((Set)localObject1).add(localObject4);
        break;
      case 6: 
        localObject2 = ItemScopeEntity.CREATOR;
        localObject4 = (ItemScopeEntity)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        k = 6;
        localObject2 = Integer.valueOf(k);
        ((Set)localObject1).add(localObject2);
        localObject2 = localObject4;
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, n);
        n = 7;
        localObject4 = Integer.valueOf(n);
        ((Set)localObject1).add(localObject4);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/plus/internal/model/moments/MomentEntity;
    ((MomentEntity)localObject4).<init>((Set)localObject1, j, str3, (ItemScopeEntity)localObject3, str2, (ItemScopeEntity)localObject2, str1);
    return (MomentEntity)localObject4;
  }
  
  public MomentEntity[] zzjK(int paramInt)
  {
    return new MomentEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\moments\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */