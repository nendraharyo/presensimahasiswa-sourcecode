package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection
{
  private final IProjectionDelegate zzaSq;
  
  Projection(IProjectionDelegate paramIProjectionDelegate)
  {
    this.zzaSq = paramIProjectionDelegate;
  }
  
  public LatLng fromScreenLocation(Point paramPoint)
  {
    try
    {
      IProjectionDelegate localIProjectionDelegate = this.zzaSq;
      localObject = zze.zzC(paramPoint);
      return localIProjectionDelegate.fromScreenLocation((zzd)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public VisibleRegion getVisibleRegion()
  {
    try
    {
      IProjectionDelegate localIProjectionDelegate = this.zzaSq;
      return localIProjectionDelegate.getVisibleRegion();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public Point toScreenLocation(LatLng paramLatLng)
  {
    try
    {
      Object localObject = this.zzaSq;
      localObject = ((IProjectionDelegate)localObject).toScreenLocation(paramLatLng);
      localObject = zze.zzp((zzd)localObject);
      return (Point)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\Projection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */