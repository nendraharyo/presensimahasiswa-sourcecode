package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class zza
  implements Parcelable.Creator
{
  static void zza(AddEventListenerRequest paramAddEventListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAddEventListenerRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAddEventListenerRequest.zzaoz;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramAddEventListenerRequest.zzanf;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramAddEventListenerRequest.zzapy;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramAddEventListenerRequest.zzapY;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramAddEventListenerRequest.zzapZ;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AddEventListenerRequest zzaZ(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    int k = 0;
    Object localObject5 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject4 = DriveId.CREATOR;
        localObject6 = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 3: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 4: 
        localObject3 = ChangesAvailableOptions.CREATOR;
        localObject6 = (ChangesAvailableOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 5: 
        localObject2 = TransferStateOptions.CREATOR;
        localObject6 = (TransferStateOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 6: 
        localObject1 = TransferProgressOptions.CREATOR;
        localObject6 = (TransferProgressOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject6;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = "Overread allowed size end=" + j;
      ((zza.zza)localObject6).<init>((String)localObject5, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/drive/internal/AddEventListenerRequest;
    ((AddEventListenerRequest)localObject6).<init>(k, (DriveId)localObject4, i, (ChangesAvailableOptions)localObject3, (TransferStateOptions)localObject2, (TransferProgressOptions)localObject1);
    return (AddEventListenerRequest)localObject6;
  }
  
  public AddEventListenerRequest[] zzcP(int paramInt)
  {
    return new AddEventListenerRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */