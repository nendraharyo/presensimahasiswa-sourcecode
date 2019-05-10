package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzi
  implements Parcelable.Creator
{
  static void zza(PolylineOptions paramPolylineOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPolylineOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    List localList = paramPolylineOptions.getPoints();
    zzb.zzc(paramParcel, 2, localList, false);
    float f = paramPolylineOptions.getWidth();
    zzb.zza(paramParcel, 3, f);
    j = paramPolylineOptions.getColor();
    zzb.zzc(paramParcel, 4, j);
    f = paramPolylineOptions.getZIndex();
    zzb.zza(paramParcel, 5, f);
    boolean bool = paramPolylineOptions.isVisible();
    zzb.zza(paramParcel, 6, bool);
    bool = paramPolylineOptions.isGeodesic();
    zzb.zza(paramParcel, 7, bool);
    bool = paramPolylineOptions.isClickable();
    zzb.zza(paramParcel, 8, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public PolylineOptions zzfD(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    float f2 = 0.0F;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = LatLng.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
        break;
      case 3: 
        f2 = zza.zzl(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
        break;
      case 5: 
        f1 = zza.zzl(paramParcel, m);
        break;
      case 6: 
        bool3 = zza.zzc(paramParcel, m);
        break;
      case 7: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 8: 
        bool1 = zza.zzc(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/maps/model/PolylineOptions;
    ((PolylineOptions)localObject2).<init>(k, (List)localObject1, f2, j, f1, bool3, bool2, bool1);
    return (PolylineOptions)localObject2;
  }
  
  public PolylineOptions[] zzir(int paramInt)
  {
    return new PolylineOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */