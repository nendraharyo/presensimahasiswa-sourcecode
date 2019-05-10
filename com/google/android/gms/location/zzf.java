package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzf
  implements Parcelable.Creator
{
  static void zza(LocationSettingsRequest paramLocationSettingsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    List localList = paramLocationSettingsRequest.zzuZ();
    zzb.zzc(paramParcel, 1, localList, false);
    int j = paramLocationSettingsRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramLocationSettingsRequest.zzyK();
    zzb.zza(paramParcel, 2, bool);
    bool = paramLocationSettingsRequest.zzyL();
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationSettingsRequest zzeS(Parcel paramParcel)
  {
    boolean bool1 = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    boolean bool2 = false;
    Object localObject2 = null;
    int j = 0;
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
        localObject1 = LocationRequest.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    LocationSettingsRequest localLocationSettingsRequest = new com/google/android/gms/location/LocationSettingsRequest;
    localLocationSettingsRequest.<init>(j, (List)localObject1, bool2, bool1);
    return localLocationSettingsRequest;
  }
  
  public LocationSettingsRequest[] zzhv(int paramInt)
  {
    return new LocationSettingsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */