package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zza
  implements Parcelable.Creator
{
  static void zza(ItemScopeEntity paramItemScopeEntity, Parcel paramParcel, int paramInt)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    int i1 = zzb.zzav(paramParcel);
    Set localSet = paramItemScopeEntity.zzbeN;
    Object localObject1 = Integer.valueOf(n);
    boolean bool1 = localSet.contains(localObject1);
    if (bool1)
    {
      int i2 = paramItemScopeEntity.mVersionCode;
      zzb.zzc(paramParcel, n, i2);
    }
    localObject1 = Integer.valueOf(m);
    boolean bool2 = localSet.contains(localObject1);
    if (bool2)
    {
      localObject1 = paramItemScopeEntity.zzbeO;
      zzb.zza(paramParcel, m, (Parcelable)localObject1, paramInt, n);
    }
    localObject1 = Integer.valueOf(k);
    bool2 = localSet.contains(localObject1);
    if (bool2)
    {
      localObject1 = paramItemScopeEntity.zzbeP;
      zzb.zzb(paramParcel, k, (List)localObject1, n);
    }
    localObject1 = Integer.valueOf(j);
    bool2 = localSet.contains(localObject1);
    if (bool2)
    {
      localObject1 = paramItemScopeEntity.zzbeQ;
      zzb.zza(paramParcel, j, (Parcelable)localObject1, paramInt, n);
    }
    localObject1 = Integer.valueOf(i);
    bool2 = localSet.contains(localObject1);
    if (bool2)
    {
      localObject1 = paramItemScopeEntity.zzbeR;
      zzb.zza(paramParcel, i, (String)localObject1, n);
    }
    localObject1 = Integer.valueOf(6);
    bool2 = localSet.contains(localObject1);
    Object localObject2;
    if (bool2)
    {
      int i3 = 6;
      localObject2 = paramItemScopeEntity.zzbeS;
      zzb.zza(paramParcel, i3, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(7);
    boolean bool3 = localSet.contains(localObject1);
    if (bool3)
    {
      int i4 = 7;
      localObject2 = paramItemScopeEntity.zzbeT;
      zzb.zza(paramParcel, i4, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(8);
    boolean bool4 = localSet.contains(localObject1);
    if (bool4)
    {
      int i5 = 8;
      localObject2 = paramItemScopeEntity.zzbeU;
      zzb.zzc(paramParcel, i5, (List)localObject2, n);
    }
    localObject1 = Integer.valueOf(9);
    boolean bool5 = localSet.contains(localObject1);
    if (bool5)
    {
      int i6 = 9;
      m = paramItemScopeEntity.zzbeV;
      zzb.zzc(paramParcel, i6, m);
    }
    localObject1 = Integer.valueOf(10);
    boolean bool6 = localSet.contains(localObject1);
    if (bool6)
    {
      int i7 = 10;
      localObject2 = paramItemScopeEntity.zzbeW;
      zzb.zzc(paramParcel, i7, (List)localObject2, n);
    }
    localObject1 = Integer.valueOf(11);
    boolean bool7 = localSet.contains(localObject1);
    if (bool7)
    {
      int i8 = 11;
      localObject2 = paramItemScopeEntity.zzbeX;
      zzb.zza(paramParcel, i8, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(12);
    boolean bool8 = localSet.contains(localObject1);
    if (bool8)
    {
      int i9 = 12;
      localObject2 = paramItemScopeEntity.zzbeY;
      zzb.zzc(paramParcel, i9, (List)localObject2, n);
    }
    localObject1 = Integer.valueOf(13);
    boolean bool9 = localSet.contains(localObject1);
    if (bool9)
    {
      int i10 = 13;
      localObject2 = paramItemScopeEntity.zzbeZ;
      zzb.zza(paramParcel, i10, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(14);
    boolean bool10 = localSet.contains(localObject1);
    if (bool10)
    {
      int i11 = 14;
      localObject2 = paramItemScopeEntity.zzbfa;
      zzb.zza(paramParcel, i11, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(15);
    boolean bool11 = localSet.contains(localObject1);
    if (bool11)
    {
      int i12 = 15;
      localObject2 = paramItemScopeEntity.zzbfb;
      zzb.zza(paramParcel, i12, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(17);
    boolean bool12 = localSet.contains(localObject1);
    if (bool12)
    {
      int i13 = 17;
      localObject2 = paramItemScopeEntity.zzbfd;
      zzb.zza(paramParcel, i13, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(16);
    boolean bool13 = localSet.contains(localObject1);
    if (bool13)
    {
      int i14 = 16;
      localObject2 = paramItemScopeEntity.zzbfc;
      zzb.zza(paramParcel, i14, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(19);
    boolean bool14 = localSet.contains(localObject1);
    if (bool14)
    {
      int i15 = 19;
      localObject2 = paramItemScopeEntity.zzbfe;
      zzb.zzc(paramParcel, i15, (List)localObject2, n);
    }
    localObject1 = Integer.valueOf(18);
    boolean bool15 = localSet.contains(localObject1);
    if (bool15)
    {
      int i16 = 18;
      localObject2 = paramItemScopeEntity.zztZ;
      zzb.zza(paramParcel, i16, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(21);
    boolean bool16 = localSet.contains(localObject1);
    if (bool16)
    {
      int i17 = 21;
      localObject2 = paramItemScopeEntity.zzbfg;
      zzb.zza(paramParcel, i17, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(20);
    boolean bool17 = localSet.contains(localObject1);
    if (bool17)
    {
      int i18 = 20;
      localObject2 = paramItemScopeEntity.zzbff;
      zzb.zza(paramParcel, i18, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(23);
    boolean bool18 = localSet.contains(localObject1);
    if (bool18)
    {
      int i19 = 23;
      localObject2 = paramItemScopeEntity.zzaxl;
      zzb.zza(paramParcel, i19, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(22);
    boolean bool19 = localSet.contains(localObject1);
    if (bool19)
    {
      int i20 = 22;
      localObject2 = paramItemScopeEntity.zzbfh;
      zzb.zza(paramParcel, i20, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(25);
    boolean bool20 = localSet.contains(localObject1);
    if (bool20)
    {
      int i21 = 25;
      localObject2 = paramItemScopeEntity.zzbfj;
      zzb.zza(paramParcel, i21, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(24);
    boolean bool21 = localSet.contains(localObject1);
    if (bool21)
    {
      int i22 = 24;
      localObject2 = paramItemScopeEntity.zzbfi;
      zzb.zza(paramParcel, i22, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(27);
    boolean bool22 = localSet.contains(localObject1);
    if (bool22)
    {
      int i23 = 27;
      localObject2 = paramItemScopeEntity.zzbfl;
      zzb.zza(paramParcel, i23, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(26);
    boolean bool23 = localSet.contains(localObject1);
    if (bool23)
    {
      int i24 = 26;
      localObject2 = paramItemScopeEntity.zzbfk;
      zzb.zza(paramParcel, i24, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(29);
    boolean bool24 = localSet.contains(localObject1);
    if (bool24)
    {
      int i25 = 29;
      localObject2 = paramItemScopeEntity.zzbfn;
      zzb.zza(paramParcel, i25, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(28);
    boolean bool25 = localSet.contains(localObject1);
    if (bool25)
    {
      int i26 = 28;
      localObject2 = paramItemScopeEntity.zzbfm;
      zzb.zza(paramParcel, i26, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(31);
    boolean bool26 = localSet.contains(localObject1);
    if (bool26)
    {
      int i27 = 31;
      localObject2 = paramItemScopeEntity.zzbfp;
      zzb.zza(paramParcel, i27, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(30);
    boolean bool27 = localSet.contains(localObject1);
    if (bool27)
    {
      int i28 = 30;
      localObject2 = paramItemScopeEntity.zzbfo;
      zzb.zza(paramParcel, i28, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(34);
    boolean bool28 = localSet.contains(localObject1);
    if (bool28)
    {
      int i29 = 34;
      localObject2 = paramItemScopeEntity.zzbfr;
      zzb.zza(paramParcel, i29, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(32);
    boolean bool29 = localSet.contains(localObject1);
    if (bool29)
    {
      int i30 = 32;
      localObject2 = paramItemScopeEntity.zzyv;
      zzb.zza(paramParcel, i30, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(33);
    boolean bool30 = localSet.contains(localObject1);
    if (bool30)
    {
      int i31 = 33;
      localObject2 = paramItemScopeEntity.zzbfq;
      zzb.zza(paramParcel, i31, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(38);
    boolean bool31 = localSet.contains(localObject1);
    double d;
    if (bool31)
    {
      int i32 = 38;
      d = paramItemScopeEntity.zzaNG;
      zzb.zza(paramParcel, i32, d);
    }
    localObject1 = Integer.valueOf(39);
    boolean bool32 = localSet.contains(localObject1);
    if (bool32)
    {
      int i33 = 39;
      localObject2 = paramItemScopeEntity.mName;
      zzb.zza(paramParcel, i33, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(36);
    boolean bool33 = localSet.contains(localObject1);
    if (bool33)
    {
      int i34 = 36;
      d = paramItemScopeEntity.zzaNF;
      zzb.zza(paramParcel, i34, d);
    }
    localObject1 = Integer.valueOf(37);
    boolean bool34 = localSet.contains(localObject1);
    if (bool34)
    {
      int i35 = 37;
      localObject2 = paramItemScopeEntity.zzbfs;
      zzb.zza(paramParcel, i35, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(42);
    boolean bool35 = localSet.contains(localObject1);
    if (bool35)
    {
      int i36 = 42;
      localObject2 = paramItemScopeEntity.zzbfv;
      zzb.zza(paramParcel, i36, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(43);
    boolean bool36 = localSet.contains(localObject1);
    if (bool36)
    {
      int i37 = 43;
      localObject2 = paramItemScopeEntity.zzbfw;
      zzb.zza(paramParcel, i37, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(40);
    boolean bool37 = localSet.contains(localObject1);
    if (bool37)
    {
      int i38 = 40;
      localObject2 = paramItemScopeEntity.zzbft;
      zzb.zza(paramParcel, i38, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(41);
    boolean bool38 = localSet.contains(localObject1);
    if (bool38)
    {
      int i39 = 41;
      localObject2 = paramItemScopeEntity.zzbfu;
      zzb.zzc(paramParcel, i39, (List)localObject2, n);
    }
    localObject1 = Integer.valueOf(46);
    boolean bool39 = localSet.contains(localObject1);
    if (bool39)
    {
      int i40 = 46;
      localObject2 = paramItemScopeEntity.zzbfz;
      zzb.zza(paramParcel, i40, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(47);
    boolean bool40 = localSet.contains(localObject1);
    if (bool40)
    {
      int i41 = 47;
      localObject2 = paramItemScopeEntity.zzbfA;
      zzb.zza(paramParcel, i41, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(44);
    boolean bool41 = localSet.contains(localObject1);
    if (bool41)
    {
      int i42 = 44;
      localObject2 = paramItemScopeEntity.zzbfx;
      zzb.zza(paramParcel, i42, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(45);
    boolean bool42 = localSet.contains(localObject1);
    if (bool42)
    {
      int i43 = 45;
      localObject2 = paramItemScopeEntity.zzbfy;
      zzb.zza(paramParcel, i43, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(51);
    boolean bool43 = localSet.contains(localObject1);
    if (bool43)
    {
      int i44 = 51;
      localObject2 = paramItemScopeEntity.zzbfE;
      zzb.zza(paramParcel, i44, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(50);
    boolean bool44 = localSet.contains(localObject1);
    if (bool44)
    {
      int i45 = 50;
      localObject2 = paramItemScopeEntity.zzbfD;
      zzb.zza(paramParcel, i45, (Parcelable)localObject2, paramInt, n);
    }
    localObject1 = Integer.valueOf(49);
    boolean bool45 = localSet.contains(localObject1);
    if (bool45)
    {
      int i46 = 49;
      localObject2 = paramItemScopeEntity.zzbfC;
      zzb.zza(paramParcel, i46, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(48);
    boolean bool46 = localSet.contains(localObject1);
    if (bool46)
    {
      int i47 = 48;
      localObject2 = paramItemScopeEntity.zzbfB;
      zzb.zza(paramParcel, i47, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(55);
    boolean bool47 = localSet.contains(localObject1);
    if (bool47)
    {
      int i48 = 55;
      localObject2 = paramItemScopeEntity.zzbfG;
      zzb.zza(paramParcel, i48, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(54);
    boolean bool48 = localSet.contains(localObject1);
    if (bool48)
    {
      int i49 = 54;
      localObject2 = paramItemScopeEntity.zzF;
      zzb.zza(paramParcel, i49, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(53);
    boolean bool49 = localSet.contains(localObject1);
    if (bool49)
    {
      int i50 = 53;
      localObject2 = paramItemScopeEntity.zzJN;
      zzb.zza(paramParcel, i50, (String)localObject2, n);
    }
    localObject1 = Integer.valueOf(52);
    boolean bool50 = localSet.contains(localObject1);
    if (bool50)
    {
      i51 = 52;
      localObject2 = paramItemScopeEntity.zzbfF;
      zzb.zza(paramParcel, i51, (String)localObject2, n);
    }
    int i51 = 56;
    localObject1 = Integer.valueOf(i51);
    boolean bool51 = localSet.contains(localObject1);
    if (bool51)
    {
      int i52 = 56;
      localObject1 = paramItemScopeEntity.zzbfH;
      zzb.zza(paramParcel, i52, (String)localObject1, n);
    }
    zzb.zzI(paramParcel, i1);
  }
  
  public ItemScopeEntity zzgC(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    ArrayList localArrayList = null;
    int m = 0;
    Object localObject3 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    Object localObject4 = null;
    int n = 0;
    Object localObject5 = null;
    int i1 = 0;
    Object localObject6 = null;
    Object localObject7 = null;
    String str4 = null;
    String str5 = null;
    int i2 = 0;
    Object localObject8 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    Object localObject9 = null;
    String str9 = null;
    String str10 = null;
    String str11 = null;
    String str12 = null;
    String str13 = null;
    String str14 = null;
    String str15 = null;
    String str16 = null;
    String str17 = null;
    int i3 = 0;
    Object localObject10 = null;
    String str18 = null;
    String str19 = null;
    String str20 = null;
    String str21 = null;
    int i4 = 0;
    Object localObject11 = null;
    double d1 = 0.0D;
    int i5 = 0;
    Object localObject12 = null;
    double d2 = 0.0D;
    String str22 = null;
    int i6 = 0;
    Object localObject13 = null;
    Object localObject14 = null;
    String str23 = null;
    String str24 = null;
    String str25 = null;
    String str26 = null;
    int i7 = 0;
    Object localObject15 = null;
    String str27 = null;
    String str28 = null;
    String str29 = null;
    int i8 = 0;
    Object localObject16 = null;
    String str30 = null;
    String str31 = null;
    String str32 = null;
    String str33 = null;
    String str34 = null;
    String str35 = null;
    for (;;)
    {
      i9 = paramParcel.dataPosition();
      if (i9 >= i) {
        break;
      }
      i9 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i10 = com.google.android.gms.common.internal.safeparcel.zza.zzca(i9);
      switch (i10)
      {
      case 35: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i9);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i9);
        i9 = 1;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 2: 
        localObject2 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject2);
        k = 2;
        localObject2 = Integer.valueOf(k);
        ((Set)localObject1).add(localObject2);
        localObject2 = localObject17;
        break;
      case 3: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.zza.zzD(paramParcel, i9);
        i9 = 3;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 4: 
        localObject3 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject3);
        m = 4;
        localObject3 = Integer.valueOf(m);
        ((Set)localObject1).add(localObject3);
        localObject3 = localObject17;
        break;
      case 5: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 5;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 6: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 6;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 7: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 7;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 8: 
        localObject4 = ItemScopeEntity.CREATOR;
        localObject4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i9, (Parcelable.Creator)localObject4);
        i9 = 8;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 9: 
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i9);
        i9 = 9;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 10: 
        localObject5 = ItemScopeEntity.CREATOR;
        localObject5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i9, (Parcelable.Creator)localObject5);
        i9 = 10;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 11: 
        localObject6 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject6);
        i1 = 11;
        localObject6 = Integer.valueOf(i1);
        ((Set)localObject1).add(localObject6);
        localObject6 = localObject17;
        break;
      case 12: 
        localObject7 = ItemScopeEntity.CREATOR;
        localObject7 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i9, (Parcelable.Creator)localObject7);
        i9 = 12;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 13: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 13;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 14: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 14;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 15: 
        localObject8 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject8);
        i2 = 15;
        localObject8 = Integer.valueOf(i2);
        ((Set)localObject1).add(localObject8);
        localObject8 = localObject17;
        break;
      case 17: 
        str7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 17;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 16: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 16;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 19: 
        localObject9 = ItemScopeEntity.CREATOR;
        localObject9 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i9, (Parcelable.Creator)localObject9);
        i9 = 19;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 18: 
        str8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 18;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 21: 
        str10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 21;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 20: 
        str9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 20;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 23: 
        str12 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 23;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 22: 
        str11 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 22;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 25: 
        str14 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 25;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 24: 
        str13 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 24;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 27: 
        str16 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 27;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 26: 
        str15 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 26;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 29: 
        localObject10 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject10);
        i3 = 29;
        localObject10 = Integer.valueOf(i3);
        ((Set)localObject1).add(localObject10);
        localObject10 = localObject17;
        break;
      case 28: 
        str17 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 28;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 31: 
        str19 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 31;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 30: 
        str18 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 30;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 34: 
        localObject11 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject11);
        i4 = 34;
        localObject11 = Integer.valueOf(i4);
        ((Set)localObject1).add(localObject11);
        localObject11 = localObject17;
        break;
      case 32: 
        str20 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 32;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 33: 
        str21 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 33;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 38: 
        d2 = com.google.android.gms.common.internal.safeparcel.zza.zzn(paramParcel, i9);
        i9 = 38;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 39: 
        str22 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 39;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 36: 
        d1 = com.google.android.gms.common.internal.safeparcel.zza.zzn(paramParcel, i9);
        i9 = 36;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 37: 
        localObject12 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject12);
        i5 = 37;
        localObject12 = Integer.valueOf(i5);
        ((Set)localObject1).add(localObject12);
        localObject12 = localObject17;
        break;
      case 42: 
        str23 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 42;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 43: 
        str24 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 43;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 40: 
        localObject13 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject13);
        i6 = 40;
        localObject13 = Integer.valueOf(i6);
        ((Set)localObject1).add(localObject13);
        localObject13 = localObject17;
        break;
      case 41: 
        localObject14 = ItemScopeEntity.CREATOR;
        localObject14 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i9, (Parcelable.Creator)localObject14);
        i9 = 41;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 46: 
        localObject15 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject15);
        i7 = 46;
        localObject15 = Integer.valueOf(i7);
        ((Set)localObject1).add(localObject15);
        localObject15 = localObject17;
        break;
      case 47: 
        str27 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 47;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 44: 
        str25 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 44;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 45: 
        str26 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 45;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 51: 
        str30 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 51;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 50: 
        localObject16 = ItemScopeEntity.CREATOR;
        localObject17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i9, (Parcelable.Creator)localObject16);
        i8 = 50;
        localObject16 = Integer.valueOf(i8);
        ((Set)localObject1).add(localObject16);
        localObject16 = localObject17;
        break;
      case 49: 
        str29 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 49;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 48: 
        str28 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 48;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 55: 
        str34 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 55;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 54: 
        str33 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 54;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 53: 
        str32 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 53;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 52: 
        str31 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 52;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
        break;
      case 56: 
        str35 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i9);
        i9 = 56;
        localObject17 = Integer.valueOf(i9);
        ((Set)localObject1).add(localObject17);
      }
    }
    int i9 = paramParcel.dataPosition();
    if (i9 != i)
    {
      localObject17 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject17).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject17);
    }
    Object localObject17 = new com/google/android/gms/plus/internal/model/moments/ItemScopeEntity;
    ((ItemScopeEntity)localObject17).<init>((Set)localObject1, j, (ItemScopeEntity)localObject2, localArrayList, (ItemScopeEntity)localObject3, str1, str2, str3, (List)localObject4, n, (List)localObject5, (ItemScopeEntity)localObject6, (List)localObject7, str4, str5, (ItemScopeEntity)localObject8, str6, str7, str8, (List)localObject9, str9, str10, str11, str12, str13, str14, str15, str16, str17, (ItemScopeEntity)localObject10, str18, str19, str20, str21, (ItemScopeEntity)localObject11, d1, (ItemScopeEntity)localObject12, d2, str22, (ItemScopeEntity)localObject13, (List)localObject14, str23, str24, str25, str26, (ItemScopeEntity)localObject15, str27, str28, str29, (ItemScopeEntity)localObject16, str30, str31, str32, str33, str34, str35);
    return (ItemScopeEntity)localObject17;
  }
  
  public ItemScopeEntity[] zzjJ(int paramInt)
  {
    return new ItemScopeEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\moments\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */