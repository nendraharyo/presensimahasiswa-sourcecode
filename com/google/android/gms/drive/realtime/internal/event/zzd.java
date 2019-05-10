package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.ArrayList;
import java.util.List;

public class zzd
  implements Parcelable.Creator
{
  static void zza(ParcelableEventList paramParcelableEventList, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParcelableEventList.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramParcelableEventList.zzpH;
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramParcelableEventList.zzavf;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    boolean bool = paramParcelableEventList.zzavg;
    zzb.zza(paramParcel, 4, bool);
    localObject = paramParcelableEventList.zzavh;
    zzb.zzb(paramParcel, 5, (List)localObject, false);
    localObject = paramParcelableEventList.zzavi;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableEventList zzcF(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int j = 0;
    Object localObject4 = null;
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
        localObject3 = ParcelableEvent.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 3: 
        localObject2 = DataHolder.CREATOR;
        localObject5 = (DataHolder)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 4: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 5: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 6: 
        localObject1 = ParcelableChangeInfo.CREATOR;
        localObject5 = (ParcelableChangeInfo)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/drive/realtime/internal/event/ParcelableEventList;
    ((ParcelableEventList)localObject5).<init>(j, (List)localObject3, (DataHolder)localObject2, bool, localArrayList, (ParcelableChangeInfo)localObject1);
    return (ParcelableEventList)localObject5;
  }
  
  public ParcelableEventList[] zzeB(int paramInt)
  {
    return new ParcelableEventList[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */