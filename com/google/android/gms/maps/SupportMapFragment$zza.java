package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.internal.zzo;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class SupportMapFragment$zza
  implements MapLifecycleDelegate
{
  private final IMapFragmentDelegate zzaSe;
  private final Fragment zzalg;
  
  public SupportMapFragment$zza(Fragment paramFragment, IMapFragmentDelegate paramIMapFragmentDelegate)
  {
    Object localObject = (IMapFragmentDelegate)zzx.zzz(paramIMapFragmentDelegate);
    this.zzaSe = ((IMapFragmentDelegate)localObject);
    localObject = (Fragment)zzx.zzz(paramFragment);
    this.zzalg = ((Fragment)localObject);
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localObject = new com/google/android/gms/maps/SupportMapFragment$zza$1;
      ((SupportMapFragment.zza.1)localObject).<init>(this, paramOnMapReadyCallback);
      localIMapFragmentDelegate.getMapAsync((zzo)localObject);
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
    if (paramBundle == null) {}
    try
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
      Object localObject1 = this.zzalg;
      localObject1 = ((Fragment)localObject1).getArguments();
      if (localObject1 != null)
      {
        localObject2 = "MapOptions";
        boolean bool = ((Bundle)localObject1).containsKey((String)localObject2);
        if (bool)
        {
          localObject2 = "MapOptions";
          String str = "MapOptions";
          localObject1 = ((Bundle)localObject1).getParcelable(str);
          zzac.zza(paramBundle, (String)localObject2, (Parcelable)localObject1);
        }
      }
      localObject1 = this.zzaSe;
      ((IMapFragmentDelegate)localObject1).onCreate(paramBundle);
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
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localObject = zze.zzC(paramLayoutInflater);
      zzd localzzd = zze.zzC(paramViewGroup);
      return (View)zze.zzp(localIMapFragmentDelegate.onCreateView((zzd)localObject, localzzd, paramBundle));
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void onDestroy()
  {
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onDestroy();
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
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onDestroyView();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onEnterAmbient(paramBundle);
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
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onExitAmbient();
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
    GoogleMapOptions localGoogleMapOptions = (GoogleMapOptions)paramBundle1.getParcelable("MapOptions");
    try
    {
      localObject = this.zzaSe;
      zzd localzzd = zze.zzC(paramActivity);
      ((IMapFragmentDelegate)localObject).onInflate(localzzd, localGoogleMapOptions, paramBundle2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void onLowMemory()
  {
    try
    {
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onLowMemory();
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
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onPause();
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
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onResume();
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
      IMapFragmentDelegate localIMapFragmentDelegate = this.zzaSe;
      localIMapFragmentDelegate.onSaveInstanceState(paramBundle);
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
  
  public IMapFragmentDelegate zzzV()
  {
    return this.zzaSe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportMapFragment$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */