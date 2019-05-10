package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.measurement.zzg;

public class zzi$zza
  implements ServiceConnection
{
  private volatile zzac zzQM;
  private volatile boolean zzQN;
  
  protected zzi$zza(zzi paramzzi) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject1 = "AnalyticsServiceConnection.onServiceConnected";
    zzx.zzcD((String)localObject1);
    if (paramIBinder == null) {}
    for (;;)
    {
      Object localObject4;
      try
      {
        localObject1 = this.zzQL;
        localObject3 = "Service connected with null binder";
        ((zzi)localObject1).zzbh((String)localObject3);
        try
        {
          return;
        }
        finally {}
        localObject1 = null;
        try
        {
          localObject3 = paramIBinder.getInterfaceDescriptor();
          localObject5 = "com.google.android.gms.analytics.internal.IAnalyticsService";
          boolean bool1 = ((String)localObject5).equals(localObject3);
          if (!bool1) {
            continue;
          }
          localObject1 = zzac.zza.zzaf(paramIBinder);
          localObject3 = this.zzQL;
          localObject5 = "Bound to IAnalyticsService interface";
          ((zzi)localObject3).zzbd((String)localObject5);
        }
        catch (RemoteException localRemoteException)
        {
          String str;
          localObject4 = this.zzQL;
          localObject5 = "Service connect failed to get IAnalyticsService";
          ((zzi)localObject4).zzbh((String)localObject5);
          continue;
        }
        if (localObject1 != null) {}
      }
      finally
      {
        Object localObject3;
        notifyAll();
      }
      try
      {
        localObject1 = zzb.zzrP();
        localObject3 = this.zzQL;
        localObject3 = ((zzi)localObject3).getContext();
        localObject5 = this.zzQL;
        localObject5 = zzi.zza((zzi)localObject5);
        ((zzb)localObject1).zza((Context)localObject3, (ServiceConnection)localObject5);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        boolean bool2;
        continue;
      }
      notifyAll();
      continue;
      Object localObject5 = this.zzQL;
      str = "Got binder with a wrong descriptor";
      ((zzi)localObject5).zze(str, localObject3);
      continue;
      bool2 = this.zzQN;
      if (!bool2)
      {
        localObject4 = this.zzQL;
        localObject5 = "onServiceConnected received after the timeout limit";
        ((zzi)localObject4).zzbg((String)localObject5);
        localObject4 = this.zzQL;
        localObject4 = ((zzi)localObject4).zzjo();
        localObject5 = new com/google/android/gms/analytics/internal/zzi$zza$1;
        ((zzi.zza.1)localObject5).<init>(this, localzzac);
        ((zzg)localObject4).zzf((Runnable)localObject5);
      }
      else
      {
        this.zzQM = localzzac;
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzx.zzcD("AnalyticsServiceConnection.onServiceDisconnected");
    zzg localzzg = this.zzQL.zzjo();
    zzi.zza.2 local2 = new com/google/android/gms/analytics/internal/zzi$zza$2;
    local2.<init>(this, paramComponentName);
    localzzg.zzf(local2);
  }
  
  public zzac zzjK()
  {
    Object localObject1 = null;
    this.zzQL.zzjk();
    localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>("com.google.android.gms.analytics.service.START");
    Object localObject4 = new android/content/ComponentName;
    ((ComponentName)localObject4).<init>("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService");
    ((Intent)localObject3).setComponent((ComponentName)localObject4);
    localObject4 = this.zzQL.getContext();
    Object localObject5 = ((Context)localObject4).getPackageName();
    ((Intent)localObject3).putExtra("app_package_name", (String)localObject5);
    Object localObject6 = zzb.zzrP();
    boolean bool1 = false;
    localObject5 = null;
    for (;;)
    {
      long l;
      try
      {
        this.zzQM = null;
        bool1 = true;
        this.zzQN = bool1;
        localObject5 = this.zzQL;
        localObject5 = zzi.zza((zzi)localObject5);
        int i = 129;
        bool2 = ((zzb)localObject6).zza((Context)localObject4, (Intent)localObject3, (ServiceConnection)localObject5, i);
        localObject4 = this.zzQL;
        localObject6 = "Bind to service requested";
        localObject5 = Boolean.valueOf(bool2);
        ((zzi)localObject4).zza((String)localObject6, localObject5);
        if (!bool2)
        {
          bool2 = false;
          localObject3 = null;
          this.zzQN = false;
          return (zzac)localObject1;
        }
      }
      finally {}
      try
      {
        localObject1 = this.zzQL;
        localObject1 = ((zzi)localObject1).zzjn();
        l = ((zzr)localObject1).zzkN();
        wait(l);
      }
      catch (InterruptedException localInterruptedException)
      {
        zzi localzzi = this.zzQL;
        localObject3 = "Wait for service connect was interrupted";
        localzzi.zzbg((String)localObject3);
        continue;
      }
      localObject1 = null;
      this.zzQN = false;
      localObject1 = this.zzQM;
      boolean bool2 = false;
      localObject3 = null;
      this.zzQM = null;
      if (localObject1 == null)
      {
        localObject3 = this.zzQL;
        localObject4 = "Successfully bound to service but never got onServiceConnected callback";
        ((zzi)localObject3).zzbh((String)localObject4);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */