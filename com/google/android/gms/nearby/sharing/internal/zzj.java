package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(StopProvidingContentRequest paramStopProvidingContentRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStopProvidingContentRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramStopProvidingContentRequest.zzbdn;
    zzb.zza(paramParcel, 2, l);
    IBinder localIBinder = paramStopProvidingContentRequest.zzED();
    zzb.zza(paramParcel, 3, localIBinder, false);
    zzb.zzI(paramParcel, i);
  }
  
  public StopProvidingContentRequest zzgw(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l = 0L;
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
        l = zza.zzi(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzq(paramParcel, k);
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
    StopProvidingContentRequest localStopProvidingContentRequest = new com/google/android/gms/nearby/sharing/internal/StopProvidingContentRequest;
    localStopProvidingContentRequest.<init>(j, l, (IBinder)localObject2);
    return localStopProvidingContentRequest;
  }
  
  public StopProvidingContentRequest[] zzjC(int paramInt)
  {
    return new StopProvidingContentRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */