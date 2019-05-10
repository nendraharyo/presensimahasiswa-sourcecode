package com.google.android.gms.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzps;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class zzg
{
  private static volatile zzg zzaUv;
  private final Context mContext;
  private volatile zzpq zzQX;
  private final List zzaUw;
  private final zzb zzaUx;
  private final zzg.zza zzaUy;
  private Thread.UncaughtExceptionHandler zzaUz;
  
  zzg(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    zzx.zzz(localObject);
    this.mContext = ((Context)localObject);
    localObject = new com/google/android/gms/measurement/zzg$zza;
    ((zzg.zza)localObject).<init>(this);
    this.zzaUy = ((zzg.zza)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.zzaUw = ((List)localObject);
    localObject = new com/google/android/gms/measurement/zzb;
    ((zzb)localObject).<init>();
    this.zzaUx = ((zzb)localObject);
  }
  
  public static zzg zzaS(Context paramContext)
  {
    zzx.zzz(paramContext);
    zzg localzzg = zzaUv;
    if (localzzg == null) {}
    synchronized (zzg.class)
    {
      localzzg = zzaUv;
      if (localzzg == null)
      {
        localzzg = new com/google/android/gms/measurement/zzg;
        localzzg.<init>(paramContext);
        zzaUv = localzzg;
      }
      return zzaUv;
    }
  }
  
  private void zzb(zzc paramzzc)
  {
    zzx.zzcE("deliver should be called from worker thread");
    boolean bool1 = paramzzc.zzAz();
    Object localObject1 = "Measurement must be submitted";
    zzx.zzb(bool1, localObject1);
    Object localObject2 = paramzzc.zzAw();
    boolean bool2 = ((List)localObject2).isEmpty();
    if (bool2) {
      return;
    }
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    Iterator localIterator = ((List)localObject2).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (zzi)localIterator.next();
      Uri localUri = ((zzi)localObject2).zziA();
      boolean bool3 = ((Set)localObject1).contains(localUri);
      if (!bool3)
      {
        ((Set)localObject1).add(localUri);
        ((zzi)localObject2).zzb(paramzzc);
      }
    }
  }
  
  public static void zzjk()
  {
    Object localObject = Thread.currentThread();
    boolean bool = localObject instanceof zzg.zzc;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call expected from worker thread");
      throw ((Throwable)localObject);
    }
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public zzpq zzAH()
  {
    Object localObject1 = this.zzQX;
    if (localObject1 == null) {}
    String str2;
    try
    {
      localObject1 = this.zzQX;
      zzpq localzzpq;
      Object localObject3;
      if (localObject1 == null)
      {
        localzzpq = new com/google/android/gms/internal/zzpq;
        localzzpq.<init>();
        localObject1 = this.mContext;
        localObject3 = ((Context)localObject1).getPackageManager();
        localObject1 = this.mContext;
        str2 = ((Context)localObject1).getPackageName();
        localzzpq.setAppId(str2);
        localObject1 = ((PackageManager)localObject3).getInstallerPackageName(str2);
        localzzpq.setAppInstallerId((String)localObject1);
        localObject1 = null;
      }
      try
      {
        localObject4 = this.mContext;
        localObject4 = ((Context)localObject4).getPackageName();
        boolean bool = false;
        localObject5 = null;
        localObject4 = ((PackageManager)localObject3).getPackageInfo((String)localObject4, 0);
        if (localObject4 != null)
        {
          localObject5 = ((PackageInfo)localObject4).applicationInfo;
          localObject3 = ((PackageManager)localObject3).getApplicationLabel((ApplicationInfo)localObject5);
          bool = TextUtils.isEmpty((CharSequence)localObject3);
          if (!bool) {
            str2 = ((CharSequence)localObject3).toString();
          }
          localObject1 = ((PackageInfo)localObject4).versionName;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          String str1 = "GAv4";
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          Object localObject5 = "Error retrieving package info: appName set to ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).append(str2);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.e(str1, (String)localObject4);
        }
      }
      localzzpq.setAppName(str2);
      localzzpq.setAppVersion((String)localObject1);
      this.zzQX = localzzpq;
      return this.zzQX;
    }
    finally {}
  }
  
  public zzps zzAI()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    zzps localzzps = new com/google/android/gms/internal/zzps;
    localzzps.<init>();
    String str = zzam.zza(Locale.getDefault());
    localzzps.setLanguage(str);
    int i = localDisplayMetrics.widthPixels;
    localzzps.zziB(i);
    int j = localDisplayMetrics.heightPixels;
    localzzps.zziC(j);
    return localzzps;
  }
  
  public void zza(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.zzaUz = paramUncaughtExceptionHandler;
  }
  
  public Future zzc(Callable paramCallable)
  {
    zzx.zzz(paramCallable);
    Object localObject = Thread.currentThread();
    boolean bool = localObject instanceof zzg.zzc;
    if (bool)
    {
      localObject = new java/util/concurrent/FutureTask;
      ((FutureTask)localObject).<init>(paramCallable);
      ((FutureTask)localObject).run();
    }
    for (;;)
    {
      return (Future)localObject;
      localObject = this.zzaUy.submit(paramCallable);
    }
  }
  
  void zze(zzc paramzzc)
  {
    boolean bool = paramzzc.zzAD();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Measurement prototype can't be submitted");
      throw ((Throwable)localObject);
    }
    bool = paramzzc.zzAz();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Measurement can only be submitted once");
      throw ((Throwable)localObject);
    }
    Object localObject = paramzzc.zzAu();
    ((zzc)localObject).zzAA();
    zzg.zza localzza = this.zzaUy;
    zzg.1 local1 = new com/google/android/gms/measurement/zzg$1;
    local1.<init>(this, (zzc)localObject);
    localzza.execute(local1);
  }
  
  public void zzf(Runnable paramRunnable)
  {
    zzx.zzz(paramRunnable);
    this.zzaUy.submit(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */