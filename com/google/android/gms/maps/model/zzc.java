package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGroundOverlayOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGroundOverlayOptions.zzAj();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramGroundOverlayOptions.getLocation();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    float f = paramGroundOverlayOptions.getWidth();
    zzb.zza(paramParcel, 4, f);
    f = paramGroundOverlayOptions.getHeight();
    zzb.zza(paramParcel, 5, f);
    localObject = paramGroundOverlayOptions.getBounds();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    f = paramGroundOverlayOptions.getBearing();
    zzb.zza(paramParcel, 7, f);
    f = paramGroundOverlayOptions.getZIndex();
    zzb.zza(paramParcel, 8, f);
    boolean bool = paramGroundOverlayOptions.isVisible();
    zzb.zza(paramParcel, 9, bool);
    f = paramGroundOverlayOptions.getTransparency();
    zzb.zza(paramParcel, 10, f);
    f = paramGroundOverlayOptions.getAnchorU();
    zzb.zza(paramParcel, 11, f);
    f = paramGroundOverlayOptions.getAnchorV();
    zzb.zza(paramParcel, 12, f);
    bool = paramGroundOverlayOptions.isClickable();
    zzb.zza(paramParcel, 13, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GroundOverlayOptions zzfx(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    IBinder localIBinder = null;
    Object localObject2 = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    Object localObject3 = null;
    float f3 = 0.0F;
    float f4 = 0.0F;
    boolean bool1 = false;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    boolean bool2 = false;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localObject2 = LatLng.CREATOR;
        localObject4 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 4: 
        f1 = zza.zzl(paramParcel, k);
        break;
      case 5: 
        f2 = zza.zzl(paramParcel, k);
        break;
      case 6: 
        localObject3 = LatLngBounds.CREATOR;
        localObject4 = (LatLngBounds)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 7: 
        f3 = zza.zzl(paramParcel, k);
        break;
      case 8: 
        f4 = zza.zzl(paramParcel, k);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 10: 
        f5 = zza.zzl(paramParcel, k);
        break;
      case 11: 
        f6 = zza.zzl(paramParcel, k);
        break;
      case 12: 
        f7 = zza.zzl(paramParcel, k);
        break;
      case 13: 
        bool2 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/maps/model/GroundOverlayOptions;
    ((GroundOverlayOptions)localObject4).<init>(j, localIBinder, (LatLng)localObject2, f1, f2, (LatLngBounds)localObject3, f3, f4, bool1, f5, f6, f7, bool2);
    return (GroundOverlayOptions)localObject4;
  }
  
  public GroundOverlayOptions[] zzil(int paramInt)
  {
    return new GroundOverlayOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */