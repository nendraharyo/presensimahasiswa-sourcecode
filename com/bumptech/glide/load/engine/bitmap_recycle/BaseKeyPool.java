package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.util.Util;
import java.util.Queue;

abstract class BaseKeyPool
{
  private static final int MAX_SIZE = 20;
  private final Queue keyPool;
  
  BaseKeyPool()
  {
    Queue localQueue = Util.createQueue(20);
    this.keyPool = localQueue;
  }
  
  abstract Poolable create();
  
  Poolable get()
  {
    Poolable localPoolable = (Poolable)this.keyPool.poll();
    if (localPoolable == null) {
      localPoolable = create();
    }
    return localPoolable;
  }
  
  public void offer(Poolable paramPoolable)
  {
    Queue localQueue = this.keyPool;
    int i = localQueue.size();
    int j = 20;
    if (i < j)
    {
      localQueue = this.keyPool;
      localQueue.offer(paramPoolable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\BaseKeyPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */