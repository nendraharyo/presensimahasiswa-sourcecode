package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(StreetViewPanoramaLink paramStreetViewPanoramaLink, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStreetViewPanoramaLink.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    String str = paramStreetViewPanoramaLink.panoId;
    zzb.zza(paramParcel, 2, str, false);
    float f = paramStreetViewPanoramaLink.bearing;
    zzb.zza(paramParcel, 3, f);
    zzb.zzI(paramParcel, i);
  }
  
  public StreetViewPanoramaLink zzfF(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
    float f = 0.0F;
    zza.zza localzza = null;
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
        localObject = zza.zzp(paramParcel, k);
        break;
      case 3: 
        f = zza.zzl(paramParcel, k);
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
    StreetViewPanoramaLink localStreetViewPanoramaLink = new com/google/android/gms/maps/model/StreetViewPanoramaLink;
    localStreetViewPanoramaLink.<init>(j, (String)localObject, f);
    return localStreetViewPanoramaLink;
  }
  
  public StreetViewPanoramaLink[] zzit(int paramInt)
  {
    return new StreetViewPanoramaLink[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */