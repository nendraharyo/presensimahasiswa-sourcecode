package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface zzc
  extends IInterface
{
  public abstract float getBearing();
  
  public abstract LatLngBounds getBounds();
  
  public abstract float getHeight();
  
  public abstract String getId();
  
  public abstract LatLng getPosition();
  
  public abstract float getTransparency();
  
  public abstract float getWidth();
  
  public abstract float getZIndex();
  
  public abstract int hashCodeRemote();
  
  public abstract boolean isClickable();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setBearing(float paramFloat);
  
  public abstract void setClickable(boolean paramBoolean);
  
  public abstract void setDimensions(float paramFloat);
  
  public abstract void setPosition(LatLng paramLatLng);
  
  public abstract void setPositionFromBounds(LatLngBounds paramLatLngBounds);
  
  public abstract void setTransparency(float paramFloat);
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setZIndex(float paramFloat);
  
  public abstract void zza(float paramFloat1, float paramFloat2);
  
  public abstract boolean zzb(zzc paramzzc);
  
  public abstract void zzv(zzd paramzzd);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */