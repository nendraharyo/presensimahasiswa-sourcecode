package android.support.v4.f;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class c$3
  implements Runnable
{
  c$3(c paramc, AtomicReference paramAtomicReference, Callable paramCallable, ReentrantLock paramReentrantLock, AtomicBoolean paramAtomicBoolean, Condition paramCondition) {}
  
  public void run()
  {
    try
    {
      localObject1 = this.a;
      localObject3 = this.b;
      localObject3 = ((Callable)localObject3).call();
      ((AtomicReference)localObject1).set(localObject3);
    }
    catch (Exception localException)
    {
      Object localObject1;
      Object localObject3;
      for (;;) {}
    }
    localObject1 = this.c;
    ((ReentrantLock)localObject1).lock();
    try
    {
      localObject1 = this.d;
      localObject3 = null;
      ((AtomicBoolean)localObject1).set(false);
      localObject1 = this.e;
      ((Condition)localObject1).signal();
      return;
    }
    finally
    {
      this.c.unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\c$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */