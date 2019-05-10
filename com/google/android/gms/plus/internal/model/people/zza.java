package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zza
  implements Parcelable.Creator
{
  static void zza(PersonEntity paramPersonEntity, Parcel paramParcel, int paramInt)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int i1 = 1;
    int i2 = zzb.zzav(paramParcel);
    Set localSet = paramPersonEntity.zzbeN;
    Object localObject1 = Integer.valueOf(i1);
    boolean bool3 = localSet.contains(localObject1);
    if (bool3)
    {
      int i3 = paramPersonEntity.mVersionCode;
      zzb.zzc(paramParcel, i1, i3);
    }
    localObject1 = Integer.valueOf(m);
    boolean bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      localObject1 = paramPersonEntity.zzbfL;
      zzb.zza(paramParcel, m, (String)localObject1, i1);
    }
    localObject1 = Integer.valueOf(k);
    bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      localObject1 = paramPersonEntity.zzbfM;
      zzb.zza(paramParcel, k, (Parcelable)localObject1, paramInt, i1);
    }
    localObject1 = Integer.valueOf(j);
    bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      localObject1 = paramPersonEntity.zzbfN;
      zzb.zza(paramParcel, j, (String)localObject1, i1);
    }
    localObject1 = Integer.valueOf(i);
    bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      localObject1 = paramPersonEntity.zzbfO;
      zzb.zza(paramParcel, i, (String)localObject1, i1);
    }
    localObject1 = Integer.valueOf(6);
    bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      int i4 = 6;
      m = paramPersonEntity.zzbfP;
      zzb.zzc(paramParcel, i4, m);
    }
    localObject1 = Integer.valueOf(7);
    boolean bool5 = localSet.contains(localObject1);
    Object localObject2;
    if (bool5)
    {
      int i5 = 7;
      localObject2 = paramPersonEntity.zzbfQ;
      zzb.zza(paramParcel, i5, (Parcelable)localObject2, paramInt, i1);
    }
    localObject1 = Integer.valueOf(8);
    boolean bool6 = localSet.contains(localObject1);
    if (bool6)
    {
      int i6 = 8;
      localObject2 = paramPersonEntity.zzbfR;
      zzb.zza(paramParcel, i6, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(9);
    boolean bool7 = localSet.contains(localObject1);
    if (bool7)
    {
      int i7 = 9;
      localObject2 = paramPersonEntity.zzWQ;
      zzb.zza(paramParcel, i7, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(12);
    boolean bool8 = localSet.contains(localObject1);
    if (bool8)
    {
      int i8 = 12;
      m = paramPersonEntity.zztT;
      zzb.zzc(paramParcel, i8, m);
    }
    localObject1 = Integer.valueOf(14);
    boolean bool9 = localSet.contains(localObject1);
    if (bool9)
    {
      int i9 = 14;
      localObject2 = paramPersonEntity.zzyv;
      zzb.zza(paramParcel, i9, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(15);
    boolean bool10 = localSet.contains(localObject1);
    if (bool10)
    {
      int i10 = 15;
      localObject2 = paramPersonEntity.zzbfS;
      zzb.zza(paramParcel, i10, (Parcelable)localObject2, paramInt, i1);
    }
    localObject1 = Integer.valueOf(16);
    boolean bool11 = localSet.contains(localObject1);
    if (bool11)
    {
      int i11 = 16;
      boolean bool1 = paramPersonEntity.zzbfT;
      zzb.zza(paramParcel, i11, bool1);
    }
    localObject1 = Integer.valueOf(19);
    boolean bool12 = localSet.contains(localObject1);
    if (bool12)
    {
      int i12 = 19;
      localObject2 = paramPersonEntity.zzbfU;
      zzb.zza(paramParcel, i12, (Parcelable)localObject2, paramInt, i1);
    }
    localObject1 = Integer.valueOf(18);
    boolean bool13 = localSet.contains(localObject1);
    if (bool13)
    {
      int i13 = 18;
      localObject2 = paramPersonEntity.zzaaL;
      zzb.zza(paramParcel, i13, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(21);
    boolean bool14 = localSet.contains(localObject1);
    int n;
    if (bool14)
    {
      int i14 = 21;
      n = paramPersonEntity.zzbfW;
      zzb.zzc(paramParcel, i14, n);
    }
    localObject1 = Integer.valueOf(20);
    boolean bool15 = localSet.contains(localObject1);
    if (bool15)
    {
      int i15 = 20;
      localObject2 = paramPersonEntity.zzbfV;
      zzb.zza(paramParcel, i15, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(23);
    boolean bool16 = localSet.contains(localObject1);
    if (bool16)
    {
      int i16 = 23;
      localObject2 = paramPersonEntity.zzbfY;
      zzb.zzc(paramParcel, i16, (List)localObject2, i1);
    }
    localObject1 = Integer.valueOf(22);
    boolean bool17 = localSet.contains(localObject1);
    if (bool17)
    {
      int i17 = 22;
      localObject2 = paramPersonEntity.zzbfX;
      zzb.zzc(paramParcel, i17, (List)localObject2, i1);
    }
    localObject1 = Integer.valueOf(25);
    boolean bool18 = localSet.contains(localObject1);
    if (bool18)
    {
      int i18 = 25;
      n = paramPersonEntity.zzbga;
      zzb.zzc(paramParcel, i18, n);
    }
    localObject1 = Integer.valueOf(24);
    boolean bool19 = localSet.contains(localObject1);
    if (bool19)
    {
      int i19 = 24;
      n = paramPersonEntity.zzbfZ;
      zzb.zzc(paramParcel, i19, n);
    }
    localObject1 = Integer.valueOf(27);
    boolean bool20 = localSet.contains(localObject1);
    if (bool20)
    {
      int i20 = 27;
      localObject2 = paramPersonEntity.zzF;
      zzb.zza(paramParcel, i20, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(26);
    boolean bool21 = localSet.contains(localObject1);
    if (bool21)
    {
      int i21 = 26;
      localObject2 = paramPersonEntity.zzbgb;
      zzb.zza(paramParcel, i21, (String)localObject2, i1);
    }
    localObject1 = Integer.valueOf(29);
    boolean bool22 = localSet.contains(localObject1);
    if (bool22)
    {
      i22 = 29;
      boolean bool2 = paramPersonEntity.zzbgd;
      zzb.zza(paramParcel, i22, bool2);
    }
    int i22 = 28;
    localObject1 = Integer.valueOf(i22);
    boolean bool23 = localSet.contains(localObject1);
    if (bool23)
    {
      int i23 = 28;
      localObject1 = paramPersonEntity.zzbgc;
      zzb.zzc(paramParcel, i23, (List)localObject1, i1);
    }
    zzb.zzI(paramParcel, i2);
  }
  
  public PersonEntity zzgE(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int j = 0;
    String str1 = null;
    int k = 0;
    Object localObject2 = null;
    String str2 = null;
    String str3 = null;
    int m = 0;
    int n = 0;
    Object localObject3 = null;
    String str4 = null;
    String str5 = null;
    int i1 = 0;
    String str6 = null;
    int i2 = 0;
    Object localObject4 = null;
    boolean bool1 = false;
    String str7 = null;
    int i3 = 0;
    Object localObject5 = null;
    String str8 = null;
    int i4 = 0;
    Object localObject6 = null;
    Object localObject7 = null;
    int i5 = 0;
    int i6 = 0;
    String str9 = null;
    String str10 = null;
    Object localObject8 = null;
    boolean bool2 = false;
    for (;;)
    {
      i7 = paramParcel.dataPosition();
      if (i7 >= i) {
        break;
      }
      i7 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i8 = com.google.android.gms.common.internal.safeparcel.zza.zzca(i7);
      switch (i8)
      {
      case 10: 
      case 11: 
      case 13: 
      case 17: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i7);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 1;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 2: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 2;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 3: 
        localObject2 = PersonEntity.AgeRangeEntity.CREATOR;
        localObject9 = (PersonEntity.AgeRangeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i7, (Parcelable.Creator)localObject2);
        k = 3;
        localObject2 = Integer.valueOf(k);
        ((Set)localObject1).add(localObject2);
        localObject2 = localObject9;
        break;
      case 4: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 4;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 5: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 5;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 6: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 6;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 7: 
        localObject3 = PersonEntity.CoverEntity.CREATOR;
        localObject9 = (PersonEntity.CoverEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i7, (Parcelable.Creator)localObject3);
        n = 7;
        localObject3 = Integer.valueOf(n);
        ((Set)localObject1).add(localObject3);
        localObject3 = localObject9;
        break;
      case 8: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 8;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 9: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 9;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 12: 
        i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 12;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 14: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 14;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 15: 
        localObject4 = PersonEntity.ImageEntity.CREATOR;
        localObject9 = (PersonEntity.ImageEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i7, (Parcelable.Creator)localObject4);
        i2 = 15;
        localObject4 = Integer.valueOf(i2);
        ((Set)localObject1).add(localObject4);
        localObject4 = localObject9;
        break;
      case 16: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i7);
        i7 = 16;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 19: 
        localObject5 = PersonEntity.NameEntity.CREATOR;
        localObject9 = (PersonEntity.NameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i7, (Parcelable.Creator)localObject5);
        i3 = 19;
        localObject5 = Integer.valueOf(i3);
        ((Set)localObject1).add(localObject5);
        localObject5 = localObject9;
        break;
      case 18: 
        str7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 18;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 21: 
        i4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 21;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 20: 
        str8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 20;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 23: 
        localObject7 = PersonEntity.PlacesLivedEntity.CREATOR;
        localObject7 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i7, (Parcelable.Creator)localObject7);
        i7 = 23;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 22: 
        localObject6 = PersonEntity.OrganizationsEntity.CREATOR;
        localObject6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i7, (Parcelable.Creator)localObject6);
        i7 = 22;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 25: 
        i6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 25;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 24: 
        i5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i7);
        i7 = 24;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 27: 
        str10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 27;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 26: 
        str9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i7);
        i7 = 26;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 29: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i7);
        i7 = 29;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
        break;
      case 28: 
        localObject8 = PersonEntity.UrlsEntity.CREATOR;
        localObject8 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i7, (Parcelable.Creator)localObject8);
        i7 = 28;
        localObject9 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject9);
      }
    }
    int i7 = paramParcel.dataPosition();
    if (i7 != i)
    {
      localObject9 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject9).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject9);
    }
    Object localObject9 = new com/google/android/gms/plus/internal/model/people/PersonEntity;
    ((PersonEntity)localObject9).<init>((Set)localObject1, j, str1, (PersonEntity.AgeRangeEntity)localObject2, str2, str3, m, (PersonEntity.CoverEntity)localObject3, str4, str5, i1, str6, (PersonEntity.ImageEntity)localObject4, bool1, str7, (PersonEntity.NameEntity)localObject5, str8, i4, (List)localObject6, (List)localObject7, i5, i6, str9, str10, (List)localObject8, bool2);
    return (PersonEntity)localObject9;
  }
  
  public PersonEntity[] zzjL(int paramInt)
  {
    return new PersonEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */