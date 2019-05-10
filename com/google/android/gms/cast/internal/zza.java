package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ApplicationStatus paramApplicationStatus, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramApplicationStatus.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    String str = paramApplicationStatus.zzoe();
    zzb.zza(paramParcel, 2, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ApplicationStatus zzad(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    ApplicationStatus localApplicationStatus = new com/google/android/gms/cast/internal/ApplicationStatus;
    localApplicationStatus.<init>(j, (String)localObject2);
    return localApplicationStatus;
  }
  
  public ApplicationStatus[] zzbi(int paramInt)
  {
    return new ApplicationStatus[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */