package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzu
  implements Parcelable.Creator
{
  static void zza(AutocompletePredictionEntity.SubstringEntity paramSubstringEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSubstringEntity.mOffset;
    zzb.zzc(paramParcel, 1, j);
    j = paramSubstringEntity.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    j = paramSubstringEntity.mLength;
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public AutocompletePredictionEntity.SubstringEntity zzfp(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    int m = 0;
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
        k = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    AutocompletePredictionEntity.SubstringEntity localSubstringEntity = new com/google/android/gms/location/places/internal/AutocompletePredictionEntity$SubstringEntity;
    localSubstringEntity.<init>(m, k, i);
    return localSubstringEntity;
  }
  
  public AutocompletePredictionEntity.SubstringEntity[] zzic(int paramInt)
  {
    return new AutocompletePredictionEntity.SubstringEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */