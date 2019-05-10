package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(IsReadyToPayRequest paramIsReadyToPayRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramIsReadyToPayRequest.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    zzb.zzI(paramParcel, i);
  }
  
  public IsReadyToPayRequest zzhw(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
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
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/wallet/IsReadyToPayRequest;
    ((IsReadyToPayRequest)localObject).<init>(j);
    return (IsReadyToPayRequest)localObject;
  }
  
  public IsReadyToPayRequest[] zzkU(int paramInt)
  {
    return new IsReadyToPayRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */