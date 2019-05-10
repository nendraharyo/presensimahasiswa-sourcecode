package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.h.a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class zzd
  implements zzp
{
  private final Context mContext;
  private final Lock zzXG;
  private final zzj zzagW;
  private final zzl zzagX;
  private final zzl zzagY;
  private final Map zzagZ;
  private final Looper zzagr;
  private final Set zzaha;
  private final Api.zzb zzahb;
  private Bundle zzahc;
  private ConnectionResult zzahd;
  private ConnectionResult zzahe;
  private boolean zzahf;
  private int zzahg;
  
  public zzd(Context paramContext, zzj paramzzj, Lock paramLock, Looper paramLooper, com.google.android.gms.common.zzc paramzzc, Map paramMap1, zzf paramzzf, Map paramMap2, Api.zza paramzza, ArrayList paramArrayList)
  {
    Object localObject1 = new android/support/v4/h/a;
    ((a)localObject1).<init>();
    this.zzagZ = ((Map)localObject1);
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    localObject1 = Collections.newSetFromMap((Map)localObject1);
    this.zzaha = ((Set)localObject1);
    this.zzahd = null;
    this.zzahe = null;
    this.zzahf = false;
    boolean bool1 = false;
    this.zzahg = 0;
    this.mContext = paramContext;
    this.zzagW = paramzzj;
    this.zzXG = paramLock;
    this.zzagr = paramLooper;
    boolean bool2 = false;
    Object localObject2 = null;
    a locala1 = new android/support/v4/h/a;
    locala1.<init>();
    a locala2 = new android/support/v4/h/a;
    locala2.<init>();
    localObject1 = paramMap1.keySet();
    Object localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Api.zzc)((Iterator)localObject3).next();
      localObject4 = (Api.zzb)paramMap1.get(localObject1);
      boolean bool3 = ((Api.zzb)localObject4).zznb();
      if (bool3) {
        localObject2 = localObject4;
      }
      bool3 = ((Api.zzb)localObject4).zzmE();
      if (bool3) {
        locala1.put(localObject1, localObject4);
      } else {
        locala2.put(localObject1, localObject4);
      }
    }
    this.zzahb = ((Api.zzb)localObject2);
    bool1 = locala1.isEmpty();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
      throw ((Throwable)localObject1);
    }
    a locala3 = new android/support/v4/h/a;
    locala3.<init>();
    Object localObject5 = new android/support/v4/h/a;
    ((a)localObject5).<init>();
    localObject1 = paramMap2.keySet();
    Object localObject4 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break label438;
      }
      localObject1 = (Api)((Iterator)localObject4).next();
      localObject2 = ((Api)localObject1).zzoR();
      boolean bool4 = locala1.containsKey(localObject2);
      if (bool4)
      {
        localObject2 = paramMap2.get(localObject1);
        locala3.put(localObject1, localObject2);
      }
      else
      {
        bool2 = locala2.containsKey(localObject2);
        if (!bool2) {
          break;
        }
        localObject2 = paramMap2.get(localObject1);
        ((Map)localObject5).put(localObject1, localObject2);
      }
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Each API in the apiTypeMap must have a corresponding client in the clients map.");
    throw ((Throwable)localObject1);
    label438:
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    localObject4 = paramArrayList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break label574;
      }
      localObject1 = (zzc)((Iterator)localObject4).next();
      localObject2 = ((zzc)localObject1).zzagT;
      bool2 = locala3.containsKey(localObject2);
      if (bool2)
      {
        localArrayList.add(localObject1);
      }
      else
      {
        localObject2 = ((zzc)localObject1).zzagT;
        bool2 = ((Map)localObject5).containsKey(localObject2);
        if (!bool2) {
          break;
        }
        ((ArrayList)localObject6).add(localObject1);
      }
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
    throw ((Throwable)localObject1);
    label574:
    Object localObject7 = new com/google/android/gms/common/api/internal/zzd$1;
    ((zzd.1)localObject7).<init>(this);
    localObject1 = new com/google/android/gms/common/api/internal/zzl;
    localObject2 = this.zzagW;
    localObject4 = paramContext;
    localObject3 = paramLock;
    ((zzl)localObject1).<init>(paramContext, (zzj)localObject2, paramLock, paramLooper, paramzzc, locala2, null, (Map)localObject5, null, (ArrayList)localObject6, (zzp.zza)localObject7);
    this.zzagX = ((zzl)localObject1);
    zzd.2 local2 = new com/google/android/gms/common/api/internal/zzd$2;
    local2.<init>(this);
    zzl localzzl = new com/google/android/gms/common/api/internal/zzl;
    zzj localzzj = this.zzagW;
    localObject5 = paramContext;
    localObject6 = paramLock;
    localObject7 = paramLooper;
    localzzl.<init>(paramContext, localzzj, paramLock, paramLooper, paramzzc, locala1, paramzzf, locala3, paramzza, localArrayList, local2);
    this.zzagY = localzzl;
    localObject1 = locala2.keySet();
    localObject4 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Api.zzc)((Iterator)localObject4).next();
      localObject2 = this.zzagZ;
      localObject3 = this.zzagX;
      ((Map)localObject2).put(localObject1, localObject3);
    }
    localObject1 = locala1.keySet();
    localObject4 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Api.zzc)((Iterator)localObject4).next();
      localObject2 = this.zzagZ;
      localObject3 = this.zzagY;
      ((Map)localObject2).put(localObject1, localObject3);
    }
  }
  
  private void zzb(int paramInt, boolean paramBoolean)
  {
    this.zzagW.zzc(paramInt, paramBoolean);
    this.zzahe = null;
    this.zzahd = null;
  }
  
  private void zzb(ConnectionResult paramConnectionResult)
  {
    int i = this.zzahg;
    Object localObject;
    switch (i)
    {
    default: 
      localObject = "CompositeGAC";
      String str = "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor";
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject, str, localException);
    }
    for (;;)
    {
      this.zzahg = 0;
      return;
      localObject = this.zzagW;
      ((zzj)localObject).zzd(paramConnectionResult);
      zzpo();
    }
  }
  
  private static boolean zzc(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult != null)
    {
      bool = paramConnectionResult.isSuccess();
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean zzc(zza.zza paramzza)
  {
    Object localObject = paramzza.zzoR();
    zzx.zzb(this.zzagZ.containsKey(localObject), "GoogleApiClient is not configured to use the API required for this call.");
    localObject = (zzl)this.zzagZ.get(localObject);
    zzl localzzl = this.zzagY;
    return localObject.equals(localzzl);
  }
  
  private void zzh(Bundle paramBundle)
  {
    Bundle localBundle = this.zzahc;
    if (localBundle == null) {
      this.zzahc = paramBundle;
    }
    for (;;)
    {
      return;
      if (paramBundle != null)
      {
        localBundle = this.zzahc;
        localBundle.putAll(paramBundle);
      }
    }
  }
  
  private void zzpl()
  {
    this.zzahe = null;
    this.zzahd = null;
    this.zzagX.connect();
    this.zzagY.connect();
  }
  
  private void zzpm()
  {
    Object localObject = this.zzahd;
    boolean bool1 = zzc((ConnectionResult)localObject);
    if (bool1)
    {
      localObject = this.zzahe;
      bool1 = zzc((ConnectionResult)localObject);
      if (!bool1)
      {
        bool1 = zzpp();
        if (!bool1) {}
      }
      else
      {
        zzpn();
      }
    }
    for (;;)
    {
      return;
      localObject = this.zzahe;
      if (localObject != null)
      {
        int i = this.zzahg;
        int j = 1;
        if (i == j)
        {
          zzpo();
        }
        else
        {
          localObject = this.zzahe;
          zzb((ConnectionResult)localObject);
          localObject = this.zzagX;
          ((zzl)localObject).disconnect();
          continue;
          localObject = this.zzahd;
          if (localObject != null)
          {
            localObject = this.zzahe;
            boolean bool2 = zzc((ConnectionResult)localObject);
            if (bool2)
            {
              this.zzagY.disconnect();
              localObject = this.zzahd;
              zzb((ConnectionResult)localObject);
              continue;
            }
          }
          localObject = this.zzahd;
          if (localObject != null)
          {
            localObject = this.zzahe;
            if (localObject != null)
            {
              localObject = this.zzahd;
              zzl localzzl1 = this.zzagY;
              j = localzzl1.zzair;
              zzl localzzl2 = this.zzagX;
              int k = localzzl2.zzair;
              if (j < k) {
                localObject = this.zzahe;
              }
              zzb((ConnectionResult)localObject);
            }
          }
        }
      }
    }
  }
  
  private void zzpn()
  {
    int i = this.zzahg;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "CompositeGAC";
      localObject2 = "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor";
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject1, (String)localObject2, localException);
    }
    for (;;)
    {
      this.zzahg = 0;
      return;
      localObject1 = this.zzagW;
      localObject2 = this.zzahc;
      ((zzj)localObject1).zzi((Bundle)localObject2);
      zzpo();
    }
  }
  
  private void zzpo()
  {
    Object localObject = this.zzaha;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzu)localIterator.next();
      ((zzu)localObject).zzna();
    }
    this.zzaha.clear();
  }
  
  private boolean zzpp()
  {
    ConnectionResult localConnectionResult = this.zzahe;
    int i;
    if (localConnectionResult != null)
    {
      localConnectionResult = this.zzahe;
      i = localConnectionResult.getErrorCode();
      int k = 4;
      if (i == k) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localConnectionResult = null;
    }
  }
  
  private PendingIntent zzpq()
  {
    Object localObject = this.zzahb;
    if (localObject == null) {}
    int i;
    Intent localIntent;
    int j;
    for (localObject = null;; localObject = PendingIntent.getActivity((Context)localObject, i, localIntent, j))
    {
      return (PendingIntent)localObject;
      localObject = this.mContext;
      zzj localzzj = this.zzagW;
      i = localzzj.getSessionId();
      localIntent = this.zzahb.zznc();
      j = 134217728;
    }
  }
  
  public ConnectionResult blockingConnect()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void connect()
  {
    this.zzahg = 2;
    this.zzahf = false;
    zzpl();
  }
  
  public boolean disconnect()
  {
    boolean bool1 = false;
    this.zzahe = null;
    this.zzahd = null;
    this.zzahg = 0;
    zzl localzzl1 = this.zzagX;
    boolean bool2 = localzzl1.disconnect();
    zzl localzzl2 = this.zzagY;
    boolean bool3 = localzzl2.disconnect();
    zzpo();
    if ((bool2) && (bool3)) {
      bool1 = true;
    }
    return bool1;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    zzl localzzl = this.zzagY;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "  ";
    localzzl.dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    localzzl = this.zzagX;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "  ";
    localzzl.dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public ConnectionResult getConnectionResult(Api paramApi)
  {
    Object localObject1 = this.zzagZ;
    Object localObject2 = paramApi.zzoR();
    localObject1 = (zzl)((Map)localObject1).get(localObject2);
    localObject2 = this.zzagY;
    boolean bool = localObject1.equals(localObject2);
    if (bool)
    {
      bool = zzpp();
      if (bool)
      {
        localObject1 = new com/google/android/gms/common/ConnectionResult;
        int i = 4;
        PendingIntent localPendingIntent = zzpq();
        ((ConnectionResult)localObject1).<init>(i, localPendingIntent);
      }
    }
    for (;;)
    {
      return (ConnectionResult)localObject1;
      localObject1 = this.zzagY.getConnectionResult(paramApi);
      continue;
      localObject1 = this.zzagX.getConnectionResult(paramApi);
    }
  }
  
  /* Error */
  public boolean isConnected()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 333 1 0
    //   13: aload_0
    //   14: getfield 159	com/google/android/gms/common/api/internal/zzd:zzagX	Lcom/google/android/gms/common/api/internal/zzl;
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 336	com/google/android/gms/common/api/internal/zzl:isConnected	()Z
    //   22: istore_3
    //   23: iload_3
    //   24: ifeq +42 -> 66
    //   27: aload_0
    //   28: invokevirtual 339	com/google/android/gms/common/api/internal/zzd:zzpk	()Z
    //   31: istore_3
    //   32: iload_3
    //   33: ifne +22 -> 55
    //   36: aload_0
    //   37: invokespecial 235	com/google/android/gms/common/api/internal/zzd:zzpp	()Z
    //   40: istore_3
    //   41: iload_3
    //   42: ifne +13 -> 55
    //   45: aload_0
    //   46: getfield 60	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   49: istore_3
    //   50: iload_3
    //   51: iload_1
    //   52: if_icmpne +14 -> 66
    //   55: aload_0
    //   56: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   59: invokeinterface 342 1 0
    //   64: iload_1
    //   65: ireturn
    //   66: iconst_0
    //   67: istore_1
    //   68: aconst_null
    //   69: astore 4
    //   71: goto -16 -> 55
    //   74: astore 4
    //   76: aload_0
    //   77: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   80: invokeinterface 342 1 0
    //   85: aload 4
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	zzd
    //   1	67	1	i	int
    //   6	13	2	localObject1	Object
    //   22	20	3	bool	boolean
    //   49	4	3	j	int
    //   69	1	4	localObject2	Object
    //   74	12	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	74	finally
    //   18	22	74	finally
    //   27	31	74	finally
    //   36	40	74	finally
    //   45	49	74	finally
  }
  
  /* Error */
  public boolean isConnecting()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 333 1 0
    //   11: aload_0
    //   12: getfield 60	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   15: istore_2
    //   16: iconst_2
    //   17: istore_3
    //   18: iload_2
    //   19: iload_3
    //   20: if_icmpne +16 -> 36
    //   23: iconst_1
    //   24: istore_2
    //   25: aload_0
    //   26: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   29: invokeinterface 342 1 0
    //   34: iload_2
    //   35: ireturn
    //   36: iconst_0
    //   37: istore_2
    //   38: aconst_null
    //   39: astore_1
    //   40: goto -15 -> 25
    //   43: astore_1
    //   44: aload_0
    //   45: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   48: invokeinterface 342 1 0
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	zzd
    //   4	36	1	localLock	Lock
    //   43	11	1	localObject	Object
    //   15	20	2	i	int
    //   37	1	2	j	int
    //   17	4	3	k	int
    // Exception table:
    //   from	to	target	type
    //   11	15	43	finally
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    boolean bool = zzc(paramzza);
    Object localObject;
    if (bool)
    {
      bool = zzpp();
      if (bool)
      {
        localObject = new com/google/android/gms/common/api/Status;
        int i = 4;
        PendingIntent localPendingIntent = zzpq();
        ((Status)localObject).<init>(i, null, localPendingIntent);
        paramzza.zzw((Status)localObject);
      }
    }
    for (;;)
    {
      return paramzza;
      localObject = this.zzagY;
      paramzza = ((zzl)localObject).zza(paramzza);
      continue;
      localObject = this.zzagX;
      paramzza = ((zzl)localObject).zza(paramzza);
    }
  }
  
  /* Error */
  public boolean zza(zzu paramzzu)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   6: astore_3
    //   7: aload_3
    //   8: invokeinterface 333 1 0
    //   13: aload_0
    //   14: invokevirtual 361	com/google/android/gms/common/api/internal/zzd:isConnecting	()Z
    //   17: istore 4
    //   19: iload 4
    //   21: ifne +14 -> 35
    //   24: aload_0
    //   25: invokevirtual 362	com/google/android/gms/common/api/internal/zzd:isConnected	()Z
    //   28: istore 4
    //   30: iload 4
    //   32: ifeq +79 -> 111
    //   35: aload_0
    //   36: invokevirtual 339	com/google/android/gms/common/api/internal/zzd:zzpk	()Z
    //   39: istore 4
    //   41: iload 4
    //   43: ifne +68 -> 111
    //   46: aload_0
    //   47: getfield 52	com/google/android/gms/common/api/internal/zzd:zzaha	Ljava/util/Set;
    //   50: astore_3
    //   51: aload_3
    //   52: aload_1
    //   53: invokeinterface 363 2 0
    //   58: pop
    //   59: aload_0
    //   60: getfield 60	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   63: istore 4
    //   65: iload 4
    //   67: ifne +12 -> 79
    //   70: iconst_1
    //   71: istore 4
    //   73: aload_0
    //   74: iload 4
    //   76: putfield 60	com/google/android/gms/common/api/internal/zzd:zzahg	I
    //   79: iconst_0
    //   80: istore 4
    //   82: aconst_null
    //   83: astore_3
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 56	com/google/android/gms/common/api/internal/zzd:zzahe	Lcom/google/android/gms/common/ConnectionResult;
    //   89: aload_0
    //   90: getfield 164	com/google/android/gms/common/api/internal/zzd:zzagY	Lcom/google/android/gms/common/api/internal/zzl;
    //   93: astore_3
    //   94: aload_3
    //   95: invokevirtual 229	com/google/android/gms/common/api/internal/zzl:connect	()V
    //   98: aload_0
    //   99: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   102: astore_3
    //   103: aload_3
    //   104: invokeinterface 342 1 0
    //   109: iload_2
    //   110: ireturn
    //   111: aload_0
    //   112: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   115: invokeinterface 342 1 0
    //   120: iconst_0
    //   121: istore_2
    //   122: aconst_null
    //   123: astore 5
    //   125: goto -16 -> 109
    //   128: astore 5
    //   130: aload_0
    //   131: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   134: invokeinterface 342 1 0
    //   139: aload 5
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	zzd
    //   0	142	1	paramzzu	zzu
    //   1	121	2	bool1	boolean
    //   6	98	3	localObject1	Object
    //   17	25	4	bool2	boolean
    //   63	18	4	i	int
    //   123	1	5	localObject2	Object
    //   128	12	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	128	finally
    //   24	28	128	finally
    //   35	39	128	finally
    //   46	50	128	finally
    //   52	59	128	finally
    //   59	63	128	finally
    //   74	79	128	finally
    //   85	89	128	finally
    //   89	93	128	finally
    //   94	98	128	finally
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    boolean bool = zzc(paramzza);
    Object localObject;
    if (bool)
    {
      bool = zzpp();
      if (bool)
      {
        localObject = new com/google/android/gms/common/api/Status;
        int i = 4;
        PendingIntent localPendingIntent = zzpq();
        ((Status)localObject).<init>(i, null, localPendingIntent);
        paramzza.zzw((Status)localObject);
      }
    }
    for (;;)
    {
      return paramzza;
      localObject = this.zzagY;
      paramzza = ((zzl)localObject).zzb(paramzza);
      continue;
      localObject = this.zzagX;
      paramzza = ((zzl)localObject).zzb(paramzza);
    }
  }
  
  /* Error */
  public void zzoW()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 333 1 0
    //   11: aload_0
    //   12: invokevirtual 361	com/google/android/gms/common/api/internal/zzd:isConnecting	()Z
    //   15: istore_2
    //   16: aload_0
    //   17: getfield 164	com/google/android/gms/common/api/internal/zzd:zzagY	Lcom/google/android/gms/common/api/internal/zzl;
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 243	com/google/android/gms/common/api/internal/zzl:disconnect	()Z
    //   25: pop
    //   26: new 202	com/google/android/gms/common/ConnectionResult
    //   29: astore_3
    //   30: iconst_4
    //   31: istore 4
    //   33: aload_3
    //   34: iload 4
    //   36: invokespecial 368	com/google/android/gms/common/ConnectionResult:<init>	(I)V
    //   39: aload_0
    //   40: aload_3
    //   41: putfield 56	com/google/android/gms/common/api/internal/zzd:zzahe	Lcom/google/android/gms/common/ConnectionResult;
    //   44: iload_2
    //   45: ifeq +42 -> 87
    //   48: new 370	android/os/Handler
    //   51: astore_1
    //   52: aload_0
    //   53: getfield 68	com/google/android/gms/common/api/internal/zzd:zzagr	Landroid/os/Looper;
    //   56: astore_3
    //   57: aload_1
    //   58: aload_3
    //   59: invokespecial 373	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   62: new 375	com/google/android/gms/common/api/internal/zzd$3
    //   65: astore_3
    //   66: aload_3
    //   67: aload_0
    //   68: invokespecial 376	com/google/android/gms/common/api/internal/zzd$3:<init>	(Lcom/google/android/gms/common/api/internal/zzd;)V
    //   71: aload_1
    //   72: aload_3
    //   73: invokevirtual 380	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   76: pop
    //   77: aload_0
    //   78: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   81: invokeinterface 342 1 0
    //   86: return
    //   87: aload_0
    //   88: invokespecial 197	com/google/android/gms/common/api/internal/zzd:zzpo	()V
    //   91: goto -14 -> 77
    //   94: astore_1
    //   95: aload_0
    //   96: getfield 66	com/google/android/gms/common/api/internal/zzd:zzXG	Ljava/util/concurrent/locks/Lock;
    //   99: invokeinterface 342 1 0
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zzd
    //   4	68	1	localObject1	Object
    //   94	11	1	localObject2	Object
    //   15	30	2	bool	boolean
    //   20	53	3	localObject3	Object
    //   31	4	4	i	int
    // Exception table:
    //   from	to	target	type
    //   11	15	94	finally
    //   16	20	94	finally
    //   21	26	94	finally
    //   26	29	94	finally
    //   34	39	94	finally
    //   40	44	94	finally
    //   48	51	94	finally
    //   52	56	94	finally
    //   58	62	94	finally
    //   62	65	94	finally
    //   67	71	94	finally
    //   72	77	94	finally
    //   87	91	94	finally
  }
  
  public void zzpj()
  {
    this.zzagX.zzpj();
    this.zzagY.zzpj();
  }
  
  public boolean zzpk()
  {
    return this.zzagY.isConnected();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */