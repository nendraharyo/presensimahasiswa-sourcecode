package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzk
  implements Parcelable.Creator
{
  static void zza(CapabilityInfoParcelable paramCapabilityInfoParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCapabilityInfoParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCapabilityInfoParcelable.getName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCapabilityInfoParcelable.zzII();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CapabilityInfoParcelable zzie(Parcel paramParcel)
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject1 = NodeParcelable.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
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
    CapabilityInfoParcelable localCapabilityInfoParcelable = new com/google/android/gms/wearable/internal/CapabilityInfoParcelable;
    localCapabilityInfoParcelable.<init>(j, (String)localObject2, (List)localObject1);
    return localCapabilityInfoParcelable;
  }
  
  public CapabilityInfoParcelable[] zzlF(int paramInt)
  {
    return new CapabilityInfoParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */