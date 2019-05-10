package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzk
  implements Handler.Callback
{
  private final Handler mHandler;
  private final zzk.zza zzalQ;
  private final ArrayList zzalR;
  final ArrayList zzalS;
  private final ArrayList zzalT;
  private volatile boolean zzalU;
  private final AtomicInteger zzalV;
  private boolean zzalW;
  private final Object zzpV;
  
  public zzk(Looper paramLooper, zzk.zza paramzza)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzalR = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzalS = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzalT = ((ArrayList)localObject);
    this.zzalU = false;
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    this.zzalV = ((AtomicInteger)localObject);
    this.zzalW = false;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzalQ = paramzza;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>(paramLooper, this);
    this.mHandler = ((Handler)localObject);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    if (j == i) {}
    Object localObject2;
    for (GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)paramMessage.obj;; localObject2 = null)
    {
      synchronized (this.zzpV)
      {
        boolean bool = this.zzalU;
        if (bool)
        {
          Object localObject4 = this.zzalQ;
          bool = ((zzk.zza)localObject4).isConnected();
          if (bool)
          {
            localObject4 = this.zzalR;
            bool = ((ArrayList)localObject4).contains(localConnectionCallbacks);
            if (bool)
            {
              localObject4 = this.zzalQ;
              localObject4 = ((zzk.zza)localObject4).zzoi();
              localConnectionCallbacks.onConnected((Bundle)localObject4);
            }
          }
        }
        j = i;
        return j;
      }
      Object localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append("Don't know how to handle message: ");
      int m = paramMessage.what;
      localObject5 = m;
      ??? = new java/lang/Exception;
      ((Exception)???).<init>();
      Log.wtf("GmsClientEvents", (String)localObject5, (Throwable)???);
      int k = 0;
    }
  }
  
  public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (this.zzpV)
    {
      ArrayList localArrayList = this.zzalR;
      boolean bool = localArrayList.contains(paramConnectionCallbacks);
      return bool;
    }
  }
  
  public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (this.zzpV)
    {
      ArrayList localArrayList = this.zzalT;
      boolean bool = localArrayList.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }
  
  public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzalR;
      boolean bool = ((ArrayList)localObject2).contains(paramConnectionCallbacks);
      if (bool)
      {
        localObject2 = "GmsClientEvents";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "registerConnectionCallbacks(): listener ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(paramConnectionCallbacks);
        str = " is already registered";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject2, (String)localObject4);
        localObject2 = this.zzalQ;
        bool = ((zzk.zza)localObject2).isConnected();
        if (bool)
        {
          localObject2 = this.mHandler;
          ??? = this.mHandler;
          int i = 1;
          ??? = ((Handler)???).obtainMessage(i, paramConnectionCallbacks);
          ((Handler)localObject2).sendMessage((Message)???);
        }
        return;
      }
      localObject2 = this.zzalR;
      ((ArrayList)localObject2).add(paramConnectionCallbacks);
    }
  }
  
  public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzalT;
      boolean bool = ((ArrayList)localObject2).contains(paramOnConnectionFailedListener);
      if (bool)
      {
        localObject2 = "GmsClientEvents";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "registerConnectionFailedListener(): listener ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(paramOnConnectionFailedListener);
        str = " is already registered";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject2, (String)localObject4);
        return;
      }
      localObject2 = this.zzalT;
      ((ArrayList)localObject2).add(paramOnConnectionFailedListener);
    }
  }
  
  public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzz(paramConnectionCallbacks);
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzalR;
      boolean bool = ((ArrayList)localObject2).remove(paramConnectionCallbacks);
      if (!bool)
      {
        localObject2 = "GmsClientEvents";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "unregisterConnectionCallbacks(): listener ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(paramConnectionCallbacks);
        str = " not found";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject2, (String)localObject4);
      }
      do
      {
        return;
        bool = this.zzalW;
      } while (!bool);
      localObject2 = this.zzalS;
      ((ArrayList)localObject2).add(paramConnectionCallbacks);
    }
  }
  
  public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzz(paramOnConnectionFailedListener);
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzalT;
      boolean bool = ((ArrayList)localObject2).remove(paramOnConnectionFailedListener);
      if (!bool)
      {
        localObject2 = "GmsClientEvents";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "unregisterConnectionFailedListener(): listener ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(paramOnConnectionFailedListener);
        str = " not found";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject2, (String)localObject4);
      }
      return;
    }
  }
  
  /* Error */
  public void zzbT(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_1
    //   5: istore 4
    //   7: invokestatic 158	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   10: astore 5
    //   12: aload_0
    //   13: getfield 56	com/google/android/gms/common/internal/zzk:mHandler	Landroid/os/Handler;
    //   16: invokevirtual 161	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   19: astore 6
    //   21: aload 5
    //   23: aload 6
    //   25: if_acmpne +6 -> 31
    //   28: iload 4
    //   30: istore_2
    //   31: ldc -93
    //   33: astore 5
    //   35: iload_2
    //   36: aload 5
    //   38: invokestatic 167	com/google/android/gms/common/internal/zzx:zza	(ZLjava/lang/Object;)V
    //   41: aload_0
    //   42: getfield 56	com/google/android/gms/common/internal/zzk:mHandler	Landroid/os/Handler;
    //   45: astore_3
    //   46: aload_3
    //   47: iload 4
    //   49: invokevirtual 170	android/os/Handler:removeMessages	(I)V
    //   52: aload_0
    //   53: getfield 47	com/google/android/gms/common/internal/zzk:zzpV	Ljava/lang/Object;
    //   56: astore 7
    //   58: aload 7
    //   60: monitorenter
    //   61: iconst_1
    //   62: istore_2
    //   63: aload_0
    //   64: iload_2
    //   65: putfield 45	com/google/android/gms/common/internal/zzk:zzalW	Z
    //   68: new 27	java/util/ArrayList
    //   71: astore_3
    //   72: aload_0
    //   73: getfield 30	com/google/android/gms/common/internal/zzk:zzalR	Ljava/util/ArrayList;
    //   76: astore 5
    //   78: aload_3
    //   79: aload 5
    //   81: invokespecial 173	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   84: aload_0
    //   85: getfield 43	com/google/android/gms/common/internal/zzk:zzalV	Ljava/util/concurrent/atomic/AtomicInteger;
    //   88: astore 5
    //   90: aload 5
    //   92: invokevirtual 177	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   95: istore 8
    //   97: aload_3
    //   98: invokevirtual 181	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   101: astore 6
    //   103: aload 6
    //   105: invokeinterface 186 1 0
    //   110: istore_2
    //   111: iload_2
    //   112: ifeq +47 -> 159
    //   115: aload 6
    //   117: invokeinterface 190 1 0
    //   122: astore_3
    //   123: aload_3
    //   124: checkcast 68	com/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks
    //   127: astore_3
    //   128: aload_0
    //   129: getfield 36	com/google/android/gms/common/internal/zzk:zzalU	Z
    //   132: istore 9
    //   134: iload 9
    //   136: ifeq +23 -> 159
    //   139: aload_0
    //   140: getfield 43	com/google/android/gms/common/internal/zzk:zzalV	Ljava/util/concurrent/atomic/AtomicInteger;
    //   143: astore 10
    //   145: aload 10
    //   147: invokevirtual 177	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   150: istore 9
    //   152: iload 9
    //   154: iload 8
    //   156: if_icmpeq +25 -> 181
    //   159: aload_0
    //   160: getfield 32	com/google/android/gms/common/internal/zzk:zzalS	Ljava/util/ArrayList;
    //   163: astore_3
    //   164: aload_3
    //   165: invokevirtual 193	java/util/ArrayList:clear	()V
    //   168: iconst_0
    //   169: istore_2
    //   170: aconst_null
    //   171: astore_3
    //   172: aload_0
    //   173: iconst_0
    //   174: putfield 45	com/google/android/gms/common/internal/zzk:zzalW	Z
    //   177: aload 7
    //   179: monitorexit
    //   180: return
    //   181: aload_0
    //   182: getfield 30	com/google/android/gms/common/internal/zzk:zzalR	Ljava/util/ArrayList;
    //   185: astore 10
    //   187: aload 10
    //   189: aload_3
    //   190: invokevirtual 78	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   193: istore 9
    //   195: iload 9
    //   197: ifeq -94 -> 103
    //   200: aload_3
    //   201: iload_1
    //   202: invokeinterface 196 2 0
    //   207: goto -104 -> 103
    //   210: astore_3
    //   211: aload 7
    //   213: monitorexit
    //   214: aload_3
    //   215: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	zzk
    //   0	216	1	paramInt	int
    //   1	169	2	bool1	boolean
    //   3	198	3	localObject1	Object
    //   210	5	3	localObject2	Object
    //   5	43	4	i	int
    //   10	81	5	localObject3	Object
    //   19	97	6	localObject4	Object
    //   56	156	7	localObject5	Object
    //   95	62	8	j	int
    //   132	3	9	bool2	boolean
    //   150	7	9	k	int
    //   193	3	9	bool3	boolean
    //   143	45	10	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   64	68	210	finally
    //   68	71	210	finally
    //   72	76	210	finally
    //   79	84	210	finally
    //   84	88	210	finally
    //   90	95	210	finally
    //   97	101	210	finally
    //   103	110	210	finally
    //   115	122	210	finally
    //   123	127	210	finally
    //   128	132	210	finally
    //   139	143	210	finally
    //   145	150	210	finally
    //   159	163	210	finally
    //   164	168	210	finally
    //   173	177	210	finally
    //   177	180	210	finally
    //   181	185	210	finally
    //   189	193	210	finally
    //   201	207	210	finally
    //   211	214	210	finally
  }
  
  public void zzk(Bundle paramBundle)
  {
    Iterator localIterator = null;
    boolean bool1 = true;
    Object localObject1 = Looper.myLooper();
    ??? = this.mHandler.getLooper();
    boolean bool2;
    if (localObject1 == ???) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zza(bool2, "onConnectionSuccess must only be called on the Handler thread");
      synchronized (this.zzpV)
      {
        bool2 = this.zzalW;
        label58:
        label106:
        Object localObject4;
        int i;
        if (!bool2)
        {
          bool2 = bool1;
          zzx.zzab(bool2);
          localObject1 = this.mHandler;
          int k = 1;
          ((Handler)localObject1).removeMessages(k);
          bool2 = true;
          this.zzalW = bool2;
          localObject1 = this.zzalS;
          int j = ((ArrayList)localObject1).size();
          if (j != 0) {
            break label268;
          }
          zzx.zzab(bool1);
          localObject1 = new java/util/ArrayList;
          localObject4 = this.zzalR;
          ((ArrayList)localObject1).<init>((Collection)localObject4);
          localObject4 = this.zzalV;
          i = ((AtomicInteger)localObject4).get();
          localIterator = ((ArrayList)localObject1).iterator();
        }
        label268:
        label276:
        boolean bool5;
        do
        {
          boolean bool3 = localIterator.hasNext();
          if (bool3)
          {
            localObject1 = localIterator.next();
            localObject1 = (GoogleApiClient.ConnectionCallbacks)localObject1;
            boolean bool4 = this.zzalU;
            if (bool4)
            {
              localObject5 = this.zzalQ;
              bool4 = ((zzk.zza)localObject5).isConnected();
              if (bool4)
              {
                localObject5 = this.zzalV;
                int m = ((AtomicInteger)localObject5).get();
                if (m == i) {
                  break label276;
                }
              }
            }
          }
          localObject1 = this.zzalS;
          ((ArrayList)localObject1).clear();
          bool3 = false;
          localObject1 = null;
          this.zzalW = false;
          return;
          bool3 = false;
          localObject1 = null;
          break;
          bool3 = false;
          localObject1 = null;
          break label58;
          i = 0;
          localObject4 = null;
          break label106;
          Object localObject5 = this.zzalS;
          bool5 = ((ArrayList)localObject5).contains(localObject1);
        } while (bool5);
        ((GoogleApiClient.ConnectionCallbacks)localObject1).onConnected(paramBundle);
      }
    }
  }
  
  public void zzk(ConnectionResult paramConnectionResult)
  {
    int i = 1;
    Object localObject1 = Looper.myLooper();
    Object localObject3 = this.mHandler.getLooper();
    if (localObject1 == localObject3)
    {
      int j = i;
      localObject3 = "onConnectionFailure must only be called on the Handler thread";
      zzx.zza(j, localObject3);
      localObject1 = this.mHandler;
      ((Handler)localObject1).removeMessages(i);
    }
    for (;;)
    {
      synchronized (this.zzpV)
      {
        localObject1 = new java/util/ArrayList;
        localObject3 = this.zzalT;
        ((ArrayList)localObject1).<init>((Collection)localObject3);
        localObject3 = this.zzalV;
        int k = ((AtomicInteger)localObject3).get();
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        boolean bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (GoogleApiClient.OnConnectionFailedListener)localObject1;
          boolean bool2 = this.zzalU;
          if (bool2)
          {
            localObject5 = this.zzalV;
            int m = ((AtomicInteger)localObject5).get();
            if (m == k) {}
          }
          else
          {
            return;
            bool1 = false;
            localObject1 = null;
            break;
          }
          Object localObject5 = this.zzalT;
          boolean bool3 = ((ArrayList)localObject5).contains(localObject1);
          if (!bool3) {
            continue;
          }
          ((GoogleApiClient.OnConnectionFailedListener)localObject1).onConnectionFailed(paramConnectionResult);
        }
      }
    }
  }
  
  public void zzqQ()
  {
    this.zzalU = false;
    this.zzalV.incrementAndGet();
  }
  
  public void zzqR()
  {
    this.zzalU = true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */