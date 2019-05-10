package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(GetPermissionStatusRequest paramGetPermissionStatusRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramGetPermissionStatusRequest.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGetPermissionStatusRequest.zzED();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramGetPermissionStatusRequest.zzbbF;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramGetPermissionStatusRequest.zzbcs;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public GetPermissionStatusRequest zzgh(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    IBinder localIBinder = null;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject1 = ClientAppContext.CREATOR;
        localObject1 = (ClientAppContext)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    GetPermissionStatusRequest localGetPermissionStatusRequest = new com/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;
    localGetPermissionStatusRequest.<init>(j, localIBinder, (String)localObject2, (ClientAppContext)localObject1);
    return localGetPermissionStatusRequest;
  }
  
  public GetPermissionStatusRequest[] zzjm(int paramInt)
  {
    return new GetPermissionStatusRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */