package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class LocationAvailabilityCreator
  implements Parcelable.Creator
{
  public static final int CONTENT_DESCRIPTION;
  
  static void zza(LocationAvailability paramLocationAvailability, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLocationAvailability.zzaNU;
    zzb.zzc(paramParcel, 1, j);
    j = paramLocationAvailability.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramLocationAvailability.zzaNV;
    zzb.zzc(paramParcel, 2, j);
    long l = paramLocationAvailability.zzaNW;
    zzb.zza(paramParcel, 3, l);
    j = paramLocationAvailability.zzaNX;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationAvailability createFromParcel(Parcel paramParcel)
  {
    int i = 1;
    int j = zza.zzau(paramParcel);
    int k = 0;
    StringBuilder localStringBuilder = null;
    int m = 1000;
    long l = 0L;
    int n = i;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        i = zza.zzg(paramParcel, i1);
        break;
      case 3: 
        l = zza.zzi(paramParcel, i1);
        break;
      case 4: 
        m = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + j;
      ((zza.zza)localObject).<init>(str, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/location/LocationAvailability;
    ((LocationAvailability)localObject).<init>(k, m, n, i, l);
    return (LocationAvailability)localObject;
  }
  
  public LocationAvailability[] newArray(int paramInt)
  {
    return new LocationAvailability[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationAvailabilityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */