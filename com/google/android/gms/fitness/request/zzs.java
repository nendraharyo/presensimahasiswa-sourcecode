package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

public class zzs
  implements Parcelable.Creator
{
  static void zza(ListSubscriptionsRequest paramListSubscriptionsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramListSubscriptionsRequest.getDataType();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramListSubscriptionsRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramListSubscriptionsRequest.getCallbackBinder();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ListSubscriptionsRequest zzdx(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject3 = localObject1;
        localObject1 = localObject2;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        localObject2 = DataType.CREATOR;
        localObject3 = (DataType)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        k = j;
        Object localObject4 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
        continue;
        m = zza.zzg(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        k = m;
        localObject3 = localObject4;
        continue;
        localObject3 = zza.zzq(paramParcel, m);
        localObject1 = localObject2;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/request/ListSubscriptionsRequest;
    ((ListSubscriptionsRequest)localObject3).<init>(j, (DataType)localObject2, (IBinder)localObject1);
    return (ListSubscriptionsRequest)localObject3;
  }
  
  public ListSubscriptionsRequest[] zzfx(int paramInt)
  {
    return new ListSubscriptionsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */