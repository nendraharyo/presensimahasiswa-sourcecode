package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(CastDevice paramCastDevice, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramCastDevice.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCastDevice.zzny();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCastDevice.zzZU;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramCastDevice.getFriendlyName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramCastDevice.getModelName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramCastDevice.getDeviceVersion();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (String)localObject, false);
    j = paramCastDevice.getServicePort();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 7, j);
    localObject = paramCastDevice.getIcons();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 8, (List)localObject, false);
    j = paramCastDevice.getCapabilities();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 9, j);
    j = paramCastDevice.getStatus();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 10, j);
    localObject = paramCastDevice.zznz();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 11, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public CastDevice[] zzaX(int paramInt)
  {
    return new CastDevice[paramInt];
  }
  
  public CastDevice zzaa(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int k = -1;
    Object localObject1 = null;
    int m = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject2 = null;
    int n = 0;
    zza.zza localzza = null;
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
        localObject2 = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, i1);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, i1);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, i1);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 7: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 8: 
        localObject1 = WebImage.CREATOR;
        localObject1 = zza.zzc(paramParcel, i1, (Parcelable.Creator)localObject1);
        break;
      case 9: 
        i = zza.zzg(paramParcel, i1);
        break;
      case 10: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 11: 
        str1 = zza.zzp(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject3, paramParcel);
      throw localzza;
    }
    Object localObject3 = new com/google/android/gms/cast/CastDevice;
    ((CastDevice)localObject3).<init>(n, (String)localObject2, str5, str4, str3, str2, m, (List)localObject1, i, k, str1);
    return (CastDevice)localObject3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */