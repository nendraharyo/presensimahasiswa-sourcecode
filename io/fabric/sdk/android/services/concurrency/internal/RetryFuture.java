package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

class RetryFuture
  extends AbstractFuture
  implements Runnable
{
  private final RetryThreadPoolExecutor executor;
  RetryState retryState;
  private final AtomicReference runner;
  private final Callable task;
  
  RetryFuture(Callable paramCallable, RetryState paramRetryState, RetryThreadPoolExecutor paramRetryThreadPoolExecutor)
  {
    this.task = paramCallable;
    this.retryState = paramRetryState;
    this.executor = paramRetryThreadPoolExecutor;
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    this.runner = localAtomicReference;
  }
  
  private Backoff getBackoff()
  {
    return this.retryState.getBackoff();
  }
  
  private int getRetryCount()
  {
    return this.retryState.getRetryCount();
  }
  
  private RetryPolicy getRetryPolicy()
  {
    return this.retryState.getRetryPolicy();
  }
  
  protected void interruptTask()
  {
    Thread localThread = (Thread)this.runner.getAndSet(null);
    if (localThread != null) {
      localThread.interrupt();
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 56	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:isDone	()Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifne +23 -> 29
    //   9: aload_0
    //   10: getfield 29	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:runner	Ljava/util/concurrent/atomic/AtomicReference;
    //   13: astore_2
    //   14: invokestatic 60	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   17: astore_3
    //   18: aload_2
    //   19: aconst_null
    //   20: aload_3
    //   21: invokevirtual 64	java/util/concurrent/atomic/AtomicReference:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   24: istore_1
    //   25: iload_1
    //   26: ifne +4 -> 30
    //   29: return
    //   30: aload_0
    //   31: getfield 20	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:task	Ljava/util/concurrent/Callable;
    //   34: astore_2
    //   35: aload_2
    //   36: invokeinterface 70 1 0
    //   41: astore_2
    //   42: aload_0
    //   43: aload_2
    //   44: invokevirtual 74	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:set	(Ljava/lang/Object;)Z
    //   47: pop
    //   48: aload_0
    //   49: getfield 29	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:runner	Ljava/util/concurrent/atomic/AtomicReference;
    //   52: astore_2
    //   53: aload_2
    //   54: aconst_null
    //   55: invokevirtual 47	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   58: pop
    //   59: goto -30 -> 29
    //   62: astore_2
    //   63: aload_0
    //   64: invokespecial 75	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:getRetryPolicy	()Lio/fabric/sdk/android/services/concurrency/internal/RetryPolicy;
    //   67: astore_3
    //   68: aload_0
    //   69: invokespecial 76	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:getRetryCount	()I
    //   72: istore 4
    //   74: aload_3
    //   75: iload 4
    //   77: aload_2
    //   78: invokeinterface 82 3 0
    //   83: istore 5
    //   85: iload 5
    //   87: ifeq +79 -> 166
    //   90: aload_0
    //   91: invokespecial 83	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:getBackoff	()Lio/fabric/sdk/android/services/concurrency/internal/Backoff;
    //   94: astore_2
    //   95: aload_0
    //   96: invokespecial 76	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:getRetryCount	()I
    //   99: istore 5
    //   101: aload_2
    //   102: iload 5
    //   104: invokeinterface 89 2 0
    //   109: lstore 6
    //   111: aload_0
    //   112: getfield 22	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:retryState	Lio/fabric/sdk/android/services/concurrency/internal/RetryState;
    //   115: astore 8
    //   117: aload 8
    //   119: invokevirtual 93	io/fabric/sdk/android/services/concurrency/internal/RetryState:nextRetryState	()Lio/fabric/sdk/android/services/concurrency/internal/RetryState;
    //   122: astore 8
    //   124: aload_0
    //   125: aload 8
    //   127: putfield 22	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:retryState	Lio/fabric/sdk/android/services/concurrency/internal/RetryState;
    //   130: aload_0
    //   131: getfield 24	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:executor	Lio/fabric/sdk/android/services/concurrency/internal/RetryThreadPoolExecutor;
    //   134: astore 8
    //   136: getstatic 99	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   139: astore 9
    //   141: aload 8
    //   143: aload_0
    //   144: lload 6
    //   146: aload 9
    //   148: invokevirtual 105	io/fabric/sdk/android/services/concurrency/internal/RetryThreadPoolExecutor:schedule	(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   151: pop
    //   152: aload_0
    //   153: getfield 29	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:runner	Ljava/util/concurrent/atomic/AtomicReference;
    //   156: astore_2
    //   157: aload_2
    //   158: aconst_null
    //   159: invokevirtual 47	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   162: pop
    //   163: goto -134 -> 29
    //   166: aload_0
    //   167: aload_2
    //   168: invokevirtual 109	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:setException	(Ljava/lang/Throwable;)Z
    //   171: pop
    //   172: goto -20 -> 152
    //   175: astore_2
    //   176: aload_0
    //   177: getfield 29	io/fabric/sdk/android/services/concurrency/internal/RetryFuture:runner	Ljava/util/concurrent/atomic/AtomicReference;
    //   180: aconst_null
    //   181: invokevirtual 47	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: aload_2
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	RetryFuture
    //   4	22	1	bool1	boolean
    //   13	41	2	localObject1	Object
    //   62	16	2	localThrowable	Throwable
    //   94	74	2	localObject2	Object
    //   175	11	2	localObject3	Object
    //   17	58	3	localObject4	Object
    //   72	4	4	i	int
    //   83	3	5	bool2	boolean
    //   99	4	5	j	int
    //   109	36	6	l	long
    //   115	27	8	localObject5	Object
    //   139	8	9	localTimeUnit	java.util.concurrent.TimeUnit
    // Exception table:
    //   from	to	target	type
    //   30	34	62	finally
    //   35	41	62	finally
    //   43	48	62	finally
    //   63	67	175	finally
    //   68	72	175	finally
    //   77	83	175	finally
    //   90	94	175	finally
    //   95	99	175	finally
    //   102	109	175	finally
    //   111	115	175	finally
    //   117	122	175	finally
    //   125	130	175	finally
    //   130	134	175	finally
    //   136	139	175	finally
    //   146	152	175	finally
    //   167	172	175	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\RetryFuture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */