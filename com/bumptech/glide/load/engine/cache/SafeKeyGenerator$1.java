package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools.Factory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SafeKeyGenerator$1
  implements FactoryPools.Factory
{
  SafeKeyGenerator$1(SafeKeyGenerator paramSafeKeyGenerator) {}
  
  public SafeKeyGenerator.PoolableDigestContainer create()
  {
    try
    {
      SafeKeyGenerator.PoolableDigestContainer localPoolableDigestContainer = new com/bumptech/glide/load/engine/cache/SafeKeyGenerator$PoolableDigestContainer;
      localObject = "SHA-256";
      localObject = MessageDigest.getInstance((String)localObject);
      localPoolableDigestContainer.<init>((MessageDigest)localObject);
      return localPoolableDigestContainer;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\SafeKeyGenerator$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */