package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class StreetViewPanoramaFragment
  extends Fragment
{
  private final StreetViewPanoramaFragment.zzb zzaSx;
  private StreetViewPanorama zzaSy;
  
  public StreetViewPanoramaFragment()
  {
    StreetViewPanoramaFragment.zzb localzzb = new com/google/android/gms/maps/StreetViewPanoramaFragment$zzb;
    localzzb.<init>(this);
    this.zzaSx = localzzb;
  }
  
  public static StreetViewPanoramaFragment newInstance()
  {
    StreetViewPanoramaFragment localStreetViewPanoramaFragment = new com/google/android/gms/maps/StreetViewPanoramaFragment;
    localStreetViewPanoramaFragment.<init>();
    return localStreetViewPanoramaFragment;
  }
  
  public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    StreetViewPanoramaFragment localStreetViewPanoramaFragment = new com/google/android/gms/maps/StreetViewPanoramaFragment;
    localStreetViewPanoramaFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("StreetViewPanoramaOptions", paramStreetViewPanoramaOptions);
    localStreetViewPanoramaFragment.setArguments(localBundle);
    return localStreetViewPanoramaFragment;
  }
  
  public final StreetViewPanorama getStreetViewPanorama()
  {
    Object localObject1 = null;
    Object localObject2 = zzzZ();
    if (localObject2 == null) {}
    for (;;)
    {
      return (StreetViewPanorama)localObject1;
      try
      {
        localObject2 = ((IStreetViewPanoramaFragmentDelegate)localObject2).getStreetViewPanorama();
        if (localObject2 == null) {
          continue;
        }
        localObject1 = this.zzaSy;
        if (localObject1 != null)
        {
          localObject1 = this.zzaSy.zzzY().asBinder();
          IBinder localIBinder = ((IStreetViewPanoramaDelegate)localObject2).asBinder();
          if (localObject1 == localIBinder) {}
        }
        else
        {
          localObject1 = new com/google/android/gms/maps/StreetViewPanorama;
          ((StreetViewPanorama)localObject1).<init>((IStreetViewPanoramaDelegate)localObject2);
          this.zzaSy = ((StreetViewPanorama)localObject1);
        }
        localObject1 = this.zzaSy;
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    zzx.zzcD("getStreetViewPanoramaAsync() must be called on the main thread");
    this.zzaSx.getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = StreetViewPanoramaFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    StreetViewPanoramaFragment.zzb.zza(this.zzaSx, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzaSx.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.zzaSx.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    this.zzaSx.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.zzaSx.onDestroyView();
    super.onDestroyView();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    StreetViewPanoramaFragment.zzb.zza(this.zzaSx, paramActivity);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzaSx.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.zzaSx.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.zzaSx.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzaSx.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = StreetViewPanoramaFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onSaveInstanceState(paramBundle);
    this.zzaSx.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IStreetViewPanoramaFragmentDelegate zzzZ()
  {
    this.zzaSx.zzzW();
    Object localObject = this.zzaSx.zztU();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((StreetViewPanoramaFragment.zza)this.zzaSx.zztU()).zzzZ()) {
      return (IStreetViewPanoramaFragmentDelegate)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */