package b.a.a.a.i;

import b.a.a.a.af;
import b.a.a.a.i.f.j;
import b.a.a.a.j.f;
import b.a.a.a.j.g;
import b.a.a.a.k;
import b.a.a.a.l;
import b.a.a.a.q;
import b.a.a.a.s;
import b.a.a.a.t;
import java.io.IOException;
import java.net.SocketTimeoutException;

public abstract class a
  implements b.a.a.a.i
{
  private final b.a.a.a.i.e.b a;
  private final b.a.a.a.i.e.a b;
  private f c = null;
  private g d = null;
  private b.a.a.a.j.b e = null;
  private b.a.a.a.j.c f = null;
  private b.a.a.a.j.d g = null;
  private e h = null;
  
  public a()
  {
    Object localObject = m();
    this.a = ((b.a.a.a.i.e.b)localObject);
    localObject = l();
    this.b = ((b.a.a.a.i.e.a)localObject);
  }
  
  protected e a(b.a.a.a.j.e parame1, b.a.a.a.j.e parame2)
  {
    e locale = new b/a/a/a/i/e;
    locale.<init>(parame1, parame2);
    return locale;
  }
  
  protected b.a.a.a.j.c a(f paramf, t paramt, b.a.a.a.l.e parame)
  {
    b.a.a.a.i.f.i locali = new b/a/a/a/i/f/i;
    locali.<init>(paramf, null, paramt, parame);
    return locali;
  }
  
  protected b.a.a.a.j.d a(g paramg, b.a.a.a.l.e parame)
  {
    j localj = new b/a/a/a/i/f/j;
    localj.<init>(paramg, null, parame);
    return localj;
  }
  
  public s a()
  {
    j();
    s locals = (s)this.f.a();
    Object localObject = locals.a();
    int i = ((af)localObject).b();
    int j = 200;
    if (i >= j)
    {
      localObject = this.h;
      ((e)localObject).b();
    }
    return locals;
  }
  
  protected void a(f paramf, g paramg, b.a.a.a.l.e parame)
  {
    Object localObject = (f)b.a.a.a.o.a.a(paramf, "Input session buffer");
    this.c = ((f)localObject);
    localObject = (g)b.a.a.a.o.a.a(paramg, "Output session buffer");
    this.d = ((g)localObject);
    boolean bool = paramf instanceof b.a.a.a.j.b;
    if (bool)
    {
      localObject = paramf;
      localObject = (b.a.a.a.j.b)paramf;
      this.e = ((b.a.a.a.j.b)localObject);
    }
    localObject = n();
    localObject = a((f)paramf, (t)localObject, parame);
    this.f = ((b.a.a.a.j.c)localObject);
    localObject = a(paramg, parame);
    this.g = ((b.a.a.a.j.d)localObject);
    localObject = ((f)paramf).b();
    b.a.a.a.j.e locale = paramg.b();
    localObject = a((b.a.a.a.j.e)localObject, locale);
    this.h = ((e)localObject);
  }
  
  public void a(l paraml)
  {
    b.a.a.a.o.a.a(paraml, "HTTP request");
    j();
    Object localObject = paraml.getEntity();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.a;
      g localg = this.d;
      k localk = paraml.getEntity();
      ((b.a.a.a.i.e.b)localObject).a(localg, paraml, localk);
    }
  }
  
  public void a(q paramq)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    j();
    this.g.b(paramq);
    this.h.a();
  }
  
  public void a(s params)
  {
    b.a.a.a.o.a.a(params, "HTTP response");
    j();
    Object localObject = this.b;
    f localf = this.c;
    localObject = ((b.a.a.a.i.e.a)localObject).b(localf, params);
    params.a((k)localObject);
  }
  
  public boolean a(int paramInt)
  {
    j();
    try
    {
      f localf = this.c;
      bool = localf.a(paramInt);
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public void a_()
  {
    j();
    o();
  }
  
  public boolean d()
  {
    boolean bool1 = true;
    boolean bool2 = c();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = p();
      if (!bool2) {
        try
        {
          f localf = this.c;
          int i = 1;
          localf.a(i);
          bool1 = p();
        }
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          bool1 = false;
        }
        catch (IOException localIOException) {}
      }
    }
  }
  
  protected abstract void j();
  
  protected b.a.a.a.i.e.a l()
  {
    b.a.a.a.i.e.a locala = new b/a/a/a/i/e/a;
    b.a.a.a.i.e.c localc = new b/a/a/a/i/e/c;
    localc.<init>();
    locala.<init>(localc);
    return locala;
  }
  
  protected b.a.a.a.i.e.b m()
  {
    b.a.a.a.i.e.b localb = new b/a/a/a/i/e/b;
    b.a.a.a.i.e.d locald = new b/a/a/a/i/e/d;
    locald.<init>();
    localb.<init>(locald);
    return localb;
  }
  
  protected t n()
  {
    return c.a;
  }
  
  protected void o()
  {
    this.d.a();
  }
  
  protected boolean p()
  {
    b.a.a.a.j.b localb = this.e;
    boolean bool;
    if (localb != null)
    {
      localb = this.e;
      bool = localb.c();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */