package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzae
  implements Parcelable.Creator
{
  static void zza(StopBleScanRequest paramStopBleScanRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    IBinder localIBinder = paramStopBleScanRequest.zzvg();
    zzb.zza(paramParcel, 1, localIBinder, false);
    int j = paramStopBleScanRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localIBinder = paramStopBleScanRequest.getCallbackBinder();
    zzb.zza(paramParcel, 2, localIBinder, false);
    zzb.zzI(paramParcel, i);
  }
  
  public StopBleScanRequest zzdJ(Parcel paramParcel)
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
        localObject2 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
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
    StopBleScanRequest localStopBleScanRequest = new com/google/android/gms/fitness/request/StopBleScanRequest;
    localStopBleScanRequest.<init>(j, (IBinder)localObject2, (IBinder)localObject1);
    return localStopBleScanRequest;
  }
  
  public StopBleScanRequest[] zzfK(int paramInt)
  {
    return new StopBleScanRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */