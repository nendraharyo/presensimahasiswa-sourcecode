package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.i;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzk.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzmf;
import com.google.android.gms.internal.zzmg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zzj
  extends GoogleApiClient
  implements zzp.zza
{
  private final Context mContext;
  private final Lock zzXG;
  private final int zzagp;
  private final Looper zzagr;
  private final zzc zzags;
  final Api.zza zzagt;
  final Map zzahA;
  private final zzk zzahL;
  private zzp zzahM = null;
  final Queue zzahN;
  private volatile boolean zzahO;
  private long zzahP;
  private long zzahQ;
  private final zzj.zza zzahR;
  zzj.zzc zzahS;
  final Map zzahT;
  Set zzahU;
  private final Set zzahV;
  final Set zzahW;
  private zza zzahX;
  private final ArrayList zzahY;
  private Integer zzahZ;
  final zzf zzahz;
  Set zzaia;
  private final zzj.zzd zzaib;
  private final zzk.zza zzaic;
  
  public zzj(Context paramContext, Lock paramLock, Looper paramLooper, zzf paramzzf, zzc paramzzc, Api.zza paramzza, Map paramMap1, List paramList1, List paramList2, Map paramMap2, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    Object localObject1 = new java/util/LinkedList;
    ((LinkedList)localObject1).<init>();
    this.zzahN = ((Queue)localObject1);
    this.zzahP = 120000L;
    long l = 5000L;
    this.zzahQ = l;
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    this.zzahU = ((Set)localObject1);
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    localObject1 = Collections.newSetFromMap((Map)localObject1);
    this.zzahV = ((Set)localObject1);
    localObject1 = new java/util/concurrent/ConcurrentHashMap;
    int i = 16;
    float f = 0.75F;
    int j = 2;
    ((ConcurrentHashMap)localObject1).<init>(i, f, j);
    localObject1 = Collections.newSetFromMap((Map)localObject1);
    this.zzahW = ((Set)localObject1);
    this.zzahZ = null;
    this.zzaia = null;
    localObject1 = new com/google/android/gms/common/api/internal/zzj$1;
    ((zzj.1)localObject1).<init>(this);
    this.zzaib = ((zzj.zzd)localObject1);
    localObject1 = new com/google/android/gms/common/api/internal/zzj$2;
    ((zzj.2)localObject1).<init>(this);
    this.zzaic = ((zzk.zza)localObject1);
    this.mContext = paramContext;
    this.zzXG = paramLock;
    localObject1 = new com/google/android/gms/common/internal/zzk;
    Object localObject2 = this.zzaic;
    ((zzk)localObject1).<init>(paramLooper, (zzk.zza)localObject2);
    this.zzahL = ((zzk)localObject1);
    this.zzagr = paramLooper;
    localObject1 = new com/google/android/gms/common/api/internal/zzj$zza;
    ((zzj.zza)localObject1).<init>(this, paramLooper);
    this.zzahR = ((zzj.zza)localObject1);
    this.zzags = paramzzc;
    this.zzagp = paramInt1;
    int k = this.zzagp;
    if (k >= 0)
    {
      localObject1 = Integer.valueOf(paramInt2);
      this.zzahZ = ((Integer)localObject1);
    }
    this.zzahA = paramMap1;
    this.zzahT = paramMap2;
    this.zzahY = paramArrayList;
    localObject2 = paramList1.iterator();
    boolean bool;
    zzk localzzk;
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (GoogleApiClient.ConnectionCallbacks)((Iterator)localObject2).next();
      localzzk = this.zzahL;
      localzzk.registerConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject1);
    }
    localObject2 = paramList2.iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (GoogleApiClient.OnConnectionFailedListener)((Iterator)localObject2).next();
      localzzk = this.zzahL;
      localzzk.registerConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)localObject1);
    }
    this.zzahz = paramzzf;
    this.zzagt = paramzza;
  }
  
  private void resume()
  {
    Lock localLock = this.zzXG;
    localLock.lock();
    try
    {
      boolean bool = zzpB();
      if (bool) {
        zzpC();
      }
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public static int zza(Iterable paramIterable, boolean paramBoolean)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Api.zzb localzzb = null;
    int i = 1;
    float f2 = Float.MIN_VALUE;
    Iterator localIterator = paramIterable.iterator();
    boolean bool2 = false;
    float f3 = 0.0F;
    int j = 0;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localzzb = (Api.zzb)localIterator.next();
      boolean bool3 = localzzb.zzmE();
      if (bool3) {
        j = i;
      }
      bool1 = localzzb.zznb();
      if (!bool1) {
        break label134;
      }
      bool1 = i;
    }
    for (f1 = f2;; f1 = f3)
    {
      bool2 = bool1;
      f3 = f1;
      break;
      if (j != 0) {
        if ((bool2) && (paramBoolean)) {
          i = 2;
        }
      }
      for (f2 = 2.8E-45F;; f2 = 4.2E-45F)
      {
        return i;
        i = 3;
      }
      label134:
      bool1 = bool2;
    }
  }
  
  private void zza(GoogleApiClient paramGoogleApiClient, zzv paramzzv, boolean paramBoolean)
  {
    PendingResult localPendingResult = zzmf.zzamA.zzf(paramGoogleApiClient);
    zzj.5 local5 = new com/google/android/gms/common/api/internal/zzj$5;
    local5.<init>(this, paramzzv, paramBoolean, paramGoogleApiClient);
    localPendingResult.setResultCallback(local5);
  }
  
  private static void zza(zzj.zze paramzze, zza paramzza, IBinder paramIBinder)
  {
    boolean bool = paramzze.isReady();
    zzj.zzb localzzb;
    if (bool)
    {
      localzzb = new com/google/android/gms/common/api/internal/zzj$zzb;
      localzzb.<init>(paramzze, paramzza, paramIBinder, null);
      paramzze.zza(localzzb);
    }
    for (;;)
    {
      return;
      if (paramIBinder != null)
      {
        bool = paramIBinder.isBinderAlive();
        if (bool)
        {
          localzzb = new com/google/android/gms/common/api/internal/zzj$zzb;
          localzzb.<init>(paramzze, paramzza, paramIBinder, null);
          paramzze.zza(localzzb);
          try
          {
            paramIBinder.linkToDeath(localzzb, 0);
          }
          catch (RemoteException localRemoteException)
          {
            paramzze.cancel();
            localInteger = paramzze.zzpa();
            i = localInteger.intValue();
            paramzza.remove(i);
          }
          continue;
        }
      }
      paramzze.zza(null);
      paramzze.cancel();
      Integer localInteger = paramzze.zzpa();
      int i = localInteger.intValue();
      paramzza.remove(i);
    }
  }
  
  private void zzbB(int paramInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    Object localObject2 = this.zzahZ;
    if (localObject2 == null)
    {
      localObject2 = Integer.valueOf(paramInt);
      this.zzahZ = ((Integer)localObject2);
    }
    do
    {
      localObject2 = this.zzahM;
      if (localObject2 == null) {
        break;
      }
      return;
      localObject2 = this.zzahZ;
      m = ((Integer)localObject2).intValue();
    } while (m == paramInt);
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Cannot use sign-in mode: ");
    Object localObject3 = zzbC(paramInt);
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(". Mode was already set to ");
    localObject3 = zzbC(this.zzahZ.intValue());
    localObject2 = (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
    Object localObject4 = this.zzahT.values().iterator();
    int m = 0;
    localObject2 = null;
    float f3 = 0.0F;
    int n = 0;
    localObject3 = null;
    label179:
    j = ((Iterator)localObject4).hasNext();
    if (j != 0)
    {
      localObject1 = (Api.zzb)((Iterator)localObject4).next();
      boolean bool = ((Api.zzb)localObject1).zzmE();
      if (bool) {
        n = i;
      }
      j = ((Api.zzb)localObject1).zznb();
      if (j == 0) {
        break label530;
      }
      j = i;
    }
    for (f2 = f1;; f2 = f3)
    {
      m = j;
      f3 = f2;
      break label179;
      localObject1 = this.zzahZ;
      int k = ((Integer)localObject1).intValue();
      switch (k)
      {
      }
      do
      {
        do
        {
          localObject1 = new com/google/android/gms/common/api/internal/zzl;
          localObject2 = this.mContext;
          localLock = this.zzXG;
          localObject4 = this.zzagr;
          localzzc = this.zzags;
          localMap1 = this.zzahT;
          localzzf = this.zzahz;
          localMap2 = this.zzahA;
          localzza = this.zzagt;
          localArrayList = this.zzahY;
          localObject3 = this;
          ((zzl)localObject1).<init>((Context)localObject2, this, localLock, (Looper)localObject4, localzzc, localMap1, localzzf, localMap2, localzza, localArrayList, this);
          this.zzahM = ((zzp)localObject1);
          break;
          if (n == 0)
          {
            localObject1 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject1).<init>("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            throw ((Throwable)localObject1);
          }
        } while (m == 0);
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
        throw ((Throwable)localObject1);
      } while (n == 0);
      localObject1 = new com/google/android/gms/common/api/internal/zzd;
      localObject2 = this.mContext;
      Lock localLock = this.zzXG;
      localObject4 = this.zzagr;
      zzc localzzc = this.zzags;
      Map localMap1 = this.zzahT;
      zzf localzzf = this.zzahz;
      Map localMap2 = this.zzahA;
      Api.zza localzza = this.zzagt;
      ArrayList localArrayList = this.zzahY;
      localObject3 = this;
      ((zzd)localObject1).<init>((Context)localObject2, this, localLock, (Looper)localObject4, localzzc, localMap1, localzzf, localMap2, localzza, localArrayList);
      this.zzahM = ((zzp)localObject1);
      break;
      label530:
      k = m;
    }
  }
  
  static String zzbC(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "SIGN_IN_MODE_NONE";
      continue;
      str = "SIGN_IN_MODE_REQUIRED";
      continue;
      str = "SIGN_IN_MODE_OPTIONAL";
    }
  }
  
  private void zzpC()
  {
    this.zzahL.zzqR();
    this.zzahM.connect();
  }
  
  private void zzpD()
  {
    Lock localLock = this.zzXG;
    localLock.lock();
    try
    {
      boolean bool = zzpF();
      if (bool) {
        zzpC();
      }
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public ConnectionResult blockingConnect()
  {
    boolean bool1 = true;
    Object localObject1 = Looper.myLooper();
    Object localObject4 = Looper.getMainLooper();
    if (localObject1 != localObject4)
    {
      boolean bool2 = bool1;
      localObject4 = "blockingConnect must not be called on the UI thread";
      com.google.android.gms.common.internal.zzx.zza(bool2, localObject4);
      localObject1 = this.zzXG;
      ((Lock)localObject1).lock();
    }
    int j;
    label59:
    label192:
    int i;
    do
    {
      try
      {
        j = this.zzagp;
        if (j >= 0)
        {
          localObject1 = this.zzahZ;
          if (localObject1 != null)
          {
            localObject1 = "Sign-in mode should have been set explicitly by auto-manage.";
            com.google.android.gms.common.internal.zzx.zza(bool1, localObject1);
          }
        }
        for (;;)
        {
          localObject1 = this.zzahZ;
          j = ((Integer)localObject1).intValue();
          zzbB(j);
          localObject1 = this.zzahL;
          ((zzk)localObject1).zzqR();
          localObject1 = this.zzahM;
          localObject1 = ((zzp)localObject1).blockingConnect();
          return (ConnectionResult)localObject1;
          j = 0;
          localObject1 = null;
          break;
          bool1 = false;
          str = null;
          break label59;
          localObject1 = this.zzahZ;
          if (localObject1 != null) {
            break label192;
          }
          localObject1 = this.zzahT;
          localObject1 = ((Map)localObject1).values();
          bool1 = false;
          str = null;
          j = zza((Iterable)localObject1, false);
          localObject1 = Integer.valueOf(j);
          this.zzahZ = ((Integer)localObject1);
        }
        localObject3 = this.zzahZ;
      }
      finally
      {
        this.zzXG.unlock();
      }
      j = ((Integer)localObject3).intValue();
      i = 2;
    } while (j != i);
    Object localObject3 = new java/lang/IllegalStateException;
    String str = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
    ((IllegalStateException)localObject3).<init>(str);
    throw ((Throwable)localObject3);
  }
  
  public ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject3 = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject3 != localLooper) {
      bool = true;
    }
    localObject3 = "blockingConnect must not be called on the UI thread";
    com.google.android.gms.common.internal.zzx.zza(bool, localObject3);
    com.google.android.gms.common.internal.zzx.zzb(paramTimeUnit, "TimeUnit must not be null");
    localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzahZ;
      int j;
      int i;
      if (localObject1 == null)
      {
        localObject1 = this.zzahT;
        localObject1 = ((Map)localObject1).values();
        j = 0;
        localObject3 = null;
        i = zza((Iterable)localObject1, false);
        localObject1 = Integer.valueOf(i);
        this.zzahZ = ((Integer)localObject1);
      }
      do
      {
        localObject1 = this.zzahZ;
        i = ((Integer)localObject1).intValue();
        zzbB(i);
        localObject1 = this.zzahL;
        ((zzk)localObject1).zzqR();
        localObject1 = this.zzahM;
        localObject1 = ((zzp)localObject1).blockingConnect(paramLong, paramTimeUnit);
        return (ConnectionResult)localObject1;
        localObject1 = this.zzahZ;
        i = ((Integer)localObject1).intValue();
        j = 2;
      } while (i != j);
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public PendingResult clearDefaultAccountAndReconnect()
  {
    AtomicReference localAtomicReference = null;
    boolean bool1 = isConnected();
    Object localObject1 = "GoogleApiClient is not connected yet.";
    com.google.android.gms.common.internal.zzx.zza(bool1, localObject1);
    Object localObject2 = this.zzahZ;
    int i = ((Integer)localObject2).intValue();
    int k = 2;
    Object localObject3;
    if (i != k)
    {
      i = 1;
      com.google.android.gms.common.internal.zzx.zza(i, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
      localObject2 = new com/google/android/gms/common/api/internal/zzv;
      ((zzv)localObject2).<init>(this);
      localObject1 = this.zzahT;
      localObject3 = zzmf.zzUI;
      boolean bool2 = ((Map)localObject1).containsKey(localObject3);
      if (!bool2) {
        break label101;
      }
      zza(this, (zzv)localObject2, false);
    }
    for (;;)
    {
      return (PendingResult)localObject2;
      int j = 0;
      localObject2 = null;
      break;
      label101:
      localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
      localAtomicReference.<init>();
      localObject1 = new com/google/android/gms/common/api/internal/zzj$3;
      ((zzj.3)localObject1).<init>(this, localAtomicReference, (zzv)localObject2);
      localObject3 = new com/google/android/gms/common/api/internal/zzj$4;
      ((zzj.4)localObject3).<init>(this, (zzv)localObject2);
      GoogleApiClient.Builder localBuilder = new com/google/android/gms/common/api/GoogleApiClient$Builder;
      Object localObject4 = this.mContext;
      localBuilder.<init>((Context)localObject4);
      localObject4 = zzmf.API;
      localBuilder = localBuilder.addApi((Api)localObject4);
      localObject1 = localBuilder.addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject1).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)localObject3);
      localObject3 = this.zzahR;
      localObject1 = ((GoogleApiClient.Builder)localObject1).setHandler((Handler)localObject3).build();
      localAtomicReference.set(localObject1);
      ((GoogleApiClient)localObject1).connect();
    }
  }
  
  public void connect()
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject4 = this.zzXG;
    ((Lock)localObject4).lock();
    int j;
    int i;
    do
    {
      try
      {
        j = this.zzagp;
        if (j >= 0)
        {
          localObject4 = this.zzahZ;
          if (localObject4 != null) {
            bool = true;
          }
          localObject4 = "Sign-in mode should have been set explicitly by auto-manage.";
          com.google.android.gms.common.internal.zzx.zza(bool, localObject4);
        }
        for (;;)
        {
          localObject1 = this.zzahZ;
          i = ((Integer)localObject1).intValue();
          connect(i);
          return;
          localObject1 = this.zzahZ;
          if (localObject1 != null) {
            break;
          }
          localObject1 = this.zzahT;
          localObject1 = ((Map)localObject1).values();
          j = 0;
          localObject4 = null;
          i = zza((Iterable)localObject1, false);
          localObject1 = Integer.valueOf(i);
          this.zzahZ = ((Integer)localObject1);
        }
        localObject3 = this.zzahZ;
      }
      finally
      {
        this.zzXG.unlock();
      }
      i = ((Integer)localObject3).intValue();
      j = 2;
    } while (i != j);
    Object localObject3 = new java/lang/IllegalStateException;
    localObject4 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
    ((IllegalStateException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
  }
  
  public void connect(int paramInt)
  {
    int i = 1;
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    int j = 3;
    if ((paramInt != j) && (paramInt != i))
    {
      j = 2;
      if (paramInt != j) {
        break label91;
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "Illegal sign-in mode: ";
        localObject1 = ((StringBuilder)localObject1).append(str);
        localObject1 = ((StringBuilder)localObject1).append(paramInt);
        localObject1 = ((StringBuilder)localObject1).toString();
        com.google.android.gms.common.internal.zzx.zzb(i, localObject1);
        zzbB(paramInt);
        zzpC();
        return;
      }
      finally
      {
        label91:
        Object localObject2;
        this.zzXG.unlock();
      }
      i = 0;
      localObject2 = null;
    }
  }
  
  public void disconnect()
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    boolean bool;
    for (;;)
    {
      try
      {
        localObject1 = this.zzahM;
        if (localObject1 != null)
        {
          localObject1 = this.zzahM;
          bool = ((zzp)localObject1).disconnect();
          if (!bool)
          {
            bool = true;
            zzaa(bool);
            localObject1 = this.zzahV;
            localIterator = ((Set)localObject1).iterator();
            bool = localIterator.hasNext();
            if (!bool) {
              break;
            }
            localObject1 = localIterator.next();
            localObject1 = (zzq)localObject1;
            ((zzq)localObject1).clear();
            continue;
          }
        }
        bool = false;
      }
      finally
      {
        this.zzXG.unlock();
      }
      localObject3 = null;
    }
    Object localObject3 = this.zzahV;
    ((Set)localObject3).clear();
    localObject3 = this.zzahN;
    Iterator localIterator = ((Queue)localObject3).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (zzj.zze)localObject3;
      ((zzj.zze)localObject3).zza(null);
      ((zzj.zze)localObject3).cancel();
    }
    localObject3 = this.zzahN;
    ((Queue)localObject3).clear();
    localObject3 = this.zzahM;
    if (localObject3 == null)
    {
      localObject3 = this.zzXG;
      ((Lock)localObject3).unlock();
    }
    for (;;)
    {
      return;
      zzpF();
      localObject3 = this.zzahL;
      ((zzk)localObject3).zzqQ();
      localObject3 = this.zzXG;
      ((Lock)localObject3).unlock();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = paramPrintWriter.append(paramString).append("mContext=");
    Object localObject2 = this.mContext;
    ((PrintWriter)localObject1).println(localObject2);
    localObject1 = paramPrintWriter.append(paramString).append("mResuming=");
    boolean bool = this.zzahO;
    ((PrintWriter)localObject1).print(bool);
    localObject1 = paramPrintWriter.append(" mWorkQueue.size()=");
    int i = this.zzahN.size();
    ((PrintWriter)localObject1).print(i);
    localObject1 = paramPrintWriter.append(" mUnconsumedRunners.size()=");
    localObject2 = this.zzahW;
    i = ((Set)localObject2).size();
    ((PrintWriter)localObject1).println(i);
    localObject1 = this.zzahM;
    if (localObject1 != null)
    {
      localObject1 = this.zzahM;
      ((zzp)localObject1).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public ConnectionResult getConnectionResult(Api paramApi)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      bool = isConnected();
      if (!bool)
      {
        bool = zzpB();
        if (!bool)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject4 = "Cannot invoke getConnectionResult unless GoogleApiClient is connected";
          ((IllegalStateException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
    }
    finally
    {
      this.zzXG.unlock();
    }
    Object localObject3 = this.zzahT;
    Object localObject4 = paramApi.zzoR();
    boolean bool = ((Map)localObject3).containsKey(localObject4);
    if (bool)
    {
      localObject3 = this.zzahM;
      localObject3 = ((zzp)localObject3).getConnectionResult(paramApi);
      if (localObject3 == null)
      {
        bool = zzpB();
        if (bool)
        {
          localObject3 = ConnectionResult.zzafB;
          localObject4 = this.zzXG;
          ((Lock)localObject4).unlock();
        }
      }
      for (;;)
      {
        return (ConnectionResult)localObject3;
        localObject3 = "GoogleApiClientImpl";
        localObject4 = zzpH();
        Log.i((String)localObject3, (String)localObject4);
        localObject3 = "GoogleApiClientImpl";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = paramApi.getName();
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = " requested in getConnectionResult";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = " is not connected but is not present in the failed ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = " connections map";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        localObject5 = new java/lang/Exception;
        ((Exception)localObject5).<init>();
        Log.wtf((String)localObject3, (String)localObject4, (Throwable)localObject5);
        localObject3 = new com/google/android/gms/common/ConnectionResult;
        int i = 8;
        localObject5 = null;
        ((ConnectionResult)localObject3).<init>(i, null);
        localObject4 = this.zzXG;
        ((Lock)localObject4).unlock();
        continue;
        localObject4 = this.zzXG;
        ((Lock)localObject4).unlock();
      }
    }
    localObject3 = new java/lang/IllegalArgumentException;
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    Object localObject5 = paramApi.getName();
    localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
    localObject5 = " was never registered with GoogleApiClient";
    localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
    localObject4 = ((StringBuilder)localObject4).toString();
    ((IllegalArgumentException)localObject3).<init>((String)localObject4);
    throw ((Throwable)localObject3);
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public Looper getLooper()
  {
    return this.zzagr;
  }
  
  public int getSessionId()
  {
    return System.identityHashCode(this);
  }
  
  public boolean hasConnectedApi(Api paramApi)
  {
    Object localObject = this.zzahT;
    Api.zzc localzzc = paramApi.zzoR();
    localObject = (Api.zzb)((Map)localObject).get(localzzc);
    boolean bool;
    if (localObject != null)
    {
      bool = ((Api.zzb)localObject).isConnected();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isConnected()
  {
    zzp localzzp = this.zzahM;
    boolean bool;
    if (localzzp != null)
    {
      localzzp = this.zzahM;
      bool = localzzp.isConnected();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzp = null;
    }
  }
  
  public boolean isConnecting()
  {
    zzp localzzp = this.zzahM;
    boolean bool;
    if (localzzp != null)
    {
      localzzp = this.zzahM;
      bool = localzzp.isConnecting();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzp = null;
    }
  }
  
  public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.zzahL.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.zzahL.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void reconnect()
  {
    disconnect();
    connect();
  }
  
  public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zzahL.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zzahL.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void stopAutoManage(i parami)
  {
    int i = this.zzagp;
    if (i >= 0)
    {
      localObject1 = zzw.zza(parami);
      if (localObject1 == null)
      {
        localObject1 = new android/os/Handler;
        Object localObject2 = this.mContext.getMainLooper();
        ((Handler)localObject1).<init>((Looper)localObject2);
        localObject2 = new com/google/android/gms/common/api/internal/zzj$6;
        ((zzj.6)localObject2).<init>(this, parami);
        ((Handler)localObject1).post((Runnable)localObject2);
      }
      for (;;)
      {
        return;
        int j = this.zzagp;
        ((zzw)localObject1).zzbD(j);
      }
    }
    Object localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Called stopAutoManage but automatic lifecycle management is not enabled.");
    throw ((Throwable)localObject1);
  }
  
  public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zzahL.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zzahL.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public Api.zzb zza(Api.zzc paramzzc)
  {
    Api.zzb localzzb = (Api.zzb)this.zzahT.get(paramzzc);
    com.google.android.gms.common.internal.zzx.zzb(localzzb, "Appropriate Api was not requested.");
    return localzzb;
  }
  
  /* Error */
  public zza.zza zza(zza.zza paramzza)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 647	com/google/android/gms/common/api/internal/zza$zza:zzoR	()Lcom/google/android/gms/common/api/Api$zzc;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +89 -> 95
    //   9: iconst_1
    //   10: istore_3
    //   11: iload_3
    //   12: ldc_w 649
    //   15: invokestatic 473	com/google/android/gms/common/internal/zzx:zzb	(ZLjava/lang/Object;)V
    //   18: aload_0
    //   19: getfield 153	com/google/android/gms/common/api/internal/zzj:zzahT	Ljava/util/Map;
    //   22: astore_2
    //   23: aload_1
    //   24: invokevirtual 647	com/google/android/gms/common/api/internal/zza$zza:zzoR	()Lcom/google/android/gms/common/api/Api$zzc;
    //   27: astore 4
    //   29: aload_2
    //   30: aload 4
    //   32: invokeinterface 415 2 0
    //   37: istore_3
    //   38: ldc_w 651
    //   41: astore 4
    //   43: iload_3
    //   44: aload 4
    //   46: invokestatic 473	com/google/android/gms/common/internal/zzx:zzb	(ZLjava/lang/Object;)V
    //   49: aload_0
    //   50: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   53: astore_2
    //   54: aload_2
    //   55: invokeinterface 192 1 0
    //   60: aload_0
    //   61: getfield 59	com/google/android/gms/common/api/internal/zzj:zzahM	Lcom/google/android/gms/common/api/internal/zzp;
    //   64: astore_2
    //   65: aload_2
    //   66: ifnonnull +36 -> 102
    //   69: aload_0
    //   70: getfield 64	com/google/android/gms/common/api/internal/zzj:zzahN	Ljava/util/Queue;
    //   73: astore_2
    //   74: aload_2
    //   75: aload_1
    //   76: invokeinterface 654 2 0
    //   81: pop
    //   82: aload_0
    //   83: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   86: astore_2
    //   87: aload_2
    //   88: invokeinterface 201 1 0
    //   93: aload_1
    //   94: areturn
    //   95: iconst_0
    //   96: istore_3
    //   97: aconst_null
    //   98: astore_2
    //   99: goto -88 -> 11
    //   102: aload_0
    //   103: getfield 59	com/google/android/gms/common/api/internal/zzj:zzahM	Lcom/google/android/gms/common/api/internal/zzp;
    //   106: astore_2
    //   107: aload_2
    //   108: aload_1
    //   109: invokeinterface 657 2 0
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   119: astore_2
    //   120: aload_2
    //   121: invokeinterface 201 1 0
    //   126: goto -33 -> 93
    //   129: astore_2
    //   130: aload_0
    //   131: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   134: invokeinterface 201 1 0
    //   139: aload_2
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	zzj
    //   0	141	1	paramzza	zza.zza
    //   4	117	2	localObject1	Object
    //   129	11	2	localObject2	Object
    //   10	87	3	bool	boolean
    //   27	18	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   60	64	129	finally
    //   69	73	129	finally
    //   75	82	129	finally
    //   102	106	129	finally
    //   108	114	129	finally
  }
  
  public void zza(zzx paramzzx)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzaia;
      if (localObject1 == null)
      {
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
        this.zzaia = ((Set)localObject1);
      }
      localObject1 = this.zzaia;
      ((Set)localObject1).add(paramzzx);
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public boolean zza(Api paramApi)
  {
    Map localMap = this.zzahT;
    Api.zzc localzzc = paramApi.zzoR();
    return localMap.containsKey(localzzc);
  }
  
  public boolean zza(zzu paramzzu)
  {
    zzp localzzp = this.zzahM;
    boolean bool;
    if (localzzp != null)
    {
      localzzp = this.zzahM;
      bool = localzzp.zza(paramzzu);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzp = null;
    }
  }
  
  void zzaa(boolean paramBoolean)
  {
    Object localObject1 = this.zzahW;
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzj.zze)localIterator.next();
      Object localObject2 = ((zzj.zze)localObject1).zzpa();
      if (localObject2 == null)
      {
        if (paramBoolean)
        {
          ((zzj.zze)localObject1).zzpg();
        }
        else
        {
          ((zzj.zze)localObject1).cancel();
          localObject2 = this.zzahW;
          ((Set)localObject2).remove(localObject1);
        }
      }
      else
      {
        ((zzj.zze)localObject1).zzpe();
        localObject2 = ((zzj.zze)localObject1).zzoR();
        localObject2 = zza((Api.zzc)localObject2).zzoT();
        zza localzza = this.zzahX;
        zza((zzj.zze)localObject1, localzza, (IBinder)localObject2);
        localObject2 = this.zzahW;
        ((Set)localObject2).remove(localObject1);
      }
    }
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    Object localObject1 = paramzza.zzoR();
    if (localObject1 != null) {
      bool = true;
    }
    Object localObject4;
    Object localObject3;
    for (;;)
    {
      localObject4 = "This task can not be executed (it's probably a Batch or malformed)";
      com.google.android.gms.common.internal.zzx.zzb(bool, localObject4);
      localObject1 = this.zzXG;
      ((Lock)localObject1).lock();
      try
      {
        localObject1 = this.zzahM;
        if (localObject1 != null) {
          break;
        }
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = "GoogleApiClient is not connected yet.";
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
      finally
      {
        this.zzXG.unlock();
      }
      bool = false;
      localObject3 = null;
    }
    boolean bool = zzpB();
    if (bool)
    {
      localObject3 = this.zzahN;
      ((Queue)localObject3).add(paramzza);
      for (;;)
      {
        localObject3 = this.zzahN;
        bool = ((Queue)localObject3).isEmpty();
        if (bool) {
          break;
        }
        localObject3 = this.zzahN;
        localObject3 = ((Queue)localObject3).remove();
        localObject3 = (zzj.zze)localObject3;
        zzb((zzj.zze)localObject3);
        localObject4 = Status.zzagE;
        ((zzj.zze)localObject3).zzw((Status)localObject4);
      }
      localObject3 = this.zzXG;
      ((Lock)localObject3).unlock();
    }
    for (;;)
    {
      return paramzza;
      localObject3 = this.zzahM;
      paramzza = ((zzp)localObject3).zzb(paramzza);
      localObject3 = this.zzXG;
      ((Lock)localObject3).unlock();
    }
  }
  
  void zzb(zzj.zze paramzze)
  {
    this.zzahW.add(paramzze);
    zzj.zzd localzzd = this.zzaib;
    paramzze.zza(localzzd);
  }
  
  public void zzb(zzx paramzzx)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    for (;;)
    {
      boolean bool;
      try
      {
        localObject1 = this.zzaia;
        String str;
        Exception localException;
        if (localObject1 == null)
        {
          localObject1 = "GoogleApiClientImpl";
          str = "Attempted to remove pending transform when no transforms are registered.";
          localException = new java/lang/Exception;
          localException.<init>();
          Log.wtf((String)localObject1, str, localException);
          return;
        }
        localObject1 = this.zzaia;
        bool = ((Set)localObject1).remove(paramzzx);
        if (!bool)
        {
          localObject1 = "GoogleApiClientImpl";
          str = "Failed to remove pending transform - this may lead to memory leaks!";
          localException = new java/lang/Exception;
          localException.<init>();
          Log.wtf((String)localObject1, str, localException);
          continue;
        }
        bool = zzpG();
      }
      finally
      {
        this.zzXG.unlock();
      }
      if (!bool)
      {
        zzp localzzp = this.zzahM;
        localzzp.zzpj();
      }
    }
  }
  
  public void zzc(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    if ((paramInt == i) && (!paramBoolean)) {
      zzpE();
    }
    Object localObject = this.zzahW;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzj.zze)localIterator.next();
      if (paramBoolean) {
        ((zzj.zze)localObject).zzpe();
      }
      Status localStatus = new com/google/android/gms/common/api/Status;
      int k = 8;
      String str = "The connection to Google Play services was lost";
      localStatus.<init>(k, str);
      ((zzj.zze)localObject).zzx(localStatus);
    }
    this.zzahW.clear();
    this.zzahL.zzbT(paramInt);
    localObject = this.zzahL;
    ((zzk)localObject).zzqQ();
    int j = 2;
    if (paramInt == j) {
      zzpC();
    }
  }
  
  public void zzd(ConnectionResult paramConnectionResult)
  {
    Object localObject = this.zzags;
    Context localContext = this.mContext;
    int i = paramConnectionResult.getErrorCode();
    boolean bool = ((zzc)localObject).zzd(localContext, i);
    if (!bool) {
      zzpF();
    }
    bool = zzpB();
    if (!bool)
    {
      this.zzahL.zzk(paramConnectionResult);
      localObject = this.zzahL;
      ((zzk)localObject).zzqQ();
    }
  }
  
  public void zzi(Bundle paramBundle)
  {
    for (;;)
    {
      Object localObject = this.zzahN;
      boolean bool = ((Queue)localObject).isEmpty();
      if (bool) {
        break;
      }
      localObject = (zza.zza)this.zzahN.remove();
      zzb((zza.zza)localObject);
    }
    this.zzahL.zzk(paramBundle);
  }
  
  public void zzoW()
  {
    zzp localzzp = this.zzahM;
    if (localzzp != null)
    {
      localzzp = this.zzahM;
      localzzp.zzoW();
    }
  }
  
  boolean zzpB()
  {
    return this.zzahO;
  }
  
  void zzpE()
  {
    int i = 1;
    boolean bool = zzpB();
    if (bool) {}
    for (;;)
    {
      return;
      this.zzahO = i;
      Object localObject1 = this.zzahS;
      if (localObject1 == null)
      {
        localObject1 = this.mContext.getApplicationContext();
        localObject2 = new com/google/android/gms/common/api/internal/zzj$zzc;
        ((zzj.zzc)localObject2).<init>(this);
        zzc localzzc = this.zzags;
        localObject1 = (zzj.zzc)zzn.zza((Context)localObject1, (zzn)localObject2, localzzc);
        this.zzahS = ((zzj.zzc)localObject1);
      }
      localObject1 = this.zzahR;
      Object localObject2 = this.zzahR.obtainMessage(i);
      long l = this.zzahP;
      ((zzj.zza)localObject1).sendMessageDelayed((Message)localObject2, l);
      localObject1 = this.zzahR;
      localObject2 = this.zzahR;
      int j = 2;
      localObject2 = ((zzj.zza)localObject2).obtainMessage(j);
      l = this.zzahQ;
      ((zzj.zza)localObject1).sendMessageDelayed((Message)localObject2, l);
    }
  }
  
  boolean zzpF()
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = zzpB();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      this.zzahO = false;
      localObject = this.zzahR;
      int j = 2;
      ((zzj.zza)localObject).removeMessages(j);
      this.zzahR.removeMessages(i);
      localObject = this.zzahS;
      if (localObject != null)
      {
        this.zzahS.unregister();
        bool1 = false;
        localObject = null;
        this.zzahS = null;
      }
      bool1 = i;
    }
  }
  
  /* Error */
  boolean zzpG()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   8: astore_3
    //   9: aload_3
    //   10: invokeinterface 192 1 0
    //   15: aload_0
    //   16: getfield 107	com/google/android/gms/common/api/internal/zzj:zzaia	Ljava/util/Set;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnonnull +16 -> 37
    //   24: aload_0
    //   25: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 201 1 0
    //   35: iload_1
    //   36: ireturn
    //   37: aload_0
    //   38: getfield 107	com/google/android/gms/common/api/internal/zzj:zzaia	Ljava/util/Set;
    //   41: astore_3
    //   42: aload_3
    //   43: invokeinterface 775 1 0
    //   48: istore 4
    //   50: iload 4
    //   52: ifne +5 -> 57
    //   55: iconst_1
    //   56: istore_1
    //   57: aload_0
    //   58: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface 201 1 0
    //   68: goto -33 -> 35
    //   71: astore_2
    //   72: aload_0
    //   73: getfield 123	com/google/android/gms/common/api/internal/zzj:zzXG	Ljava/util/concurrent/locks/Lock;
    //   76: invokeinterface 201 1 0
    //   81: aload_2
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	zzj
    //   1	56	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   71	11	2	localObject2	Object
    //   8	55	3	localObject3	Object
    //   48	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   15	19	71	finally
    //   37	41	71	finally
    //   42	48	71	finally
  }
  
  String zzpH()
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter);
    dump("", null, localPrintWriter, null);
    return localStringWriter.toString();
  }
  
  public zzq zzr(Object paramObject)
  {
    com.google.android.gms.common.internal.zzx.zzb(paramObject, "Listener must not be null");
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new com/google/android/gms/common/api/internal/zzq;
      Object localObject3 = this.zzagr;
      ((zzq)localObject1).<init>((Looper)localObject3, paramObject);
      localObject3 = this.zzahV;
      ((Set)localObject3).add(localObject1);
      return (zzq)localObject1;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */