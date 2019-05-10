package com.google.android.gms.internal;

import android.content.Context;

final class zzam$zzb
  implements Runnable
{
  private Context zzoq;
  
  public zzam$zzb(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.zzoq = localContext;
    localContext = this.zzoq;
    if (localContext == null) {
      this.zzoq = paramContext;
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc 22
    //   2: astore_1
    //   3: aload_1
    //   4: monitorenter
    //   5: invokestatic 26	com/google/android/gms/internal/zzam:zzZ	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +34 -> 44
    //   13: iconst_1
    //   14: istore_3
    //   15: iload_3
    //   16: invokestatic 33	com/google/android/gms/ads/identifier/AdvertisingIdClient:setShouldSkipGmsCoreVersionCheck	(Z)V
    //   19: new 29	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 20	com/google/android/gms/internal/zzam$zzb:zzoq	Landroid/content/Context;
    //   27: astore 4
    //   29: aload_2
    //   30: aload 4
    //   32: invokespecial 36	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;)V
    //   35: aload_2
    //   36: invokevirtual 39	com/google/android/gms/ads/identifier/AdvertisingIdClient:start	()V
    //   39: aload_2
    //   40: invokestatic 43	com/google/android/gms/internal/zzam:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   43: pop
    //   44: invokestatic 47	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   47: astore_2
    //   48: aload_2
    //   49: invokevirtual 52	java/util/concurrent/CountDownLatch:countDown	()V
    //   52: aload_1
    //   53: monitorexit
    //   54: return
    //   55: astore_2
    //   56: iconst_0
    //   57: istore_3
    //   58: aconst_null
    //   59: astore_2
    //   60: aconst_null
    //   61: invokestatic 43	com/google/android/gms/internal/zzam:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   64: pop
    //   65: invokestatic 47	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   68: astore_2
    //   69: aload_2
    //   70: invokevirtual 52	java/util/concurrent/CountDownLatch:countDown	()V
    //   73: goto -21 -> 52
    //   76: astore_2
    //   77: aload_1
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    //   81: astore_2
    //   82: invokestatic 47	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   85: astore 4
    //   87: aload 4
    //   89: invokevirtual 52	java/util/concurrent/CountDownLatch:countDown	()V
    //   92: aload_2
    //   93: athrow
    //   94: astore_2
    //   95: goto -39 -> 56
    //   98: astore_2
    //   99: goto -43 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	zzb
    //   2	76	1	localClass	Class
    //   8	41	2	localObject1	Object
    //   55	1	2	localGooglePlayServicesRepairableException	com.google.android.gms.common.GooglePlayServicesRepairableException
    //   59	11	2	localCountDownLatch	java.util.concurrent.CountDownLatch
    //   76	4	2	localObject2	Object
    //   81	12	2	localObject3	Object
    //   94	1	2	localGooglePlayServicesNotAvailableException	com.google.android.gms.common.GooglePlayServicesNotAvailableException
    //   98	1	2	localIOException	java.io.IOException
    //   14	44	3	bool	boolean
    //   27	61	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   5	8	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   15	19	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   19	22	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   23	27	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   30	35	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   35	39	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   39	44	55	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   44	47	76	finally
    //   48	52	76	finally
    //   52	54	76	finally
    //   65	68	76	finally
    //   69	73	76	finally
    //   77	79	76	finally
    //   82	85	76	finally
    //   87	92	76	finally
    //   92	94	76	finally
    //   5	8	81	finally
    //   15	19	81	finally
    //   19	22	81	finally
    //   23	27	81	finally
    //   30	35	81	finally
    //   35	39	81	finally
    //   39	44	81	finally
    //   60	65	81	finally
    //   5	8	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   15	19	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   19	22	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   23	27	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   30	35	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   35	39	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   39	44	94	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   5	8	98	java/io/IOException
    //   15	19	98	java/io/IOException
    //   19	22	98	java/io/IOException
    //   23	27	98	java/io/IOException
    //   30	35	98	java/io/IOException
    //   35	39	98	java/io/IOException
    //   39	44	98	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzam$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */