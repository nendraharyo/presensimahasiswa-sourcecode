package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zze;

public final class IndoorLevel
{
  private final zze zzaTt;
  
  public IndoorLevel(zze paramzze)
  {
    zze localzze = (zze)zzx.zzz(paramzze);
    this.zzaTt = localzze;
  }
  
  public void activate()
  {
    try
    {
      zze localzze = this.zzaTt;
      localzze.activate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof IndoorLevel;
    zze localzze;
    if (!bool)
    {
      bool = false;
      localzze = null;
    }
    for (;;)
    {
      return bool;
      try
      {
        localzze = this.zzaTt;
        paramObject = (IndoorLevel)paramObject;
        localObject = ((IndoorLevel)paramObject).zzaTt;
        bool = localzze.zza((zze)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  public String getName()
  {
    try
    {
      zze localzze = this.zzaTt;
      return localzze.getName();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public String getShortName()
  {
    try
    {
      zze localzze = this.zzaTt;
      return localzze.getShortName();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public int hashCode()
  {
    try
    {
      zze localzze = this.zzaTt;
      return localzze.hashCodeRemote();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\IndoorLevel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */