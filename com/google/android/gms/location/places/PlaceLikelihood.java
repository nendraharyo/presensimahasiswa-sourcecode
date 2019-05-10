package com.google.android.gms.location.places;

import com.google.android.gms.common.data.Freezable;

public abstract interface PlaceLikelihood
  extends Freezable
{
  public abstract float getLikelihood();
  
  public abstract Place getPlace();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceLikelihood.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */