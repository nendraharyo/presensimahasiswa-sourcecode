package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(GetBuyFlowInitializationTokenResponse paramGetBuyFlowInitializationTokenResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetBuyFlowInitializationTokenResponse.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    byte[] arrayOfByte = paramGetBuyFlowInitializationTokenResponse.zzbpR;
    zzb.zza(paramParcel, 2, arrayOfByte, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetBuyFlowInitializationTokenResponse zzhH(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
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
        localObject2 = zza.zzs(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    GetBuyFlowInitializationTokenResponse localGetBuyFlowInitializationTokenResponse = new com/google/android/gms/wallet/firstparty/GetBuyFlowInitializationTokenResponse;
    localGetBuyFlowInitializationTokenResponse.<init>(j, (byte[])localObject2);
    return localGetBuyFlowInitializationTokenResponse;
  }
  
  public GetBuyFlowInitializationTokenResponse[] zzlf(int paramInt)
  {
    return new GetBuyFlowInitializationTokenResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */