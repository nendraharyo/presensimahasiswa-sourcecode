package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.Queue;

class DiskCacheWriteLocker$WriteLockPool
{
  private static final int MAX_POOL_SIZE = 10;
  private final Queue pool;
  
  DiskCacheWriteLocker$WriteLockPool()
  {
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>();
    this.pool = localArrayDeque;
  }
  
  DiskCacheWriteLocker.WriteLock obtain()
  {
    synchronized (this.pool)
    {
      Object localObject1 = this.pool;
      localObject1 = ((Queue)localObject1).poll();
      localObject1 = (DiskCacheWriteLocker.WriteLock)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/cache/DiskCacheWriteLocker$WriteLock;
        ((DiskCacheWriteLocker.WriteLock)localObject1).<init>();
      }
      return (DiskCacheWriteLocker.WriteLock)localObject1;
    }
  }
  
  void offer(DiskCacheWriteLocker.WriteLock paramWriteLock)
  {
    synchronized (this.pool)
    {
      Queue localQueue2 = this.pool;
      int i = localQueue2.size();
      int j = 10;
      if (i < j)
      {
        localQueue2 = this.pool;
        localQueue2.offer(paramWriteLock);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskCacheWriteLocker$WriteLockPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */