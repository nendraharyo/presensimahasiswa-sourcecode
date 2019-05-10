package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(TimeInterval paramTimeInterval, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTimeInterval.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    long l = paramTimeInterval.zzbqP;
    zzb.zza(paramParcel, 2, l);
    l = paramTimeInterval.zzbqQ;
    zzb.zza(paramParcel, 3, l);
    zzb.zzI(paramParcel, i);
  }
  
  public TimeInterval zzhU(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    long l2 = l1;
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
        l2 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/wallet/wobs/TimeInterval;
    ((TimeInterval)localObject).<init>(j, l2, l1);
    return (TimeInterval)localObject;
  }
  
  public TimeInterval[] zzlv(int paramInt)
  {
    return new TimeInterval[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */