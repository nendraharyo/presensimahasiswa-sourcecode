package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SupportMapFragment$zzb
  extends zza
{
  private Activity mActivity;
  protected zzf zzaSh;
  private final List zzaSi;
  private final Fragment zzalg;
  
  SupportMapFragment$zzb(Fragment paramFragment)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaSi = localArrayList;
    this.zzalg = paramFragment;
  }
  
  private void setActivity(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    zzzW();
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (SupportMapFragment.zza)zztU();
      ((SupportMapFragment.zza)localObject).getMapAsync(paramOnMapReadyCallback);
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
      localObject = (SupportMapFragment.zza)zztU();
      ((SupportMapFragment.zza)localObject).onEnterAmbient(paramBundle);
    }
  }
  
  public void onExitAmbient()
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (SupportMapFragment.zza)zztU();
      ((SupportMapFragment.zza)localObject).onExitAmbient();
    }
  }
  
  protected void zza(zzf paramzzf)
  {
    this.zzaSh = paramzzf;
    zzzW();
  }
  
  public void zzzW()
  {
    Object localObject1 = this.mActivity;
    if (localObject1 != null)
    {
      localObject1 = this.zzaSh;
      if (localObject1 != null)
      {
        localObject1 = zztU();
        if (localObject1 != null) {}
      }
    }
    try
    {
      localObject1 = this.mActivity;
      MapsInitializer.initialize((Context)localObject1);
      localObject1 = this.mActivity;
      localObject1 = zzad.zzaO((Context)localObject1);
      localObject2 = this.mActivity;
      localObject2 = zze.zzC(localObject2);
      localObject1 = ((zzc)localObject1).zzs((zzd)localObject2);
      if (localObject1 == null) {
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject3;
        Fragment localFragment;
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
    localObject3 = new com/google/android/gms/maps/SupportMapFragment$zza;
    localFragment = this.zzalg;
    ((SupportMapFragment.zza)localObject3).<init>(localFragment, (IMapFragmentDelegate)localObject1);
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
      localObject2 = (SupportMapFragment.zza)localObject2;
      ((SupportMapFragment.zza)localObject2).getMapAsync((OnMapReadyCallback)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportMapFragment$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */