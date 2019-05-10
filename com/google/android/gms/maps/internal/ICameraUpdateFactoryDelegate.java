package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface ICameraUpdateFactoryDelegate
  extends IInterface
{
  public abstract zzd newCameraPosition(CameraPosition paramCameraPosition);
  
  public abstract zzd newLatLng(LatLng paramLatLng);
  
  public abstract zzd newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt);
  
  public abstract zzd newLatLngBoundsWithSize(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzd newLatLngZoom(LatLng paramLatLng, float paramFloat);
  
  public abstract zzd scrollBy(float paramFloat1, float paramFloat2);
  
  public abstract zzd zoomBy(float paramFloat);
  
  public abstract zzd zoomByWithFocus(float paramFloat, int paramInt1, int paramInt2);
  
  public abstract zzd zoomIn();
  
  public abstract zzd zoomOut();
  
  public abstract zzd zoomTo(float paramFloat);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\ICameraUpdateFactoryDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */