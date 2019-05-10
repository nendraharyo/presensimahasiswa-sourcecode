package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class zzk
{
  private final Context mContext;
  private ContentProviderClient zzaOG = null;
  private boolean zzaOH = false;
  private Map zzaOI;
  private final zzp zzaOt;
  private Map zzaxd;
  
  public zzk(Context paramContext, zzp paramzzp)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaxd = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaOI = localHashMap;
    this.mContext = paramContext;
    this.zzaOt = paramzzp;
  }
  
  private zzk.zza zza(LocationCallback paramLocationCallback, Looper paramLooper)
  {
    synchronized (this.zzaOI)
    {
      Object localObject1 = this.zzaOI;
      localObject1 = ((Map)localObject1).get(paramLocationCallback);
      localObject1 = (zzk.zza)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/location/internal/zzk$zza;
        ((zzk.zza)localObject1).<init>(paramLocationCallback, paramLooper);
      }
      Map localMap2 = this.zzaOI;
      localMap2.put(paramLocationCallback, localObject1);
      return (zzk.zza)localObject1;
    }
  }
  
  private zzk.zzc zza(LocationListener paramLocationListener, Looper paramLooper)
  {
    synchronized (this.zzaxd)
    {
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).get(paramLocationListener);
      localObject1 = (zzk.zzc)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/location/internal/zzk$zzc;
        ((zzk.zzc)localObject1).<init>(paramLocationListener, paramLooper);
      }
      Map localMap2 = this.zzaxd;
      localMap2.put(paramLocationListener, localObject1);
      return (zzk.zzc)localObject1;
    }
  }
  
  public Location getLastLocation()
  {
    Object localObject1 = this.zzaOt;
    ((zzp)localObject1).zzqI();
    try
    {
      localObject1 = this.zzaOt;
      localObject1 = ((zzp)localObject1).zzqJ();
      localObject1 = (zzi)localObject1;
      localObject2 = this.mContext;
      localObject2 = ((Context)localObject2).getPackageName();
      return ((zzi)localObject1).zzei((String)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localRemoteException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void removeAllListeners()
  {
    Iterator localIterator;
    boolean bool;
    Object localObject5;
    try
    {
      synchronized (this.zzaxd)
      {
        Object localObject1 = this.zzaxd;
        localObject1 = ((Map)localObject1).values();
        localIterator = ((Collection)localObject1).iterator();
        do
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (zzk.zzc)localObject1;
        } while (localObject1 == null);
        localObject5 = this.zzaOt;
        localObject5 = ((zzp)localObject5).zzqJ();
        localObject5 = (zzi)localObject5;
        localObject1 = LocationRequestUpdateData.zza((zzd)localObject1, null);
        ((zzi)localObject5).zza((LocationRequestUpdateData)localObject1);
      }
      localObject3 = this.zzaxd;
    }
    catch (RemoteException localRemoteException)
    {
      localObject5 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject5).<init>(localRemoteException);
      throw ((Throwable)localObject5);
    }
    Object localObject3;
    ((Map)localObject3).clear();
    synchronized (this.zzaOI)
    {
      localObject3 = this.zzaOI;
      localObject3 = ((Map)localObject3).values();
      localIterator = ((Collection)localObject3).iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject3 = localIterator.next();
        localObject3 = (zzk.zza)localObject3;
      } while (localObject3 == null);
      localObject5 = this.zzaOt;
      localObject5 = ((zzp)localObject5).zzqJ();
      localObject5 = (zzi)localObject5;
      localObject3 = LocationRequestUpdateData.zza((zzc)localObject3, null);
      ((zzi)localObject5).zza((LocationRequestUpdateData)localObject3);
    }
    Map localMap2 = this.zzaOI;
    localMap2.clear();
  }
  
  public void zza(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    zzi localzzi = (zzi)this.zzaOt.zzqJ();
    LocationRequestUpdateData localLocationRequestUpdateData = LocationRequestUpdateData.zzb(paramPendingIntent, paramzzg);
    localzzi.zza(localLocationRequestUpdateData);
  }
  
  public void zza(LocationCallback paramLocationCallback, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    Object localObject1 = "Invalid null callback";
    zzx.zzb(paramLocationCallback, localObject1);
    synchronized (this.zzaOI)
    {
      localObject1 = this.zzaOI;
      localObject1 = ((Map)localObject1).remove(paramLocationCallback);
      localObject1 = (zzk.zza)localObject1;
      if (localObject1 != null)
      {
        ((zzk.zza)localObject1).release();
        Object localObject3 = this.zzaOt;
        localObject3 = ((zzp)localObject3).zzqJ();
        localObject3 = (zzi)localObject3;
        localObject1 = LocationRequestUpdateData.zza((zzc)localObject1, paramzzg);
        ((zzi)localObject3).zza((LocationRequestUpdateData)localObject1);
      }
      return;
    }
  }
  
  public void zza(LocationListener paramLocationListener, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    Object localObject1 = "Invalid null listener";
    zzx.zzb(paramLocationListener, localObject1);
    synchronized (this.zzaxd)
    {
      localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).remove(paramLocationListener);
      localObject1 = (zzk.zzc)localObject1;
      Object localObject3 = this.zzaOG;
      if (localObject3 != null)
      {
        localObject3 = this.zzaxd;
        boolean bool = ((Map)localObject3).isEmpty();
        if (bool)
        {
          localObject3 = this.zzaOG;
          ((ContentProviderClient)localObject3).release();
          bool = false;
          localObject3 = null;
          this.zzaOG = null;
        }
      }
      if (localObject1 != null)
      {
        ((zzk.zzc)localObject1).release();
        localObject3 = this.zzaOt;
        localObject3 = ((zzp)localObject3).zzqJ();
        localObject3 = (zzi)localObject3;
        localObject1 = LocationRequestUpdateData.zza((zzd)localObject1, paramzzg);
        ((zzi)localObject3).zza((LocationRequestUpdateData)localObject1);
      }
      return;
    }
  }
  
  public void zza(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    zzi localzzi = (zzi)this.zzaOt.zzqJ();
    LocationRequestUpdateData localLocationRequestUpdateData = LocationRequestUpdateData.zza(LocationRequestInternal.zzb(paramLocationRequest), paramPendingIntent, paramzzg);
    localzzi.zza(localLocationRequestUpdateData);
  }
  
  public void zza(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    Object localObject = zza(paramLocationListener, paramLooper);
    zzi localzzi = (zzi)this.zzaOt.zzqJ();
    localObject = LocationRequestUpdateData.zza(LocationRequestInternal.zzb(paramLocationRequest), (zzd)localObject, paramzzg);
    localzzi.zza((LocationRequestUpdateData)localObject);
  }
  
  public void zza(LocationRequestInternal paramLocationRequestInternal, LocationCallback paramLocationCallback, Looper paramLooper, zzg paramzzg)
  {
    this.zzaOt.zzqI();
    Object localObject = zza(paramLocationCallback, paramLooper);
    zzi localzzi = (zzi)this.zzaOt.zzqJ();
    localObject = LocationRequestUpdateData.zza(paramLocationRequestInternal, (zzc)localObject, paramzzg);
    localzzi.zza((LocationRequestUpdateData)localObject);
  }
  
  public void zza(zzg paramzzg)
  {
    this.zzaOt.zzqI();
    ((zzi)this.zzaOt.zzqJ()).zza(paramzzg);
  }
  
  public void zzam(boolean paramBoolean)
  {
    this.zzaOt.zzqI();
    ((zzi)this.zzaOt.zzqJ()).zzam(paramBoolean);
    this.zzaOH = paramBoolean;
  }
  
  public void zzc(Location paramLocation)
  {
    this.zzaOt.zzqI();
    ((zzi)this.zzaOt.zzqJ()).zzc(paramLocation);
  }
  
  public LocationAvailability zzyO()
  {
    Object localObject1 = this.zzaOt;
    ((zzp)localObject1).zzqI();
    try
    {
      localObject1 = this.zzaOt;
      localObject1 = ((zzp)localObject1).zzqJ();
      localObject1 = (zzi)localObject1;
      localObject2 = this.mContext;
      localObject2 = ((Context)localObject2).getPackageName();
      return ((zzi)localObject1).zzej((String)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localRemoteException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void zzyP()
  {
    boolean bool = this.zzaOH;
    if (bool)
    {
      bool = false;
      Object localObject = null;
    }
    try
    {
      zzam(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localRemoteException);
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */