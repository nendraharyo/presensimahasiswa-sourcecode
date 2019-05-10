package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class zzb
  extends PendingResult
{
  private boolean zzL;
  private final Object zzagI;
  protected final zzb.zza zzagJ;
  private final WeakReference zzagK;
  private final ArrayList zzagL;
  private ResultCallback zzagM;
  private volatile boolean zzagN;
  private boolean zzagO;
  private boolean zzagP;
  private zzq zzagQ;
  private Integer zzagR;
  private volatile zzx zzagS;
  private volatile Result zzagy;
  private final CountDownLatch zzpJ;
  
  protected zzb(Looper paramLooper)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzagI = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    this.zzpJ = ((CountDownLatch)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzagL = ((ArrayList)localObject);
    localObject = new com/google/android/gms/common/api/internal/zzb$zza;
    ((zzb.zza)localObject).<init>(paramLooper);
    this.zzagJ = ((zzb.zza)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    this.zzagK = ((WeakReference)localObject);
  }
  
  protected zzb(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzagI = localObject;
    localObject = new java/util/concurrent/CountDownLatch;
    int i = 1;
    ((CountDownLatch)localObject).<init>(i);
    this.zzpJ = ((CountDownLatch)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzagL = ((ArrayList)localObject);
    if (paramGoogleApiClient != null) {}
    for (localObject = paramGoogleApiClient.getLooper();; localObject = Looper.getMainLooper())
    {
      zzb.zza localzza = new com/google/android/gms/common/api/internal/zzb$zza;
      localzza.<init>((Looper)localObject);
      this.zzagJ = localzza;
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramGoogleApiClient);
      this.zzagK = ((WeakReference)localObject);
      return;
    }
  }
  
  private Result get()
  {
    boolean bool1 = true;
    synchronized (this.zzagI)
    {
      boolean bool2 = this.zzagN;
      if (!bool2)
      {
        String str = "Result has already been consumed.";
        com.google.android.gms.common.internal.zzx.zza(bool1, str);
        bool1 = isReady();
        str = "Result is not ready.";
        com.google.android.gms.common.internal.zzx.zza(bool1, str);
        localResult = this.zzagy;
        bool2 = false;
        str = null;
        this.zzagy = null;
        bool2 = false;
        str = null;
        this.zzagM = null;
        bool2 = true;
        this.zzagN = bool2;
        zzpf();
        return localResult;
      }
      bool1 = false;
      Result localResult = null;
    }
  }
  
  private void zzb(Result paramResult)
  {
    this.zzagy = paramResult;
    boolean bool = false;
    this.zzagQ = null;
    this.zzpJ.countDown();
    Status localStatus = this.zzagy.getStatus();
    Object localObject1 = this.zzagM;
    if (localObject1 != null)
    {
      localObject1 = this.zzagJ;
      ((zzb.zza)localObject1).zzph();
      bool = this.zzL;
      if (!bool)
      {
        localObject1 = this.zzagJ;
        localObject2 = this.zzagM;
        Result localResult = get();
        ((zzb.zza)localObject1).zza((ResultCallback)localObject2, localResult);
      }
    }
    localObject1 = this.zzagL;
    Object localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (PendingResult.zza)((Iterator)localObject2).next();
      ((PendingResult.zza)localObject1).zzu(localStatus);
    }
    this.zzagL.clear();
  }
  
  public static void zzc(Result paramResult)
  {
    boolean bool = paramResult instanceof Releasable;
    Object localObject1;
    if (bool) {
      localObject1 = paramResult;
    }
    try
    {
      localObject1 = (Releasable)paramResult;
      Object localObject2 = localObject1;
      ((Releasable)localObject1).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str1 = "BasePendingResult";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "Unable to release ";
        localObject3 = str2 + paramResult;
        Log.w(str1, (String)localObject3, localRuntimeException);
      }
    }
  }
  
  public final Result await()
  {
    boolean bool1 = true;
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    boolean bool2;
    if (localObject1 != localObject2)
    {
      bool2 = bool1;
      localObject2 = "await must not be called on the UI thread";
      com.google.android.gms.common.internal.zzx.zza(bool2, localObject2);
      bool2 = this.zzagN;
      if (bool2) {
        break label98;
      }
      bool2 = bool1;
      label41:
      localObject2 = "Result has already been consumed";
      com.google.android.gms.common.internal.zzx.zza(bool2, localObject2);
      localObject1 = this.zzagS;
      if (localObject1 != null) {
        break label106;
      }
    }
    for (;;)
    {
      localObject1 = "Cannot await if then() has been called.";
      com.google.android.gms.common.internal.zzx.zza(bool1, localObject1);
      try
      {
        localObject1 = this.zzpJ;
        ((CountDownLatch)localObject1).await();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Status localStatus = Status.zzagD;
          zzx(localStatus);
        }
      }
      com.google.android.gms.common.internal.zzx.zza(isReady(), "Result is not ready.");
      return get();
      bool2 = false;
      localObject1 = null;
      break;
      label98:
      bool2 = false;
      localObject1 = null;
      break label41;
      label106:
      bool1 = false;
    }
  }
  
  public final Result await(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    long l = 0L;
    boolean bool2 = paramLong < l;
    Object localObject1;
    Object localObject2;
    if (bool2)
    {
      localObject1 = Looper.myLooper();
      localObject2 = Looper.getMainLooper();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool2 = bool1;
      localObject2 = "await must not be called on the UI thread when time is greater than zero.";
      com.google.android.gms.common.internal.zzx.zza(bool2, localObject2);
      bool2 = this.zzagN;
      if (bool2) {
        break label151;
      }
      bool2 = bool1;
      label64:
      localObject2 = "Result has already been consumed.";
      com.google.android.gms.common.internal.zzx.zza(bool2, localObject2);
      localObject1 = this.zzagS;
      if (localObject1 != null) {
        break label160;
      }
    }
    for (;;)
    {
      localObject1 = "Cannot await if then() has been called.";
      com.google.android.gms.common.internal.zzx.zza(bool1, localObject1);
      try
      {
        localObject1 = this.zzpJ;
        bool2 = ((CountDownLatch)localObject1).await(paramLong, paramTimeUnit);
        if (!bool2)
        {
          localObject1 = Status.zzagF;
          zzx((Status)localObject1);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Status localStatus = Status.zzagD;
          zzx(localStatus);
        }
      }
      com.google.android.gms.common.internal.zzx.zza(isReady(), "Result is not ready.");
      return get();
      bool2 = false;
      localObject1 = null;
      break;
      label151:
      bool2 = false;
      localObject1 = null;
      break label64;
      label160:
      bool1 = false;
    }
  }
  
  public void cancel()
  {
    synchronized (this.zzagI)
    {
      boolean bool = this.zzL;
      if (!bool)
      {
        bool = this.zzagN;
        if (!bool) {}
      }
      else
      {
        return;
      }
      Object localObject2 = this.zzagQ;
      if (localObject2 != null) {}
      try
      {
        localObject2 = this.zzagQ;
        ((zzq)localObject2).cancel();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      localObject2 = this.zzagy;
      zzc((Result)localObject2);
      bool = false;
      localObject2 = null;
      this.zzagM = null;
      bool = true;
      this.zzL = bool;
      localObject2 = Status.zzagG;
      localObject2 = zzc((Status)localObject2);
      zzb((Result)localObject2);
    }
  }
  
  public boolean isCanceled()
  {
    synchronized (this.zzagI)
    {
      boolean bool = this.zzL;
      return bool;
    }
  }
  
  public final boolean isReady()
  {
    CountDownLatch localCountDownLatch = this.zzpJ;
    long l1 = localCountDownLatch.getCount();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCountDownLatch = null;
    }
  }
  
  public final void setResultCallback(ResultCallback paramResultCallback)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzagN;
    if (!bool2) {
      bool2 = bool1;
    }
    Result localResult;
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool2, "Result has already been consumed.");
      synchronized (this.zzagI)
      {
        Object localObject2 = this.zzagS;
        if (localObject2 == null) {}
        for (;;)
        {
          localObject2 = "Cannot set callbacks if then() has been called.";
          com.google.android.gms.common.internal.zzx.zza(bool1, localObject2);
          bool2 = isCanceled();
          if (!bool2) {
            break label78;
          }
          return;
          bool2 = false;
          localObject2 = null;
          break;
          bool1 = false;
          localResult = null;
        }
        label78:
        bool2 = this.zzagP;
        if (bool2)
        {
          localObject2 = this.zzagK;
          localObject2 = ((WeakReference)localObject2).get();
          localObject2 = (GoogleApiClient)localObject2;
          if (localObject2 != null)
          {
            bool2 = paramResultCallback instanceof zzx;
            if (bool2) {
              break;
            }
          }
          else
          {
            cancel();
          }
        }
      }
    }
    bool2 = isReady();
    if (bool2)
    {
      zzb.zza localzza = this.zzagJ;
      localResult = get();
      localzza.zza((ResultCallback)paramResultCallback, localResult);
    }
    for (;;)
    {
      break;
      this.zzagM = ((ResultCallback)paramResultCallback);
    }
  }
  
  public final void setResultCallback(ResultCallback paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzagN;
    if (!bool2) {
      bool2 = bool1;
    }
    Result localResult;
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool2, "Result has already been consumed.");
      synchronized (this.zzagI)
      {
        Object localObject2 = this.zzagS;
        if (localObject2 == null) {}
        for (;;)
        {
          localObject2 = "Cannot set callbacks if then() has been called.";
          com.google.android.gms.common.internal.zzx.zza(bool1, localObject2);
          bool2 = isCanceled();
          if (!bool2) {
            break label89;
          }
          return;
          bool2 = false;
          localObject2 = null;
          break;
          bool1 = false;
          localResult = null;
        }
        label89:
        bool2 = this.zzagP;
        if (bool2)
        {
          localObject2 = this.zzagK;
          localObject2 = ((WeakReference)localObject2).get();
          localObject2 = (GoogleApiClient)localObject2;
          if (localObject2 != null)
          {
            bool2 = paramResultCallback instanceof zzx;
            if (bool2) {
              break;
            }
          }
          else
          {
            cancel();
          }
        }
      }
    }
    bool2 = isReady();
    zzb.zza localzza;
    if (bool2)
    {
      localzza = this.zzagJ;
      localResult = get();
      localzza.zza((ResultCallback)paramResultCallback, localResult);
    }
    for (;;)
    {
      break;
      this.zzagM = ((ResultCallback)paramResultCallback);
      localzza = this.zzagJ;
      long l = paramTimeUnit.toMillis(paramLong);
      localzza.zza(this, l);
    }
  }
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    boolean bool1 = true;
    zzx localzzx = null;
    boolean bool2 = this.zzagN;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zza(bool2, "Result has already been consumed.");
      synchronized (this.zzagI)
      {
        Object localObject2 = this.zzagS;
        label48:
        Object localObject4;
        if (localObject2 == null)
        {
          bool2 = bool1;
          localObject4 = "Cannot call then() twice.";
          com.google.android.gms.common.internal.zzx.zza(bool2, localObject4);
          localObject2 = this.zzagM;
          if (localObject2 != null) {
            break label178;
          }
        }
        for (;;)
        {
          localObject2 = "Cannot call then() if callbacks are set.";
          com.google.android.gms.common.internal.zzx.zza(bool1, localObject2);
          localObject2 = new com/google/android/gms/common/api/internal/zzx;
          localObject5 = this.zzagK;
          ((zzx)localObject2).<init>((WeakReference)localObject5);
          this.zzagS = ((zzx)localObject2);
          localObject2 = this.zzagS;
          localObject2 = ((zzx)localObject2).then(paramResultTransform);
          bool1 = isReady();
          if (!bool1) {
            break label186;
          }
          localObject5 = this.zzagJ;
          localzzx = this.zzagS;
          localObject4 = get();
          ((zzb.zza)localObject5).zza(localzzx, (Result)localObject4);
          return (TransformedResult)localObject2;
          bool2 = false;
          localObject2 = null;
          break;
          bool2 = false;
          localObject2 = null;
          break label48;
          label178:
          bool1 = false;
          localObject5 = null;
        }
        label186:
        Object localObject5 = this.zzagS;
        this.zzagM = ((ResultCallback)localObject5);
      }
    }
  }
  
  public final void zza(PendingResult.zza paramzza)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzagN;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      String str = "Result has already been consumed.";
      com.google.android.gms.common.internal.zzx.zza(bool2, str);
      label27:
      Object localObject1;
      if (paramzza != null)
      {
        localObject1 = "Callback cannot be null.";
        com.google.android.gms.common.internal.zzx.zzb(bool1, localObject1);
      }
      synchronized (this.zzagI)
      {
        bool2 = isReady();
        if (bool2)
        {
          localObject1 = this.zzagy;
          localObject1 = ((Result)localObject1).getStatus();
          paramzza.zzu((Status)localObject1);
          return;
          bool2 = false;
          localObject1 = null;
          continue;
          bool1 = false;
          ??? = null;
          break label27;
        }
        localObject1 = this.zzagL;
        ((ArrayList)localObject1).add(paramzza);
      }
    }
  }
  
  public final void zza(Result paramResult)
  {
    boolean bool1 = true;
    String str1 = null;
    for (;;)
    {
      synchronized (this.zzagI)
      {
        bool2 = this.zzagO;
        if (!bool2)
        {
          bool2 = this.zzL;
          if (!bool2) {}
        }
        else
        {
          zzc(paramResult);
          return;
        }
        bool2 = isReady();
        if (!bool2)
        {
          bool2 = bool1;
          String str2 = "Results have already been set";
          com.google.android.gms.common.internal.zzx.zza(bool2, str2);
          bool2 = this.zzagN;
          if (bool2) {
            break label113;
          }
          str1 = "Result has already been consumed";
          com.google.android.gms.common.internal.zzx.zza(bool1, str1);
          zzb(paramResult);
        }
      }
      boolean bool2 = false;
      continue;
      label113:
      bool1 = false;
      Object localObject3 = null;
    }
  }
  
  protected final void zza(zzq paramzzq)
  {
    synchronized (this.zzagI)
    {
      this.zzagQ = paramzzq;
      return;
    }
  }
  
  protected abstract Result zzc(Status paramStatus);
  
  public Integer zzpa()
  {
    return this.zzagR;
  }
  
  protected void zzpf() {}
  
  public void zzpg()
  {
    for (;;)
    {
      synchronized (this.zzagI)
      {
        Object localObject2 = this.zzagK;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (GoogleApiClient)localObject2;
        if (localObject2 == null)
        {
          cancel();
          return;
        }
        localObject2 = this.zzagM;
        boolean bool;
        if (localObject2 != null)
        {
          localObject2 = this.zzagM;
          bool = localObject2 instanceof zzx;
          if (!bool) {}
        }
        else
        {
          bool = true;
          this.zzagP = bool;
        }
      }
      cancel();
    }
  }
  
  public final void zzx(Status paramStatus)
  {
    synchronized (this.zzagI)
    {
      boolean bool = isReady();
      if (!bool)
      {
        Result localResult = zzc(paramStatus);
        zza(localResult);
        bool = true;
        this.zzagO = bool;
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */