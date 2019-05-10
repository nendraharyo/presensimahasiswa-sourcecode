package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;

class Engine$LazyDiskCacheProvider
  implements DecodeJob.DiskCacheProvider
{
  private volatile DiskCache diskCache;
  private final DiskCache.Factory factory;
  
  Engine$LazyDiskCacheProvider(DiskCache.Factory paramFactory)
  {
    this.factory = paramFactory;
  }
  
  /* Error */
  void clearDiskCacheIfCreated()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	com/bumptech/glide/load/engine/Engine$LazyDiskCacheProvider:diskCache	Lcom/bumptech/glide/load/engine/cache/DiskCache;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 18	com/bumptech/glide/load/engine/Engine$LazyDiskCacheProvider:diskCache	Lcom/bumptech/glide/load/engine/cache/DiskCache;
    //   18: astore_1
    //   19: aload_1
    //   20: invokeinterface 23 1 0
    //   25: goto -14 -> 11
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	LazyDiskCacheProvider
    //   6	14	1	localDiskCache	DiskCache
    //   28	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	28	finally
    //   14	18	28	finally
    //   19	25	28	finally
  }
  
  public DiskCache getDiskCache()
  {
    Object localObject1 = this.diskCache;
    if (localObject1 == null) {}
    try
    {
      localObject1 = this.diskCache;
      if (localObject1 == null)
      {
        localObject1 = this.factory;
        localObject1 = ((DiskCache.Factory)localObject1).build();
        this.diskCache = ((DiskCache)localObject1);
      }
      localObject1 = this.diskCache;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/cache/DiskCacheAdapter;
        ((DiskCacheAdapter)localObject1).<init>();
        this.diskCache = ((DiskCache)localObject1);
      }
      return this.diskCache;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$LazyDiskCacheProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */