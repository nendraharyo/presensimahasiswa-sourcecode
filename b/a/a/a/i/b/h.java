package b.a.a.a.i.b;

import b.a.a.a.b.c.c;
import b.a.a.a.b.c.l;
import b.a.a.a.b.f;
import b.a.a.a.b.f.d;
import b.a.a.a.b.j;
import b.a.a.a.h.b;
import b.a.a.a.n;
import b.a.a.a.n.e;
import b.a.a.a.o.a;
import b.a.a.a.q;
import java.io.Closeable;
import java.net.URI;

public abstract class h
  implements j, Closeable
{
  public b b;
  
  public h()
  {
    b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.b = localb;
  }
  
  private static n a(l paraml)
  {
    Object localObject1 = null;
    Object localObject2 = paraml.getURI();
    boolean bool = ((URI)localObject2).isAbsolute();
    if (bool)
    {
      localObject1 = d.b((URI)localObject2);
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/b/f;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "URI does not specify a valid host name: " + localObject2;
        ((f)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    return (n)localObject1;
  }
  
  public c a(l paraml, e parame)
  {
    a.a(paraml, "HTTP request");
    n localn = a(paraml);
    return a(localn, paraml, parame);
  }
  
  protected abstract c a(n paramn, q paramq, e parame);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */