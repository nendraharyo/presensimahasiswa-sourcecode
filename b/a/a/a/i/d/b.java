package b.a.a.a.i.d;

import b.a.a.a.f.c;
import b.a.a.a.f.h;
import b.a.a.a.o.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class b
  implements h
{
  private final Map a;
  
  public b()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(10);
    this.a = localHashMap;
  }
  
  protected c a(String paramString)
  {
    return (c)this.a.get(paramString);
  }
  
  public void a(String paramString, c paramc)
  {
    a.a(paramString, "Attribute name");
    a.a(paramc, "Attribute handler");
    this.a.put(paramString, paramc);
  }
  
  protected Collection c()
  {
    return this.a.values();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */