package b.a.a.a.i;

import b.a.a.a.ad;
import b.a.a.a.af;
import b.a.a.a.k.h;
import b.a.a.a.n.e;
import b.a.a.a.o.a;
import b.a.a.a.s;
import b.a.a.a.t;
import java.util.Locale;

public class c
  implements t
{
  public static final c a;
  protected final ad b;
  
  static
  {
    c localc = new b/a/a/a/i/c;
    localc.<init>();
    a = localc;
  }
  
  public c()
  {
    this(locald);
  }
  
  public c(ad paramad)
  {
    ad localad = (ad)a.a(paramad, "Reason phrase catalog");
    this.b = localad;
  }
  
  public s a(af paramaf, e parame)
  {
    a.a(paramaf, "Status line");
    h localh = new b/a/a/a/k/h;
    ad localad = this.b;
    Locale localLocale = a(parame);
    localh.<init>(paramaf, localad, localLocale);
    return localh;
  }
  
  protected Locale a(e parame)
  {
    return Locale.getDefault();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */