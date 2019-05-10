package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

public class zze
  implements Parcelable.Creator
{
  static void zza(FullWallet paramFullWallet, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFullWallet.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramFullWallet.zzboo;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramFullWallet.zzbop;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramFullWallet.zzboq;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramFullWallet.zzbor;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramFullWallet.zzbos;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramFullWallet.zzbot;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramFullWallet.zzbou;
    zzb.zza(paramParcel, 8, (String[])localObject, false);
    localObject = paramFullWallet.zzbov;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    localObject = paramFullWallet.zzbow;
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    localObject = paramFullWallet.zzbox;
    zzb.zza(paramParcel, 11, (Parcelable[])localObject, paramInt, false);
    localObject = paramFullWallet.zzboy;
    zzb.zza(paramParcel, 12, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FullWallet zzhs(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    Object localObject2 = null;
    String str3 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    String[] arrayOfString = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject2 = ProxyCard.CREATOR;
        localObject9 = (ProxyCard)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject9;
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localObject3 = Address.CREATOR;
        localObject9 = (Address)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject9;
        break;
      case 7: 
        localObject4 = Address.CREATOR;
        localObject9 = (Address)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject9;
        break;
      case 8: 
        arrayOfString = zza.zzB(paramParcel, k);
        break;
      case 9: 
        localObject5 = UserAddress.CREATOR;
        localObject9 = (UserAddress)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject9;
        break;
      case 10: 
        localObject6 = UserAddress.CREATOR;
        localObject9 = (UserAddress)zza.zza(paramParcel, k, (Parcelable.Creator)localObject6);
        localObject6 = localObject9;
        break;
      case 11: 
        localObject7 = InstrumentInfo.CREATOR;
        localObject9 = (InstrumentInfo[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject7);
        localObject7 = localObject9;
        break;
      case 12: 
        localObject8 = PaymentMethodToken.CREATOR;
        localObject9 = (PaymentMethodToken)zza.zza(paramParcel, k, (Parcelable.Creator)localObject8);
        localObject8 = localObject9;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject9 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject9).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject9);
    }
    Object localObject9 = new com/google/android/gms/wallet/FullWallet;
    ((FullWallet)localObject9).<init>(j, str1, str2, (ProxyCard)localObject2, str3, (Address)localObject3, (Address)localObject4, arrayOfString, (UserAddress)localObject5, (UserAddress)localObject6, (InstrumentInfo[])localObject7, (PaymentMethodToken)localObject8);
    return (FullWallet)localObject9;
  }
  
  public FullWallet[] zzkQ(int paramInt)
  {
    return new FullWallet[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */