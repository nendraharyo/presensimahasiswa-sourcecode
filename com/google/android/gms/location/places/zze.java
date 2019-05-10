package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(NearbyAlertRequest paramNearbyAlertRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNearbyAlertRequest.zzyV();
    zzb.zzc(paramParcel, 1, j);
    j = paramNearbyAlertRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramNearbyAlertRequest.zzyY();
    zzb.zzc(paramParcel, 2, j);
    Object localObject = paramNearbyAlertRequest.zzyZ();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramNearbyAlertRequest.zzza();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    boolean bool = paramNearbyAlertRequest.zzzb();
    zzb.zza(paramParcel, 5, bool);
    int k = paramNearbyAlertRequest.zzzc();
    zzb.zzc(paramParcel, 6, k);
    k = paramNearbyAlertRequest.getPriority();
    zzb.zzc(paramParcel, 7, k);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyAlertRequest zzfd(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = -1;
    int m = 0;
    boolean bool = false;
    Object localObject2 = null;
    int n = 0;
    int i1 = 0;
    Object localObject3 = null;
    for (;;)
    {
      i2 = paramParcel.dataPosition();
      if (i2 >= j) {
        break;
      }
      i2 = zza.zzat(paramParcel);
      int i3 = zza.zzca(i2);
      switch (i3)
      {
      default: 
        zza.zzb(paramParcel, i2);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i2);
        break;
      case 1000: 
        i1 = zza.zzg(paramParcel, i2);
        break;
      case 2: 
        k = zza.zzg(paramParcel, i2);
        break;
      case 3: 
        localObject2 = PlaceFilter.CREATOR;
        localObject4 = (PlaceFilter)zza.zza(paramParcel, i2, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 4: 
        localObject1 = NearbyAlertFilter.CREATOR;
        localObject4 = (NearbyAlertFilter)zza.zza(paramParcel, i2, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 5: 
        bool = zza.zzc(paramParcel, i2);
        break;
      case 6: 
        m = zza.zzg(paramParcel, i2);
        break;
      case 7: 
        i = zza.zzg(paramParcel, i2);
      }
    }
    int i2 = paramParcel.dataPosition();
    if (i2 != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/location/places/NearbyAlertRequest;
    ((NearbyAlertRequest)localObject4).<init>(i1, n, k, (PlaceFilter)localObject2, (NearbyAlertFilter)localObject1, bool, m, i);
    return (NearbyAlertRequest)localObject4;
  }
  
  public NearbyAlertRequest[] zzhN(int paramInt)
  {
    return new NearbyAlertRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */