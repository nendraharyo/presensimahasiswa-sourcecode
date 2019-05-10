package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(LandmarkParcel paramLandmarkParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLandmarkParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    float f = paramLandmarkParcel.x;
    zzb.zza(paramParcel, 2, f);
    f = paramLandmarkParcel.y;
    zzb.zza(paramParcel, 3, f);
    j = paramLandmarkParcel.type;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public LandmarkParcel zzhm(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    float f1 = 0.0F;
    Object localObject = null;
    int j = zza.zzau(paramParcel);
    float f2 = 0.0F;
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
        f2 = zza.zzl(paramParcel, m);
        break;
      case 3: 
        f1 = zza.zzl(paramParcel, m);
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
    LandmarkParcel localLandmarkParcel = new com/google/android/gms/vision/face/internal/client/LandmarkParcel;
    localLandmarkParcel.<init>(k, f2, f1, i);
    return localLandmarkParcel;
  }
  
  public LandmarkParcel[] zzkK(int paramInt)
  {
    return new LandmarkParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */