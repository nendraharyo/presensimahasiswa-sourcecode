package io.fabric.sdk.android.services.concurrency;

import java.util.LinkedList;
import java.util.concurrent.Executor;

class AsyncTask$SerialExecutor
  implements Executor
{
  Runnable active;
  final LinkedList tasks;
  
  private AsyncTask$SerialExecutor()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    this.tasks = localLinkedList;
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      Object localObject1 = this.tasks;
      AsyncTask.SerialExecutor.1 local1 = new io/fabric/sdk/android/services/concurrency/AsyncTask$SerialExecutor$1;
      local1.<init>(this, paramRunnable);
      ((LinkedList)localObject1).offer(local1);
      localObject1 = this.active;
      if (localObject1 == null) {
        scheduleNext();
      }
      return;
    }
    finally {}
  }
  
  protected void scheduleNext()
  {
    try
    {
      Object localObject1 = this.tasks;
      localObject1 = ((LinkedList)localObject1).poll();
      localObject1 = (Runnable)localObject1;
      this.active = ((Runnable)localObject1);
      if (localObject1 != null)
      {
        localObject1 = AsyncTask.THREAD_POOL_EXECUTOR;
        Runnable localRunnable = this.active;
        ((Executor)localObject1).execute(localRunnable);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$SerialExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */