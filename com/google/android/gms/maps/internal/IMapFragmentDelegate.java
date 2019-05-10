package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;

public abstract interface IMapFragmentDelegate
  extends IInterface
{
  public abstract IGoogleMapDelegate getMap();
  
  public abstract void getMapAsync(zzo paramzzo);
  
  public abstract boolean isReady();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract zzd onCreateView(zzd paramzzd1, zzd paramzzd2, Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onDestroyView();
  
  public abstract void onEnterAmbient(Bundle paramBundle);
  
  public abstract void onExitAmbient();
  
  public abstract void onInflate(zzd paramzzd, GoogleMapOptions paramGoogleMapOptions, Bundle paramBundle);
  
  public abstract void onLowMemory();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IMapFragmentDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */