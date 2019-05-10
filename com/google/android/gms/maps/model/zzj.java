package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStreetViewPanoramaCamera.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    float f = paramStreetViewPanoramaCamera.zoom;
    zzb.zza(paramParcel, 2, f);
    f = paramStreetViewPanoramaCamera.tilt;
    zzb.zza(paramParcel, 3, f);
    f = paramStreetViewPanoramaCamera.bearing;
    zzb.zza(paramParcel, 4, f);
    zzb.zzI(paramParcel, i);
  }
  
  public StreetViewPanoramaCamera zzfE(Parcel paramParcel)
  {
    float f1 = 0.0F;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    float f2 = 0.0F;
    int j = 0;
    Object localObject = null;
    float f3 = 0.0F;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        f2 = zza.zzl(paramParcel, k);
        break;
      case 3: 
        f3 = zza.zzl(paramParcel, k);
        break;
      case 4: 
        f1 = zza.zzl(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    StreetViewPanoramaCamera localStreetViewPanoramaCamera = new com/google/android/gms/maps/model/StreetViewPanoramaCamera;
    localStreetViewPanoramaCamera.<init>(j, f2, f3, f1);
    return localStreetViewPanoramaCamera;
  }
  
  public StreetViewPanoramaCamera[] zzis(int paramInt)
  {
    return new StreetViewPanoramaCamera[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */