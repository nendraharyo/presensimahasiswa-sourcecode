package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class zza
  implements Parcelable.Creator
{
  static void zza(WalletFragmentInitParams paramWalletFragmentInitParams, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramWalletFragmentInitParams.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramWalletFragmentInitParams.getAccountName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramWalletFragmentInitParams.getMaskedWalletRequest();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    j = paramWalletFragmentInitParams.getMaskedWalletRequestCode();
    zzb.zzc(paramParcel, 4, j);
    localObject = paramWalletFragmentInitParams.getMaskedWallet();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public WalletFragmentInitParams zzhL(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = -1;
    Object localObject3 = null;
    String str = null;
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
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        localObject3 = MaskedWalletRequest.CREATOR;
        localObject4 = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 5: 
        localObject1 = MaskedWallet.CREATOR;
        localObject4 = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    ((WalletFragmentInitParams)localObject4).<init>(j, str, (MaskedWalletRequest)localObject3, k, (MaskedWallet)localObject1);
    return (WalletFragmentInitParams)localObject4;
  }
  
  public WalletFragmentInitParams[] zzlj(int paramInt)
  {
    return new WalletFragmentInitParams[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */