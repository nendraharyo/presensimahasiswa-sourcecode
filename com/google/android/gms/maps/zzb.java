package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class zzb
  implements Parcelable.Creator
{
  static void zza(StreetViewPanoramaOptions paramStreetViewPanoramaOptions, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramStreetViewPanoramaOptions.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramStreetViewPanoramaOptions.getStreetViewPanoramaCamera();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramStreetViewPanoramaOptions.getPanoramaId();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramStreetViewPanoramaOptions.getPosition();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramStreetViewPanoramaOptions.getRadius();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (Integer)localObject, false);
    j = paramStreetViewPanoramaOptions.zzAa();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, j);
    byte b = paramStreetViewPanoramaOptions.zzzP();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, b);
    b = paramStreetViewPanoramaOptions.zzAb();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, b);
    b = paramStreetViewPanoramaOptions.zzAc();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, b);
    b = paramStreetViewPanoramaOptions.zzzL();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 10, b);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public StreetViewPanoramaOptions zzfu(Parcel paramParcel)
  {
    Integer localInteger = null;
    byte b1 = 0;
    int i = zza.zzau(paramParcel);
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    byte b5 = 0;
    Object localObject1 = null;
    String str = null;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
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
        localObject2 = StreetViewPanoramaCamera.CREATOR;
        localObject4 = (StreetViewPanoramaCamera)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject1 = LatLng.CREATOR;
        localObject4 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 5: 
        localInteger = zza.zzh(paramParcel, k);
        break;
      case 6: 
        b5 = zza.zze(paramParcel, k);
        break;
      case 7: 
        b4 = zza.zze(paramParcel, k);
        break;
      case 8: 
        b3 = zza.zze(paramParcel, k);
        break;
      case 9: 
        b2 = zza.zze(paramParcel, k);
        break;
      case 10: 
        b1 = zza.zze(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/maps/StreetViewPanoramaOptions;
    ((StreetViewPanoramaOptions)localObject4).<init>(j, (StreetViewPanoramaCamera)localObject2, str, (LatLng)localObject1, localInteger, b5, b4, b3, b2, b1);
    return (StreetViewPanoramaOptions)localObject4;
  }
  
  public StreetViewPanoramaOptions[] zzii(int paramInt)
  {
    return new StreetViewPanoramaOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */