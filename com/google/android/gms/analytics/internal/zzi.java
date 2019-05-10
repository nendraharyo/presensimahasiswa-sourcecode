package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class zzi
  extends zzd
{
  private final zzi.zza zzQH;
  private zzac zzQI;
  private final zzt zzQJ;
  private zzaj zzQK;
  
  protected zzi(zzf paramzzf)
  {
    super(paramzzf);
    Object localObject = new com/google/android/gms/analytics/internal/zzaj;
    zzmq localzzmq = paramzzf.zzjl();
    ((zzaj)localObject).<init>(localzzmq);
    this.zzQK = ((zzaj)localObject);
    localObject = new com/google/android/gms/analytics/internal/zzi$zza;
    ((zzi.zza)localObject).<init>(this);
    this.zzQH = ((zzi.zza)localObject);
    localObject = new com/google/android/gms/analytics/internal/zzi$1;
    ((zzi.1)localObject).<init>(this, paramzzf);
    this.zzQJ = ((zzt)localObject);
  }
  
  private void onDisconnect()
  {
    zziH().zzjf();
  }
  
  private void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzjk();
    Object localObject = this.zzQI;
    if (localObject != null)
    {
      this.zzQI = null;
      localObject = "Disconnected from device AnalyticsService";
      zza((String)localObject, paramComponentName);
      onDisconnect();
    }
  }
  
  private void zza(zzac paramzzac)
  {
    zzjk();
    this.zzQI = paramzzac;
    zzjI();
    zziH().onServiceConnected();
  }
  
  private void zzjI()
  {
    this.zzQK.start();
    zzt localzzt = this.zzQJ;
    long l = zzjn().zzkM();
    localzzt.zzt(l);
  }
  
  private void zzjJ()
  {
    zzjk();
    boolean bool = isConnected();
    if (!bool) {}
    for (;;)
    {
      return;
      String str = "Inactivity, disconnecting from device AnalyticsService";
      zzbd(str);
      disconnect();
    }
  }
  
  public boolean connect()
  {
    boolean bool = true;
    zzjk();
    zzjv();
    zzac localzzac = this.zzQI;
    if (localzzac != null) {}
    for (;;)
    {
      return bool;
      localzzac = this.zzQH.zzjK();
      if (localzzac != null)
      {
        this.zzQI = localzzac;
        zzjI();
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public void disconnect()
  {
    zzjk();
    zzjv();
    try
    {
      localObject = com.google.android.gms.common.stats.zzb.zzrP();
      Context localContext = getContext();
      zzi.zza localzza = this.zzQH;
      ((com.google.android.gms.common.stats.zzb)localObject).zza(localContext, localzza);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Object localObject;
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    localObject = this.zzQI;
    if (localObject != null)
    {
      localObject = null;
      this.zzQI = null;
      onDisconnect();
    }
  }
  
  public boolean isConnected()
  {
    zzjk();
    zzjv();
    zzac localzzac = this.zzQI;
    boolean bool;
    if (localzzac != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzac = null;
    }
  }
  
  public boolean zzb(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    zzjk();
    zzjv();
    zzac localzzac = this.zzQI;
    boolean bool1;
    if (localzzac == null)
    {
      bool1 = false;
      localzzac = null;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = paramzzab.zzlt();
      Object localObject2;
      if (bool2) {
        localObject2 = zzjn();
      }
      for (String str = ((zzr)localObject2).zzkF();; str = ((zzr)localObject2).zzkG())
      {
        List localList = Collections.emptyList();
        try
        {
          localObject2 = paramzzab.zzn();
          long l = paramzzab.zzlr();
          localzzac.zza((Map)localObject2, l, str, localList);
          zzjI();
          bool1 = true;
        }
        catch (RemoteException localRemoteException)
        {
          zzbd("Failed to send hits to AnalyticsService");
          bool1 = false;
          Object localObject1 = null;
        }
        localObject2 = zzjn();
      }
    }
  }
  
  protected void zziJ() {}
  
  public boolean zzjH()
  {
    boolean bool = false;
    zzjk();
    zzjv();
    zzac localzzac = this.zzQI;
    if (localzzac == null) {}
    for (;;)
    {
      return bool;
      try
      {
        localzzac.zzjc();
        zzjI();
        bool = true;
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Failed to clear hits from AnalyticsService";
        zzbd(str);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */