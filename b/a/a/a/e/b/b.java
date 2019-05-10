package b.a.a.a.e.b;

import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  implements e, Cloneable
{
  private final n a;
  private final InetAddress b;
  private final List c;
  private final e.b d;
  private final e.a e;
  private final boolean f;
  
  public b(n paramn)
  {
    this(paramn, null, localList, false, localb, locala);
  }
  
  public b(n paramn1, InetAddress paramInetAddress, n paramn2, boolean paramBoolean) {}
  
  private b(n paramn, InetAddress paramInetAddress, List paramList, boolean paramBoolean, e.b paramb, e.a parama)
  {
    Object localObject = "Target host";
    a.a(paramn, (String)localObject);
    this.a = paramn;
    this.b = paramInetAddress;
    boolean bool;
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>(paramList);
        this.c = ((List)localObject);
        localObject = e.b.b;
        if (paramb == localObject)
        {
          localObject = this.c;
          if (localObject == null) {
            break label139;
          }
          bool = true;
          label85:
          String str = "Proxy required if tunnelled";
          a.a(bool, str);
        }
        this.f = paramBoolean;
        if (paramb == null) {
          break label148;
        }
        label107:
        this.d = paramb;
        if (parama == null) {
          break label156;
        }
      }
    }
    for (;;)
    {
      this.e = parama;
      return;
      bool = false;
      localObject = null;
      this.c = null;
      break;
      label139:
      bool = false;
      localObject = null;
      break label85;
      label148:
      paramb = e.b.a;
      break label107;
      label156:
      parama = e.a.a;
    }
  }
  
  public b(n paramn, InetAddress paramInetAddress, boolean paramBoolean)
  {
    this(paramn, paramInetAddress, localList, paramBoolean, localb, locala);
  }
  
  public b(n paramn, InetAddress paramInetAddress, n[] paramArrayOfn, boolean paramBoolean, e.b paramb, e.a parama) {}
  
  public final n a()
  {
    return this.a;
  }
  
  public final n a(int paramInt)
  {
    Object localObject = "Hop index";
    a.b(paramInt, (String)localObject);
    int i = c();
    int j;
    if (paramInt < i)
    {
      boolean bool = true;
      String str = "Hop index exceeds tracked route length";
      a.a(bool, str);
      j = i + -1;
      if (paramInt >= j) {
        break label68;
      }
    }
    label68:
    for (localObject = (n)this.c.get(paramInt);; localObject = this.a)
    {
      return (n)localObject;
      j = 0;
      localObject = null;
      break;
    }
  }
  
  public final InetAddress b()
  {
    return this.b;
  }
  
  public final int c()
  {
    List localList = this.c;
    if (localList != null) {
      localList = this.c;
    }
    for (int i = localList.size() + 1;; i = 1) {
      return i;
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public final n d()
  {
    Object localObject = this.c;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.c;
      bool = ((List)localObject).isEmpty();
      if (bool) {}
    }
    for (localObject = (n)this.c.get(0);; localObject = null)
    {
      return (n)localObject;
      bool = false;
    }
  }
  
  public final boolean e()
  {
    e.b localb1 = this.d;
    e.b localb2 = e.b.b;
    boolean bool;
    if (localb1 == localb2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb1 = null;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof b;
      if (bool2)
      {
        paramObject = (b)paramObject;
        bool2 = this.f;
        boolean bool3 = ((b)paramObject).f;
        if (bool2 == bool3)
        {
          Object localObject1 = this.d;
          Object localObject2 = ((b)paramObject).d;
          if (localObject1 == localObject2)
          {
            localObject1 = this.e;
            localObject2 = ((b)paramObject).e;
            if (localObject1 == localObject2)
            {
              localObject1 = this.a;
              localObject2 = ((b)paramObject).a;
              bool2 = g.a(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.b;
                localObject2 = ((b)paramObject).b;
                bool2 = g.a(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.c;
                  localObject2 = ((b)paramObject).c;
                  bool2 = g.a(localObject1, localObject2);
                  if (bool2) {
                    continue;
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final boolean f()
  {
    e.a locala1 = this.e;
    e.a locala2 = e.a.b;
    boolean bool;
    if (locala1 == locala2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala1 = null;
    }
  }
  
  public final boolean g()
  {
    return this.f;
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    int i = g.a(17, localObject);
    localObject = this.b;
    i = g.a(i, localObject);
    localObject = this.c;
    int j;
    if (localObject != null)
    {
      localObject = this.c;
      Iterator localIterator = ((List)localObject).iterator();
      for (m = i;; m = j)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        n localn = (n)localIterator.next();
        j = g.a(m, localn);
      }
    }
    int m = j;
    boolean bool2 = this.f;
    int k = g.a(m, bool2);
    localObject = this.d;
    k = g.a(k, localObject);
    localObject = this.e;
    return g.a(k, localObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = c() * 30 + 50;
    localStringBuilder.<init>(i);
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      localStringBuilder.append(localObject1);
      localObject1 = "->";
      localStringBuilder.append((String)localObject1);
    }
    i = 123;
    localStringBuilder.append(i);
    localObject1 = this.d;
    Object localObject2 = e.b.b;
    char c1;
    if (localObject1 == localObject2)
    {
      c1 = 't';
      localStringBuilder.append(c1);
    }
    localObject1 = this.e;
    localObject2 = e.a.b;
    if (localObject1 == localObject2)
    {
      c1 = 'l';
      localStringBuilder.append(c1);
    }
    boolean bool1 = this.f;
    if (bool1)
    {
      char c2 = 's';
      localStringBuilder.append(c2);
    }
    localStringBuilder.append("}->");
    localObject1 = this.c;
    if (localObject1 != null)
    {
      localObject1 = this.c;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (n)((Iterator)localObject2).next();
        localStringBuilder.append(localObject1);
        localObject1 = "->";
        localStringBuilder.append((String)localObject1);
      }
    }
    localObject1 = this.a;
    localStringBuilder.append(localObject1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\b\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */