package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.l;
import b.a.a.a.o.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class x
  extends p
{
  private static final b.a.a.a.f.f a;
  private static final String[] b;
  private final String[] c;
  private final boolean d;
  
  static
  {
    Object localObject = new b/a/a/a/f/f;
    ((b.a.a.a.f.f)localObject).<init>();
    a = (b.a.a.a.f.f)localObject;
    localObject = new String[3];
    localObject[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    localObject[1] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    localObject[2] = "EEE MMM d HH:mm:ss yyyy";
    b = (String[])localObject;
  }
  
  public x()
  {
    this(null, false);
  }
  
  public x(String[] paramArrayOfString, boolean paramBoolean)
  {
    String[] arrayOfString1;
    if (paramArrayOfString != null) {
      arrayOfString1 = (String[])paramArrayOfString.clone();
    }
    for (this.c = arrayOfString1;; this.c = arrayOfString1)
    {
      this.d = paramBoolean;
      Object localObject = new b/a/a/a/i/d/z;
      ((z)localObject).<init>();
      a("version", (c)localObject);
      localObject = new b/a/a/a/i/d/i;
      ((i)localObject).<init>();
      a("path", (c)localObject);
      localObject = new b/a/a/a/i/d/w;
      ((w)localObject).<init>();
      a("domain", (c)localObject);
      localObject = new b/a/a/a/i/d/h;
      ((h)localObject).<init>();
      a("max-age", (c)localObject);
      localObject = new b/a/a/a/i/d/j;
      ((j)localObject).<init>();
      a("secure", (c)localObject);
      localObject = new b/a/a/a/i/d/e;
      ((e)localObject).<init>();
      a("comment", (c)localObject);
      localObject = new b/a/a/a/i/d/g;
      String[] arrayOfString2 = this.c;
      ((g)localObject).<init>(arrayOfString2);
      a("expires", (c)localObject);
      return;
      arrayOfString1 = b;
    }
  }
  
  private List b(List paramList)
  {
    int i = -1 >>> 1;
    Object localObject1 = paramList.iterator();
    int k = i;
    boolean bool1 = ((Iterator)localObject1).hasNext();
    Object localObject2;
    if (bool1)
    {
      localObject2 = (b)((Iterator)localObject1).next();
      int m = ((b)localObject2).j();
      if (m >= k) {
        break label205;
      }
    }
    boolean bool2;
    label205:
    for (int j = ((b)localObject2).j();; bool2 = k)
    {
      k = j;
      break;
      localObject1 = new b/a/a/a/o/d;
      j = paramList.size() * 40;
      ((d)localObject1).<init>(j);
      ((d)localObject1).a("Cookie");
      ((d)localObject1).a(": ");
      ((d)localObject1).a("$Version=");
      localObject2 = Integer.toString(k);
      ((d)localObject1).a((String)localObject2);
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (b)localIterator.next();
        String str = "; ";
        ((d)localObject1).a(str);
        a((d)localObject1, (b)localObject2, k);
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(1);
      b.a.a.a.k.p localp = new b/a/a/a/k/p;
      localp.<init>((d)localObject1);
      ((List)localObject2).add(localp);
      return (List)localObject2;
    }
  }
  
  private List c(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramList.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (b)localIterator.next();
      int j = ((b)localObject).j();
      d locald = new b/a/a/a/o/d;
      int k = 40;
      locald.<init>(k);
      locald.a("Cookie: ");
      locald.a("$Version=");
      String str = Integer.toString(j);
      locald.a(str);
      str = "; ";
      locald.a(str);
      a(locald, (b)localObject, j);
      localObject = new b/a/a/a/k/p;
      ((b.a.a.a.k.p)localObject).<init>(locald);
      localArrayList.add(localObject);
    }
    return localArrayList;
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
    Object localObject2 = "Set-Cookie";
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
    return a((b.a.a.a.f[])localObject1, parame1);
  }
  
  public List a(List paramList)
  {
    Object localObject = "List of cookies";
    b.a.a.a.o.a.a(paramList, (String)localObject);
    int i = paramList.size();
    int j = 1;
    if (i > j)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList);
      b.a.a.a.f.f localf = a;
      Collections.sort((List)localObject, localf);
      paramList = (List)localObject;
    }
    boolean bool = this.d;
    if (bool) {}
    for (localObject = b(paramList);; localObject = c(paramList)) {
      return (List)localObject;
    }
  }
  
  public void a(b paramb, b.a.a.a.f.e parame)
  {
    b.a.a.a.o.a.a(paramb, "Cookie");
    Object localObject = paramb.a();
    int i = ((String)localObject).indexOf(' ');
    int j = -1;
    if (i != j)
    {
      localObject = new b/a/a/a/f/g;
      ((b.a.a.a.f.g)localObject).<init>("Cookie name may not contain blanks");
      throw ((Throwable)localObject);
    }
    String str = "$";
    boolean bool = ((String)localObject).startsWith(str);
    if (bool)
    {
      localObject = new b/a/a/a/f/g;
      ((b.a.a.a.f.g)localObject).<init>("Cookie name may not start with $");
      throw ((Throwable)localObject);
    }
    super.a(paramb, parame);
  }
  
  protected void a(d paramd, b paramb, int paramInt)
  {
    Object localObject = paramb.a();
    String str = paramb.b();
    a(paramd, (String)localObject, str, paramInt);
    localObject = paramb.g();
    boolean bool;
    if (localObject != null)
    {
      bool = paramb instanceof b.a.a.a.f.a;
      if (bool)
      {
        localObject = paramb;
        localObject = (b.a.a.a.f.a)paramb;
        str = "path";
        bool = ((b.a.a.a.f.a)localObject).b(str);
        if (bool)
        {
          paramd.a("; ");
          localObject = "$Path";
          str = ((b)paramb).g();
          a(paramd, (String)localObject, str, paramInt);
        }
      }
    }
    localObject = ((b)paramb).f();
    if (localObject != null)
    {
      bool = paramb instanceof b.a.a.a.f.a;
      if (bool)
      {
        localObject = paramb;
        localObject = (b.a.a.a.f.a)paramb;
        str = "domain";
        bool = ((b.a.a.a.f.a)localObject).b(str);
        if (bool)
        {
          paramd.a("; ");
          localObject = "$Domain";
          str = ((b)paramb).f();
          a(paramd, (String)localObject, str, paramInt);
        }
      }
    }
  }
  
  protected void a(d paramd, String paramString1, String paramString2, int paramInt)
  {
    char c1 = '"';
    paramd.a(paramString1);
    String str = "=";
    paramd.a(str);
    if (paramString2 != null)
    {
      if (paramInt <= 0) {
        break label47;
      }
      paramd.a(c1);
      paramd.a(paramString2);
      paramd.a(c1);
    }
    for (;;)
    {
      return;
      label47:
      paramd.a(paramString2);
    }
  }
  
  public b.a.a.a.e b()
  {
    return null;
  }
  
  public String toString()
  {
    return "rfc2109";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */