package b.a.a.a.i.d;

import b.a.a.a.f;
import b.a.a.a.f.b;
import b.a.a.a.f.h;
import b.a.a.a.f.l;
import b.a.a.a.f.n;
import b.a.a.a.k.u;
import b.a.a.a.o.a;
import java.util.Iterator;
import java.util.List;

public class k
  implements h
{
  private final String[] a;
  private final boolean b;
  private ae c;
  private x d;
  private m e;
  
  public k()
  {
    this(null, false);
  }
  
  public k(String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null) {}
    for (String[] arrayOfString = null;; arrayOfString = (String[])paramArrayOfString.clone())
    {
      this.a = arrayOfString;
      this.b = paramBoolean;
      return;
    }
  }
  
  private ae c()
  {
    ae localae = this.c;
    if (localae == null)
    {
      localae = new b/a/a/a/i/d/ae;
      String[] arrayOfString = this.a;
      boolean bool = this.b;
      localae.<init>(arrayOfString, bool);
      this.c = localae;
    }
    return this.c;
  }
  
  private x d()
  {
    x localx = this.d;
    if (localx == null)
    {
      localx = new b/a/a/a/i/d/x;
      String[] arrayOfString = this.a;
      boolean bool = this.b;
      localx.<init>(arrayOfString, bool);
      this.d = localx;
    }
    return this.d;
  }
  
  private m e()
  {
    m localm = this.e;
    if (localm == null)
    {
      localm = new b/a/a/a/i/d/m;
      String[] arrayOfString = this.a;
      localm.<init>(arrayOfString);
      this.e = localm;
    }
    return this.e;
  }
  
  public int a()
  {
    return c().a();
  }
  
  public List a(b.a.a.a.e parame, b.a.a.a.f.e parame1)
  {
    boolean bool1 = true;
    a.a(parame, "Header");
    a.a(parame1, "Cookie origin");
    f[] arrayOff = parame.e();
    int i = arrayOff.length;
    int j = 0;
    t localt = null;
    int k = 0;
    b.a.a.a.o.d locald = null;
    boolean bool2 = false;
    Object localObject1 = null;
    while (j < i)
    {
      Object localObject2 = arrayOff[j];
      Object localObject3 = ((f)localObject2).a("version");
      if (localObject3 != null) {
        bool2 = bool1;
      }
      localObject3 = "expires";
      localObject2 = ((f)localObject2).a((String)localObject3);
      if (localObject2 != null) {
        k = bool1;
      }
      j += 1;
    }
    int m;
    Object localObject4;
    if ((k != 0) || (!bool2))
    {
      localt = t.a;
      bool2 = parame instanceof b.a.a.a.d;
      if (bool2)
      {
        localObject1 = parame;
        locald = ((b.a.a.a.d)parame).a();
        localObject1 = new b/a/a/a/k/u;
        parame = (b.a.a.a.d)parame;
        m = parame.b();
        i = locald.c();
        ((u)localObject1).<init>(m, i);
        localObject4 = new f[bool1];
        localObject1 = localt.a(locald, (u)localObject1);
        localObject4[0] = localObject1;
        localObject1 = e().a((f[])localObject4, parame1);
      }
    }
    for (;;)
    {
      return (List)localObject1;
      localObject1 = parame.d();
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/f/l;
        ((l)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      locald = new b/a/a/a/o/d;
      m = ((String)localObject1).length();
      locald.<init>(m);
      locald.a((String)localObject1);
      localObject1 = new b/a/a/a/k/u;
      m = locald.c();
      ((u)localObject1).<init>(0, m);
      break;
      localObject1 = "Set-Cookie2";
      localObject4 = parame.c();
      bool2 = ((String)localObject1).equals(localObject4);
      if (bool2) {
        localObject1 = c().a(arrayOff, parame1);
      } else {
        localObject1 = d().a(arrayOff, parame1);
      }
    }
  }
  
  public List a(List paramList)
  {
    Object localObject = "List of cookies";
    a.a(paramList, (String)localObject);
    boolean bool1 = true;
    Iterator localIterator = paramList.iterator();
    int j = -1 >>> 1;
    boolean bool2 = bool1;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (b)localIterator.next();
      boolean bool3 = localObject instanceof n;
      if (!bool3) {
        bool2 = false;
      }
      int k = ((b)localObject).j();
      if (k >= j) {
        break label143;
      }
    }
    label143:
    for (int i = ((b)localObject).j();; i = j)
    {
      j = i;
      break;
      if (j > 0) {
        if (bool2) {
          localObject = c().a(paramList);
        }
      }
      for (;;)
      {
        return (List)localObject;
        localObject = d().a(paramList);
        continue;
        localObject = e().a(paramList);
      }
    }
  }
  
  public void a(b paramb, b.a.a.a.f.e parame)
  {
    a.a(paramb, "Cookie");
    Object localObject = "Cookie origin";
    a.a(parame, (String)localObject);
    int i = paramb.j();
    if (i > 0)
    {
      boolean bool = paramb instanceof n;
      if (bool)
      {
        localObject = c();
        ((ae)localObject).a((b)paramb, parame);
      }
    }
    for (;;)
    {
      return;
      localObject = d();
      ((x)localObject).a(paramb, parame);
      continue;
      localObject = e();
      ((m)localObject).a(paramb, parame);
    }
  }
  
  public b.a.a.a.e b()
  {
    return c().b();
  }
  
  public boolean b(b paramb, b.a.a.a.f.e parame)
  {
    a.a(paramb, "Cookie");
    Object localObject = "Cookie origin";
    a.a(parame, (String)localObject);
    int i = paramb.j();
    boolean bool;
    if (i > 0)
    {
      bool = paramb instanceof n;
      if (bool)
      {
        localObject = c();
        bool = ((ae)localObject).b((b)paramb, parame);
      }
    }
    for (;;)
    {
      return bool;
      localObject = d();
      bool = ((x)localObject).b(paramb, parame);
      continue;
      localObject = e();
      bool = ((m)localObject).b(paramb, parame);
    }
  }
  
  public String toString()
  {
    return "best-match";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */