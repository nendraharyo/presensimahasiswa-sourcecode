package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(TransferProgressOptions paramTransferProgressOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTransferProgressOptions.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramTransferProgressOptions.zzapT;
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public TransferProgressOptions zzaV(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    TransferProgressOptions localTransferProgressOptions = new com/google/android/gms/drive/events/TransferProgressOptions;
    localTransferProgressOptions.<init>(k, i);
    return localTransferProgressOptions;
  }
  
  public TransferProgressOptions[] zzcL(int paramInt)
  {
    return new TransferProgressOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */