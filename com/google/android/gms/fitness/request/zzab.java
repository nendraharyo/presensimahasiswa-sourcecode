package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzab
  implements Parcelable.Creator
{
  static void zza(SessionStopRequest paramSessionStopRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSessionStopRequest.getName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramSessionStopRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSessionStopRequest.getIdentifier();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramSessionStopRequest.getCallbackBinder();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionStopRequest zzdG(Parcel paramParcel)
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
        str = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
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
    SessionStopRequest localSessionStopRequest = new com/google/android/gms/fitness/request/SessionStopRequest;
    localSessionStopRequest.<init>(j, str, (String)localObject2, (IBinder)localObject1);
    return localSessionStopRequest;
  }
  
  public SessionStopRequest[] zzfH(int paramInt)
  {
    return new SessionStopRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */