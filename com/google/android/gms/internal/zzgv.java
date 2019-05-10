package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class zzgv
  extends zzim
{
  private final zzgw zzGC;
  private Future zzGD;
  private final zzgr.zza zzGc;
  private final zzif.zza zzGd;
  private final AdResponseParcel zzGe;
  private final Object zzpV;
  
  public zzgv(Context paramContext, zzp paramzzp, zzee paramzzee, zzif.zza paramzza, zzan paramzzan, zzgr.zza paramzza1)
  {
    this(paramzza, paramzza1, localzzgw);
  }
  
  zzgv(zzif.zza paramzza, zzgr.zza paramzza1, zzgw paramzzgw)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzGd = paramzza;
    localObject = paramzza.zzLe;
    this.zzGe = ((AdResponseParcel)localObject);
    this.zzGc = paramzza1;
    this.zzGC = paramzzgw;
  }
  
  private zzif zzE(int paramInt)
  {
    zzif localzzif = new com/google/android/gms/internal/zzif;
    AdRequestParcel localAdRequestParcel = this.zzGd.zzLd.zzHt;
    int i = this.zzGe.orientation;
    long l1 = this.zzGe.zzBU;
    String str1 = this.zzGd.zzLd.zzHw;
    long l2 = this.zzGe.zzHU;
    AdSizeParcel localAdSizeParcel = this.zzGd.zzrp;
    long l3 = this.zzGe.zzHS;
    long l4 = this.zzGd.zzKY;
    long l5 = this.zzGe.zzHX;
    String str2 = this.zzGe.zzHY;
    JSONObject localJSONObject = this.zzGd.zzKT;
    boolean bool = this.zzGd.zzLe.zzIm;
    localzzif.<init>(localAdRequestParcel, null, null, paramInt, null, null, i, l1, str1, false, null, null, null, null, null, l2, localAdSizeParcel, l3, l4, l5, str2, localJSONObject, null, null, null, null, bool);
    return localzzif;
  }
  
  public void onStop()
  {
    synchronized (this.zzpV)
    {
      Future localFuture = this.zzGD;
      if (localFuture != null)
      {
        localFuture = this.zzGD;
        boolean bool = true;
        localFuture.cancel(bool);
      }
      return;
    }
  }
  
  /* Error */
  public void zzbr()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: bipush -2
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aconst_null
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 38	com/google/android/gms/internal/zzgv:zzpV	Ljava/lang/Object;
    //   14: astore 5
    //   16: aload 5
    //   18: monitorenter
    //   19: aload_0
    //   20: getfield 51	com/google/android/gms/internal/zzgv:zzGC	Lcom/google/android/gms/internal/zzgw;
    //   23: astore 6
    //   25: aload 6
    //   27: invokestatic 122	com/google/android/gms/internal/zziq:zza	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/zzjg;
    //   30: astore 6
    //   32: aload_0
    //   33: aload 6
    //   35: putfield 109	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   38: aload 5
    //   40: monitorexit
    //   41: aload_0
    //   42: getfield 109	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   45: astore 6
    //   47: ldc2_w 123
    //   50: lstore 7
    //   52: getstatic 132	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   55: astore 9
    //   57: aload 6
    //   59: lload 7
    //   61: aload 9
    //   63: invokeinterface 136 4 0
    //   68: astore 6
    //   70: aload 6
    //   72: checkcast 53	com/google/android/gms/internal/zzif
    //   75: astore 6
    //   77: iload_2
    //   78: istore_3
    //   79: aload 6
    //   81: ifnull +103 -> 184
    //   84: getstatic 142	com/google/android/gms/internal/zzir:zzMc	Landroid/os/Handler;
    //   87: astore 4
    //   89: new 144	com/google/android/gms/internal/zzgv$1
    //   92: astore 10
    //   94: aload 10
    //   96: aload_0
    //   97: aload 6
    //   99: invokespecial 147	com/google/android/gms/internal/zzgv$1:<init>	(Lcom/google/android/gms/internal/zzgv;Lcom/google/android/gms/internal/zzif;)V
    //   102: aload 4
    //   104: aload 10
    //   106: invokevirtual 153	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   109: pop
    //   110: return
    //   111: astore 6
    //   113: aload 5
    //   115: monitorexit
    //   116: aload 6
    //   118: athrow
    //   119: astore 6
    //   121: ldc -101
    //   123: invokestatic 161	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   126: aload_0
    //   127: getfield 109	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   130: astore 10
    //   132: iconst_1
    //   133: istore_1
    //   134: aload 10
    //   136: iload_1
    //   137: invokeinterface 116 2 0
    //   142: pop
    //   143: iconst_2
    //   144: istore_3
    //   145: aconst_null
    //   146: astore 6
    //   148: goto -69 -> 79
    //   151: astore 6
    //   153: iconst_0
    //   154: istore_3
    //   155: aconst_null
    //   156: astore 4
    //   158: aconst_null
    //   159: astore 6
    //   161: goto -82 -> 79
    //   164: astore 6
    //   166: aconst_null
    //   167: astore 6
    //   169: iload_1
    //   170: istore_3
    //   171: goto -92 -> 79
    //   174: astore 6
    //   176: aconst_null
    //   177: astore 6
    //   179: iload_1
    //   180: istore_3
    //   181: goto -102 -> 79
    //   184: aload_0
    //   185: iload_3
    //   186: invokespecial 166	com/google/android/gms/internal/zzgv:zzE	(I)Lcom/google/android/gms/internal/zzif;
    //   189: astore 6
    //   191: goto -107 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	zzgv
    //   1	179	1	i	int
    //   4	74	2	j	int
    //   6	180	3	k	int
    //   8	149	4	localHandler	android.os.Handler
    //   23	75	6	localObject2	Object
    //   111	6	6	localObject3	Object
    //   119	1	6	localTimeoutException	java.util.concurrent.TimeoutException
    //   146	1	6	localObject4	Object
    //   151	1	6	localExecutionException	java.util.concurrent.ExecutionException
    //   159	1	6	localObject5	Object
    //   164	1	6	localInterruptedException	InterruptedException
    //   167	1	6	localObject6	Object
    //   174	1	6	localCancellationException	java.util.concurrent.CancellationException
    //   177	13	6	localzzif	zzif
    //   50	10	7	l	long
    //   55	7	9	localTimeUnit	java.util.concurrent.TimeUnit
    //   92	43	10	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   19	23	111	finally
    //   25	30	111	finally
    //   33	38	111	finally
    //   38	41	111	finally
    //   113	116	111	finally
    //   10	14	119	java/util/concurrent/TimeoutException
    //   16	19	119	java/util/concurrent/TimeoutException
    //   41	45	119	java/util/concurrent/TimeoutException
    //   52	55	119	java/util/concurrent/TimeoutException
    //   61	68	119	java/util/concurrent/TimeoutException
    //   70	75	119	java/util/concurrent/TimeoutException
    //   116	119	119	java/util/concurrent/TimeoutException
    //   10	14	151	java/util/concurrent/ExecutionException
    //   16	19	151	java/util/concurrent/ExecutionException
    //   41	45	151	java/util/concurrent/ExecutionException
    //   52	55	151	java/util/concurrent/ExecutionException
    //   61	68	151	java/util/concurrent/ExecutionException
    //   70	75	151	java/util/concurrent/ExecutionException
    //   116	119	151	java/util/concurrent/ExecutionException
    //   10	14	164	java/lang/InterruptedException
    //   16	19	164	java/lang/InterruptedException
    //   41	45	164	java/lang/InterruptedException
    //   52	55	164	java/lang/InterruptedException
    //   61	68	164	java/lang/InterruptedException
    //   70	75	164	java/lang/InterruptedException
    //   116	119	164	java/lang/InterruptedException
    //   10	14	174	java/util/concurrent/CancellationException
    //   16	19	174	java/util/concurrent/CancellationException
    //   41	45	174	java/util/concurrent/CancellationException
    //   52	55	174	java/util/concurrent/CancellationException
    //   61	68	174	java/util/concurrent/CancellationException
    //   70	75	174	java/util/concurrent/CancellationException
    //   116	119	174	java/util/concurrent/CancellationException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */