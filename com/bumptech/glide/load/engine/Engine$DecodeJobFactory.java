package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;

class Engine$DecodeJobFactory
{
  private int creationOrder;
  final DecodeJob.DiskCacheProvider diskCacheProvider;
  final k.a pool;
  
  Engine$DecodeJobFactory(DecodeJob.DiskCacheProvider paramDiskCacheProvider)
  {
    Engine.DecodeJobFactory.1 local1 = new com/bumptech/glide/load/engine/Engine$DecodeJobFactory$1;
    local1.<init>(this);
    k.a locala = FactoryPools.simple(150, local1);
    this.pool = locala;
    this.diskCacheProvider = paramDiskCacheProvider;
  }
  
  DecodeJob build(GlideContext paramGlideContext, Object paramObject, EngineKey paramEngineKey, Key paramKey, int paramInt1, int paramInt2, Class paramClass1, Class paramClass2, Priority paramPriority, DiskCacheStrategy paramDiskCacheStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Options paramOptions, DecodeJob.Callback paramCallback)
  {
    DecodeJob localDecodeJob = (DecodeJob)Preconditions.checkNotNull((DecodeJob)this.pool.acquire());
    int i = this.creationOrder;
    int j = i + 1;
    this.creationOrder = j;
    return localDecodeJob.init(paramGlideContext, paramObject, paramEngineKey, paramKey, paramInt1, paramInt2, paramClass1, paramClass2, paramPriority, paramDiskCacheStrategy, paramMap, paramBoolean1, paramBoolean2, paramBoolean3, paramOptions, paramCallback, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine$DecodeJobFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */