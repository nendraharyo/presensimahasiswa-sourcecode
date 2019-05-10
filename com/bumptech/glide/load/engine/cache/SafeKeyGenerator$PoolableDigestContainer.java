package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;

final class SafeKeyGenerator$PoolableDigestContainer
  implements FactoryPools.Poolable
{
  final MessageDigest messageDigest;
  private final StateVerifier stateVerifier;
  
  SafeKeyGenerator$PoolableDigestContainer(MessageDigest paramMessageDigest)
  {
    StateVerifier localStateVerifier = StateVerifier.newInstance();
    this.stateVerifier = localStateVerifier;
    this.messageDigest = paramMessageDigest;
  }
  
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\SafeKeyGenerator$PoolableDigestContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */