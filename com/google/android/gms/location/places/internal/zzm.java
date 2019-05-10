package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm
  implements Parcelable.Creator
{
  static void zza(PlaceLikelihoodEntity paramPlaceLikelihoodEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    PlaceImpl localPlaceImpl = paramPlaceLikelihoodEntity.zzaQM;
    zzb.zza(paramParcel, 1, localPlaceImpl, paramInt, false);
    int j = paramPlaceLikelihoodEntity.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    float f = paramPlaceLikelihoodEntity.zzaQN;
    zzb.zza(paramParcel, 2, f);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceLikelihoodEntity zzfm(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject1 = null;
    float f1 = 0.0F;
    Object localObject2 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      float f2;
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        f2 = f1;
        localObject2 = localObject1;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject1 = localObject2;
        f1 = f2;
        break;
        localObject1 = PlaceImpl.CREATOR;
        localObject3 = (PlaceImpl)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        k = j;
        f2 = f1;
        localObject2 = localObject3;
        continue;
        m = zza.zzg(paramParcel, m);
        localObject2 = localObject1;
        k = m;
        f2 = f1;
        continue;
        f2 = zza.zzl(paramParcel, m);
        localObject2 = localObject1;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/location/places/internal/PlaceLikelihoodEntity;
    ((PlaceLikelihoodEntity)localObject3).<init>(j, (PlaceImpl)localObject1, f1);
    return (PlaceLikelihoodEntity)localObject3;
  }
  
  public PlaceLikelihoodEntity[] zzhZ(int paramInt)
  {
    return new PlaceLikelihoodEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */