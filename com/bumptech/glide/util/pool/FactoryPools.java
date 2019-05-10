package com.bumptech.glide.util.pool;

import android.support.v4.h.k.a;
import android.support.v4.h.k.b;
import android.support.v4.h.k.c;

public final class FactoryPools
{
  private static final int DEFAULT_POOL_SIZE = 20;
  private static final FactoryPools.Resetter EMPTY_RESETTER;
  private static final String TAG = "FactoryPools";
  
  static
  {
    FactoryPools.1 local1 = new com/bumptech/glide/util/pool/FactoryPools$1;
    local1.<init>();
    EMPTY_RESETTER = local1;
  }
  
  private static k.a build(k.a parama, FactoryPools.Factory paramFactory)
  {
    FactoryPools.Resetter localResetter = emptyResetter();
    return build(parama, paramFactory, localResetter);
  }
  
  private static k.a build(k.a parama, FactoryPools.Factory paramFactory, FactoryPools.Resetter paramResetter)
  {
    FactoryPools.FactoryPool localFactoryPool = new com/bumptech/glide/util/pool/FactoryPools$FactoryPool;
    localFactoryPool.<init>(parama, paramFactory, paramResetter);
    return localFactoryPool;
  }
  
  private static FactoryPools.Resetter emptyResetter()
  {
    return EMPTY_RESETTER;
  }
  
  public static k.a simple(int paramInt, FactoryPools.Factory paramFactory)
  {
    k.b localb = new android/support/v4/h/k$b;
    localb.<init>(paramInt);
    return build(localb, paramFactory);
  }
  
  public static k.a threadSafe(int paramInt, FactoryPools.Factory paramFactory)
  {
    k.c localc = new android/support/v4/h/k$c;
    localc.<init>(paramInt);
    return build(localc, paramFactory);
  }
  
  public static k.a threadSafeList()
  {
    return threadSafeList(20);
  }
  
  public static k.a threadSafeList(int paramInt)
  {
    k.c localc = new android/support/v4/h/k$c;
    localc.<init>(paramInt);
    FactoryPools.2 local2 = new com/bumptech/glide/util/pool/FactoryPools$2;
    local2.<init>();
    FactoryPools.3 local3 = new com/bumptech/glide/util/pool/FactoryPools$3;
    local3.<init>();
    return build(localc, local2, local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\FactoryPools.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */