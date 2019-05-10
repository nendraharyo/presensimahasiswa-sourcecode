package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.AppMeasurementService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzac
  extends zzz
{
  private final zzac.zza zzaYN;
  private zzm zzaYO;
  private Boolean zzaYP;
  private final zzf zzaYQ;
  private final zzaf zzaYR;
  private final List zzaYS;
  private final zzf zzaYT;
  
  protected zzac(zzw paramzzw)
  {
    super(paramzzw);
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaYS = ((List)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzaf;
    zzmq localzzmq = paramzzw.zzjl();
    ((zzaf)localObject).<init>(localzzmq);
    this.zzaYR = ((zzaf)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzac$zza;
    ((zzac.zza)localObject).<init>(this);
    this.zzaYN = ((zzac.zza)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzac$1;
    ((zzac.1)localObject).<init>(this, paramzzw);
    this.zzaYQ = ((zzf)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzac$2;
    ((zzac.2)localObject).<init>(this, paramzzw);
    this.zzaYT = ((zzf)localObject);
  }
  
  private void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzjk();
    Object localObject = this.zzaYO;
    if (localObject != null)
    {
      this.zzaYO = null;
      localObject = zzAo().zzCK();
      String str = "Disconnected from device MeasurementService";
      ((zzp.zza)localObject).zzj(str, paramComponentName);
      zzDr();
    }
  }
  
  private boolean zzDp()
  {
    Object localObject = getContext().getPackageManager();
    Intent localIntent = new android/content/Intent;
    Context localContext = getContext();
    Class localClass = AppMeasurementService.class;
    localIntent.<init>(localContext, localClass);
    int i = 65536;
    localObject = ((PackageManager)localObject).queryIntentServices(localIntent, i);
    int j;
    if (localObject != null)
    {
      j = ((List)localObject).size();
      if (j > 0) {
        j = 1;
      }
    }
    for (;;)
    {
      return j;
      int k = 0;
      localObject = null;
    }
  }
  
  private boolean zzDq()
  {
    boolean bool1 = true;
    zzp.zza localzza1 = null;
    zzjk();
    zzjv();
    Object localObject = zzCp();
    boolean bool2 = ((zzd)localObject).zzkr();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      zzAo().zzCK().zzfg("Checking service availability");
      localObject = zzc.zzoK();
      Context localContext = getContext();
      int i = ((zzc)localObject).isGooglePlayServicesAvailable(localContext);
      zzp.zza localzza2;
      switch (i)
      {
      default: 
        bool1 = false;
        localzza2 = null;
        break;
      case 0: 
        localzza1 = zzAo().zzCK();
        localObject = "Service available";
        localzza1.zzfg((String)localObject);
        break;
      case 1: 
        localzza2 = zzAo().zzCK();
        localObject = "Service missing";
        localzza2.zzfg((String)localObject);
        bool1 = false;
        localzza2 = null;
        break;
      case 18: 
        localzza1 = zzAo().zzCK();
        localObject = "Service updating";
        localzza1.zzfg((String)localObject);
        break;
      case 2: 
        localzza2 = zzAo().zzCK();
        localObject = "Service version update required";
        localzza2.zzfg((String)localObject);
        bool1 = false;
        localzza2 = null;
        break;
      case 3: 
        localzza2 = zzAo().zzCK();
        localObject = "Service disabled";
        localzza2.zzfg((String)localObject);
        bool1 = false;
        localzza2 = null;
        break;
      case 9: 
        localzza2 = zzAo().zzCK();
        localObject = "Service invalid";
        localzza2.zzfg((String)localObject);
        bool1 = false;
        localzza2 = null;
      }
    }
  }
  
  private void zzDr()
  {
    zzjk();
    zzjX();
  }
  
  private void zzDs()
  {
    zzjk();
    Object localObject1 = zzAo().zzCK();
    int i = this.zzaYS.size();
    Object localObject2 = Integer.valueOf(i);
    ((zzp.zza)localObject1).zzj("Processing queued up service tasks", localObject2);
    localObject1 = this.zzaYS;
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Runnable)localIterator.next();
      localObject2 = zzCn();
      ((zzv)localObject2).zzg((Runnable)localObject1);
    }
    this.zzaYS.clear();
    this.zzaYT.cancel();
  }
  
  private void zza(zzm paramzzm)
  {
    zzjk();
    com.google.android.gms.common.internal.zzx.zzz(paramzzm);
    this.zzaYO = paramzzm;
    zzjI();
    zzDs();
  }
  
  private void zzi(Runnable paramRunnable)
  {
    zzjk();
    boolean bool = isConnected();
    if (bool) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      Object localObject = this.zzaYS;
      long l1 = ((List)localObject).size();
      zzd localzzd = zzCp();
      long l2 = localzzd.zzBS();
      bool = l1 < l2;
      if (!bool)
      {
        localObject = zzAo().zzCE();
        String str = "Discarding data. Max runnable queue size reached";
        ((zzp.zza)localObject).zzfg(str);
      }
      else
      {
        this.zzaYS.add(paramRunnable);
        localObject = this.zzaTV;
        bool = ((zzw)localObject).zzCZ();
        if (!bool)
        {
          localObject = this.zzaYT;
          l2 = 60000L;
          ((zzf)localObject).zzt(l2);
        }
        zzjX();
      }
    }
  }
  
  private void zzjI()
  {
    zzjk();
    this.zzaYR.start();
    Object localObject = this.zzaTV;
    boolean bool = ((zzw)localObject).zzCZ();
    if (!bool)
    {
      localObject = this.zzaYQ;
      zzd localzzd = zzCp();
      long l = localzzd.zzkM();
      ((zzf)localObject).zzt(l);
    }
  }
  
  private void zzjJ()
  {
    zzjk();
    boolean bool = isConnected();
    if (!bool) {}
    for (;;)
    {
      return;
      zzp.zza localzza = zzAo().zzCK();
      String str = "Inactivity, disconnecting from AppMeasurementService";
      localzza.zzfg(str);
      disconnect();
    }
  }
  
  private void zzjX()
  {
    zzjk();
    zzjv();
    boolean bool1 = isConnected();
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.zzaYP;
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = zzCo().zzCP();
        this.zzaYP = ((Boolean)localObject1);
        localObject1 = this.zzaYP;
        if (localObject1 == null)
        {
          zzAo().zzCK().zzfg("State of service unknown");
          bool1 = zzDq();
          localObject1 = Boolean.valueOf(bool1);
          this.zzaYP = ((Boolean)localObject1);
          localObject1 = zzCo();
          localObject2 = this.zzaYP;
          boolean bool2 = ((Boolean)localObject2).booleanValue();
          ((zzt)localObject1).zzar(bool2);
        }
      }
      localObject1 = this.zzaYP;
      bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1)
      {
        localObject1 = zzAo().zzCK();
        localObject2 = "Using measurement service";
        ((zzp.zza)localObject1).zzfg((String)localObject2);
        localObject1 = this.zzaYN;
        ((zzac.zza)localObject1).zzDt();
      }
      else
      {
        bool1 = zzDp();
        if (bool1)
        {
          localObject1 = this.zzaTV;
          bool1 = ((zzw)localObject1).zzCZ();
          if (!bool1)
          {
            zzAo().zzCK().zzfg("Using local app measurement service");
            localObject1 = new android/content/Intent;
            ((Intent)localObject1).<init>("com.google.android.gms.measurement.START");
            localObject2 = new android/content/ComponentName;
            Context localContext = getContext();
            Class localClass = AppMeasurementService.class;
            ((ComponentName)localObject2).<init>(localContext, localClass);
            ((Intent)localObject1).setComponent((ComponentName)localObject2);
            localObject2 = this.zzaYN;
            ((zzac.zza)localObject2).zzz((Intent)localObject1);
            continue;
          }
        }
        localObject1 = zzCp();
        bool1 = ((zzd)localObject1).zzks();
        if (bool1)
        {
          zzAo().zzCK().zzfg("Using direct local measurement implementation");
          localObject1 = new com/google/android/gms/measurement/internal/zzx;
          localObject2 = this.zzaTV;
          boolean bool3 = true;
          ((zzx)localObject1).<init>((zzw)localObject2, bool3);
          zza((zzm)localObject1);
        }
        else
        {
          localObject1 = zzAo().zzCE();
          localObject2 = "Not in main process. Unable to use local measurement implementation. Please register the AppMeasurementService service in the app manifest";
          ((zzp.zza)localObject1).zzfg((String)localObject2);
        }
      }
    }
  }
  
  public void disconnect()
  {
    zzjk();
    zzjv();
    try
    {
      zzb localzzb = zzb.zzrP();
      Context localContext = getContext();
      zzac.zza localzza = this.zzaYN;
      localzzb.zza(localContext, localzza);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    this.zzaYO = null;
  }
  
  public boolean isConnected()
  {
    zzjk();
    zzjv();
    zzm localzzm = this.zzaYO;
    boolean bool;
    if (localzzm != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzm = null;
    }
  }
  
  protected void zzDl()
  {
    zzjk();
    zzjv();
    zzac.6 local6 = new com/google/android/gms/measurement/internal/zzac$6;
    local6.<init>(this);
    zzi(local6);
  }
  
  protected void zzDo()
  {
    zzjk();
    zzjv();
    zzac.3 local3 = new com/google/android/gms/measurement/internal/zzac$3;
    local3.<init>(this);
    zzi(local3);
  }
  
  protected void zza(UserAttributeParcel paramUserAttributeParcel)
  {
    zzjk();
    zzjv();
    zzac.5 local5 = new com/google/android/gms/measurement/internal/zzac$5;
    local5.<init>(this, paramUserAttributeParcel);
    zzi(local5);
  }
  
  protected void zzb(EventParcel paramEventParcel, String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    zzjk();
    zzjv();
    zzac.4 local4 = new com/google/android/gms/measurement/internal/zzac$4;
    local4.<init>(this, paramString, paramEventParcel);
    zzi(local4);
  }
  
  protected void zziJ() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */