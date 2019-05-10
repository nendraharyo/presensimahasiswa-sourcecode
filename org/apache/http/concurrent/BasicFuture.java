package org.apache.http.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

public class BasicFuture
  implements Future, Cancellable
{
  private final FutureCallback callback;
  private volatile boolean cancelled;
  private volatile boolean completed;
  private volatile Exception ex;
  private volatile Object result;
  
  public BasicFuture(FutureCallback paramFutureCallback)
  {
    this.callback = paramFutureCallback;
  }
  
  private Object getResult()
  {
    Object localObject = this.ex;
    if (localObject != null)
    {
      localObject = new java/util/concurrent/ExecutionException;
      Exception localException = this.ex;
      ((ExecutionException)localObject).<init>(localException);
      throw ((Throwable)localObject);
    }
    return this.result;
  }
  
  public boolean cancel()
  {
    return cancel(true);
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
    //   5: getfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
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
    //   26: putfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
    //   29: iconst_1
    //   30: istore_3
    //   31: aload_0
    //   32: iload_3
    //   33: putfield 41	org/apache/http/concurrent/BasicFuture:cancelled	Z
    //   36: aload_0
    //   37: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_0
    //   43: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull -30 -> 20
    //   53: aload_0
    //   54: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   57: astore 5
    //   59: aload 5
    //   61: invokeinterface 48 1 0
    //   66: goto -46 -> 20
    //   69: astore 4
    //   71: aload_0
    //   72: monitorexit
    //   73: aload 4
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	BasicFuture
    //   0	76	1	paramBoolean	boolean
    //   1	20	2	bool1	boolean
    //   8	25	3	bool2	boolean
    //   16	1	4	localObject1	Object
    //   69	5	4	localObject2	Object
    //   46	14	5	localFutureCallback	FutureCallback
    // Exception table:
    //   from	to	target	type
    //   4	8	69	finally
    //   18	20	69	finally
    //   25	29	69	finally
    //   32	36	69	finally
    //   36	40	69	finally
    //   40	42	69	finally
    //   71	73	69	finally
  }
  
  /* Error */
  public boolean completed(Object paramObject)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
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
    //   26: putfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 32	org/apache/http/concurrent/BasicFuture:result	Ljava/lang/Object;
    //   34: aload_0
    //   35: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_0
    //   41: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   44: astore 5
    //   46: aload 5
    //   48: ifnull -28 -> 20
    //   51: aload_0
    //   52: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   55: astore 5
    //   57: aload 5
    //   59: aload_1
    //   60: invokeinterface 51 2 0
    //   65: goto -45 -> 20
    //   68: astore 4
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 4
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	BasicFuture
    //   0	75	1	paramObject	Object
    //   1	20	2	bool1	boolean
    //   8	18	3	bool2	boolean
    //   16	1	4	localObject1	Object
    //   68	5	4	localObject2	Object
    //   44	14	5	localFutureCallback	FutureCallback
    // Exception table:
    //   from	to	target	type
    //   4	8	68	finally
    //   18	20	68	finally
    //   25	29	68	finally
    //   30	34	68	finally
    //   34	38	68	finally
    //   38	40	68	finally
    //   70	72	68	finally
  }
  
  /* Error */
  public boolean failed(Exception paramException)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
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
    //   26: putfield 39	org/apache/http/concurrent/BasicFuture:completed	Z
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 25	org/apache/http/concurrent/BasicFuture:ex	Ljava/lang/Exception;
    //   34: aload_0
    //   35: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_0
    //   41: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   44: astore 5
    //   46: aload 5
    //   48: ifnull -28 -> 20
    //   51: aload_0
    //   52: getfield 23	org/apache/http/concurrent/BasicFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   55: astore 5
    //   57: aload 5
    //   59: aload_1
    //   60: invokeinterface 55 2 0
    //   65: goto -45 -> 20
    //   68: astore 4
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 4
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	BasicFuture
    //   0	75	1	paramException	Exception
    //   1	20	2	bool1	boolean
    //   8	18	3	bool2	boolean
    //   16	1	4	localObject1	Object
    //   68	5	4	localObject2	Object
    //   44	14	5	localFutureCallback	FutureCallback
    // Exception table:
    //   from	to	target	type
    //   4	8	68	finally
    //   18	20	68	finally
    //   25	29	68	finally
    //   30	34	68	finally
    //   34	38	68	finally
    //   38	40	68	finally
    //   70	72	68	finally
  }
  
  public Object get()
  {
    try
    {
      for (;;)
      {
        boolean bool = this.completed;
        if (bool) {
          break;
        }
        wait();
      }
      localObject2 = getResult();
    }
    finally {}
    Object localObject2;
    return localObject2;
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    Object localObject1 = "Time unit";
    long l2;
    boolean bool1;
    long l3;
    try
    {
      Args.notNull(paramTimeUnit, (String)localObject1);
      l2 = paramTimeUnit.toMillis(paramLong);
      bool1 = l2 < l1;
      if (!bool1) {}
      for (l3 = l1;; l3 = l4)
      {
        bool1 = this.completed;
        if (!bool1) {
          break;
        }
        localObject1 = getResult();
        return localObject1;
        l4 = System.currentTimeMillis();
      }
      bool1 = l2 < l1;
      if (!bool1)
      {
        localObject1 = new java/util/concurrent/TimeoutException;
        ((TimeoutException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    long l4 = l2;
    boolean bool2;
    do
    {
      wait(l4);
      bool1 = this.completed;
      if (bool1)
      {
        localObject3 = getResult();
        break;
      }
      l4 = System.currentTimeMillis() - l3;
      l4 = l2 - l4;
      bool2 = l4 < l1;
    } while (bool2);
    Object localObject3 = new java/util/concurrent/TimeoutException;
    ((TimeoutException)localObject3).<init>();
    throw ((Throwable)localObject3);
  }
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public boolean isDone()
  {
    return this.completed;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\concurrent\BasicFuture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */