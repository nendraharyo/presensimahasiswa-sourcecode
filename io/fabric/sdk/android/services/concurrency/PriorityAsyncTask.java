package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

public abstract class PriorityAsyncTask
  extends AsyncTask
  implements DelegateProvider, Dependency, PriorityProvider, Task
{
  private final PriorityTask priorityTask;
  
  public PriorityAsyncTask()
  {
    PriorityTask localPriorityTask = new io/fabric/sdk/android/services/concurrency/PriorityTask;
    localPriorityTask.<init>();
    this.priorityTask = localPriorityTask;
  }
  
  public void addDependency(Task paramTask)
  {
    Object localObject = getStatus();
    AsyncTask.Status localStatus = AsyncTask.Status.PENDING;
    if (localObject != localStatus)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Must not add Dependency after task is running");
      throw ((Throwable)localObject);
    }
    ((Dependency)getDelegate()).addDependency(paramTask);
  }
  
  public boolean areDependenciesMet()
  {
    return ((Dependency)getDelegate()).areDependenciesMet();
  }
  
  public int compareTo(Object paramObject)
  {
    return Priority.compareTo(this, paramObject);
  }
  
  public final void executeOnExecutor(ExecutorService paramExecutorService, Object... paramVarArgs)
  {
    PriorityAsyncTask.ProxyExecutor localProxyExecutor = new io/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor;
    localProxyExecutor.<init>(paramExecutorService, this);
    super.executeOnExecutor(localProxyExecutor, paramVarArgs);
  }
  
  public Dependency getDelegate()
  {
    return this.priorityTask;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityAsyncTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */