package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(SyncInfoResult paramSyncInfoResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Status localStatus = paramSyncInfoResult.getStatus();
    zzb.zza(paramParcel, 1, localStatus, paramInt, false);
    int j = paramSyncInfoResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramSyncInfoResult.zzvq();
    zzb.zza(paramParcel, 2, l);
    zzb.zzI(paramParcel, i);
  }
  
  public SyncInfoResult zzdY(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l1 = 0L;
    int k = paramParcel.dataPosition();
    Object localObject3;
    if (k < i)
    {
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      long l2;
      Object localObject2;
      int n;
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        l2 = l1;
        localObject2 = localObject1;
        n = j;
      }
      for (;;)
      {
        localObject1 = localObject2;
        j = n;
        l1 = l2;
        break;
        localObject3 = Status.CREATOR;
        localObject4 = (Status)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject2 = localObject4;
        n = j;
        l2 = l1;
        continue;
        k = zza.zzg(paramParcel, k);
        localObject2 = localObject1;
        n = k;
        l2 = l1;
        continue;
        l2 = zza.zzi(paramParcel, k);
        localObject2 = localObject1;
        n = j;
      }
    }
    k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/fitness/result/SyncInfoResult;
    ((SyncInfoResult)localObject4).<init>(j, (Status)localObject1, l1);
    return (SyncInfoResult)localObject4;
  }
  
  public SyncInfoResult[] zzfZ(int paramInt)
  {
    return new SyncInfoResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */