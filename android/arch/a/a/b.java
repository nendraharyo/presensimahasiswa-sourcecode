package android.arch.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b
  extends c
{
  private final Object a;
  private ExecutorService b;
  private volatile Handler c;
  
  public b()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.a = localObject;
    localObject = Executors.newFixedThreadPool(2);
    this.b = ((ExecutorService)localObject);
  }
  
  public void a(Runnable paramRunnable)
  {
    this.b.execute(paramRunnable);
  }
  
  public void b(Runnable paramRunnable)
  {
    Handler localHandler = this.c;
    if (localHandler == null) {}
    synchronized (this.a)
    {
      localHandler = this.c;
      if (localHandler == null)
      {
        localHandler = new android/os/Handler;
        Looper localLooper = Looper.getMainLooper();
        localHandler.<init>(localLooper);
        this.c = localHandler;
      }
      this.c.post(paramRunnable);
      return;
    }
  }
  
  public boolean b()
  {
    Thread localThread1 = Looper.getMainLooper().getThread();
    Thread localThread2 = Thread.currentThread();
    boolean bool;
    if (localThread1 == localThread2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localThread1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */