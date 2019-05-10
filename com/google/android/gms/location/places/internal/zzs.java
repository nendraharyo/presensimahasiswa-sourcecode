package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzs
  implements Parcelable.Creator
{
  static void zza(PlacesParams paramPlacesParams, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramPlacesParams.zzaQX;
    zzb.zza(paramParcel, 1, str, false);
    int j = paramPlacesParams.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    str = paramPlacesParams.zzaQY;
    zzb.zza(paramParcel, 2, str, false);
    str = paramPlacesParams.zzaQZ;
    zzb.zza(paramParcel, 3, str, false);
    str = paramPlacesParams.zzaPU;
    zzb.zza(paramParcel, 4, str, false);
    j = paramPlacesParams.zzaRa;
    zzb.zzc(paramParcel, 6, j);
    j = paramPlacesParams.zzaRb;
    zzb.zzc(paramParcel, 7, j);
    zzb.zzI(paramParcel, i);
  }
  
  public PlacesParams zzfo(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    String str2 = null;
    String str3 = null;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        k = zza.zzg(paramParcel, n);
        break;
      case 7: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/location/places/internal/PlacesParams;
    ((PlacesParams)localObject2).<init>(m, (String)localObject1, str3, str2, str1, k, i);
    return (PlacesParams)localObject2;
  }
  
  public PlacesParams[] zzib(int paramInt)
  {
    return new PlacesParams[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */