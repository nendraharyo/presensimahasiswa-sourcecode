package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract interface IProjectionDelegate
  extends IInterface
{
  public abstract LatLng fromScreenLocation(zzd paramzzd);
  
  public abstract VisibleRegion getVisibleRegion();
  
  public abstract zzd toScreenLocation(LatLng paramLatLng);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\IProjectionDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */