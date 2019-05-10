package android.support.v4.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class d$1
  implements ThreadFactory
{
  private final AtomicInteger a;
  
  d$1()
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    this.a = localAtomicInteger;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("ModernAsyncTask #");
    int i = this.a.getAndIncrement();
    localObject = i;
    localThread.<init>(paramRunnable, (String)localObject);
    return localThread;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\d$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */