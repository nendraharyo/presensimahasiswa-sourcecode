package b.a.a.a.i.b;

import b.a.a.a.a.c;
import b.a.a.a.a.h;
import b.a.a.a.a.m;
import b.a.a.a.b.e.a;
import b.a.a.a.b.r;
import b.a.a.a.e.p;
import b.a.a.a.j;
import b.a.a.a.n.e;
import java.security.Principal;
import javax.net.ssl.SSLSession;

public class q
  implements r
{
  public static final q a;
  
  static
  {
    q localq = new b/a/a/a/i/b/q;
    localq.<init>();
    a = localq;
  }
  
  private static Principal a(h paramh)
  {
    Object localObject = paramh.c();
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = ((c)localObject).d();
      if (bool1)
      {
        bool2 = ((c)localObject).c();
        if (bool2)
        {
          localObject = paramh.d();
          if (localObject == null) {}
        }
      }
    }
    for (localObject = ((m)localObject).a();; localObject = null)
    {
      return (Principal)localObject;
      bool2 = false;
    }
  }
  
  public Object a(e parame)
  {
    Object localObject = a.a(parame);
    Principal localPrincipal = null;
    h localh = ((a)localObject).i();
    if (localh != null)
    {
      localPrincipal = a(localh);
      if (localPrincipal == null) {
        localPrincipal = a(((a)localObject).j());
      }
    }
    if (localPrincipal == null)
    {
      localObject = ((a)localObject).l();
      boolean bool = ((j)localObject).c();
      if (bool)
      {
        bool = localObject instanceof p;
        if (bool)
        {
          localObject = ((p)localObject).k();
          if (localObject == null) {}
        }
      }
    }
    for (localObject = ((SSLSession)localObject).getLocalPrincipal();; localObject = localPrincipal) {
      return localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */