package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.internal.zzf;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class zzl
  implements zzp
{
  private final Context mContext;
  private final Lock zzXG;
  final zzj zzagW;
  private final com.google.android.gms.common.zzc zzags;
  final Api.zza zzagt;
  final Map zzahA;
  final Map zzahT;
  final zzf zzahz;
  private final Condition zzaim;
  private final zzl.zzb zzain;
  final Map zzaio;
  private volatile zzk zzaip;
  private ConnectionResult zzaiq;
  int zzair;
  final zzp.zza zzais;
  
  public zzl(Context paramContext, zzj paramzzj, Lock paramLock, Looper paramLooper, com.google.android.gms.common.zzc paramzzc, Map paramMap1, zzf paramzzf, Map paramMap2, Api.zza paramzza, ArrayList paramArrayList, zzp.zza paramzza1)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzaio = ((Map)localObject);
    boolean bool = false;
    localObject = null;
    this.zzaiq = null;
    this.mContext = paramContext;
    this.zzXG = paramLock;
    this.zzags = paramzzc;
    this.zzahT = paramMap1;
    this.zzahz = paramzzf;
    this.zzahA = paramMap2;
    this.zzagt = paramzza;
    this.zzagW = paramzzj;
    this.zzais = paramzza1;
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzc)localIterator.next();
      ((zzc)localObject).zza(this);
    }
    localObject = new com/google/android/gms/common/api/internal/zzl$zzb;
    ((zzl.zzb)localObject).<init>(this, paramLooper);
    this.zzain = ((zzl.zzb)localObject);
    localObject = paramLock.newCondition();
    this.zzaim = ((Condition)localObject);
    localObject = new com/google/android/gms/common/api/internal/zzi;
    ((zzi)localObject).<init>(this);
    this.zzaip = ((zzk)localObject);
  }
  
  public ConnectionResult blockingConnect()
  {
    connect();
    boolean bool;
    ConnectionResult localConnectionResult;
    int i;
    for (;;)
    {
      bool = isConnecting();
      if (bool) {
        try
        {
          Condition localCondition = this.zzaim;
          localCondition.await();
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          localConnectionResult = new com/google/android/gms/common/ConnectionResult;
          i = 15;
          localConnectionResult.<init>(i, null);
        }
      }
    }
    for (;;)
    {
      return localConnectionResult;
      bool = isConnected();
      if (bool)
      {
        localConnectionResult = ConnectionResult.zzafB;
      }
      else
      {
        localConnectionResult = this.zzaiq;
        if (localConnectionResult != null)
        {
          localConnectionResult = this.zzaiq;
        }
        else
        {
          localConnectionResult = new com/google/android/gms/common/ConnectionResult;
          i = 13;
          localConnectionResult.<init>(i, null);
        }
      }
    }
  }
  
  public ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    connect();
    long l1 = paramTimeUnit.toNanos(paramLong);
    boolean bool1 = isConnecting();
    if (bool1)
    {
      long l2 = 0L;
      bool1 = l1 < l2;
      if (bool1) {}
    }
    for (;;)
    {
      int i;
      ConnectionResult localConnectionResult2;
      try
      {
        disconnect();
        localConnectionResult1 = new com/google/android/gms/common/ConnectionResult;
        i = 14;
        bool1 = false;
        localCondition = null;
        localConnectionResult1.<init>(i, null);
      }
      catch (InterruptedException localInterruptedException)
      {
        ConnectionResult localConnectionResult1;
        Condition localCondition;
        Thread.currentThread().interrupt();
        localConnectionResult2 = new com/google/android/gms/common/ConnectionResult;
        i = 15;
        localConnectionResult2.<init>(i, null);
        continue;
      }
      return localConnectionResult1;
      localCondition = this.zzaim;
      l1 = localCondition.awaitNanos(l1);
      break;
      boolean bool2 = isConnected();
      if (bool2)
      {
        localConnectionResult2 = ConnectionResult.zzafB;
      }
      else
      {
        localConnectionResult2 = this.zzaiq;
        if (localConnectionResult2 != null)
        {
          localConnectionResult2 = this.zzaiq;
        }
        else
        {
          localConnectionResult2 = new com/google/android/gms/common/ConnectionResult;
          i = 13;
          localConnectionResult2.<init>(i, null);
        }
      }
    }
  }
  
  public void connect()
  {
    this.zzaip.connect();
  }
  
  public boolean disconnect()
  {
    zzk localzzk = this.zzaip;
    boolean bool = localzzk.disconnect();
    if (bool)
    {
      Map localMap = this.zzaio;
      localMap.clear();
    }
    return bool;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = paramString + "  ";
    localObject1 = this.zzahA.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Api)localIterator.next();
      Object localObject2 = paramPrintWriter.append(paramString);
      String str2 = ((Api)localObject1).getName();
      localObject2 = ((PrintWriter)localObject2).append(str2);
      str2 = ":";
      ((PrintWriter)localObject2).println(str2);
      localObject2 = this.zzahT;
      localObject1 = ((Api)localObject1).zzoR();
      localObject1 = (Api.zzb)((Map)localObject2).get(localObject1);
      ((Api.zzb)localObject1).dump(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public ConnectionResult getConnectionResult(Api paramApi)
  {
    Api.zzc localzzc = paramApi.zzoR();
    Object localObject = this.zzahT;
    boolean bool = ((Map)localObject).containsKey(localzzc);
    if (bool)
    {
      localObject = (Api.zzb)this.zzahT.get(localzzc);
      bool = ((Api.zzb)localObject).isConnected();
      if (bool) {
        localObject = ConnectionResult.zzafB;
      }
    }
    for (;;)
    {
      return (ConnectionResult)localObject;
      localObject = this.zzaio;
      bool = ((Map)localObject).containsKey(localzzc);
      if (bool)
      {
        localObject = (ConnectionResult)this.zzaio.get(localzzc);
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
  }
  
  public boolean isConnected()
  {
    return this.zzaip instanceof zzg;
  }
  
  public boolean isConnecting()
  {
    return this.zzaip instanceof zzh;
  }
  
  public void onConnected(Bundle paramBundle)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzaip;
      ((zzk)localObject1).onConnected(paramBundle);
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzaip;
      ((zzk)localObject1).onConnectionSuspended(paramInt);
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    return this.zzaip.zza(paramzza);
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzaip;
      ((zzk)localObject1).zza(paramConnectionResult, paramApi, paramInt);
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  void zza(zzl.zza paramzza)
  {
    Message localMessage = this.zzain.obtainMessage(1, paramzza);
    this.zzain.sendMessage(localMessage);
  }
  
  void zza(RuntimeException paramRuntimeException)
  {
    Message localMessage = this.zzain.obtainMessage(2, paramRuntimeException);
    this.zzain.sendMessage(localMessage);
  }
  
  public boolean zza(zzu paramzzu)
  {
    return false;
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    return this.zzaip.zzb(paramzza);
  }
  
  void zzh(ConnectionResult paramConnectionResult)
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      this.zzaiq = paramConnectionResult;
      localObject1 = new com/google/android/gms/common/api/internal/zzi;
      ((zzi)localObject1).<init>(this);
      this.zzaip = ((zzk)localObject1);
      localObject1 = this.zzaip;
      ((zzk)localObject1).begin();
      localObject1 = this.zzaim;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  public void zzoW() {}
  
  void zzpK()
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new com/google/android/gms/common/api/internal/zzh;
      zzf localzzf = this.zzahz;
      Map localMap = this.zzahA;
      com.google.android.gms.common.zzc localzzc = this.zzags;
      Api.zza localzza = this.zzagt;
      Lock localLock = this.zzXG;
      Context localContext = this.mContext;
      ((zzh)localObject1).<init>(this, localzzf, localMap, localzzc, localzza, localLock, localContext);
      this.zzaip = ((zzk)localObject1);
      localObject1 = this.zzaip;
      ((zzk)localObject1).begin();
      localObject1 = this.zzaim;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  void zzpL()
  {
    Object localObject1 = this.zzXG;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzagW;
      ((zzj)localObject1).zzpF();
      localObject1 = new com/google/android/gms/common/api/internal/zzg;
      ((zzg)localObject1).<init>(this);
      this.zzaip = ((zzk)localObject1);
      localObject1 = this.zzaip;
      ((zzk)localObject1).begin();
      localObject1 = this.zzaim;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      this.zzXG.unlock();
    }
  }
  
  void zzpM()
  {
    Object localObject = this.zzahT.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Api.zzb)localIterator.next();
      ((Api.zzb)localObject).disconnect();
    }
  }
  
  public void zzpj()
  {
    boolean bool = isConnected();
    if (bool)
    {
      zzg localzzg = (zzg)this.zzaip;
      localzzg.zzps();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */