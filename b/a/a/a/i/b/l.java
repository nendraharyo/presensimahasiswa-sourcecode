package b.a.a.a.i.b;

import b.a.a.a.b.k;
import b.a.a.a.n.e;
import b.a.a.a.q;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class l
  implements k
{
  public static final l a;
  private final int b;
  private final boolean c;
  private final Set d;
  
  static
  {
    l locall = new b/a/a/a/i/b/l;
    locall.<init>();
    a = locall;
  }
  
  public l()
  {
    this(3, false);
  }
  
  public l(int paramInt, boolean paramBoolean)
  {
    this(paramInt, paramBoolean, (Collection)localObject);
  }
  
  protected l(int paramInt, boolean paramBoolean, Collection paramCollection)
  {
    this.b = paramInt;
    this.c = paramBoolean;
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.d = ((Set)localObject);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Class)localIterator.next();
      Set localSet = this.d;
      localSet.add(localObject);
    }
  }
  
  protected boolean a(q paramq)
  {
    boolean bool = paramq instanceof b.a.a.a.l;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected boolean b(q paramq)
  {
    boolean bool1 = paramq instanceof w;
    if (bool1) {
      paramq = (w)paramq;
    }
    for (Object localObject = paramq.c();; localObject = paramq)
    {
      boolean bool2 = localObject instanceof b.a.a.a.b.c.l;
      if (bool2)
      {
        localObject = (b.a.a.a.b.c.l)localObject;
        bool1 = ((b.a.a.a.b.c.l)localObject).isAborted();
        if (bool1) {
          bool1 = true;
        }
      }
      for (;;)
      {
        return bool1;
        bool1 = false;
        localObject = null;
      }
    }
  }
  
  public boolean retryRequest(IOException paramIOException, int paramInt, e parame)
  {
    boolean bool1 = true;
    b.a.a.a.o.a.a(paramIOException, "Exception parameter");
    Object localObject1 = "HTTP context";
    b.a.a.a.o.a.a(parame, (String)localObject1);
    int i = this.b;
    if (paramInt > i)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = this.d;
      Object localObject2 = paramIOException.getClass();
      boolean bool2 = ((Set)localObject1).contains(localObject2);
      if (bool2)
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = this.d;
        localObject2 = ((Set)localObject1).iterator();
        do
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (Class)((Iterator)localObject2).next();
          bool2 = ((Class)localObject1).isInstance(paramIOException);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        localObject1 = b.a.a.a.b.e.a.a(parame);
        localObject2 = ((b.a.a.a.b.e.a)localObject1).m();
        boolean bool3 = b((q)localObject2);
        if (bool3)
        {
          bool2 = false;
          localObject1 = null;
        }
        else
        {
          boolean bool4 = a((q)localObject2);
          if (bool4)
          {
            bool2 = bool1;
          }
          else
          {
            bool2 = ((b.a.a.a.b.e.a)localObject1).n();
            if (bool2)
            {
              bool2 = this.c;
              if (!bool2) {}
            }
            else
            {
              bool2 = bool1;
              continue;
            }
            bool2 = false;
            localObject1 = null;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */