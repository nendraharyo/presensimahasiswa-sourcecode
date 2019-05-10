package b.a.a.a.i.d;

import b.a.a.a.f;
import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.l;
import b.a.a.a.k.p;
import b.a.a.a.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ae
  extends x
{
  public ae()
  {
    this(null, false);
  }
  
  public ae(String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramArrayOfString, paramBoolean);
    Object localObject = new b/a/a/a/i/d/ac;
    ((ac)localObject).<init>();
    a("domain", (c)localObject);
    localObject = new b/a/a/a/i/d/ad;
    ((ad)localObject).<init>();
    a("port", (c)localObject);
    localObject = new b/a/a/a/i/d/aa;
    ((aa)localObject).<init>();
    a("commenturl", (c)localObject);
    localObject = new b/a/a/a/i/d/ab;
    ((ab)localObject).<init>();
    a("discard", (c)localObject);
    localObject = new b/a/a/a/i/d/ag;
    ((ag)localObject).<init>();
    a("version", (c)localObject);
  }
  
  private List b(f[] paramArrayOff, b.a.a.a.f.e parame)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOff.length;
    localArrayList.<init>(i);
    int k = paramArrayOff.length;
    int j;
    for (int m = 0; m < k; m = j)
    {
      Object localObject1 = paramArrayOff[m];
      Object localObject2 = ((f)localObject1).a();
      Object localObject3 = ((f)localObject1).b();
      if (localObject2 != null)
      {
        int n = ((String)localObject2).length();
        if (n != 0) {}
      }
      else
      {
        localObject1 = new b/a/a/a/f/l;
        ((l)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
      }
      d locald = new b/a/a/a/i/d/d;
      locald.<init>((String)localObject2, (String)localObject3);
      localObject2 = a(parame);
      locald.e((String)localObject2);
      localObject2 = b(parame);
      locald.d((String)localObject2);
      int i1 = 1;
      localObject2 = new int[i1];
      int i2 = parame.c();
      localObject2[0] = i2;
      locald.a((int[])localObject2);
      localObject2 = ((f)localObject1).c();
      localObject3 = new java/util/HashMap;
      i = localObject2.length;
      ((HashMap)localObject3).<init>(i);
      i = localObject2.length + -1;
      Object localObject4;
      while (i >= 0)
      {
        localObject4 = localObject2[i];
        String str = ((y)localObject4).a();
        Locale localLocale = Locale.ENGLISH;
        str = str.toLowerCase(localLocale);
        ((Map)localObject3).put(str, localObject4);
        i += -1;
      }
      localObject1 = ((Map)localObject3).entrySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (y)((Map.Entry)((Iterator)localObject2).next()).getValue();
        localObject3 = ((y)localObject1).a();
        localObject4 = Locale.ENGLISH;
        localObject3 = ((String)localObject3).toLowerCase((Locale)localObject4);
        localObject4 = ((y)localObject1).b();
        locald.a((String)localObject3, (String)localObject4);
        localObject3 = a((String)localObject3);
        if (localObject3 != null)
        {
          localObject1 = ((y)localObject1).b();
          ((c)localObject3).a(locald, (String)localObject1);
        }
      }
      localArrayList.add(locald);
      j = m + 1;
    }
    return localArrayList;
  }
  
  private static b.a.a.a.f.e c(b.a.a.a.f.e parame)
  {
    int i = 0;
    String str1 = null;
    String str2 = parame.a();
    int j = 1;
    int k = 0;
    Object localObject = null;
    int m = str2.length();
    if (k < m)
    {
      m = str2.charAt(k);
      int n = 46;
      if (m != n)
      {
        n = 58;
        if (m != n) {
          break label128;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str1 = str2 + ".local";
        localObject = new b/a/a/a/f/e;
        j = parame.c();
        str2 = parame.b();
        boolean bool = parame.d();
        ((b.a.a.a.f.e)localObject).<init>(str1, j, str2, bool);
        parame = (b.a.a.a.f.e)localObject;
      }
      return parame;
      label128:
      k += 1;
      break;
      i = j;
    }
  }
  
  public int a()
  {
    return 1;
  }
  
  public List a(b.a.a.a.e parame, b.a.a.a.f.e parame1)
  {
    b.a.a.a.o.a.a(parame, "Header");
    b.a.a.a.o.a.a(parame1, "Cookie origin");
    Object localObject1 = parame.c();
    Object localObject2 = "Set-Cookie2";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (!bool)
    {
      localObject1 = new b/a/a/a/f/l;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized cookie header '");
      String str = parame.toString();
      localObject2 = str + "'";
      ((l)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = parame.e();
    localObject2 = c(parame1);
    return b((f[])localObject1, (b.a.a.a.f.e)localObject2);
  }
  
  protected List a(f[] paramArrayOff, b.a.a.a.f.e parame)
  {
    b.a.a.a.f.e locale = c(parame);
    return b(paramArrayOff, locale);
  }
  
  public void a(b paramb, b.a.a.a.f.e parame)
  {
    b.a.a.a.o.a.a(paramb, "Cookie");
    b.a.a.a.o.a.a(parame, "Cookie origin");
    b.a.a.a.f.e locale = c(parame);
    super.a(paramb, locale);
  }
  
  protected void a(b.a.a.a.o.d paramd, b paramb, int paramInt)
  {
    super.a(paramd, paramb, paramInt);
    boolean bool = paramb instanceof b.a.a.a.f.a;
    if (bool)
    {
      Object localObject1 = paramb;
      localObject1 = (b.a.a.a.f.a)paramb;
      Object localObject2 = "port";
      localObject1 = ((b.a.a.a.f.a)localObject1).a((String)localObject2);
      if (localObject1 != null)
      {
        paramd.a("; $Port");
        localObject2 = "=\"";
        paramd.a((String)localObject2);
        localObject1 = ((String)localObject1).trim();
        int i = ((String)localObject1).length();
        if (i > 0)
        {
          localObject2 = ((b)paramb).h();
          if (localObject2 != null)
          {
            int j = localObject2.length;
            i = 0;
            localObject1 = null;
            while (i < j)
            {
              if (i > 0)
              {
                str = ",";
                paramd.a(str);
              }
              int k = localObject2[i];
              String str = Integer.toString(k);
              paramd.a(str);
              i += 1;
            }
          }
        }
        localObject1 = "\"";
        paramd.a((String)localObject1);
      }
    }
  }
  
  public b.a.a.a.e b()
  {
    b.a.a.a.o.d locald = new b/a/a/a/o/d;
    locald.<init>(40);
    locald.a("Cookie2");
    locald.a(": ");
    locald.a("$Version=");
    Object localObject = Integer.toString(a());
    locald.a((String)localObject);
    localObject = new b/a/a/a/k/p;
    ((p)localObject).<init>(locald);
    return (b.a.a.a.e)localObject;
  }
  
  public boolean b(b paramb, b.a.a.a.f.e parame)
  {
    b.a.a.a.o.a.a(paramb, "Cookie");
    b.a.a.a.o.a.a(parame, "Cookie origin");
    b.a.a.a.f.e locale = c(parame);
    return super.b(paramb, locale);
  }
  
  public String toString()
  {
    return "rfc2965";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */