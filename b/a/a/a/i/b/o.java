package b.a.a.a.i.b;

import b.a.a.a.ae;
import b.a.a.a.b.c.f;
import b.a.a.a.b.c.g;
import b.a.a.a.b.c.l;
import b.a.a.a.b.p;
import b.a.a.a.n.e;
import b.a.a.a.q;
import b.a.a.a.s;
import java.net.URI;

class o
  implements p
{
  private final b.a.a.a.b.o a;
  
  public o(b.a.a.a.b.o paramo)
  {
    this.a = paramo;
  }
  
  public b.a.a.a.b.o a()
  {
    return this.a;
  }
  
  public boolean a(q paramq, s params, e parame)
  {
    return this.a.isRedirectRequested(params, parame);
  }
  
  public l b(q paramq, s params, e parame)
  {
    URI localURI = this.a.getLocationURI(params, parame);
    Object localObject = paramq.getRequestLine().a();
    String str = "HEAD";
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (bool)
    {
      localObject = new b/a/a/a/b/c/g;
      ((g)localObject).<init>(localURI);
    }
    for (;;)
    {
      return (l)localObject;
      localObject = new b/a/a/a/b/c/f;
      ((f)localObject).<init>(localURI);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */