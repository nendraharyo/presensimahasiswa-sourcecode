package b.a.a.a.e.b;

import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.net.InetAddress;

public final class f
  implements e, Cloneable
{
  private final n a;
  private final InetAddress b;
  private boolean c;
  private n[] d;
  private e.b e;
  private e.a f;
  private boolean g;
  
  public f(b paramb)
  {
    this(localn, localInetAddress);
  }
  
  public f(n paramn, InetAddress paramInetAddress)
  {
    a.a(paramn, "Target host");
    this.a = paramn;
    this.b = paramInetAddress;
    Object localObject = e.b.a;
    this.e = ((e.b)localObject);
    localObject = e.a.a;
    this.f = ((e.a)localObject);
  }
  
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
        break label61;
      }
    }
    label61:
    for (localObject = this.d[paramInt];; localObject = this.a)
    {
      return (n)localObject;
      j = 0;
      localObject = null;
      break;
    }
  }
  
  public final void a(n paramn, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject = "Proxy host";
    a.a(paramn, (String)localObject);
    boolean bool2 = this.c;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      b.a.a.a.o.b.a(bool2, "Already connected");
      this.c = bool1;
      localObject = new n[bool1];
      localObject[0] = paramn;
      this.d = ((n[])localObject);
      this.g = paramBoolean;
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.c;
    if (!bool2) {}
    for (bool2 = bool1;; bool2 = false)
    {
      b.a.a.a.o.b.a(bool2, "Already connected");
      this.c = bool1;
      this.g = paramBoolean;
      return;
    }
  }
  
  public final InetAddress b()
  {
    return this.b;
  }
  
  public final void b(n paramn, boolean paramBoolean)
  {
    a.a(paramn, "Proxy host");
    b.a.a.a.o.b.a(this.c, "No tunnel unless connected");
    b.a.a.a.o.b.a(this.d, "No tunnel without proxy");
    n[] arrayOfn1 = new n[this.d.length + 1];
    n[] arrayOfn2 = this.d;
    int i = this.d.length;
    System.arraycopy(arrayOfn2, 0, arrayOfn1, 0, i);
    int j = arrayOfn1.length + -1;
    arrayOfn1[j] = paramn;
    this.d = arrayOfn1;
    this.g = paramBoolean;
  }
  
  public final void b(boolean paramBoolean)
  {
    b.a.a.a.o.b.a(this.c, "No tunnel unless connected");
    b.a.a.a.o.b.a(this.d, "No tunnel without proxy");
    e.b localb = e.b.b;
    this.e = localb;
    this.g = paramBoolean;
  }
  
  public final int c()
  {
    int i = 0;
    n[] arrayOfn = null;
    boolean bool = this.c;
    if (bool)
    {
      arrayOfn = this.d;
      if (arrayOfn != null) {
        break label26;
      }
    }
    for (i = 1;; i = arrayOfn.length + 1)
    {
      return i;
      label26:
      arrayOfn = this.d;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    b.a.a.a.o.b.a(this.c, "No layered protocol unless connected");
    e.a locala = e.a.b;
    this.f = locala;
    this.g = paramBoolean;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public final n d()
  {
    Object localObject = this.d;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.d[0]) {
      return (n)localObject;
    }
  }
  
  public final boolean e()
  {
    e.b localb1 = this.e;
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
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof f;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (f)paramObject;
        bool2 = this.c;
        boolean bool3 = ((f)paramObject).c;
        if (bool2 == bool3)
        {
          bool2 = this.g;
          bool3 = ((f)paramObject).g;
          if (bool2 == bool3)
          {
            Object localObject1 = this.e;
            Object localObject2 = ((f)paramObject).e;
            if (localObject1 == localObject2)
            {
              localObject1 = this.f;
              localObject2 = ((f)paramObject).f;
              if (localObject1 == localObject2)
              {
                localObject1 = this.a;
                localObject2 = ((f)paramObject).a;
                bool2 = g.a(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.b;
                  localObject2 = ((f)paramObject).b;
                  bool2 = g.a(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = this.d;
                    localObject2 = ((f)paramObject).d;
                    bool2 = g.a((Object[])localObject1, (Object[])localObject2);
                    if (bool2) {
                      continue;
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final boolean f()
  {
    e.a locala1 = this.f;
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
    return this.g;
  }
  
  public void h()
  {
    this.c = false;
    this.d = null;
    Object localObject = e.b.a;
    this.e = ((e.b)localObject);
    localObject = e.a.a;
    this.f = ((e.a)localObject);
    this.g = false;
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    int i = g.a(17, localObject);
    localObject = this.b;
    i = g.a(i, localObject);
    localObject = this.d;
    if (localObject != null)
    {
      n[] arrayOfn = this.d;
      int j = arrayOfn.length;
      int k = 0;
      localObject = null;
      while (k < j)
      {
        n localn = arrayOfn[k];
        int m = g.a(i, localn);
        k += 1;
        i = m;
      }
    }
    boolean bool = this.c;
    i = g.a(i, bool);
    bool = this.g;
    i = g.a(i, bool);
    localObject = this.e;
    i = g.a(i, localObject);
    localObject = this.f;
    return g.a(i, localObject);
  }
  
  public final boolean i()
  {
    return this.c;
  }
  
  public final b j()
  {
    boolean bool1 = this.c;
    b localb;
    if (!bool1)
    {
      bool1 = false;
      localb = null;
    }
    for (;;)
    {
      return localb;
      localb = new b/a/a/a/e/b/b;
      n localn = this.a;
      InetAddress localInetAddress = this.b;
      n[] arrayOfn = this.d;
      boolean bool2 = this.g;
      e.b localb1 = this.e;
      e.a locala = this.f;
      localb.<init>(localn, localInetAddress, arrayOfn, bool2, localb1, locala);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = c() * 30 + 50;
    localStringBuilder.<init>(i);
    localStringBuilder.append("RouteTracker[");
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      localStringBuilder.append(localObject1);
      localObject1 = "->";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append('{');
    boolean bool1 = this.c;
    char c1;
    if (bool1)
    {
      c1 = 'c';
      localStringBuilder.append(c1);
    }
    localObject1 = this.e;
    Object localObject2 = e.b.b;
    if (localObject1 == localObject2)
    {
      c1 = 't';
      localStringBuilder.append(c1);
    }
    localObject1 = this.f;
    localObject2 = e.a.b;
    if (localObject1 == localObject2)
    {
      c1 = 'l';
      localStringBuilder.append(c1);
    }
    boolean bool2 = this.g;
    int j;
    if (bool2)
    {
      j = 115;
      localStringBuilder.append(j);
    }
    localStringBuilder.append("}->");
    localObject1 = this.d;
    if (localObject1 != null)
    {
      localObject2 = this.d;
      int m = localObject2.length;
      j = 0;
      localObject1 = null;
      while (j < m)
      {
        Object localObject3 = localObject2[j];
        localStringBuilder.append(localObject3);
        localObject3 = "->";
        localStringBuilder.append((String)localObject3);
        int k;
        j += 1;
      }
    }
    localObject1 = this.a;
    localStringBuilder.append(localObject1);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\b\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */