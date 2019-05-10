package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzg;
import java.util.List;

public final class Polygon
{
  private final zzg zzaTI;
  
  public Polygon(zzg paramzzg)
  {
    zzg localzzg = (zzg)zzx.zzz(paramzzg);
    this.zzaTI = localzzg;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Polygon;
    zzg localzzg;
    if (!bool)
    {
      bool = false;
      localzzg = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzzg = this.zzaTI;
        paramObject = (Polygon)paramObject;
        localObject = ((Polygon)paramObject).zzaTI;
        bool = localzzg.zzb((zzg)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public int getFillColor()
  {
    try
    {
      zzg localzzg = this.zzaTI;
      return localzzg.getFillColor();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public List getHoles()
  {
    try
    {
      zzg localzzg = this.zzaTI;
      return localzzg.getHoles();
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
      zzg localzzg = this.zzaTI;
      return localzzg.getId();
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
      zzg localzzg = this.zzaTI;
      return localzzg.getPoints();
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
      zzg localzzg = this.zzaTI;
      return localzzg.getStrokeColor();
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
      zzg localzzg = this.zzaTI;
      return localzzg.getStrokeWidth();
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
      zzg localzzg = this.zzaTI;
      return localzzg.getZIndex();
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
      zzg localzzg = this.zzaTI;
      return localzzg.hashCodeRemote();
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
      zzg localzzg = this.zzaTI;
      return localzzg.isClickable();
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
      zzg localzzg = this.zzaTI;
      return localzzg.isGeodesic();
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
      zzg localzzg = this.zzaTI;
      return localzzg.isVisible();
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
      zzg localzzg = this.zzaTI;
      localzzg.remove();
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
      zzg localzzg = this.zzaTI;
      localzzg.setClickable(paramBoolean);
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
      zzg localzzg = this.zzaTI;
      localzzg.setFillColor(paramInt);
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
      zzg localzzg = this.zzaTI;
      localzzg.setGeodesic(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setHoles(List paramList)
  {
    try
    {
      zzg localzzg = this.zzaTI;
      localzzg.setHoles(paramList);
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
      zzg localzzg = this.zzaTI;
      localzzg.setPoints(paramList);
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
      zzg localzzg = this.zzaTI;
      localzzg.setStrokeColor(paramInt);
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
      zzg localzzg = this.zzaTI;
      localzzg.setStrokeWidth(paramFloat);
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
      zzg localzzg = this.zzaTI;
      localzzg.setVisible(paramBoolean);
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
      zzg localzzg = this.zzaTI;
      localzzg.setZIndex(paramFloat);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\Polygon.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */