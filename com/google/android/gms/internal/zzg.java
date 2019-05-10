package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public class zzg
  extends Thread
{
  private final zzb zzj;
  private final zzn zzk;
  private volatile boolean zzl = false;
  private final BlockingQueue zzy;
  private final zzf zzz;
  
  public zzg(BlockingQueue paramBlockingQueue, zzf paramzzf, zzb paramzzb, zzn paramzzn)
  {
    this.zzy = paramBlockingQueue;
    this.zzz = paramzzf;
    this.zzj = paramzzb;
    this.zzk = paramzzn;
  }
  
  private void zzb(zzk paramzzk)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      i = paramzzk.zzg();
      TrafficStats.setThreadStatsTag(i);
    }
  }
  
  private void zzb(zzk paramzzk, zzr paramzzr)
  {
    zzr localzzr = paramzzk.zzb(paramzzr);
    this.zzk.zza(paramzzk, localzzr);
  }
  
  public void quit()
  {
    this.zzl = true;
    interrupt();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: istore_1
    //   3: iload_1
    //   4: invokestatic 67	android/os/Process:setThreadPriority	(I)V
    //   7: invokestatic 73	android/os/SystemClock:elapsedRealtime	()J
    //   10: lstore_2
    //   11: aload_0
    //   12: getfield 22	com/google/android/gms/internal/zzg:zzy	Ljava/util/concurrent/BlockingQueue;
    //   15: astore 4
    //   17: aload 4
    //   19: invokeinterface 79 1 0
    //   24: astore 4
    //   26: aload 4
    //   28: checkcast 37	com/google/android/gms/internal/zzk
    //   31: astore 4
    //   33: ldc 81
    //   35: astore 5
    //   37: aload 4
    //   39: aload 5
    //   41: invokevirtual 85	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   44: aload 4
    //   46: invokevirtual 89	com/google/android/gms/internal/zzk:isCanceled	()Z
    //   49: istore 6
    //   51: iload 6
    //   53: ifeq +58 -> 111
    //   56: ldc 91
    //   58: astore 5
    //   60: aload 4
    //   62: aload 5
    //   64: invokevirtual 94	com/google/android/gms/internal/zzk:zzd	(Ljava/lang/String;)V
    //   67: goto -60 -> 7
    //   70: astore 5
    //   72: invokestatic 73	android/os/SystemClock:elapsedRealtime	()J
    //   75: lstore 7
    //   77: lload 7
    //   79: lload_2
    //   80: lsub
    //   81: lstore_2
    //   82: aload 5
    //   84: lload_2
    //   85: invokevirtual 99	com/google/android/gms/internal/zzr:zza	(J)V
    //   88: aload_0
    //   89: aload 4
    //   91: aload 5
    //   93: invokespecial 101	com/google/android/gms/internal/zzg:zzb	(Lcom/google/android/gms/internal/zzk;Lcom/google/android/gms/internal/zzr;)V
    //   96: goto -89 -> 7
    //   99: astore 4
    //   101: aload_0
    //   102: getfield 20	com/google/android/gms/internal/zzg:zzl	Z
    //   105: istore_1
    //   106: iload_1
    //   107: ifeq -100 -> 7
    //   110: return
    //   111: aload_0
    //   112: aload 4
    //   114: invokespecial 104	com/google/android/gms/internal/zzg:zzb	(Lcom/google/android/gms/internal/zzk;)V
    //   117: aload_0
    //   118: getfield 24	com/google/android/gms/internal/zzg:zzz	Lcom/google/android/gms/internal/zzf;
    //   121: astore 5
    //   123: aload 5
    //   125: aload 4
    //   127: invokeinterface 109 2 0
    //   132: astore 5
    //   134: ldc 111
    //   136: astore 9
    //   138: aload 4
    //   140: aload 9
    //   142: invokevirtual 85	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   145: aload 5
    //   147: getfield 116	com/google/android/gms/internal/zzi:zzB	Z
    //   150: istore 10
    //   152: iload 10
    //   154: ifeq +114 -> 268
    //   157: aload 4
    //   159: invokevirtual 119	com/google/android/gms/internal/zzk:zzw	()Z
    //   162: istore 10
    //   164: iload 10
    //   166: ifeq +102 -> 268
    //   169: ldc 121
    //   171: astore 5
    //   173: aload 4
    //   175: aload 5
    //   177: invokevirtual 94	com/google/android/gms/internal/zzk:zzd	(Ljava/lang/String;)V
    //   180: goto -173 -> 7
    //   183: astore 5
    //   185: iconst_1
    //   186: istore 11
    //   188: iload 11
    //   190: anewarray 125	java/lang/Object
    //   193: astore 12
    //   195: aconst_null
    //   196: astore 13
    //   198: aload 5
    //   200: invokevirtual 131	java/lang/Exception:toString	()Ljava/lang/String;
    //   203: astore 14
    //   205: aload 12
    //   207: iconst_0
    //   208: aload 14
    //   210: aastore
    //   211: aload 5
    //   213: ldc 123
    //   215: aload 12
    //   217: invokestatic 136	com/google/android/gms/internal/zzs:zza	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: new 96	com/google/android/gms/internal/zzr
    //   223: astore 9
    //   225: aload 9
    //   227: aload 5
    //   229: invokespecial 139	com/google/android/gms/internal/zzr:<init>	(Ljava/lang/Throwable;)V
    //   232: invokestatic 73	android/os/SystemClock:elapsedRealtime	()J
    //   235: lstore 15
    //   237: lload 15
    //   239: lload_2
    //   240: lsub
    //   241: lstore_2
    //   242: aload 9
    //   244: lload_2
    //   245: invokevirtual 99	com/google/android/gms/internal/zzr:zza	(J)V
    //   248: aload_0
    //   249: getfield 28	com/google/android/gms/internal/zzg:zzk	Lcom/google/android/gms/internal/zzn;
    //   252: astore 5
    //   254: aload 5
    //   256: aload 4
    //   258: aload 9
    //   260: invokeinterface 57 3 0
    //   265: goto -258 -> 7
    //   268: aload 4
    //   270: aload 5
    //   272: invokevirtual 142	com/google/android/gms/internal/zzk:zza	(Lcom/google/android/gms/internal/zzi;)Lcom/google/android/gms/internal/zzm;
    //   275: astore 5
    //   277: ldc -112
    //   279: astore 9
    //   281: aload 4
    //   283: aload 9
    //   285: invokevirtual 85	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   288: aload 4
    //   290: invokevirtual 147	com/google/android/gms/internal/zzk:zzr	()Z
    //   293: istore 10
    //   295: iload 10
    //   297: ifeq +57 -> 354
    //   300: aload 5
    //   302: getfield 153	com/google/android/gms/internal/zzm:zzag	Lcom/google/android/gms/internal/zzb$zza;
    //   305: astore 9
    //   307: aload 9
    //   309: ifnull +45 -> 354
    //   312: aload_0
    //   313: getfield 26	com/google/android/gms/internal/zzg:zzj	Lcom/google/android/gms/internal/zzb;
    //   316: astore 9
    //   318: aload 4
    //   320: invokevirtual 156	com/google/android/gms/internal/zzk:zzh	()Ljava/lang/String;
    //   323: astore 12
    //   325: aload 5
    //   327: getfield 153	com/google/android/gms/internal/zzm:zzag	Lcom/google/android/gms/internal/zzb$zza;
    //   330: astore 13
    //   332: aload 9
    //   334: aload 12
    //   336: aload 13
    //   338: invokeinterface 161 3 0
    //   343: ldc -93
    //   345: astore 9
    //   347: aload 4
    //   349: aload 9
    //   351: invokevirtual 85	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   354: aload 4
    //   356: invokevirtual 166	com/google/android/gms/internal/zzk:zzv	()V
    //   359: aload_0
    //   360: getfield 28	com/google/android/gms/internal/zzg:zzk	Lcom/google/android/gms/internal/zzn;
    //   363: astore 9
    //   365: aload 9
    //   367: aload 4
    //   369: aload 5
    //   371: invokeinterface 169 3 0
    //   376: goto -369 -> 7
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	379	0	this	zzg
    //   2	2	1	i	int
    //   105	2	1	bool1	boolean
    //   10	235	2	l1	long
    //   15	75	4	localObject1	Object
    //   99	269	4	localInterruptedException	InterruptedException
    //   35	28	5	str1	String
    //   70	22	5	localzzr	zzr
    //   121	55	5	localObject2	Object
    //   183	45	5	localException	Exception
    //   252	118	5	localObject3	Object
    //   49	3	6	bool2	boolean
    //   75	3	7	l2	long
    //   136	230	9	localObject4	Object
    //   150	146	10	bool3	boolean
    //   186	3	11	j	int
    //   193	142	12	localObject5	Object
    //   196	141	13	localzza	zzb.zza
    //   203	6	14	str2	String
    //   235	3	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   39	44	70	com/google/android/gms/internal/zzr
    //   44	49	70	com/google/android/gms/internal/zzr
    //   62	67	70	com/google/android/gms/internal/zzr
    //   112	117	70	com/google/android/gms/internal/zzr
    //   117	121	70	com/google/android/gms/internal/zzr
    //   125	132	70	com/google/android/gms/internal/zzr
    //   140	145	70	com/google/android/gms/internal/zzr
    //   145	150	70	com/google/android/gms/internal/zzr
    //   157	162	70	com/google/android/gms/internal/zzr
    //   175	180	70	com/google/android/gms/internal/zzr
    //   270	275	70	com/google/android/gms/internal/zzr
    //   283	288	70	com/google/android/gms/internal/zzr
    //   288	293	70	com/google/android/gms/internal/zzr
    //   300	305	70	com/google/android/gms/internal/zzr
    //   312	316	70	com/google/android/gms/internal/zzr
    //   318	323	70	com/google/android/gms/internal/zzr
    //   325	330	70	com/google/android/gms/internal/zzr
    //   336	343	70	com/google/android/gms/internal/zzr
    //   349	354	70	com/google/android/gms/internal/zzr
    //   354	359	70	com/google/android/gms/internal/zzr
    //   359	363	70	com/google/android/gms/internal/zzr
    //   369	376	70	com/google/android/gms/internal/zzr
    //   11	15	99	java/lang/InterruptedException
    //   17	24	99	java/lang/InterruptedException
    //   26	31	99	java/lang/InterruptedException
    //   39	44	183	java/lang/Exception
    //   44	49	183	java/lang/Exception
    //   62	67	183	java/lang/Exception
    //   112	117	183	java/lang/Exception
    //   117	121	183	java/lang/Exception
    //   125	132	183	java/lang/Exception
    //   140	145	183	java/lang/Exception
    //   145	150	183	java/lang/Exception
    //   157	162	183	java/lang/Exception
    //   175	180	183	java/lang/Exception
    //   270	275	183	java/lang/Exception
    //   283	288	183	java/lang/Exception
    //   288	293	183	java/lang/Exception
    //   300	305	183	java/lang/Exception
    //   312	316	183	java/lang/Exception
    //   318	323	183	java/lang/Exception
    //   325	330	183	java/lang/Exception
    //   336	343	183	java/lang/Exception
    //   349	354	183	java/lang/Exception
    //   354	359	183	java/lang/Exception
    //   359	363	183	java/lang/Exception
    //   369	376	183	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */