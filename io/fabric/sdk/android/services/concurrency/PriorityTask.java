package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class PriorityTask
  implements Dependency, PriorityProvider, Task
{
  private final List dependencies;
  private final AtomicBoolean hasRun;
  private final AtomicReference throwable;
  
  public PriorityTask()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.dependencies = ((List)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    this.hasRun = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>(null);
    this.throwable = ((AtomicReference)localObject);
  }
  
  public static boolean isProperDelegate(Object paramObject)
  {
    Object localObject1 = paramObject;
    for (;;)
    {
      try
      {
        localDependency = (Dependency)paramObject;
        localObject1 = paramObject;
        localObject1 = (Task)paramObject;
        paramObject = (PriorityProvider)paramObject;
        if ((localDependency == null) || (localObject1 == null) || (paramObject == null)) {
          continue;
        }
        bool = true;
      }
      catch (ClassCastException localClassCastException)
      {
        Dependency localDependency;
        boolean bool = false;
        Object localObject2 = null;
        continue;
      }
      return bool;
      bool = false;
      localDependency = null;
    }
  }
  
  public void addDependency(Task paramTask)
  {
    try
    {
      List localList = this.dependencies;
      localList.add(paramTask);
      return;
    }
    finally {}
  }
  
  public boolean areDependenciesMet()
  {
    Object localObject = getDependencies();
    Iterator localIterator = ((Collection)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Task)localIterator.next();
      bool = ((Task)localObject).isFinished();
    } while (bool);
    boolean bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  public int compareTo(Object paramObject)
  {
    return Priority.compareTo(this, paramObject);
  }
  
  public Collection getDependencies()
  {
    try
    {
      Object localObject1 = this.dependencies;
      localObject1 = Collections.unmodifiableCollection((Collection)localObject1);
      return (Collection)localObject1;
    }
    finally {}
  }
  
  public Throwable getError()
  {
    return (Throwable)this.throwable.get();
  }
  
  public Priority getPriority()
  {
    return Priority.NORMAL;
  }
  
  public boolean isFinished()
  {
    return this.hasRun.get();
  }
  
  public void setError(Throwable paramThrowable)
  {
    this.throwable.set(paramThrowable);
  }
  
  public void setFinished(boolean paramBoolean)
  {
    try
    {
      AtomicBoolean localAtomicBoolean = this.hasRun;
      localAtomicBoolean.set(paramBoolean);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */