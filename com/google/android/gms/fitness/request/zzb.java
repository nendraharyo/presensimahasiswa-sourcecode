package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.fitness.data.BleDevice;

public class zzb
  implements Parcelable.Creator
{
  static void zza(ClaimBleDeviceRequest paramClaimBleDeviceRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Object localObject = paramClaimBleDeviceRequest.getDeviceAddress();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramClaimBleDeviceRequest.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    localObject = paramClaimBleDeviceRequest.zzuK();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramClaimBleDeviceRequest.getCallbackBinder();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public ClaimBleDeviceRequest zzdh(Parcel paramParcel)
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
        localObject4 = zza.zzp(paramParcel, m);
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
        localObject2 = BleDevice.CREATOR;
        localObject4 = (BleDevice)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
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
    Object localObject4 = new com/google/android/gms/fitness/request/ClaimBleDeviceRequest;
    ((ClaimBleDeviceRequest)localObject4).<init>(j, (String)localObject3, (BleDevice)localObject2, (IBinder)localObject1);
    return (ClaimBleDeviceRequest)localObject4;
  }
  
  public ClaimBleDeviceRequest[] zzfh(int paramInt)
  {
    return new ClaimBleDeviceRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */