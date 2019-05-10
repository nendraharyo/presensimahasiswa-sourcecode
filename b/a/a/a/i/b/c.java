package b.a.a.a.i.b;

import b.a.a.a.a.g;
import b.a.a.a.a.m;
import b.a.a.a.a.o;
import b.a.a.a.af;
import b.a.a.a.b.i;
import b.a.a.a.h.b;
import b.a.a.a.n;
import b.a.a.a.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

abstract class c
  implements b.a.a.a.b.c
{
  private static final List b;
  public b a;
  private final int c;
  private final String d;
  
  static
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "negotiate";
    arrayOfString[1] = "Kerberos";
    arrayOfString[2] = "NTLM";
    arrayOfString[3] = "Digest";
    arrayOfString[4] = "Basic";
    b = Collections.unmodifiableList(Arrays.asList(arrayOfString));
  }
  
  c(int paramInt, String paramString)
  {
    b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
    this.c = paramInt;
    this.d = paramString;
  }
  
  abstract Collection a(b.a.a.a.b.a.a parama);
  
  public Queue a(Map paramMap, n paramn, s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramMap, "Map of auth challenges");
    b.a.a.a.o.a.a(paramn, "Host");
    b.a.a.a.o.a.a(params, "HTTP response");
    b.a.a.a.o.a.a(parame, "HTTP context");
    Object localObject1 = b.a.a.a.b.e.a.a(parame);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    b.a.a.a.d.a locala = ((b.a.a.a.b.e.a)localObject1).f();
    Object localObject2;
    if (locala == null)
    {
      localObject1 = this.a;
      localObject2 = "Auth scheme registry not set in the context";
      ((b)localObject1).a(localObject2);
      localObject1 = localLinkedList;
    }
    for (;;)
    {
      return (Queue)localObject1;
      i locali = ((b.a.a.a.b.e.a)localObject1).g();
      if (locali == null)
      {
        localObject1 = this.a;
        localObject2 = "Credentials provider not set in the context";
        ((b)localObject1).a(localObject2);
        localObject1 = localLinkedList;
      }
      else
      {
        localObject1 = ((b.a.a.a.b.e.a)localObject1).k();
        localObject1 = a((b.a.a.a.b.a.a)localObject1);
        if (localObject1 == null) {
          localObject1 = b;
        }
        localObject2 = this.a;
        boolean bool1 = ((b)localObject2).a();
        Object localObject3;
        if (bool1)
        {
          localObject2 = this.a;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Authentication schemes in the order of preference: ";
          localObject3 = (String)localObject4 + localObject1;
          ((b)localObject2).a(localObject3);
        }
        Object localObject4 = ((Collection)localObject1).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (String)((Iterator)localObject4).next();
          localObject2 = Locale.ENGLISH;
          localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
          localObject2 = (b.a.a.a.e)paramMap.get(localObject2);
          String str1;
          if (localObject2 != null)
          {
            localObject3 = (b.a.a.a.a.e)locala.b((String)localObject1);
            if (localObject3 == null)
            {
              localObject2 = this.a;
              bool1 = ((b)localObject2).c();
              if (bool1)
              {
                localObject2 = this.a;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                str1 = "Authentication scheme ";
                localObject1 = ((StringBuilder)localObject3).append(str1).append((String)localObject1);
                localObject3 = " not supported";
                localObject1 = (String)localObject3;
                ((b)localObject2).c(localObject1);
              }
            }
            else
            {
              localObject1 = ((b.a.a.a.a.e)localObject3).a(parame);
              ((b.a.a.a.a.c)localObject1).a((b.a.a.a.e)localObject2);
              localObject2 = new b/a/a/a/a/g;
              localObject3 = paramn.a();
              int i = paramn.b();
              String str2 = ((b.a.a.a.a.c)localObject1).b();
              String str3 = ((b.a.a.a.a.c)localObject1).a();
              ((g)localObject2).<init>((String)localObject3, i, str2, str3);
              localObject2 = locali.a((g)localObject2);
              if (localObject2 != null)
              {
                localObject3 = new b/a/a/a/a/a;
                ((b.a.a.a.a.a)localObject3).<init>((b.a.a.a.a.c)localObject1, (m)localObject2);
                localLinkedList.add(localObject3);
              }
            }
          }
          else
          {
            localObject2 = this.a;
            bool1 = ((b)localObject2).a();
            if (bool1)
            {
              localObject2 = this.a;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              str1 = "Challenge for ";
              localObject1 = ((StringBuilder)localObject3).append(str1).append((String)localObject1);
              localObject3 = " authentication scheme not available";
              localObject1 = (String)localObject3;
              ((b)localObject2).a(localObject1);
            }
          }
        }
        localObject1 = localLinkedList;
      }
    }
  }
  
  public void a(n paramn, b.a.a.a.a.c paramc, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramn, "Host");
    b.a.a.a.o.a.a(paramc, "Auth scheme");
    Object localObject1 = "HTTP context";
    b.a.a.a.o.a.a(parame, (String)localObject1);
    Object localObject2 = b.a.a.a.b.e.a.a(parame);
    boolean bool1 = a(paramc);
    if (bool1)
    {
      localObject1 = ((b.a.a.a.b.e.a)localObject2).h();
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/i/b/d;
        ((d)localObject1).<init>();
        ((b.a.a.a.b.e.a)localObject2).a((b.a.a.a.b.a)localObject1);
      }
      localObject2 = this.a;
      boolean bool2 = ((b)localObject2).a();
      if (bool2)
      {
        localObject2 = this.a;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Caching '");
        String str = paramc.a();
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = "' auth scheme for ";
        localObject3 = str + paramn;
        ((b)localObject2).a(localObject3);
      }
      ((b.a.a.a.b.a)localObject1).a(paramn, paramc);
    }
  }
  
  protected boolean a(b.a.a.a.a.c paramc)
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
  
  public boolean a(n paramn, s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(params, "HTTP response");
    af localaf = params.a();
    int i = localaf.b();
    int k = this.c;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localaf = null;
    }
  }
  
  public Map b(n paramn, s params, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(params, "HTTP response");
    Object localObject1 = this.d;
    b.a.a.a.e[] arrayOfe = params.getHeaders((String)localObject1);
    HashMap localHashMap = new java/util/HashMap;
    int i = arrayOfe.length;
    localHashMap.<init>(i);
    int k = arrayOfe.length;
    int j;
    for (int m = 0; m < k; m = j)
    {
      b.a.a.a.e locale = arrayOfe[m];
      boolean bool1 = locale instanceof b.a.a.a.d;
      if (bool1)
      {
        localObject1 = locale;
        localObject2 = ((b.a.a.a.d)locale).a();
        localObject1 = locale;
        localObject1 = (b.a.a.a.d)locale;
        j = ((b.a.a.a.d)localObject1).b();
      }
      for (;;)
      {
        int n = ((b.a.a.a.o.d)localObject2).c();
        if (j >= n) {
          break;
        }
        boolean bool2 = b.a.a.a.n.d.a(((b.a.a.a.o.d)localObject2).a(j));
        if (!bool2) {
          break;
        }
        j += 1;
        continue;
        localObject2 = locale.d();
        if (localObject2 == null)
        {
          localObject1 = new b/a/a/a/a/o;
          ((o)localObject1).<init>("Header value is null");
          throw ((Throwable)localObject1);
        }
        localObject1 = new b/a/a/a/o/d;
        i1 = ((String)localObject2).length();
        ((b.a.a.a.o.d)localObject1).<init>(i1);
        ((b.a.a.a.o.d)localObject1).a((String)localObject2);
        localObject2 = localObject1;
        j = 0;
        localObject1 = null;
      }
      int i1 = j;
      for (;;)
      {
        int i2 = ((b.a.a.a.o.d)localObject2).c();
        if (i1 >= i2) {
          break;
        }
        boolean bool3 = b.a.a.a.n.d.a(((b.a.a.a.o.d)localObject2).a(i1));
        if (bool3) {
          break;
        }
        i1 += 1;
      }
      localObject1 = ((b.a.a.a.o.d)localObject2).a(j, i1);
      Object localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localHashMap.put(localObject1, locale);
      j = m + 1;
    }
    return localHashMap;
  }
  
  public void b(n paramn, b.a.a.a.a.c paramc, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramn, "Host");
    b.a.a.a.o.a.a(parame, "HTTP context");
    b.a.a.a.b.a locala = b.a.a.a.b.e.a.a(parame).h();
    if (locala != null)
    {
      b localb = this.a;
      boolean bool = localb.a();
      if (bool)
      {
        localb = this.a;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Clearing cached auth scheme for ";
        localObject = str + paramn;
        localb.a(localObject);
      }
      locala.b(paramn);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */