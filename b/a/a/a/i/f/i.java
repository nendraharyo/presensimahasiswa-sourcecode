package b.a.a.a.i.f;

import b.a.a.a.af;
import b.a.a.a.j.f;
import b.a.a.a.k.u;
import b.a.a.a.l.e;
import b.a.a.a.o.d;
import b.a.a.a.s;
import b.a.a.a.z;

public class i
  extends a
{
  private final b.a.a.a.t a;
  private final d c;
  
  public i(f paramf, b.a.a.a.k.t paramt, b.a.a.a.t paramt1, e parame)
  {
    super(paramf, paramt, parame);
    Object localObject = (b.a.a.a.t)b.a.a.a.o.a.a(paramt1, "Response factory");
    this.a = ((b.a.a.a.t)localObject);
    localObject = new b/a/a/a/o/d;
    ((d)localObject).<init>(128);
    this.c = ((d)localObject);
  }
  
  protected s a(f paramf)
  {
    this.c.a();
    Object localObject = this.c;
    int i = paramf.a((d)localObject);
    int j = -1;
    if (i == j)
    {
      localObject = new b/a/a/a/z;
      ((z)localObject).<init>("The target server failed to respond");
      throw ((Throwable)localObject);
    }
    localObject = new b/a/a/a/k/u;
    int k = this.c.c();
    ((u)localObject).<init>(0, k);
    b.a.a.a.k.t localt = this.b;
    d locald = this.c;
    localObject = localt.c(locald, (u)localObject);
    return this.a.a((af)localObject, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */