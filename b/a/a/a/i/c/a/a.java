package b.a.a.a.i.c.a;

import b.a.a.a.e.q;
import b.a.a.a.i.c.l;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class a
{
  public b.a.a.a.h.b a;
  protected final Lock b;
  protected Set c;
  protected volatile boolean d;
  protected l e;
  
  protected a()
  {
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b.a.a.a.h.b)localObject).<init>(localClass);
    this.a = ((b.a.a.a.h.b)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.c = ((Set)localObject);
    localObject = new b/a/a/a/i/c/l;
    ((l)localObject).<init>();
    this.e = ((l)localObject);
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.b = ((Lock)localObject);
  }
  
  public void a()
  {
    Object localObject1 = this.b;
    ((Lock)localObject1).lock();
    for (;;)
    {
      try
      {
        bool = this.d;
        if (bool)
        {
          localObject1 = this.b;
          ((Lock)localObject1).unlock();
          return;
        }
        localObject1 = this.c;
        Iterator localIterator = ((Set)localObject1).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject1 = localIterator.next();
          localObject1 = (b)localObject1;
          localIterator.remove();
          localObject1 = ((b)localObject1).c();
          a((q)localObject1);
          continue;
        }
        localObject3 = this.e;
      }
      finally
      {
        this.b.unlock();
      }
      ((l)localObject3).a();
      boolean bool = true;
      this.d = bool;
      Object localObject3 = this.b;
      ((Lock)localObject3).unlock();
    }
  }
  
  protected void a(q paramq)
  {
    if (paramq != null) {}
    try
    {
      paramq.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        b.a.a.a.h.b localb = this.a;
        String str = "I/O error closing connection";
        localb.a(str, localIOException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */