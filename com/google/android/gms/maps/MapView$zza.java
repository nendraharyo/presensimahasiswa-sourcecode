package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzo;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class MapView$zza
  implements MapLifecycleDelegate
{
  private final ViewGroup zzaSk;
  private final IMapViewDelegate zzaSl;
  private View zzaSm;
  
  public MapView$zza(ViewGroup paramViewGroup, IMapViewDelegate paramIMapViewDelegate)
  {
    Object localObject = (IMapViewDelegate)zzx.zzz(paramIMapViewDelegate);
    this.zzaSl = ((IMapViewDelegate)localObject);
    localObject = (ViewGroup)zzx.zzz(paramViewGroup);
    this.zzaSk = ((ViewGroup)localObject);
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localObject = new com/google/android/gms/maps/MapView$zza$1;
      ((MapView.zza.1)localObject).<init>(this, paramOnMapReadyCallback);
      localIMapViewDelegate.getMapAsync((zzo)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      Object localObject1 = this.zzaSl;
      ((IMapViewDelegate)localObject1).onCreate(paramBundle);
      localObject1 = this.zzaSl;
      localObject1 = ((IMapViewDelegate)localObject1).getView();
      localObject1 = zze.zzp((zzd)localObject1);
      localObject1 = (View)localObject1;
      this.zzaSm = ((View)localObject1);
      localObject1 = this.zzaSk;
      ((ViewGroup)localObject1).removeAllViews();
      localObject1 = this.zzaSk;
      localObject2 = this.zzaSm;
      ((ViewGroup)localObject1).addView((View)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
      throw ((Throwable)localObject2);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("onCreateView not allowed on MapViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onDestroy()
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onDestroyView()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("onDestroyView not allowed on MapViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onEnterAmbient(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onExitAmbient()
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onExitAmbient();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("onInflate not allowed on MapViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onLowMemory()
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onLowMemory();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onPause()
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onResume()
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      IMapViewDelegate localIMapViewDelegate = this.zzaSl;
      localIMapViewDelegate.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public IMapViewDelegate zzzX()
  {
    return this.zzaSl;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapView$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */