package b.a.a.a.k;

import b.a.a.a.e;
import b.a.a.a.g;
import b.a.a.a.h;
import b.a.a.a.o.a;
import java.util.NoSuchElementException;

public class d
  implements g
{
  private final h a;
  private final r b;
  private b.a.a.a.f c = null;
  private b.a.a.a.o.d d = null;
  private u e = null;
  
  public d(h paramh)
  {
    this(paramh, localf);
  }
  
  public d(h paramh, r paramr)
  {
    Object localObject = (h)a.a(paramh, "Header iterator");
    this.a = ((h)localObject);
    localObject = (r)a.a(paramr, "Parser");
    this.b = ((r)localObject);
  }
  
  private void b()
  {
    boolean bool = false;
    Object localObject1 = null;
    this.e = null;
    this.d = null;
    localObject1 = this.a;
    bool = ((h)localObject1).hasNext();
    Object localObject2;
    int i;
    int j;
    if (bool)
    {
      localObject1 = this.a;
      localObject2 = ((h)localObject1).a();
      bool = localObject2 instanceof b.a.a.a.d;
      if (!bool) {
        break label122;
      }
      localObject1 = localObject2;
      localObject1 = ((b.a.a.a.d)localObject2).a();
      this.d = ((b.a.a.a.o.d)localObject1);
      localObject1 = new b/a/a/a/k/u;
      b.a.a.a.o.d locald = this.d;
      i = locald.c();
      ((u)localObject1).<init>(0, i);
      this.e = ((u)localObject1);
      localObject1 = this.e;
      localObject2 = (b.a.a.a.d)localObject2;
      j = ((b.a.a.a.d)localObject2).b();
      ((u)localObject1).a(j);
    }
    for (;;)
    {
      return;
      label122:
      localObject1 = ((e)localObject2).d();
      if (localObject1 == null) {
        break;
      }
      localObject2 = new b/a/a/a/o/d;
      i = ((String)localObject1).length();
      ((b.a.a.a.o.d)localObject2).<init>(i);
      this.d = ((b.a.a.a.o.d)localObject2);
      this.d.a((String)localObject1);
      localObject1 = new b/a/a/a/k/u;
      localObject2 = this.d;
      j = ((b.a.a.a.o.d)localObject2).c();
      ((u)localObject1).<init>(0, j);
      this.e = ((u)localObject1);
    }
  }
  
  private void c()
  {
    for (;;)
    {
      Object localObject1 = this.a;
      boolean bool = ((h)localObject1).hasNext();
      if (!bool)
      {
        localObject1 = this.e;
        if (localObject1 == null) {}
      }
      else
      {
        localObject1 = this.e;
        if (localObject1 != null)
        {
          localObject1 = this.e;
          bool = ((u)localObject1).c();
          if (!bool) {}
        }
        else
        {
          b();
        }
        localObject1 = this.e;
        if (localObject1 == null) {
          continue;
        }
        Object localObject2;
        do
        {
          localObject1 = this.e;
          bool = ((u)localObject1).c();
          if (bool) {
            break label136;
          }
          localObject1 = this.b;
          localObject2 = this.d;
          u localu = this.e;
          localObject1 = ((r)localObject1).b((b.a.a.a.o.d)localObject2, localu);
          localObject2 = ((b.a.a.a.f)localObject1).a();
          int i = ((String)localObject2).length();
          if (i != 0) {
            break;
          }
          localObject2 = ((b.a.a.a.f)localObject1).b();
        } while (localObject2 == null);
        this.c = ((b.a.a.a.f)localObject1);
      }
      return;
      label136:
      localObject1 = this.e;
      bool = ((u)localObject1).c();
      if (bool)
      {
        this.e = null;
        this.d = null;
      }
    }
  }
  
  public b.a.a.a.f a()
  {
    Object localObject = this.c;
    if (localObject == null) {
      c();
    }
    localObject = this.c;
    if (localObject == null)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>("No more header elements available");
      throw ((Throwable)localObject);
    }
    localObject = this.c;
    this.c = null;
    return (b.a.a.a.f)localObject;
  }
  
  public boolean hasNext()
  {
    b.a.a.a.f localf = this.c;
    if (localf == null) {
      c();
    }
    localf = this.c;
    boolean bool;
    if (localf != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localf = null;
    }
  }
  
  public final Object next()
  {
    return a();
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Remove not supported");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */