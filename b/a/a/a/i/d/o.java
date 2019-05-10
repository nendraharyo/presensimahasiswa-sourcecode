package b.a.a.a.i.d;

import b.a.a.a.f.l;
import b.a.a.a.f.m;

public class o
  extends a
{
  public void a(m paramm, String paramString)
  {
    Object localObject = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject);
    if (paramString == null)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Missing value for version attribute");
      throw ((Throwable)localObject);
    }
    int i = 0;
    localObject = null;
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    paramm.a(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */