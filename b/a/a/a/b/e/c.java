package b.a.a.a.b.e;

import b.a.a.a.a.g;
import b.a.a.a.a.h;
import b.a.a.a.a.m;
import b.a.a.a.b.i;
import b.a.a.a.n;
import b.a.a.a.q;
import b.a.a.a.r;

public class c
  implements r
{
  public b.a.a.a.h.b a;
  
  public c()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  private void a(n paramn, b.a.a.a.a.c paramc, h paramh, i parami)
  {
    Object localObject1 = paramc.a();
    Object localObject2 = this.a;
    boolean bool = ((b.a.a.a.h.b)localObject2).a();
    if (bool)
    {
      localObject2 = this.a;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Re-using cached '").append((String)localObject1);
      String str = "' auth scheme for ";
      localObject3 = str + paramn;
      ((b.a.a.a.h.b)localObject2).a(localObject3);
    }
    localObject2 = new b/a/a/a/a/g;
    Object localObject3 = g.b;
    ((g)localObject2).<init>(paramn, (String)localObject3, (String)localObject1);
    localObject1 = parami.a((g)localObject2);
    if (localObject1 != null)
    {
      localObject2 = "BASIC";
      localObject3 = paramc.a();
      bool = ((String)localObject2).equalsIgnoreCase((String)localObject3);
      if (bool)
      {
        localObject2 = b.a.a.a.a.b.b;
        paramh.a((b.a.a.a.a.b)localObject2);
        paramh.a(paramc, (m)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject2 = b.a.a.a.a.b.e;
      paramh.a((b.a.a.a.a.b)localObject2);
      break;
      localObject1 = this.a;
      localObject2 = "No credentials for preemptive authentication";
      ((b.a.a.a.h.b)localObject1).a(localObject2);
    }
  }
  
  public void process(q paramq, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramq, "HTTP request");
    Object localObject1 = "HTTP context";
    b.a.a.a.o.a.a(parame, (String)localObject1);
    Object localObject2 = a.a(parame);
    b.a.a.a.b.a locala = ((a)localObject2).h();
    Object localObject3;
    if (locala == null)
    {
      localObject1 = this.a;
      localObject3 = "Auth cache not set in the context";
      ((b.a.a.a.h.b)localObject1).a(localObject3);
    }
    i locali;
    Object localObject4;
    for (;;)
    {
      return;
      locali = ((a)localObject2).g();
      if (locali == null)
      {
        localObject1 = this.a;
        localObject3 = "Credentials provider not set in the context";
        ((b.a.a.a.h.b)localObject1).a(localObject3);
      }
      else
      {
        localObject4 = ((a)localObject2).a();
        if (localObject4 == null)
        {
          localObject1 = this.a;
          localObject3 = "Route info not set in the context";
          ((b.a.a.a.h.b)localObject1).a(localObject3);
        }
        else
        {
          localObject3 = ((a)localObject2).o();
          if (localObject3 != null) {
            break;
          }
          localObject1 = this.a;
          localObject3 = "Target host not set in the context";
          ((b.a.a.a.h.b)localObject1).a(localObject3);
        }
      }
    }
    int i = ((n)localObject3).b();
    Object localObject5;
    Object localObject6;
    if (i < 0)
    {
      localObject1 = new b/a/a/a/n;
      localObject5 = ((n)localObject3).a();
      localObject6 = ((b.a.a.a.e.b.e)localObject4).a();
      int j = ((n)localObject6).b();
      localObject3 = ((n)localObject3).c();
      ((n)localObject1).<init>((String)localObject5, j, (String)localObject3);
    }
    for (;;)
    {
      localObject3 = ((a)localObject2).i();
      if (localObject3 != null)
      {
        localObject5 = ((h)localObject3).b();
        localObject6 = b.a.a.a.a.b.a;
        if (localObject5 == localObject6)
        {
          localObject5 = locala.a((n)localObject1);
          if (localObject5 != null) {
            a((n)localObject1, (b.a.a.a.a.c)localObject5, (h)localObject3, locali);
          }
        }
      }
      localObject1 = ((b.a.a.a.e.b.e)localObject4).d();
      localObject3 = ((a)localObject2).j();
      if ((localObject1 == null) || (localObject3 == null)) {
        break;
      }
      localObject2 = ((h)localObject3).b();
      localObject4 = b.a.a.a.a.b.a;
      if (localObject2 != localObject4) {
        break;
      }
      localObject2 = locala.a((n)localObject1);
      if (localObject2 == null) {
        break;
      }
      a((n)localObject1, (b.a.a.a.a.c)localObject2, (h)localObject3, locali);
      break;
      localObject1 = localObject3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */