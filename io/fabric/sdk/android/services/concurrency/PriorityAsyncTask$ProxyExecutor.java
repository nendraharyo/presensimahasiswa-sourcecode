package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Executor;

class PriorityAsyncTask$ProxyExecutor
  implements Executor
{
  private final Executor executor;
  private final PriorityAsyncTask task;
  
  public PriorityAsyncTask$ProxyExecutor(Executor paramExecutor, PriorityAsyncTask paramPriorityAsyncTask)
  {
    this.executor = paramExecutor;
    this.task = paramPriorityAsyncTask;
  }
  
  public void execute(Runnable paramRunnable)
  {
    Executor localExecutor = this.executor;
    PriorityAsyncTask.ProxyExecutor.1 local1 = new io/fabric/sdk/android/services/concurrency/PriorityAsyncTask$ProxyExecutor$1;
    local1.<init>(this, paramRunnable, null);
    localExecutor.execute(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityAsyncTask$ProxyExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */