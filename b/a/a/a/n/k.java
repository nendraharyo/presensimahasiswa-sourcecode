package b.a.a.a.n;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.l;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.r;
import b.a.a.a.v;

public class k
  implements r
{
  private final boolean a;
  
  public k()
  {
    this(false);
  }
  
  public k(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void process(q paramq, e parame)
  {
    a.a(paramq, "HTTP request");
    Object localObject1 = "Expect";
    boolean bool1 = paramq.containsHeader((String)localObject1);
    if (!bool1)
    {
      bool1 = paramq instanceof l;
      if (bool1)
      {
        Object localObject2 = ((q)paramq).getRequestLine().b();
        localObject1 = paramq;
        localObject1 = ((l)paramq).getEntity();
        if (localObject1 != null)
        {
          long l1 = ((b.a.a.a.k)localObject1).getContentLength();
          long l2 = 0L;
          bool1 = l1 < l2;
          if (bool1)
          {
            localObject1 = v.b;
            bool1 = ((ac)localObject2).c((ac)localObject1);
            if (!bool1)
            {
              localObject1 = ((q)paramq).getParams();
              localObject2 = "http.protocol.expect-continue";
              boolean bool2 = this.a;
              bool1 = ((b.a.a.a.l.e)localObject1).a((String)localObject2, bool2);
              if (bool1)
              {
                localObject1 = "Expect";
                localObject2 = "100-continue";
                ((q)paramq).addHeader((String)localObject1, (String)localObject2);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */