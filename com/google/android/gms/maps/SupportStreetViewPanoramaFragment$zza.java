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
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class SupportStreetViewPanoramaFragment$zza
  implements StreetViewLifecycleDelegate
{
  private final IStreetViewPanoramaFragmentDelegate zzaSz;
  private final Fragment zzalg;
  
  public SupportStreetViewPanoramaFragment$zza(Fragment paramFragment, IStreetViewPanoramaFragmentDelegate paramIStreetViewPanoramaFragmentDelegate)
  {
    Object localObject = (IStreetViewPanoramaFragmentDelegate)zzx.zzz(paramIStreetViewPanoramaFragmentDelegate);
    this.zzaSz = ((IStreetViewPanoramaFragmentDelegate)localObject);
    localObject = (Fragment)zzx.zzz(paramFragment);
    this.zzalg = ((Fragment)localObject);
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    try
    {
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localObject = new com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza$1;
      ((SupportStreetViewPanoramaFragment.zza.1)localObject).<init>(this, paramOnStreetViewPanoramaReadyCallback);
      localIStreetViewPanoramaFragmentDelegate.getStreetViewPanoramaAsync((zzaa)localObject);
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
        localObject2 = "StreetViewPanoramaOptions";
        boolean bool = ((Bundle)localObject1).containsKey((String)localObject2);
        if (bool)
        {
          localObject2 = "StreetViewPanoramaOptions";
          String str = "StreetViewPanoramaOptions";
          localObject1 = ((Bundle)localObject1).getParcelable(str);
          zzac.zza(paramBundle, (String)localObject2, (Parcelable)localObject1);
        }
      }
      localObject1 = this.zzaSz;
      ((IStreetViewPanoramaFragmentDelegate)localObject1).onCreate(paramBundle);
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localObject = zze.zzC(paramLayoutInflater);
      zzd localzzd = zze.zzC(paramViewGroup);
      return (View)zze.zzp(localIStreetViewPanoramaFragmentDelegate.onCreateView((zzd)localObject, localzzd, paramBundle));
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onDestroy();
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onDestroyView();
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
    try
    {
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localObject = zze.zzC(paramActivity);
      localIStreetViewPanoramaFragmentDelegate.onInflate((zzd)localObject, null, paramBundle2);
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onLowMemory();
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onPause();
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onResume();
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
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = this.zzaSz;
      localIStreetViewPanoramaFragmentDelegate.onSaveInstanceState(paramBundle);
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
  
  public IStreetViewPanoramaFragmentDelegate zzzZ()
  {
    return this.zzaSz;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportStreetViewPanoramaFragment$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */