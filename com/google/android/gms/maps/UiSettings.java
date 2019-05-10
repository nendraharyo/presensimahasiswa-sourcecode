package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{
  private final IUiSettingsDelegate zzaST;
  
  UiSettings(IUiSettingsDelegate paramIUiSettingsDelegate)
  {
    this.zzaST = paramIUiSettingsDelegate;
  }
  
  public boolean isCompassEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isCompassEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isIndoorLevelPickerEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isIndoorLevelPickerEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isMapToolbarEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isMapToolbarEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isMyLocationButtonEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isMyLocationButtonEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isRotateGesturesEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isRotateGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isScrollGesturesEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isScrollGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isTiltGesturesEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isTiltGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isZoomControlsEnabled()
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isZoomControlsEnabled();
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
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      return localIUiSettingsDelegate.isZoomGesturesEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setAllGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setAllGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setCompassEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setCompassEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setIndoorLevelPickerEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setIndoorLevelPickerEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setMapToolbarEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setMapToolbarEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setMyLocationButtonEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setMyLocationButtonEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setRotateGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setRotateGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setScrollGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setScrollGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setTiltGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setTiltGesturesEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void setZoomControlsEnabled(boolean paramBoolean)
  {
    try
    {
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setZoomControlsEnabled(paramBoolean);
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
      IUiSettingsDelegate localIUiSettingsDelegate = this.zzaST;
      localIUiSettingsDelegate.setZoomGesturesEnabled(paramBoolean);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\UiSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */