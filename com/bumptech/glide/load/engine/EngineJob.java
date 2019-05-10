package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.h.k.a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EngineJob
  implements DecodeJob.Callback, FactoryPools.Poolable
{
  private static final EngineJob.EngineResourceFactory DEFAULT_FACTORY;
  private static final Handler MAIN_THREAD_HANDLER;
  private static final int MSG_CANCELLED = 3;
  private static final int MSG_COMPLETE = 1;
  private static final int MSG_EXCEPTION = 2;
  private final GlideExecutor animationExecutor;
  private final List cbs;
  private DataSource dataSource;
  private DecodeJob decodeJob;
  private final GlideExecutor diskCacheExecutor;
  private EngineResource engineResource;
  private final EngineJob.EngineResourceFactory engineResourceFactory;
  private GlideException exception;
  private boolean hasLoadFailed;
  private boolean hasResource;
  private List ignoredCallbacks;
  private boolean isCacheable;
  private volatile boolean isCancelled;
  private Key key;
  private final EngineJobListener listener;
  private boolean onlyRetrieveFromCache;
  private final k.a pool;
  private Resource resource;
  private final GlideExecutor sourceExecutor;
  private final GlideExecutor sourceUnlimitedExecutor;
  private final StateVerifier stateVerifier;
  private boolean useAnimationPool;
  private boolean useUnlimitedSourceGeneratorPool;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/engine/EngineJob$EngineResourceFactory;
    ((EngineJob.EngineResourceFactory)localObject).<init>();
    DEFAULT_FACTORY = (EngineJob.EngineResourceFactory)localObject;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    EngineJob.MainThreadCallback localMainThreadCallback = new com/bumptech/glide/load/engine/EngineJob$MainThreadCallback;
    localMainThreadCallback.<init>();
    ((Handler)localObject).<init>(localLooper, localMainThreadCallback);
    MAIN_THREAD_HANDLER = (Handler)localObject;
  }
  
  EngineJob(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener, k.a parama)
  {
    this(paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, paramEngineJobListener, parama, localEngineResourceFactory);
  }
  
  EngineJob(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener, k.a parama, EngineJob.EngineResourceFactory paramEngineResourceFactory)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(2);
    this.cbs = ((List)localObject);
    localObject = StateVerifier.newInstance();
    this.stateVerifier = ((StateVerifier)localObject);
    this.diskCacheExecutor = paramGlideExecutor1;
    this.sourceExecutor = paramGlideExecutor2;
    this.sourceUnlimitedExecutor = paramGlideExecutor3;
    this.animationExecutor = paramGlideExecutor4;
    this.listener = paramEngineJobListener;
    this.pool = parama;
    this.engineResourceFactory = paramEngineResourceFactory;
  }
  
  private void addIgnoredCallback(ResourceCallback paramResourceCallback)
  {
    Object localObject = this.ignoredCallbacks;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      int i = 2;
      ((ArrayList)localObject).<init>(i);
      this.ignoredCallbacks = ((List)localObject);
    }
    localObject = this.ignoredCallbacks;
    boolean bool = ((List)localObject).contains(paramResourceCallback);
    if (!bool)
    {
      localObject = this.ignoredCallbacks;
      ((List)localObject).add(paramResourceCallback);
    }
  }
  
  private GlideExecutor getActiveSourceExecutor()
  {
    boolean bool = this.useUnlimitedSourceGeneratorPool;
    GlideExecutor localGlideExecutor;
    if (bool) {
      localGlideExecutor = this.sourceUnlimitedExecutor;
    }
    for (;;)
    {
      return localGlideExecutor;
      bool = this.useAnimationPool;
      if (bool) {
        localGlideExecutor = this.animationExecutor;
      } else {
        localGlideExecutor = this.sourceExecutor;
      }
    }
  }
  
  private boolean isInIgnoredCallbacks(ResourceCallback paramResourceCallback)
  {
    List localList = this.ignoredCallbacks;
    boolean bool;
    if (localList != null)
    {
      localList = this.ignoredCallbacks;
      bool = localList.contains(paramResourceCallback);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  private void release(boolean paramBoolean)
  {
    Util.assertMainThread();
    this.cbs.clear();
    this.key = null;
    this.engineResource = null;
    this.resource = null;
    List localList = this.ignoredCallbacks;
    if (localList != null)
    {
      localList = this.ignoredCallbacks;
      localList.clear();
    }
    this.hasLoadFailed = false;
    this.isCancelled = false;
    this.hasResource = false;
    this.decodeJob.release(paramBoolean);
    this.decodeJob = null;
    this.exception = null;
    this.dataSource = null;
    this.pool.release(this);
  }
  
  void addCallback(ResourceCallback paramResourceCallback)
  {
    Util.assertMainThread();
    Object localObject = this.stateVerifier;
    ((StateVerifier)localObject).throwIfRecycled();
    boolean bool = this.hasResource;
    if (bool)
    {
      localObject = this.engineResource;
      DataSource localDataSource = this.dataSource;
      paramResourceCallback.onResourceReady((Resource)localObject, localDataSource);
    }
    for (;;)
    {
      return;
      bool = this.hasLoadFailed;
      if (bool)
      {
        localObject = this.exception;
        paramResourceCallback.onLoadFailed((GlideException)localObject);
      }
      else
      {
        localObject = this.cbs;
        ((List)localObject).add(paramResourceCallback);
      }
    }
  }
  
  void cancel()
  {
    boolean bool = this.hasLoadFailed;
    if (!bool)
    {
      bool = this.hasResource;
      if (!bool)
      {
        bool = this.isCancelled;
        if (!bool) {
          break label28;
        }
      }
    }
    for (;;)
    {
      return;
      label28:
      bool = true;
      this.isCancelled = bool;
      this.decodeJob.cancel();
      EngineJobListener localEngineJobListener = this.listener;
      Key localKey = this.key;
      localEngineJobListener.onEngineJobCancelled(this, localKey);
    }
  }
  
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  void handleCancelledOnMainThread()
  {
    Object localObject = this.stateVerifier;
    ((StateVerifier)localObject).throwIfRecycled();
    boolean bool = this.isCancelled;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Not cancelled");
      throw ((Throwable)localObject);
    }
    localObject = this.listener;
    Key localKey = this.key;
    ((EngineJobListener)localObject).onEngineJobCancelled(this, localKey);
    release(false);
  }
  
  void handleExceptionOnMainThread()
  {
    Object localObject1 = this.stateVerifier;
    ((StateVerifier)localObject1).throwIfRecycled();
    boolean bool1 = this.isCancelled;
    if (bool1) {
      release(false);
    }
    for (;;)
    {
      return;
      localObject1 = this.cbs;
      bool1 = ((List)localObject1).isEmpty();
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Received an exception without any callbacks to notify");
        throw ((Throwable)localObject1);
      }
      bool1 = this.hasLoadFailed;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Already failed once");
        throw ((Throwable)localObject1);
      }
      bool1 = true;
      this.hasLoadFailed = bool1;
      localObject1 = this.listener;
      Object localObject2 = this.key;
      boolean bool2 = false;
      GlideException localGlideException = null;
      ((EngineJobListener)localObject1).onEngineJobComplete(this, (Key)localObject2, null);
      localObject1 = this.cbs;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (ResourceCallback)((Iterator)localObject2).next();
        bool2 = isInIgnoredCallbacks((ResourceCallback)localObject1);
        if (!bool2)
        {
          localGlideException = this.exception;
          ((ResourceCallback)localObject1).onLoadFailed(localGlideException);
        }
      }
      release(false);
    }
  }
  
  void handleResultOnMainThread()
  {
    Object localObject1 = this.stateVerifier;
    ((StateVerifier)localObject1).throwIfRecycled();
    boolean bool1 = this.isCancelled;
    if (bool1)
    {
      localObject1 = this.resource;
      ((Resource)localObject1).recycle();
      release(false);
    }
    for (;;)
    {
      return;
      localObject1 = this.cbs;
      bool1 = ((List)localObject1).isEmpty();
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Received a resource without any callbacks to notify");
        throw ((Throwable)localObject1);
      }
      bool1 = this.hasResource;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Already have resource");
        throw ((Throwable)localObject1);
      }
      localObject1 = this.engineResourceFactory;
      Object localObject2 = this.resource;
      boolean bool2 = this.isCacheable;
      localObject1 = ((EngineJob.EngineResourceFactory)localObject1).build((Resource)localObject2, bool2);
      this.engineResource = ((EngineResource)localObject1);
      bool1 = true;
      this.hasResource = bool1;
      this.engineResource.acquire();
      localObject1 = this.listener;
      localObject2 = this.key;
      EngineResource localEngineResource1 = this.engineResource;
      ((EngineJobListener)localObject1).onEngineJobComplete(this, (Key)localObject2, localEngineResource1);
      localObject1 = this.cbs;
      int j = ((List)localObject1).size();
      int k = 0;
      localObject2 = null;
      while (k < j)
      {
        localObject1 = (ResourceCallback)this.cbs.get(k);
        boolean bool3 = isInIgnoredCallbacks((ResourceCallback)localObject1);
        if (!bool3)
        {
          this.engineResource.acquire();
          EngineResource localEngineResource2 = this.engineResource;
          DataSource localDataSource = this.dataSource;
          ((ResourceCallback)localObject1).onResourceReady(localEngineResource2, localDataSource);
        }
        int i = k + 1;
        k = i;
      }
      localObject1 = this.engineResource;
      ((EngineResource)localObject1).release();
      release(false);
    }
  }
  
  EngineJob init(Key paramKey, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.key = paramKey;
    this.isCacheable = paramBoolean1;
    this.useUnlimitedSourceGeneratorPool = paramBoolean2;
    this.useAnimationPool = paramBoolean3;
    this.onlyRetrieveFromCache = paramBoolean4;
    return this;
  }
  
  boolean isCancelled()
  {
    return this.isCancelled;
  }
  
  public void onLoadFailed(GlideException paramGlideException)
  {
    this.exception = paramGlideException;
    MAIN_THREAD_HANDLER.obtainMessage(2, this).sendToTarget();
  }
  
  public void onResourceReady(Resource paramResource, DataSource paramDataSource)
  {
    this.resource = paramResource;
    this.dataSource = paramDataSource;
    MAIN_THREAD_HANDLER.obtainMessage(1, this).sendToTarget();
  }
  
  boolean onlyRetrieveFromCache()
  {
    return this.onlyRetrieveFromCache;
  }
  
  void removeCallback(ResourceCallback paramResourceCallback)
  {
    Util.assertMainThread();
    Object localObject = this.stateVerifier;
    ((StateVerifier)localObject).throwIfRecycled();
    boolean bool = this.hasResource;
    if (!bool)
    {
      bool = this.hasLoadFailed;
      if (!bool) {}
    }
    else
    {
      addIgnoredCallback(paramResourceCallback);
    }
    for (;;)
    {
      return;
      this.cbs.remove(paramResourceCallback);
      localObject = this.cbs;
      bool = ((List)localObject).isEmpty();
      if (bool) {
        cancel();
      }
    }
  }
  
  public void reschedule(DecodeJob paramDecodeJob)
  {
    getActiveSourceExecutor().execute(paramDecodeJob);
  }
  
  public void start(DecodeJob paramDecodeJob)
  {
    this.decodeJob = paramDecodeJob;
    boolean bool = paramDecodeJob.willDecodeFromCache();
    if (bool) {}
    for (GlideExecutor localGlideExecutor = this.diskCacheExecutor;; localGlideExecutor = getActiveSourceExecutor())
    {
      localGlideExecutor.execute(paramDecodeJob);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\EngineJob.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */