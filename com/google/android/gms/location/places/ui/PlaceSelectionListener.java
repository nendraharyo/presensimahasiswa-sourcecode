package com.google.android.gms.location.places.ui;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;

public abstract interface PlaceSelectionListener
{
  public abstract void onError(Status paramStatus);
  
  public abstract void onPlaceSelected(Place paramPlace);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\PlaceSelectionListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */