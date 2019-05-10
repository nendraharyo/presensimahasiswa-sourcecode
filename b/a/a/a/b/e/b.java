package b.a.a.a.b.e;

import b.a.a.a.ae;
import b.a.a.a.b.c.l;
import b.a.a.a.f.j;
import b.a.a.a.m;
import b.a.a.a.q;
import b.a.a.a.r;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class b
  implements r
{
  public b.a.a.a.h.b a;
  
  public b()
  {
    b.a.a.a.h.b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  public void process(q paramq, b.a.a.a.n.e parame)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    b.a.a.a.o.a.a(paramq, "HTTP request");
    b.a.a.a.o.a.a(parame, "HTTP context");
    Object localObject2 = paramq.getRequestLine().a();
    Object localObject4 = "CONNECT";
    boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject4);
    if (bool1) {}
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    for (;;)
    {
      return;
      localObject5 = a.a(parame);
      localObject6 = ((a)localObject5).b();
      if (localObject6 == null)
      {
        localObject2 = this.a;
        localObject4 = "Cookie store not specified in HTTP context";
        ((b.a.a.a.h.b)localObject2).a(localObject4);
      }
      else
      {
        localObject7 = ((a)localObject5).e();
        if (localObject7 == null)
        {
          localObject2 = this.a;
          localObject4 = "CookieSpec registry not specified in HTTP context";
          ((b.a.a.a.h.b)localObject2).a(localObject4);
        }
        else
        {
          localObject8 = ((a)localObject5).o();
          if (localObject8 == null)
          {
            localObject2 = this.a;
            localObject4 = "Target host not set in the context";
            ((b.a.a.a.h.b)localObject2).a(localObject4);
          }
          else
          {
            localObject9 = ((a)localObject5).a();
            if (localObject9 != null) {
              break;
            }
            localObject2 = this.a;
            localObject4 = "Connection route not set in the context";
            ((b.a.a.a.h.b)localObject2).a(localObject4);
          }
        }
      }
    }
    localObject2 = ((a)localObject5).k().a();
    if (localObject2 == null) {
      localObject2 = "best-match";
    }
    label310:
    label351:
    Object localObject3;
    for (localObject4 = localObject2;; localObject4 = localObject3)
    {
      localObject2 = this.a;
      bool1 = ((b.a.a.a.h.b)localObject2).a();
      Object localObject10;
      if (bool1)
      {
        localObject2 = this.a;
        localObject10 = new java/lang/StringBuilder;
        ((StringBuilder)localObject10).<init>();
        String str = "CookieSpec selected: ";
        localObject10 = str + (String)localObject4;
        ((b.a.a.a.h.b)localObject2).a(localObject10);
      }
      bool1 = paramq instanceof l;
      if (bool1)
      {
        localObject2 = paramq;
        localObject2 = ((l)paramq).getURI();
        if (localObject2 == null) {
          break label488;
        }
        localObject2 = ((URI)localObject2).getPath();
        localObject10 = ((b.a.a.a.n)localObject8).a();
        i = ((b.a.a.a.n)localObject8).b();
        if (i < 0)
        {
          localObject1 = ((b.a.a.a.e.b.e)localObject9).a();
          i = ((b.a.a.a.n)localObject1).b();
        }
        localObject8 = new b/a/a/a/f/e;
        if (i < 0) {
          break label497;
        }
        boolean bool2 = b.a.a.a.o.h.a((CharSequence)localObject2);
        if (bool2) {
          break label505;
        }
      }
      for (;;)
      {
        boolean bool3 = ((b.a.a.a.e.b.e)localObject9).g();
        ((b.a.a.a.f.e)localObject8).<init>((String)localObject10, i, (String)localObject2, bool3);
        localObject2 = (j)((b.a.a.a.d.a)localObject7).b((String)localObject4);
        if (localObject2 != null) {
          break label512;
        }
        localObject2 = new b/a/a/a/m;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = "Unsupported cookie policy: " + (String)localObject4;
        ((m)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
        try
        {
          localObject2 = new java/net/URI;
          localObject10 = paramq.getRequestLine();
          localObject10 = ((ae)localObject10).c();
          ((URI)localObject2).<init>((String)localObject10);
        }
        catch (URISyntaxException localURISyntaxException)
        {
          bool1 = false;
          localObject3 = null;
        }
        break;
        label488:
        bool1 = false;
        localObject3 = null;
        break label310;
        label497:
        i = 0;
        localObject1 = null;
        break label351;
        label505:
        localObject3 = "/";
      }
      label512:
      localObject4 = ((j)localObject3).a((b.a.a.a.n.e)localObject5);
      localObject3 = new java/util/ArrayList;
      localObject1 = ((b.a.a.a.b.h)localObject6).getCookies();
      ((ArrayList)localObject3).<init>((Collection)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject5 = new java/util/Date;
      ((Date)localObject5).<init>();
      localObject6 = ((List)localObject3).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject6).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (b.a.a.a.f.b)((Iterator)localObject6).next();
        boolean bool4 = ((b.a.a.a.f.b)localObject3).a((Date)localObject5);
        if (!bool4)
        {
          bool4 = ((b.a.a.a.f.h)localObject4).b((b.a.a.a.f.b)localObject3, (b.a.a.a.f.e)localObject8);
          if (bool4)
          {
            localObject7 = this.a;
            bool4 = ((b.a.a.a.h.b)localObject7).a();
            if (bool4)
            {
              localObject7 = this.a;
              localObject9 = new java/lang/StringBuilder;
              ((StringBuilder)localObject9).<init>();
              localObject9 = ((StringBuilder)localObject9).append("Cookie ").append(localObject3);
              localObject10 = " match ";
              localObject9 = (String)localObject10 + localObject8;
              ((b.a.a.a.h.b)localObject7).a(localObject9);
            }
            ((List)localObject1).add(localObject3);
          }
        }
        else
        {
          localObject7 = this.a;
          bool4 = ((b.a.a.a.h.b)localObject7).a();
          if (bool4)
          {
            localObject7 = this.a;
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            localObject10 = "Cookie ";
            localObject3 = ((StringBuilder)localObject9).append((String)localObject10).append(localObject3);
            localObject9 = " expired";
            localObject3 = (String)localObject9;
            ((b.a.a.a.h.b)localObject7).a(localObject3);
          }
        }
      }
      bool1 = ((List)localObject1).isEmpty();
      if (!bool1)
      {
        localObject3 = ((b.a.a.a.f.h)localObject4).a((List)localObject1);
        localObject5 = ((List)localObject3).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (b.a.a.a.e)((Iterator)localObject5).next();
          ((q)paramq).addHeader((b.a.a.a.e)localObject3);
        }
      }
      int k = ((b.a.a.a.f.h)localObject4).a();
      if (k > 0)
      {
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (b.a.a.a.f.b)((Iterator)localObject1).next();
          int m = ((b.a.a.a.f.b)localObject3).j();
          if (k == m)
          {
            bool1 = localObject3 instanceof b.a.a.a.f.n;
            if (bool1) {}
          }
          else
          {
            j = 1;
          }
        }
        if (j != 0)
        {
          localObject3 = ((b.a.a.a.f.h)localObject4).b();
          if (localObject3 != null) {
            ((q)paramq).addHeader((b.a.a.a.e)localObject3);
          }
        }
      }
      parame.a("http.cookie-spec", localObject4);
      localObject3 = "http.cookie-origin";
      parame.a((String)localObject3, localObject8);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\e\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */