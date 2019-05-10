package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzm
  implements Parcelable.Creator
{
  static void zza(MaskedWalletRequest paramMaskedWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramMaskedWalletRequest.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramMaskedWalletRequest.zzbop;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    boolean bool = paramMaskedWalletRequest.zzbpl;
    zzb.zza(paramParcel, 3, bool);
    bool = paramMaskedWalletRequest.zzbpm;
    zzb.zza(paramParcel, 4, bool);
    bool = paramMaskedWalletRequest.zzbpn;
    zzb.zza(paramParcel, 5, bool);
    localObject = paramMaskedWalletRequest.zzbpo;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramMaskedWalletRequest.zzboi;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramMaskedWalletRequest.zzbpp;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramMaskedWalletRequest.zzboz;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    bool = paramMaskedWalletRequest.zzbpq;
    zzb.zza(paramParcel, 10, bool);
    bool = paramMaskedWalletRequest.zzbpr;
    zzb.zza(paramParcel, 11, bool);
    localObject = paramMaskedWalletRequest.zzbps;
    zzb.zza(paramParcel, 12, (Parcelable[])localObject, paramInt, false);
    bool = paramMaskedWalletRequest.zzbpt;
    zzb.zza(paramParcel, 13, bool);
    bool = paramMaskedWalletRequest.zzbpu;
    zzb.zza(paramParcel, 14, bool);
    localObject = paramMaskedWalletRequest.zzbpv;
    zzb.zzc(paramParcel, 15, (List)localObject, false);
    localObject = paramMaskedWalletRequest.zzbpx;
    zzb.zza(paramParcel, 17, (List)localObject, false);
    localObject = paramMaskedWalletRequest.zzbpw;
    zzb.zza(paramParcel, 16, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public MaskedWalletRequest zzhA(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject2 = null;
    boolean bool4 = false;
    boolean bool5 = false;
    Object localObject3 = null;
    boolean bool6 = true;
    boolean bool7 = true;
    Object localObject4 = null;
    Object localObject5 = null;
    ArrayList localArrayList = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        localObject2 = Cart.CREATOR;
        localObject6 = (Cart)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 10: 
        bool4 = zza.zzc(paramParcel, k);
        break;
      case 11: 
        bool5 = zza.zzc(paramParcel, k);
        break;
      case 12: 
        localObject3 = CountrySpecification.CREATOR;
        localObject6 = (CountrySpecification[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 13: 
        bool6 = zza.zzc(paramParcel, k);
        break;
      case 14: 
        bool7 = zza.zzc(paramParcel, k);
        break;
      case 15: 
        localObject4 = com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR;
        localObject4 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject4);
        break;
      case 17: 
        localArrayList = zza.zzC(paramParcel, k);
        break;
      case 16: 
        localObject5 = PaymentMethodTokenizationParameters.CREATOR;
        localObject6 = (PaymentMethodTokenizationParameters)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject6;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject6).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/wallet/MaskedWalletRequest;
    ((MaskedWalletRequest)localObject6).<init>(j, str1, bool1, bool2, bool3, str2, str3, str4, (Cart)localObject2, bool4, bool5, (CountrySpecification[])localObject3, bool6, bool7, (ArrayList)localObject4, (PaymentMethodTokenizationParameters)localObject5, localArrayList);
    return (MaskedWalletRequest)localObject6;
  }
  
  public MaskedWalletRequest[] zzkY(int paramInt)
  {
    return new MaskedWalletRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */