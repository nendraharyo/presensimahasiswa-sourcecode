package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp
  implements Parcelable.Creator
{
  static void zza(GetSyncInfoRequest paramGetSyncInfoRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    IBinder localIBinder = paramGetSyncInfoRequest.getCallbackBinder();
    zzb.zza(paramParcel, 1, localIBinder, false);
    int j = paramGetSyncInfoRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GetSyncInfoRequest zzdv(Parcel paramParcel)
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
        localObject2 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
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
    GetSyncInfoRequest localGetSyncInfoRequest = new com/google/android/gms/fitness/request/GetSyncInfoRequest;
    localGetSyncInfoRequest.<init>(j, (IBinder)localObject2);
    return localGetSyncInfoRequest;
  }
  
  public GetSyncInfoRequest[] zzfv(int paramInt)
  {
    return new GetSyncInfoRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */