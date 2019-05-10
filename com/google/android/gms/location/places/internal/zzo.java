package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzo
  implements Parcelable.Creator
{
  static void zza(PlaceLocalization paramPlaceLocalization, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPlaceLocalization.name;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramPlaceLocalization.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramPlaceLocalization.address;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramPlaceLocalization.zzaQO;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramPlaceLocalization.zzaQP;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramPlaceLocalization.zzaQQ;
    zzb.zzb(paramParcel, 5, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceLocalization zzfn(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    Object localObject1 = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localArrayList = zza.zzD(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/location/places/internal/PlaceLocalization;
    ((PlaceLocalization)localObject2).<init>(j, (String)localObject1, str3, str2, str1, localArrayList);
    return (PlaceLocalization)localObject2;
  }
  
  public PlaceLocalization[] zzia(int paramInt)
  {
    return new PlaceLocalization[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */