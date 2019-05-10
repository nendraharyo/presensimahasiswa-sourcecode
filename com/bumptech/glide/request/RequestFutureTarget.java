package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RequestFutureTarget
  implements FutureTarget, RequestListener, Runnable
{
  private static final RequestFutureTarget.Waiter DEFAULT_WAITER;
  private final boolean assertBackgroundThread;
  private GlideException exception;
  private final int height;
  private boolean isCancelled;
  private boolean loadFailed;
  private final Handler mainHandler;
  private Request request;
  private Object resource;
  private boolean resultReceived;
  private final RequestFutureTarget.Waiter waiter;
  private final int width;
  
  static
  {
    RequestFutureTarget.Waiter localWaiter = new com/bumptech/glide/request/RequestFutureTarget$Waiter;
    localWaiter.<init>();
    DEFAULT_WAITER = localWaiter;
  }
  
  public RequestFutureTarget(Handler paramHandler, int paramInt1, int paramInt2)
  {
    this(paramHandler, paramInt1, paramInt2, true, localWaiter);
  }
  
  RequestFutureTarget(Handler paramHandler, int paramInt1, int paramInt2, boolean paramBoolean, RequestFutureTarget.Waiter paramWaiter)
  {
    this.mainHandler = paramHandler;
    this.width = paramInt1;
    this.height = paramInt2;
    this.assertBackgroundThread = paramBoolean;
    this.waiter = paramWaiter;
  }
  
  private void clearOnMainThread()
  {
    this.mainHandler.post(this);
  }
  
  private Object doGet(Long paramLong)
  {
    long l1 = 0L;
    try
    {
      bool1 = this.assertBackgroundThread;
      if (bool1)
      {
        bool1 = isDone();
        if (!bool1) {
          Util.assertBackgroundThread();
        }
      }
      bool1 = this.isCancelled;
      if (bool1)
      {
        CancellationException localCancellationException = new java/util/concurrent/CancellationException;
        localCancellationException.<init>();
        throw localCancellationException;
      }
    }
    finally {}
    boolean bool1 = this.loadFailed;
    GlideException localGlideException;
    if (bool1)
    {
      localObject2 = new java/util/concurrent/ExecutionException;
      localGlideException = this.exception;
      ((ExecutionException)localObject2).<init>(localGlideException);
      throw ((Throwable)localObject2);
    }
    bool1 = this.resultReceived;
    if (bool1) {}
    for (Object localObject2 = this.resource;; localObject2 = this.resource)
    {
      return localObject2;
      if (paramLong == null)
      {
        localObject2 = this.waiter;
        l1 = 0L;
        ((RequestFutureTarget.Waiter)localObject2).waitForTimeout(this, l1);
      }
      do
      {
        bool1 = Thread.interrupted();
        if (!bool1) {
          break;
        }
        localObject2 = new java/lang/InterruptedException;
        ((InterruptedException)localObject2).<init>();
        throw ((Throwable)localObject2);
        l2 = paramLong.longValue();
        bool1 = l2 < l1;
      } while (!bool1);
      long l2 = System.currentTimeMillis();
      l1 = paramLong.longValue() + l2;
      for (;;)
      {
        boolean bool2 = isDone();
        if (bool2) {
          break;
        }
        bool2 = l2 < l1;
        if (!bool2) {
          break;
        }
        RequestFutureTarget.Waiter localWaiter = this.waiter;
        l2 = l1 - l2;
        localWaiter.waitForTimeout(this, l2);
        l2 = System.currentTimeMillis();
      }
      bool1 = this.loadFailed;
      if (bool1)
      {
        localObject2 = new java/util/concurrent/ExecutionException;
        localGlideException = this.exception;
        ((ExecutionException)localObject2).<init>(localGlideException);
        throw ((Throwable)localObject2);
      }
      bool1 = this.isCancelled;
      if (bool1)
      {
        localObject2 = new java/util/concurrent/CancellationException;
        ((CancellationException)localObject2).<init>();
        throw ((Throwable)localObject2);
      }
      bool1 = this.resultReceived;
      if (!bool1)
      {
        localObject2 = new java/util/concurrent/TimeoutException;
        ((TimeoutException)localObject2).<init>();
        throw ((Throwable)localObject2);
      }
    }
  }
  
  /* Error */
  public boolean cancel(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokevirtual 62	com/bumptech/glide/request/RequestFutureTarget:isDone	()Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifeq +12 -> 22
    //   13: iconst_0
    //   14: istore_2
    //   15: aconst_null
    //   16: astore 4
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_2
    //   21: ireturn
    //   22: iconst_1
    //   23: istore_3
    //   24: aload_0
    //   25: iload_3
    //   26: putfield 68	com/bumptech/glide/request/RequestFutureTarget:isCancelled	Z
    //   29: aload_0
    //   30: getfield 52	com/bumptech/glide/request/RequestFutureTarget:waiter	Lcom/bumptech/glide/request/RequestFutureTarget$Waiter;
    //   33: astore 5
    //   35: aload 5
    //   37: aload_0
    //   38: invokevirtual 114	com/bumptech/glide/request/RequestFutureTarget$Waiter:notifyAll	(Ljava/lang/Object;)V
    //   41: iload_1
    //   42: ifeq -24 -> 18
    //   45: aload_0
    //   46: invokespecial 117	com/bumptech/glide/request/RequestFutureTarget:clearOnMainThread	()V
    //   49: goto -31 -> 18
    //   52: astore 4
    //   54: aload_0
    //   55: monitorexit
    //   56: aload 4
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	RequestFutureTarget
    //   0	59	1	paramBoolean	boolean
    //   1	20	2	bool1	boolean
    //   8	18	3	bool2	boolean
    //   16	1	4	localObject1	Object
    //   52	5	4	localObject2	Object
    //   33	3	5	localWaiter	RequestFutureTarget.Waiter
    // Exception table:
    //   from	to	target	type
    //   4	8	52	finally
    //   25	29	52	finally
    //   29	33	52	finally
    //   37	41	52	finally
    //   45	49	52	finally
  }
  
  public Object get()
  {
    Object localObject = null;
    try
    {
      return doGet(null);
    }
    catch (TimeoutException localTimeoutException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localTimeoutException);
      throw localAssertionError;
    }
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    Long localLong = Long.valueOf(paramTimeUnit.toMillis(paramLong));
    return doGet(localLong);
  }
  
  public Request getRequest()
  {
    return this.request;
  }
  
  public void getSize(SizeReadyCallback paramSizeReadyCallback)
  {
    int i = this.width;
    int j = this.height;
    paramSizeReadyCallback.onSizeReady(i, j);
  }
  
  public boolean isCancelled()
  {
    try
    {
      boolean bool = this.isCancelled;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isDone()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/bumptech/glide/request/RequestFutureTarget:isCancelled	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +21 -> 29
    //   11: aload_0
    //   12: getfield 82	com/bumptech/glide/request/RequestFutureTarget:resultReceived	Z
    //   15: istore_1
    //   16: iload_1
    //   17: ifne +12 -> 29
    //   20: aload_0
    //   21: getfield 73	com/bumptech/glide/request/RequestFutureTarget:loadFailed	Z
    //   24: istore_1
    //   25: iload_1
    //   26: ifeq +9 -> 35
    //   29: iconst_1
    //   30: istore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_1
    //   34: ireturn
    //   35: iconst_0
    //   36: istore_1
    //   37: aconst_null
    //   38: astore_2
    //   39: goto -8 -> 31
    //   42: astore_2
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_2
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	RequestFutureTarget
    //   6	31	1	bool	boolean
    //   38	1	2	localObject1	Object
    //   42	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	42	finally
    //   11	15	42	finally
    //   20	24	42	finally
  }
  
  public void onDestroy() {}
  
  public void onLoadCleared(Drawable paramDrawable) {}
  
  public void onLoadFailed(Drawable paramDrawable) {}
  
  public boolean onLoadFailed(GlideException paramGlideException, Object paramObject, Target paramTarget, boolean paramBoolean)
  {
    boolean bool = true;
    try
    {
      this.loadFailed = bool;
      this.exception = paramGlideException;
      RequestFutureTarget.Waiter localWaiter = this.waiter;
      localWaiter.notifyAll(this);
      return false;
    }
    finally {}
  }
  
  public void onLoadStarted(Drawable paramDrawable) {}
  
  public void onResourceReady(Object paramObject, Transition paramTransition) {}
  
  public boolean onResourceReady(Object paramObject1, Object paramObject2, Target paramTarget, DataSource paramDataSource, boolean paramBoolean)
  {
    boolean bool = true;
    try
    {
      this.resultReceived = bool;
      this.resource = paramObject1;
      RequestFutureTarget.Waiter localWaiter = this.waiter;
      localWaiter.notifyAll(this);
      return false;
    }
    finally {}
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public void removeCallback(SizeReadyCallback paramSizeReadyCallback) {}
  
  public void run()
  {
    Request localRequest = this.request;
    if (localRequest != null)
    {
      this.request.clear();
      localRequest = null;
      this.request = null;
    }
  }
  
  public void setRequest(Request paramRequest)
  {
    this.request = paramRequest;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\RequestFutureTarget.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */