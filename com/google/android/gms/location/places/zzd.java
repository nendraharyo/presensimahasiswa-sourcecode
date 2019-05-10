package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzd
  implements Parcelable.Creator
{
  static void zza(NearbyAlertFilter paramNearbyAlertFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramNearbyAlertFilter.zzaPj;
    zzb.zzb(paramParcel, 1, (List)localObject, false);
    int j = paramNearbyAlertFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramNearbyAlertFilter.zzaPk;
    zzb.zza(paramParcel, 2, (List)localObject, false);
    localObject = paramNearbyAlertFilter.zzaPl;
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramNearbyAlertFilter.zzaPm;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    boolean bool = paramNearbyAlertFilter.zzaPn;
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyAlertFilter zzfc(Parcel paramParcel)
  {
    boolean bool = false;
    String str = null;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
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
        localObject2 = zza.zzD(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localArrayList = zza.zzC(paramParcel, k);
        break;
      case 3: 
        localObject1 = UserDataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/location/places/NearbyAlertFilter;
    ((NearbyAlertFilter)localObject3).<init>(j, (List)localObject2, localArrayList, (List)localObject1, str, bool);
    return (NearbyAlertFilter)localObject3;
  }
  
  public NearbyAlertFilter[] zzhM(int paramInt)
  {
    return new NearbyAlertFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */