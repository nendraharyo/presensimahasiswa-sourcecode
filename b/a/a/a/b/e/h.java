package b.a.a.a.b.e;

import b.a.a.a.ae;
import b.a.a.a.n.e;
import b.a.a.a.o.a;
import b.a.a.a.q;

public class h
  extends d
{
  public void process(q paramq, e parame)
  {
    a.a(paramq, "HTTP request");
    a.a(parame, "HTTP context");
    Object localObject1 = paramq.getRequestLine().a();
    Object localObject2 = "CONNECT";
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = "Authorization";
      bool1 = paramq.containsHeader((String)localObject1);
      if (!bool1)
      {
        localObject1 = (b.a.a.a.a.h)parame.a("http.auth.target-scope");
        if (localObject1 == null)
        {
          localObject1 = this.a;
          localObject2 = "Target auth state not set in the context";
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
            localObject3 = ((StringBuilder)localObject3).append("Target auth state: ");
            b.a.a.a.a.b localb = ((b.a.a.a.a.h)localObject1).b();
            localObject3 = localb;
            ((b.a.a.a.h.b)localObject2).a(localObject3);
          }
          a((b.a.a.a.a.h)localObject1, paramq, parame);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */