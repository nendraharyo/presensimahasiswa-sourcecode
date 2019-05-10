package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;
import java.util.List;

public class zzh
  implements Parcelable.Creator
{
  static void zza(ListSubscriptionsResult paramListSubscriptionsResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramListSubscriptionsResult.getSubscriptions();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramListSubscriptionsResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramListSubscriptionsResult.getStatus();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ListSubscriptionsResult zzdU(Parcel paramParcel)
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
        localObject2 = Subscription.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = Status.CREATOR;
        localObject1 = (Status)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    ListSubscriptionsResult localListSubscriptionsResult = new com/google/android/gms/fitness/result/ListSubscriptionsResult;
    localListSubscriptionsResult.<init>(j, (List)localObject2, (Status)localObject1);
    return localListSubscriptionsResult;
  }
  
  public ListSubscriptionsResult[] zzfV(int paramInt)
  {
    return new ListSubscriptionsResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */