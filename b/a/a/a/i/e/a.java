package b.a.a.a.i.e;

import b.a.a.a.g.b;
import b.a.a.a.g.d;
import b.a.a.a.i.f.g;
import b.a.a.a.i.f.l;
import b.a.a.a.j.f;
import b.a.a.a.k;
import b.a.a.a.p;
import java.io.InputStream;

public class a
{
  private final d a;
  
  public a(d paramd)
  {
    d locald = (d)b.a.a.a.o.a.a(paramd, "Content length strategy");
    this.a = locald;
  }
  
  protected b a(f paramf, p paramp)
  {
    long l1 = -1;
    b localb = new b/a/a/a/g/b;
    localb.<init>();
    Object localObject = this.a;
    long l2 = ((d)localObject).a(paramp);
    long l3 = -2;
    boolean bool = l2 < l3;
    if (!bool)
    {
      bool = true;
      localb.a(bool);
      localb.a(l1);
      localObject = new b/a/a/a/i/f/e;
      ((b.a.a.a.i.f.e)localObject).<init>(paramf);
      localb.a((InputStream)localObject);
    }
    for (;;)
    {
      localObject = paramp.getFirstHeader("Content-Type");
      if (localObject != null) {
        localb.a((b.a.a.a.e)localObject);
      }
      localObject = paramp.getFirstHeader("Content-Encoding");
      if (localObject != null) {
        localb.b((b.a.a.a.e)localObject);
      }
      return localb;
      bool = l2 < l1;
      if (!bool)
      {
        localb.a(false);
        localb.a(l1);
        localObject = new b/a/a/a/i/f/l;
        ((l)localObject).<init>(paramf);
        localb.a((InputStream)localObject);
      }
      else
      {
        localb.a(false);
        localb.a(l2);
        localObject = new b/a/a/a/i/f/g;
        ((g)localObject).<init>(paramf, l2);
        localb.a((InputStream)localObject);
      }
    }
  }
  
  public k b(f paramf, p paramp)
  {
    b.a.a.a.o.a.a(paramf, "Session input buffer");
    b.a.a.a.o.a.a(paramp, "HTTP message");
    return a(paramf, paramp);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\e\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */