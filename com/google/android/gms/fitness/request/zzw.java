package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw
  implements Parcelable.Creator
{
  static void zza(SensorUnregistrationRequest paramSensorUnregistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSensorUnregistrationRequest.zzvb();
    zzb.zza(paramParcel, 1, (IBinder)localObject, false);
    int j = paramSensorUnregistrationRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSensorUnregistrationRequest.getIntent();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramSensorUnregistrationRequest.getCallbackBinder();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SensorUnregistrationRequest zzdB(Parcel paramParcel)
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
        localObject4 = zza.zzq(paramParcel, m);
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
        localObject2 = PendingIntent.CREATOR;
        localObject4 = (PendingIntent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
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
    Object localObject4 = new com/google/android/gms/fitness/request/SensorUnregistrationRequest;
    ((SensorUnregistrationRequest)localObject4).<init>(j, (IBinder)localObject3, (PendingIntent)localObject2, (IBinder)localObject1);
    return (SensorUnregistrationRequest)localObject4;
  }
  
  public SensorUnregistrationRequest[] zzfC(int paramInt)
  {
    return new SensorUnregistrationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */