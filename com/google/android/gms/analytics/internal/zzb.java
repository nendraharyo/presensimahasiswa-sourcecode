package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzb
  extends zzd
{
  private final zzl zzQb;
  
  public zzb(zzf paramzzf, zzg paramzzg)
  {
    super(paramzzf);
    zzx.zzz(paramzzg);
    zzl localzzl = paramzzg.zzj(paramzzf);
    this.zzQb = localzzl;
  }
  
  void onServiceConnected()
  {
    zzjk();
    this.zzQb.onServiceConnected();
  }
  
  public void setLocalDispatchPeriod(int paramInt)
  {
    zzjv();
    Object localObject = Integer.valueOf(paramInt);
    zzb("setLocalDispatchPeriod (sec)", localObject);
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    localObject = new com/google/android/gms/analytics/internal/zzb$1;
    ((zzb.1)localObject).<init>(this, paramInt);
    localzzg.zzf((Runnable)localObject);
  }
  
  public void start()
  {
    this.zzQb.start();
  }
  
  public void zzJ(boolean paramBoolean)
  {
    Object localObject = Boolean.valueOf(paramBoolean);
    zza("Network connectivity status changed", localObject);
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    localObject = new com/google/android/gms/analytics/internal/zzb$2;
    ((zzb.2)localObject).<init>(this, paramBoolean);
    localzzg.zzf((Runnable)localObject);
  }
  
  public long zza(zzh paramzzh)
  {
    zzjv();
    zzx.zzz(paramzzh);
    zzjk();
    zzl localzzl1 = this.zzQb;
    boolean bool1 = true;
    long l1 = localzzl1.zza(paramzzh, bool1);
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (!bool2)
    {
      zzl localzzl2 = this.zzQb;
      localzzl2.zzc(paramzzh);
    }
    return l1;
  }
  
  public void zza(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    zzjv();
    zzb("Hit delivery requested", paramzzab);
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    zzb.4 local4 = new com/google/android/gms/analytics/internal/zzb$4;
    local4.<init>(this, paramzzab);
    localzzg.zzf(local4);
  }
  
  public void zza(zzw paramzzw)
  {
    zzjv();
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    zzb.6 local6 = new com/google/android/gms/analytics/internal/zzb$6;
    local6.<init>(this, paramzzw);
    localzzg.zzf(local6);
  }
  
  public void zza(String paramString, Runnable paramRunnable)
  {
    zzx.zzh(paramString, "campaign param can't be empty");
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    zzb.3 local3 = new com/google/android/gms/analytics/internal/zzb$3;
    local3.<init>(this, paramString, paramRunnable);
    localzzg.zzf(local3);
  }
  
  protected void zziJ()
  {
    this.zzQb.zza();
  }
  
  public void zzjc()
  {
    zzjv();
    zzjj();
    com.google.android.gms.measurement.zzg localzzg = zzjo();
    zzb.5 local5 = new com/google/android/gms/analytics/internal/zzb$5;
    local5.<init>(this);
    localzzg.zzf(local5);
  }
  
  public void zzjd()
  {
    zzjv();
    Context localContext = getContext();
    boolean bool = AnalyticsReceiver.zzY(localContext);
    if (bool)
    {
      bool = AnalyticsService.zzZ(localContext);
      if (bool)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(localContext, AnalyticsService.class);
        String str = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        localIntent.setAction(str);
        localContext.startService(localIntent);
      }
    }
    for (;;)
    {
      return;
      localContext = null;
      zza(null);
    }
  }
  
  public boolean zzje()
  {
    boolean bool = false;
    zzjv();
    Object localObject1 = zzjo();
    localObject2 = new com/google/android/gms/analytics/internal/zzb$7;
    ((zzb.7)localObject2).<init>(this);
    localObject1 = ((com.google.android.gms.measurement.zzg)localObject1).zzc((Callable)localObject2);
    long l = 4;
    try
    {
      TimeUnit localTimeUnit = TimeUnit.SECONDS;
      ((Future)localObject1).get(l, localTimeUnit);
      bool = true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject2 = "syncDispatchLocalHits interrupted";
        zzd((String)localObject2, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        localObject2 = "syncDispatchLocalHits failed";
        zze((String)localObject2, localExecutionException);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        localObject2 = "syncDispatchLocalHits timed out";
        zzd((String)localObject2, localTimeoutException);
      }
    }
    return bool;
  }
  
  public void zzjf()
  {
    zzjv();
    com.google.android.gms.measurement.zzg.zzjk();
    this.zzQb.zzjf();
  }
  
  public void zzjg()
  {
    zzbd("Radio powered up");
    zzjd();
  }
  
  void zzjh()
  {
    zzjk();
    this.zzQb.zzjh();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */