package com.bumptech.glide.load.engine;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.h.k.a;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.Registry.NoResultEncoderAvailableException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class DecodeJob
  implements DataFetcherGenerator.FetcherReadyCallback, FactoryPools.Poolable, Comparable, Runnable
{
  private static final String TAG = "DecodeJob";
  private DecodeJob.Callback callback;
  private Key currentAttemptingKey;
  private Object currentData;
  private DataSource currentDataSource;
  private DataFetcher currentFetcher;
  private volatile DataFetcherGenerator currentGenerator;
  private Key currentSourceKey;
  private Thread currentThread;
  private final DecodeHelper decodeHelper;
  private final DecodeJob.DeferredEncodeManager deferredEncodeManager;
  private final DecodeJob.DiskCacheProvider diskCacheProvider;
  private DiskCacheStrategy diskCacheStrategy;
  private GlideContext glideContext;
  private int height;
  private volatile boolean isCallbackNotified;
  private volatile boolean isCancelled;
  private EngineKey loadKey;
  private Object model;
  private boolean onlyRetrieveFromCache;
  private Options options;
  private int order;
  private final k.a pool;
  private Priority priority;
  private final DecodeJob.ReleaseManager releaseManager;
  private DecodeJob.RunReason runReason;
  private Key signature;
  private DecodeJob.Stage stage;
  private long startFetchTime;
  private final StateVerifier stateVerifier;
  private final List throwables;
  private int width;
  
  DecodeJob(DecodeJob.DiskCacheProvider paramDiskCacheProvider, k.a parama)
  {
    Object localObject = new com/bumptech/glide/load/engine/DecodeHelper;
    ((DecodeHelper)localObject).<init>();
    this.decodeHelper = ((DecodeHelper)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.throwables = ((List)localObject);
    localObject = StateVerifier.newInstance();
    this.stateVerifier = ((StateVerifier)localObject);
    localObject = new com/bumptech/glide/load/engine/DecodeJob$DeferredEncodeManager;
    ((DecodeJob.DeferredEncodeManager)localObject).<init>();
    this.deferredEncodeManager = ((DecodeJob.DeferredEncodeManager)localObject);
    localObject = new com/bumptech/glide/load/engine/DecodeJob$ReleaseManager;
    ((DecodeJob.ReleaseManager)localObject).<init>();
    this.releaseManager = ((DecodeJob.ReleaseManager)localObject);
    this.diskCacheProvider = paramDiskCacheProvider;
    this.pool = parama;
  }
  
  private Resource decodeFromData(DataFetcher paramDataFetcher, Object paramObject, DataSource paramDataSource)
  {
    Resource localResource;
    if (paramObject == null)
    {
      localResource = null;
      paramDataFetcher.cleanup();
    }
    for (;;)
    {
      return localResource;
      try
      {
        long l = LogTime.getLogTime();
        localResource = decodeFromFetcher(paramObject, paramDataSource);
        Object localObject2 = "DecodeJob";
        int i = 2;
        boolean bool = Log.isLoggable((String)localObject2, i);
        if (bool)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Decoded result ";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject2 = ((StringBuilder)localObject2).append(localResource);
          localObject2 = ((StringBuilder)localObject2).toString();
          logWithTimeAndKey((String)localObject2, l);
        }
        paramDataFetcher.cleanup();
      }
      finally
      {
        paramDataFetcher.cleanup();
      }
    }
  }
  
  private Resource decodeFromFetcher(Object paramObject, DataSource paramDataSource)
  {
    Object localObject = this.decodeHelper;
    Class localClass = paramObject.getClass();
    localObject = ((DecodeHelper)localObject).getLoadPath(localClass);
    return runLoadPath(paramObject, paramDataSource, (LoadPath)localObject);
  }
  
  private void decodeFromRetrievedData()
  {
    Object localObject1 = "DecodeJob";
    int i = 2;
    bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = "Retrieved data";
      long l = this.startFetchTime;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("data: ");
      Object localObject4 = this.currentData;
      localObject3 = ((StringBuilder)localObject3).append(localObject4).append(", cache key: ");
      localObject4 = this.currentSourceKey;
      localObject3 = ((StringBuilder)localObject3).append(localObject4).append(", fetcher: ");
      localObject4 = this.currentFetcher;
      localObject3 = localObject4;
      logWithTimeAndKey((String)localObject1, l, (String)localObject3);
    }
    i = 0;
    Object localObject3 = null;
    try
    {
      localObject1 = this.currentFetcher;
      localObject5 = this.currentData;
      localDataSource = this.currentDataSource;
      localObject1 = decodeFromData((DataFetcher)localObject1, localObject5, localDataSource);
    }
    catch (GlideException localGlideException)
    {
      for (;;)
      {
        Object localObject5 = this.currentAttemptingKey;
        DataSource localDataSource = this.currentDataSource;
        localGlideException.setLoggingDetails((Key)localObject5, localDataSource);
        localObject5 = this.throwables;
        ((List)localObject5).add(localGlideException);
        bool = false;
        Object localObject2 = null;
        continue;
        runGenerators();
      }
    }
    if (localObject1 != null)
    {
      localObject3 = this.currentDataSource;
      notifyEncodeAndRelease((Resource)localObject1, (DataSource)localObject3);
      return;
    }
  }
  
  private DataFetcherGenerator getNextGenerator()
  {
    Object localObject1 = DecodeJob.1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage;
    Object localObject2 = this.stage;
    int i = ((DecodeJob.Stage)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized stage: ");
      DecodeJob.Stage localStage = this.stage;
      localObject2 = localStage;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = new com/bumptech/glide/load/engine/ResourceCacheGenerator;
      localObject2 = this.decodeHelper;
      ((ResourceCacheGenerator)localObject1).<init>((DecodeHelper)localObject2, this);
    }
    for (;;)
    {
      return (DataFetcherGenerator)localObject1;
      localObject1 = new com/bumptech/glide/load/engine/DataCacheGenerator;
      localObject2 = this.decodeHelper;
      ((DataCacheGenerator)localObject1).<init>((DecodeHelper)localObject2, this);
      continue;
      localObject1 = new com/bumptech/glide/load/engine/SourceGenerator;
      localObject2 = this.decodeHelper;
      ((SourceGenerator)localObject1).<init>((DecodeHelper)localObject2, this);
      continue;
      j = 0;
      localObject1 = null;
    }
  }
  
  private DecodeJob.Stage getNextStage(DecodeJob.Stage paramStage)
  {
    Object localObject1 = DecodeJob.1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage;
    int i = paramStage.ordinal();
    int j = localObject1[i];
    boolean bool;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unrecognized stage: " + paramStage;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 5: 
      localObject1 = this.diskCacheStrategy;
      bool = ((DiskCacheStrategy)localObject1).decodeCachedResource();
      if (bool) {
        localObject1 = DecodeJob.Stage.RESOURCE_CACHE;
      }
      break;
    }
    for (;;)
    {
      return (DecodeJob.Stage)localObject1;
      localObject1 = DecodeJob.Stage.RESOURCE_CACHE;
      localObject1 = getNextStage((DecodeJob.Stage)localObject1);
      continue;
      localObject1 = this.diskCacheStrategy;
      bool = ((DiskCacheStrategy)localObject1).decodeCachedData();
      if (bool)
      {
        localObject1 = DecodeJob.Stage.DATA_CACHE;
      }
      else
      {
        localObject1 = DecodeJob.Stage.DATA_CACHE;
        localObject1 = getNextStage((DecodeJob.Stage)localObject1);
        continue;
        bool = this.onlyRetrieveFromCache;
        if (bool)
        {
          localObject1 = DecodeJob.Stage.FINISHED;
        }
        else
        {
          localObject1 = DecodeJob.Stage.SOURCE;
          continue;
          localObject1 = DecodeJob.Stage.FINISHED;
        }
      }
    }
  }
  
  private Options getOptionsWithHardwareConfig(DataSource paramDataSource)
  {
    Object localObject1 = this.options;
    int i = Build.VERSION.SDK_INT;
    int k = 26;
    Object localObject2;
    if (i < k) {
      localObject2 = localObject1;
    }
    for (;;)
    {
      return (Options)localObject2;
      localObject2 = DataSource.RESOURCE_DISK_CACHE;
      int j;
      if (paramDataSource != localObject2)
      {
        localObject2 = this.decodeHelper;
        j = ((DecodeHelper)localObject2).isScaleOnlyOrNoTransform();
        if (j == 0) {}
      }
      else
      {
        j = 1;
        k = j;
      }
      for (;;)
      {
        localObject2 = Downsampler.ALLOW_HARDWARE_CONFIG;
        localObject2 = (Boolean)((Options)localObject1).get((Option)localObject2);
        if (localObject2 == null) {
          break label113;
        }
        j = ((Boolean)localObject2).booleanValue();
        if ((j != 0) && (k == 0)) {
          break label113;
        }
        localObject2 = localObject1;
        break;
        j = 0;
        localObject2 = null;
        k = 0;
        localBoolean = null;
      }
      label113:
      localObject2 = new com/bumptech/glide/load/Options;
      ((Options)localObject2).<init>();
      localObject1 = this.options;
      ((Options)localObject2).putAll((Options)localObject1);
      localObject1 = Downsampler.ALLOW_HARDWARE_CONFIG;
      Boolean localBoolean = Boolean.valueOf(k);
      ((Options)localObject2).set((Option)localObject1, localBoolean);
    }
  }
  
  private int getPriority()
  {
    return this.priority.ordinal();
  }
  
  private void logWithTimeAndKey(String paramString, long paramLong)
  {
    logWithTimeAndKey(paramString, paramLong, null);
  }
  
  private void logWithTimeAndKey(String paramString1, long paramLong, String paramString2)
  {
    String str1 = "DecodeJob";
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString1).append(" in ");
    double d = LogTime.getElapsedMillis(paramLong);
    localObject1 = ((StringBuilder)localObject1).append(d).append(", load key: ");
    Object localObject2 = this.loadKey;
    localObject2 = ((StringBuilder)localObject1).append(localObject2);
    String str2;
    if (paramString2 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str2 = ", ";
    }
    for (localObject1 = str2 + paramString2;; localObject1 = "")
    {
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(", thread: ");
      localObject2 = Thread.currentThread().getName();
      localObject1 = (String)localObject2;
      Log.v(str1, (String)localObject1);
      return;
    }
  }
  
  private void notifyComplete(Resource paramResource, DataSource paramDataSource)
  {
    setNotifiedOrThrow();
    this.callback.onResourceReady(paramResource, paramDataSource);
  }
  
  private void notifyEncodeAndRelease(Resource paramResource, DataSource paramDataSource)
  {
    boolean bool1 = paramResource instanceof Initializable;
    if (bool1)
    {
      localObject1 = paramResource;
      localObject1 = (Initializable)paramResource;
      ((Initializable)localObject1).initialize();
    }
    bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.deferredEncodeManager;
    boolean bool2 = ((DecodeJob.DeferredEncodeManager)localObject2).hasResourceToEncode();
    if (bool2)
    {
      localObject1 = LockedResource.obtain((Resource)paramResource);
      paramResource = (Resource)localObject1;
    }
    notifyComplete((Resource)paramResource, paramDataSource);
    localObject2 = DecodeJob.Stage.ENCODE;
    this.stage = ((DecodeJob.Stage)localObject2);
    try
    {
      localObject2 = this.deferredEncodeManager;
      bool2 = ((DecodeJob.DeferredEncodeManager)localObject2).hasResourceToEncode();
      if (bool2)
      {
        localObject2 = this.deferredEncodeManager;
        DecodeJob.DiskCacheProvider localDiskCacheProvider = this.diskCacheProvider;
        Options localOptions = this.options;
        ((DecodeJob.DeferredEncodeManager)localObject2).encode(localDiskCacheProvider, localOptions);
      }
      if (localObject1 != null) {
        ((LockedResource)localObject1).unlock();
      }
      onEncodeComplete();
      return;
    }
    finally
    {
      if (localObject1 != null) {
        ((LockedResource)localObject1).unlock();
      }
    }
  }
  
  private void notifyFailed()
  {
    setNotifiedOrThrow();
    GlideException localGlideException = new com/bumptech/glide/load/engine/GlideException;
    ArrayList localArrayList = new java/util/ArrayList;
    List localList = this.throwables;
    localArrayList.<init>(localList);
    localGlideException.<init>("Failed to load resource", localArrayList);
    this.callback.onLoadFailed(localGlideException);
    onLoadFailed();
  }
  
  private void onEncodeComplete()
  {
    DecodeJob.ReleaseManager localReleaseManager = this.releaseManager;
    boolean bool = localReleaseManager.onEncodeComplete();
    if (bool) {
      releaseInternal();
    }
  }
  
  private void onLoadFailed()
  {
    DecodeJob.ReleaseManager localReleaseManager = this.releaseManager;
    boolean bool = localReleaseManager.onFailed();
    if (bool) {
      releaseInternal();
    }
  }
  
  private void releaseInternal()
  {
    this.releaseManager.reset();
    this.deferredEncodeManager.clear();
    this.decodeHelper.clear();
    this.isCallbackNotified = false;
    this.glideContext = null;
    this.signature = null;
    this.options = null;
    this.priority = null;
    this.loadKey = null;
    this.callback = null;
    this.stage = null;
    this.currentGenerator = null;
    this.currentThread = null;
    this.currentSourceKey = null;
    this.currentData = null;
    this.currentDataSource = null;
    this.currentFetcher = null;
    this.startFetchTime = 0L;
    this.isCancelled = false;
    this.model = null;
    this.throwables.clear();
    this.pool.release(this);
  }
  
  private void runGenerators()
  {
    Object localObject1 = Thread.currentThread();
    this.currentThread = ((Thread)localObject1);
    long l = LogTime.getLogTime();
    this.startFetchTime = l;
    boolean bool1 = false;
    localObject1 = null;
    boolean bool2;
    Object localObject2;
    DecodeJob.Stage localStage;
    do
    {
      bool2 = this.isCancelled;
      if (bool2) {
        break;
      }
      localObject2 = this.currentGenerator;
      if (localObject2 == null) {
        break;
      }
      localObject1 = this.currentGenerator;
      bool1 = ((DataFetcherGenerator)localObject1).startNext();
      if (bool1) {
        break;
      }
      localObject2 = this.stage;
      localObject2 = getNextStage((DecodeJob.Stage)localObject2);
      this.stage = ((DecodeJob.Stage)localObject2);
      localObject2 = getNextGenerator();
      this.currentGenerator = ((DataFetcherGenerator)localObject2);
      localObject2 = this.stage;
      localStage = DecodeJob.Stage.SOURCE;
    } while (localObject2 != localStage);
    reschedule();
    for (;;)
    {
      return;
      localObject2 = this.stage;
      localStage = DecodeJob.Stage.FINISHED;
      if (localObject2 != localStage)
      {
        bool2 = this.isCancelled;
        if (!bool2) {}
      }
      else if (!bool1)
      {
        notifyFailed();
      }
    }
  }
  
  private Resource runLoadPath(Object paramObject, DataSource paramDataSource, LoadPath paramLoadPath)
  {
    Options localOptions = getOptionsWithHardwareConfig(paramDataSource);
    Object localObject1 = this.glideContext.getRegistry();
    DataRewinder localDataRewinder = ((Registry)localObject1).getRewinder(paramObject);
    try
    {
      int i = this.width;
      int j = this.height;
      DecodeJob.DecodeCallback localDecodeCallback = new com/bumptech/glide/load/engine/DecodeJob$DecodeCallback;
      localDecodeCallback.<init>(this, paramDataSource);
      localObject1 = paramLoadPath;
      localObject1 = paramLoadPath.load(localDataRewinder, localOptions, i, j, localDecodeCallback);
      return (Resource)localObject1;
    }
    finally
    {
      localDataRewinder.cleanup();
    }
  }
  
  private void runWrapped()
  {
    Object localObject1 = DecodeJob.1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason;
    Object localObject2 = this.runReason;
    int i = ((DecodeJob.RunReason)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized run reason: ");
      DecodeJob.RunReason localRunReason = this.runReason;
      localObject2 = localRunReason;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = DecodeJob.Stage.INITIALIZE;
      localObject1 = getNextStage((DecodeJob.Stage)localObject1);
      this.stage = ((DecodeJob.Stage)localObject1);
      localObject1 = getNextGenerator();
      this.currentGenerator = ((DataFetcherGenerator)localObject1);
      runGenerators();
    }
    for (;;)
    {
      return;
      runGenerators();
      continue;
      decodeFromRetrievedData();
    }
  }
  
  private void setNotifiedOrThrow()
  {
    Object localObject = this.stateVerifier;
    ((StateVerifier)localObject).throwIfRecycled();
    boolean bool = this.isCallbackNotified;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Already notified");
      throw ((Throwable)localObject);
    }
    this.isCallbackNotified = true;
  }
  
  public void cancel()
  {
    boolean bool = true;
    this.isCancelled = bool;
    DataFetcherGenerator localDataFetcherGenerator = this.currentGenerator;
    if (localDataFetcherGenerator != null) {
      localDataFetcherGenerator.cancel();
    }
  }
  
  public int compareTo(DecodeJob paramDecodeJob)
  {
    int i = getPriority();
    int j = paramDecodeJob.getPriority();
    i -= j;
    if (i == 0)
    {
      i = this.order;
      j = paramDecodeJob.order;
      i -= j;
    }
    return i;
  }
  
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  DecodeJob init(GlideContext paramGlideContext, Object paramObject, EngineKey paramEngineKey, Key paramKey, int paramInt1, int paramInt2, Class paramClass1, Class paramClass2, Priority paramPriority, DiskCacheStrategy paramDiskCacheStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Options paramOptions, DecodeJob.Callback paramCallback, int paramInt3)
  {
    Object localObject1 = this;
    Object localObject2 = this.decodeHelper;
    localObject1 = this.diskCacheProvider;
    ((DecodeHelper)localObject2).init(paramGlideContext, paramObject, paramKey, paramInt1, paramInt2, paramDiskCacheStrategy, paramClass1, paramClass2, paramPriority, paramOptions, paramMap, paramBoolean1, paramBoolean2, (DecodeJob.DiskCacheProvider)localObject1);
    localObject1 = paramGlideContext;
    this.glideContext = paramGlideContext;
    localObject1 = paramKey;
    this.signature = paramKey;
    localObject1 = paramPriority;
    this.priority = paramPriority;
    localObject1 = paramEngineKey;
    this.loadKey = paramEngineKey;
    this.width = paramInt1;
    this.height = paramInt2;
    localObject1 = paramDiskCacheStrategy;
    this.diskCacheStrategy = paramDiskCacheStrategy;
    this.onlyRetrieveFromCache = paramBoolean3;
    localObject1 = paramOptions;
    this.options = paramOptions;
    localObject1 = paramCallback;
    this.callback = paramCallback;
    this.order = paramInt3;
    localObject2 = DecodeJob.RunReason.INITIALIZE;
    localObject1 = this;
    this.runReason = ((DecodeJob.RunReason)localObject2);
    localObject1 = paramObject;
    this.model = paramObject;
    return this;
  }
  
  public void onDataFetcherFailed(Key paramKey, Exception paramException, DataFetcher paramDataFetcher, DataSource paramDataSource)
  {
    paramDataFetcher.cleanup();
    Object localObject1 = new com/bumptech/glide/load/engine/GlideException;
    ((GlideException)localObject1).<init>("Fetching data failed", paramException);
    Object localObject2 = paramDataFetcher.getDataClass();
    ((GlideException)localObject1).setLoggingDetails(paramKey, paramDataSource, (Class)localObject2);
    this.throwables.add(localObject1);
    localObject1 = Thread.currentThread();
    localObject2 = this.currentThread;
    if (localObject1 != localObject2)
    {
      localObject1 = DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE;
      this.runReason = ((DecodeJob.RunReason)localObject1);
      localObject1 = this.callback;
      ((DecodeJob.Callback)localObject1).reschedule(this);
    }
    for (;;)
    {
      return;
      runGenerators();
    }
  }
  
  /* Error */
  public void onDataFetcherReady(Key paramKey1, Object paramObject, DataFetcher paramDataFetcher, DataSource paramDataSource, Key paramKey2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 174	com/bumptech/glide/load/engine/DecodeJob:currentSourceKey	Lcom/bumptech/glide/load/Key;
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 170	com/bumptech/glide/load/engine/DecodeJob:currentData	Ljava/lang/Object;
    //   10: aload_0
    //   11: aload_3
    //   12: putfield 178	com/bumptech/glide/load/engine/DecodeJob:currentFetcher	Lcom/bumptech/glide/load/data/DataFetcher;
    //   15: aload_0
    //   16: aload 4
    //   18: putfield 183	com/bumptech/glide/load/engine/DecodeJob:currentDataSource	Lcom/bumptech/glide/load/DataSource;
    //   21: aload_0
    //   22: aload 5
    //   24: putfield 193	com/bumptech/glide/load/engine/DecodeJob:currentAttemptingKey	Lcom/bumptech/glide/load/Key;
    //   27: invokestatic 346	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   30: astore 6
    //   32: aload_0
    //   33: getfield 436	com/bumptech/glide/load/engine/DecodeJob:currentThread	Ljava/lang/Thread;
    //   36: astore 7
    //   38: aload 6
    //   40: aload 7
    //   42: if_acmpeq +29 -> 71
    //   45: getstatic 554	com/bumptech/glide/load/engine/DecodeJob$RunReason:DECODE_DATA	Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;
    //   48: astore 6
    //   50: aload_0
    //   51: aload 6
    //   53: putfield 500	com/bumptech/glide/load/engine/DecodeJob:runReason	Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;
    //   56: aload_0
    //   57: getfield 360	com/bumptech/glide/load/engine/DecodeJob:callback	Lcom/bumptech/glide/load/engine/DecodeJob$Callback;
    //   60: astore 6
    //   62: aload 6
    //   64: aload_0
    //   65: invokeinterface 551 2 0
    //   70: return
    //   71: ldc_w 556
    //   74: astore 6
    //   76: aload 6
    //   78: invokestatic 561	com/bumptech/glide/util/pool/GlideTrace:beginSection	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: invokespecial 511	com/bumptech/glide/load/engine/DecodeJob:decodeFromRetrievedData	()V
    //   85: invokestatic 564	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   88: goto -18 -> 70
    //   91: astore 6
    //   93: invokestatic 564	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   96: aload 6
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	DecodeJob
    //   0	99	1	paramKey1	Key
    //   0	99	2	paramObject	Object
    //   0	99	3	paramDataFetcher	DataFetcher
    //   0	99	4	paramDataSource	DataSource
    //   0	99	5	paramKey2	Key
    //   30	47	6	localObject1	Object
    //   91	6	6	localObject2	Object
    //   36	5	7	localThread	Thread
    // Exception table:
    //   from	to	target	type
    //   81	85	91	finally
  }
  
  Resource onResourceDecoded(DataSource paramDataSource, Resource paramResource)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Class localClass = paramResource.get().getClass();
    Object localObject2 = DataSource.RESOURCE_DISK_CACHE;
    Transformation localTransformation;
    int j;
    Object localObject3;
    if (paramDataSource != localObject2)
    {
      localTransformation = this.decodeHelper.getTransformation(localClass);
      localObject2 = this.glideContext;
      j = this.width;
      int k = this.height;
      localObject2 = localTransformation.transform((Context)localObject2, paramResource, j, k);
      localObject3 = localObject2;
    }
    for (;;)
    {
      boolean bool2 = paramResource.equals(localObject3);
      if (!bool2) {
        paramResource.recycle();
      }
      localObject2 = this.decodeHelper;
      bool2 = ((DecodeHelper)localObject2).isResourceEncoderAvailable((Resource)localObject3);
      Object localObject4;
      Object localObject5;
      if (bool2)
      {
        localObject1 = this.decodeHelper.getResultEncoder((Resource)localObject3);
        localObject2 = this.options;
        localObject2 = ((ResourceEncoder)localObject1).getEncodeStrategy((Options)localObject2);
        localObject4 = localObject1;
        localObject1 = this.decodeHelper;
        localObject5 = this.currentSourceKey;
        bool1 = ((DecodeHelper)localObject1).isSourceKey((Key)localObject5);
        if (bool1) {
          break label236;
        }
        bool1 = true;
      }
      for (;;)
      {
        localObject5 = this.diskCacheStrategy;
        bool1 = ((DiskCacheStrategy)localObject5).isResourceCacheable(bool1, paramDataSource, (EncodeStrategy)localObject2);
        if (!bool1) {
          break label377;
        }
        if (localObject4 != null) {
          break label244;
        }
        localObject2 = new com/bumptech/glide/Registry$NoResultEncoderAvailableException;
        localObject1 = ((Resource)localObject3).get().getClass();
        ((Registry.NoResultEncoderAvailableException)localObject2).<init>((Class)localObject1);
        throw ((Throwable)localObject2);
        localObject2 = EncodeStrategy.NONE;
        localObject4 = null;
        break;
        label236:
        bool1 = false;
        localObject1 = null;
      }
      label244:
      localObject1 = DecodeJob.1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy;
      j = ((EncodeStrategy)localObject2).ordinal();
      int i = localObject1[j];
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject2 = "Unknown strategy: " + localObject2;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 1: 
        localObject2 = new com/bumptech/glide/load/engine/DataCacheKey;
        localObject1 = this.currentSourceKey;
        localObject5 = this.signature;
        ((DataCacheKey)localObject2).<init>((Key)localObject1, (Key)localObject5);
      }
      for (;;)
      {
        localObject3 = LockedResource.obtain((Resource)localObject3);
        localObject1 = this.deferredEncodeManager;
        ((DecodeJob.DeferredEncodeManager)localObject1).init((Key)localObject2, (ResourceEncoder)localObject4, (LockedResource)localObject3);
        label377:
        return (Resource)localObject3;
        localObject2 = new com/bumptech/glide/load/engine/ResourceCacheKey;
        localObject1 = this.decodeHelper.getArrayPool();
        localObject5 = this.currentSourceKey;
        Key localKey = this.signature;
        int m = this.width;
        int n = this.height;
        Options localOptions = this.options;
        ((ResourceCacheKey)localObject2).<init>((ArrayPool)localObject1, (Key)localObject5, localKey, m, n, localTransformation, localClass, localOptions);
      }
      localObject3 = paramResource;
      localTransformation = null;
    }
  }
  
  void release(boolean paramBoolean)
  {
    DecodeJob.ReleaseManager localReleaseManager = this.releaseManager;
    boolean bool = localReleaseManager.release(paramBoolean);
    if (bool) {
      releaseInternal();
    }
  }
  
  public void reschedule()
  {
    DecodeJob.RunReason localRunReason = DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE;
    this.runReason = localRunReason;
    this.callback.reschedule(this);
  }
  
  public void run()
  {
    String str = "DecodeJob#run(model=%s)";
    localObject2 = this.model;
    GlideTrace.beginSectionFormat(str, localObject2);
    localObject2 = this.currentFetcher;
    for (;;)
    {
      try
      {
        boolean bool1 = this.isCancelled;
        if (bool1)
        {
          notifyFailed();
          if (localObject2 != null) {
            ((DataFetcher)localObject2).cleanup();
          }
          GlideTrace.endSection();
          return;
        }
      }
      finally
      {
        Object localObject3 = "DecodeJob";
        int i = 3;
        try
        {
          boolean bool2 = Log.isLoggable((String)localObject3, i);
          if (bool2)
          {
            localObject3 = "DecodeJob";
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            Object localObject5 = "DecodeJob threw unexpectedly, isCancelled: ";
            localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
            boolean bool3 = this.isCancelled;
            localObject4 = ((StringBuilder)localObject4).append(bool3);
            localObject5 = ", stage: ";
            localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
            localObject5 = this.stage;
            localObject4 = ((StringBuilder)localObject4).append(localObject5);
            localObject4 = ((StringBuilder)localObject4).toString();
            Log.d((String)localObject3, (String)localObject4, localThrowable);
          }
          localObject3 = this.stage;
          Object localObject4 = DecodeJob.Stage.ENCODE;
          if (localObject3 != localObject4)
          {
            localObject3 = this.throwables;
            ((List)localObject3).add(localThrowable);
            notifyFailed();
          }
          bool2 = this.isCancelled;
          if (!bool2) {
            throw localThrowable;
          }
        }
        finally
        {
          if (localObject2 != null) {
            ((DataFetcher)localObject2).cleanup();
          }
          GlideTrace.endSection();
        }
        if (localObject2 == null) {
          continue;
        }
        ((DataFetcher)localObject2).cleanup();
        GlideTrace.endSection();
        continue;
      }
      runWrapped();
      if (localObject2 != null) {
        ((DataFetcher)localObject2).cleanup();
      }
      GlideTrace.endSection();
    }
  }
  
  boolean willDecodeFromCache()
  {
    DecodeJob.Stage localStage1 = DecodeJob.Stage.INITIALIZE;
    localStage1 = getNextStage(localStage1);
    DecodeJob.Stage localStage2 = DecodeJob.Stage.RESOURCE_CACHE;
    boolean bool;
    if (localStage1 != localStage2)
    {
      localStage2 = DecodeJob.Stage.DATA_CACHE;
      if (localStage1 != localStage2) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStage1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */