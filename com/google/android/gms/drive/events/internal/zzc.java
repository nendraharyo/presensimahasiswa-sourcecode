package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzc
  implements Parcelable.Creator
{
  static void zza(TransferProgressData paramTransferProgressData, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTransferProgressData.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramTransferProgressData.zzapT;
    zzb.zzc(paramParcel, 2, j);
    DriveId localDriveId = paramTransferProgressData.zzaoz;
    zzb.zza(paramParcel, 3, localDriveId, paramInt, false);
    j = paramTransferProgressData.zzBc;
    zzb.zzc(paramParcel, 4, j);
    long l = paramTransferProgressData.zzapW;
    zzb.zza(paramParcel, 5, l);
    l = paramTransferProgressData.zzapX;
    zzb.zza(paramParcel, 6, l);
    zzb.zzI(paramParcel, i);
  }
  
  public TransferProgressData zzaY(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    long l2 = l1;
    int k = 0;
    int m = 0;
    StringBuilder localStringBuilder = null;
    Object localObject2;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        localObject1 = DriveId.CREATOR;
        localObject2 = (DriveId)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        break;
      case 4: 
        i = zza.zzg(paramParcel, n);
        break;
      case 5: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 6: 
        l1 = zza.zzi(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = new com/google/android/gms/drive/events/internal/TransferProgressData;
    ((TransferProgressData)localObject3).<init>(m, k, (DriveId)localObject1, i, l2, l1);
    return (TransferProgressData)localObject3;
  }
  
  public TransferProgressData[] zzcO(int paramInt)
  {
    return new TransferProgressData[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */