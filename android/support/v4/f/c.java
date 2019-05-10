package android.support.v4.f;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c
{
  private final Object a;
  private HandlerThread b;
  private Handler c;
  private int d;
  private Handler.Callback e;
  private final int f;
  private final int g;
  private final String h;
  
  public c(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.a = localObject;
    localObject = new android/support/v4/f/c$1;
    ((c.1)localObject).<init>(this);
    this.e = ((Handler.Callback)localObject);
    this.h = paramString;
    this.g = paramInt1;
    this.f = paramInt2;
    this.d = 0;
  }
  
  private void a()
  {
    synchronized (this.a)
    {
      Object localObject2 = this.c;
      int i = 1;
      boolean bool = ((Handler)localObject2).hasMessages(i);
      if (bool) {
        return;
      }
      localObject2 = this.b;
      ((HandlerThread)localObject2).quit();
      bool = false;
      localObject2 = null;
      this.b = null;
      bool = false;
      localObject2 = null;
      this.c = null;
    }
  }
  
  private void a(Runnable paramRunnable)
  {
    synchronized (this.a)
    {
      Object localObject2 = this.b;
      if (localObject2 == null)
      {
        localObject2 = new android/os/HandlerThread;
        localObject4 = this.h;
        i = this.g;
        ((HandlerThread)localObject2).<init>((String)localObject4, i);
        this.b = ((HandlerThread)localObject2);
        localObject2 = this.b;
        ((HandlerThread)localObject2).start();
        localObject2 = new android/os/Handler;
        localObject4 = this.b;
        localObject4 = ((HandlerThread)localObject4).getLooper();
        Handler.Callback localCallback = this.e;
        ((Handler)localObject2).<init>((Looper)localObject4, localCallback);
        this.c = ((Handler)localObject2);
        int j = this.d + 1;
        this.d = j;
      }
      localObject2 = this.c;
      Object localObject4 = null;
      ((Handler)localObject2).removeMessages(0);
      localObject2 = this.c;
      localObject4 = this.c;
      int i = 1;
      localObject4 = ((Handler)localObject4).obtainMessage(i, paramRunnable);
      ((Handler)localObject2).sendMessage((Message)localObject4);
      return;
    }
  }
  
  private void b(Runnable paramRunnable)
  {
    paramRunnable.run();
    synchronized (this.a)
    {
      Handler localHandler = this.c;
      Object localObject3 = null;
      localHandler.removeMessages(0);
      localHandler = this.c;
      localObject3 = this.c;
      int i = 0;
      localObject3 = ((Handler)localObject3).obtainMessage(0);
      i = this.f;
      long l = i;
      localHandler.sendMessageDelayed((Message)localObject3, l);
      return;
    }
  }
  
  public Object a(Callable paramCallable, int paramInt)
  {
    localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    Condition localCondition = localReentrantLock.newCondition();
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    boolean bool1 = true;
    localAtomicBoolean.<init>(bool1);
    Object localObject1 = new android/support/v4/f/c$3;
    Object localObject3 = this;
    ((c.3)localObject1).<init>(this, localAtomicReference, paramCallable, localReentrantLock, localAtomicBoolean, localCondition);
    a((Runnable)localObject1);
    localReentrantLock.lock();
    do
    {
      for (;;)
      {
        try
        {
          bool1 = localAtomicBoolean.get();
          if (!bool1)
          {
            localObject1 = localAtomicReference.get();
            return localObject1;
          }
          localObject1 = TimeUnit.MILLISECONDS;
          l1 = paramInt;
          l2 = ((TimeUnit)localObject1).toNanos(l1);
        }
        finally
        {
          long l1;
          long l2;
          boolean bool2;
          localReentrantLock.unlock();
        }
        try
        {
          l2 = localCondition.awaitNanos(l2);
        }
        catch (InterruptedException localInterruptedException)
        {
          continue;
        }
        bool2 = localAtomicBoolean.get();
        if (bool2) {
          continue;
        }
        localObject1 = localAtomicReference.get();
        localReentrantLock.unlock();
      }
      l1 = 0L;
      bool2 = l2 < l1;
    } while (bool2);
    localObject1 = new java/lang/InterruptedException;
    localObject3 = "timeout";
    ((InterruptedException)localObject1).<init>((String)localObject3);
    throw ((Throwable)localObject1);
  }
  
  public void a(Callable paramCallable, c.a parama)
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    c.2 local2 = new android/support/v4/f/c$2;
    local2.<init>(this, paramCallable, localHandler, parama);
    a(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */