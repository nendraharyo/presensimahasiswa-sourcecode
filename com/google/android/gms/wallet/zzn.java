package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNotifyTransactionStatusRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramNotifyTransactionStatusRequest.zzboo;
    zzb.zza(paramParcel, 2, str, false);
    j = paramNotifyTransactionStatusRequest.status;
    zzb.zzc(paramParcel, 3, j);
    str = paramNotifyTransactionStatusRequest.zzbpz;
    zzb.zza(paramParcel, 4, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public NotifyTransactionStatusRequest zzhB(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    int j = zza.zzau(paramParcel);
    String str = null;
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
        str = zza.zzp(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localObject1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    NotifyTransactionStatusRequest localNotifyTransactionStatusRequest = new com/google/android/gms/wallet/NotifyTransactionStatusRequest;
    localNotifyTransactionStatusRequest.<init>(k, str, i, (String)localObject1);
    return localNotifyTransactionStatusRequest;
  }
  
  public NotifyTransactionStatusRequest[] zzkZ(int paramInt)
  {
    return new NotifyTransactionStatusRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */