package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;

public class WaitingThread
{
  private boolean aborted;
  private final Condition cond;
  private final RouteSpecificPool pool;
  private Thread waiter;
  
  public WaitingThread(Condition paramCondition, RouteSpecificPool paramRouteSpecificPool)
  {
    Args.notNull(paramCondition, "Condition");
    this.cond = paramCondition;
    this.pool = paramRouteSpecificPool;
  }
  
  public boolean await(Date paramDate)
  {
    Thread localThread = null;
    Object localObject1 = this.waiter;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("A thread is already waiting on this object.\ncaller: ");
      localThread = Thread.currentThread();
      localObject3 = ((StringBuilder)localObject3).append(localThread).append("\nwaiter: ");
      localThread = this.waiter;
      localObject3 = localThread;
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    boolean bool1 = this.aborted;
    if (bool1)
    {
      localObject1 = new java/lang/InterruptedException;
      ((InterruptedException)localObject1).<init>("Operation interrupted");
      throw ((Throwable)localObject1);
    }
    localObject1 = Thread.currentThread();
    this.waiter = ((Thread)localObject1);
    if (paramDate != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.cond;
        bool1 = ((Condition)localObject1).awaitUntil(paramDate);
        boolean bool2 = this.aborted;
        if (!bool2) {
          break;
        }
        localObject1 = new java/lang/InterruptedException;
        localObject3 = "Operation interrupted";
        ((InterruptedException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      finally
      {
        this.waiter = null;
      }
      Condition localCondition = this.cond;
      localCondition.await();
      bool1 = true;
    }
    this.waiter = null;
    return bool1;
  }
  
  public final Condition getCondition()
  {
    return this.cond;
  }
  
  public final RouteSpecificPool getPool()
  {
    return this.pool;
  }
  
  public final Thread getThread()
  {
    return this.waiter;
  }
  
  public void interrupt()
  {
    this.aborted = true;
    this.cond.signalAll();
  }
  
  public void wakeup()
  {
    Object localObject = this.waiter;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Nobody waiting on this object.");
      throw ((Throwable)localObject);
    }
    this.cond.signalAll();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\WaitingThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */