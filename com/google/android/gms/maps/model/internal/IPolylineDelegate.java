package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import java.util.List;

public abstract interface IPolylineDelegate
  extends IInterface
{
  public abstract boolean equalsRemote(IPolylineDelegate paramIPolylineDelegate);
  
  public abstract int getColor();
  
  public abstract String getId();
  
  public abstract List getPoints();
  
  public abstract float getWidth();
  
  public abstract float getZIndex();
  
  public abstract int hashCodeRemote();
  
  public abstract boolean isClickable();
  
  public abstract boolean isGeodesic();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setClickable(boolean paramBoolean);
  
  public abstract void setColor(int paramInt);
  
  public abstract void setGeodesic(boolean paramBoolean);
  
  public abstract void setPoints(List paramList);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setWidth(float paramFloat);
  
  public abstract void setZIndex(float paramFloat);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\IPolylineDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */