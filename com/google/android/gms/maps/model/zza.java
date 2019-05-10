package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(CameraPosition paramCameraPosition, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCameraPosition.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    LatLng localLatLng = paramCameraPosition.target;
    zzb.zza(paramParcel, 2, localLatLng, paramInt, false);
    float f = paramCameraPosition.zoom;
    zzb.zza(paramParcel, 3, f);
    f = paramCameraPosition.tilt;
    zzb.zza(paramParcel, 4, f);
    f = paramCameraPosition.bearing;
    zzb.zza(paramParcel, 5, f);
    zzb.zzI(paramParcel, i);
  }
  
  public CameraPosition zzfv(Parcel paramParcel)
  {
    float f1 = 0.0F;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = LatLng.CREATOR;
        localObject3 = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 3: 
        f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, k);
        break;
      case 4: 
        f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, k);
        break;
      case 5: 
        f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/maps/model/CameraPosition;
    ((CameraPosition)localObject3).<init>(j, (LatLng)localObject2, f3, f2, f1);
    return (CameraPosition)localObject3;
  }
  
  public CameraPosition[] zzij(int paramInt)
  {
    return new CameraPosition[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */