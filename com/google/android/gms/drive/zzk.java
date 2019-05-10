package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzk
  implements Parcelable.Creator
{
  static void zza(RealtimeDocumentSyncRequest paramRealtimeDocumentSyncRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRealtimeDocumentSyncRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    List localList = paramRealtimeDocumentSyncRequest.zzapq;
    zzb.zzb(paramParcel, 2, localList, false);
    localList = paramRealtimeDocumentSyncRequest.zzapr;
    zzb.zzb(paramParcel, 3, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RealtimeDocumentSyncRequest zzaN(Parcel paramParcel)
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
        localObject2 = zza.zzD(paramParcel, k);
        break;
      case 3: 
        localObject1 = zza.zzD(paramParcel, k);
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
    RealtimeDocumentSyncRequest localRealtimeDocumentSyncRequest = new com/google/android/gms/drive/RealtimeDocumentSyncRequest;
    localRealtimeDocumentSyncRequest.<init>(j, (List)localObject2, (List)localObject1);
    return localRealtimeDocumentSyncRequest;
  }
  
  public RealtimeDocumentSyncRequest[] zzcC(int paramInt)
  {
    return new RealtimeDocumentSyncRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */