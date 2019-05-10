package b.a.a.a.b.e;

import b.a.a.a.a.h;
import b.a.a.a.e.n;
import b.a.a.a.n.e;
import b.a.a.a.o.a;
import b.a.a.a.q;

public class g
  extends d
{
  public void process(q paramq, e parame)
  {
    a.a(paramq, "HTTP request");
    a.a(parame, "HTTP context");
    Object localObject1 = "Proxy-Authorization";
    boolean bool1 = paramq.containsHeader((String)localObject1);
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = (n)parame.a("http.connection");
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = this.a;
        localObject2 = "HTTP connection not set in the context";
        ((b.a.a.a.h.b)localObject1).a(localObject2);
      }
      else
      {
        localObject1 = ((n)localObject1).h();
        bool1 = ((b.a.a.a.e.b.b)localObject1).e();
        if (!bool1)
        {
          localObject1 = (h)parame.a("http.auth.proxy-scope");
          if (localObject1 == null)
          {
            localObject1 = this.a;
            localObject2 = "Proxy auth state not set in the context";
            ((b.a.a.a.h.b)localObject1).a(localObject2);
          }
          else
          {
            localObject2 = this.a;
            boolean bool2 = ((b.a.a.a.h.b)localObject2).a();
            if (bool2)
            {
              localObject2 = this.a;
              Object localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Proxy auth state: ");
              b.a.a.a.a.b localb = ((h)localObject1).b();
              localObject3 = localb;
              ((b.a.a.a.h.b)localObject2).a(localObject3);
            }
            a((h)localObject1, paramq, parame);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */