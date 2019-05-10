package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

final class DiskCacheWriteLocker
{
  private final Map locks;
  private final DiskCacheWriteLocker.WriteLockPool writeLockPool;
  
  DiskCacheWriteLocker()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.locks = ((Map)localObject);
    localObject = new com/bumptech/glide/load/engine/cache/DiskCacheWriteLocker$WriteLockPool;
    ((DiskCacheWriteLocker.WriteLockPool)localObject).<init>();
    this.writeLockPool = ((DiskCacheWriteLocker.WriteLockPool)localObject);
  }
  
  void acquire(String paramString)
  {
    try
    {
      Object localObject1 = this.locks;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = (DiskCacheWriteLocker.WriteLock)localObject1;
      if (localObject1 == null)
      {
        localObject1 = this.writeLockPool;
        localObject1 = ((DiskCacheWriteLocker.WriteLockPool)localObject1).obtain();
        Map localMap = this.locks;
        localMap.put(paramString, localObject1);
      }
      int i = ((DiskCacheWriteLocker.WriteLock)localObject1).interestedThreads + 1;
      ((DiskCacheWriteLocker.WriteLock)localObject1).interestedThreads = i;
      ((DiskCacheWriteLocker.WriteLock)localObject1).lock.lock();
      return;
    }
    finally {}
  }
  
  void release(String paramString)
  {
    Object localObject4;
    Object localObject5;
    Object localObject6;
    try
    {
      Object localObject1 = this.locks;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = Preconditions.checkNotNull(localObject1);
      localObject1 = (DiskCacheWriteLocker.WriteLock)localObject1;
      i = ((DiskCacheWriteLocker.WriteLock)localObject1).interestedThreads;
      int j = 1;
      if (i < j)
      {
        localObject4 = new java/lang/IllegalStateException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "Cannot release a lock that is not held, safeKey: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).append(paramString);
        localObject6 = ", interestedThreads: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        int k = ((DiskCacheWriteLocker.WriteLock)localObject1).interestedThreads;
        localObject1 = ((StringBuilder)localObject5).append(k);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((IllegalStateException)localObject4).<init>((String)localObject1);
        throw ((Throwable)localObject4);
      }
    }
    finally {}
    int i = ((DiskCacheWriteLocker.WriteLock)localObject2).interestedThreads + -1;
    ((DiskCacheWriteLocker.WriteLock)localObject2).interestedThreads = i;
    i = ((DiskCacheWriteLocker.WriteLock)localObject2).interestedThreads;
    Object localObject3;
    if (i == 0)
    {
      localObject4 = this.locks;
      localObject4 = ((Map)localObject4).remove(paramString);
      localObject4 = (DiskCacheWriteLocker.WriteLock)localObject4;
      boolean bool = localObject4.equals(localObject2);
      if (!bool)
      {
        localObject5 = new java/lang/IllegalStateException;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        String str = "Removed the wrong lock, expected to remove: ";
        localObject6 = ((StringBuilder)localObject6).append(str);
        localObject3 = ((StringBuilder)localObject6).append(localObject2);
        localObject6 = ", but actually removed: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
        localObject3 = ((StringBuilder)localObject3).append(localObject4);
        localObject4 = ", safeKey: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append(paramString);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((IllegalStateException)localObject5).<init>((String)localObject3);
        throw ((Throwable)localObject5);
      }
      localObject5 = this.writeLockPool;
      ((DiskCacheWriteLocker.WriteLockPool)localObject5).offer((DiskCacheWriteLocker.WriteLock)localObject4);
    }
    ((DiskCacheWriteLocker.WriteLock)localObject3).lock.unlock();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskCacheWriteLocker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */