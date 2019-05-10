package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzw;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.internal.zzz;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
  private final IStreetViewPanoramaDelegate zzaSr;
  
  protected StreetViewPanorama(IStreetViewPanoramaDelegate paramIStreetViewPanoramaDelegate)
  {
    IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = (IStreetViewPanoramaDelegate)com.google.android.gms.common.internal.zzx.zzz(paramIStreetViewPanoramaDelegate);
    this.zzaSr = localIStreetViewPanoramaDelegate;
  }
  
  public void animateTo(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.animateTo(paramStreetViewPanoramaCamera, paramLong);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public StreetViewPanoramaLocation getLocation()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.getStreetViewPanoramaLocation();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public StreetViewPanoramaCamera getPanoramaCamera()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.getPanoramaCamera();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isPanningGesturesEnabled()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.isPanningGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isStreetNamesEnabled()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.isStreetNamesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isUserNavigationEnabled()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.isUserNavigationEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isZoomGesturesEnabled()
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      return localIStreetViewPanoramaDelegate.isZoomGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  /* Error */
  public Point orientationToPoint(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/google/android/gms/maps/StreetViewPanorama:zzaSr	Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokeinterface 56 2 0
    //   12: astore_2
    //   13: aload_2
    //   14: ifnonnull +7 -> 21
    //   17: aconst_null
    //   18: astore_2
    //   19: aload_2
    //   20: areturn
    //   21: aload_2
    //   22: invokestatic 62	com/google/android/gms/dynamic/zze:zzp	(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;
    //   25: astore_2
    //   26: aload_2
    //   27: checkcast 64	android/graphics/Point
    //   30: astore_2
    //   31: goto -12 -> 19
    //   34: astore_2
    //   35: new 26	com/google/android/gms/maps/model/RuntimeRemoteException
    //   38: astore_3
    //   39: aload_3
    //   40: aload_2
    //   41: invokespecial 29	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   44: aload_3
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	StreetViewPanorama
    //   0	46	1	paramStreetViewPanoramaOrientation	StreetViewPanoramaOrientation
    //   4	27	2	localObject	Object
    //   34	7	2	localRemoteException	RemoteException
    //   38	7	3	localRuntimeRemoteException	RuntimeRemoteException
    // Exception table:
    //   from	to	target	type
    //   0	4	34	android/os/RemoteException
    //   6	12	34	android/os/RemoteException
    //   21	25	34	android/os/RemoteException
    //   26	30	34	android/os/RemoteException
  }
  
  public StreetViewPanoramaOrientation pointToOrientation(Point paramPoint)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localObject = zze.zzC(paramPoint);
      return localIStreetViewPanoramaDelegate.pointToOrientation((zzd)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public final void setOnStreetViewPanoramaCameraChangeListener(StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener paramOnStreetViewPanoramaCameraChangeListener)
  {
    if (paramOnStreetViewPanoramaCameraChangeListener == null) {}
    for (;;)
    {
      try
      {
        localIStreetViewPanoramaDelegate = this.zzaSr;
        localObject = null;
        localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIStreetViewPanoramaDelegate = this.zzaSr;
      localObject = new com/google/android/gms/maps/StreetViewPanorama$2;
      ((StreetViewPanorama.2)localObject).<init>(this, paramOnStreetViewPanoramaCameraChangeListener);
      localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener((zzw)localObject);
    }
  }
  
  public final void setOnStreetViewPanoramaChangeListener(StreetViewPanorama.OnStreetViewPanoramaChangeListener paramOnStreetViewPanoramaChangeListener)
  {
    if (paramOnStreetViewPanoramaChangeListener == null) {}
    for (;;)
    {
      try
      {
        localIStreetViewPanoramaDelegate = this.zzaSr;
        localObject = null;
        localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIStreetViewPanoramaDelegate = this.zzaSr;
      localObject = new com/google/android/gms/maps/StreetViewPanorama$1;
      ((StreetViewPanorama.1)localObject).<init>(this, paramOnStreetViewPanoramaChangeListener);
      localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener((com.google.android.gms.maps.internal.zzx)localObject);
    }
  }
  
  public final void setOnStreetViewPanoramaClickListener(StreetViewPanorama.OnStreetViewPanoramaClickListener paramOnStreetViewPanoramaClickListener)
  {
    if (paramOnStreetViewPanoramaClickListener == null) {}
    for (;;)
    {
      try
      {
        localIStreetViewPanoramaDelegate = this.zzaSr;
        localObject = null;
        localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIStreetViewPanoramaDelegate = this.zzaSr;
      localObject = new com/google/android/gms/maps/StreetViewPanorama$3;
      ((StreetViewPanorama.3)localObject).<init>(this, paramOnStreetViewPanoramaClickListener);
      localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener((zzy)localObject);
    }
  }
  
  public final void setOnStreetViewPanoramaLongClickListener(StreetViewPanorama.OnStreetViewPanoramaLongClickListener paramOnStreetViewPanoramaLongClickListener)
  {
    if (paramOnStreetViewPanoramaLongClickListener == null) {}
    for (;;)
    {
      try
      {
        localIStreetViewPanoramaDelegate = this.zzaSr;
        localObject = null;
        localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIStreetViewPanoramaDelegate = this.zzaSr;
      localObject = new com/google/android/gms/maps/StreetViewPanorama$4;
      ((StreetViewPanorama.4)localObject).<init>(this, paramOnStreetViewPanoramaLongClickListener);
      localIStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener((zzz)localObject);
    }
  }
  
  public void setPanningGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.enablePanning(paramBoolean);
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
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setPosition(LatLng paramLatLng, int paramInt)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.setPositionWithRadius(paramLatLng, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setPosition(String paramString)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.setPositionWithID(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setStreetNamesEnabled(boolean paramBoolean)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.enableStreetNames(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setUserNavigationEnabled(boolean paramBoolean)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.enableUserNavigation(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = this.zzaSr;
      localIStreetViewPanoramaDelegate.enableZoom(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  IStreetViewPanoramaDelegate zzzY()
  {
    return this.zzaSr;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanorama.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */