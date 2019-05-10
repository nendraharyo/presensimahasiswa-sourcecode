package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import java.util.List;

public final class Polyline
{
  private final IPolylineDelegate zzaTM;
  
  public Polyline(IPolylineDelegate paramIPolylineDelegate)
  {
    IPolylineDelegate localIPolylineDelegate = (IPolylineDelegate)zzx.zzz(paramIPolylineDelegate);
    this.zzaTM = localIPolylineDelegate;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Polyline;
    IPolylineDelegate localIPolylineDelegate;
    if (!bool)
    {
      bool = false;
      localIPolylineDelegate = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localIPolylineDelegate = this.zzaTM;
        paramObject = (Polyline)paramObject;
        localObject = ((Polyline)paramObject).zzaTM;
        bool = localIPolylineDelegate.equalsRemote((IPolylineDelegate)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public int getColor()
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.getColor();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.getId();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public List getPoints()
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.getPoints();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.getWidth();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.getZIndex();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.hashCodeRemote();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.isClickable();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isGeodesic()
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.isGeodesic();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      return localIPolylineDelegate.isVisible();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.remove();
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setClickable(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setColor(int paramInt)
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setGeodesic(boolean paramBoolean)
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setGeodesic(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setPoints(List paramList)
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setPoints(paramList);
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setVisible(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setWidth(float paramFloat)
  {
    try
    {
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setWidth(paramFloat);
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
      IPolylineDelegate localIPolylineDelegate = this.zzaTM;
      localIPolylineDelegate.setZIndex(paramFloat);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\Polyline.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */