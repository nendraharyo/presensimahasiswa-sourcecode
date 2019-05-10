package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(TrustedDevicesRequest paramTrustedDevicesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTrustedDevicesRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramTrustedDevicesRequest.zzbdq;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramTrustedDevicesRequest.zzbdr;
    zzb.zza(paramParcel, 3, (byte[])localObject, false);
    localObject = paramTrustedDevicesRequest.zzED();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public TrustedDevicesRequest zzgx(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzs(paramParcel, k);
        break;
      case 4: 
        localObject1 = zza.zzq(paramParcel, k);
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
    TrustedDevicesRequest localTrustedDevicesRequest = new com/google/android/gms/nearby/sharing/internal/TrustedDevicesRequest;
    localTrustedDevicesRequest.<init>(j, str, (byte[])localObject2, (IBinder)localObject1);
    return localTrustedDevicesRequest;
  }
  
  public TrustedDevicesRequest[] zzjD(int paramInt)
  {
    return new TrustedDevicesRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */