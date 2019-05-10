package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(TileOverlayOptions paramTileOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTileOverlayOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    IBinder localIBinder = paramTileOverlayOptions.zzAm();
    zzb.zza(paramParcel, 2, localIBinder, false);
    boolean bool = paramTileOverlayOptions.isVisible();
    zzb.zza(paramParcel, 3, bool);
    float f = paramTileOverlayOptions.getZIndex();
    zzb.zza(paramParcel, 4, f);
    bool = paramTileOverlayOptions.getFadeIn();
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public TileOverlayOptions zzfJ(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    float f = 0.0F;
    boolean bool2 = true;
    int j = 0;
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
        localObject1 = zza.zzq(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        f = zza.zzl(paramParcel, k);
        break;
      case 5: 
        bool2 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/maps/model/TileOverlayOptions;
    ((TileOverlayOptions)localObject2).<init>(j, (IBinder)localObject1, bool1, f, bool2);
    return (TileOverlayOptions)localObject2;
  }
  
  public TileOverlayOptions[] zzix(int paramInt)
  {
    return new TileOverlayOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */