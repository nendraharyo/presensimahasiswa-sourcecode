package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzj
  implements Parcelable.Creator
{
  static void zza(ControlProgressRequest paramControlProgressRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramControlProgressRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramControlProgressRequest.zzaqq;
    zzb.zzc(paramParcel, 2, j);
    j = paramControlProgressRequest.zzaqr;
    zzb.zzc(paramParcel, 3, j);
    Object localObject = paramControlProgressRequest.zzaoz;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramControlProgressRequest.zzaqs;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ControlProgressRequest zzbh(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    Object localObject3 = null;
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
        i = zza.zzg(paramParcel, n);
        break;
      case 4: 
        localObject2 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        localObject1 = ParcelableTransferPreferences.CREATOR;
        localObject4 = (ParcelableTransferPreferences)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/ControlProgressRequest;
    ((ControlProgressRequest)localObject4).<init>(m, k, i, (DriveId)localObject2, (ParcelableTransferPreferences)localObject1);
    return (ControlProgressRequest)localObject4;
  }
  
  public ControlProgressRequest[] zzcX(int paramInt)
  {
    return new ControlProgressRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */