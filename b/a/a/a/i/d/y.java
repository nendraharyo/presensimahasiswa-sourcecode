package b.a.a.a.i.d;

import b.a.a.a.f.h;
import b.a.a.a.f.i;
import b.a.a.a.f.j;
import java.util.Collection;

public class y
  implements i, j
{
  private final String[] a;
  private final boolean b;
  
  public y()
  {
    this(null, false);
  }
  
  public y(String[] paramArrayOfString, boolean paramBoolean)
  {
    this.a = paramArrayOfString;
    this.b = paramBoolean;
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
        break label94;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label94:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      boolean bool = parame.a("http.protocol.single-cookie-header", false);
      localObject1 = new b/a/a/a/i/d/x;
      ((x)localObject1).<init>((String[])localObject2, bool);
      localObject2 = localObject1;
      for (;;)
      {
        return (h)localObject2;
        localObject2 = new b/a/a/a/i/d/x;
        ((x)localObject2).<init>();
      }
    }
  }
  
  public h a(b.a.a.a.n.e parame)
  {
    x localx = new b/a/a/a/i/d/x;
    String[] arrayOfString = this.a;
    boolean bool = this.b;
    localx.<init>(arrayOfString, bool);
    return localx;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */