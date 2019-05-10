package com.bumptech.glide.load.engine.cache;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import java.security.MessageDigest;

public class SafeKeyGenerator
{
  private final k.a digestPool;
  private final LruCache loadIdToSafeHash;
  
  public SafeKeyGenerator()
  {
    Object localObject = new com/bumptech/glide/util/LruCache;
    ((LruCache)localObject).<init>(1000L);
    this.loadIdToSafeHash = ((LruCache)localObject);
    SafeKeyGenerator.1 local1 = new com/bumptech/glide/load/engine/cache/SafeKeyGenerator$1;
    local1.<init>(this);
    localObject = FactoryPools.threadSafe(10, local1);
    this.digestPool = ((k.a)localObject);
  }
  
  private String calculateHexStringDigest(Key paramKey)
  {
    SafeKeyGenerator.PoolableDigestContainer localPoolableDigestContainer = (SafeKeyGenerator.PoolableDigestContainer)Preconditions.checkNotNull(this.digestPool.acquire());
    try
    {
      Object localObject1 = localPoolableDigestContainer.messageDigest;
      paramKey.updateDiskCacheKey((MessageDigest)localObject1);
      localObject1 = localPoolableDigestContainer.messageDigest;
      localObject1 = ((MessageDigest)localObject1).digest();
      localObject1 = Util.sha256BytesToHex((byte[])localObject1);
      return (String)localObject1;
    }
    finally
    {
      this.digestPool.release(localPoolableDigestContainer);
    }
  }
  
  public String getSafeKey(Key paramKey)
  {
    Object localObject1;
    synchronized (this.loadIdToSafeHash)
    {
      localObject1 = this.loadIdToSafeHash;
      localObject1 = ((LruCache)localObject1).get(paramKey);
      localObject1 = (String)localObject1;
      if (localObject1 == null) {
        localObject1 = calculateHexStringDigest(paramKey);
      }
    }
    synchronized (this.loadIdToSafeHash)
    {
      LruCache localLruCache2 = this.loadIdToSafeHash;
      localLruCache2.put(paramKey, localObject1);
      return (String)localObject1;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\SafeKeyGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */