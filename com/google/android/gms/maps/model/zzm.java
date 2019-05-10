package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm
  implements Parcelable.Creator
{
  static void zza(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStreetViewPanoramaOrientation.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    float f = paramStreetViewPanoramaOrientation.tilt;
    zzb.zza(paramParcel, 2, f);
    f = paramStreetViewPanoramaOrientation.bearing;
    zzb.zza(paramParcel, 3, f);
    zzb.zzI(paramParcel, i);
  }
  
  public StreetViewPanoramaOrientation zzfH(Parcel paramParcel)
  {
    float f1 = 0.0F;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
    float f2 = 0.0F;
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
    StreetViewPanoramaOrientation localStreetViewPanoramaOrientation = new com/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    localStreetViewPanoramaOrientation.<init>(j, f2, f1);
    return localStreetViewPanoramaOrientation;
  }
  
  public StreetViewPanoramaOrientation[] zziv(int paramInt)
  {
    return new StreetViewPanoramaOrientation[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */