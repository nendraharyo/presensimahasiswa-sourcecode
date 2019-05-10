package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(MarkerOptions paramMarkerOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramMarkerOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramMarkerOptions.getPosition();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramMarkerOptions.getTitle();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramMarkerOptions.getSnippet();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramMarkerOptions.zzAk();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    float f = paramMarkerOptions.getAnchorU();
    zzb.zza(paramParcel, 6, f);
    f = paramMarkerOptions.getAnchorV();
    zzb.zza(paramParcel, 7, f);
    boolean bool = paramMarkerOptions.isDraggable();
    zzb.zza(paramParcel, 8, bool);
    bool = paramMarkerOptions.isVisible();
    zzb.zza(paramParcel, 9, bool);
    bool = paramMarkerOptions.isFlat();
    zzb.zza(paramParcel, 10, bool);
    f = paramMarkerOptions.getRotation();
    zzb.zza(paramParcel, 11, f);
    f = paramMarkerOptions.getInfoWindowAnchorU();
    zzb.zza(paramParcel, 12, f);
    f = paramMarkerOptions.getInfoWindowAnchorV();
    zzb.zza(paramParcel, 13, f);
    f = paramMarkerOptions.getAlpha();
    zzb.zza(paramParcel, 14, f);
    zzb.zzI(paramParcel, i);
  }
  
  public MarkerOptions zzfA(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    IBinder localIBinder = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    float f3 = 0.0F;
    float f4 = 0.5F;
    float f5 = 0.0F;
    float f6 = 1.0F;
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
        localObject2 = LatLng.CREATOR;
        localObject3 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 6: 
        f1 = zza.zzl(paramParcel, k);
        break;
      case 7: 
        f2 = zza.zzl(paramParcel, k);
        break;
      case 8: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 9: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 10: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 11: 
        f3 = zza.zzl(paramParcel, k);
        break;
      case 12: 
        f4 = zza.zzl(paramParcel, k);
        break;
      case 13: 
        f5 = zza.zzl(paramParcel, k);
        break;
      case 14: 
        f6 = zza.zzl(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/maps/model/MarkerOptions;
    ((MarkerOptions)localObject3).<init>(j, (LatLng)localObject2, str1, str2, localIBinder, f1, f2, bool1, bool2, bool3, f3, f4, f5, f6);
    return (MarkerOptions)localObject3;
  }
  
  public MarkerOptions[] zzio(int paramInt)
  {
    return new MarkerOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */