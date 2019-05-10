package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;

public final class PriorityThreadPoolExecutor$PriorityThreadFactory
  implements ThreadFactory
{
  private final int threadPriority;
  
  public PriorityThreadPoolExecutor$PriorityThreadFactory(int paramInt)
  {
    this.threadPriority = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    localThread.<init>(paramRunnable);
    int i = this.threadPriority;
    localThread.setPriority(i);
    localThread.setName("Queue");
    return localThread;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityThreadPoolExecutor$PriorityThreadFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */