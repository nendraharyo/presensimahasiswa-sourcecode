package b.a.a.a.b.e;

import b.a.a.a.a.a;
import b.a.a.a.a.c;
import b.a.a.a.a.h;
import b.a.a.a.a.i;
import b.a.a.a.a.l;
import b.a.a.a.a.m;
import b.a.a.a.q;
import b.a.a.a.r;
import java.util.Queue;

abstract class d
  implements r
{
  final b.a.a.a.h.b a;
  
  public d()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  private b.a.a.a.e a(c paramc, m paramm, q paramq, b.a.a.a.n.e parame)
  {
    Object localObject = "Auth scheme";
    b.a.a.a.o.b.a(paramc, (String)localObject);
    boolean bool = paramc instanceof l;
    if (bool) {
      paramc = (l)paramc;
    }
    for (localObject = paramc.a(paramm, paramq, parame);; localObject = paramc.a(paramm, paramq)) {
      return (b.a.a.a.e)localObject;
    }
  }
  
  private void a(c paramc)
  {
    b.a.a.a.o.b.a(paramc, "Auth scheme");
  }
  
  void a(h paramh, q paramq, b.a.a.a.n.e parame)
  {
    localObject1 = paramh.c();
    Object localObject2 = paramh.d();
    localObject3 = d.1.a;
    localObject4 = paramh.b();
    int i = ((b.a.a.a.a.b)localObject4).ordinal();
    int j = localObject3[i];
    switch (j)
    {
    }
    for (;;)
    {
      if (localObject1 != null) {}
      for (;;)
      {
        try
        {
          localObject2 = a((c)localObject1, (m)localObject2, paramq, parame);
          paramq.addHeader((b.a.a.a.e)localObject2);
          return;
        }
        catch (i locali2)
        {
          localObject3 = this.a;
          boolean bool2 = ((b.a.a.a.h.b)localObject3).b();
          if (!bool2) {
            continue;
          }
          localObject3 = this.a;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject1 = ((StringBuilder)localObject4).append(localObject1);
          localObject4 = " authentication error: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          String str2 = locali2.getMessage();
          str2 = str2;
          ((b.a.a.a.h.b)localObject3).b(str2);
          continue;
        }
        a((c)localObject1);
        bool2 = ((c)localObject1).c();
        if (!bool2) {
          break;
        }
      }
      localObject3 = paramh.e();
      if (localObject3 != null) {
        for (;;)
        {
          boolean bool3 = ((Queue)localObject3).isEmpty();
          if (bool3) {
            break;
          }
          localObject2 = (a)((Queue)localObject3).remove();
          localObject1 = ((a)localObject2).a();
          localObject2 = ((a)localObject2).b();
          paramh.a((c)localObject1, (m)localObject2);
          localObject4 = this.a;
          boolean bool1 = ((b.a.a.a.h.b)localObject4).a();
          Object localObject5;
          if (bool1)
          {
            localObject4 = this.a;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = ((StringBuilder)localObject5).append("Generating response to an authentication challenge using ");
            String str3 = ((c)localObject1).a();
            localObject5 = ((StringBuilder)localObject5).append(str3);
            str3 = " scheme";
            localObject5 = str3;
            ((b.a.a.a.h.b)localObject4).a(localObject5);
          }
          try
          {
            localObject2 = a((c)localObject1, (m)localObject2, paramq, parame);
            paramq.addHeader((b.a.a.a.e)localObject2);
          }
          catch (i locali1)
          {
            localObject4 = this.a;
            bool1 = ((b.a.a.a.h.b)localObject4).c();
          }
          if (bool1)
          {
            localObject4 = this.a;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject1 = ((StringBuilder)localObject5).append(localObject1);
            localObject5 = " authentication error: ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            String str1 = locali1.getMessage();
            str1 = str1;
            ((b.a.a.a.h.b)localObject4).c(str1);
          }
        }
      }
      a((c)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */