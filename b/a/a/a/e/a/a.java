package b.a.a.a.e.a;

import b.a.a.a.l.e;

public final class a
{
  private static final b a;
  
  static
  {
    a.1 local1 = new b/a/a/a/e/a/a$1;
    local1.<init>();
    a = local1;
  }
  
  public static b a(e parame)
  {
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    b localb = (b)parame.a("http.conn-manager.max-per-route");
    if (localb == null) {
      localb = a;
    }
    return localb;
  }
  
  public static void a(e parame, int paramInt)
  {
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    parame.b("http.conn-manager.max-total", paramInt);
  }
  
  public static void a(e parame, long paramLong)
  {
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    parame.b("http.conn-manager.timeout", paramLong);
  }
  
  public static void a(e parame, b paramb)
  {
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    parame.a("http.conn-manager.max-per-route", paramb);
  }
  
  public static int b(e parame)
  {
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    return parame.a("http.conn-manager.max-total", 20);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */