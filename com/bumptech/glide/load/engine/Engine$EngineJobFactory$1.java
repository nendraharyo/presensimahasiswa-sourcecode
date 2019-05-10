package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.util.pool.FactoryPools.Factory;

class Engine$EngineJobFactory$1
  implements FactoryPools.Factory
{
  Engine$EngineJobFactory$1(Engine.EngineJobFactory paramEngineJobFactory) {}
  
  public EngineJob create()
  {
    EngineJob localEngineJob = new com/bumptech/glide/load/engine/EngineJob;
    GlideExecutor localGlideExecutor1 = this.this$0.diskCacheExecutor;
    GlideExecutor localGlideExecutor2 = this.this$0.sourceExecutor;
    GlideExecutor localGlideExecutor3 = this.this$0.sourceUnlimitedExecutor;
    GlideExecutor localGlideExecutor4 = this.this$0.animationExecutor;
    EngineJobListener localEngineJobListener = this.this$0.listener;
    k.a locala = this.this$0.pool;
    localEngineJob.<init>(localGlideExecutor1, localGlideExecutor2, localGlideExecutor3, localGlideExecutor4, localEngineJobListener, locala);
    return localEngineJob;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$EngineJobFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */