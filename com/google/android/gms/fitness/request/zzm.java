package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSet;

public class zzm
  implements Parcelable.Creator
{
  static void zza(DataUpdateRequest paramDataUpdateRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramDataUpdateRequest.zzlO();
    zzb.zza(paramParcel, 1, l);
    int j = paramDataUpdateRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    l = paramDataUpdateRequest.zzud();
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramDataUpdateRequest.getDataSet();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramDataUpdateRequest.getCallbackBinder();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataUpdateRequest zzds(Parcel paramParcel)
  {
    long l1 = 0L;
    IBinder localIBinder = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    long l2 = l1;
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
        l2 = zza.zzi(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        localObject2 = DataSet.CREATOR;
        localObject3 = (DataSet)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 4: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/request/DataUpdateRequest;
    ((DataUpdateRequest)localObject3).<init>(j, l2, l1, (DataSet)localObject2, localIBinder);
    return (DataUpdateRequest)localObject3;
  }
  
  public DataUpdateRequest[] zzfs(int paramInt)
  {
    return new DataUpdateRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */