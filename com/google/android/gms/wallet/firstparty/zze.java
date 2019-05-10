package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(GetInstrumentsResponse paramGetInstrumentsResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetInstrumentsResponse.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGetInstrumentsResponse.zzbpT;
    zzb.zza(paramParcel, 2, (String[])localObject, false);
    localObject = paramGetInstrumentsResponse.zzbpU;
    zzb.zza(paramParcel, 3, (byte[][])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetInstrumentsResponse zzhJ(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = (byte[][])null;
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
        localObject1 = zza.zzB(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzt(paramParcel, k);
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
    GetInstrumentsResponse localGetInstrumentsResponse = new com/google/android/gms/wallet/firstparty/GetInstrumentsResponse;
    localGetInstrumentsResponse.<init>(j, (String[])localObject1, (byte[][])localObject2);
    return localGetInstrumentsResponse;
  }
  
  public GetInstrumentsResponse[] zzlh(int paramInt)
  {
    return new GetInstrumentsResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */