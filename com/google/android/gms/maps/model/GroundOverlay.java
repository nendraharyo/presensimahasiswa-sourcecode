package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzc;

public final class GroundOverlay
{
  private final zzc zzaTj;
  
  public GroundOverlay(zzc paramzzc)
  {
    zzc localzzc = (zzc)zzx.zzz(paramzzc);
    this.zzaTj = localzzc;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof GroundOverlay;
    zzc localzzc;
    if (!bool)
    {
      bool = false;
      localzzc = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzzc = this.zzaTj;
        paramObject = (GroundOverlay)paramObject;
        localObject = ((GroundOverlay)paramObject).zzaTj;
        bool = localzzc.zzb((zzc)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public float getBearing()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getBearing();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public LatLngBounds getBounds()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getBounds();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getHeight()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getHeight();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public String getId()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getId();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public LatLng getPosition()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getPosition();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getTransparency()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getTransparency();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getWidth()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getWidth();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getZIndex()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.getZIndex();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public int hashCode()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.hashCodeRemote();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isClickable()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.isClickable();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isVisible()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      return localzzc.isVisible();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void remove()
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setBearing(float paramFloat)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setBearing(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setClickable(boolean paramBoolean)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setClickable(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setDimensions(float paramFloat)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setDimensions(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setDimensions(float paramFloat1, float paramFloat2)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.zza(paramFloat1, paramFloat2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setImage(BitmapDescriptor paramBitmapDescriptor)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localObject = paramBitmapDescriptor.zzzH();
      localzzc.zzv((zzd)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void setPosition(LatLng paramLatLng)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setPositionFromBounds(LatLngBounds paramLatLngBounds)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setPositionFromBounds(paramLatLngBounds);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setTransparency(float paramFloat)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setTransparency(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setVisible(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    try
    {
      zzc localzzc = this.zzaTj;
      localzzc.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\GroundOverlay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */