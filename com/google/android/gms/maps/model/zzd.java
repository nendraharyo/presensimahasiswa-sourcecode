package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LatLngBounds paramLatLngBounds, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLatLngBounds.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    LatLng localLatLng = paramLatLngBounds.southwest;
    zzb.zza(paramParcel, 2, localLatLng, paramInt, false);
    localLatLng = paramLatLngBounds.northeast;
    zzb.zza(paramParcel, 3, localLatLng, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LatLngBounds zzfy(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject3 = localObject1;
        localObject1 = localObject2;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        k = m;
        localObject3 = localObject4;
        continue;
        localObject2 = LatLng.CREATOR;
        localObject3 = (LatLng)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        k = j;
        localObject4 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
        continue;
        localObject1 = LatLng.CREATOR;
        localObject3 = (LatLng)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/maps/model/LatLngBounds;
    ((LatLngBounds)localObject3).<init>(j, (LatLng)localObject2, (LatLng)localObject1);
    return (LatLngBounds)localObject3;
  }
  
  public LatLngBounds[] zzim(int paramInt)
  {
    return new LatLngBounds[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */