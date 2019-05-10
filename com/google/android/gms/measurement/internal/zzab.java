package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.AppMeasurement.zza;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

public class zzab
  extends zzz
{
  private zzab.zza zzaYD;
  private AppMeasurement.zza zzaYE;
  private boolean zzaYF;
  
  protected zzab(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private void zzDm()
  {
    try
    {
      Object localObject = zzDn();
      localObject = Class.forName((String)localObject);
      zzh((Class)localObject);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        zzp.zza localzza = zzAo().zzCI();
        String str = "Tag Manager is not found and thus will not be used";
        localzza.zzfg(str);
      }
    }
  }
  
  private String zzDn()
  {
    return "com.google.android.gms.tagmanager.TagManagerService";
  }
  
  private void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    long l = zzjl().currentTimeMillis();
    zza(paramString1, paramString2, paramBundle, paramBoolean, paramString3, l);
  }
  
  private void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, String paramString3, long paramLong)
  {
    zzx.zzcM(paramString1);
    Object localObject1 = zzCk();
    ((zzaj)localObject1).zzfr(paramString2);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject2;
    if (paramBundle != null)
    {
      boolean bool1 = false;
      localObject1 = null;
      int j = zzCp().zzBA();
      Iterator localIterator = paramBundle.keySet().iterator();
      boolean bool2 = false;
      bool1 = localIterator.hasNext();
      if (bool1)
      {
        localObject1 = (String)localIterator.next();
        localObject2 = zzCk();
        ((zzaj)localObject2).zzft((String)localObject1);
        boolean bool3 = zzaj.zzfq((String)localObject1);
        int m;
        if (bool3)
        {
          m = bool2 + true;
          if (m > j) {
            break label228;
          }
        }
        label228:
        for (bool2 = true;; bool2 = false)
        {
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Event can't contain more then ").append(j);
          String str = " params";
          localObject3 = str;
          zzx.zzb(bool2, localObject3);
          bool2 = m;
          localObject2 = zzCk();
          localObject3 = paramBundle.get((String)localObject1);
          localObject2 = ((zzaj)localObject2).zzk((String)localObject1, localObject3);
          if (localObject2 == null) {
            break;
          }
          localObject3 = zzCk();
          ((zzaj)localObject3).zza(localBundle, (String)localObject1, localObject2);
          break;
        }
      }
    }
    localObject1 = zzCp();
    int i = ((zzd)localObject1).zzBD();
    int k = paramString1.length();
    if (k <= i) {}
    for (localObject1 = paramString1;; localObject1 = paramString1.substring(0, i))
    {
      localBundle.putString("_o", (String)localObject1);
      localObject2 = paramString1;
      zza(paramString1, paramString2, paramLong, localBundle, paramBoolean, paramString3);
      return;
      k = 0;
    }
  }
  
  private void zza(String paramString1, String paramString2, Object paramObject, long paramLong)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzjk();
    zzjj();
    zzjv();
    Object localObject1 = zzCo();
    boolean bool = ((zzt)localObject1).zzAr();
    Object localObject2;
    if (!bool)
    {
      localObject1 = zzAo().zzCJ();
      localObject2 = "User property not set since app measurement is disabled";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaTV;
      bool = ((zzw)localObject1).zzCS();
      if (bool)
      {
        zzAo().zzCJ().zze("Setting user property (FE)", paramString2, paramObject);
        localObject1 = new com/google/android/gms/measurement/internal/UserAttributeParcel;
        localObject2 = paramString2;
        ((UserAttributeParcel)localObject1).<init>(paramString2, paramLong, paramObject, paramString1);
        localObject2 = zzCi();
        ((zzac)localObject2).zza((UserAttributeParcel)localObject1);
      }
    }
  }
  
  private void zzas(boolean paramBoolean)
  {
    zzjk();
    zzjj();
    zzjv();
    zzp.zza localzza = zzAo().zzCJ();
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localzza.zzj("Setting app measurement enabled (FE)", localBoolean);
    zzCo().setMeasurementEnabled(paramBoolean);
    zzCi().zzDo();
  }
  
  private void zzb(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzx.zzz(paramBundle);
    zzjk();
    zzjv();
    Object localObject1 = zzCo();
    boolean bool = ((zzt)localObject1).zzAr();
    Object localObject2;
    if (!bool)
    {
      localObject1 = zzAo().zzCJ();
      localObject2 = "Event not sent since app measurement is disabled";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      bool = this.zzaYF;
      if (!bool)
      {
        bool = true;
        this.zzaYF = bool;
        zzDm();
      }
      Object localObject3;
      if (paramBoolean)
      {
        localObject1 = this.zzaYE;
        if (localObject1 != null)
        {
          bool = zzaj.zzfv(paramString2);
          if (!bool)
          {
            zzAo().zzCJ().zze("Passing event to registered event handler (FE)", paramString2, paramBundle);
            localObject1 = this.zzaYE;
            localObject2 = paramString1;
            localObject3 = paramString2;
            ((AppMeasurement.zza)localObject1).zza(paramString1, paramString2, paramBundle, paramLong);
            continue;
          }
        }
      }
      localObject1 = this.zzaTV;
      bool = ((zzw)localObject1).zzCS();
      if (bool)
      {
        zzAo().zzCJ().zze("Logging event (FE)", paramString2, paramBundle);
        localObject1 = new com/google/android/gms/measurement/internal/EventParcel;
        localObject3 = new com/google/android/gms/measurement/internal/EventParams;
        ((EventParams)localObject3).<init>(paramBundle);
        localObject2 = paramString2;
        ((EventParcel)localObject1).<init>(paramString2, (EventParams)localObject3, paramString1, paramLong);
        localObject2 = zzCi();
        ((zzac)localObject2).zzb((EventParcel)localObject1, paramString3);
      }
    }
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzjv();
    zzjj();
    zzv localzzv = zzCn();
    zzab.1 local1 = new com/google/android/gms/measurement/internal/zzab$1;
    local1.<init>(this, paramBoolean);
    localzzv.zzg(local1);
  }
  
  public void zzDk()
  {
    Object localObject1 = getContext().getApplicationContext();
    boolean bool = localObject1 instanceof Application;
    if (bool)
    {
      localObject1 = (Application)getContext().getApplicationContext();
      Object localObject2 = this.zzaYD;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/measurement/internal/zzab$zza;
        ((zzab.zza)localObject2).<init>(this, null);
        this.zzaYD = ((zzab.zza)localObject2);
      }
      localObject2 = this.zzaYD;
      ((Application)localObject1).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      localObject2 = this.zzaYD;
      ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
      localObject1 = zzAo().zzCK();
      localObject2 = "Registered activity lifecycle callback";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
  }
  
  public void zzDl()
  {
    zzjk();
    zzjj();
    zzjv();
    Object localObject1 = this.zzaTV;
    boolean bool1 = ((zzw)localObject1).zzCS();
    if (!bool1) {}
    for (;;)
    {
      return;
      zzCi().zzDl();
      localObject1 = zzCo().zzCQ();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        Object localObject2 = zzCh().zzCy();
        bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          ((Bundle)localObject2).putString("_po", (String)localObject1);
          localObject1 = "auto";
          String str = "_ou";
          zze((String)localObject1, str, (Bundle)localObject2);
        }
      }
    }
  }
  
  protected void zza(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean, String paramString3)
  {
    zzx.zzz(paramBundle);
    zzv localzzv = zzCn();
    zzab.2 local2 = new com/google/android/gms/measurement/internal/zzab$2;
    local2.<init>(this, paramString1, paramString2, paramLong, paramBundle, paramBoolean, paramString3);
    localzzv.zzg(local2);
  }
  
  void zza(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    zzv localzzv = zzCn();
    zzab.3 local3 = new com/google/android/gms/measurement/internal/zzab$3;
    local3.<init>(this, paramString1, paramString2, paramObject, paramLong);
    localzzv.zzg(local3);
  }
  
  public void zza(String paramString1, String paramString2, Object paramObject)
  {
    zzx.zzcM(paramString1);
    long l = zzjl().currentTimeMillis();
    zzaj localzzaj = zzCk();
    localzzaj.zzfs(paramString2);
    Object localObject;
    if (paramObject != null)
    {
      zzCk().zzl(paramString2, paramObject);
      localzzaj = zzCk();
      localObject = localzzaj.zzm(paramString2, paramObject);
      if (localObject != null) {
        zza(paramString1, paramString2, l, localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = null;
      zza(paramString1, paramString2, l, null);
    }
  }
  
  public void zze(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzjj();
    zza(paramString1, paramString2, paramBundle, true, null);
  }
  
  public void zzh(Class paramClass)
  {
    Object localObject1 = "initialize";
    int i = 1;
    try
    {
      localObject2 = new Class[i];
      int j = 0;
      localObject3 = null;
      Class localClass = Context.class;
      localObject2[0] = localClass;
      localObject1 = paramClass.getDeclaredMethod((String)localObject1, (Class[])localObject2);
      i = 0;
      localObject2 = null;
      j = 1;
      localObject3 = new Object[j];
      localClass = null;
      Context localContext = getContext();
      localObject3[0] = localContext;
      ((Method)localObject1).invoke(null, (Object[])localObject3);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = zzAo().zzCF();
        Object localObject3 = "Failed to invoke Tag Manager's initialize() method";
        ((zzp.zza)localObject2).zzj((String)localObject3, localException);
      }
    }
  }
  
  protected void zziJ() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */