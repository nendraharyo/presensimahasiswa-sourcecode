package b.a.a.a.i.e;

import b.a.a.a.g.d;
import b.a.a.a.i.f.f;
import b.a.a.a.i.f.h;
import b.a.a.a.i.f.m;
import b.a.a.a.j.g;
import b.a.a.a.k;
import b.a.a.a.o.a;
import b.a.a.a.p;
import java.io.OutputStream;

public class b
{
  private final d a;
  
  public b(d paramd)
  {
    d locald = (d)a.a(paramd, "Content length strategy");
    this.a = locald;
  }
  
  protected OutputStream a(g paramg, p paramp)
  {
    Object localObject = this.a;
    long l1 = ((d)localObject).a(paramp);
    long l2 = -2;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = new b/a/a/a/i/f/f;
      ((f)localObject).<init>(paramg);
    }
    for (;;)
    {
      return (OutputStream)localObject;
      l2 = -1;
      bool = l1 < l2;
      if (!bool)
      {
        localObject = new b/a/a/a/i/f/m;
        ((m)localObject).<init>(paramg);
      }
      else
      {
        localObject = new b/a/a/a/i/f/h;
        ((h)localObject).<init>(paramg, l1);
      }
    }
  }
  
  public void a(g paramg, p paramp, k paramk)
  {
    a.a(paramg, "Session output buffer");
    a.a(paramp, "HTTP message");
    a.a(paramk, "HTTP entity");
    OutputStream localOutputStream = a(paramg, paramp);
    paramk.writeTo(localOutputStream);
    localOutputStream.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\e\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */