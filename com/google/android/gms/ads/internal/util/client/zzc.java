package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(VersionInfoParcel paramVersionInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramVersionInfoParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramVersionInfoParcel.afmaVersion;
    zzb.zza(paramParcel, 2, str, false);
    j = paramVersionInfoParcel.zzMZ;
    zzb.zzc(paramParcel, 3, j);
    j = paramVersionInfoParcel.zzNa;
    zzb.zzc(paramParcel, 4, j);
    boolean bool = paramVersionInfoParcel.zzNb;
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public VersionInfoParcel[] zzR(int paramInt)
  {
    return new VersionInfoParcel[paramInt];
  }
  
  public VersionInfoParcel zzp(Parcel paramParcel)
  {
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    int j = 0;
    int k = 0;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        j = zza.zzg(paramParcel, n);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    ((VersionInfoParcel)localObject2).<init>(m, (String)localObject1, k, j, bool);
    return (VersionInfoParcel)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\interna\\util\client\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */