package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(PlusCommonExtras paramPlusCommonExtras, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramPlusCommonExtras.zzFb();
    zzb.zza(paramParcel, 1, str, false);
    int j = paramPlusCommonExtras.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    str = paramPlusCommonExtras.zzFc();
    zzb.zza(paramParcel, 2, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlusCommonExtras zzgA(Parcel paramParcel)
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
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, k);
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
    PlusCommonExtras localPlusCommonExtras = new com/google/android/gms/plus/internal/PlusCommonExtras;
    localPlusCommonExtras.<init>(j, (String)localObject2, (String)localObject1);
    return localPlusCommonExtras;
  }
  
  public PlusCommonExtras[] zzjH(int paramInt)
  {
    return new PlusCommonExtras[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */