package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzg
  implements Parcelable.Creator
{
  static void zza(PlaceFilter paramPlaceFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    List localList = paramPlaceFilter.zzaPk;
    zzb.zza(paramParcel, 1, localList, false);
    int j = paramPlaceFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramPlaceFilter.zzaPA;
    zzb.zza(paramParcel, 3, bool);
    localList = paramPlaceFilter.zzaPl;
    zzb.zzc(paramParcel, 4, localList, false);
    localList = paramPlaceFilter.zzaPj;
    zzb.zzb(paramParcel, 6, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceFilter zzfe(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    Object localObject2 = null;
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
        localObject2 = zza.zzC(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 4: 
        localObject1 = UserDataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 6: 
        localArrayList = zza.zzD(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject3, paramParcel);
      throw localzza;
    }
    Object localObject3 = new com/google/android/gms/location/places/PlaceFilter;
    ((PlaceFilter)localObject3).<init>(j, (List)localObject2, bool, localArrayList, (List)localObject1);
    return (PlaceFilter)localObject3;
  }
  
  public PlaceFilter[] zzhO(int paramInt)
  {
    return new PlaceFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */