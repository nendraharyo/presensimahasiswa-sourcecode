package io.fabric.sdk.android.services.concurrency;

class PriorityAsyncTask$ProxyExecutor$1
  extends PriorityFutureTask
{
  PriorityAsyncTask$ProxyExecutor$1(PriorityAsyncTask.ProxyExecutor paramProxyExecutor, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  public Dependency getDelegate()
  {
    return PriorityAsyncTask.ProxyExecutor.access$000(this.this$0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityAsyncTask$ProxyExecutor$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */