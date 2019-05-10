package b.a.a.a.b.e;

import b.a.a.a.ae;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.r;
import java.util.Collection;
import java.util.Iterator;

public class f
  implements r
{
  private final Collection a;
  
  public f()
  {
    this(null);
  }
  
  public f(Collection paramCollection)
  {
    this.a = paramCollection;
  }
  
  public void process(q paramq, b.a.a.a.n.e parame)
  {
    a.a(paramq, "HTTP request");
    Object localObject1 = paramq.getRequestLine().a();
    Object localObject2 = "CONNECT";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool) {}
    do
    {
      return;
      localObject1 = paramq.getParams();
      localObject2 = "http.default-headers";
      localObject1 = (Collection)((b.a.a.a.l.e)localObject1).a((String)localObject2);
      if (localObject1 == null) {
        localObject1 = this.a;
      }
    } while (localObject1 == null);
    localObject2 = ((Collection)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (b.a.a.a.e)((Iterator)localObject2).next();
      paramq.addHeader((b.a.a.a.e)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */