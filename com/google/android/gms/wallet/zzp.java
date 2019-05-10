package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp
  implements Parcelable.Creator
{
  static void zza(PaymentMethodToken paramPaymentMethodToken, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPaymentMethodToken.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramPaymentMethodToken.zzbpC;
    zzb.zzc(paramParcel, 2, j);
    String str = paramPaymentMethodToken.zzbaW;
    zzb.zza(paramParcel, 3, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PaymentMethodToken zzhD(Parcel paramParcel)
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
        localObject2 = zza.zzp(paramParcel, m);
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
    PaymentMethodToken localPaymentMethodToken = new com/google/android/gms/wallet/PaymentMethodToken;
    localPaymentMethodToken.<init>(k, i, (String)localObject2);
    return localPaymentMethodToken;
  }
  
  public PaymentMethodToken[] zzlb(int paramInt)
  {
    return new PaymentMethodToken[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */