package b.a.a.a.i.b;

import b.a.a.a.a.c;
import b.a.a.a.e.r;
import b.a.a.a.e.s;
import b.a.a.a.i.c.j;
import b.a.a.a.n;
import java.util.HashMap;

public class d
  implements b.a.a.a.b.a
{
  private final HashMap a;
  private final r b;
  
  public d()
  {
    this(null);
  }
  
  public d(r paramr)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
    if (paramr != null) {}
    for (;;)
    {
      this.b = paramr;
      return;
      paramr = j.a;
    }
  }
  
  public c a(n paramn)
  {
    b.a.a.a.o.a.a(paramn, "HTTP host");
    HashMap localHashMap = this.a;
    n localn = c(paramn);
    return (c)localHashMap.get(localn);
  }
  
  public void a(n paramn, c paramc)
  {
    b.a.a.a.o.a.a(paramn, "HTTP host");
    HashMap localHashMap = this.a;
    n localn = c(paramn);
    localHashMap.put(localn, paramc);
  }
  
  public void b(n paramn)
  {
    b.a.a.a.o.a.a(paramn, "HTTP host");
    HashMap localHashMap = this.a;
    n localn = c(paramn);
    localHashMap.remove(localn);
  }
  
  protected n c(n paramn)
  {
    int i = paramn.b();
    if (i <= 0) {}
    try
    {
      Object localObject = this.b;
      int j = ((r)localObject).a(paramn);
      localObject = new b/a/a/a/n;
      String str1 = paramn.a();
      String str2 = paramn.c();
      ((n)localObject).<init>(str1, j, str2);
      paramn = (n)localObject;
    }
    catch (s locals)
    {
      for (;;) {}
    }
    return paramn;
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */