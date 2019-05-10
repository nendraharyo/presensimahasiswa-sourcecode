package io.fabric.sdk.android.services.concurrency;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask
{
  private static final int CORE_POOL_SIZE = 0;
  private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
  private static final int KEEP_ALIVE = 1;
  private static final String LOG_TAG = "AsyncTask";
  private static final int MAXIMUM_POOL_SIZE = 0;
  private static final int MESSAGE_POST_PROGRESS = 2;
  private static final int MESSAGE_POST_RESULT = 1;
  public static final Executor SERIAL_EXECUTOR;
  public static final Executor THREAD_POOL_EXECUTOR;
  private static volatile Executor defaultExecutor = SERIAL_EXECUTOR;
  private static final AsyncTask.InternalHandler handler;
  private static final BlockingQueue poolWorkQueue;
  private static final ThreadFactory threadFactory;
  private final AtomicBoolean cancelled;
  private final FutureTask future;
  private volatile AsyncTask.Status status;
  private final AtomicBoolean taskInvoked;
  private final AsyncTask.WorkerRunnable worker;
  
  static
  {
    CORE_POOL_SIZE = CPU_COUNT + 1;
    MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
    Object localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$1;
    ((AsyncTask.1)localObject).<init>();
    threadFactory = (ThreadFactory)localObject;
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>(128);
    poolWorkQueue = (BlockingQueue)localObject;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    int i = CORE_POOL_SIZE;
    int j = MAXIMUM_POOL_SIZE;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    BlockingQueue localBlockingQueue = poolWorkQueue;
    ThreadFactory localThreadFactory = threadFactory;
    localThreadPoolExecutor.<init>(i, j, 1L, localTimeUnit, localBlockingQueue, localThreadFactory);
    THREAD_POOL_EXECUTOR = localThreadPoolExecutor;
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$SerialExecutor;
    ((AsyncTask.SerialExecutor)localObject).<init>(null);
    SERIAL_EXECUTOR = (Executor)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$InternalHandler;
    ((AsyncTask.InternalHandler)localObject).<init>();
    handler = (AsyncTask.InternalHandler)localObject;
  }
  
  public AsyncTask()
  {
    Object localObject = AsyncTask.Status.PENDING;
    this.status = ((AsyncTask.Status)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.cancelled = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.taskInvoked = ((AtomicBoolean)localObject);
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$2;
    ((AsyncTask.2)localObject).<init>(this);
    this.worker = ((AsyncTask.WorkerRunnable)localObject);
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$3;
    AsyncTask.WorkerRunnable localWorkerRunnable = this.worker;
    ((AsyncTask.3)localObject).<init>(this, localWorkerRunnable);
    this.future = ((FutureTask)localObject);
  }
  
  public static void execute(Runnable paramRunnable)
  {
    defaultExecutor.execute(paramRunnable);
  }
  
  private void finish(Object paramObject)
  {
    boolean bool = isCancelled();
    if (bool) {
      onCancelled(paramObject);
    }
    for (;;)
    {
      AsyncTask.Status localStatus = AsyncTask.Status.FINISHED;
      this.status = localStatus;
      return;
      onPostExecute(paramObject);
    }
  }
  
  public static void init()
  {
    handler.getLooper();
  }
  
  private Object postResult(Object paramObject)
  {
    int i = 1;
    AsyncTask.InternalHandler localInternalHandler = handler;
    AsyncTask.AsyncTaskResult localAsyncTaskResult = new io/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramObject;
    localAsyncTaskResult.<init>(this, arrayOfObject);
    localInternalHandler.obtainMessage(i, localAsyncTaskResult).sendToTarget();
    return paramObject;
  }
  
  private void postResultIfNotInvoked(Object paramObject)
  {
    AtomicBoolean localAtomicBoolean = this.taskInvoked;
    boolean bool = localAtomicBoolean.get();
    if (!bool) {
      postResult(paramObject);
    }
  }
  
  public static void setDefaultExecutor(Executor paramExecutor)
  {
    defaultExecutor = paramExecutor;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    this.cancelled.set(true);
    return this.future.cancel(paramBoolean);
  }
  
  protected abstract Object doInBackground(Object... paramVarArgs);
  
  public final AsyncTask execute(Object... paramVarArgs)
  {
    Executor localExecutor = defaultExecutor;
    return executeOnExecutor(localExecutor, paramVarArgs);
  }
  
  public final AsyncTask executeOnExecutor(Executor paramExecutor, Object... paramVarArgs)
  {
    Object localObject = this.status;
    AsyncTask.Status localStatus = AsyncTask.Status.PENDING;
    int j;
    if (localObject != localStatus)
    {
      localObject = AsyncTask.4.$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status;
      localStatus = this.status;
      int i = localStatus.ordinal();
      j = localObject[i];
    }
    switch (j)
    {
    default: 
      localObject = AsyncTask.Status.RUNNING;
      this.status = ((AsyncTask.Status)localObject);
      onPreExecute();
      this.worker.params = paramVarArgs;
      localObject = this.future;
      paramExecutor.execute((Runnable)localObject);
      return this;
    case 1: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot execute task: the task is already running.");
      throw ((Throwable)localObject);
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Cannot execute task: the task has already been executed (a task can be executed only once)");
    throw ((Throwable)localObject);
  }
  
  public final Object get()
  {
    return this.future.get();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.future.get(paramLong, paramTimeUnit);
  }
  
  public final AsyncTask.Status getStatus()
  {
    return this.status;
  }
  
  public final boolean isCancelled()
  {
    return this.cancelled.get();
  }
  
  protected void onCancelled() {}
  
  protected void onCancelled(Object paramObject)
  {
    onCancelled();
  }
  
  protected void onPostExecute(Object paramObject) {}
  
  protected void onPreExecute() {}
  
  protected void onProgressUpdate(Object... paramVarArgs) {}
  
  protected final void publishProgress(Object... paramVarArgs)
  {
    boolean bool = isCancelled();
    if (!bool)
    {
      Object localObject = handler;
      int i = 2;
      AsyncTask.AsyncTaskResult localAsyncTaskResult = new io/fabric/sdk/android/services/concurrency/AsyncTask$AsyncTaskResult;
      localAsyncTaskResult.<init>(this, paramVarArgs);
      localObject = ((AsyncTask.InternalHandler)localObject).obtainMessage(i, localAsyncTaskResult);
      ((Message)localObject).sendToTarget();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */