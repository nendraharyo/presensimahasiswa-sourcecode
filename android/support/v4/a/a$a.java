package android.support.v4.a;

import android.support.v4.os.c;
import java.util.concurrent.CountDownLatch;

final class a$a
  extends d
  implements Runnable
{
  boolean a;
  private final CountDownLatch d;
  
  a$a(a parama)
  {
    CountDownLatch localCountDownLatch = new java/util/concurrent/CountDownLatch;
    localCountDownLatch.<init>(1);
    this.d = localCountDownLatch;
  }
  
  protected Object a(Void... paramVarArgs)
  {
    try
    {
      localObject1 = this.b;
      localObject1 = ((a)localObject1).onLoadInBackground();
    }
    catch (c localc)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = d();
        if (!bool) {
          throw localc;
        }
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
  
  public void a()
  {
    try
    {
      CountDownLatch localCountDownLatch = this.d;
      localCountDownLatch.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  protected void a(Object paramObject)
  {
    try
    {
      a locala = this.b;
      locala.dispatchOnLoadComplete(this, paramObject);
      return;
    }
    finally
    {
      this.d.countDown();
    }
  }
  
  protected void b(Object paramObject)
  {
    try
    {
      a locala = this.b;
      locala.dispatchOnCancelled(this, paramObject);
      return;
    }
    finally
    {
      this.d.countDown();
    }
  }
  
  public void run()
  {
    this.a = false;
    this.b.executePendingTask();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */