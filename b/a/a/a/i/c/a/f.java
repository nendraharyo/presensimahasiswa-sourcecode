package b.a.a.a.i.c.a;

import b.a.a.a.e.q;
import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class f
{
  public b.a.a.a.h.b a;
  protected final b.a.a.a.e.b.b b;
  protected final int c;
  protected final b.a.a.a.e.a.b d;
  protected final LinkedList e;
  protected final Queue f;
  protected int g;
  
  public f(b.a.a.a.e.b.b paramb, b.a.a.a.e.a.b paramb1)
  {
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b.a.a.a.h.b)localObject).<init>(localClass);
    this.a = ((b.a.a.a.h.b)localObject);
    this.b = paramb;
    this.d = paramb1;
    int i = paramb1.a(paramb);
    this.c = i;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.e = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.f = ((Queue)localObject);
    this.g = 0;
  }
  
  public final b.a.a.a.e.b.b a()
  {
    return this.b;
  }
  
  public b a(Object paramObject)
  {
    Object localObject1 = this.e;
    boolean bool1 = ((LinkedList)localObject1).isEmpty();
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = this.e;
      int j = this.e.size();
      localObject2 = ((LinkedList)localObject1).listIterator(j);
      boolean bool3;
      do
      {
        bool1 = ((ListIterator)localObject2).hasPrevious();
        if (!bool1) {
          break label98;
        }
        localObject1 = (b)((ListIterator)localObject2).previous();
        localObject3 = ((b)localObject1).a();
        if (localObject3 == null) {
          break;
        }
        localObject3 = ((b)localObject1).a();
        bool3 = g.a(paramObject, localObject3);
      } while (!bool3);
      ((ListIterator)localObject2).remove();
    }
    for (;;)
    {
      return (b)localObject1;
      label98:
      int i = d();
      if (i == 0)
      {
        localObject1 = this.e;
        bool2 = ((LinkedList)localObject1).isEmpty();
        if (!bool2)
        {
          localObject1 = (b)this.e.remove();
          ((b)localObject1).b();
          localObject2 = ((b)localObject1).c();
          try
          {
            ((q)localObject2).close();
          }
          catch (IOException localIOException)
          {
            localObject3 = this.a;
            String str = "I/O error closing connection";
            ((b.a.a.a.h.b)localObject3).a(str, localIOException);
          }
          continue;
        }
      }
      boolean bool2 = false;
      localObject1 = null;
    }
  }
  
  public void a(b paramb)
  {
    int i = this.g;
    int j = 1;
    IllegalStateException localIllegalStateException;
    b.a.a.a.e.b.b localb;
    if (i < j)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("No entry created for this pool. ");
      localb = this.b;
      localObject = localb;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    i = this.g;
    Object localObject = this.e;
    j = ((LinkedList)localObject).size();
    if (i <= j)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("No entry allocated from this pool. ");
      localb = this.b;
      localObject = localb;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    this.e.add(paramb);
  }
  
  public void a(h paramh)
  {
    a.a(paramh, "Waiting thread");
    this.f.add(paramh);
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public void b(b paramb)
  {
    b.a.a.a.e.b.b localb1 = this.b;
    b.a.a.a.e.b.b localb2 = paramb.d();
    a.a(localb1.equals(localb2), "Entry not planned for this pool");
    int i = this.g + 1;
    this.g = i;
  }
  
  public void b(h paramh)
  {
    if (paramh == null) {}
    for (;;)
    {
      return;
      Queue localQueue = this.f;
      localQueue.remove(paramh);
    }
  }
  
  public boolean c()
  {
    int i = 1;
    int j = this.g;
    if (j < i)
    {
      Queue localQueue = this.f;
      boolean bool = localQueue.isEmpty();
      if (!bool) {}
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean c(b paramb)
  {
    LinkedList localLinkedList = this.e;
    boolean bool = localLinkedList.remove(paramb);
    if (bool)
    {
      int i = this.g + -1;
      this.g = i;
    }
    return bool;
  }
  
  public int d()
  {
    b.a.a.a.e.a.b localb = this.d;
    b.a.a.a.e.b.b localb1 = this.b;
    int i = localb.a(localb1);
    int j = this.g;
    return i - j;
  }
  
  public void e()
  {
    int i = this.g;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0)
    {
      b.a.a.a.o.b.a(i, "There is no entry that could be dropped");
      j = this.g + -1;
      this.g = j;
      return;
    }
  }
  
  public boolean f()
  {
    Queue localQueue = this.f;
    boolean bool = localQueue.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localQueue = null;
    }
  }
  
  public h g()
  {
    return (h)this.f.peek();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */