package io.fabric.sdk.android.services.cache;

import android.content.Context;

public abstract class AbstractValueCache
  implements ValueCache
{
  private final ValueCache childCache;
  
  public AbstractValueCache()
  {
    this(null);
  }
  
  public AbstractValueCache(ValueCache paramValueCache)
  {
    this.childCache = paramValueCache;
  }
  
  private void cache(Context paramContext, Object paramObject)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>();
      throw localNullPointerException;
    }
    cacheValue(paramContext, paramObject);
  }
  
  protected abstract void cacheValue(Context paramContext, Object paramObject);
  
  protected abstract void doInvalidate(Context paramContext);
  
  /* Error */
  public final Object get(Context paramContext, ValueLoader paramValueLoader)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 28	io/fabric/sdk/android/services/cache/AbstractValueCache:getCached	(Landroid/content/Context;)Ljava/lang/Object;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnonnull +32 -> 41
    //   12: aload_0
    //   13: getfield 17	io/fabric/sdk/android/services/cache/AbstractValueCache:childCache	Lio/fabric/sdk/android/services/cache/ValueCache;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +27 -> 45
    //   21: aload_0
    //   22: getfield 17	io/fabric/sdk/android/services/cache/AbstractValueCache:childCache	Lio/fabric/sdk/android/services/cache/ValueCache;
    //   25: astore_3
    //   26: aload_3
    //   27: aload_1
    //   28: aload_2
    //   29: invokeinterface 32 3 0
    //   34: astore_3
    //   35: aload_0
    //   36: aload_1
    //   37: aload_3
    //   38: invokespecial 35	io/fabric/sdk/android/services/cache/AbstractValueCache:cache	(Landroid/content/Context;Ljava/lang/Object;)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_3
    //   44: areturn
    //   45: aload_2
    //   46: aload_1
    //   47: invokeinterface 40 2 0
    //   52: astore_3
    //   53: goto -18 -> 35
    //   56: astore_3
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_3
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	AbstractValueCache
    //   0	61	1	paramContext	Context
    //   0	61	2	paramValueLoader	ValueLoader
    //   7	46	3	localObject1	Object
    //   56	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	7	56	finally
    //   12	16	56	finally
    //   21	25	56	finally
    //   28	34	56	finally
    //   37	41	56	finally
    //   46	52	56	finally
  }
  
  protected abstract Object getCached(Context paramContext);
  
  public final void invalidate(Context paramContext)
  {
    try
    {
      doInvalidate(paramContext);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\cache\AbstractValueCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */