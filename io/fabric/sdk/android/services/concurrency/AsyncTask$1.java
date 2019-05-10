package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class AsyncTask$1
  implements ThreadFactory
{
  private final AtomicInteger count;
  
  AsyncTask$1()
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    this.count = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("AsyncTask #");
    int i = this.count.getAndIncrement();
    localObject = i;
    localThread.<init>(paramRunnable, (String)localObject);
    return localThread;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */