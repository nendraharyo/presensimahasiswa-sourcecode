package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(NearbyDevice paramNearbyDevice, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramNearbyDevice.zzEz();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramNearbyDevice.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramNearbyDevice.getUrl();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramNearbyDevice.zzEC();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramNearbyDevice.zzEA();
    zzb.zza(paramParcel, 4, (Parcelable[])localObject, paramInt, false);
    localObject = paramNearbyDevice.zzEB();
    zzb.zza(paramParcel, 5, (String[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyDevice zzgd(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    Object localObject3 = null;
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
        localObject3 = NearbyDeviceId.CREATOR;
        localObject4 = (NearbyDeviceId)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject2 = NearbyDeviceId.CREATOR;
        localObject4 = (NearbyDeviceId[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        arrayOfString = zza.zzB(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/nearby/messages/devices/NearbyDevice;
    ((NearbyDevice)localObject4).<init>(j, (NearbyDeviceId)localObject3, str2, str1, (NearbyDeviceId[])localObject2, arrayOfString);
    return (NearbyDevice)localObject4;
  }
  
  public NearbyDevice[] zzji(int paramInt)
  {
    return new NearbyDevice[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */