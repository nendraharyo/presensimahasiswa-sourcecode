package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStatus.getStatusCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramStatus.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramStatus.getStatusMessage();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramStatus.zzpc();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Status zzai(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject2 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        localObject1 = PendingIntent.CREATOR;
        localObject1 = (PendingIntent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(k, i, (String)localObject2, (PendingIntent)localObject1);
    return localStatus;
  }
  
  public Status[] zzby(int paramInt)
  {
    return new Status[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */