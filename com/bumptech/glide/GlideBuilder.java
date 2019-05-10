package com.bumptech.glide;

import android.content.Context;
import android.support.v4.h.a;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.request.RequestOptions;
import java.util.Map;

public final class GlideBuilder
{
  private GlideExecutor animationExecutor;
  private ArrayPool arrayPool;
  private BitmapPool bitmapPool;
  private ConnectivityMonitorFactory connectivityMonitorFactory;
  private RequestOptions defaultRequestOptions;
  private final Map defaultTransitionOptions;
  private GlideExecutor diskCacheExecutor;
  private DiskCache.Factory diskCacheFactory;
  private Engine engine;
  private boolean isActiveResourceRetentionAllowed;
  private int logLevel;
  private MemoryCache memoryCache;
  private MemorySizeCalculator memorySizeCalculator;
  private RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
  private GlideExecutor sourceExecutor;
  
  public GlideBuilder()
  {
    Object localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.defaultTransitionOptions = ((Map)localObject);
    this.logLevel = 4;
    localObject = new com/bumptech/glide/request/RequestOptions;
    ((RequestOptions)localObject).<init>();
    this.defaultRequestOptions = ((RequestOptions)localObject);
  }
  
  Glide build(Context paramContext)
  {
    Object localObject1 = this.sourceExecutor;
    if (localObject1 == null)
    {
      localObject1 = GlideExecutor.newSourceExecutor();
      this.sourceExecutor = ((GlideExecutor)localObject1);
    }
    localObject1 = this.diskCacheExecutor;
    if (localObject1 == null)
    {
      localObject1 = GlideExecutor.newDiskCacheExecutor();
      this.diskCacheExecutor = ((GlideExecutor)localObject1);
    }
    localObject1 = this.animationExecutor;
    if (localObject1 == null)
    {
      localObject1 = GlideExecutor.newAnimationExecutor();
      this.animationExecutor = ((GlideExecutor)localObject1);
    }
    localObject1 = this.memorySizeCalculator;
    if (localObject1 == null)
    {
      localObject1 = new com/bumptech/glide/load/engine/cache/MemorySizeCalculator$Builder;
      ((MemorySizeCalculator.Builder)localObject1).<init>(paramContext);
      localObject1 = ((MemorySizeCalculator.Builder)localObject1).build();
      this.memorySizeCalculator = ((MemorySizeCalculator)localObject1);
    }
    localObject1 = this.connectivityMonitorFactory;
    if (localObject1 == null)
    {
      localObject1 = new com/bumptech/glide/manager/DefaultConnectivityMonitorFactory;
      ((DefaultConnectivityMonitorFactory)localObject1).<init>();
      this.connectivityMonitorFactory = ((ConnectivityMonitorFactory)localObject1);
    }
    localObject1 = this.bitmapPool;
    Object localObject2;
    long l;
    if (localObject1 == null)
    {
      localObject1 = this.memorySizeCalculator;
      int i = ((MemorySizeCalculator)localObject1).getBitmapPoolSize();
      if (i <= 0) {
        break label426;
      }
      localObject2 = new com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool;
      l = i;
      ((LruBitmapPool)localObject2).<init>(l);
    }
    for (this.bitmapPool = ((BitmapPool)localObject2);; this.bitmapPool = ((BitmapPool)localObject1))
    {
      localObject1 = this.arrayPool;
      int j;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool;
        localObject2 = this.memorySizeCalculator;
        j = ((MemorySizeCalculator)localObject2).getArrayPoolSizeInBytes();
        ((LruArrayPool)localObject1).<init>(j);
        this.arrayPool = ((ArrayPool)localObject1);
      }
      localObject1 = this.memoryCache;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/cache/LruResourceCache;
        localObject2 = this.memorySizeCalculator;
        j = ((MemorySizeCalculator)localObject2).getMemoryCacheSize();
        l = j;
        ((LruResourceCache)localObject1).<init>(l);
        this.memoryCache = ((MemoryCache)localObject1);
      }
      localObject1 = this.diskCacheFactory;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/cache/InternalCacheDiskCacheFactory;
        ((InternalCacheDiskCacheFactory)localObject1).<init>(paramContext);
        this.diskCacheFactory = ((DiskCache.Factory)localObject1);
      }
      localObject1 = this.engine;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/engine/Engine;
        localObject2 = this.memoryCache;
        localObject3 = this.diskCacheFactory;
        localObject4 = this.diskCacheExecutor;
        localObject5 = this.sourceExecutor;
        localObject6 = GlideExecutor.newUnlimitedSourceExecutor();
        localObject7 = GlideExecutor.newAnimationExecutor();
        boolean bool = this.isActiveResourceRetentionAllowed;
        ((Engine)localObject1).<init>((MemoryCache)localObject2, (DiskCache.Factory)localObject3, (GlideExecutor)localObject4, (GlideExecutor)localObject5, (GlideExecutor)localObject6, (GlideExecutor)localObject7, bool);
        this.engine = ((Engine)localObject1);
      }
      Object localObject7 = new com/bumptech/glide/manager/RequestManagerRetriever;
      localObject1 = this.requestManagerFactory;
      ((RequestManagerRetriever)localObject7).<init>((RequestManagerRetriever.RequestManagerFactory)localObject1);
      localObject1 = new com/bumptech/glide/Glide;
      Object localObject3 = this.engine;
      Object localObject4 = this.memoryCache;
      Object localObject5 = this.bitmapPool;
      Object localObject6 = this.arrayPool;
      ConnectivityMonitorFactory localConnectivityMonitorFactory = this.connectivityMonitorFactory;
      int k = this.logLevel;
      RequestOptions localRequestOptions = this.defaultRequestOptions.lock();
      Map localMap = this.defaultTransitionOptions;
      localObject2 = paramContext;
      ((Glide)localObject1).<init>(paramContext, (Engine)localObject3, (MemoryCache)localObject4, (BitmapPool)localObject5, (ArrayPool)localObject6, (RequestManagerRetriever)localObject7, localConnectivityMonitorFactory, k, localRequestOptions, localMap);
      return (Glide)localObject1;
      label426:
      localObject1 = new com/bumptech/glide/load/engine/bitmap_recycle/BitmapPoolAdapter;
      ((BitmapPoolAdapter)localObject1).<init>();
    }
  }
  
  public GlideBuilder setAnimationExecutor(GlideExecutor paramGlideExecutor)
  {
    this.animationExecutor = paramGlideExecutor;
    return this;
  }
  
  public GlideBuilder setArrayPool(ArrayPool paramArrayPool)
  {
    this.arrayPool = paramArrayPool;
    return this;
  }
  
  public GlideBuilder setBitmapPool(BitmapPool paramBitmapPool)
  {
    this.bitmapPool = paramBitmapPool;
    return this;
  }
  
  public GlideBuilder setConnectivityMonitorFactory(ConnectivityMonitorFactory paramConnectivityMonitorFactory)
  {
    this.connectivityMonitorFactory = paramConnectivityMonitorFactory;
    return this;
  }
  
  public GlideBuilder setDefaultRequestOptions(RequestOptions paramRequestOptions)
  {
    this.defaultRequestOptions = paramRequestOptions;
    return this;
  }
  
  public GlideBuilder setDefaultTransitionOptions(Class paramClass, TransitionOptions paramTransitionOptions)
  {
    this.defaultTransitionOptions.put(paramClass, paramTransitionOptions);
    return this;
  }
  
  public GlideBuilder setDiskCache(DiskCache.Factory paramFactory)
  {
    this.diskCacheFactory = paramFactory;
    return this;
  }
  
  public GlideBuilder setDiskCacheExecutor(GlideExecutor paramGlideExecutor)
  {
    this.diskCacheExecutor = paramGlideExecutor;
    return this;
  }
  
  GlideBuilder setEngine(Engine paramEngine)
  {
    this.engine = paramEngine;
    return this;
  }
  
  public GlideBuilder setIsActiveResourceRetentionAllowed(boolean paramBoolean)
  {
    this.isActiveResourceRetentionAllowed = paramBoolean;
    return this;
  }
  
  public GlideBuilder setLogLevel(int paramInt)
  {
    int i = 2;
    if (paramInt >= i)
    {
      i = 6;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
      throw localIllegalArgumentException;
    }
    this.logLevel = paramInt;
    return this;
  }
  
  public GlideBuilder setMemoryCache(MemoryCache paramMemoryCache)
  {
    this.memoryCache = paramMemoryCache;
    return this;
  }
  
  public GlideBuilder setMemorySizeCalculator(MemorySizeCalculator.Builder paramBuilder)
  {
    MemorySizeCalculator localMemorySizeCalculator = paramBuilder.build();
    return setMemorySizeCalculator(localMemorySizeCalculator);
  }
  
  public GlideBuilder setMemorySizeCalculator(MemorySizeCalculator paramMemorySizeCalculator)
  {
    this.memorySizeCalculator = paramMemorySizeCalculator;
    return this;
  }
  
  void setRequestManagerFactory(RequestManagerRetriever.RequestManagerFactory paramRequestManagerFactory)
  {
    this.requestManagerFactory = paramRequestManagerFactory;
  }
  
  public GlideBuilder setResizeExecutor(GlideExecutor paramGlideExecutor)
  {
    return setSourceExecutor(paramGlideExecutor);
  }
  
  public GlideBuilder setSourceExecutor(GlideExecutor paramGlideExecutor)
  {
    this.sourceExecutor = paramGlideExecutor;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\GlideBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */