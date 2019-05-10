package b.a.a.a.i.c;

import b.a.a.a.m;
import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.q;
import java.net.InetAddress;

public class i
  implements b.a.a.a.e.b.d
{
  protected final b.a.a.a.e.c.i a;
  
  public i(b.a.a.a.e.c.i parami)
  {
    a.a(parami, "Scheme registry");
    this.a = parami;
  }
  
  public b.a.a.a.e.b.b a(n paramn, q paramq, b.a.a.a.n.e parame)
  {
    a.a(paramq, "HTTP request");
    Object localObject1 = b.a.a.a.e.a.d.b(paramq.getParams());
    if (localObject1 != null) {}
    for (;;)
    {
      return (b.a.a.a.e.b.b)localObject1;
      b.a.a.a.o.b.a(paramn, "Target host");
      Object localObject3 = b.a.a.a.e.a.d.c(paramq.getParams());
      localObject1 = paramq.getParams();
      n localn = b.a.a.a.e.a.d.a((b.a.a.a.l.e)localObject1);
      boolean bool;
      try
      {
        localObject1 = this.a;
        String str = paramn.c();
        localObject1 = ((b.a.a.a.e.c.i)localObject1).a(str);
        bool = ((b.a.a.a.e.c.e)localObject1).d();
        if (localn == null)
        {
          localObject1 = new b/a/a/a/e/b/b;
          ((b.a.a.a.e.b.b)localObject1).<init>(paramn, (InetAddress)localObject3, bool);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        localObject3 = new b/a/a/a/m;
        localObject2 = localIllegalStateException.getMessage();
        ((m)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      Object localObject2 = new b/a/a/a/e/b/b;
      ((b.a.a.a.e.b.b)localObject2).<init>(paramn, (InetAddress)localObject3, localn, bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */