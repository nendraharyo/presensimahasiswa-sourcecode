package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(MessageFilter paramMessageFilter, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    List localList = paramMessageFilter.zzEo();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, localList, false);
    int j = paramMessageFilter.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    localList = paramMessageFilter.zzEq();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, localList, false);
    boolean bool = paramMessageFilter.zzEp();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, bool);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public MessageFilter zzgb(Parcel paramParcel)
  {
    Object localObject1 = null;
    boolean bool = false;
    zza.zza localzza = null;
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
        localObject2 = MessageType.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = NearbyDeviceFilter.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject1, paramParcel);
      throw localzza;
    }
    MessageFilter localMessageFilter = new com/google/android/gms/nearby/messages/MessageFilter;
    localMessageFilter.<init>(j, (List)localObject2, (List)localObject1, bool);
    return localMessageFilter;
  }
  
  public MessageFilter[] zzjc(int paramInt)
  {
    return new MessageFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */