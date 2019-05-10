package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.zza;

public abstract interface zzc
  extends IInterface
{
  public abstract void init(zzd paramzzd);
  
  public abstract ICameraUpdateFactoryDelegate zzAe();
  
  public abstract zza zzAf();
  
  public abstract IMapViewDelegate zza(zzd paramzzd, GoogleMapOptions paramGoogleMapOptions);
  
  public abstract IStreetViewPanoramaViewDelegate zza(zzd paramzzd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions);
  
  public abstract void zzd(zzd paramzzd, int paramInt);
  
  public abstract IMapFragmentDelegate zzs(zzd paramzzd);
  
  public abstract IStreetViewPanoramaFragmentDelegate zzt(zzd paramzzd);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */