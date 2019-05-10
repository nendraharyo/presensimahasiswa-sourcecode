package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class StreetViewPanoramaView
  extends FrameLayout
{
  private final StreetViewPanoramaView.zzb zzaSK;
  private StreetViewPanorama zzaSy;
  
  public StreetViewPanoramaView(Context paramContext)
  {
    super(paramContext);
    StreetViewPanoramaView.zzb localzzb = new com/google/android/gms/maps/StreetViewPanoramaView$zzb;
    localzzb.<init>(this, paramContext, null);
    this.zzaSK = localzzb;
  }
  
  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    StreetViewPanoramaView.zzb localzzb = new com/google/android/gms/maps/StreetViewPanoramaView$zzb;
    localzzb.<init>(this, paramContext, null);
    this.zzaSK = localzzb;
  }
  
  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    StreetViewPanoramaView.zzb localzzb = new com/google/android/gms/maps/StreetViewPanoramaView$zzb;
    localzzb.<init>(this, paramContext, null);
    this.zzaSK = localzzb;
  }
  
  public StreetViewPanoramaView(Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    super(paramContext);
    StreetViewPanoramaView.zzb localzzb = new com/google/android/gms/maps/StreetViewPanoramaView$zzb;
    localzzb.<init>(this, paramContext, paramStreetViewPanoramaOptions);
    this.zzaSK = localzzb;
  }
  
  public final StreetViewPanorama getStreetViewPanorama()
  {
    Object localObject1 = this.zzaSy;
    if (localObject1 != null) {
      localObject1 = this.zzaSy;
    }
    for (;;)
    {
      return (StreetViewPanorama)localObject1;
      this.zzaSK.zzzW();
      localObject1 = this.zzaSK.zztU();
      if (localObject1 == null)
      {
        localObject1 = null;
        continue;
      }
      try
      {
        localObject2 = new com/google/android/gms/maps/StreetViewPanorama;
        localObject1 = this.zzaSK;
        localObject1 = ((StreetViewPanoramaView.zzb)localObject1).zztU();
        localObject1 = (StreetViewPanoramaView.zza)localObject1;
        localObject1 = ((StreetViewPanoramaView.zza)localObject1).zzAd();
        localObject1 = ((IStreetViewPanoramaViewDelegate)localObject1).getStreetViewPanorama();
        ((StreetViewPanorama)localObject2).<init>((IStreetViewPanoramaDelegate)localObject1);
        this.zzaSy = ((StreetViewPanorama)localObject2);
        localObject1 = this.zzaSy;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    zzx.zzcD("getStreetViewPanoramaAsync() must be called on the main thread");
    this.zzaSK.getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    this.zzaSK.onCreate(paramBundle);
    LifecycleDelegate localLifecycleDelegate = this.zzaSK.zztU();
    if (localLifecycleDelegate == null) {
      zza.zzb(this);
    }
  }
  
  public final void onDestroy()
  {
    this.zzaSK.onDestroy();
  }
  
  public final void onLowMemory()
  {
    this.zzaSK.onLowMemory();
  }
  
  public final void onPause()
  {
    this.zzaSK.onPause();
  }
  
  public final void onResume()
  {
    this.zzaSK.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    this.zzaSK.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */