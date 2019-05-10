package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportStreetViewPanoramaFragment
  extends Fragment
{
  private final SupportStreetViewPanoramaFragment.zzb zzaSR;
  private StreetViewPanorama zzaSy;
  
  public SupportStreetViewPanoramaFragment()
  {
    SupportStreetViewPanoramaFragment.zzb localzzb = new com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb;
    localzzb.<init>(this);
    this.zzaSR = localzzb;
  }
  
  public static SupportStreetViewPanoramaFragment newInstance()
  {
    SupportStreetViewPanoramaFragment localSupportStreetViewPanoramaFragment = new com/google/android/gms/maps/SupportStreetViewPanoramaFragment;
    localSupportStreetViewPanoramaFragment.<init>();
    return localSupportStreetViewPanoramaFragment;
  }
  
  public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    SupportStreetViewPanoramaFragment localSupportStreetViewPanoramaFragment = new com/google/android/gms/maps/SupportStreetViewPanoramaFragment;
    localSupportStreetViewPanoramaFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("StreetViewPanoramaOptions", paramStreetViewPanoramaOptions);
    localSupportStreetViewPanoramaFragment.setArguments(localBundle);
    return localSupportStreetViewPanoramaFragment;
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
    this.zzaSR.getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    SupportStreetViewPanoramaFragment.zzb.zza(this.zzaSR, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzaSR.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.zzaSR.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    this.zzaSR.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.zzaSR.onDestroyView();
    super.onDestroyView();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    SupportStreetViewPanoramaFragment.zzb.zza(this.zzaSR, paramActivity);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzaSR.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.zzaSR.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.zzaSR.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzaSR.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onSaveInstanceState(paramBundle);
    this.zzaSR.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IStreetViewPanoramaFragmentDelegate zzzZ()
  {
    this.zzaSR.zzzW();
    Object localObject = this.zzaSR.zztU();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((SupportStreetViewPanoramaFragment.zza)this.zzaSR.zztU()).zzzZ()) {
      return (IStreetViewPanoramaFragmentDelegate)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportStreetViewPanoramaFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */