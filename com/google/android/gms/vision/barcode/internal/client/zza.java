package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(BarcodeDetectorOptions paramBarcodeDetectorOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramBarcodeDetectorOptions.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramBarcodeDetectorOptions.zzbnw;
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public BarcodeDetectorOptions zzhj(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
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
    BarcodeDetectorOptions localBarcodeDetectorOptions = new com/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;
    localBarcodeDetectorOptions.<init>(k, i);
    return localBarcodeDetectorOptions;
  }
  
  public BarcodeDetectorOptions[] zzkG(int paramInt)
  {
    return new BarcodeDetectorOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */