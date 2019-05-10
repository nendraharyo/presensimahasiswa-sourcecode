package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzd;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zze.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IndoorBuilding
{
  private final zzd zzaTs;
  
  public IndoorBuilding(zzd paramzzd)
  {
    zzd localzzd = (zzd)zzx.zzz(paramzzd);
    this.zzaTs = localzzd;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof IndoorBuilding;
    zzd localzzd;
    if (!bool)
    {
      bool = false;
      localzzd = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzzd = this.zzaTs;
        paramObject = (IndoorBuilding)paramObject;
        localObject = ((IndoorBuilding)paramObject).zzaTs;
        bool = localzzd.zzb((zzd)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public int getActiveLevelIndex()
  {
    try
    {
      zzd localzzd = this.zzaTs;
      return localzzd.getActiveLevelIndex();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public int getDefaultLevelIndex()
  {
    try
    {
      zzd localzzd = this.zzaTs;
      return localzzd.getActiveLevelIndex();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public List getLevels()
  {
    try
    {
      Object localObject1 = this.zzaTs;
      localObject1 = ((zzd)localObject1).getLevels();
      Object localObject2 = new java/util/ArrayList;
      int i = ((List)localObject1).size();
      ((ArrayList)localObject2).<init>(i);
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (IBinder)localObject1;
        IndoorLevel localIndoorLevel = new com/google/android/gms/maps/model/IndoorLevel;
        localObject1 = zze.zza.zzdh((IBinder)localObject1);
        localIndoorLevel.<init>((zze)localObject1);
        ((List)localObject2).add(localIndoorLevel);
      }
      return (List)localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
      throw ((Throwable)localObject2);
    }
  }
  
  public int hashCode()
  {
    try
    {
      zzd localzzd = this.zzaTs;
      return localzzd.hashCodeRemote();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean isUnderground()
  {
    try
    {
      zzd localzzd = this.zzaTs;
      return localzzd.isUnderground();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\IndoorBuilding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */