package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp
  implements Parcelable.Creator
{
  static void zza(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramVisibleRegion.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramVisibleRegion.nearLeft;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramVisibleRegion.nearRight;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramVisibleRegion.farLeft;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramVisibleRegion.farRight;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramVisibleRegion.latLngBounds;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public VisibleRegion zzfK(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject6 = LatLng.CREATOR;
        localObject7 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject6);
        localObject6 = localObject7;
        break;
      case 3: 
        localObject5 = LatLng.CREATOR;
        localObject7 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject7;
        break;
      case 4: 
        localObject4 = LatLng.CREATOR;
        localObject7 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject7;
        break;
      case 5: 
        localObject3 = LatLng.CREATOR;
        localObject7 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject7;
        break;
      case 6: 
        localObject1 = LatLngBounds.CREATOR;
        localObject7 = (LatLngBounds)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject7;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject7 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject7).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject7);
    }
    Object localObject7 = new com/google/android/gms/maps/model/VisibleRegion;
    ((VisibleRegion)localObject7).<init>(j, (LatLng)localObject6, (LatLng)localObject5, (LatLng)localObject4, (LatLng)localObject3, (LatLngBounds)localObject1);
    return (VisibleRegion)localObject7;
  }
  
  public VisibleRegion[] zziy(int paramInt)
  {
    return new VisibleRegion[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */