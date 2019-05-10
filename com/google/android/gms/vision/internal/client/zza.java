package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FrameMetadataParcel paramFrameMetadataParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFrameMetadataParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramFrameMetadataParcel.width;
    zzb.zzc(paramParcel, 2, j);
    j = paramFrameMetadataParcel.height;
    zzb.zzc(paramParcel, 3, j);
    j = paramFrameMetadataParcel.id;
    zzb.zzc(paramParcel, 4, j);
    long l = paramFrameMetadataParcel.zzboe;
    zzb.zza(paramParcel, 5, l);
    j = paramFrameMetadataParcel.rotation;
    zzb.zzc(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
  
  public FrameMetadataParcel zzhn(Parcel paramParcel)
  {
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    long l = 0L;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    StringBuilder localStringBuilder = null;
    for (;;)
    {
      i2 = paramParcel.dataPosition();
      if (i2 >= j) {
        break;
      }
      i2 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i3 = com.google.android.gms.common.internal.safeparcel.zza.zzca(i2);
      switch (i3)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i2);
        break;
      case 1: 
        i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 2: 
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 3: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
        break;
      case 5: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, i2);
        break;
      case 6: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i2);
      }
    }
    int i2 = paramParcel.dataPosition();
    if (i2 != j)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + j;
      ((zza.zza)localObject).<init>(str, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/vision/internal/client/FrameMetadataParcel;
    ((FrameMetadataParcel)localObject).<init>(i1, n, m, k, l, i);
    return (FrameMetadataParcel)localObject;
  }
  
  public FrameMetadataParcel[] zzkL(int paramInt)
  {
    return new FrameMetadataParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\internal\client\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */