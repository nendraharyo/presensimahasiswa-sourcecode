package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(CircleOptions paramCircleOptions, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramCircleOptions.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    LatLng localLatLng = paramCircleOptions.getCenter();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, localLatLng, paramInt, false);
    double d = paramCircleOptions.getRadius();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, d);
    float f = paramCircleOptions.getStrokeWidth();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, f);
    j = paramCircleOptions.getStrokeColor();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 5, j);
    j = paramCircleOptions.getFillColor();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 6, j);
    f = paramCircleOptions.getZIndex();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, f);
    boolean bool = paramCircleOptions.isVisible();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, bool);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public CircleOptions zzfw(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    double d = 0.0D;
    int j = 0;
    int k = 0;
    float f2 = 0.0F;
    int m = 0;
    StringBuilder localStringBuilder = null;
    Object localObject2;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = LatLng.CREATOR;
        localObject2 = (LatLng)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        break;
      case 3: 
        d = zza.zzn(paramParcel, n);
        break;
      case 4: 
        f2 = zza.zzl(paramParcel, n);
        break;
      case 5: 
        k = zza.zzg(paramParcel, n);
        break;
      case 6: 
        j = zza.zzg(paramParcel, n);
        break;
      case 7: 
        f1 = zza.zzl(paramParcel, n);
        break;
      case 8: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = new com/google/android/gms/maps/model/CircleOptions;
    ((CircleOptions)localObject3).<init>(m, (LatLng)localObject1, d, f2, k, j, f1, bool);
    return (CircleOptions)localObject3;
  }
  
  public CircleOptions[] zzik(int paramInt)
  {
    return new CircleOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */