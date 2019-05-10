package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzy;
import com.google.android.gms.analytics.internal.zzy.zza;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class GoogleAnalytics
  extends zza
{
  private static List zzPe;
  private boolean zzPf;
  private Set zzPg;
  private boolean zzPh;
  private boolean zzPi;
  private volatile boolean zzPj;
  private boolean zzPk;
  private boolean zzqA;
  
  static
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    zzPe = localArrayList;
  }
  
  public GoogleAnalytics(zzf paramzzf)
  {
    super(paramzzf);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzPg = localHashSet;
  }
  
  public static GoogleAnalytics getInstance(Context paramContext)
  {
    return zzf.zzaa(paramContext).zzjz();
  }
  
  public static void zziF()
  {
    synchronized (GoogleAnalytics.class)
    {
      Object localObject1 = zzPe;
      if (localObject1 == null) {
        break label69;
      }
      localObject1 = zzPe;
      Iterator localIterator = ((List)localObject1).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (Runnable)localObject1;
        ((Runnable)localObject1).run();
      }
    }
    boolean bool = false;
    Object localObject3 = null;
    zzPe = null;
    label69:
  }
  
  private zzb zziH()
  {
    return zzix().zziH();
  }
  
  private zzan zziI()
  {
    return zzix().zziI();
  }
  
  public void dispatchLocalHits()
  {
    zziH().zzjd();
  }
  
  public void enableAutoActivityReports(Application paramApplication)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      boolean bool = this.zzPh;
      if (!bool)
      {
        GoogleAnalytics.zzb localzzb = new com/google/android/gms/analytics/GoogleAnalytics$zzb;
        localzzb.<init>(this);
        paramApplication.registerActivityLifecycleCallbacks(localzzb);
        bool = true;
        this.zzPh = bool;
      }
    }
  }
  
  public boolean getAppOptOut()
  {
    return this.zzPj;
  }
  
  public String getClientId()
  {
    zzx.zzcE("getClientId can not be called from the main thread");
    return zzix().zzjC().zzkk();
  }
  
  public Logger getLogger()
  {
    return zzae.getLogger();
  }
  
  public boolean isDryRunEnabled()
  {
    return this.zzPi;
  }
  
  public boolean isInitialized()
  {
    boolean bool = this.zzqA;
    if (bool)
    {
      bool = this.zzPf;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Tracker newTracker(int paramInt)
  {
    try
    {
      Tracker localTracker = new com/google/android/gms/analytics/Tracker;
      Object localObject1 = zzix();
      zzf localzzf = null;
      localTracker.<init>((zzf)localObject1, null, null);
      if (paramInt > 0)
      {
        localObject1 = new com/google/android/gms/analytics/internal/zzak;
        localzzf = zzix();
        ((zzak)localObject1).<init>(localzzf);
        localObject1 = ((zzak)localObject1).zzah(paramInt);
        localObject1 = (zzal)localObject1;
        if (localObject1 != null) {
          localTracker.zza((zzal)localObject1);
        }
      }
      localTracker.zza();
      return localTracker;
    }
    finally {}
  }
  
  public Tracker newTracker(String paramString)
  {
    try
    {
      Tracker localTracker = new com/google/android/gms/analytics/Tracker;
      zzf localzzf = zzix();
      localTracker.<init>(localzzf, paramString, null);
      localTracker.zza();
      return localTracker;
    }
    finally {}
  }
  
  public void reportActivityStart(Activity paramActivity)
  {
    boolean bool = this.zzPh;
    if (!bool) {
      zzj(paramActivity);
    }
  }
  
  public void reportActivityStop(Activity paramActivity)
  {
    boolean bool = this.zzPh;
    if (!bool) {
      zzk(paramActivity);
    }
  }
  
  public void setAppOptOut(boolean paramBoolean)
  {
    this.zzPj = paramBoolean;
    boolean bool = this.zzPj;
    if (bool)
    {
      zzb localzzb = zziH();
      localzzb.zzjc();
    }
  }
  
  public void setDryRun(boolean paramBoolean)
  {
    this.zzPi = paramBoolean;
  }
  
  public void setLocalDispatchPeriod(int paramInt)
  {
    zziH().setLocalDispatchPeriod(paramInt);
  }
  
  public void setLogger(Logger paramLogger)
  {
    zzae.setLogger(paramLogger);
    boolean bool = this.zzPk;
    if (!bool)
    {
      String str = (String)zzy.zzRL.get();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = ((StringBuilder)localObject1).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
      localObject1 = (String)zzy.zzRL.get();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = " DEBUG";
      localObject1 = (String)localObject2;
      Log.i(str, (String)localObject1);
      bool = true;
      this.zzPk = bool;
    }
  }
  
  public void zza()
  {
    zziE();
    this.zzqA = true;
  }
  
  void zza(GoogleAnalytics.zza paramzza)
  {
    this.zzPg.add(paramzza);
    Object localObject = zzix().getContext();
    boolean bool = localObject instanceof Application;
    if (bool)
    {
      localObject = (Application)localObject;
      enableAutoActivityReports((Application)localObject);
    }
  }
  
  void zzb(GoogleAnalytics.zza paramzza)
  {
    this.zzPg.remove(paramzza);
  }
  
  void zziE()
  {
    zzan localzzan = zziI();
    boolean bool = localzzan.zzlj();
    Logger localLogger;
    if (bool)
    {
      localLogger = getLogger();
      int i = localzzan.getLogLevel();
      localLogger.setLogLevel(i);
    }
    bool = localzzan.zzln();
    if (bool)
    {
      bool = localzzan.zzlo();
      setDryRun(bool);
    }
    bool = localzzan.zzlj();
    if (bool)
    {
      localLogger = zzae.getLogger();
      if (localLogger != null)
      {
        int j = localzzan.getLogLevel();
        localLogger.setLogLevel(j);
      }
    }
  }
  
  void zziG()
  {
    zziH().zzje();
  }
  
  void zzj(Activity paramActivity)
  {
    Object localObject = this.zzPg;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (GoogleAnalytics.zza)localIterator.next();
      ((GoogleAnalytics.zza)localObject).zzl(paramActivity);
    }
  }
  
  void zzk(Activity paramActivity)
  {
    Object localObject = this.zzPg;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (GoogleAnalytics.zza)localIterator.next();
      ((GoogleAnalytics.zza)localObject).zzm(paramActivity);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\GoogleAnalytics.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */