package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(ChannelEventParcelable paramChannelEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramChannelEventParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    ChannelImpl localChannelImpl = paramChannelEventParcelable.zzbsc;
    zzb.zza(paramParcel, 2, localChannelImpl, paramInt, false);
    j = paramChannelEventParcelable.type;
    zzb.zzc(paramParcel, 3, j);
    j = paramChannelEventParcelable.zzbsa;
    zzb.zzc(paramParcel, 4, j);
    j = paramChannelEventParcelable.zzbsb;
    zzb.zzc(paramParcel, 5, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ChannelEventParcelable zzif(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    Object localObject2 = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        localObject1 = ChannelImpl.CREATOR;
        localObject3 = (ChannelImpl)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/wearable/internal/ChannelEventParcelable;
    ((ChannelEventParcelable)localObject3).<init>(n, (ChannelImpl)localObject1, m, k, i);
    return (ChannelEventParcelable)localObject3;
  }
  
  public ChannelEventParcelable[] zzlI(int paramInt)
  {
    return new ChannelEventParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */