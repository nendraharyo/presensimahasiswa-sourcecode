package b.a.a.a.e.a;

import b.a.a.a.e.b.b;
import b.a.a.a.l.e;
import b.a.a.a.n;
import b.a.a.a.o.a;
import java.net.InetAddress;

public class d
{
  public static final n a;
  public static final b b;
  
  static
  {
    Object localObject = new b/a/a/a/n;
    ((n)localObject).<init>("127.0.0.255", 0, "no-host");
    a = (n)localObject;
    localObject = new b/a/a/a/e/b/b;
    n localn = a;
    ((b)localObject).<init>(localn);
    b = (b)localObject;
  }
  
  public static n a(e parame)
  {
    a.a(parame, "Parameters");
    n localn1 = (n)parame.a("http.route.default-proxy");
    if (localn1 != null)
    {
      n localn2 = a;
      boolean bool = localn2.equals(localn1);
      if (bool) {
        localn1 = null;
      }
    }
    return localn1;
  }
  
  public static b b(e parame)
  {
    a.a(parame, "Parameters");
    b localb1 = (b)parame.a("http.route.forced-route");
    if (localb1 != null)
    {
      b localb2 = b;
      boolean bool = localb2.equals(localb1);
      if (bool) {
        localb1 = null;
      }
    }
    return localb1;
  }
  
  public static InetAddress c(e parame)
  {
    a.a(parame, "Parameters");
    return (InetAddress)parame.a("http.route.local-address");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */