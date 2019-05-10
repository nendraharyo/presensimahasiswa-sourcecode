package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(Strategy paramStrategy, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStrategy.zzbbL;
    zzb.zzc(paramParcel, 1, j);
    j = paramStrategy.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    j = paramStrategy.zzbbM;
    zzb.zzc(paramParcel, 2, j);
    j = paramStrategy.zzbbN;
    zzb.zzc(paramParcel, 3, j);
    boolean bool = paramStrategy.zzbbO;
    zzb.zza(paramParcel, 4, bool);
    int k = paramStrategy.zzEr();
    zzb.zzc(paramParcel, 5, k);
    k = paramStrategy.zzEs();
    zzb.zzc(paramParcel, 6, k);
    zzb.zzI(paramParcel, i);
  }
  
  public Strategy zzgc(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = 0;
    boolean bool = false;
    int m = 0;
    int n = 0;
    int i1 = 0;
    StringBuilder localStringBuilder = null;
    int i2 = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i3 = paramParcel.dataPosition();
      if (i3 >= j) {
        break;
      }
      i3 = zza.zzat(paramParcel);
      int i4 = zza.zzca(i3);
      switch (i4)
      {
      default: 
        zza.zzb(paramParcel, i3);
        break;
      case 1: 
        i1 = zza.zzg(paramParcel, i3);
        break;
      case 1000: 
        i2 = zza.zzg(paramParcel, i3);
        break;
      case 2: 
        n = zza.zzg(paramParcel, i3);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i3);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, i3);
        break;
      case 5: 
        k = zza.zzg(paramParcel, i3);
        break;
      case 6: 
        i = zza.zzg(paramParcel, i3);
      }
    }
    int i3 = paramParcel.dataPosition();
    if (i3 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/nearby/messages/Strategy;
    ((Strategy)localObject).<init>(i2, i1, n, m, bool, k, i);
    return (Strategy)localObject;
  }
  
  public Strategy[] zzjh(int paramInt)
  {
    return new Strategy[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */