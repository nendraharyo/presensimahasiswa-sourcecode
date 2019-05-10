package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(CommonWalletObject paramCommonWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCommonWalletObject.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCommonWalletObject.zzio;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboW;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramCommonWalletObject.name;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboQ;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboS;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboT;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboU;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramCommonWalletObject.zzboV;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    j = paramCommonWalletObject.state;
    zzb.zzc(paramParcel, 10, j);
    localObject = paramCommonWalletObject.zzboX;
    zzb.zzc(paramParcel, 11, (List)localObject, false);
    localObject = paramCommonWalletObject.zzboY;
    zzb.zza(paramParcel, 12, (Parcelable)localObject, paramInt, false);
    localObject = paramCommonWalletObject.zzboZ;
    zzb.zzc(paramParcel, 13, (List)localObject, false);
    localObject = paramCommonWalletObject.zzbpa;
    zzb.zza(paramParcel, 14, (String)localObject, false);
    localObject = paramCommonWalletObject.zzbpb;
    zzb.zza(paramParcel, 15, (String)localObject, false);
    boolean bool = paramCommonWalletObject.zzbpd;
    zzb.zza(paramParcel, 17, bool);
    localObject = paramCommonWalletObject.zzbpc;
    zzb.zzc(paramParcel, 16, (List)localObject, false);
    localObject = paramCommonWalletObject.zzbpf;
    zzb.zzc(paramParcel, 19, (List)localObject, false);
    localObject = paramCommonWalletObject.zzbpe;
    zzb.zzc(paramParcel, 18, (List)localObject, false);
    localObject = paramCommonWalletObject.zzbpg;
    zzb.zzc(paramParcel, 20, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CommonWalletObject zzhO(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    int k = 0;
    Object localObject2 = zzmn.zzsa();
    Object localObject3 = null;
    Object localObject4 = zzmn.zzsa();
    String str9 = null;
    String str10 = null;
    Object localObject5 = zzmn.zzsa();
    boolean bool = false;
    Object localObject6 = zzmn.zzsa();
    Object localObject7 = zzmn.zzsa();
    Object localObject8 = zzmn.zzsa();
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 4: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 5: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 6: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 7: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 8: 
        str7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 9: 
        str8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 10: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 11: 
        localObject2 = WalletObjectMessage.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
        break;
      case 12: 
        localObject3 = TimeInterval.CREATOR;
        localObject9 = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject9;
        break;
      case 13: 
        localObject4 = LatLng.CREATOR;
        localObject4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject4);
        break;
      case 14: 
        str9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 15: 
        str10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 17: 
        bool = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m);
        break;
      case 16: 
        localObject5 = LabelValueRow.CREATOR;
        localObject5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject5);
        break;
      case 19: 
        localObject7 = TextModuleData.CREATOR;
        localObject7 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject7);
        break;
      case 18: 
        localObject6 = UriData.CREATOR;
        localObject6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject6);
        break;
      case 20: 
        localObject8 = UriData.CREATOR;
        localObject8 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject8);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject9 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject9).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject9);
    }
    Object localObject9 = new com/google/android/gms/wallet/wobs/CommonWalletObject;
    ((CommonWalletObject)localObject9).<init>(j, str1, str2, str3, str4, str5, str6, str7, str8, k, (ArrayList)localObject2, (TimeInterval)localObject3, (ArrayList)localObject4, str9, str10, (ArrayList)localObject5, bool, (ArrayList)localObject6, (ArrayList)localObject7, (ArrayList)localObject8);
    return (CommonWalletObject)localObject9;
  }
  
  public CommonWalletObject[] zzlp(int paramInt)
  {
    return new CommonWalletObject[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */