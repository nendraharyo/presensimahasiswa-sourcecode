package com.bumptech.glide.load.engine.cache;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DiskCacheWriteLocker$WriteLock
{
  int interestedThreads;
  final Lock lock;
  
  DiskCacheWriteLocker$WriteLock()
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    this.lock = localReentrantLock;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskCacheWriteLocker$WriteLock.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */