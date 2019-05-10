package b.a.a.a.i.c.a;

import b.a.a.a.o.a;
import java.util.Date;
import java.util.concurrent.locks.Condition;

public class h
{
  private final Condition a;
  private final f b;
  private Thread c;
  private boolean d;
  
  public h(Condition paramCondition, f paramf)
  {
    a.a(paramCondition, "Condition");
    this.a = paramCondition;
    this.b = paramf;
  }
  
  public void a()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Nobody waiting on this object.");
      throw ((Throwable)localObject);
    }
    this.a.signalAll();
  }
  
  public boolean a(Date paramDate)
  {
    Thread localThread = null;
    Object localObject1 = this.c;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("A thread is already waiting on this object.\ncaller: ");
      localThread = Thread.currentThread();
      localObject3 = ((StringBuilder)localObject3).append(localThread).append("\nwaiter: ");
      localThread = this.c;
      localObject3 = localThread;
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    boolean bool1 = this.d;
    if (bool1)
    {
      localObject1 = new java/lang/InterruptedException;
      ((InterruptedException)localObject1).<init>("Operation interrupted");
      throw ((Throwable)localObject1);
    }
    localObject1 = Thread.currentThread();
    this.c = ((Thread)localObject1);
    if (paramDate != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.a;
        bool1 = ((Condition)localObject1).awaitUntil(paramDate);
        boolean bool2 = this.d;
        if (!bool2) {
          break;
        }
        localObject1 = new java/lang/InterruptedException;
        localObject3 = "Operation interrupted";
        ((InterruptedException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      finally
      {
        this.c = null;
      }
      Condition localCondition = this.a;
      localCondition.await();
      bool1 = true;
    }
    this.c = null;
    return bool1;
  }
  
  public void b()
  {
    this.d = true;
    this.a.signalAll();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */