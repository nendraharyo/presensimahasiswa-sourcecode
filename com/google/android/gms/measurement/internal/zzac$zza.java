package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;

public class zzac$zza
  implements ServiceConnection, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private volatile boolean zzaYV;
  private volatile zzo zzaYW;
  
  protected zzac$zza(zzac paramzzac) {}
  
  /* Error */
  public void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 26
    //   2: astore_2
    //   3: aload_2
    //   4: invokestatic 32	com/google/android/gms/common/internal/zzx:zzcD	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 34	com/google/android/gms/measurement/internal/zzac$zza:zzaYW	Lcom/google/android/gms/measurement/internal/zzo;
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 40	com/google/android/gms/measurement/internal/zzo:zzqJ	()Landroid/os/IInterface;
    //   18: astore_2
    //   19: aload_2
    //   20: checkcast 42	com/google/android/gms/measurement/internal/zzm
    //   23: astore_2
    //   24: aconst_null
    //   25: astore_3
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 34	com/google/android/gms/measurement/internal/zzac$zza:zzaYW	Lcom/google/android/gms/measurement/internal/zzo;
    //   31: aload_0
    //   32: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   35: astore_3
    //   36: aload_3
    //   37: invokevirtual 48	com/google/android/gms/measurement/internal/zzac:zzCn	()Lcom/google/android/gms/measurement/internal/zzv;
    //   40: astore_3
    //   41: new 50	com/google/android/gms/measurement/internal/zzac$zza$3
    //   44: astore 4
    //   46: aload 4
    //   48: aload_0
    //   49: aload_2
    //   50: invokespecial 53	com/google/android/gms/measurement/internal/zzac$zza$3:<init>	(Lcom/google/android/gms/measurement/internal/zzac$zza;Lcom/google/android/gms/measurement/internal/zzm;)V
    //   53: aload_3
    //   54: aload 4
    //   56: invokevirtual 59	com/google/android/gms/measurement/internal/zzv:zzg	(Ljava/lang/Runnable;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_2
    //   63: aconst_null
    //   64: astore_2
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 34	com/google/android/gms/measurement/internal/zzac$zza:zzaYW	Lcom/google/android/gms/measurement/internal/zzo;
    //   70: aconst_null
    //   71: astore_2
    //   72: aload_0
    //   73: iconst_0
    //   74: putfield 24	com/google/android/gms/measurement/internal/zzac$zza:zzaYV	Z
    //   77: goto -18 -> 59
    //   80: astore_2
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_2
    //   84: athrow
    //   85: astore_2
    //   86: goto -23 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	zza
    //   0	89	1	paramBundle	android.os.Bundle
    //   2	48	2	localObject1	Object
    //   62	1	2	localIllegalStateException	IllegalStateException
    //   64	8	2	localObject2	Object
    //   80	4	2	localObject3	Object
    //   85	1	2	localDeadObjectException	android.os.DeadObjectException
    //   25	29	3	localObject4	Object
    //   44	11	4	local3	zzac.zza.3
    // Exception table:
    //   from	to	target	type
    //   9	13	62	java/lang/IllegalStateException
    //   14	18	62	java/lang/IllegalStateException
    //   19	23	62	java/lang/IllegalStateException
    //   27	31	62	java/lang/IllegalStateException
    //   31	35	62	java/lang/IllegalStateException
    //   36	40	62	java/lang/IllegalStateException
    //   41	44	62	java/lang/IllegalStateException
    //   49	53	62	java/lang/IllegalStateException
    //   54	59	62	java/lang/IllegalStateException
    //   9	13	80	finally
    //   14	18	80	finally
    //   19	23	80	finally
    //   27	31	80	finally
    //   31	35	80	finally
    //   36	40	80	finally
    //   41	44	80	finally
    //   49	53	80	finally
    //   54	59	80	finally
    //   59	61	80	finally
    //   66	70	80	finally
    //   73	77	80	finally
    //   81	83	80	finally
    //   9	13	85	android/os/DeadObjectException
    //   14	18	85	android/os/DeadObjectException
    //   19	23	85	android/os/DeadObjectException
    //   27	31	85	android/os/DeadObjectException
    //   31	35	85	android/os/DeadObjectException
    //   36	40	85	android/os/DeadObjectException
    //   41	44	85	android/os/DeadObjectException
    //   49	53	85	android/os/DeadObjectException
    //   54	59	85	android/os/DeadObjectException
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzx.zzcD("MeasurementServiceConnection.onConnectionFailed");
    Object localObject1 = this.zzaYU.zzaTV.zzCT();
    if (localObject1 != null)
    {
      localObject1 = ((zzp)localObject1).zzCF();
      String str = "Service connection failed";
      ((zzp.zza)localObject1).zzj(str, paramConnectionResult);
    }
    localObject1 = null;
    try
    {
      this.zzaYV = false;
      localObject1 = null;
      this.zzaYW = null;
      return;
    }
    finally {}
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzx.zzcD("MeasurementServiceConnection.onConnectionSuspended");
    this.zzaYU.zzAo().zzCJ().zzfg("Service connection suspended");
    zzv localzzv = this.zzaYU.zzCn();
    zzac.zza.4 local4 = new com/google/android/gms/measurement/internal/zzac$zza$4;
    local4.<init>(this);
    localzzv.zzg(local4);
  }
  
  /* Error */
  public void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc 109
    //   2: astore_3
    //   3: aload_3
    //   4: invokestatic 32	com/google/android/gms/common/internal/zzx:zzcD	(Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_2
    //   10: ifnonnull +38 -> 48
    //   13: aconst_null
    //   14: astore_3
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 24	com/google/android/gms/measurement/internal/zzac$zza:zzaYV	Z
    //   20: aload_0
    //   21: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual 94	com/google/android/gms/measurement/internal/zzac:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   29: astore_3
    //   30: aload_3
    //   31: invokevirtual 112	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   34: astore_3
    //   35: ldc 114
    //   37: astore 4
    //   39: aload_3
    //   40: aload 4
    //   42: invokevirtual 102	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: aconst_null
    //   49: astore_3
    //   50: aload_2
    //   51: invokeinterface 120 1 0
    //   56: astore 4
    //   58: ldc 122
    //   60: astore 5
    //   62: aload 5
    //   64: aload 4
    //   66: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: istore 6
    //   71: iload 6
    //   73: ifeq +98 -> 171
    //   76: aload_2
    //   77: invokestatic 134	com/google/android/gms/measurement/internal/zzm$zza:zzdn	(Landroid/os/IBinder;)Lcom/google/android/gms/measurement/internal/zzm;
    //   80: astore_3
    //   81: aload_0
    //   82: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   85: astore 4
    //   87: aload 4
    //   89: invokevirtual 94	com/google/android/gms/measurement/internal/zzac:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   92: astore 4
    //   94: aload 4
    //   96: invokevirtual 137	com/google/android/gms/measurement/internal/zzp:zzCK	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   99: astore 4
    //   101: ldc -117
    //   103: astore 5
    //   105: aload 4
    //   107: aload 5
    //   109: invokevirtual 102	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   112: aload_3
    //   113: ifnonnull +130 -> 243
    //   116: aconst_null
    //   117: astore_3
    //   118: aload_0
    //   119: iconst_0
    //   120: putfield 24	com/google/android/gms/measurement/internal/zzac$zza:zzaYV	Z
    //   123: invokestatic 145	com/google/android/gms/common/stats/zzb:zzrP	()Lcom/google/android/gms/common/stats/zzb;
    //   126: astore_3
    //   127: aload_0
    //   128: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   131: astore 4
    //   133: aload 4
    //   135: invokevirtual 149	com/google/android/gms/measurement/internal/zzac:getContext	()Landroid/content/Context;
    //   138: astore 4
    //   140: aload_0
    //   141: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   144: astore 5
    //   146: aload 5
    //   148: invokestatic 153	com/google/android/gms/measurement/internal/zzac:zza	(Lcom/google/android/gms/measurement/internal/zzac;)Lcom/google/android/gms/measurement/internal/zzac$zza;
    //   151: astore 5
    //   153: aload_3
    //   154: aload 4
    //   156: aload 5
    //   158: invokevirtual 156	com/google/android/gms/common/stats/zzb:zza	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   161: aload_0
    //   162: monitorexit
    //   163: goto -116 -> 47
    //   166: astore_3
    //   167: aload_0
    //   168: monitorexit
    //   169: aload_3
    //   170: athrow
    //   171: aload_0
    //   172: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   175: astore 5
    //   177: aload 5
    //   179: invokevirtual 94	com/google/android/gms/measurement/internal/zzac:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   182: astore 5
    //   184: aload 5
    //   186: invokevirtual 112	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   189: astore 5
    //   191: ldc -98
    //   193: astore 7
    //   195: aload 5
    //   197: aload 7
    //   199: aload 4
    //   201: invokevirtual 89	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   204: goto -92 -> 112
    //   207: astore 4
    //   209: aload_0
    //   210: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   213: astore 4
    //   215: aload 4
    //   217: invokevirtual 94	com/google/android/gms/measurement/internal/zzac:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   220: astore 4
    //   222: aload 4
    //   224: invokevirtual 112	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   227: astore 4
    //   229: ldc -96
    //   231: astore 5
    //   233: aload 4
    //   235: aload 5
    //   237: invokevirtual 102	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   240: goto -128 -> 112
    //   243: aload_0
    //   244: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   247: astore 4
    //   249: aload 4
    //   251: invokevirtual 48	com/google/android/gms/measurement/internal/zzac:zzCn	()Lcom/google/android/gms/measurement/internal/zzv;
    //   254: astore 4
    //   256: new 162	com/google/android/gms/measurement/internal/zzac$zza$1
    //   259: astore 5
    //   261: aload 5
    //   263: aload_0
    //   264: aload_3
    //   265: invokespecial 163	com/google/android/gms/measurement/internal/zzac$zza$1:<init>	(Lcom/google/android/gms/measurement/internal/zzac$zza;Lcom/google/android/gms/measurement/internal/zzm;)V
    //   268: aload 4
    //   270: aload 5
    //   272: invokevirtual 59	com/google/android/gms/measurement/internal/zzv:zzg	(Ljava/lang/Runnable;)V
    //   275: goto -114 -> 161
    //   278: astore_3
    //   279: goto -118 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	282	0	this	zza
    //   0	282	1	paramComponentName	ComponentName
    //   0	282	2	paramIBinder	android.os.IBinder
    //   2	152	3	localObject1	Object
    //   166	99	3	localzzm	zzm
    //   278	1	3	localIllegalArgumentException	IllegalArgumentException
    //   37	163	4	localObject2	Object
    //   207	1	4	localRemoteException	android.os.RemoteException
    //   213	56	4	localObject3	Object
    //   60	211	5	localObject4	Object
    //   69	3	6	bool	boolean
    //   193	5	7	str	String
    // Exception table:
    //   from	to	target	type
    //   16	20	166	finally
    //   20	24	166	finally
    //   25	29	166	finally
    //   30	34	166	finally
    //   40	45	166	finally
    //   45	47	166	finally
    //   50	56	166	finally
    //   64	69	166	finally
    //   76	80	166	finally
    //   81	85	166	finally
    //   87	92	166	finally
    //   94	99	166	finally
    //   107	112	166	finally
    //   119	123	166	finally
    //   123	126	166	finally
    //   127	131	166	finally
    //   133	138	166	finally
    //   140	144	166	finally
    //   146	151	166	finally
    //   156	161	166	finally
    //   161	163	166	finally
    //   167	169	166	finally
    //   171	175	166	finally
    //   177	182	166	finally
    //   184	189	166	finally
    //   199	204	166	finally
    //   209	213	166	finally
    //   215	220	166	finally
    //   222	227	166	finally
    //   235	240	166	finally
    //   243	247	166	finally
    //   249	254	166	finally
    //   256	259	166	finally
    //   264	268	166	finally
    //   270	275	166	finally
    //   50	56	207	android/os/RemoteException
    //   64	69	207	android/os/RemoteException
    //   76	80	207	android/os/RemoteException
    //   81	85	207	android/os/RemoteException
    //   87	92	207	android/os/RemoteException
    //   94	99	207	android/os/RemoteException
    //   107	112	207	android/os/RemoteException
    //   171	175	207	android/os/RemoteException
    //   177	182	207	android/os/RemoteException
    //   184	189	207	android/os/RemoteException
    //   199	204	207	android/os/RemoteException
    //   123	126	278	java/lang/IllegalArgumentException
    //   127	131	278	java/lang/IllegalArgumentException
    //   133	138	278	java/lang/IllegalArgumentException
    //   140	144	278	java/lang/IllegalArgumentException
    //   146	151	278	java/lang/IllegalArgumentException
    //   156	161	278	java/lang/IllegalArgumentException
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzx.zzcD("MeasurementServiceConnection.onServiceDisconnected");
    this.zzaYU.zzAo().zzCJ().zzfg("Service disconnected");
    zzv localzzv = this.zzaYU.zzCn();
    zzac.zza.2 local2 = new com/google/android/gms/measurement/internal/zzac$zza$2;
    local2.<init>(this, paramComponentName);
    localzzv.zzg(local2);
  }
  
  public void zzDt()
  {
    this.zzaYU.zzjk();
    Object localObject1 = this.zzaYU;
    Object localObject4 = ((zzac)localObject1).getContext();
    for (;;)
    {
      try
      {
        bool = this.zzaYV;
        if (bool)
        {
          localObject1 = this.zzaYU;
          localObject1 = ((zzac)localObject1).zzAo();
          localObject1 = ((zzp)localObject1).zzCK();
          localObject4 = "Connection attempt already in progress";
          ((zzp.zza)localObject1).zzfg((String)localObject4);
          return;
        }
        localObject1 = this.zzaYW;
        if (localObject1 != null)
        {
          localObject1 = this.zzaYU;
          localObject1 = ((zzac)localObject1).zzAo();
          localObject1 = ((zzp)localObject1).zzCK();
          localObject4 = "Already awaiting connection attempt";
          ((zzp.zza)localObject1).zzfg((String)localObject4);
          continue;
        }
        localObject3 = new com/google/android/gms/measurement/internal/zzo;
      }
      finally {}
      Looper localLooper = Looper.getMainLooper();
      zzf localzzf = zzf.zzat((Context)localObject4);
      ((zzo)localObject3).<init>((Context)localObject4, localLooper, localzzf, this, this);
      this.zzaYW = ((zzo)localObject3);
      Object localObject3 = this.zzaYU;
      localObject3 = ((zzac)localObject3).zzAo();
      localObject3 = ((zzp)localObject3).zzCK();
      localObject4 = "Connecting to remote service";
      ((zzp.zza)localObject3).zzfg((String)localObject4);
      boolean bool = true;
      this.zzaYV = bool;
      localObject3 = this.zzaYW;
      ((zzo)localObject3).zzqG();
    }
  }
  
  /* Error */
  public void zzz(android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   4: invokevirtual 179	com/google/android/gms/measurement/internal/zzac:zzjk	()V
    //   7: aload_0
    //   8: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   11: invokevirtual 149	com/google/android/gms/measurement/internal/zzac:getContext	()Landroid/content/Context;
    //   14: astore_2
    //   15: invokestatic 145	com/google/android/gms/common/stats/zzb:zzrP	()Lcom/google/android/gms/common/stats/zzb;
    //   18: astore_3
    //   19: aload_0
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 24	com/google/android/gms/measurement/internal/zzac$zza:zzaYV	Z
    //   25: istore 4
    //   27: iload 4
    //   29: ifeq +29 -> 58
    //   32: aload_0
    //   33: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   36: astore_2
    //   37: aload_2
    //   38: invokevirtual 94	com/google/android/gms/measurement/internal/zzac:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   41: astore_2
    //   42: aload_2
    //   43: invokevirtual 137	com/google/android/gms/measurement/internal/zzp:zzCK	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   46: astore_2
    //   47: ldc -75
    //   49: astore_3
    //   50: aload_2
    //   51: aload_3
    //   52: invokevirtual 102	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: iconst_1
    //   59: istore 4
    //   61: aload_0
    //   62: iload 4
    //   64: putfield 24	com/google/android/gms/measurement/internal/zzac$zza:zzaYV	Z
    //   67: aload_0
    //   68: getfield 18	com/google/android/gms/measurement/internal/zzac$zza:zzaYU	Lcom/google/android/gms/measurement/internal/zzac;
    //   71: astore 5
    //   73: aload 5
    //   75: invokestatic 153	com/google/android/gms/measurement/internal/zzac:zza	(Lcom/google/android/gms/measurement/internal/zzac;)Lcom/google/android/gms/measurement/internal/zzac$zza;
    //   78: astore 5
    //   80: sipush 129
    //   83: istore 6
    //   85: aload_3
    //   86: aload_2
    //   87: aload_1
    //   88: aload 5
    //   90: iload 6
    //   92: invokevirtual 208	com/google/android/gms/common/stats/zzb:zza	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   95: pop
    //   96: aload_0
    //   97: monitorexit
    //   98: goto -41 -> 57
    //   101: astore_2
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_2
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	zza
    //   0	106	1	paramIntent	android.content.Intent
    //   14	73	2	localObject1	Object
    //   101	4	2	localObject2	Object
    //   18	68	3	localObject3	Object
    //   25	38	4	bool	boolean
    //   71	18	5	localObject4	Object
    //   83	8	6	i	int
    // Exception table:
    //   from	to	target	type
    //   21	25	101	finally
    //   32	36	101	finally
    //   37	41	101	finally
    //   42	46	101	finally
    //   51	55	101	finally
    //   55	57	101	finally
    //   62	67	101	finally
    //   67	71	101	finally
    //   73	78	101	finally
    //   90	96	101	finally
    //   96	98	101	finally
    //   102	104	101	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */