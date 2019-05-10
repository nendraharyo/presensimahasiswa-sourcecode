package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.util.Map;

public class Engine
  implements EngineJobListener, EngineResource.ResourceListener, MemoryCache.ResourceRemovedListener
{
  private static final int JOB_POOL_SIZE = 150;
  private static final String TAG = "Engine";
  private static final boolean VERBOSE_IS_LOGGABLE = Log.isLoggable("Engine", 2);
  private final ActiveResources activeResources;
  private final MemoryCache cache;
  private final Engine.DecodeJobFactory decodeJobFactory;
  private final Engine.LazyDiskCacheProvider diskCacheProvider;
  private final Engine.EngineJobFactory engineJobFactory;
  private final Jobs jobs;
  private final EngineKeyFactory keyFactory;
  private final ResourceRecycler resourceRecycler;
  
  Engine(MemoryCache paramMemoryCache, DiskCache.Factory paramFactory, GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, Jobs paramJobs, EngineKeyFactory paramEngineKeyFactory, ActiveResources paramActiveResources, Engine.EngineJobFactory paramEngineJobFactory, Engine.DecodeJobFactory paramDecodeJobFactory, ResourceRecycler paramResourceRecycler, boolean paramBoolean)
  {
    this.cache = paramMemoryCache;
    Object localObject = new com/bumptech/glide/load/engine/Engine$LazyDiskCacheProvider;
    ((Engine.LazyDiskCacheProvider)localObject).<init>(paramFactory);
    this.diskCacheProvider = ((Engine.LazyDiskCacheProvider)localObject);
    if (paramActiveResources == null)
    {
      paramActiveResources = new com/bumptech/glide/load/engine/ActiveResources;
      paramActiveResources.<init>(paramBoolean);
    }
    this.activeResources = paramActiveResources;
    paramActiveResources.setListener(this);
    if (paramEngineKeyFactory == null)
    {
      paramEngineKeyFactory = new com/bumptech/glide/load/engine/EngineKeyFactory;
      paramEngineKeyFactory.<init>();
    }
    this.keyFactory = paramEngineKeyFactory;
    if (paramJobs == null)
    {
      paramJobs = new com/bumptech/glide/load/engine/Jobs;
      paramJobs.<init>();
    }
    this.jobs = paramJobs;
    if (paramEngineJobFactory == null)
    {
      localObject = new com/bumptech/glide/load/engine/Engine$EngineJobFactory;
      ((Engine.EngineJobFactory)localObject).<init>(paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, this);
    }
    for (;;)
    {
      this.engineJobFactory = ((Engine.EngineJobFactory)localObject);
      if (paramDecodeJobFactory == null)
      {
        paramDecodeJobFactory = new com/bumptech/glide/load/engine/Engine$DecodeJobFactory;
        localObject = this.diskCacheProvider;
        paramDecodeJobFactory.<init>((DecodeJob.DiskCacheProvider)localObject);
      }
      this.decodeJobFactory = paramDecodeJobFactory;
      if (paramResourceRecycler == null)
      {
        paramResourceRecycler = new com/bumptech/glide/load/engine/ResourceRecycler;
        paramResourceRecycler.<init>();
      }
      this.resourceRecycler = paramResourceRecycler;
      paramMemoryCache.setResourceRemovedListener(this);
      return;
      localObject = paramEngineJobFactory;
    }
  }
  
  public Engine(MemoryCache paramMemoryCache, DiskCache.Factory paramFactory, GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, boolean paramBoolean)
  {
    this(paramMemoryCache, paramFactory, paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, null, null, null, null, null, null, paramBoolean);
  }
  
  private EngineResource getEngineResourceFromCache(Key paramKey)
  {
    boolean bool1 = true;
    Object localObject = this.cache.remove(paramKey);
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (EngineResource)localObject;
      boolean bool2 = localObject instanceof EngineResource;
      if (bool2)
      {
        localObject = (EngineResource)localObject;
      }
      else
      {
        EngineResource localEngineResource = new com/bumptech/glide/load/engine/EngineResource;
        localEngineResource.<init>((Resource)localObject, bool1, bool1);
        localObject = localEngineResource;
      }
    }
  }
  
  private EngineResource loadFromActiveResources(Key paramKey, boolean paramBoolean)
  {
    EngineResource localEngineResource;
    if (!paramBoolean) {
      localEngineResource = null;
    }
    for (;;)
    {
      return localEngineResource;
      localEngineResource = this.activeResources.get(paramKey);
      if (localEngineResource != null) {
        localEngineResource.acquire();
      }
    }
  }
  
  private EngineResource loadFromCache(Key paramKey, boolean paramBoolean)
  {
    EngineResource localEngineResource;
    if (!paramBoolean) {
      localEngineResource = null;
    }
    for (;;)
    {
      return localEngineResource;
      localEngineResource = getEngineResourceFromCache(paramKey);
      if (localEngineResource != null)
      {
        localEngineResource.acquire();
        ActiveResources localActiveResources = this.activeResources;
        localActiveResources.activate(paramKey, localEngineResource);
      }
    }
  }
  
  private static void logWithTimeAndKey(String paramString, long paramLong, Key paramKey)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString).append(" in ");
    double d = LogTime.getElapsedMillis(paramLong);
    localObject = d + "ms, key: " + paramKey;
    Log.v("Engine", (String)localObject);
  }
  
  public void clearDiskCache()
  {
    this.diskCacheProvider.getDiskCache().clear();
  }
  
  public Engine.LoadStatus load(GlideContext paramGlideContext, Object paramObject, Key paramKey, int paramInt1, int paramInt2, Class paramClass1, Class paramClass2, Priority paramPriority, DiskCacheStrategy paramDiskCacheStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, Options paramOptions, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, ResourceCallback paramResourceCallback)
  {
    Util.assertMainThread();
    boolean bool = VERBOSE_IS_LOGGABLE;
    long l1;
    long l2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      l1 = LogTime.getLogTime();
      l2 = l1;
      localObject1 = this.keyFactory;
      localObject2 = paramObject;
      localObject3 = paramKey;
      localObject2 = ((EngineKeyFactory)localObject1).buildKey(paramObject, paramKey, paramInt1, paramInt2, paramMap, paramClass1, paramClass2, paramOptions);
      localObject1 = loadFromActiveResources((Key)localObject2, paramBoolean3);
      if (localObject1 == null) {
        break label128;
      }
      localObject3 = DataSource.MEMORY_CACHE;
      paramResourceCallback.onResourceReady((Resource)localObject1, (DataSource)localObject3);
      bool = VERBOSE_IS_LOGGABLE;
      if (bool)
      {
        localObject1 = "Loaded resource from active resources";
        logWithTimeAndKey((String)localObject1, l2, (Key)localObject2);
      }
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (Engine.LoadStatus)localObject1;
      l1 = 0L;
      l2 = l1;
      break;
      label128:
      localObject1 = loadFromCache((Key)localObject2, paramBoolean3);
      if (localObject1 != null)
      {
        localObject3 = DataSource.MEMORY_CACHE;
        paramResourceCallback.onResourceReady((Resource)localObject1, (DataSource)localObject3);
        bool = VERBOSE_IS_LOGGABLE;
        if (bool)
        {
          localObject1 = "Loaded resource from cache";
          logWithTimeAndKey((String)localObject1, l2, (Key)localObject2);
        }
        bool = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = this.jobs;
        localObject3 = ((Jobs)localObject1).get((Key)localObject2, paramBoolean6);
        if (localObject3 != null)
        {
          ((EngineJob)localObject3).addCallback(paramResourceCallback);
          bool = VERBOSE_IS_LOGGABLE;
          if (bool)
          {
            localObject1 = "Added to existing load";
            logWithTimeAndKey((String)localObject1, l2, (Key)localObject2);
          }
          localObject1 = new com/bumptech/glide/load/engine/Engine$LoadStatus;
          ((Engine.LoadStatus)localObject1).<init>(paramResourceCallback, (EngineJob)localObject3);
        }
        else
        {
          EngineJob localEngineJob = this.engineJobFactory.build((Key)localObject2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6);
          localObject1 = this.decodeJobFactory.build(paramGlideContext, paramObject, (EngineKey)localObject2, paramKey, paramInt1, paramInt2, paramClass1, paramClass2, paramPriority, paramDiskCacheStrategy, paramMap, paramBoolean1, paramBoolean2, paramBoolean6, paramOptions, localEngineJob);
          localObject3 = this.jobs;
          ((Jobs)localObject3).put((Key)localObject2, localEngineJob);
          localEngineJob.addCallback(paramResourceCallback);
          localEngineJob.start((DecodeJob)localObject1);
          bool = VERBOSE_IS_LOGGABLE;
          if (bool)
          {
            localObject1 = "Started new load";
            logWithTimeAndKey((String)localObject1, l2, (Key)localObject2);
          }
          localObject1 = new com/bumptech/glide/load/engine/Engine$LoadStatus;
          ((Engine.LoadStatus)localObject1).<init>(paramResourceCallback, localEngineJob);
        }
      }
    }
  }
  
  public void onEngineJobCancelled(EngineJob paramEngineJob, Key paramKey)
  {
    Util.assertMainThread();
    this.jobs.removeIfCurrent(paramKey, paramEngineJob);
  }
  
  public void onEngineJobComplete(EngineJob paramEngineJob, Key paramKey, EngineResource paramEngineResource)
  {
    
    if (paramEngineResource != null)
    {
      paramEngineResource.setResourceListener(paramKey, this);
      boolean bool = paramEngineResource.isCacheable();
      if (bool)
      {
        ActiveResources localActiveResources = this.activeResources;
        localActiveResources.activate(paramKey, paramEngineResource);
      }
    }
    this.jobs.removeIfCurrent(paramKey, paramEngineJob);
  }
  
  public void onResourceReleased(Key paramKey, EngineResource paramEngineResource)
  {
    Util.assertMainThread();
    Object localObject = this.activeResources;
    ((ActiveResources)localObject).deactivate(paramKey);
    boolean bool = paramEngineResource.isCacheable();
    if (bool)
    {
      localObject = this.cache;
      ((MemoryCache)localObject).put(paramKey, paramEngineResource);
    }
    for (;;)
    {
      return;
      localObject = this.resourceRecycler;
      ((ResourceRecycler)localObject).recycle(paramEngineResource);
    }
  }
  
  public void onResourceRemoved(Resource paramResource)
  {
    Util.assertMainThread();
    this.resourceRecycler.recycle(paramResource);
  }
  
  public void release(Resource paramResource)
  {
    Util.assertMainThread();
    boolean bool = paramResource instanceof EngineResource;
    if (bool)
    {
      ((EngineResource)paramResource).release();
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Cannot release anything but an EngineResource");
    throw localIllegalArgumentException;
  }
  
  public void shutdown()
  {
    this.engineJobFactory.shutdown();
    this.diskCacheProvider.clearDiskCacheIfCreated();
    this.activeResources.shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Engine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */