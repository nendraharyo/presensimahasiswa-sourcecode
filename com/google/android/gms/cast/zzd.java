package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LaunchOptions paramLaunchOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLaunchOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramLaunchOptions.getRelaunchIfRunning();
    zzb.zza(paramParcel, 2, bool);
    String str = paramLaunchOptions.getLanguage();
    zzb.zza(paramParcel, 3, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LaunchOptions[] zzaZ(int paramInt)
  {
    return new LaunchOptions[paramInt];
  }
  
  public LaunchOptions zzac(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject2 = null;
    int j = 0;
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
        bool = zza.zzc(paramParcel, k);
        break;
      case 3: 
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
    LaunchOptions localLaunchOptions = new com/google/android/gms/cast/LaunchOptions;
    localLaunchOptions.<init>(j, bool, (String)localObject2);
    return localLaunchOptions;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */