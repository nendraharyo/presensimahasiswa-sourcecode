package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq
  implements Parcelable.Creator
{
  static void zza(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPaymentMethodTokenizationParameters.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramPaymentMethodTokenizationParameters.zzbpC;
    zzb.zzc(paramParcel, 2, j);
    Bundle localBundle = paramPaymentMethodTokenizationParameters.zzbpD;
    zzb.zza(paramParcel, 3, localBundle, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PaymentMethodTokenizationParameters zzhE(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject2 = zza.zzr(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    PaymentMethodTokenizationParameters localPaymentMethodTokenizationParameters = new com/google/android/gms/wallet/PaymentMethodTokenizationParameters;
    localPaymentMethodTokenizationParameters.<init>(k, i, (Bundle)localObject2);
    return localPaymentMethodTokenizationParameters;
  }
  
  public PaymentMethodTokenizationParameters[] zzlc(int paramInt)
  {
    return new PaymentMethodTokenizationParameters[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */