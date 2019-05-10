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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapFragment
  extends Fragment
{
  private final MapFragment.zzb zzaSc;
  private GoogleMap zzaSd;
  
  public MapFragment()
  {
    MapFragment.zzb localzzb = new com/google/android/gms/maps/MapFragment$zzb;
    localzzb.<init>(this);
    this.zzaSc = localzzb;
  }
  
  public static MapFragment newInstance()
  {
    MapFragment localMapFragment = new com/google/android/gms/maps/MapFragment;
    localMapFragment.<init>();
    return localMapFragment;
  }
  
  public static MapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    MapFragment localMapFragment = new com/google/android/gms/maps/MapFragment;
    localMapFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localMapFragment.setArguments(localBundle);
    return localMapFragment;
  }
  
  public final GoogleMap getMap()
  {
    Object localObject1 = null;
    Object localObject2 = zzzV();
    if (localObject2 == null) {}
    for (;;)
    {
      return (GoogleMap)localObject1;
      try
      {
        localObject2 = ((IMapFragmentDelegate)localObject2).getMap();
        if (localObject2 == null) {
          continue;
        }
        localObject1 = this.zzaSd;
        if (localObject1 != null)
        {
          localObject1 = this.zzaSd.zzzJ().asBinder();
          IBinder localIBinder = ((IGoogleMapDelegate)localObject2).asBinder();
          if (localObject1 == localIBinder) {}
        }
        else
        {
          localObject1 = new com/google/android/gms/maps/GoogleMap;
          ((GoogleMap)localObject1).<init>((IGoogleMapDelegate)localObject2);
          this.zzaSd = ((GoogleMap)localObject1);
        }
        localObject1 = this.zzaSd;
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    zzx.zzcD("getMapAsync must be called on the main thread.");
    this.zzaSc.getMapAsync(paramOnMapReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = MapFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    MapFragment.zzb.zza(this.zzaSc, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzaSc.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = this.zzaSc.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    localView.setClickable(true);
    return localView;
  }
  
  public void onDestroy()
  {
    this.zzaSc.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.zzaSc.onDestroyView();
    super.onDestroyView();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient must be called on the main thread.");
    this.zzaSc.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient must be called on the main thread.");
    this.zzaSc.onExitAmbient();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    MapFragment.zzb.zza(this.zzaSc, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.zzaSc.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.zzaSc.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.zzaSc.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzaSc.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = MapFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onSaveInstanceState(paramBundle);
    this.zzaSc.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IMapFragmentDelegate zzzV()
  {
    this.zzaSc.zzzW();
    Object localObject = this.zzaSc.zztU();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((MapFragment.zza)this.zzaSc.zztU()).zzzV()) {
      return (IMapFragmentDelegate)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */