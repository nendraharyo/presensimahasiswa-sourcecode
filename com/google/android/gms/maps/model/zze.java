package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(LatLng paramLatLng, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLatLng.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    double d = paramLatLng.latitude;
    zzb.zza(paramParcel, 2, d);
    d = paramLatLng.longitude;
    zzb.zza(paramParcel, 3, d);
    zzb.zzI(paramParcel, i);
  }
  
  public LatLng zzfz(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    double d2 = d1;
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
        d2 = zza.zzn(paramParcel, k);
        break;
      case 3: 
        d1 = zza.zzn(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/maps/model/LatLng;
    ((LatLng)localObject).<init>(j, d2, d1);
    return (LatLng)localObject;
  }
  
  public LatLng[] zzin(int paramInt)
  {
    return new LatLng[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */