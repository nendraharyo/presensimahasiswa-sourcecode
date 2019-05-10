package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zzf
  implements Parcelable.Creator
{
  static void zza(SendDataRequest paramSendDataRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSendDataRequest.zzEd();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSendDataRequest.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSendDataRequest.getData();
    zzb.zza(paramParcel, 2, (byte[])localObject, false);
    localObject = paramSendDataRequest.getCallbackBinder();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SendDataRequest zzfV(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        localObject3 = Device.CREATOR;
        localObject4 = (Device)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        Object localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        m = zza.zzg(paramParcel, m);
        localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = m;
        localObject4 = localObject5;
        continue;
        localObject4 = zza.zzs(paramParcel, m);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject4 = zza.zzq(paramParcel, m);
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/nearby/bootstrap/request/SendDataRequest;
    ((SendDataRequest)localObject4).<init>(j, (Device)localObject3, (byte[])localObject2, (IBinder)localObject1);
    return (SendDataRequest)localObject4;
  }
  
  public SendDataRequest[] zziR(int paramInt)
  {
    return new SendDataRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */