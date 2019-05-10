package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import java.util.List;

public abstract interface zzg
  extends IInterface
{
  public abstract int getFillColor();
  
  public abstract List getHoles();
  
  public abstract String getId();
  
  public abstract List getPoints();
  
  public abstract int getStrokeColor();
  
  public abstract float getStrokeWidth();
  
  public abstract float getZIndex();
  
  public abstract int hashCodeRemote();
  
  public abstract boolean isClickable();
  
  public abstract boolean isGeodesic();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setClickable(boolean paramBoolean);
  
  public abstract void setFillColor(int paramInt);
  
  public abstract void setGeodesic(boolean paramBoolean);
  
  public abstract void setHoles(List paramList);
  
  public abstract void setPoints(List paramList);
  
  public abstract void setStrokeColor(int paramInt);
  
  public abstract void setStrokeWidth(float paramFloat);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setZIndex(float paramFloat);
  
  public abstract boolean zzb(zzg paramzzg);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */