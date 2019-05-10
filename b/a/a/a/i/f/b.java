package b.a.a.a.i.f;

import b.a.a.a.h;
import b.a.a.a.j.g;
import b.a.a.a.k.i;
import b.a.a.a.k.s;
import b.a.a.a.o.a;
import b.a.a.a.p;

public abstract class b
  implements b.a.a.a.j.d
{
  protected final g a;
  protected final b.a.a.a.o.d b;
  protected final s c;
  
  public b(g paramg, s params, b.a.a.a.l.e parame)
  {
    a.a(paramg, "Session input buffer");
    this.a = paramg;
    b.a.a.a.o.d locald = new b/a/a/a/o/d;
    int i = 128;
    locald.<init>(i);
    this.b = locald;
    if (params != null) {}
    for (;;)
    {
      this.c = params;
      return;
      params = i.b;
    }
  }
  
  protected abstract void a(p paramp);
  
  public void b(p paramp)
  {
    a.a(paramp, "HTTP message");
    a(paramp);
    Object localObject1 = paramp.headerIterator();
    for (;;)
    {
      boolean bool = ((h)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = ((h)localObject1).a();
      g localg = this.a;
      s locals = this.c;
      b.a.a.a.o.d locald = this.b;
      localObject2 = locals.a(locald, (b.a.a.a.e)localObject2);
      localg.a((b.a.a.a.o.d)localObject2);
    }
    this.b.a();
    localObject1 = this.a;
    Object localObject2 = this.b;
    ((g)localObject1).a((b.a.a.a.o.d)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */