package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class PriorityFutureTask
  extends FutureTask
  implements DelegateProvider, Dependency, PriorityProvider, Task
{
  final Object delegate;
  
  public PriorityFutureTask(Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
    Dependency localDependency = checkAndInitDelegate(paramRunnable);
    this.delegate = localDependency;
  }
  
  public PriorityFutureTask(Callable paramCallable)
  {
    super(paramCallable);
    Dependency localDependency = checkAndInitDelegate(paramCallable);
    this.delegate = localDependency;
  }
  
  public void addDependency(Task paramTask)
  {
    ((Dependency)getDelegate()).addDependency(paramTask);
  }
  
  public boolean areDependenciesMet()
  {
    return ((Dependency)getDelegate()).areDependenciesMet();
  }
  
  protected Dependency checkAndInitDelegate(Object paramObject)
  {
    boolean bool = PriorityTask.isProperDelegate(paramObject);
    if (bool) {
      paramObject = (Dependency)paramObject;
    }
    for (;;)
    {
      return (Dependency)paramObject;
      paramObject = new io/fabric/sdk/android/services/concurrency/PriorityTask;
      ((PriorityTask)paramObject).<init>();
    }
  }
  
  public int compareTo(Object paramObject)
  {
    return ((PriorityProvider)getDelegate()).compareTo(paramObject);
  }
  
  public Dependency getDelegate()
  {
    return (Dependency)this.delegate;
  }
  
  public Collection getDependencies()
  {
    return ((Dependency)getDelegate()).getDependencies();
  }
  
  public Throwable getError()
  {
    return ((Task)getDelegate()).getError();
  }
  
  public Priority getPriority()
  {
    return ((PriorityProvider)getDelegate()).getPriority();
  }
  
  public boolean isFinished()
  {
    return ((Task)getDelegate()).isFinished();
  }
  
  public void setError(Throwable paramThrowable)
  {
    ((Task)getDelegate()).setError(paramThrowable);
  }
  
  public void setFinished(boolean paramBoolean)
  {
    ((Task)getDelegate()).setFinished(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityFutureTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */