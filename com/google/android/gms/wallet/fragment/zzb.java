package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(WalletFragmentOptions paramWalletFragmentOptions, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramWalletFragmentOptions.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    j = paramWalletFragmentOptions.getEnvironment();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    j = paramWalletFragmentOptions.getTheme();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, j);
    WalletFragmentStyle localWalletFragmentStyle = paramWalletFragmentOptions.getFragmentStyle();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, localWalletFragmentStyle, paramInt, false);
    j = paramWalletFragmentOptions.getMode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 5, j);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public WalletFragmentOptions zzhM(Parcel paramParcel)
  {
    int i = 1;
    int j = 0;
    int k = zza.zzau(paramParcel);
    Object localObject1 = null;
    int m = i;
    int n = 0;
    Object localObject2 = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= k) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 3: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        localObject1 = WalletFragmentStyle.CREATOR;
        localObject3 = (WalletFragmentStyle)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 5: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != k)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + k;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/wallet/fragment/WalletFragmentOptions;
    ((WalletFragmentOptions)localObject3).<init>(n, m, j, (WalletFragmentStyle)localObject1, i);
    return (WalletFragmentOptions)localObject3;
  }
  
  public WalletFragmentOptions[] zzlk(int paramInt)
  {
    return new WalletFragmentOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */