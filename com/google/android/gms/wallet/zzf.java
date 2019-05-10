package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(FullWalletRequest paramFullWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFullWalletRequest.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramFullWalletRequest.zzboo;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramFullWalletRequest.zzbop;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramFullWalletRequest.zzboz;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FullWalletRequest zzht(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject1 = Cart.CREATOR;
        localObject1 = (Cart)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    FullWalletRequest localFullWalletRequest = new com/google/android/gms/wallet/FullWalletRequest;
    localFullWalletRequest.<init>(j, str, (String)localObject2, (Cart)localObject1);
    return localFullWalletRequest;
  }
  
  public FullWalletRequest[] zzkR(int paramInt)
  {
    return new FullWalletRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */