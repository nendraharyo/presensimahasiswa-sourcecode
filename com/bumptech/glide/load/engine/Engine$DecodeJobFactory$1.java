package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.util.pool.FactoryPools.Factory;

class Engine$DecodeJobFactory$1
  implements FactoryPools.Factory
{
  Engine$DecodeJobFactory$1(Engine.DecodeJobFactory paramDecodeJobFactory) {}
  
  public DecodeJob create()
  {
    DecodeJob localDecodeJob = new com/bumptech/glide/load/engine/DecodeJob;
    DecodeJob.DiskCacheProvider localDiskCacheProvider = this.this$0.diskCacheProvider;
    k.a locala = this.this$0.pool;
    localDecodeJob.<init>(localDiskCacheProvider, locala);
    return localDecodeJob;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$DecodeJobFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */