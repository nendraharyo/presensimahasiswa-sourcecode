package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.zzb.zzb;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzlv
  implements zzc
{
  private static final Object zzafn;
  private static final zzlv.zze zzafo;
  private static final long zzafp;
  private GoogleApiClient zzaaj;
  private final zzlv.zza zzafq;
  private final Object zzafr;
  private long zzafs;
  private final long zzaft;
  private ScheduledFuture zzafu;
  private final Runnable zzafv;
  private final zzmq zzqW;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzafn = localObject;
    localObject = new com/google/android/gms/internal/zzlv$zze;
    ((zzlv.zze)localObject).<init>(null);
    zzafo = (zzlv.zze)localObject;
    localObject = TimeUnit.MILLISECONDS;
    TimeUnit localTimeUnit = TimeUnit.MINUTES;
    zzafp = ((TimeUnit)localObject).convert(2, localTimeUnit);
  }
  
  public zzlv()
  {
    this(localzzmt, l, localzzb);
  }
  
  public zzlv(zzmq paramzzmq, long paramLong, zzlv.zza paramzza)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzafr = localObject;
    this.zzafs = 0L;
    this.zzafu = null;
    this.zzaaj = null;
    localObject = new com/google/android/gms/internal/zzlv$1;
    ((zzlv.1)localObject).<init>(this);
    this.zzafv = ((Runnable)localObject);
    this.zzqW = paramzzmq;
    this.zzaft = paramLong;
    this.zzafq = paramzza;
  }
  
  private static void zza(LogEventParcelable paramLogEventParcelable)
  {
    Object localObject = paramLogEventParcelable.zzafl;
    int i;
    byte[] arrayOfByte;
    if (localObject != null)
    {
      localObject = paramLogEventParcelable.zzafk.zzbuY;
      i = localObject.length;
      if (i == 0)
      {
        localObject = paramLogEventParcelable.zzafk;
        arrayOfByte = paramLogEventParcelable.zzafl.zzoF();
        ((zzsz.zzd)localObject).zzbuY = arrayOfByte;
      }
    }
    localObject = paramLogEventParcelable.zzafm;
    if (localObject != null)
    {
      localObject = paramLogEventParcelable.zzafk.zzbvf;
      i = localObject.length;
      if (i == 0)
      {
        localObject = paramLogEventParcelable.zzafk;
        arrayOfByte = paramLogEventParcelable.zzafm.zzoF();
        ((zzsz.zzd)localObject).zzbvf = arrayOfByte;
      }
    }
    localObject = zzsu.toByteArray(paramLogEventParcelable.zzafk);
    paramLogEventParcelable.zzafi = ((byte[])localObject);
  }
  
  private zzlv.zzd zzb(GoogleApiClient paramGoogleApiClient, LogEventParcelable paramLogEventParcelable)
  {
    zzafo.zzoH();
    zzlv.zzd localzzd = new com/google/android/gms/internal/zzlv$zzd;
    localzzd.<init>(this, paramLogEventParcelable, paramGoogleApiClient);
    zzlv.2 local2 = new com/google/android/gms/internal/zzlv$2;
    local2.<init>(this);
    localzzd.zza(local2);
    return localzzd;
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, LogEventParcelable paramLogEventParcelable)
  {
    zza(paramLogEventParcelable);
    zzlv.zzd localzzd = zzb(paramGoogleApiClient, paramLogEventParcelable);
    return paramGoogleApiClient.zza(localzzd);
  }
  
  public boolean zza(GoogleApiClient paramGoogleApiClient, long paramLong, TimeUnit paramTimeUnit)
  {
    try
    {
      zzlv.zze localzze = zzafo;
      bool = localzze.zza(paramLong, paramTimeUnit);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        String str = "flush interrupted";
        Log.e("ClearcutLoggerApiImpl", str);
        Thread.currentThread().interrupt();
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */