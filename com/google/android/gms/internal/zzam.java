package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzam
  extends zzal
{
  private static AdvertisingIdClient zzok = null;
  private static CountDownLatch zzol;
  private boolean zzom;
  
  static
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    localCountDownLatch.<init>(1);
    zzol = localCountDownLatch;
  }
  
  protected zzam(Context paramContext, zzap paramzzap, boolean paramBoolean)
  {
    super(paramContext, paramzzap);
    this.zzom = paramBoolean;
  }
  
  public static zzam zza(String paramString, Context paramContext, boolean paramBoolean)
  {
    zzah localzzah = new com/google/android/gms/internal/zzah;
    localzzah.<init>();
    zza(paramString, paramContext, localzzah);
    if (paramBoolean) {}
    synchronized (zzam.class)
    {
      Object localObject3 = zzok;
      if (localObject3 == null)
      {
        localObject3 = new java/lang/Thread;
        zzam.zzb localzzb = new com/google/android/gms/internal/zzam$zzb;
        localzzb.<init>(paramContext);
        ((Thread)localObject3).<init>(localzzb);
        ((Thread)localObject3).start();
      }
      ??? = new com/google/android/gms/internal/zzam;
      ((zzam)???).<init>(paramContext, localzzah, paramBoolean);
      return (zzam)???;
    }
  }
  
  private void zza(Context paramContext, NanoAfmaSignals.AFMASignals paramAFMASignals)
  {
    boolean bool = this.zzom;
    if (!bool) {}
    for (;;)
    {
      return;
      try
      {
        bool = zzS();
        if (bool)
        {
          Object localObject = zzY();
          String str2 = ((zzam.zza)localObject).getId();
          if (str2 == null) {
            continue;
          }
          bool = ((zzam.zza)localObject).isLimitAdTrackingEnabled();
          localObject = Boolean.valueOf(bool);
          paramAFMASignals.didOptOut = ((Boolean)localObject);
          i = 5;
          localObject = Integer.valueOf(i);
          paramAFMASignals.didSignalType = ((Integer)localObject);
          paramAFMASignals.didSignal = str2;
          i = 28;
          j = zzob;
          zza(i, j);
        }
      }
      catch (IOException localIOException)
      {
        continue;
        String str1 = zzf(paramContext);
        paramAFMASignals.didSignal = str1;
        int i = 24;
        int j = zzob;
        zza(i, j);
      }
      catch (zzal.zza localzza) {}
    }
  }
  
  zzam.zza zzY()
  {
    try
    {
      localObject1 = zzol;
      long l = 2;
      ??? = TimeUnit.SECONDS;
      boolean bool1 = ((CountDownLatch)localObject1).await(l, (TimeUnit)???);
      if (bool1) {
        break label63;
      }
      localObject1 = new com/google/android/gms/internal/zzam$zza;
      ??? = null;
      bool2 = false;
      localInfo = null;
      ((zzam.zza)localObject1).<init>(this, null, false);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = new com/google/android/gms/internal/zzam$zza;
        ((zzam.zza)localObject2).<init>(this, null, false);
        continue;
        synchronized (zzam.class)
        {
          label63:
          localObject2 = zzok;
          if (localObject2 == null)
          {
            localObject2 = new com/google/android/gms/internal/zzam$zza;
            bool2 = false;
            localInfo = null;
            ((zzam.zza)localObject2).<init>(this, null, false);
          }
        }
        Object localObject4 = zzok;
        AdvertisingIdClient.Info localInfo = ((AdvertisingIdClient)localObject4).getInfo();
        localObject4 = localInfo.getId();
        ??? = zzk((String)localObject4);
        localObject4 = new com/google/android/gms/internal/zzam$zza;
        boolean bool2 = localInfo.isLimitAdTrackingEnabled();
        ((zzam.zza)localObject4).<init>(this, (String)???, bool2);
      }
    }
    return (zzam.zza)localObject1;
  }
  
  protected NanoAfmaSignals.AFMASignals zzc(Context paramContext)
  {
    NanoAfmaSignals.AFMASignals localAFMASignals = super.zzc(paramContext);
    zza(paramContext, localAFMASignals);
    return localAFMASignals;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */