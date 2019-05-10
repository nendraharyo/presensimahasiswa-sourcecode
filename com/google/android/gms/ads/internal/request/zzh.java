package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzh
  implements Parcelable.Creator
{
  static void zza(AdResponseParcel paramAdResponseParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAdResponseParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAdResponseParcel.zzEF;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramAdResponseParcel.body;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAdResponseParcel.zzBQ;
    zzb.zzb(paramParcel, 4, (List)localObject, false);
    j = paramAdResponseParcel.errorCode;
    zzb.zzc(paramParcel, 5, j);
    localObject = paramAdResponseParcel.zzBR;
    zzb.zzb(paramParcel, 6, (List)localObject, false);
    long l = paramAdResponseParcel.zzHS;
    zzb.zza(paramParcel, 7, l);
    boolean bool1 = paramAdResponseParcel.zzHT;
    zzb.zza(paramParcel, 8, bool1);
    l = paramAdResponseParcel.zzHU;
    zzb.zza(paramParcel, 9, l);
    localObject = paramAdResponseParcel.zzHV;
    zzb.zzb(paramParcel, 10, (List)localObject, false);
    l = paramAdResponseParcel.zzBU;
    zzb.zza(paramParcel, 11, l);
    int k = paramAdResponseParcel.orientation;
    zzb.zzc(paramParcel, 12, k);
    localObject = paramAdResponseParcel.zzHW;
    zzb.zza(paramParcel, 13, (String)localObject, false);
    l = paramAdResponseParcel.zzHX;
    zzb.zza(paramParcel, 14, l);
    localObject = paramAdResponseParcel.zzHY;
    zzb.zza(paramParcel, 15, (String)localObject, false);
    localObject = paramAdResponseParcel.zzIa;
    zzb.zza(paramParcel, 19, (String)localObject, false);
    boolean bool2 = paramAdResponseParcel.zzHZ;
    zzb.zza(paramParcel, 18, bool2);
    localObject = paramAdResponseParcel.zzIb;
    zzb.zza(paramParcel, 21, (String)localObject, false);
    bool2 = paramAdResponseParcel.zzuk;
    zzb.zza(paramParcel, 23, bool2);
    bool2 = paramAdResponseParcel.zzIc;
    zzb.zza(paramParcel, 22, bool2);
    bool2 = paramAdResponseParcel.zzId;
    zzb.zza(paramParcel, 25, bool2);
    bool2 = paramAdResponseParcel.zzHB;
    zzb.zza(paramParcel, 24, bool2);
    int m = paramAdResponseParcel.zzIf;
    zzb.zzc(paramParcel, 27, m);
    boolean bool3 = paramAdResponseParcel.zzIe;
    zzb.zza(paramParcel, 26, bool3);
    localObject = paramAdResponseParcel.zzIh;
    zzb.zza(paramParcel, 29, (String)localObject, false);
    localObject = paramAdResponseParcel.zzIg;
    zzb.zza(paramParcel, 28, (Parcelable)localObject, paramInt, false);
    bool3 = paramAdResponseParcel.zzul;
    zzb.zza(paramParcel, 31, bool3);
    localObject = paramAdResponseParcel.zzIi;
    zzb.zza(paramParcel, 30, (String)localObject, false);
    localObject = paramAdResponseParcel.zzIk;
    zzb.zzb(paramParcel, 34, (List)localObject, false);
    localObject = paramAdResponseParcel.zzIl;
    zzb.zzb(paramParcel, 35, (List)localObject, false);
    bool3 = paramAdResponseParcel.zzum;
    zzb.zza(paramParcel, 32, bool3);
    localObject = paramAdResponseParcel.zzIj;
    zzb.zza(paramParcel, 33, (Parcelable)localObject, paramInt, false);
    bool3 = paramAdResponseParcel.zzIm;
    zzb.zza(paramParcel, 36, bool3);
    zzb.zzI(paramParcel, i);
  }
  
  public AdResponseParcel[] zzH(int paramInt)
  {
    return new AdResponseParcel[paramInt];
  }
  
  public AdResponseParcel zzj(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList1 = null;
    int k = 0;
    ArrayList localArrayList2 = null;
    long l1 = 0L;
    boolean bool1 = false;
    long l2 = 0L;
    ArrayList localArrayList3 = null;
    long l3 = 0L;
    int m = 0;
    String str3 = null;
    long l4 = 0L;
    String str4 = null;
    boolean bool2 = false;
    String str5 = null;
    String str6 = null;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    int n = 0;
    Object localObject1 = null;
    String str7 = null;
    String str8 = null;
    boolean bool8 = false;
    boolean bool9 = false;
    Object localObject2 = null;
    ArrayList localArrayList4 = null;
    ArrayList localArrayList5 = null;
    boolean bool10 = false;
    Object localObject3;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= i) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      case 16: 
      case 17: 
      case 20: 
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 4: 
        localArrayList1 = zza.zzD(paramParcel, i1);
        break;
      case 5: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 6: 
        localArrayList2 = zza.zzD(paramParcel, i1);
        break;
      case 7: 
        l1 = zza.zzi(paramParcel, i1);
        break;
      case 8: 
        bool1 = zza.zzc(paramParcel, i1);
        break;
      case 9: 
        l2 = zza.zzi(paramParcel, i1);
        break;
      case 10: 
        localArrayList3 = zza.zzD(paramParcel, i1);
        break;
      case 11: 
        l3 = zza.zzi(paramParcel, i1);
        break;
      case 12: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 13: 
        str3 = zza.zzp(paramParcel, i1);
        break;
      case 14: 
        l4 = zza.zzi(paramParcel, i1);
        break;
      case 15: 
        str4 = zza.zzp(paramParcel, i1);
        break;
      case 19: 
        str5 = zza.zzp(paramParcel, i1);
        break;
      case 18: 
        bool2 = zza.zzc(paramParcel, i1);
        break;
      case 21: 
        str6 = zza.zzp(paramParcel, i1);
        break;
      case 23: 
        bool4 = zza.zzc(paramParcel, i1);
        break;
      case 22: 
        bool3 = zza.zzc(paramParcel, i1);
        break;
      case 25: 
        bool6 = zza.zzc(paramParcel, i1);
        break;
      case 24: 
        bool5 = zza.zzc(paramParcel, i1);
        break;
      case 27: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 26: 
        bool7 = zza.zzc(paramParcel, i1);
        break;
      case 29: 
        str7 = zza.zzp(paramParcel, i1);
        break;
      case 28: 
        localObject1 = LargeParcelTeleporter.CREATOR;
        localObject3 = (LargeParcelTeleporter)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 31: 
        bool8 = zza.zzc(paramParcel, i1);
        break;
      case 30: 
        str8 = zza.zzp(paramParcel, i1);
        break;
      case 34: 
        localArrayList4 = zza.zzD(paramParcel, i1);
        break;
      case 35: 
        localArrayList5 = zza.zzD(paramParcel, i1);
        break;
      case 32: 
        bool9 = zza.zzc(paramParcel, i1);
        break;
      case 33: 
        localObject2 = RewardItemParcel.CREATOR;
        localObject3 = (RewardItemParcel)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 36: 
        bool10 = zza.zzc(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject4 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
    ((AdResponseParcel)localObject4).<init>(j, str1, str2, localArrayList1, k, localArrayList2, l1, bool1, l2, localArrayList3, l3, m, str3, l4, str4, bool2, str5, str6, bool3, bool4, bool5, bool6, bool7, n, (LargeParcelTeleporter)localObject1, str7, str8, bool8, bool9, (RewardItemParcel)localObject2, localArrayList4, localArrayList5, bool10);
    return (AdResponseParcel)localObject4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */