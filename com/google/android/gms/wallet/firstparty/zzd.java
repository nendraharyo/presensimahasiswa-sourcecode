package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(GetInstrumentsRequest paramGetInstrumentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetInstrumentsRequest.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    int[] arrayOfInt = paramGetInstrumentsRequest.zzbpS;
    zzb.zza(paramParcel, 2, arrayOfInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetInstrumentsRequest zzhI(Parcel paramParcel)
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
        localObject2 = zza.zzv(paramParcel, k);
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
    GetInstrumentsRequest localGetInstrumentsRequest = new com/google/android/gms/wallet/firstparty/GetInstrumentsRequest;
    localGetInstrumentsRequest.<init>(j, (int[])localObject2);
    return localGetInstrumentsRequest;
  }
  
  public GetInstrumentsRequest[] zzlg(int paramInt)
  {
    return new GetInstrumentsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */