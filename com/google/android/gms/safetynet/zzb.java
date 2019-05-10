package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(SafeBrowsingData paramSafeBrowsingData, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramSafeBrowsingData.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    String str = paramSafeBrowsingData.getMetadata();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, str, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public SafeBrowsingData zzgP(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = zza.zzp(paramParcel, k);
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
    SafeBrowsingData localSafeBrowsingData = new com/google/android/gms/safetynet/SafeBrowsingData;
    localSafeBrowsingData.<init>(j, (String)localObject2);
    return localSafeBrowsingData;
  }
  
  public SafeBrowsingData[] zzjW(int paramInt)
  {
    return new SafeBrowsingData[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\safetynet\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */