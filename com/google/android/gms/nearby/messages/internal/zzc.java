package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(HandleClientLifecycleEventRequest paramHandleClientLifecycleEventRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramHandleClientLifecycleEventRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    ClientAppContext localClientAppContext = paramHandleClientLifecycleEventRequest.zzbcs;
    zzb.zza(paramParcel, 2, localClientAppContext, paramInt, false);
    j = paramHandleClientLifecycleEventRequest.zzbct;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public HandleClientLifecycleEventRequest zzgi(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    int n = paramParcel.dataPosition();
    if (n < j)
    {
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        n = i;
        localObject1 = localObject2;
        k = m;
      }
      for (;;)
      {
        m = k;
        localObject2 = localObject1;
        i = n;
        break;
        n = zza.zzg(paramParcel, n);
        localObject1 = localObject2;
        k = n;
        n = i;
        continue;
        localObject2 = ClientAppContext.CREATOR;
        localObject3 = (ClientAppContext)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        k = m;
        n = i;
        localObject1 = localObject3;
        continue;
        n = zza.zzg(paramParcel, n);
        localObject1 = localObject2;
        k = m;
      }
    }
    n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;
    ((HandleClientLifecycleEventRequest)localObject3).<init>(m, (ClientAppContext)localObject2, i);
    return (HandleClientLifecycleEventRequest)localObject3;
  }
  
  public HandleClientLifecycleEventRequest[] zzjn(int paramInt)
  {
    return new HandleClientLifecycleEventRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */