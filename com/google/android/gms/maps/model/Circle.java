package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzb;

public final class Circle
{
  private final zzb zzaTb;
  
  public Circle(zzb paramzzb)
  {
    zzb localzzb = (zzb)zzx.zzz(paramzzb);
    this.zzaTb = localzzb;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Circle;
    zzb localzzb;
    if (!bool)
    {
      bool = false;
      localzzb = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzzb = this.zzaTb;
        paramObject = (Circle)paramObject;
        localObject = ((Circle)paramObject).zzaTb;
        bool = localzzb.zza((zzb)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public LatLng getCenter()
  {
    try
    {
      zzb localzzb = this.zzaTb;
      return localzzb.getCenter();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public int getFillColor()
  {
    try
    {
      zzb localzzb = this.zzaTb;
      return localzzb.getFillColor();
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
      zzb localzzb = this.zzaTb;
      return localzzb.getId();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public double getRadius()
  {
    try
    {
      zzb localzzb = this.zzaTb;
      return localzzb.getRadius();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public int getStrokeColor()
  {
    try
    {
      zzb localzzb = this.zzaTb;
      return localzzb.getStrokeColor();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getStrokeWidth()
  {
    try
    {
      zzb localzzb = this.zzaTb;
      return localzzb.getStrokeWidth();
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
      zzb localzzb = this.zzaTb;
      return localzzb.getZIndex();
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
      zzb localzzb = this.zzaTb;
      return localzzb.hashCodeRemote();
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
      zzb localzzb = this.zzaTb;
      return localzzb.isVisible();
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
      zzb localzzb = this.zzaTb;
      localzzb.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setCenter(LatLng paramLatLng)
  {
    try
    {
      zzb localzzb = this.zzaTb;
      localzzb.setCenter(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setFillColor(int paramInt)
  {
    try
    {
      zzb localzzb = this.zzaTb;
      localzzb.setFillColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setRadius(double paramDouble)
  {
    try
    {
      zzb localzzb = this.zzaTb;
      localzzb.setRadius(paramDouble);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setStrokeColor(int paramInt)
  {
    try
    {
      zzb localzzb = this.zzaTb;
      localzzb.setStrokeColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    try
    {
      zzb localzzb = this.zzaTb;
      localzzb.setStrokeWidth(paramFloat);
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
      zzb localzzb = this.zzaTb;
      localzzb.setVisible(paramBoolean);
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
      zzb localzzb = this.zzaTb;
      localzzb.setZIndex(paramFloat);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\Circle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */