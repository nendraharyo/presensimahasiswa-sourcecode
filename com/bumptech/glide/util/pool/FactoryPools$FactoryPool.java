package com.bumptech.glide.util.pool;

import android.support.v4.h.k.a;
import android.util.Log;

final class FactoryPools$FactoryPool
  implements k.a
{
  private final FactoryPools.Factory factory;
  private final k.a pool;
  private final FactoryPools.Resetter resetter;
  
  FactoryPools$FactoryPool(k.a parama, FactoryPools.Factory paramFactory, FactoryPools.Resetter paramResetter)
  {
    this.pool = parama;
    this.factory = paramFactory;
    this.resetter = paramResetter;
  }
  
  public Object acquire()
  {
    Object localObject1 = this.pool;
    Object localObject2 = ((k.a)localObject1).acquire();
    int i;
    Object localObject3;
    if (localObject2 == null)
    {
      localObject2 = this.factory.create();
      localObject1 = "FactoryPools";
      i = 2;
      bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "FactoryPools";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Created new ");
        Class localClass = localObject2.getClass();
        localObject3 = localClass;
        Log.v((String)localObject1, (String)localObject3);
      }
    }
    boolean bool = localObject2 instanceof FactoryPools.Poolable;
    if (bool)
    {
      localObject1 = localObject2;
      localObject1 = ((FactoryPools.Poolable)localObject2).getVerifier();
      i = 0;
      localObject3 = null;
      ((StateVerifier)localObject1).setRecycled(false);
    }
    return localObject2;
  }
  
  public boolean release(Object paramObject)
  {
    boolean bool1 = paramObject instanceof FactoryPools.Poolable;
    if (bool1)
    {
      Object localObject = paramObject;
      localObject = ((FactoryPools.Poolable)paramObject).getVerifier();
      boolean bool2 = true;
      ((StateVerifier)localObject).setRecycled(bool2);
    }
    this.resetter.reset(paramObject);
    return this.pool.release(paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\FactoryPools$FactoryPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */