package b.a.a.a.b.d;

import b.a.a.a.b.a.a.a;
import b.a.a.a.l.e;
import b.a.a.a.n;
import java.net.InetAddress;
import java.util.Collection;

public final class a
{
  public static b.a.a.a.b.a.a a(e parame)
  {
    boolean bool1 = true;
    Object localObject = b.a.a.a.b.a.a.g();
    int i = parame.a("http.socket.timeout", 0);
    localObject = ((a.a)localObject).d(i);
    boolean bool2 = parame.a("http.connection.stalecheck", bool1);
    localObject = ((a.a)localObject).b(bool2);
    int j = parame.a("http.connection.timeout", 0);
    localObject = ((a.a)localObject).c(j);
    boolean bool3 = parame.a("http.protocol.expect-continue", false);
    a.a locala = ((a.a)localObject).a(bool3);
    localObject = (n)parame.a("http.route.default-proxy");
    locala = locala.a((n)localObject);
    localObject = (InetAddress)parame.a("http.route.local-address");
    locala = locala.a((InetAddress)localObject);
    localObject = (Collection)parame.a("http.auth.proxy-scheme-pref");
    locala = locala.b((Collection)localObject);
    localObject = (Collection)parame.a("http.auth.target-scheme-pref");
    localObject = locala.a((Collection)localObject);
    bool3 = parame.a("http.protocol.handle-authentication", bool1);
    localObject = ((a.a)localObject).f(bool3);
    bool3 = parame.a("http.protocol.allow-circular-redirects", false);
    localObject = ((a.a)localObject).e(bool3);
    long l = parame.a("http.conn-manager.timeout", 0L);
    int k = (int)l;
    locala = ((a.a)localObject).b(k);
    localObject = (String)parame.a("http.protocol.cookie-policy");
    localObject = locala.a((String)localObject);
    int m = 50;
    k = parame.a("http.protocol.max-redirects", m);
    localObject = ((a.a)localObject).a(k);
    boolean bool4 = parame.a("http.protocol.handle-redirects", bool1);
    locala = ((a.a)localObject).c(bool4);
    localObject = "http.protocol.reject-relative-redirect";
    boolean bool5 = parame.a((String)localObject, false);
    if (!bool5) {
      bool5 = bool1;
    }
    for (;;)
    {
      return locala.d(bool5).a();
      bool5 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\d\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */