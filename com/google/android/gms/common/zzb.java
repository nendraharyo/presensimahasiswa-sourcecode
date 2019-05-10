package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(ConnectionResult paramConnectionResult, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramConnectionResult.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    j = paramConnectionResult.getErrorCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    Object localObject = paramConnectionResult.getResolution();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramConnectionResult.getErrorMessage();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public ConnectionResult zzag(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    int n = paramParcel.dataPosition();
    if (n < j)
    {
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        localObject3 = localObject1;
        localObject1 = localObject2;
        k = i;
        i = m;
      }
      for (;;)
      {
        m = i;
        i = k;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        n = zza.zzg(paramParcel, n);
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        k = i;
        i = n;
        localObject3 = localObject4;
        continue;
        n = zza.zzg(paramParcel, n);
        i = m;
        localObject4 = localObject2;
        k = n;
        localObject3 = localObject1;
        localObject1 = localObject2;
        continue;
        localObject2 = PendingIntent.CREATOR;
        localObject3 = (PendingIntent)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        k = i;
        i = m;
        localObject4 = localObject1;
        localObject1 = localObject3;
        localObject3 = localObject4;
        continue;
        localObject3 = zza.zzp(paramParcel, n);
        localObject1 = localObject2;
        k = i;
        i = m;
      }
    }
    n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/ConnectionResult;
    ((ConnectionResult)localObject3).<init>(m, i, (PendingIntent)localObject2, (String)localObject1);
    return (ConnectionResult)localObject3;
  }
  
  public ConnectionResult[] zzbt(int paramInt)
  {
    return new ConnectionResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */