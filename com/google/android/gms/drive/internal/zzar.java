package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.List;

public class zzar
  implements Parcelable.Creator
{
  static void zza(LoadRealtimeRequest paramLoadRealtimeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLoadRealtimeRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramLoadRealtimeRequest.zzaoz;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    boolean bool = paramLoadRealtimeRequest.zzarQ;
    zzb.zza(paramParcel, 3, bool);
    localObject = paramLoadRealtimeRequest.zzarR;
    zzb.zzb(paramParcel, 4, (List)localObject, false);
    bool = paramLoadRealtimeRequest.zzarS;
    zzb.zza(paramParcel, 5, bool);
    localObject = paramLoadRealtimeRequest.zzarT;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramLoadRealtimeRequest.zzarU;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LoadRealtimeRequest zzbx(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str = null;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    ArrayList localArrayList = null;
    boolean bool2 = false;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
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
        localObject2 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        localObject1 = DataHolder.CREATOR;
        localObject4 = (DataHolder)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 7: 
        str = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/LoadRealtimeRequest;
    ((LoadRealtimeRequest)localObject4).<init>(j, (DriveId)localObject2, bool2, localArrayList, bool1, (DataHolder)localObject1, str);
    return (LoadRealtimeRequest)localObject4;
  }
  
  public LoadRealtimeRequest[] zzds(int paramInt)
  {
    return new LoadRealtimeRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */