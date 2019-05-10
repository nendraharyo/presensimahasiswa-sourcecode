package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzg
  implements Parcelable.Creator
{
  static void zza(GiftCardWalletObject paramGiftCardWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGiftCardWalletObject.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGiftCardWalletObject.zzboB;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramGiftCardWalletObject.zzboC;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramGiftCardWalletObject.pin;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGiftCardWalletObject.zzboD;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    long l = paramGiftCardWalletObject.zzboE;
    zzb.zza(paramParcel, 6, l);
    localObject = paramGiftCardWalletObject.zzboF;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    l = paramGiftCardWalletObject.zzboG;
    zzb.zza(paramParcel, 8, l);
    localObject = paramGiftCardWalletObject.zzboH;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GiftCardWalletObject zzhu(Parcel paramParcel)
  {
    long l1 = 0L;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    long l2 = l1;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject2 = null;
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
        localObject2 = CommonWalletObject.CREATOR;
        localObject3 = (CommonWalletObject)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/wallet/GiftCardWalletObject;
    ((GiftCardWalletObject)localObject3).<init>(j, (CommonWalletObject)localObject2, str5, str4, str3, l2, str2, l1, str1);
    return (GiftCardWalletObject)localObject3;
  }
  
  public GiftCardWalletObject[] zzkS(int paramInt)
  {
    return new GiftCardWalletObject[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */