package org.apache.http.pool;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.http.concurrent.FutureCallback;

abstract class PoolEntryFuture
  implements Future
{
  private final FutureCallback callback;
  private volatile boolean cancelled;
  private volatile boolean completed;
  private final Condition condition;
  private final Lock lock;
  private Object result;
  
  PoolEntryFuture(Lock paramLock, FutureCallback paramFutureCallback)
  {
    this.lock = paramLock;
    Condition localCondition = paramLock.newCondition();
    this.condition = localCondition;
    this.callback = paramFutureCallback;
  }
  
  public boolean await(Date paramDate)
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    String str;
    try
    {
      bool1 = this.cancelled;
      if (bool1)
      {
        localObject1 = new java/lang/InterruptedException;
        str = "Operation interrupted";
        ((InterruptedException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      this.lock.unlock();
    }
    Object localObject3;
    if (paramDate != null) {
      localObject3 = this.condition;
    }
    for (boolean bool1 = ((Condition)localObject3).awaitUntil(paramDate);; bool1 = true)
    {
      boolean bool2 = this.cancelled;
      if (!bool2) {
        break;
      }
      localObject3 = new java/lang/InterruptedException;
      str = "Operation interrupted";
      ((InterruptedException)localObject3).<init>(str);
      throw ((Throwable)localObject3);
      localObject3 = this.condition;
      ((Condition)localObject3).await();
    }
    this.lock.unlock();
    return bool1;
  }
  
  /* Error */
  public boolean cancel(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   6: astore_3
    //   7: aload_3
    //   8: invokeinterface 35 1 0
    //   13: aload_0
    //   14: getfield 59	org/apache/http/pool/PoolEntryFuture:completed	Z
    //   17: istore 4
    //   19: iload 4
    //   21: ifeq +21 -> 42
    //   24: iconst_0
    //   25: istore_2
    //   26: aconst_null
    //   27: astore 5
    //   29: aload_0
    //   30: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   33: astore_3
    //   34: aload_3
    //   35: invokeinterface 47 1 0
    //   40: iload_2
    //   41: ireturn
    //   42: iconst_1
    //   43: istore 4
    //   45: aload_0
    //   46: iload 4
    //   48: putfield 59	org/apache/http/pool/PoolEntryFuture:completed	Z
    //   51: iconst_1
    //   52: istore 4
    //   54: aload_0
    //   55: iload 4
    //   57: putfield 37	org/apache/http/pool/PoolEntryFuture:cancelled	Z
    //   60: aload_0
    //   61: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   64: astore_3
    //   65: aload_3
    //   66: ifnull +14 -> 80
    //   69: aload_0
    //   70: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   73: astore_3
    //   74: aload_3
    //   75: invokeinterface 63 1 0
    //   80: aload_0
    //   81: getfield 31	org/apache/http/pool/PoolEntryFuture:condition	Ljava/util/concurrent/locks/Condition;
    //   84: astore_3
    //   85: aload_3
    //   86: invokeinterface 66 1 0
    //   91: aload_0
    //   92: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   95: astore_3
    //   96: aload_3
    //   97: invokeinterface 47 1 0
    //   102: goto -62 -> 40
    //   105: astore 5
    //   107: aload_0
    //   108: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   111: invokeinterface 47 1 0
    //   116: aload 5
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	PoolEntryFuture
    //   0	119	1	paramBoolean	boolean
    //   1	40	2	bool1	boolean
    //   6	91	3	localObject1	Object
    //   17	39	4	bool2	boolean
    //   27	1	5	localObject2	Object
    //   105	12	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	105	finally
    //   46	51	105	finally
    //   55	60	105	finally
    //   60	64	105	finally
    //   69	73	105	finally
    //   74	80	105	finally
    //   80	84	105	finally
    //   85	91	105	finally
  }
  
  public Object get()
  {
    long l = 0L;
    try
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      return get(l, localTimeUnit);
    }
    catch (TimeoutException localTimeoutException)
    {
      ExecutionException localExecutionException = new java/util/concurrent/ExecutionException;
      localExecutionException.<init>(localTimeoutException);
      throw localExecutionException;
    }
  }
  
  /* Error */
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_3
    //   1: ldc 85
    //   3: invokestatic 91	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   11: astore 4
    //   13: aload 4
    //   15: invokeinterface 35 1 0
    //   20: aload_0
    //   21: getfield 59	org/apache/http/pool/PoolEntryFuture:completed	Z
    //   24: istore 5
    //   26: iload 5
    //   28: ifeq +25 -> 53
    //   31: aload_0
    //   32: getfield 93	org/apache/http/pool/PoolEntryFuture:result	Ljava/lang/Object;
    //   35: astore 4
    //   37: aload_0
    //   38: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   41: astore 6
    //   43: aload 6
    //   45: invokeinterface 47 1 0
    //   50: aload 4
    //   52: areturn
    //   53: aload_0
    //   54: lload_1
    //   55: aload_3
    //   56: invokevirtual 96	org/apache/http/pool/PoolEntryFuture:getPoolEntry	(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   59: astore 4
    //   61: aload_0
    //   62: aload 4
    //   64: putfield 93	org/apache/http/pool/PoolEntryFuture:result	Ljava/lang/Object;
    //   67: iconst_1
    //   68: istore 5
    //   70: aload_0
    //   71: iload 5
    //   73: putfield 59	org/apache/http/pool/PoolEntryFuture:completed	Z
    //   76: aload_0
    //   77: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   80: astore 4
    //   82: aload 4
    //   84: ifnull +24 -> 108
    //   87: aload_0
    //   88: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   91: astore 4
    //   93: aload_0
    //   94: getfield 93	org/apache/http/pool/PoolEntryFuture:result	Ljava/lang/Object;
    //   97: astore 6
    //   99: aload 4
    //   101: aload 6
    //   103: invokeinterface 99 2 0
    //   108: aload_0
    //   109: getfield 93	org/apache/http/pool/PoolEntryFuture:result	Ljava/lang/Object;
    //   112: astore 4
    //   114: aload_0
    //   115: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   118: astore 6
    //   120: aload 6
    //   122: invokeinterface 47 1 0
    //   127: goto -77 -> 50
    //   130: astore 4
    //   132: iconst_1
    //   133: istore 7
    //   135: aload_0
    //   136: iload 7
    //   138: putfield 59	org/apache/http/pool/PoolEntryFuture:completed	Z
    //   141: iconst_0
    //   142: istore 7
    //   144: aconst_null
    //   145: astore 6
    //   147: aload_0
    //   148: aconst_null
    //   149: putfield 93	org/apache/http/pool/PoolEntryFuture:result	Ljava/lang/Object;
    //   152: aload_0
    //   153: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   156: astore 6
    //   158: aload 6
    //   160: ifnull +18 -> 178
    //   163: aload_0
    //   164: getfield 33	org/apache/http/pool/PoolEntryFuture:callback	Lorg/apache/http/concurrent/FutureCallback;
    //   167: astore 6
    //   169: aload 6
    //   171: aload 4
    //   173: invokeinterface 103 2 0
    //   178: new 78	java/util/concurrent/ExecutionException
    //   181: astore 6
    //   183: aload 6
    //   185: aload 4
    //   187: invokespecial 81	java/util/concurrent/ExecutionException:<init>	(Ljava/lang/Throwable;)V
    //   190: aload 6
    //   192: athrow
    //   193: astore 4
    //   195: aload_0
    //   196: getfield 23	org/apache/http/pool/PoolEntryFuture:lock	Ljava/util/concurrent/locks/Lock;
    //   199: invokeinterface 47 1 0
    //   204: aload 4
    //   206: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	PoolEntryFuture
    //   0	207	1	paramLong	long
    //   0	207	3	paramTimeUnit	TimeUnit
    //   11	102	4	localObject1	Object
    //   130	56	4	localIOException	java.io.IOException
    //   193	12	4	localObject2	Object
    //   24	48	5	bool1	boolean
    //   41	150	6	localObject3	Object
    //   133	10	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   20	24	130	java/io/IOException
    //   31	35	130	java/io/IOException
    //   55	59	130	java/io/IOException
    //   62	67	130	java/io/IOException
    //   71	76	130	java/io/IOException
    //   76	80	130	java/io/IOException
    //   87	91	130	java/io/IOException
    //   93	97	130	java/io/IOException
    //   101	108	130	java/io/IOException
    //   108	112	130	java/io/IOException
    //   20	24	193	finally
    //   31	35	193	finally
    //   55	59	193	finally
    //   62	67	193	finally
    //   71	76	193	finally
    //   76	80	193	finally
    //   87	91	193	finally
    //   93	97	193	finally
    //   101	108	193	finally
    //   108	112	193	finally
    //   136	141	193	finally
    //   148	152	193	finally
    //   152	156	193	finally
    //   163	167	193	finally
    //   171	178	193	finally
    //   178	181	193	finally
    //   185	190	193	finally
    //   190	193	193	finally
  }
  
  protected abstract Object getPoolEntry(long paramLong, TimeUnit paramTimeUnit);
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public boolean isDone()
  {
    return this.completed;
  }
  
  public void wakeup()
  {
    Object localObject1 = this.lock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.condition;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      this.lock.unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\PoolEntryFuture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */