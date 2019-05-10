package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import b.a.a.a.f.n;

public class ag
  implements c
{
  public void a(b paramb, e parame)
  {
    Object localObject = "Cookie";
    b.a.a.a.o.a.a(paramb, (String)localObject);
    boolean bool = paramb instanceof n;
    if (bool)
    {
      bool = paramb instanceof b.a.a.a.f.a;
      if (bool)
      {
        paramb = (b.a.a.a.f.a)paramb;
        localObject = "version";
        bool = paramb.b((String)localObject);
        if (!bool)
        {
          localObject = new b/a/a/a/f/g;
          ((g)localObject).<init>("Violates RFC 2965. Version attribute is required.");
          throw ((Throwable)localObject);
        }
      }
    }
  }
  
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
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i;
      for (;;)
      {
        i = -1;
      }
      paramm.a(i);
    }
    if (i < 0)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Invalid cookie version.");
      throw ((Throwable)localObject);
    }
  }
  
  public boolean b(b paramb, e parame)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */