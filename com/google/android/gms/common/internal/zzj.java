package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzj
  implements Api.zzb, zzk.zza
{
  public static final String[] zzalJ;
  private final Context mContext;
  final Handler mHandler;
  private final Account zzTI;
  private final Set zzXf;
  private final Looper zzagr;
  private final zzc zzags;
  private final zzf zzahz;
  private GoogleApiClient.zza zzalA;
  private IInterface zzalB;
  private final ArrayList zzalC;
  private zzj.zze zzalD;
  private int zzalE;
  private final GoogleApiClient.ConnectionCallbacks zzalF;
  private final GoogleApiClient.OnConnectionFailedListener zzalG;
  private final int zzalH;
  protected AtomicInteger zzalI;
  private int zzals;
  private long zzalt;
  private long zzalu;
  private int zzalv;
  private long zzalw;
  private final zzl zzalx;
  private final Object zzaly;
  private zzs zzalz;
  private final Object zzpV;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "service_esmobile";
    arrayOfString[1] = "service_googleme";
    zzalJ = arrayOfString;
  }
  
  protected zzj(Context paramContext, Looper paramLooper, int paramInt, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, localzzl, localzzc, paramInt, paramzzf, localConnectionCallbacks, localOnConnectionFailedListener);
  }
  
  protected zzj(Context paramContext, Looper paramLooper, zzl paramzzl, zzc paramzzc, int paramInt, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzaly = localObject;
    localObject = new com/google/android/gms/common/internal/zzj$zzf;
    ((zzj.zzf)localObject).<init>(this);
    this.zzalA = ((GoogleApiClient.zza)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzalC = ((ArrayList)localObject);
    this.zzalE = 1;
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    this.zzalI = ((AtomicInteger)localObject);
    localObject = (Context)zzx.zzb(paramContext, "Context must not be null");
    this.mContext = ((Context)localObject);
    localObject = (Looper)zzx.zzb(paramLooper, "Looper must not be null");
    this.zzagr = ((Looper)localObject);
    localObject = (zzl)zzx.zzb(paramzzl, "Supervisor must not be null");
    this.zzalx = ((zzl)localObject);
    localObject = (zzc)zzx.zzb(paramzzc, "API availability must not be null");
    this.zzags = ((zzc)localObject);
    localObject = new com/google/android/gms/common/internal/zzj$zzb;
    ((zzj.zzb)localObject).<init>(this, paramLooper);
    this.mHandler = ((Handler)localObject);
    this.zzalH = paramInt;
    localObject = (zzf)zzx.zzz(paramzzf);
    this.zzahz = ((zzf)localObject);
    localObject = paramzzf.getAccount();
    this.zzTI = ((Account)localObject);
    localObject = paramzzf.zzqt();
    localObject = zza((Set)localObject);
    this.zzXf = ((Set)localObject);
    this.zzalF = paramConnectionCallbacks;
    this.zzalG = paramOnConnectionFailedListener;
  }
  
  private Set zza(Set paramSet)
  {
    Set localSet = zzb(paramSet);
    if (localSet == null) {}
    for (Object localObject = localSet;; localObject = localSet)
    {
      return (Set)localObject;
      Iterator localIterator = localSet.iterator();
      boolean bool;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Scope)localIterator.next();
        bool = paramSet.contains(localObject);
      } while (bool);
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Expanding scopes is not permitted, use implied scopes instead");
      throw ((Throwable)localObject);
    }
  }
  
  private boolean zza(int paramInt1, int paramInt2, IInterface paramIInterface)
  {
    synchronized (this.zzpV)
    {
      int i = this.zzalE;
      if (i != paramInt1)
      {
        i = 0;
        Object localObject2 = null;
        return i;
      }
      zzb(paramInt2, paramIInterface);
      i = 1;
    }
  }
  
  private void zzb(int paramInt, IInterface paramIInterface)
  {
    int i = 1;
    ??? = null;
    int j = 3;
    int k;
    if (paramInt == j)
    {
      k = i;
      if (paramIInterface == null) {
        break label98;
      }
      j = i;
      label24:
      if (k != j) {
        break label104;
      }
      zzx.zzac(i);
    }
    for (;;)
    {
      synchronized (this.zzpV)
      {
        this.zzalE = paramInt;
        this.zzalB = paramIInterface;
        zzc(paramInt, paramIInterface);
        switch (paramInt)
        {
        default: 
          return;
          k = 0;
          break;
          j = 0;
          break label24;
          i = 0;
          Object localObject2 = null;
          break;
        case 2: 
          label98:
          label104:
          zzqE();
        }
      }
      zza(paramIInterface);
      continue;
      zzqF();
    }
  }
  
  private void zzqE()
  {
    Object localObject1 = this.zzalD;
    if (localObject1 != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Calling connect() while still connected, missing disconnect() for ");
      localObject3 = zzgu();
      localObject2 = (String)localObject3;
      Log.e("GmsClient", (String)localObject2);
      localObject1 = this.zzalx;
      localObject2 = zzgu();
      localObject3 = this.zzalD;
      str = zzqD();
      ((zzl)localObject1).zzb((String)localObject2, (ServiceConnection)localObject3, str);
      localObject1 = this.zzalI;
      ((AtomicInteger)localObject1).incrementAndGet();
    }
    localObject1 = new com/google/android/gms/common/internal/zzj$zze;
    int i = this.zzalI.get();
    ((zzj.zze)localObject1).<init>(this, i);
    this.zzalD = ((zzj.zze)localObject1);
    localObject1 = this.zzalx;
    Object localObject2 = zzgu();
    Object localObject3 = this.zzalD;
    String str = zzqD();
    boolean bool = ((zzl)localObject1).zza((String)localObject2, (ServiceConnection)localObject3, str);
    if (!bool)
    {
      localObject1 = "GmsClient";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("unable to connect to service: ");
      localObject3 = zzgu();
      localObject2 = (String)localObject3;
      Log.e((String)localObject1, (String)localObject2);
      int j = 8;
      localObject2 = this.zzalI;
      i = ((AtomicInteger)localObject2).get();
      zzm(j, i);
    }
  }
  
  private void zzqF()
  {
    Object localObject = this.zzalD;
    if (localObject != null)
    {
      localObject = this.zzalx;
      String str1 = zzgu();
      zzj.zze localzze = this.zzalD;
      String str2 = zzqD();
      ((zzl)localObject).zzb(str1, localzze, str2);
      localObject = null;
      this.zzalD = null;
    }
  }
  
  public void disconnect()
  {
    Object localObject1 = this.zzalI;
    ((AtomicInteger)localObject1).incrementAndGet();
    synchronized (this.zzalC)
    {
      localObject1 = this.zzalC;
      int i = ((ArrayList)localObject1).size();
      int j = 0;
      localObject1 = null;
      int k = 0;
      localObject4 = null;
      while (k < i)
      {
        localObject1 = this.zzalC;
        localObject1 = ((ArrayList)localObject1).get(k);
        localObject1 = (zzj.zzc)localObject1;
        ((zzj.zzc)localObject1).zzqO();
        j = k + 1;
        k = j;
      }
      localObject1 = this.zzalC;
      ((ArrayList)localObject1).clear();
      localObject4 = this.zzaly;
      j = 0;
      localObject1 = null;
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    long l1 = 0L;
    for (;;)
    {
      Object localObject2;
      synchronized (this.zzpV)
      {
        int i = this.zzalE;
        localObject2 = this.zzalB;
        ??? = paramPrintWriter.append(paramString);
        Object localObject3 = "mConnectState=";
        ((PrintWriter)???).append((CharSequence)localObject3);
        switch (i)
        {
        default: 
          Object localObject4 = "UNKNOWN";
          paramPrintWriter.print((String)localObject4);
          localObject4 = " mService=";
          paramPrintWriter.append((CharSequence)localObject4);
          if (localObject2 != null) {
            break label629;
          }
          localObject4 = "null";
          paramPrintWriter.println((String)localObject4);
          localObject4 = new java/text/SimpleDateFormat;
          ??? = "yyyy-MM-dd HH:mm:ss.SSS";
          localObject2 = Locale.US;
          ((SimpleDateFormat)localObject4).<init>((String)???, (Locale)localObject2);
          long l2 = this.zzalu;
          boolean bool1 = l2 < l1;
          long l3;
          if (bool1)
          {
            ??? = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            l3 = this.zzalu;
            localObject2 = ((StringBuilder)localObject2).append(l3).append(" ");
            localObject3 = new java/util/Date;
            l3 = this.zzalu;
            ((Date)localObject3).<init>(l3);
            localObject3 = ((SimpleDateFormat)localObject4).format((Date)localObject3);
            localObject2 = (String)localObject3;
            ((PrintWriter)???).println((String)localObject2);
          }
          l2 = this.zzalt;
          bool1 = l2 < l1;
          int j;
          if (bool1)
          {
            ??? = paramPrintWriter.append(paramString);
            localObject2 = "lastSuspendedCause=";
            ((PrintWriter)???).append((CharSequence)localObject2);
            j = this.zzals;
          }
          switch (j)
          {
          default: 
            j = this.zzals;
            ??? = String.valueOf(j);
            paramPrintWriter.append((CharSequence)???);
            ??? = paramPrintWriter.append(" lastSuspendedTime=");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            l3 = this.zzalt;
            localObject2 = ((StringBuilder)localObject2).append(l3).append(" ");
            localObject3 = new java/util/Date;
            l3 = this.zzalt;
            ((Date)localObject3).<init>(l3);
            localObject3 = ((SimpleDateFormat)localObject4).format((Date)localObject3);
            localObject2 = (String)localObject3;
            ((PrintWriter)???).println((String)localObject2);
            l2 = this.zzalw;
            boolean bool2 = l2 < l1;
            if (bool2)
            {
              ??? = paramPrintWriter.append(paramString).append("lastFailedStatus=");
              int m = this.zzalv;
              localObject2 = CommonStatusCodes.getStatusCodeString(m);
              ((PrintWriter)???).append((CharSequence)localObject2);
              ??? = paramPrintWriter.append(" lastFailedTime=");
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              l3 = this.zzalw;
              localObject2 = ((StringBuilder)localObject2).append(l3).append(" ");
              localObject3 = new java/util/Date;
              l3 = this.zzalw;
              ((Date)localObject3).<init>(l3);
              localObject4 = ((SimpleDateFormat)localObject4).format((Date)localObject3);
              localObject4 = (String)localObject4;
              ((PrintWriter)???).println((String)localObject4);
            }
            return;
          }
          break;
        }
      }
      Object localObject6 = "CONNECTING";
      paramPrintWriter.print((String)localObject6);
      continue;
      localObject6 = "CONNECTED";
      paramPrintWriter.print((String)localObject6);
      continue;
      localObject6 = "DISCONNECTING";
      paramPrintWriter.print((String)localObject6);
      continue;
      localObject6 = "DISCONNECTED";
      paramPrintWriter.print((String)localObject6);
      continue;
      label629:
      localObject6 = zzgv();
      localObject6 = paramPrintWriter.append((CharSequence)localObject6).append("@");
      int k = System.identityHashCode(((IInterface)localObject2).asBinder());
      ??? = Integer.toHexString(k);
      ((PrintWriter)localObject6).println((String)???);
      continue;
      ??? = "CAUSE_SERVICE_DISCONNECTED";
      paramPrintWriter.append((CharSequence)???);
      continue;
      ??? = "CAUSE_NETWORK_LOST";
      paramPrintWriter.append((CharSequence)???);
    }
  }
  
  public final Context getContext()
  {
    return this.mContext;
  }
  
  public final Looper getLooper()
  {
    return this.zzagr;
  }
  
  public boolean isConnected()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzalE;
      int k = 3;
      if (i == k)
      {
        i = 1;
        return i;
      }
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean isConnecting()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzalE;
      int k = 2;
      if (i == k)
      {
        i = 1;
        return i;
      }
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  protected void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    int i = paramConnectionResult.getErrorCode();
    this.zzalv = i;
    long l = System.currentTimeMillis();
    this.zzalw = l;
  }
  
  protected void onConnectionSuspended(int paramInt)
  {
    this.zzals = paramInt;
    long l = System.currentTimeMillis();
    this.zzalt = l;
  }
  
  protected abstract IInterface zzW(IBinder paramIBinder);
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = this.mHandler;
    Object localObject = this.mHandler;
    zzj.zzg localzzg = new com/google/android/gms/common/internal/zzj$zzg;
    localzzg.<init>(this, paramInt1, paramIBinder, paramBundle);
    localObject = ((Handler)localObject).obtainMessage(1, paramInt2, -1, localzzg);
    localHandler.sendMessage((Message)localObject);
  }
  
  protected void zza(IInterface paramIInterface)
  {
    long l = System.currentTimeMillis();
    this.zzalu = l;
  }
  
  public void zza(GoogleApiClient.zza paramzza)
  {
    GoogleApiClient.zza localzza = (GoogleApiClient.zza)zzx.zzb(paramzza, "Connection progress callbacks cannot be null.");
    this.zzalA = localzza;
    zzb(2, null);
  }
  
  /* Error */
  public void zza(zzp paramzzp, Set paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 442	com/google/android/gms/common/internal/zzj:zzml	()Landroid/os/Bundle;
    //   4: astore_3
    //   5: new 444	com/google/android/gms/common/internal/GetServiceRequest
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 151	com/google/android/gms/common/internal/zzj:zzalH	I
    //   14: istore 5
    //   16: aload 4
    //   18: iload 5
    //   20: invokespecial 445	com/google/android/gms/common/internal/GetServiceRequest:<init>	(I)V
    //   23: aload_0
    //   24: getfield 128	com/google/android/gms/common/internal/zzj:mContext	Landroid/content/Context;
    //   27: astore 6
    //   29: aload 6
    //   31: invokevirtual 448	android/content/Context:getPackageName	()Ljava/lang/String;
    //   34: astore 6
    //   36: aload 4
    //   38: aload 6
    //   40: invokevirtual 452	com/google/android/gms/common/internal/GetServiceRequest:zzcG	(Ljava/lang/String;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   43: astore 4
    //   45: aload 4
    //   47: aload_3
    //   48: invokevirtual 456	com/google/android/gms/common/internal/GetServiceRequest:zzj	(Landroid/os/Bundle;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   51: astore_3
    //   52: aload_2
    //   53: ifnull +9 -> 62
    //   56: aload_3
    //   57: aload_2
    //   58: invokevirtual 460	com/google/android/gms/common/internal/GetServiceRequest:zzd	(Ljava/util/Collection;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   61: pop
    //   62: aload_0
    //   63: invokevirtual 463	com/google/android/gms/common/internal/zzj:zzmE	()Z
    //   66: istore 7
    //   68: iload 7
    //   70: ifeq +90 -> 160
    //   73: aload_0
    //   74: invokevirtual 466	com/google/android/gms/common/internal/zzj:zzqq	()Landroid/accounts/Account;
    //   77: astore 4
    //   79: aload_3
    //   80: aload 4
    //   82: invokevirtual 469	com/google/android/gms/common/internal/GetServiceRequest:zzc	(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   85: astore 4
    //   87: aload 4
    //   89: aload_1
    //   90: invokevirtual 472	com/google/android/gms/common/internal/GetServiceRequest:zzb	(Lcom/google/android/gms/common/internal/zzp;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   93: pop
    //   94: aload_0
    //   95: getfield 97	com/google/android/gms/common/internal/zzj:zzaly	Ljava/lang/Object;
    //   98: astore 4
    //   100: aload 4
    //   102: monitorenter
    //   103: aload_0
    //   104: getfield 177	com/google/android/gms/common/internal/zzj:zzalz	Lcom/google/android/gms/common/internal/zzs;
    //   107: astore 6
    //   109: aload 6
    //   111: ifnull +104 -> 215
    //   114: aload_0
    //   115: getfield 177	com/google/android/gms/common/internal/zzj:zzalz	Lcom/google/android/gms/common/internal/zzs;
    //   118: astore 6
    //   120: new 474	com/google/android/gms/common/internal/zzj$zzd
    //   123: astore 8
    //   125: aload_0
    //   126: getfield 118	com/google/android/gms/common/internal/zzj:zzalI	Ljava/util/concurrent/atomic/AtomicInteger;
    //   129: astore 9
    //   131: aload 9
    //   133: invokevirtual 274	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   136: istore 10
    //   138: aload 8
    //   140: aload_0
    //   141: iload 10
    //   143: invokespecial 475	com/google/android/gms/common/internal/zzj$zzd:<init>	(Lcom/google/android/gms/common/internal/zzj;I)V
    //   146: aload 6
    //   148: aload 8
    //   150: aload_3
    //   151: invokeinterface 480 3 0
    //   156: aload 4
    //   158: monitorexit
    //   159: return
    //   160: aload_0
    //   161: invokevirtual 483	com/google/android/gms/common/internal/zzj:zzqK	()Z
    //   164: istore 7
    //   166: iload 7
    //   168: ifeq -74 -> 94
    //   171: aload_0
    //   172: getfield 161	com/google/android/gms/common/internal/zzj:zzTI	Landroid/accounts/Account;
    //   175: astore 4
    //   177: aload_3
    //   178: aload 4
    //   180: invokevirtual 469	com/google/android/gms/common/internal/GetServiceRequest:zzc	(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   183: pop
    //   184: goto -90 -> 94
    //   187: astore_3
    //   188: ldc -19
    //   190: astore_3
    //   191: ldc_w 485
    //   194: astore 4
    //   196: aload_3
    //   197: aload 4
    //   199: invokestatic 488	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   202: pop
    //   203: iconst_1
    //   204: istore 11
    //   206: aload_0
    //   207: iload 11
    //   209: invokevirtual 491	com/google/android/gms/common/internal/zzj:zzbS	(I)V
    //   212: goto -53 -> 159
    //   215: ldc -19
    //   217: astore_3
    //   218: ldc_w 493
    //   221: astore 6
    //   223: aload_3
    //   224: aload 6
    //   226: invokestatic 488	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   229: pop
    //   230: goto -74 -> 156
    //   233: astore_3
    //   234: aload 4
    //   236: monitorexit
    //   237: aload_3
    //   238: athrow
    //   239: astore_3
    //   240: ldc -19
    //   242: astore 4
    //   244: ldc_w 495
    //   247: astore 6
    //   249: aload 4
    //   251: aload 6
    //   253: aload_3
    //   254: invokestatic 498	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   257: pop
    //   258: goto -99 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	zzj
    //   0	261	1	paramzzp	zzp
    //   0	261	2	paramSet	Set
    //   4	174	3	localObject1	Object
    //   187	1	3	localDeadObjectException	DeadObjectException
    //   190	34	3	str	String
    //   233	5	3	localObject2	Object
    //   239	15	3	localRemoteException	android.os.RemoteException
    //   14	5	5	i	int
    //   27	225	6	localObject4	Object
    //   66	101	7	bool	boolean
    //   123	26	8	localzzd	zzj.zzd
    //   129	3	9	localAtomicInteger	AtomicInteger
    //   136	6	10	j	int
    //   204	4	11	k	int
    // Exception table:
    //   from	to	target	type
    //   0	4	187	android/os/DeadObjectException
    //   5	8	187	android/os/DeadObjectException
    //   10	14	187	android/os/DeadObjectException
    //   18	23	187	android/os/DeadObjectException
    //   23	27	187	android/os/DeadObjectException
    //   29	34	187	android/os/DeadObjectException
    //   38	43	187	android/os/DeadObjectException
    //   47	51	187	android/os/DeadObjectException
    //   57	62	187	android/os/DeadObjectException
    //   62	66	187	android/os/DeadObjectException
    //   73	77	187	android/os/DeadObjectException
    //   80	85	187	android/os/DeadObjectException
    //   89	94	187	android/os/DeadObjectException
    //   94	98	187	android/os/DeadObjectException
    //   100	103	187	android/os/DeadObjectException
    //   160	164	187	android/os/DeadObjectException
    //   171	175	187	android/os/DeadObjectException
    //   178	184	187	android/os/DeadObjectException
    //   237	239	187	android/os/DeadObjectException
    //   103	107	233	finally
    //   114	118	233	finally
    //   120	123	233	finally
    //   125	129	233	finally
    //   131	136	233	finally
    //   141	146	233	finally
    //   150	156	233	finally
    //   156	159	233	finally
    //   224	230	233	finally
    //   234	237	233	finally
    //   0	4	239	android/os/RemoteException
    //   5	8	239	android/os/RemoteException
    //   10	14	239	android/os/RemoteException
    //   18	23	239	android/os/RemoteException
    //   23	27	239	android/os/RemoteException
    //   29	34	239	android/os/RemoteException
    //   38	43	239	android/os/RemoteException
    //   47	51	239	android/os/RemoteException
    //   57	62	239	android/os/RemoteException
    //   62	66	239	android/os/RemoteException
    //   73	77	239	android/os/RemoteException
    //   80	85	239	android/os/RemoteException
    //   89	94	239	android/os/RemoteException
    //   94	98	239	android/os/RemoteException
    //   100	103	239	android/os/RemoteException
    //   160	164	239	android/os/RemoteException
    //   171	175	239	android/os/RemoteException
    //   178	184	239	android/os/RemoteException
    //   237	239	239	android/os/RemoteException
  }
  
  protected Set zzb(Set paramSet)
  {
    return paramSet;
  }
  
  public void zzbS(int paramInt)
  {
    Handler localHandler = this.mHandler;
    Object localObject = this.mHandler;
    int i = this.zzalI.get();
    localObject = ((Handler)localObject).obtainMessage(4, i, paramInt);
    localHandler.sendMessage((Message)localObject);
  }
  
  void zzc(int paramInt, IInterface paramIInterface) {}
  
  protected abstract String zzgu();
  
  protected abstract String zzgv();
  
  protected void zzm(int paramInt1, int paramInt2)
  {
    Handler localHandler = this.mHandler;
    Object localObject = this.mHandler;
    zzj.zzh localzzh = new com/google/android/gms/common/internal/zzj$zzh;
    localzzh.<init>(this, paramInt1);
    localObject = ((Handler)localObject).obtainMessage(5, paramInt2, -1, localzzh);
    localHandler.sendMessage((Message)localObject);
  }
  
  public boolean zzmE()
  {
    return false;
  }
  
  protected Bundle zzml()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public boolean zznb()
  {
    return false;
  }
  
  public Intent zznc()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Not a sign in API");
    throw localUnsupportedOperationException;
  }
  
  public IBinder zzoT()
  {
    synchronized (this.zzaly)
    {
      Object localObject2 = this.zzalz;
      if (localObject2 == null)
      {
        localObject2 = null;
        return (IBinder)localObject2;
      }
      localObject2 = this.zzalz;
      localObject2 = ((zzs)localObject2).asBinder();
    }
  }
  
  public Bundle zzoi()
  {
    return null;
  }
  
  protected final String zzqD()
  {
    return this.zzahz.zzqw();
  }
  
  public void zzqG()
  {
    Object localObject1 = this.zzags;
    Object localObject2 = this.mContext;
    int i = ((zzc)localObject1).isGooglePlayServicesAvailable((Context)localObject2);
    if (i != 0)
    {
      int j = 1;
      zzb(j, null);
      localObject2 = new com/google/android/gms/common/internal/zzj$zzf;
      ((zzj.zzf)localObject2).<init>(this);
      this.zzalA = ((GoogleApiClient.zza)localObject2);
      localObject2 = this.mHandler;
      Handler localHandler = this.mHandler;
      int k = 3;
      AtomicInteger localAtomicInteger = this.zzalI;
      int m = localAtomicInteger.get();
      localObject1 = localHandler.obtainMessage(k, m, i);
      ((Handler)localObject2).sendMessage((Message)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/common/internal/zzj$zzf;
      ((zzj.zzf)localObject1).<init>(this);
      zza((GoogleApiClient.zza)localObject1);
    }
  }
  
  protected final zzf zzqH()
  {
    return this.zzahz;
  }
  
  protected final void zzqI()
  {
    boolean bool = isConnected();
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Not connected. Call connect() and wait for onConnected() to be called.");
      throw localIllegalStateException;
    }
  }
  
  public final IInterface zzqJ()
  {
    int i;
    synchronized (this.zzpV)
    {
      i = this.zzalE;
      int k = 4;
      if (i == k)
      {
        DeadObjectException localDeadObjectException = new android/os/DeadObjectException;
        localDeadObjectException.<init>();
        throw localDeadObjectException;
      }
    }
    zzqI();
    IInterface localIInterface = this.zzalB;
    if (localIInterface != null) {
      i = 1;
    }
    for (;;)
    {
      String str = "Client is connected but service is null";
      zzx.zza(i, str);
      localIInterface = this.zzalB;
      return localIInterface;
      int j = 0;
      localIInterface = null;
    }
  }
  
  public boolean zzqK()
  {
    return false;
  }
  
  public final Account zzqq()
  {
    Account localAccount = this.zzTI;
    if (localAccount != null) {
      localAccount = this.zzTI;
    }
    for (;;)
    {
      return localAccount;
      localAccount = new android/accounts/Account;
      String str1 = "<<default account>>";
      String str2 = "com.google";
      localAccount.<init>(str1, str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */