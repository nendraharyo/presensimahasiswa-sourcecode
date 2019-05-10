package b.a.a.a.i.c;

import b.a.a.a.e.b.f;
import b.a.a.a.e.q;
import b.a.a.a.n;

public abstract class c
  extends a
{
  protected volatile b a;
  
  protected c(b.a.a.a.e.b paramb, b paramb1)
  {
    super(paramb, localq);
    this.a = paramb1;
  }
  
  public void a(b.a.a.a.e.b.b paramb, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    b localb = q();
    a(localb);
    localb.a(paramb, parame, parame1);
  }
  
  protected void a(b paramb)
  {
    boolean bool = o();
    if ((bool) || (paramb == null))
    {
      e locale = new b/a/a/a/i/c/e;
      locale.<init>();
      throw locale;
    }
  }
  
  public void a(b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    b localb = q();
    a(localb);
    localb.a(parame, parame1);
  }
  
  public void a(n paramn, boolean paramBoolean, b.a.a.a.l.e parame)
  {
    b localb = q();
    a(localb);
    localb.a(paramn, paramBoolean, parame);
  }
  
  public void a(Object paramObject)
  {
    b localb = q();
    a(localb);
    localb.a(paramObject);
  }
  
  public void a(boolean paramBoolean, b.a.a.a.l.e parame)
  {
    b localb = q();
    a(localb);
    localb.a(paramBoolean, parame);
  }
  
  public void close()
  {
    Object localObject = q();
    if (localObject != null) {
      ((b)localObject).b();
    }
    localObject = m();
    if (localObject != null) {
      ((q)localObject).close();
    }
  }
  
  public void e()
  {
    Object localObject = q();
    if (localObject != null) {
      ((b)localObject).b();
    }
    localObject = m();
    if (localObject != null) {
      ((q)localObject).e();
    }
  }
  
  public b.a.a.a.e.b.b h()
  {
    Object localObject = q();
    a((b)localObject);
    f localf = ((b)localObject).e;
    if (localf == null) {}
    for (localObject = null;; localObject = ((b)localObject).e.j()) {
      return (b.a.a.a.e.b.b)localObject;
    }
  }
  
  protected void l()
  {
    Object localObject1 = null;
    try
    {
      this.a = null;
      super.l();
      return;
    }
    finally {}
  }
  
  protected b q()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */