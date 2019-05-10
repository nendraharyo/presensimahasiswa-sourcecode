package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(ChannelImpl paramChannelImpl, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramChannelImpl.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramChannelImpl.getToken();
    zzb.zza(paramParcel, 2, str, false);
    str = paramChannelImpl.getNodeId();
    zzb.zza(paramParcel, 3, str, false);
    str = paramChannelImpl.getPath();
    zzb.zza(paramParcel, 4, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ChannelImpl zzig(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
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
    ChannelImpl localChannelImpl = new com/google/android/gms/wearable/internal/ChannelImpl;
    localChannelImpl.<init>(j, str, (String)localObject2, (String)localObject1);
    return localChannelImpl;
  }
  
  public ChannelImpl[] zzlJ(int paramInt)
  {
    return new ChannelImpl[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */