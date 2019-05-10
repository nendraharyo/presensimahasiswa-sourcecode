package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm
  implements Parcelable.Creator
{
  static void zza(Barcode.WiFi paramWiFi, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramWiFi.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramWiFi.ssid;
    zzb.zza(paramParcel, 2, str, false);
    str = paramWiFi.password;
    zzb.zza(paramParcel, 3, str, false);
    j = paramWiFi.encryptionType;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.WiFi zzhi(Parcel paramParcel)
  {
    Object localObject = null;
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    String str = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str = zza.zzp(paramParcel, m);
        break;
      case 3: 
        localObject = zza.zzp(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Barcode.WiFi localWiFi = new com/google/android/gms/vision/barcode/Barcode$WiFi;
    localWiFi.<init>(k, str, (String)localObject, i);
    return localWiFi;
  }
  
  public Barcode.WiFi[] zzkF(int paramInt)
  {
    return new Barcode.WiFi[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */