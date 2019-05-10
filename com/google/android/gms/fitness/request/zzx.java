package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.List;

public class zzx
  implements Parcelable.Creator
{
  static void zza(SessionInsertRequest paramSessionInsertRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSessionInsertRequest.getSession();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSessionInsertRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSessionInsertRequest.getDataSets();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramSessionInsertRequest.getAggregateDataPoints();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramSessionInsertRequest.getCallbackBinder();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionInsertRequest zzdC(Parcel paramParcel)
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
        localObject4 = Session.CREATOR;
        localObject5 = (Session)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject3 = DataSet.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 3: 
        localObject2 = DataPoint.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
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
    Object localObject5 = new com/google/android/gms/fitness/request/SessionInsertRequest;
    ((SessionInsertRequest)localObject5).<init>(j, (Session)localObject4, (List)localObject3, (List)localObject2, localIBinder);
    return (SessionInsertRequest)localObject5;
  }
  
  public SessionInsertRequest[] zzfD(int paramInt)
  {
    return new SessionInsertRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */