package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzf
  implements Parcelable.Creator
{
  static void zza(AdRequestInfoParcel paramAdRequestInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAdRequestInfoParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAdRequestInfoParcel.zzHs;
    zzb.zza(paramParcel, 2, (Bundle)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHt;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzrp;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzrj;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramAdRequestInfoParcel.applicationInfo;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzHu;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzHv;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHw;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHx;
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramAdRequestInfoParcel.zzrl;
    zzb.zza(paramParcel, 11, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzHy;
    zzb.zza(paramParcel, 12, (Bundle)localObject, false);
    j = paramAdRequestInfoParcel.zzHz;
    zzb.zzc(paramParcel, 13, j);
    localObject = paramAdRequestInfoParcel.zzrH;
    zzb.zzb(paramParcel, 14, (List)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHA;
    zzb.zza(paramParcel, 15, (Bundle)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHC;
    zzb.zza(paramParcel, 17, (Parcelable)localObject, paramInt, false);
    boolean bool = paramAdRequestInfoParcel.zzHB;
    zzb.zza(paramParcel, 16, bool);
    int k = paramAdRequestInfoParcel.zzHE;
    zzb.zzc(paramParcel, 19, k);
    k = paramAdRequestInfoParcel.zzHD;
    zzb.zzc(paramParcel, 18, k);
    localObject = paramAdRequestInfoParcel.zzHG;
    zzb.zza(paramParcel, 21, (String)localObject, false);
    float f = paramAdRequestInfoParcel.zzHF;
    zzb.zza(paramParcel, 20, f);
    long l = paramAdRequestInfoParcel.zzHH;
    zzb.zza(paramParcel, 25, l);
    localObject = paramAdRequestInfoParcel.zzHJ;
    zzb.zzb(paramParcel, 27, (List)localObject, false);
    localObject = paramAdRequestInfoParcel.zzHI;
    zzb.zza(paramParcel, 26, (String)localObject, false);
    localObject = paramAdRequestInfoParcel.zzrD;
    zzb.zza(paramParcel, 29, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzri;
    zzb.zza(paramParcel, 28, (String)localObject, false);
    l = paramAdRequestInfoParcel.zzHL;
    zzb.zza(paramParcel, 31, l);
    localObject = paramAdRequestInfoParcel.zzHK;
    zzb.zzb(paramParcel, 30, (List)localObject, false);
    f = paramAdRequestInfoParcel.zzHO;
    zzb.zza(paramParcel, 34, f);
    k = paramAdRequestInfoParcel.zzHP;
    zzb.zzc(paramParcel, 35, k);
    localObject = paramAdRequestInfoParcel.zzHM;
    zzb.zza(paramParcel, 32, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestInfoParcel.zzHN;
    zzb.zza(paramParcel, 33, (String)localObject, false);
    k = paramAdRequestInfoParcel.zzHQ;
    zzb.zzc(paramParcel, 36, k);
    zzb.zzI(paramParcel, i);
  }
  
  public AdRequestInfoParcel[] zzG(int paramInt)
  {
    return new AdRequestInfoParcel[paramInt];
  }
  
  public AdRequestInfoParcel zzi(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Bundle localBundle1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str1 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject6 = null;
    Bundle localBundle2 = null;
    int k = 0;
    ArrayList localArrayList1 = null;
    Bundle localBundle3 = null;
    boolean bool = false;
    Object localObject7 = null;
    int m = 0;
    int n = 0;
    float f1 = 0.0F;
    String str5 = null;
    long l1 = 0L;
    String str6 = null;
    ArrayList localArrayList2 = null;
    String str7 = null;
    Object localObject8 = null;
    ArrayList localArrayList3 = null;
    long l2 = 0L;
    Object localObject9 = null;
    String str8 = null;
    float f2 = 0.0F;
    int i1 = 0;
    int i2 = 0;
    for (;;)
    {
      i3 = paramParcel.dataPosition();
      if (i3 >= i) {
        break;
      }
      i3 = zza.zzat(paramParcel);
      int i4 = zza.zzca(i3);
      switch (i4)
      {
      case 22: 
      case 23: 
      case 24: 
      default: 
        zza.zzb(paramParcel, i3);
        break;
      case 1: 
        j = zza.zzg(paramParcel, i3);
        break;
      case 2: 
        localBundle1 = zza.zzr(paramParcel, i3);
        break;
      case 3: 
        localObject2 = AdRequestParcel.CREATOR;
        localObject10 = (AdRequestParcel)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject2);
        localObject2 = localObject10;
        break;
      case 4: 
        localObject3 = AdSizeParcel.CREATOR;
        localObject10 = (AdSizeParcel)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject3);
        localObject3 = localObject10;
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, i3);
        break;
      case 6: 
        localObject4 = ApplicationInfo.CREATOR;
        localObject10 = (ApplicationInfo)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject4);
        localObject4 = localObject10;
        break;
      case 7: 
        localObject5 = PackageInfo.CREATOR;
        localObject10 = (PackageInfo)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject5);
        localObject5 = localObject10;
        break;
      case 8: 
        str2 = zza.zzp(paramParcel, i3);
        break;
      case 9: 
        str3 = zza.zzp(paramParcel, i3);
        break;
      case 10: 
        str4 = zza.zzp(paramParcel, i3);
        break;
      case 11: 
        localObject6 = VersionInfoParcel.CREATOR;
        localObject10 = (VersionInfoParcel)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject6);
        localObject6 = localObject10;
        break;
      case 12: 
        localBundle2 = zza.zzr(paramParcel, i3);
        break;
      case 13: 
        k = zza.zzg(paramParcel, i3);
        break;
      case 14: 
        localArrayList1 = zza.zzD(paramParcel, i3);
        break;
      case 15: 
        localBundle3 = zza.zzr(paramParcel, i3);
        break;
      case 17: 
        localObject7 = Messenger.CREATOR;
        localObject10 = (Messenger)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject7);
        localObject7 = localObject10;
        break;
      case 16: 
        bool = zza.zzc(paramParcel, i3);
        break;
      case 19: 
        n = zza.zzg(paramParcel, i3);
        break;
      case 18: 
        m = zza.zzg(paramParcel, i3);
        break;
      case 21: 
        str5 = zza.zzp(paramParcel, i3);
        break;
      case 20: 
        f1 = zza.zzl(paramParcel, i3);
        break;
      case 25: 
        l1 = zza.zzi(paramParcel, i3);
        break;
      case 27: 
        localArrayList2 = zza.zzD(paramParcel, i3);
        break;
      case 26: 
        str6 = zza.zzp(paramParcel, i3);
        break;
      case 29: 
        localObject8 = NativeAdOptionsParcel.CREATOR;
        localObject10 = (NativeAdOptionsParcel)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject8);
        localObject8 = localObject10;
        break;
      case 28: 
        str7 = zza.zzp(paramParcel, i3);
        break;
      case 31: 
        l2 = zza.zzi(paramParcel, i3);
        break;
      case 30: 
        localArrayList3 = zza.zzD(paramParcel, i3);
        break;
      case 34: 
        f2 = zza.zzl(paramParcel, i3);
        break;
      case 35: 
        i1 = zza.zzg(paramParcel, i3);
        break;
      case 32: 
        localObject9 = CapabilityParcel.CREATOR;
        localObject10 = (CapabilityParcel)zza.zza(paramParcel, i3, (Parcelable.Creator)localObject9);
        localObject9 = localObject10;
        break;
      case 33: 
        str8 = zza.zzp(paramParcel, i3);
        break;
      case 36: 
        i2 = zza.zzg(paramParcel, i3);
      }
    }
    int i3 = paramParcel.dataPosition();
    if (i3 != i)
    {
      localObject10 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject10).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject10);
    }
    Object localObject10 = new com/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    ((AdRequestInfoParcel)localObject10).<init>(j, localBundle1, (AdRequestParcel)localObject2, (AdSizeParcel)localObject3, str1, (ApplicationInfo)localObject4, (PackageInfo)localObject5, str2, str3, str4, (VersionInfoParcel)localObject6, localBundle2, k, localArrayList1, localBundle3, bool, (Messenger)localObject7, m, n, f1, str5, l1, str6, localArrayList2, str7, (NativeAdOptionsParcel)localObject8, localArrayList3, l2, (CapabilityParcel)localObject9, str8, f2, i1, i2);
    return (AdRequestInfoParcel)localObject10;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */