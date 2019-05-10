package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzo
  implements Parcelable.Creator
{
  static void zza(OfferWalletObject paramOfferWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOfferWalletObject.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramOfferWalletObject.zzio;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramOfferWalletObject.zzbpB;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramOfferWalletObject.zzboB;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OfferWalletObject zzhC(Parcel paramParcel)
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
        localObject1 = CommonWalletObject.CREATOR;
        localObject1 = (CommonWalletObject)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    OfferWalletObject localOfferWalletObject = new com/google/android/gms/wallet/OfferWalletObject;
    localOfferWalletObject.<init>(j, str, (String)localObject2, (CommonWalletObject)localObject1);
    return localOfferWalletObject;
  }
  
  public OfferWalletObject[] zzla(int paramInt)
  {
    return new OfferWalletObject[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */