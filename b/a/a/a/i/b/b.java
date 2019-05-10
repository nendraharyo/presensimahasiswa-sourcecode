package b.a.a.a.i.b;

import b.a.a.a.a.g;
import b.a.a.a.a.m;
import b.a.a.a.n;
import b.a.a.a.s;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

class b
  implements b.a.a.a.b.c
{
  public b.a.a.a.h.b a;
  private final b.a.a.a.b.b b;
  
  private boolean a(b.a.a.a.a.c paramc)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramc != null)
    {
      bool2 = paramc.d();
      if (bool2) {
        break label19;
      }
    }
    for (;;)
    {
      return bool1;
      label19:
      String str1 = paramc.a();
      String str2 = "Basic";
      boolean bool3 = str1.equalsIgnoreCase(str2);
      if (!bool3)
      {
        str2 = "Digest";
        bool2 = str1.equalsIgnoreCase(str2);
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public b.a.a.a.b.b a()
  {
    return this.b;
  }
  
  public Queue a(Map paramMap, n paramn, s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramMap, "Map of auth challenges");
    b.a.a.a.o.a.a(paramn, "Host");
    b.a.a.a.o.a.a(params, "HTTP response");
    b.a.a.a.o.a.a(parame, "HTTP context");
    LinkedList localLinkedList1 = new java/util/LinkedList;
    localLinkedList1.<init>();
    Object localObject1 = (b.a.a.a.b.i)parame.a("http.auth.credentials-provider");
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.a;
      localObject2 = "Credentials provider not set in the context";
      ((b.a.a.a.h.b)localObject1).a(localObject2);
      localObject1 = localLinkedList1;
    }
    for (;;)
    {
      return (Queue)localObject1;
      try
      {
        localObject2 = this.b;
        localObject3 = ((b.a.a.a.b.b)localObject2).a(paramMap, params, parame);
        localObject2 = ((b.a.a.a.a.c)localObject3).a();
        Object localObject4 = Locale.ENGLISH;
        localObject2 = ((String)localObject2).toLowerCase((Locale)localObject4);
        localObject2 = (b.a.a.a.e)paramMap.get(localObject2);
        ((b.a.a.a.a.c)localObject3).a((b.a.a.a.e)localObject2);
        localObject2 = new b/a/a/a/a/g;
        localObject4 = paramn.a();
        int i = paramn.b();
        String str1 = ((b.a.a.a.a.c)localObject3).b();
        String str2 = ((b.a.a.a.a.c)localObject3).a();
        ((g)localObject2).<init>((String)localObject4, i, str1, str2);
        localObject1 = ((b.a.a.a.b.i)localObject1).a((g)localObject2);
        if (localObject1 != null)
        {
          localObject2 = new b/a/a/a/a/a;
          ((b.a.a.a.a.a)localObject2).<init>((b.a.a.a.a.c)localObject3, (m)localObject1);
          localLinkedList1.add(localObject2);
        }
        localObject1 = localLinkedList1;
      }
      catch (b.a.a.a.a.i locali)
      {
        Object localObject3;
        localObject2 = this.a;
        boolean bool = ((b.a.a.a.h.b)localObject2).c();
        if (bool)
        {
          localObject2 = this.a;
          localObject3 = locali.getMessage();
          ((b.a.a.a.h.b)localObject2).c(localObject3, locali);
        }
        LinkedList localLinkedList2 = localLinkedList1;
      }
    }
  }
  
  public void a(n paramn, b.a.a.a.a.c paramc, b.a.a.a.n.e parame)
  {
    Object localObject1 = (b.a.a.a.b.a)parame.a("http.auth.auth-cache");
    boolean bool = a(paramc);
    if (bool)
    {
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/b/d;
        ((d)localObject1).<init>();
        localObject2 = "http.auth.auth-cache";
        parame.a((String)localObject2, localObject1);
      }
      Object localObject2 = this.a;
      bool = ((b.a.a.a.h.b)localObject2).a();
      if (bool)
      {
        localObject2 = this.a;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Caching '");
        String str = paramc.a();
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = "' auth scheme for ";
        localObject3 = str + paramn;
        ((b.a.a.a.h.b)localObject2).a(localObject3);
      }
      ((b.a.a.a.b.a)localObject1).a(paramn, paramc);
    }
  }
  
  public boolean a(n paramn, s params, b.a.a.a.n.e parame)
  {
    return this.b.a(params, parame);
  }
  
  public Map b(n paramn, s params, b.a.a.a.n.e parame)
  {
    return this.b.b(params, parame);
  }
  
  public void b(n paramn, b.a.a.a.a.c paramc, b.a.a.a.n.e parame)
  {
    b.a.a.a.b.a locala = (b.a.a.a.b.a)parame.a("http.auth.auth-cache");
    if (locala == null) {}
    for (;;)
    {
      return;
      b.a.a.a.h.b localb = this.a;
      boolean bool = localb.a();
      if (bool)
      {
        localb = this.a;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Removing from cache '");
        String str = paramc.a();
        localObject = ((StringBuilder)localObject).append(str);
        str = "' auth scheme for ";
        localObject = str + paramn;
        localb.a(localObject);
      }
      locala.b(paramn);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */