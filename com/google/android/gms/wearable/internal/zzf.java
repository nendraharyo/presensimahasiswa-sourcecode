package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAmsEntityUpdateParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramAmsEntityUpdateParcelable.zzIz();
    zzb.zza(paramParcel, 2, j);
    byte b = paramAmsEntityUpdateParcelable.zzIA();
    zzb.zza(paramParcel, 3, b);
    String str = paramAmsEntityUpdateParcelable.getValue();
    zzb.zza(paramParcel, 4, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AmsEntityUpdateParcelable zzic(Parcel paramParcel)
  {
    byte b1 = 0;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject2 = null;
    byte b2 = 0;
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
        b2 = zza.zze(paramParcel, k);
        break;
      case 3: 
        b1 = zza.zze(paramParcel, k);
        break;
      case 4: 
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
    AmsEntityUpdateParcelable localAmsEntityUpdateParcelable = new com/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;
    localAmsEntityUpdateParcelable.<init>(j, b2, b1, (String)localObject2);
    return localAmsEntityUpdateParcelable;
  }
  
  public AmsEntityUpdateParcelable[] zzlD(int paramInt)
  {
    return new AmsEntityUpdateParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */