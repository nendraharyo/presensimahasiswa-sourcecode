package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class BitmapPreFillRunner
  implements Runnable
{
  static final int BACKOFF_RATIO = 4;
  private static final BitmapPreFillRunner.Clock DEFAULT_CLOCK;
  static final long INITIAL_BACKOFF_MS = 40L;
  static final long MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1L);
  static final long MAX_DURATION_MS = 32L;
  static final String TAG = "PreFillRunner";
  private final BitmapPool bitmapPool;
  private final BitmapPreFillRunner.Clock clock;
  private long currentDelay;
  private final Handler handler;
  private boolean isCancelled;
  private final MemoryCache memoryCache;
  private final Set seenTypes;
  private final PreFillQueue toPrefill;
  
  static
  {
    BitmapPreFillRunner.Clock localClock = new com/bumptech/glide/load/engine/prefill/BitmapPreFillRunner$Clock;
    localClock.<init>();
    DEFAULT_CLOCK = localClock;
  }
  
  public BitmapPreFillRunner(BitmapPool paramBitmapPool, MemoryCache paramMemoryCache, PreFillQueue paramPreFillQueue)
  {
    this(paramBitmapPool, paramMemoryCache, paramPreFillQueue, localClock, localHandler);
  }
  
  BitmapPreFillRunner(BitmapPool paramBitmapPool, MemoryCache paramMemoryCache, PreFillQueue paramPreFillQueue, BitmapPreFillRunner.Clock paramClock, Handler paramHandler)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.seenTypes = localHashSet;
    this.currentDelay = 40;
    this.bitmapPool = paramBitmapPool;
    this.memoryCache = paramMemoryCache;
    this.toPrefill = paramPreFillQueue;
    this.clock = paramClock;
    this.handler = paramHandler;
  }
  
  private long getFreeMemoryCacheBytes()
  {
    long l1 = this.memoryCache.getMaxSize();
    long l2 = this.memoryCache.getCurrentSize();
    return l1 - l2;
  }
  
  private long getNextDelay()
  {
    long l1 = this.currentDelay;
    long l2 = this.currentDelay * 4;
    long l3 = MAX_BACKOFF_MS;
    l2 = Math.min(l2, l3);
    this.currentDelay = l2;
    return l1;
  }
  
  private boolean isGcDetected(long paramLong)
  {
    BitmapPreFillRunner.Clock localClock = this.clock;
    long l1 = localClock.now() - paramLong;
    long l2 = 32;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClock = null;
    }
  }
  
  boolean allocate()
  {
    Object localObject1 = this.clock;
    long l1 = ((BitmapPreFillRunner.Clock)localObject1).now();
    localObject1 = this.toPrefill;
    boolean bool1 = ((PreFillQueue)localObject1).isEmpty();
    if (!bool1)
    {
      bool1 = isGcDetected(l1);
      if (!bool1)
      {
        Object localObject2 = this.toPrefill.remove();
        localObject1 = this.seenTypes;
        bool1 = ((Set)localObject1).contains(localObject2);
        int j;
        Object localObject3;
        label118:
        Object localObject4;
        if (!bool1)
        {
          this.seenTypes.add(localObject2);
          localObject1 = this.bitmapPool;
          j = ((PreFillType)localObject2).getWidth();
          int k = ((PreFillType)localObject2).getHeight();
          localObject3 = ((PreFillType)localObject2).getConfig();
          localObject1 = ((BitmapPool)localObject1).getDirty(j, k, (Bitmap.Config)localObject3);
          j = Util.getBitmapByteSize((Bitmap)localObject1);
          long l2 = getFreeMemoryCacheBytes();
          long l3 = j;
          boolean bool3 = l2 < l3;
          if (bool3) {
            break label359;
          }
          localObject4 = new com/bumptech/glide/load/engine/prefill/BitmapPreFillRunner$UniqueKey;
          ((BitmapPreFillRunner.UniqueKey)localObject4).<init>();
          localObject3 = this.memoryCache;
          BitmapPool localBitmapPool = this.bitmapPool;
          localObject1 = BitmapResource.obtain((Bitmap)localObject1, localBitmapPool);
          ((MemoryCache)localObject3).put((Key)localObject4, (Resource)localObject1);
        }
        for (;;)
        {
          localObject1 = "PreFillRunner";
          int m = 3;
          bool1 = Log.isLoggable((String)localObject1, m);
          if (!bool1) {
            break;
          }
          localObject1 = "PreFillRunner";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = ((StringBuilder)localObject4).append("allocated [");
          int n = ((PreFillType)localObject2).getWidth();
          localObject4 = ((StringBuilder)localObject4).append(n).append("x");
          n = ((PreFillType)localObject2).getHeight();
          localObject4 = ((StringBuilder)localObject4).append(n);
          localObject3 = "] ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject3);
          localObject2 = ((PreFillType)localObject2).getConfig();
          localObject2 = ((StringBuilder)localObject4).append(localObject2);
          localObject4 = " size: ";
          localObject2 = (String)localObject4 + j;
          Log.d((String)localObject1, (String)localObject2);
          break;
          int i = ((PreFillType)localObject2).getWidth();
          j = ((PreFillType)localObject2).getHeight();
          localObject4 = ((PreFillType)localObject2).getConfig();
          localObject1 = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject4);
          break label118;
          label359:
          localObject4 = this.bitmapPool;
          ((BitmapPool)localObject4).put((Bitmap)localObject1);
        }
      }
    }
    boolean bool2 = this.isCancelled;
    if (!bool2)
    {
      localObject1 = this.toPrefill;
      bool2 = ((PreFillQueue)localObject1).isEmpty();
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public void cancel()
  {
    this.isCancelled = true;
  }
  
  public void run()
  {
    boolean bool = allocate();
    if (bool)
    {
      Handler localHandler = this.handler;
      long l = getNextDelay();
      localHandler.postDelayed(this, l);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\prefill\BitmapPreFillRunner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */