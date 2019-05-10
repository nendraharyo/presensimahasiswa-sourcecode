package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class zzp
  implements Parcelable.Creator
{
  static void zza(ParcelableChangeInfo paramParcelableChangeInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParcelableChangeInfo.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramParcelableChangeInfo.zzaez;
    zzb.zza(paramParcel, 2, l);
    List localList = paramParcelableChangeInfo.zzpH;
    zzb.zzc(paramParcel, 3, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableChangeInfo zzcz(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l = 0L;
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
        l = zza.zzi(paramParcel, k);
        break;
      case 3: 
        localObject2 = ParcelableEvent.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    ParcelableChangeInfo localParcelableChangeInfo = new com/google/android/gms/drive/realtime/internal/ParcelableChangeInfo;
    localParcelableChangeInfo.<init>(j, l, (List)localObject2);
    return localParcelableChangeInfo;
  }
  
  public ParcelableChangeInfo[] zzev(int paramInt)
  {
    return new ParcelableChangeInfo[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */