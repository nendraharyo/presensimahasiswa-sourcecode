package b.a.a.a.i.d;

import b.a.a.a.f.h;
import b.a.a.a.f.i;
import b.a.a.a.f.j;
import java.util.Collection;

public class v
  implements i, j
{
  private final String[] a;
  
  public v()
  {
    this(null);
  }
  
  public v(String[] paramArrayOfString)
  {
    this.a = paramArrayOfString;
  }
  
  public h a(b.a.a.a.l.e parame)
  {
    Object localObject1;
    if (parame != null)
    {
      int i = 0;
      localObject1 = null;
      localObject2 = (Collection)parame.a("http.protocol.cookie-datepatterns");
      if (localObject2 == null) {
        break label81;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label81:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = new b/a/a/a/i/d/u;
      ((u)localObject1).<init>((String[])localObject2);
      localObject2 = localObject1;
      for (;;)
      {
        return (h)localObject2;
        localObject2 = new b/a/a/a/i/d/u;
        ((u)localObject2).<init>();
      }
    }
  }
  
  public h a(b.a.a.a.n.e parame)
  {
    u localu = new b/a/a/a/i/d/u;
    String[] arrayOfString = this.a;
    localu.<init>(arrayOfString);
    return localu;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */