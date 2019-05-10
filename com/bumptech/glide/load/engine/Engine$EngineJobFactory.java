package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class Engine$EngineJobFactory
{
  final GlideExecutor animationExecutor;
  final GlideExecutor diskCacheExecutor;
  final EngineJobListener listener;
  final k.a pool;
  final GlideExecutor sourceExecutor;
  final GlideExecutor sourceUnlimitedExecutor;
  
  Engine$EngineJobFactory(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener)
  {
    Engine.EngineJobFactory.1 local1 = new com/bumptech/glide/load/engine/Engine$EngineJobFactory$1;
    local1.<init>(this);
    k.a locala = FactoryPools.simple(150, local1);
    this.pool = locala;
    this.diskCacheExecutor = paramGlideExecutor1;
    this.sourceExecutor = paramGlideExecutor2;
    this.sourceUnlimitedExecutor = paramGlideExecutor3;
    this.animationExecutor = paramGlideExecutor4;
    this.listener = paramEngineJobListener;
  }
  
  private static void shutdownAndAwaitTermination(ExecutorService paramExecutorService)
  {
    long l = 5;
    paramExecutorService.shutdown();
    try
    {
      TimeUnit localTimeUnit = TimeUnit.SECONDS;
      boolean bool1 = paramExecutorService.awaitTermination(l, localTimeUnit);
      if (!bool1)
      {
        paramExecutorService.shutdownNow();
        localTimeUnit = TimeUnit.SECONDS;
        boolean bool2 = paramExecutorService.awaitTermination(l, localTimeUnit);
        if (!bool2)
        {
          RuntimeException localRuntimeException = new java/lang/RuntimeException;
          localObject = "Failed to shutdown";
          localRuntimeException.<init>((String)localObject);
          throw localRuntimeException;
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localInterruptedException);
      throw ((Throwable)localObject);
    }
  }
  
  EngineJob build(Key paramKey, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return ((EngineJob)Preconditions.checkNotNull((EngineJob)this.pool.acquire())).init(paramKey, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  void shutdown()
  {
    shutdownAndAwaitTermination(this.diskCacheExecutor);
    shutdownAndAwaitTermination(this.sourceExecutor);
    shutdownAndAwaitTermination(this.sourceUnlimitedExecutor);
    shutdownAndAwaitTermination(this.animationExecutor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$EngineJobFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */