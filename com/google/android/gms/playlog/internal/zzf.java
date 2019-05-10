package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzsu;
import java.util.ArrayList;
import java.util.Iterator;

public class zzf
  extends zzj
{
  private final String zzTJ;
  private final zzd zzbdT;
  private final zzb zzbdU;
  private boolean zzbdV;
  private final Object zzpV;
  
  public zzf(Context paramContext, Looper paramLooper, zzd paramzzd, com.google.android.gms.common.internal.zzf paramzzf)
  {
    super(paramContext, paramLooper, 24, paramzzf, paramzzd, paramzzd);
    localObject = paramContext.getPackageName();
    this.zzTJ = ((String)localObject);
    localObject = (zzd)zzx.zzz(paramzzd);
    this.zzbdT = ((zzd)localObject);
    this.zzbdT.zza(this);
    localObject = new com/google/android/gms/playlog/internal/zzb;
    ((zzb)localObject).<init>();
    this.zzbdU = ((zzb)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzbdV = true;
  }
  
  private void zzEW()
  {
    boolean bool1 = this.zzbdV;
    Object localObject3;
    ArrayList localArrayList;
    Object localObject4;
    String str;
    Object localObject2;
    if (!bool1)
    {
      bool1 = true;
      com.google.android.gms.common.internal.zzb.zzab(bool1);
      Object localObject1 = this.zzbdU;
      bool1 = ((zzb)localObject1).isEmpty();
      if (!bool1)
      {
        localObject3 = null;
        try
        {
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject1 = this.zzbdU;
          localObject1 = ((zzb)localObject1).zzEU();
          Iterator localIterator = ((ArrayList)localObject1).iterator();
          for (;;)
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break label276;
            }
            localObject1 = localIterator.next();
            localObject1 = (zzb.zza)localObject1;
            localObject4 = ((zzb.zza)localObject1).zzbdI;
            if (localObject4 == null) {
              break;
            }
            localObject4 = zzqJ();
            localObject4 = (zza)localObject4;
            str = this.zzTJ;
            PlayLoggerContext localPlayLoggerContext = ((zzb.zza)localObject1).zzbdG;
            localObject1 = ((zzb.zza)localObject1).zzbdI;
            localObject1 = zzsu.toByteArray((zzsu)localObject1);
            ((zza)localObject4).zza(str, localPlayLoggerContext, (byte[])localObject1);
          }
          return;
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = "PlayLoggerImpl";
          localObject4 = "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.";
          Log.e((String)localObject2, (String)localObject4);
        }
      }
    }
    for (;;)
    {
      bool1 = false;
      localObject2 = null;
      break;
      localObject4 = ((zzb.zza)localObject2).zzbdG;
      boolean bool2 = ((PlayLoggerContext)localObject4).equals(localObject3);
      if (bool2)
      {
        localObject2 = ((zzb.zza)localObject2).zzbdH;
        localArrayList.add(localObject2);
      }
      for (localObject2 = localObject3;; localObject2 = localObject4)
      {
        localObject3 = localObject2;
        break;
        bool2 = localArrayList.isEmpty();
        if (!bool2)
        {
          localObject4 = zzqJ();
          localObject4 = (zza)localObject4;
          str = this.zzTJ;
          ((zza)localObject4).zza(str, (PlayLoggerContext)localObject3, localArrayList);
          localArrayList.clear();
        }
        localObject4 = ((zzb.zza)localObject2).zzbdG;
        localObject2 = ((zzb.zza)localObject2).zzbdH;
        localArrayList.add(localObject2);
      }
      label276:
      bool1 = localArrayList.isEmpty();
      if (!bool1)
      {
        localObject2 = zzqJ();
        localObject2 = (zza)localObject2;
        localObject4 = this.zzTJ;
        ((zza)localObject2).zza((String)localObject4, (PlayLoggerContext)localObject3, localArrayList);
      }
      localObject2 = this.zzbdU;
      ((zzb)localObject2).clear();
    }
  }
  
  private void zzc(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    this.zzbdU.zza(paramPlayLoggerContext, paramLogEvent);
  }
  
  private void zzd(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    try
    {
      zzEW();
      Object localObject = zzqJ();
      localObject = (zza)localObject;
      str3 = this.zzTJ;
      ((zza)localObject).zza(str3, paramPlayLoggerContext, paramLogEvent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "PlayLoggerImpl";
        str3 = "Couldn't send log event.  Will try caching.";
        Log.e(str1, str3);
        zzc(paramPlayLoggerContext, paramLogEvent);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str2 = "PlayLoggerImpl";
        String str3 = "Service was disconnected.  Will try caching.";
        Log.e(str2, str3);
        zzc(paramPlayLoggerContext, paramLogEvent);
      }
    }
  }
  
  public void start()
  {
    synchronized (this.zzpV)
    {
      boolean bool1 = isConnecting();
      if (!bool1)
      {
        bool1 = isConnected();
        if (!bool1) {}
      }
      else
      {
        return;
      }
      zzd localzzd = this.zzbdT;
      boolean bool2 = true;
      localzzd.zzat(bool2);
      zzqG();
    }
  }
  
  public void stop()
  {
    synchronized (this.zzpV)
    {
      zzd localzzd = this.zzbdT;
      localzzd.zzat(false);
      disconnect();
      return;
    }
  }
  
  void zzau(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzbdV;
      this.zzbdV = paramBoolean;
      if (bool)
      {
        bool = this.zzbdV;
        if (!bool) {
          zzEW();
        }
      }
      return;
    }
  }
  
  public void zzb(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzbdV;
      if (bool)
      {
        zzc(paramPlayLoggerContext, paramLogEvent);
        return;
      }
      zzd(paramPlayLoggerContext, paramLogEvent);
    }
  }
  
  protected zza zzdO(IBinder paramIBinder)
  {
    return zza.zza.zzdN(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.playlog.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.playlog.internal.IPlayLogService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */