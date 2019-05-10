package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class zzbp
  implements Parcelable.Creator
{
  static void zza(RemoveEventListenerRequest paramRemoveEventListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRemoveEventListenerRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramRemoveEventListenerRequest.zzaoz;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramRemoveEventListenerRequest.zzanf;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramRemoveEventListenerRequest.zzapZ;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RemoveEventListenerRequest zzbR(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = zza.zzau(paramParcel);
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = paramParcel.dataPosition();
    if (i1 < k)
    {
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        localObject4 = localObject1;
        i = j;
        localObject2 = localObject3;
        m = n;
      }
      for (;;)
      {
        n = m;
        localObject3 = localObject2;
        j = i;
        localObject1 = localObject4;
        break;
        i1 = zza.zzg(paramParcel, i1);
        i = j;
        localObject2 = localObject3;
        m = i1;
        localObject4 = localObject1;
        continue;
        localObject3 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        m = n;
        localObject2 = localObject4;
        localObject4 = localObject1;
        i = j;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        localObject2 = localObject3;
        m = n;
        i = i1;
        localObject4 = localObject1;
        continue;
        localObject1 = TransferProgressOptions.CREATOR;
        localObject4 = (TransferProgressOptions)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        i = j;
        localObject2 = localObject3;
        m = n;
      }
    }
    i1 = paramParcel.dataPosition();
    if (i1 != k)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + k;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/RemoveEventListenerRequest;
    ((RemoveEventListenerRequest)localObject4).<init>(n, (DriveId)localObject3, j, (TransferProgressOptions)localObject1);
    return (RemoveEventListenerRequest)localObject4;
  }
  
  public RemoveEventListenerRequest[] zzdM(int paramInt)
  {
    return new RemoveEventListenerRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */