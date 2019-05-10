package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzf;

public final class Marker
{
  private final zzf zzaTy;
  
  public Marker(zzf paramzzf)
  {
    zzf localzzf = (zzf)zzx.zzz(paramzzf);
    this.zzaTy = localzzf;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Marker;
    zzf localzzf;
    if (!bool)
    {
      bool = false;
      localzzf = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzzf = this.zzaTy;
        paramObject = (Marker)paramObject;
        localObject = ((Marker)paramObject).zzaTy;
        bool = localzzf.zzj((zzf)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public float getAlpha()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.getAlpha();
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
      zzf localzzf = this.zzaTy;
      return localzzf.getId();
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
      zzf localzzf = this.zzaTy;
      return localzzf.getPosition();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public float getRotation()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.getRotation();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public String getSnippet()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.getSnippet();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public String getTitle()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.getTitle();
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
      zzf localzzf = this.zzaTy;
      return localzzf.hashCodeRemote();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void hideInfoWindow()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.hideInfoWindow();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isDraggable()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.isDraggable();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isFlat()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.isFlat();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isInfoWindowShown()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      return localzzf.isInfoWindowShown();
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
      zzf localzzf = this.zzaTy;
      return localzzf.isVisible();
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
      zzf localzzf = this.zzaTy;
      localzzf.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setAlpha(float paramFloat)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setAlpha(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setAnchor(float paramFloat1, float paramFloat2)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setAnchor(paramFloat1, paramFloat2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setDraggable(boolean paramBoolean)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setDraggable(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setFlat(boolean paramBoolean)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setFlat(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setIcon(BitmapDescriptor paramBitmapDescriptor)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localObject = paramBitmapDescriptor.zzzH();
      localzzf.zzw((zzd)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void setInfoWindowAnchor(float paramFloat1, float paramFloat2)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setInfoWindowAnchor(paramFloat1, paramFloat2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setPosition(LatLng paramLatLng)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setRotation(float paramFloat)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setRotation(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setSnippet(String paramString)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setSnippet(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setTitle(String paramString)
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.setTitle(paramString);
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
      zzf localzzf = this.zzaTy;
      localzzf.setVisible(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void showInfoWindow()
  {
    try
    {
      zzf localzzf = this.zzaTy;
      localzzf.showInfoWindow();
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\Marker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */