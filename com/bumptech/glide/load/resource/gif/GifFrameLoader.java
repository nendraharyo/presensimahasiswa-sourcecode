package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class GifFrameLoader
{
  private final BitmapPool bitmapPool;
  private final List callbacks;
  private GifFrameLoader.DelayTarget current;
  private Bitmap firstFrame;
  private final GifDecoder gifDecoder;
  private final Handler handler;
  private boolean isCleared;
  private boolean isLoadPending;
  private boolean isRunning;
  private GifFrameLoader.DelayTarget next;
  private GifFrameLoader.OnEveryFrameListener onEveryFrameListener;
  private GifFrameLoader.DelayTarget pendingTarget;
  private RequestBuilder requestBuilder;
  final RequestManager requestManager;
  private boolean startFromFirstFrame;
  private Transformation transformation;
  
  GifFrameLoader(Glide paramGlide, GifDecoder paramGifDecoder, int paramInt1, int paramInt2, Transformation paramTransformation, Bitmap paramBitmap)
  {
    this(localBitmapPool, localRequestManager, paramGifDecoder, null, localRequestBuilder, paramTransformation, paramBitmap);
  }
  
  GifFrameLoader(BitmapPool paramBitmapPool, RequestManager paramRequestManager, GifDecoder paramGifDecoder, Handler paramHandler, RequestBuilder paramRequestBuilder, Transformation paramTransformation, Bitmap paramBitmap)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.callbacks = ((List)localObject);
    this.requestManager = paramRequestManager;
    if (paramHandler == null)
    {
      paramHandler = new android/os/Handler;
      localObject = Looper.getMainLooper();
      GifFrameLoader.FrameLoaderCallback localFrameLoaderCallback = new com/bumptech/glide/load/resource/gif/GifFrameLoader$FrameLoaderCallback;
      localFrameLoaderCallback.<init>(this);
      paramHandler.<init>((Looper)localObject, localFrameLoaderCallback);
    }
    this.bitmapPool = paramBitmapPool;
    this.handler = paramHandler;
    this.requestBuilder = paramRequestBuilder;
    this.gifDecoder = paramGifDecoder;
    setFrameTransformation(paramTransformation, paramBitmap);
  }
  
  private static Key getFrameSignature()
  {
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    Double localDouble = Double.valueOf(Math.random());
    localObjectKey.<init>(localDouble);
    return localObjectKey;
  }
  
  private int getFrameSize()
  {
    int i = getCurrentFrame().getWidth();
    int j = getCurrentFrame().getHeight();
    Bitmap.Config localConfig = getCurrentFrame().getConfig();
    return Util.getBitmapByteSize(i, j, localConfig);
  }
  
  private static RequestBuilder getRequestBuilder(RequestManager paramRequestManager, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    RequestBuilder localRequestBuilder = paramRequestManager.asBitmap();
    RequestOptions localRequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(bool).skipMemoryCache(bool).override(paramInt1, paramInt2);
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  private void loadNextFrame()
  {
    boolean bool1 = true;
    GifFrameLoader.DelayTarget localDelayTarget = null;
    boolean bool2 = this.isRunning;
    if (bool2)
    {
      bool2 = this.isLoadPending;
      if (!bool2) {
        break label23;
      }
    }
    for (;;)
    {
      return;
      label23:
      bool2 = this.startFromFirstFrame;
      if (bool2)
      {
        localObject1 = this.pendingTarget;
        if (localObject1 != null) {
          break label109;
        }
        bool2 = bool1;
      }
      for (;;)
      {
        localObject2 = "Pending target must be null when starting from the first frame";
        Preconditions.checkArgument(bool2, (String)localObject2);
        localObject1 = this.gifDecoder;
        ((GifDecoder)localObject1).resetFrameIndex();
        this.startFromFirstFrame = false;
        localObject1 = this.pendingTarget;
        if (localObject1 == null) {
          break label117;
        }
        localObject1 = this.pendingTarget;
        bool1 = false;
        localObject3 = null;
        this.pendingTarget = null;
        onFrameReady((GifFrameLoader.DelayTarget)localObject1);
        break;
        label109:
        bool2 = false;
        localObject1 = null;
      }
      label117:
      this.isLoadPending = bool1;
      int i = this.gifDecoder.getNextDelay();
      long l1 = SystemClock.uptimeMillis();
      long l2 = i + l1;
      this.gifDecoder.advance();
      localDelayTarget = new com/bumptech/glide/load/resource/gif/GifFrameLoader$DelayTarget;
      Object localObject2 = this.handler;
      GifDecoder localGifDecoder = this.gifDecoder;
      int j = localGifDecoder.getCurrentFrameIndex();
      localDelayTarget.<init>((Handler)localObject2, j, l2);
      this.next = localDelayTarget;
      Object localObject1 = this.requestBuilder;
      Object localObject3 = RequestOptions.signatureOf(getFrameSignature());
      localObject1 = ((RequestBuilder)localObject1).apply((RequestOptions)localObject3);
      localObject3 = this.gifDecoder;
      localObject1 = ((RequestBuilder)localObject1).load(localObject3);
      localObject3 = this.next;
      ((RequestBuilder)localObject1).into((Target)localObject3);
    }
  }
  
  private void recycleFirstFrame()
  {
    Object localObject = this.firstFrame;
    if (localObject != null)
    {
      localObject = this.bitmapPool;
      Bitmap localBitmap = this.firstFrame;
      ((BitmapPool)localObject).put(localBitmap);
      localObject = null;
      this.firstFrame = null;
    }
  }
  
  private void start()
  {
    boolean bool = this.isRunning;
    if (bool) {}
    for (;;)
    {
      return;
      this.isRunning = true;
      bool = false;
      this.isCleared = false;
      loadNextFrame();
    }
  }
  
  private void stop()
  {
    this.isRunning = false;
  }
  
  void clear()
  {
    this.callbacks.clear();
    recycleFirstFrame();
    stop();
    Object localObject = this.current;
    GifFrameLoader.DelayTarget localDelayTarget;
    if (localObject != null)
    {
      localObject = this.requestManager;
      localDelayTarget = this.current;
      ((RequestManager)localObject).clear(localDelayTarget);
      this.current = null;
    }
    localObject = this.next;
    if (localObject != null)
    {
      localObject = this.requestManager;
      localDelayTarget = this.next;
      ((RequestManager)localObject).clear(localDelayTarget);
      this.next = null;
    }
    localObject = this.pendingTarget;
    if (localObject != null)
    {
      localObject = this.requestManager;
      localDelayTarget = this.pendingTarget;
      ((RequestManager)localObject).clear(localDelayTarget);
      this.pendingTarget = null;
    }
    this.gifDecoder.clear();
    this.isCleared = true;
  }
  
  ByteBuffer getBuffer()
  {
    return this.gifDecoder.getData().asReadOnlyBuffer();
  }
  
  Bitmap getCurrentFrame()
  {
    Object localObject = this.current;
    if (localObject != null) {}
    for (localObject = this.current.getResource();; localObject = this.firstFrame) {
      return (Bitmap)localObject;
    }
  }
  
  int getCurrentIndex()
  {
    GifFrameLoader.DelayTarget localDelayTarget = this.current;
    if (localDelayTarget != null) {
      localDelayTarget = this.current;
    }
    for (int i = localDelayTarget.index;; i = -1) {
      return i;
    }
  }
  
  Bitmap getFirstFrame()
  {
    return this.firstFrame;
  }
  
  int getFrameCount()
  {
    return this.gifDecoder.getFrameCount();
  }
  
  Transformation getFrameTransformation()
  {
    return this.transformation;
  }
  
  int getHeight()
  {
    return getCurrentFrame().getHeight();
  }
  
  int getLoopCount()
  {
    return this.gifDecoder.getTotalIterationCount();
  }
  
  int getSize()
  {
    int i = this.gifDecoder.getByteSize();
    int j = getFrameSize();
    return i + j;
  }
  
  int getWidth()
  {
    return getCurrentFrame().getWidth();
  }
  
  void onFrameReady(GifFrameLoader.DelayTarget paramDelayTarget)
  {
    int i = 2;
    Object localObject = this.onEveryFrameListener;
    if (localObject != null)
    {
      localObject = this.onEveryFrameListener;
      ((GifFrameLoader.OnEveryFrameListener)localObject).onFrameReady();
    }
    localObject = null;
    this.isLoadPending = false;
    boolean bool = this.isCleared;
    if (bool)
    {
      localObject = this.handler.obtainMessage(i, paramDelayTarget);
      ((Message)localObject).sendToTarget();
    }
    for (;;)
    {
      return;
      bool = this.isRunning;
      if (!bool)
      {
        this.pendingTarget = paramDelayTarget;
      }
      else
      {
        localObject = paramDelayTarget.getResource();
        if (localObject != null)
        {
          recycleFirstFrame();
          GifFrameLoader.DelayTarget localDelayTarget = this.current;
          this.current = paramDelayTarget;
          localObject = this.callbacks;
          int j = ((List)localObject).size() + -1;
          for (int k = j; k >= 0; k = j)
          {
            localObject = (GifFrameLoader.FrameCallback)this.callbacks.get(k);
            ((GifFrameLoader.FrameCallback)localObject).onFrameReady();
            j = k + -1;
          }
          if (localDelayTarget != null)
          {
            localObject = this.handler.obtainMessage(i, localDelayTarget);
            ((Message)localObject).sendToTarget();
          }
        }
        loadNextFrame();
      }
    }
  }
  
  void setFrameTransformation(Transformation paramTransformation, Bitmap paramBitmap)
  {
    Object localObject = (Transformation)Preconditions.checkNotNull(paramTransformation);
    this.transformation = ((Transformation)localObject);
    localObject = (Bitmap)Preconditions.checkNotNull(paramBitmap);
    this.firstFrame = ((Bitmap)localObject);
    localObject = this.requestBuilder;
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    localRequestOptions = localRequestOptions.transform(paramTransformation);
    localObject = ((RequestBuilder)localObject).apply(localRequestOptions);
    this.requestBuilder = ((RequestBuilder)localObject);
  }
  
  void setNextStartFromFirstFrame()
  {
    boolean bool1 = true;
    boolean bool2 = this.isRunning;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      String str = "Can't restart a running animation";
      Preconditions.checkArgument(bool2, str);
      this.startFromFirstFrame = bool1;
      Object localObject = this.pendingTarget;
      if (localObject != null)
      {
        localObject = this.requestManager;
        GifFrameLoader.DelayTarget localDelayTarget = this.pendingTarget;
        ((RequestManager)localObject).clear(localDelayTarget);
        bool2 = false;
        localObject = null;
        this.pendingTarget = null;
      }
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  void setOnEveryFrameReadyListener(GifFrameLoader.OnEveryFrameListener paramOnEveryFrameListener)
  {
    this.onEveryFrameListener = paramOnEveryFrameListener;
  }
  
  void subscribe(GifFrameLoader.FrameCallback paramFrameCallback)
  {
    boolean bool = this.isCleared;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot subscribe to a cleared frame loader");
      throw ((Throwable)localObject);
    }
    Object localObject = this.callbacks;
    bool = ((List)localObject).contains(paramFrameCallback);
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot subscribe twice in a row");
      throw ((Throwable)localObject);
    }
    localObject = this.callbacks;
    bool = ((List)localObject).isEmpty();
    List localList = this.callbacks;
    localList.add(paramFrameCallback);
    if (bool) {
      start();
    }
  }
  
  void unsubscribe(GifFrameLoader.FrameCallback paramFrameCallback)
  {
    this.callbacks.remove(paramFrameCallback);
    List localList = this.callbacks;
    boolean bool = localList.isEmpty();
    if (bool) {
      stop();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifFrameLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */