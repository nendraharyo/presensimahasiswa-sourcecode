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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class StreetViewPanoramaView$zza
  implements StreetViewLifecycleDelegate
{
  private final IStreetViewPanoramaViewDelegate zzaSL;
  private View zzaSM;
  private final ViewGroup zzaSk;
  
  public StreetViewPanoramaView$zza(ViewGroup paramViewGroup, IStreetViewPanoramaViewDelegate paramIStreetViewPanoramaViewDelegate)
  {
    Object localObject = (IStreetViewPanoramaViewDelegate)zzx.zzz(paramIStreetViewPanoramaViewDelegate);
    this.zzaSL = ((IStreetViewPanoramaViewDelegate)localObject);
    localObject = (ViewGroup)zzx.zzz(paramViewGroup);
    this.zzaSk = ((ViewGroup)localObject);
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    try
    {
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localObject = new com/google/android/gms/maps/StreetViewPanoramaView$zza$1;
      ((StreetViewPanoramaView.zza.1)localObject).<init>(this, paramOnStreetViewPanoramaReadyCallback);
      localIStreetViewPanoramaViewDelegate.getStreetViewPanoramaAsync((zzaa)localObject);
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
      Object localObject1 = this.zzaSL;
      ((IStreetViewPanoramaViewDelegate)localObject1).onCreate(paramBundle);
      localObject1 = this.zzaSL;
      localObject1 = ((IStreetViewPanoramaViewDelegate)localObject1).getView();
      localObject1 = zze.zzp((zzd)localObject1);
      localObject1 = (View)localObject1;
      this.zzaSM = ((View)localObject1);
      localObject1 = this.zzaSk;
      ((ViewGroup)localObject1).removeAllViews();
      localObject1 = this.zzaSk;
      localObject2 = this.zzaSM;
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
    localUnsupportedOperationException.<init>("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onDestroy()
  {
    try
    {
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localIStreetViewPanoramaViewDelegate.onDestroy();
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
    localUnsupportedOperationException.<init>("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("onInflate not allowed on StreetViewPanoramaViewDelegate");
    throw localUnsupportedOperationException;
  }
  
  public void onLowMemory()
  {
    try
    {
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localIStreetViewPanoramaViewDelegate.onLowMemory();
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
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localIStreetViewPanoramaViewDelegate.onPause();
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
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localIStreetViewPanoramaViewDelegate.onResume();
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
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = this.zzaSL;
      localIStreetViewPanoramaViewDelegate.onSaveInstanceState(paramBundle);
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
  
  public IStreetViewPanoramaViewDelegate zzAd()
  {
    return this.zzaSL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaView$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */