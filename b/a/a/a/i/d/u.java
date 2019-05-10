package b.a.a.a.i.d;

import b.a.a.a.f;
import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.l;
import b.a.a.a.o.a;
import java.util.ArrayList;
import java.util.List;

public class u
  extends p
{
  private final String[] a;
  
  public u()
  {
    this(null);
  }
  
  public u(String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString != null) {
      arrayOfString = (String[])paramArrayOfString.clone();
    }
    for (this.a = arrayOfString;; this.a = arrayOfString)
    {
      Object localObject1 = new b/a/a/a/i/d/i;
      ((i)localObject1).<init>();
      a("path", (c)localObject1);
      localObject1 = new b/a/a/a/i/d/s;
      ((s)localObject1).<init>();
      a("domain", (c)localObject1);
      localObject1 = new b/a/a/a/i/d/j;
      ((j)localObject1).<init>();
      a("secure", (c)localObject1);
      localObject1 = new b/a/a/a/i/d/e;
      ((e)localObject1).<init>();
      a("comment", (c)localObject1);
      localObject1 = new b/a/a/a/i/d/g;
      Object localObject2 = this.a;
      ((g)localObject1).<init>((String[])localObject2);
      a("expires", (c)localObject1);
      return;
      int i = 1;
      arrayOfString = new String[i];
      localObject1 = null;
      localObject2 = "EEE, dd-MMM-yy HH:mm:ss z";
      arrayOfString[0] = localObject2;
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public List a(b.a.a.a.e parame, b.a.a.a.f.e parame1)
  {
    a.a(parame, "Header");
    a.a(parame1, "Cookie origin");
    Object localObject1 = parame.c();
    Object localObject2 = "Set-Cookie";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (!bool)
    {
      localObject1 = new b/a/a/a/f/l;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized cookie header '");
      localObject3 = parame.toString();
      localObject2 = (String)localObject3 + "'";
      ((l)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = t.a;
    bool = parame instanceof b.a.a.a.d;
    int i;
    if (bool)
    {
      localObject1 = parame;
      localObject2 = ((b.a.a.a.d)parame).a();
      localObject1 = new b/a/a/a/k/u;
      parame = (b.a.a.a.d)parame;
      i = parame.b();
      int j = ((b.a.a.a.o.d)localObject2).c();
      ((b.a.a.a.k.u)localObject1).<init>(i, j);
    }
    for (;;)
    {
      f[] arrayOff = new f[1];
      localObject1 = ((t)localObject3).a((b.a.a.a.o.d)localObject2, (b.a.a.a.k.u)localObject1);
      arrayOff[0] = localObject1;
      return a(arrayOff, parame1);
      localObject1 = parame.d();
      if (localObject1 == null)
      {
        localObject1 = new b/a/a/a/f/l;
        ((l)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      localObject2 = new b/a/a/a/o/d;
      i = ((String)localObject1).length();
      ((b.a.a.a.o.d)localObject2).<init>(i);
      ((b.a.a.a.o.d)localObject2).a((String)localObject1);
      localObject1 = new b/a/a/a/k/u;
      i = ((b.a.a.a.o.d)localObject2).c();
      ((b.a.a.a.k.u)localObject1).<init>(0, i);
    }
  }
  
  public List a(List paramList)
  {
    a.a(paramList, "List of cookies");
    b.a.a.a.o.d locald = new b/a/a/a/o/d;
    int i = paramList.size() * 20;
    locald.<init>(i);
    locald.a("Cookie");
    locald.a(": ");
    i = 0;
    Object localObject = null;
    int j = 0;
    b.a.a.a.k.p localp = null;
    for (;;)
    {
      i = paramList.size();
      if (j >= i) {
        break;
      }
      localObject = (b)paramList.get(j);
      if (j > 0)
      {
        str = "; ";
        locald.a(str);
      }
      String str = ((b)localObject).a();
      locald.a(str);
      localObject = ((b)localObject).b();
      if (localObject != null)
      {
        str = "=";
        locald.a(str);
        locald.a((String)localObject);
      }
      i = j + 1;
      j = i;
    }
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(1);
    localp = new b/a/a/a/k/p;
    localp.<init>(locald);
    ((List)localObject).add(localp);
    return (List)localObject;
  }
  
  public b.a.a.a.e b()
  {
    return null;
  }
  
  public String toString()
  {
    return "netscape";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */