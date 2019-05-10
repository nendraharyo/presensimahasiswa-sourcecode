package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;

public class zzaf
  implements Parcelable.Creator
{
  static void zza(SubscribeRequest paramSubscribeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSubscribeRequest.zzvh();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSubscribeRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramSubscribeRequest.zzvi();
    zzb.zza(paramParcel, 2, bool);
    localObject = paramSubscribeRequest.getCallbackBinder();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SubscribeRequest zzdK(Parcel paramParcel)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = false;
    Object localObject2 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject3 = null;
    int k = 0;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int i2 = zza.zzca(m);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        bool1 = bool2;
        localObject2 = localObject3;
        j = k;
      }
      for (;;)
      {
        k = j;
        localObject3 = localObject2;
        bool2 = bool1;
        localObject1 = localObject4;
        break;
        localObject3 = Subscription.CREATOR;
        localObject4 = (Subscription)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        j = k;
        localObject2 = localObject4;
        localObject4 = localObject1;
        bool1 = bool2;
        continue;
        m = zza.zzg(paramParcel, m);
        bool1 = bool2;
        localObject2 = localObject3;
        j = m;
        localObject4 = localObject1;
        continue;
        int n = zza.zzc(paramParcel, m);
        localObject2 = localObject3;
        j = k;
        bool1 = n;
        localObject4 = localObject1;
        continue;
        localObject4 = zza.zzq(paramParcel, n);
        bool1 = bool2;
        localObject2 = localObject3;
        j = k;
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/fitness/request/SubscribeRequest;
    ((SubscribeRequest)localObject4).<init>(k, (Subscription)localObject3, bool2, (IBinder)localObject1);
    return (SubscribeRequest)localObject4;
  }
  
  public SubscribeRequest[] zzfL(int paramInt)
  {
    return new SubscribeRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzaf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */