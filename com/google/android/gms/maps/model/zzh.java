package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PolygonOptions paramPolygonOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPolygonOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    List localList = paramPolygonOptions.getPoints();
    zzb.zzc(paramParcel, 2, localList, false);
    localList = paramPolygonOptions.zzAl();
    zzb.zzd(paramParcel, 3, localList, false);
    float f = paramPolygonOptions.getStrokeWidth();
    zzb.zza(paramParcel, 4, f);
    j = paramPolygonOptions.getStrokeColor();
    zzb.zzc(paramParcel, 5, j);
    j = paramPolygonOptions.getFillColor();
    zzb.zzc(paramParcel, 6, j);
    f = paramPolygonOptions.getZIndex();
    zzb.zza(paramParcel, 7, f);
    boolean bool = paramPolygonOptions.isVisible();
    zzb.zza(paramParcel, 8, bool);
    bool = paramPolygonOptions.isGeodesic();
    zzb.zza(paramParcel, 9, bool);
    bool = paramPolygonOptions.isClickable();
    zzb.zza(paramParcel, 10, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public PolygonOptions zzfC(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    float f2 = 0.0F;
    int m = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject1);
        break;
      case 3: 
        ClassLoader localClassLoader = getClass().getClassLoader();
        zza.zza(paramParcel, n, localArrayList, localClassLoader);
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
        bool3 = zza.zzc(paramParcel, n);
        break;
      case 9: 
        bool2 = zza.zzc(paramParcel, n);
        break;
      case 10: 
        bool1 = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/maps/model/PolygonOptions;
    ((PolygonOptions)localObject2).<init>(m, (List)localObject1, localArrayList, f2, k, j, f1, bool3, bool2, bool1);
    return (PolygonOptions)localObject2;
  }
  
  public PolygonOptions[] zziq(int paramInt)
  {
    return new PolygonOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */