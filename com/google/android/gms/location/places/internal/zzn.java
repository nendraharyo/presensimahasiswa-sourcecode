package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class zzn
  extends zzt
  implements PlaceLikelihood
{
  private final Context mContext;
  
  public zzn(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder, paramInt);
    this.mContext = paramContext;
  }
  
  public float getLikelihood()
  {
    return zzb("place_likelihood", -1.0F);
  }
  
  public Place getPlace()
  {
    zzr localzzr = new com/google/android/gms/location/places/internal/zzr;
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    Context localContext = this.mContext;
    localzzr.<init>(localDataHolder, i, localContext);
    return localzzr;
  }
  
  public PlaceLikelihood zzzy()
  {
    PlaceImpl localPlaceImpl = (PlaceImpl)getPlace().freeze();
    float f = getLikelihood();
    return PlaceLikelihoodEntity.zza(localPlaceImpl, f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */