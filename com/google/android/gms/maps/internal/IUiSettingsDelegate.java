package com.google.android.gms.maps.internal;

import android.os.IInterface;

public abstract interface IUiSettingsDelegate
  extends IInterface
{
  public abstract boolean isCompassEnabled();
  
  public abstract boolean isIndoorLevelPickerEnabled();
  
  public abstract boolean isMapToolbarEnabled();
  
  public abstract boolean isMyLocationButtonEnabled();
  
  public abstract boolean isRotateGesturesEnabled();
  
  public abstract boolean isScrollGesturesEnabled();
  
  public abstract boolean isTiltGesturesEnabled();
  
  public abstract boolean isZoomControlsEnabled();
  
  public abstract boolean isZoomGesturesEnabled();
  
  public abstract void setAllGesturesEnabled(boolean paramBoolean);
  
  public abstract void setCompassEnabled(boolean paramBoolean);
  
  public abstract void setIndoorLevelPickerEnabled(boolean paramBoolean);
  
  public abstract void setMapToolbarEnabled(boolean paramBoolean);
  
  public abstract void setMyLocationButtonEnabled(boolean paramBoolean);
  
  public abstract void setRotateGesturesEnabled(boolean paramBoolean);
  
  public abstract void setScrollGesturesEnabled(boolean paramBoolean);
  
  public abstract void setTiltGesturesEnabled(boolean paramBoolean);
  
  public abstract void setZoomControlsEnabled(boolean paramBoolean);
  
  public abstract void setZoomGesturesEnabled(boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IUiSettingsDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */