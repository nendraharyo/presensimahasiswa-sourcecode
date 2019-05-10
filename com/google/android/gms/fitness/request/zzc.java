package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

public class zzc
  implements Parcelable.Creator
{
  static void zza(DailyTotalRequest paramDailyTotalRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDailyTotalRequest.getCallbackBinder();
    zzb.zza(paramParcel, 1, (IBinder)localObject, false);
    int j = paramDailyTotalRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDailyTotalRequest.getDataType();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DailyTotalRequest zzdi(Parcel paramParcel)
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
        localObject2 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = DataType.CREATOR;
        localObject1 = (DataType)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    DailyTotalRequest localDailyTotalRequest = new com/google/android/gms/fitness/request/DailyTotalRequest;
    localDailyTotalRequest.<init>(j, (IBinder)localObject2, (DataType)localObject1);
    return localDailyTotalRequest;
  }
  
  public DailyTotalRequest[] zzfi(int paramInt)
  {
    return new DailyTotalRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */