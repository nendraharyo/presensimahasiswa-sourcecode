package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory
{
  private static ICameraUpdateFactoryDelegate zzaRq;
  
  public static CameraUpdate newCameraPosition(CameraPosition paramCameraPosition)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).newCameraPosition(paramCameraPosition);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate newLatLng(LatLng paramLatLng)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).newLatLng(paramLatLng);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).newLatLngBounds(paramLatLngBounds, paramInt);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).newLatLngBoundsWithSize(paramLatLngBounds, paramInt1, paramInt2, paramInt3);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate newLatLngZoom(LatLng paramLatLng, float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).newLatLngZoom(paramLatLng, paramFloat);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate scrollBy(float paramFloat1, float paramFloat2)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).scrollBy(paramFloat1, paramFloat2);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate zoomBy(float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).zoomBy(paramFloat);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate zoomBy(float paramFloat, Point paramPoint)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      int i = paramPoint.x;
      int j = paramPoint.y;
      localObject = ((ICameraUpdateFactoryDelegate)localObject).zoomByWithFocus(paramFloat, i, j);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate zoomIn()
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).zoomIn();
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate zoomOut()
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).zoomOut();
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static CameraUpdate zoomTo(float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new com/google/android/gms/maps/CameraUpdate;
      localObject = zzzI();
      localObject = ((ICameraUpdateFactoryDelegate)localObject).zoomTo(paramFloat);
      localCameraUpdate.<init>((zzd)localObject);
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static void zza(ICameraUpdateFactoryDelegate paramICameraUpdateFactoryDelegate)
  {
    zzaRq = (ICameraUpdateFactoryDelegate)zzx.zzz(paramICameraUpdateFactoryDelegate);
  }
  
  private static ICameraUpdateFactoryDelegate zzzI()
  {
    return (ICameraUpdateFactoryDelegate)zzx.zzb(zzaRq, "CameraUpdateFactory is not initialized");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\CameraUpdateFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */