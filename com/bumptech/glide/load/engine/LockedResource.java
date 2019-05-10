package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;

final class LockedResource
  implements Resource, FactoryPools.Poolable
{
  private static final k.a POOL;
  private boolean isLocked;
  private boolean isRecycled;
  private final StateVerifier stateVerifier;
  private Resource toWrap;
  
  static
  {
    LockedResource.1 local1 = new com/bumptech/glide/load/engine/LockedResource$1;
    local1.<init>();
    POOL = FactoryPools.threadSafe(20, local1);
  }
  
  LockedResource()
  {
    StateVerifier localStateVerifier = StateVerifier.newInstance();
    this.stateVerifier = localStateVerifier;
  }
  
  private void init(Resource paramResource)
  {
    this.isRecycled = false;
    this.isLocked = true;
    this.toWrap = paramResource;
  }
  
  static LockedResource obtain(Resource paramResource)
  {
    LockedResource localLockedResource = (LockedResource)Preconditions.checkNotNull((LockedResource)POOL.acquire());
    localLockedResource.init(paramResource);
    return localLockedResource;
  }
  
  private void release()
  {
    this.toWrap = null;
    POOL.release(this);
  }
  
  public Object get()
  {
    return this.toWrap.get();
  }
  
  public Class getResourceClass()
  {
    return this.toWrap.getResourceClass();
  }
  
  public int getSize()
  {
    return this.toWrap.getSize();
  }
  
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  public void recycle()
  {
    try
    {
      Object localObject1 = this.stateVerifier;
      ((StateVerifier)localObject1).throwIfRecycled();
      boolean bool = true;
      this.isRecycled = bool;
      bool = this.isLocked;
      if (!bool)
      {
        localObject1 = this.toWrap;
        ((Resource)localObject1).recycle();
        release();
      }
      return;
    }
    finally {}
  }
  
  void unlock()
  {
    try
    {
      Object localObject1 = this.stateVerifier;
      ((StateVerifier)localObject1).throwIfRecycled();
      bool = this.isLocked;
      if (!bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        String str = "Already unlocked";
        ((IllegalStateException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    boolean bool = false;
    Object localObject3 = null;
    this.isLocked = false;
    bool = this.isRecycled;
    if (bool) {
      recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\LockedResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */