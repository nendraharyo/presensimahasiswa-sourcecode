package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class PlaceLikelihoodEntity
  implements SafeParcelable, PlaceLikelihood
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final PlaceImpl zzaQM;
  final float zzaQN;
  
  static
  {
    zzm localzzm = new com/google/android/gms/location/places/internal/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  PlaceLikelihoodEntity(int paramInt, PlaceImpl paramPlaceImpl, float paramFloat)
  {
    this.mVersionCode = paramInt;
    this.zzaQM = paramPlaceImpl;
    this.zzaQN = paramFloat;
  }
  
  public static PlaceLikelihoodEntity zza(PlaceImpl paramPlaceImpl, float paramFloat)
  {
    PlaceLikelihoodEntity localPlaceLikelihoodEntity = new com/google/android/gms/location/places/internal/PlaceLikelihoodEntity;
    PlaceImpl localPlaceImpl = (PlaceImpl)zzx.zzz(paramPlaceImpl);
    localPlaceLikelihoodEntity.<init>(0, localPlaceImpl, paramFloat);
    return localPlaceLikelihoodEntity;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof PlaceLikelihoodEntity;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceLikelihoodEntity)paramObject;
        PlaceImpl localPlaceImpl1 = this.zzaQM;
        PlaceImpl localPlaceImpl2 = ((PlaceLikelihoodEntity)paramObject).zzaQM;
        bool2 = localPlaceImpl1.equals(localPlaceImpl2);
        if (bool2)
        {
          float f1 = this.zzaQN;
          float f2 = ((PlaceLikelihoodEntity)paramObject).zzaQN;
          bool2 = f1 < f2;
          if (!bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public float getLikelihood()
  {
    return this.zzaQN;
  }
  
  public Place getPlace()
  {
    return this.zzaQM;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzaQM;
    arrayOfObject[0] = localObject;
    localObject = Float.valueOf(this.zzaQN);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzaQM;
    localzza = localzza.zzg("place", localObject);
    localObject = Float.valueOf(this.zzaQN);
    return localzza.zzg("likelihood", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public PlaceLikelihood zzzy()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\PlaceLikelihoodEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */