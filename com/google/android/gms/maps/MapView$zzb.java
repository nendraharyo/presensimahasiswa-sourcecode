package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MapView$zzb
  extends zza
{
  private final Context mContext;
  protected zzf zzaSh;
  private final List zzaSi;
  private final ViewGroup zzaSo;
  private final GoogleMapOptions zzaSp;
  
  MapView$zzb(ViewGroup paramViewGroup, Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaSi = localArrayList;
    this.zzaSo = paramViewGroup;
    this.mContext = paramContext;
    this.zzaSp = paramGoogleMapOptions;
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (MapView.zza)zztU();
      ((MapView.zza)localObject).getMapAsync(paramOnMapReadyCallback);
    }
    for (;;)
    {
      return;
      localObject = this.zzaSi;
      ((List)localObject).add(paramOnMapReadyCallback);
    }
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (MapView.zza)zztU();
      ((MapView.zza)localObject).onEnterAmbient(paramBundle);
    }
  }
  
  public void onExitAmbient()
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (MapView.zza)zztU();
      ((MapView.zza)localObject).onExitAmbient();
    }
  }
  
  protected void zza(zzf paramzzf)
  {
    this.zzaSh = paramzzf;
    zzzW();
  }
  
  public void zzzW()
  {
    Object localObject1 = this.zzaSh;
    if (localObject1 != null)
    {
      localObject1 = zztU();
      if (localObject1 != null) {}
    }
    try
    {
      localObject1 = this.mContext;
      MapsInitializer.initialize((Context)localObject1);
      localObject1 = this.mContext;
      localObject1 = zzad.zzaO((Context)localObject1);
      localObject2 = this.mContext;
      localObject2 = zze.zzC(localObject2);
      localObject3 = this.zzaSp;
      localObject1 = ((zzc)localObject1).zza((zzd)localObject2, (GoogleMapOptions)localObject3);
      if (localObject1 == null) {
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject3;
        ViewGroup localViewGroup;
        Object localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
        List localList = this.zzaSi;
        localList.clear();
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;) {}
    }
    localObject2 = this.zzaSh;
    localObject3 = new com/google/android/gms/maps/MapView$zza;
    localViewGroup = this.zzaSo;
    ((MapView.zza)localObject3).<init>(localViewGroup, (IMapViewDelegate)localObject1);
    ((zzf)localObject2).zza((LifecycleDelegate)localObject3);
    localObject1 = this.zzaSi;
    localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = ((Iterator)localObject3).next();
      localObject1 = (OnMapReadyCallback)localObject1;
      localObject2 = zztU();
      localObject2 = (MapView.zza)localObject2;
      ((MapView.zza)localObject2).getMapAsync((OnMapReadyCallback)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapView$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */