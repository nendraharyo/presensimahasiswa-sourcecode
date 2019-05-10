package android.support.v4.a;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class d
{
  private static final ThreadFactory a;
  private static final BlockingQueue b;
  public static final Executor c;
  private static d.b d;
  private static volatile Executor e = c;
  private final d.d f;
  private final FutureTask g;
  private volatile d.c h;
  private final AtomicBoolean i;
  private final AtomicBoolean j;
  
  static
  {
    Object localObject = new android/support/v4/a/d$1;
    ((d.1)localObject).<init>();
    a = (ThreadFactory)localObject;
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>(10);
    b = (BlockingQueue)localObject;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    BlockingQueue localBlockingQueue = b;
    ThreadFactory localThreadFactory = a;
    localThreadPoolExecutor.<init>(5, 128, 1L, localTimeUnit, localBlockingQueue, localThreadFactory);
    c = localThreadPoolExecutor;
  }
  
  d()
  {
    Object localObject = d.c.a;
    this.h = ((d.c)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.i = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.j = ((AtomicBoolean)localObject);
    localObject = new android/support/v4/a/d$2;
    ((d.2)localObject).<init>(this);
    this.f = ((d.d)localObject);
    localObject = new android/support/v4/a/d$3;
    d.d locald = this.f;
    ((d.3)localObject).<init>(this, locald);
    this.g = ((FutureTask)localObject);
  }
  
  private static Handler a()
  {
    synchronized (d.class)
    {
      d.b localb = d;
      if (localb == null)
      {
        localb = new android/support/v4/a/d$b;
        localb.<init>();
        d = localb;
      }
      localb = d;
      return localb;
    }
  }
  
  public final d a(Executor paramExecutor, Object... paramVarArgs)
  {
    Object localObject = this.h;
    d.c localc = d.c.a;
    if (localObject != localc)
    {
      localObject = d.4.a;
      localc = this.h;
      int k = localc.ordinal();
      int m = localObject[k];
      switch (m)
      {
      default: 
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("We should never reach this state");
        throw ((Throwable)localObject);
      case 1: 
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Cannot execute task: the task is already running.");
        throw ((Throwable)localObject);
      }
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot execute task: the task has already been executed (a task can be executed only once)");
      throw ((Throwable)localObject);
    }
    localObject = d.c.b;
    this.h = ((d.c)localObject);
    b();
    this.f.b = paramVarArgs;
    localObject = this.g;
    paramExecutor.execute((Runnable)localObject);
    return this;
  }
  
  protected abstract Object a(Object... paramVarArgs);
  
  protected void a(Object paramObject) {}
  
  public final boolean a(boolean paramBoolean)
  {
    this.i.set(true);
    return this.g.cancel(paramBoolean);
  }
  
  protected void b() {}
  
  protected void b(Object paramObject)
  {
    c();
  }
  
  protected void b(Object... paramVarArgs) {}
  
  protected void c() {}
  
  void c(Object paramObject)
  {
    AtomicBoolean localAtomicBoolean = this.j;
    boolean bool = localAtomicBoolean.get();
    if (!bool) {
      d(paramObject);
    }
  }
  
  Object d(Object paramObject)
  {
    int k = 1;
    Handler localHandler = a();
    d.a locala = new android/support/v4/a/d$a;
    Object[] arrayOfObject = new Object[k];
    arrayOfObject[0] = paramObject;
    locala.<init>(this, arrayOfObject);
    localHandler.obtainMessage(k, locala).sendToTarget();
    return paramObject;
  }
  
  public final boolean d()
  {
    return this.i.get();
  }
  
  void e(Object paramObject)
  {
    boolean bool = d();
    if (bool) {
      b(paramObject);
    }
    for (;;)
    {
      d.c localc = d.c.c;
      this.h = localc;
      return;
      a(paramObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */