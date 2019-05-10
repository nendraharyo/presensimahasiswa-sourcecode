package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView
  extends FrameLayout
{
  private GoogleMap zzaSd;
  private final MapView.zzb zzaSj;
  
  public MapView(Context paramContext)
  {
    super(paramContext);
    MapView.zzb localzzb = new com/google/android/gms/maps/MapView$zzb;
    localzzb.<init>(this, paramContext, null);
    this.zzaSj = localzzb;
    zzex();
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    MapView.zzb localzzb = new com/google/android/gms/maps/MapView$zzb;
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet);
    localzzb.<init>(this, paramContext, localGoogleMapOptions);
    this.zzaSj = localzzb;
    zzex();
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    MapView.zzb localzzb = new com/google/android/gms/maps/MapView$zzb;
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet);
    localzzb.<init>(this, paramContext, localGoogleMapOptions);
    this.zzaSj = localzzb;
    zzex();
  }
  
  public MapView(Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    super(paramContext);
    MapView.zzb localzzb = new com/google/android/gms/maps/MapView$zzb;
    localzzb.<init>(this, paramContext, paramGoogleMapOptions);
    this.zzaSj = localzzb;
    zzex();
  }
  
  private void zzex()
  {
    setClickable(true);
  }
  
  public final GoogleMap getMap()
  {
    Object localObject1 = this.zzaSd;
    if (localObject1 != null) {
      localObject1 = this.zzaSd;
    }
    for (;;)
    {
      return (GoogleMap)localObject1;
      this.zzaSj.zzzW();
      localObject1 = this.zzaSj.zztU();
      if (localObject1 == null)
      {
        localObject1 = null;
        continue;
      }
      try
      {
        localObject2 = new com/google/android/gms/maps/GoogleMap;
        localObject1 = this.zzaSj;
        localObject1 = ((MapView.zzb)localObject1).zztU();
        localObject1 = (MapView.zza)localObject1;
        localObject1 = ((MapView.zza)localObject1).zzzX();
        localObject1 = ((IMapViewDelegate)localObject1).getMap();
        ((GoogleMap)localObject2).<init>((IGoogleMapDelegate)localObject1);
        this.zzaSd = ((GoogleMap)localObject2);
        localObject1 = this.zzaSd;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    zzx.zzcD("getMapAsync() must be called on the main thread");
    this.zzaSj.getMapAsync(paramOnMapReadyCallback);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    this.zzaSj.onCreate(paramBundle);
    LifecycleDelegate localLifecycleDelegate = this.zzaSj.zztU();
    if (localLifecycleDelegate == null) {
      zza.zzb(this);
    }
  }
  
  public final void onDestroy()
  {
    this.zzaSj.onDestroy();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient() must be called on the main thread");
    this.zzaSj.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient() must be called on the main thread");
    this.zzaSj.onExitAmbient();
  }
  
  public final void onLowMemory()
  {
    this.zzaSj.onLowMemory();
  }
  
  public final void onPause()
  {
    this.zzaSj.onPause();
  }
  
  public final void onResume()
  {
    this.zzaSj.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    this.zzaSj.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */