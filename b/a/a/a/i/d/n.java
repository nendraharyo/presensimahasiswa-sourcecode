package b.a.a.a.i.d;

import b.a.a.a.f.h;
import b.a.a.a.f.i;
import b.a.a.a.f.j;
import java.util.Collection;

public class n
  implements i, j
{
  private final String[] a;
  private final n.a b;
  
  public n()
  {
    this(null, locala);
  }
  
  public n(String[] paramArrayOfString, n.a parama)
  {
    this.a = paramArrayOfString;
    this.b = parama;
  }
  
  public h a(b.a.a.a.l.e parame)
  {
    int i = 0;
    Object localObject1 = null;
    if (parame != null)
    {
      localObject2 = (Collection)parame.a("http.protocol.cookie-datepatterns");
      if (localObject2 == null) {
        break label98;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label98:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = new b/a/a/a/i/d/m;
      n.a locala = this.b;
      ((m)localObject1).<init>((String[])localObject2, locala);
      localObject2 = localObject1;
      for (;;)
      {
        return (h)localObject2;
        localObject2 = new b/a/a/a/i/d/m;
        locala = this.b;
        ((m)localObject2).<init>(null, locala);
      }
    }
  }
  
  public h a(b.a.a.a.n.e parame)
  {
    m localm = new b/a/a/a/i/d/m;
    String[] arrayOfString = this.a;
    localm.<init>(arrayOfString);
    return localm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */