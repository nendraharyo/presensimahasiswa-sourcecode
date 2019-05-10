package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class zzk
  implements Parcelable.Creator
{
  static void zza(DataUpdateListenerRegistrationRequest paramDataUpdateListenerRegistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataUpdateListenerRegistrationRequest.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramDataUpdateListenerRegistrationRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataUpdateListenerRegistrationRequest.getDataType();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramDataUpdateListenerRegistrationRequest.getIntent();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramDataUpdateListenerRegistrationRequest.getCallbackBinder();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataUpdateListenerRegistrationRequest zzdq(Parcel paramParcel)
  {
    IBinder localIBinder = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
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
        localObject4 = DataSource.CREATOR;
        localObject5 = (DataSource)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject3 = DataType.CREATOR;
        localObject5 = (DataType)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        localObject2 = PendingIntent.CREATOR;
        localObject5 = (PendingIntent)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 4: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;
    ((DataUpdateListenerRegistrationRequest)localObject5).<init>(j, (DataSource)localObject4, (DataType)localObject3, (PendingIntent)localObject2, localIBinder);
    return (DataUpdateListenerRegistrationRequest)localObject5;
  }
  
  public DataUpdateListenerRegistrationRequest[] zzfq(int paramInt)
  {
    return new DataUpdateListenerRegistrationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */