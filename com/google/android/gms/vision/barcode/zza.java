package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(Barcode.Address paramAddress, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAddress.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramAddress.type;
    zzb.zzc(paramParcel, 2, j);
    String[] arrayOfString = paramAddress.addressLines;
    zzb.zza(paramParcel, 3, arrayOfString, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.Address zzgW(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
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
        break;
      case 3: 
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzB(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    Barcode.Address localAddress = new com/google/android/gms/vision/barcode/Barcode$Address;
    localAddress.<init>(k, i, (String[])localObject2);
    return localAddress;
  }
  
  public Barcode.Address[] zzkt(int paramInt)
  {
    return new Barcode.Address[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */