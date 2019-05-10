package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(GetBuyFlowInitializationTokenRequest paramGetBuyFlowInitializationTokenRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramGetBuyFlowInitializationTokenRequest.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    byte[] arrayOfByte = paramGetBuyFlowInitializationTokenRequest.zzbpP;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, arrayOfByte, false);
    arrayOfByte = paramGetBuyFlowInitializationTokenRequest.zzbpQ;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, arrayOfByte, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public GetBuyFlowInitializationTokenRequest zzhG(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
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
        break;
      case 3: 
        localObject1 = zza.zzs(paramParcel, k);
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
    GetBuyFlowInitializationTokenRequest localGetBuyFlowInitializationTokenRequest = new com/google/android/gms/wallet/firstparty/GetBuyFlowInitializationTokenRequest;
    localGetBuyFlowInitializationTokenRequest.<init>(j, (byte[])localObject2, (byte[])localObject1);
    return localGetBuyFlowInitializationTokenRequest;
  }
  
  public GetBuyFlowInitializationTokenRequest[] zzle(int paramInt)
  {
    return new GetBuyFlowInitializationTokenRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */