package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.List;

public class zzp
  implements Parcelable.Creator
{
  static void zza(TransferStateEvent paramTransferStateEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTransferStateEvent.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramTransferStateEvent.zzVa;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramTransferStateEvent.zzapU;
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public TransferStateEvent zzaW(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
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
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject1 = TransferProgressData.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
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
    TransferStateEvent localTransferStateEvent = new com/google/android/gms/drive/events/TransferStateEvent;
    localTransferStateEvent.<init>(j, (String)localObject2, (List)localObject1);
    return localTransferStateEvent;
  }
  
  public TransferStateEvent[] zzcM(int paramInt)
  {
    return new TransferStateEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */