package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(AutocompleteFilter paramAutocompleteFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    boolean bool = paramAutocompleteFilter.zzaPg;
    zzb.zza(paramParcel, 1, bool);
    int j = paramAutocompleteFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    List localList = paramAutocompleteFilter.zzaPh;
    zzb.zza(paramParcel, 2, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AutocompleteFilter zzfb(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
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
        bool = zza.zzc(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = zza.zzC(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    AutocompleteFilter localAutocompleteFilter = new com/google/android/gms/location/places/AutocompleteFilter;
    localAutocompleteFilter.<init>(j, bool, (List)localObject2);
    return localAutocompleteFilter;
  }
  
  public AutocompleteFilter[] zzhL(int paramInt)
  {
    return new AutocompleteFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */