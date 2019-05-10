package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(PlaceRequest paramPlaceRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPlaceRequest.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    PlaceFilter localPlaceFilter = paramPlaceRequest.zzyZ();
    zzb.zza(paramParcel, 2, localPlaceFilter, paramInt, false);
    long l = paramPlaceRequest.getInterval();
    zzb.zza(paramParcel, 3, l);
    j = paramPlaceRequest.getPriority();
    zzb.zzc(paramParcel, 4, j);
    l = paramPlaceRequest.getExpirationTime();
    zzb.zza(paramParcel, 5, l);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceRequest zzfi(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    long l1 = PlaceRequest.zzaPJ;
    int k = 102;
    long l2 = Long.MAX_VALUE;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject2 = PlaceFilter.CREATOR;
        localObject3 = (PlaceFilter)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        k = zza.zzg(paramParcel, m);
        break;
      case 5: 
        l2 = zza.zzi(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/location/places/PlaceRequest;
    ((PlaceRequest)localObject3).<init>(j, (PlaceFilter)localObject2, l1, k, l2);
    return (PlaceRequest)localObject3;
  }
  
  public PlaceRequest[] zzhT(int paramInt)
  {
    return new PlaceRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */