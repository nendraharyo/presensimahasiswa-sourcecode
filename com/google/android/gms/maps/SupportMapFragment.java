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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportMapFragment
  extends Fragment
{
  private final SupportMapFragment.zzb zzaSP;
  private GoogleMap zzaSd;
  
  public SupportMapFragment()
  {
    SupportMapFragment.zzb localzzb = new com/google/android/gms/maps/SupportMapFragment$zzb;
    localzzb.<init>(this);
    this.zzaSP = localzzb;
  }
  
  public static SupportMapFragment newInstance()
  {
    SupportMapFragment localSupportMapFragment = new com/google/android/gms/maps/SupportMapFragment;
    localSupportMapFragment.<init>();
    return localSupportMapFragment;
  }
  
  public static SupportMapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    SupportMapFragment localSupportMapFragment = new com/google/android/gms/maps/SupportMapFragment;
    localSupportMapFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localSupportMapFragment.setArguments(localBundle);
    return localSupportMapFragment;
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
    this.zzaSP.getMapAsync(paramOnMapReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = SupportMapFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    SupportMapFragment.zzb.zza(this.zzaSP, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.zzaSP.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = this.zzaSP.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    localView.setClickable(true);
    return localView;
  }
  
  public void onDestroy()
  {
    this.zzaSP.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.zzaSP.onDestroyView();
    super.onDestroyView();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient must be called on the main thread.");
    this.zzaSP.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient must be called on the main thread.");
    this.zzaSP.onExitAmbient();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    SupportMapFragment.zzb.zza(this.zzaSP, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.zzaSP.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.zzaSP.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.zzaSP.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzaSP.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      ClassLoader localClassLoader = SupportMapFragment.class.getClassLoader();
      paramBundle.setClassLoader(localClassLoader);
    }
    super.onSaveInstanceState(paramBundle);
    this.zzaSP.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IMapFragmentDelegate zzzV()
  {
    this.zzaSP.zzzW();
    Object localObject = this.zzaSP.zztU();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((SupportMapFragment.zza)this.zzaSP.zztU()).zzzV()) {
      return (IMapFragmentDelegate)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportMapFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */