package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

public class zza
  implements Parcelable.Creator
{
  static void zza(Message paramMessage, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramMessage.getContent();
    zzb.zza(paramParcel, 1, (byte[])localObject, false);
    int j = paramMessage.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramMessage.getType();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramMessage.getNamespace();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramMessage.zzEn();
    zzb.zza(paramParcel, 4, (Parcelable[])localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Message zzga(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    byte[] arrayOfByte = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        arrayOfByte = com.google.android.gms.common.internal.safeparcel.zza.zzs(paramParcel, k);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject1 = NearbyDevice.CREATOR;
        localObject3 = (NearbyDevice[])com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/nearby/messages/Message;
    ((Message)localObject3).<init>(j, arrayOfByte, str2, str1, (NearbyDevice[])localObject1);
    return (Message)localObject3;
  }
  
  public Message[] zzjb(int paramInt)
  {
    return new Message[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */