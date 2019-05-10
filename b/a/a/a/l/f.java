package b.a.a.a.l;

import b.a.a.a.ac;
import b.a.a.a.n.d;
import b.a.a.a.o.a;
import b.a.a.a.v;
import java.nio.charset.Charset;

public final class f
{
  public static String a(e parame)
  {
    a.a(parame, "HTTP parameters");
    String str = (String)parame.a("http.protocol.element-charset");
    if (str == null) {
      str = d.b.name();
    }
    return str;
  }
  
  public static void a(e parame, ac paramac)
  {
    a.a(parame, "HTTP parameters");
    parame.a("http.protocol.version", paramac);
  }
  
  public static void a(e parame, String paramString)
  {
    a.a(parame, "HTTP parameters");
    parame.a("http.protocol.content-charset", paramString);
  }
  
  public static ac b(e parame)
  {
    a.a(parame, "HTTP parameters");
    Object localObject = parame.a("http.protocol.version");
    if (localObject == null) {}
    for (localObject = v.c;; localObject = (ac)localObject) {
      return (ac)localObject;
    }
  }
  
  public static void b(e parame, String paramString)
  {
    a.a(parame, "HTTP parameters");
    parame.a("http.useragent", paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\l\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */