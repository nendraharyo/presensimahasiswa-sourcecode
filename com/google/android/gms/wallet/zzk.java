package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.List;

public class zzk
  implements Parcelable.Creator
{
  static void zza(LoyaltyWalletObject paramLoyaltyWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLoyaltyWalletObject.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramLoyaltyWalletObject.zzio;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboP;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboQ;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboR;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzaQZ;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboS;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboT;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboU;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboV;
    zzb.zza(paramParcel, 10, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboW;
    zzb.zza(paramParcel, 11, (String)localObject, false);
    j = paramLoyaltyWalletObject.state;
    zzb.zzc(paramParcel, 12, j);
    localObject = paramLoyaltyWalletObject.zzboX;
    zzb.zzc(paramParcel, 13, (List)localObject, false);
    localObject = paramLoyaltyWalletObject.zzboY;
    zzb.zza(paramParcel, 14, (Parcelable)localObject, paramInt, false);
    localObject = paramLoyaltyWalletObject.zzboZ;
    zzb.zzc(paramParcel, 15, (List)localObject, false);
    localObject = paramLoyaltyWalletObject.zzbpb;
    zzb.zza(paramParcel, 17, (String)localObject, false);
    localObject = paramLoyaltyWalletObject.zzbpa;
    zzb.zza(paramParcel, 16, (String)localObject, false);
    boolean bool = paramLoyaltyWalletObject.zzbpd;
    zzb.zza(paramParcel, 19, bool);
    localObject = paramLoyaltyWalletObject.zzbpc;
    zzb.zzc(paramParcel, 18, (List)localObject, false);
    localObject = paramLoyaltyWalletObject.zzbpf;
    zzb.zzc(paramParcel, 21, (List)localObject, false);
    localObject = paramLoyaltyWalletObject.zzbpe;
    zzb.zzc(paramParcel, 20, (List)localObject, false);
    localObject = paramLoyaltyWalletObject.zzbph;
    zzb.zza(paramParcel, 23, (Parcelable)localObject, paramInt, false);
    localObject = paramLoyaltyWalletObject.zzbpg;
    zzb.zzc(paramParcel, 22, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LoyaltyWalletObject zzhy(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
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
    String str9 = null;
    String str10 = null;
    int k = 0;
    Object localObject2 = zzmn.zzsa();
    Object localObject3 = null;
    Object localObject4 = zzmn.zzsa();
    String str11 = null;
    String str12 = null;
    Object localObject5 = zzmn.zzsa();
    boolean bool = false;
    Object localObject6 = zzmn.zzsa();
    Object localObject7 = zzmn.zzsa();
    Object localObject8 = zzmn.zzsa();
    Object localObject9 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 6: 
        str5 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        str6 = zza.zzp(paramParcel, m);
        break;
      case 8: 
        str7 = zza.zzp(paramParcel, m);
        break;
      case 9: 
        str8 = zza.zzp(paramParcel, m);
        break;
      case 10: 
        str9 = zza.zzp(paramParcel, m);
        break;
      case 11: 
        str10 = zza.zzp(paramParcel, m);
        break;
      case 12: 
        k = zza.zzg(paramParcel, m);
        break;
      case 13: 
        localObject2 = WalletObjectMessage.CREATOR;
        localObject2 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
        break;
      case 14: 
        localObject3 = TimeInterval.CREATOR;
        localObject10 = (TimeInterval)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject10;
        break;
      case 15: 
        localObject4 = LatLng.CREATOR;
        localObject4 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject4);
        break;
      case 17: 
        str12 = zza.zzp(paramParcel, m);
        break;
      case 16: 
        str11 = zza.zzp(paramParcel, m);
        break;
      case 19: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 18: 
        localObject5 = LabelValueRow.CREATOR;
        localObject5 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject5);
        break;
      case 21: 
        localObject7 = TextModuleData.CREATOR;
        localObject7 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject7);
        break;
      case 20: 
        localObject6 = UriData.CREATOR;
        localObject6 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject6);
        break;
      case 23: 
        localObject9 = LoyaltyPoints.CREATOR;
        localObject10 = (LoyaltyPoints)zza.zza(paramParcel, m, (Parcelable.Creator)localObject9);
        localObject9 = localObject10;
        break;
      case 22: 
        localObject8 = UriData.CREATOR;
        localObject8 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject8);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject10 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject10).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject10);
    }
    Object localObject10 = new com/google/android/gms/wallet/LoyaltyWalletObject;
    ((LoyaltyWalletObject)localObject10).<init>(j, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, k, (ArrayList)localObject2, (TimeInterval)localObject3, (ArrayList)localObject4, str11, str12, (ArrayList)localObject5, bool, (ArrayList)localObject6, (ArrayList)localObject7, (ArrayList)localObject8, (LoyaltyPoints)localObject9);
    return (LoyaltyWalletObject)localObject10;
  }
  
  public LoyaltyWalletObject[] zzkW(int paramInt)
  {
    return new LoyaltyWalletObject[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */