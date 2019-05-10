package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(LocationSettingsStates paramLocationSettingsStates, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    boolean bool1 = paramLocationSettingsStates.isGpsUsable();
    zzb.zza(paramParcel, 1, bool1);
    int j = paramLocationSettingsStates.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool2 = paramLocationSettingsStates.isNetworkLocationUsable();
    zzb.zza(paramParcel, 2, bool2);
    bool2 = paramLocationSettingsStates.isBleUsable();
    zzb.zza(paramParcel, 3, bool2);
    bool2 = paramLocationSettingsStates.isGpsPresent();
    zzb.zza(paramParcel, 4, bool2);
    bool2 = paramLocationSettingsStates.isNetworkLocationPresent();
    zzb.zza(paramParcel, 5, bool2);
    bool2 = paramLocationSettingsStates.isBlePresent();
    zzb.zza(paramParcel, 6, bool2);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationSettingsStates zzeU(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    StringBuilder localStringBuilder = null;
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
        bool6 = zza.zzc(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool5 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool4 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/location/LocationSettingsStates;
    ((LocationSettingsStates)localObject).<init>(j, bool6, bool5, bool4, bool3, bool2, bool1);
    return (LocationSettingsStates)localObject;
  }
  
  public LocationSettingsStates[] zzhx(int paramInt)
  {
    return new LocationSettingsStates[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */