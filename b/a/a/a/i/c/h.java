package b.a.a.a.i.c;

import b.a.a.a.ab;
import b.a.a.a.af;
import b.a.a.a.h.b;
import b.a.a.a.j.f;
import b.a.a.a.k.u;
import b.a.a.a.l.e;
import b.a.a.a.o.d;
import b.a.a.a.s;
import b.a.a.a.z;

public class h
  extends b.a.a.a.i.f.a
{
  public b a;
  private final b.a.a.a.t c;
  private final d d;
  
  public h(f paramf, b.a.a.a.k.t paramt, b.a.a.a.t paramt1, e parame)
  {
    super(paramf, paramt, parame);
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b)localObject).<init>(localClass);
    this.a = ((b)localObject);
    b.a.a.a.o.a.a(paramt1, "Response factory");
    this.c = paramt1;
    localObject = new b/a/a/a/o/d;
    ((d)localObject).<init>(128);
    this.d = ((d)localObject);
  }
  
  protected s a(f paramf)
  {
    d locald1 = null;
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      this.d.a();
      Object localObject2 = this.d;
      int k = paramf.a((d)localObject2);
      if ((k == i) && (j == 0))
      {
        localObject1 = new b/a/a/a/z;
        ((z)localObject1).<init>("The target server failed to respond");
        throw ((Throwable)localObject1);
      }
      Object localObject3 = new b/a/a/a/k/u;
      int m = this.d.c();
      ((u)localObject3).<init>(0, m);
      Object localObject4 = this.b;
      d locald2 = this.d;
      boolean bool2 = ((b.a.a.a.k.t)localObject4).b(locald2, (u)localObject3);
      if (bool2)
      {
        localObject1 = this.b;
        locald1 = this.d;
        localObject1 = ((b.a.a.a.k.t)localObject1).c(locald1, (u)localObject3);
        return this.c.a((af)localObject1, null);
      }
      if (k != i)
      {
        localObject2 = this.d;
        bool1 = a((d)localObject2, j);
        if (!bool1) {}
      }
      else
      {
        localObject1 = new b/a/a/a/ab;
        ((ab)localObject1).<init>("The server failed to respond with a valid HTTP response");
        throw ((Throwable)localObject1);
      }
      localObject2 = this.a;
      boolean bool1 = ((b)localObject2).a();
      if (bool1)
      {
        localObject2 = this.a;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Garbage in response: ");
        localObject4 = this.d.toString();
        localObject3 = (String)localObject4;
        ((b)localObject2).a(localObject3);
      }
      j += 1;
    }
  }
  
  protected boolean a(d paramd, int paramInt)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */