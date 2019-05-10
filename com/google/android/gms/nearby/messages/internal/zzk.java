package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(MessageType paramMessageType, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramMessageType.zzamD;
    zzb.zza(paramParcel, 1, str, false);
    int j = paramMessageType.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    str = paramMessageType.type;
    zzb.zza(paramParcel, 2, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public MessageType zzgj(Parcel paramParcel)
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
    MessageType localMessageType = new com/google/android/gms/nearby/messages/internal/MessageType;
    localMessageType.<init>(j, (String)localObject2, (String)localObject1);
    return localMessageType;
  }
  
  public MessageType[] zzjo(int paramInt)
  {
    return new MessageType[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */