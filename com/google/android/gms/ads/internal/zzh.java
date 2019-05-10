package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class zzh
  implements zzaj, Runnable
{
  private final List zzpH;
  private final AtomicReference zzpI;
  CountDownLatch zzpJ;
  private zzs zzpj;
  
  public zzh(zzs paramzzs)
  {
    Object localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    this.zzpH = ((List)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.zzpI = ((AtomicReference)localObject);
    localObject = new java/util/concurrent/CountDownLatch;
    int i = 1;
    ((CountDownLatch)localObject).<init>(i);
    this.zzpJ = ((CountDownLatch)localObject);
    this.zzpj = paramzzs;
    localObject = zzn.zzcS();
    boolean bool = ((zza)localObject).zzhJ();
    if (bool) {
      zziq.zza(this);
    }
    for (;;)
    {
      return;
      run();
    }
  }
  
  private void zzbk()
  {
    int i = 1;
    Object localObject = this.zzpH;
    boolean bool = ((List)localObject).isEmpty();
    if (bool) {}
    for (;;)
    {
      return;
      localObject = this.zzpH;
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Object[])localIterator.next();
        int k = localObject.length;
        zzaj localzzaj;
        if (k == i)
        {
          localzzaj = (zzaj)this.zzpI.get();
          localObject = (MotionEvent)localObject[0];
          localzzaj.zza((MotionEvent)localObject);
        }
        else
        {
          k = localObject.length;
          int m = 3;
          if (k == m)
          {
            localzzaj = (zzaj)this.zzpI.get();
            int n = ((Integer)localObject[0]).intValue();
            Integer localInteger = (Integer)localObject[i];
            m = localInteger.intValue();
            int i1 = 2;
            localObject = (Integer)localObject[i1];
            int j = ((Integer)localObject).intValue();
            localzzaj.zza(n, m, j);
          }
        }
      }
      localObject = this.zzpH;
      ((List)localObject).clear();
    }
  }
  
  private Context zzq(Context paramContext)
  {
    Object localObject = (Boolean)zzbt.zzvM.get();
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool) {}
    for (;;)
    {
      return paramContext;
      localObject = paramContext.getApplicationContext();
      if (localObject != null) {
        paramContext = (Context)localObject;
      }
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: getstatic 126	com/google/android/gms/internal/zzbt:zzvY	Lcom/google/android/gms/internal/zzbp;
    //   3: astore_1
    //   4: aload_1
    //   5: invokevirtual 112	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   8: astore_1
    //   9: aload_1
    //   10: checkcast 114	java/lang/Boolean
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 117	java/lang/Boolean:booleanValue	()Z
    //   18: istore_2
    //   19: iload_2
    //   20: ifeq +22 -> 42
    //   23: aload_0
    //   24: getfield 40	com/google/android/gms/ads/internal/zzh:zzpj	Lcom/google/android/gms/ads/internal/zzs;
    //   27: astore_1
    //   28: aload_1
    //   29: getfield 132	com/google/android/gms/ads/internal/zzs:zzrl	Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    //   32: astore_1
    //   33: aload_1
    //   34: getfield 138	com/google/android/gms/ads/internal/util/client/VersionInfoParcel:zzNb	Z
    //   37: istore_2
    //   38: iload_2
    //   39: ifeq +68 -> 107
    //   42: iconst_1
    //   43: istore_2
    //   44: aload_0
    //   45: getfield 40	com/google/android/gms/ads/internal/zzh:zzpj	Lcom/google/android/gms/ads/internal/zzs;
    //   48: astore_3
    //   49: aload_3
    //   50: getfield 132	com/google/android/gms/ads/internal/zzs:zzrl	Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    //   53: astore_3
    //   54: aload_3
    //   55: getfield 142	com/google/android/gms/ads/internal/util/client/VersionInfoParcel:afmaVersion	Ljava/lang/String;
    //   58: astore_3
    //   59: aload_0
    //   60: getfield 40	com/google/android/gms/ads/internal/zzh:zzpj	Lcom/google/android/gms/ads/internal/zzs;
    //   63: astore 4
    //   65: aload 4
    //   67: getfield 146	com/google/android/gms/ads/internal/zzs:context	Landroid/content/Context;
    //   70: astore 4
    //   72: aload_0
    //   73: aload 4
    //   75: invokespecial 150	com/google/android/gms/ads/internal/zzh:zzq	(Landroid/content/Context;)Landroid/content/Context;
    //   78: astore 4
    //   80: aload_0
    //   81: aload_3
    //   82: aload 4
    //   84: iload_2
    //   85: invokevirtual 154	com/google/android/gms/ads/internal/zzh:zzb	(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/zzaj;
    //   88: astore_1
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual 157	com/google/android/gms/ads/internal/zzh:zza	(Lcom/google/android/gms/internal/zzaj;)V
    //   94: aload_0
    //   95: getfield 38	com/google/android/gms/ads/internal/zzh:zzpJ	Ljava/util/concurrent/CountDownLatch;
    //   98: invokevirtual 160	java/util/concurrent/CountDownLatch:countDown	()V
    //   101: aload_0
    //   102: aconst_null
    //   103: putfield 40	com/google/android/gms/ads/internal/zzh:zzpj	Lcom/google/android/gms/ads/internal/zzs;
    //   106: return
    //   107: iconst_0
    //   108: istore_2
    //   109: aconst_null
    //   110: astore_1
    //   111: goto -67 -> 44
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 38	com/google/android/gms/ads/internal/zzh:zzpJ	Ljava/util/concurrent/CountDownLatch;
    //   119: invokevirtual 160	java/util/concurrent/CountDownLatch:countDown	()V
    //   122: aload_0
    //   123: aconst_null
    //   124: putfield 40	com/google/android/gms/ads/internal/zzh:zzpj	Lcom/google/android/gms/ads/internal/zzs;
    //   127: aload_1
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	zzh
    //   3	108	1	localObject1	Object
    //   114	14	1	localObject2	Object
    //   18	91	2	bool	boolean
    //   48	34	3	localObject3	Object
    //   63	20	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   0	3	114	finally
    //   4	8	114	finally
    //   9	13	114	finally
    //   14	18	114	finally
    //   23	27	114	finally
    //   28	32	114	finally
    //   33	37	114	finally
    //   44	48	114	finally
    //   49	53	114	finally
    //   54	58	114	finally
    //   59	63	114	finally
    //   65	70	114	finally
    //   73	78	114	finally
    //   84	88	114	finally
    //   90	94	114	finally
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = (zzaj)this.zzpI.get();
    if (localObject != null)
    {
      zzbk();
      ((zzaj)localObject).zza(paramInt1, paramInt2, paramInt3);
    }
    for (;;)
    {
      return;
      localObject = this.zzpH;
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt1);
      arrayOfObject[0] = localInteger;
      localInteger = Integer.valueOf(paramInt2);
      arrayOfObject[1] = localInteger;
      int j = 2;
      localInteger = Integer.valueOf(paramInt3);
      arrayOfObject[j] = localInteger;
      ((List)localObject).add(arrayOfObject);
    }
  }
  
  public void zza(MotionEvent paramMotionEvent)
  {
    Object localObject = (zzaj)this.zzpI.get();
    if (localObject != null)
    {
      zzbk();
      ((zzaj)localObject).zza(paramMotionEvent);
    }
    for (;;)
    {
      return;
      localObject = this.zzpH;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramMotionEvent;
      ((List)localObject).add(arrayOfObject);
    }
  }
  
  protected void zza(zzaj paramzzaj)
  {
    this.zzpI.set(paramzzaj);
  }
  
  protected zzaj zzb(String paramString, Context paramContext, boolean paramBoolean)
  {
    return zzam.zza(paramString, paramContext, paramBoolean);
  }
  
  public String zzb(Context paramContext)
  {
    boolean bool = zzbj();
    Context localContext;
    if (bool)
    {
      localObject = (zzaj)this.zzpI.get();
      if (localObject != null)
      {
        zzbk();
        localContext = zzq(paramContext);
      }
    }
    for (Object localObject = ((zzaj)localObject).zzb(localContext);; localObject = "") {
      return (String)localObject;
    }
  }
  
  public String zzb(Context paramContext, String paramString)
  {
    boolean bool = zzbj();
    Context localContext;
    if (bool)
    {
      localObject = (zzaj)this.zzpI.get();
      if (localObject != null)
      {
        zzbk();
        localContext = zzq(paramContext);
      }
    }
    for (Object localObject = ((zzaj)localObject).zzb(localContext, paramString);; localObject = "") {
      return (String)localObject;
    }
  }
  
  protected boolean zzbj()
  {
    try
    {
      CountDownLatch localCountDownLatch = this.zzpJ;
      localCountDownLatch.await();
      bool = true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        String str = "Interrupted during GADSignals creation.";
        zzin.zzd(str, localInterruptedException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */