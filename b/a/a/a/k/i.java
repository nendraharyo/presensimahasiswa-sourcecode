package b.a.a.a.k;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.af;
import b.a.a.a.e;
import b.a.a.a.o.a;

public class i
  implements s
{
  public static final i a;
  public static final i b;
  
  static
  {
    i locali = new b/a/a/a/k/i;
    locali.<init>();
    a = locali;
    locali = new b/a/a/a/k/i;
    locali.<init>();
    b = locali;
  }
  
  protected int a(ac paramac)
  {
    return paramac.a().length() + 4;
  }
  
  protected b.a.a.a.o.d a(b.a.a.a.o.d paramd)
  {
    if (paramd != null) {
      paramd.a();
    }
    for (;;)
    {
      return paramd;
      paramd = new b/a/a/a/o/d;
      int i = 64;
      paramd.<init>(i);
    }
  }
  
  public b.a.a.a.o.d a(b.a.a.a.o.d paramd, ac paramac)
  {
    String str = "Protocol version";
    a.a(paramac, str);
    int i = a(paramac);
    if (paramd == null)
    {
      paramd = new b/a/a/a/o/d;
      paramd.<init>(i);
    }
    for (;;)
    {
      str = paramac.a();
      paramd.a(str);
      paramd.a('/');
      str = Integer.toString(paramac.b());
      paramd.a(str);
      paramd.a('.');
      str = Integer.toString(paramac.c());
      paramd.a(str);
      return paramd;
      paramd.b(i);
    }
  }
  
  public b.a.a.a.o.d a(b.a.a.a.o.d paramd, ae paramae)
  {
    a.a(paramae, "Request line");
    b.a.a.a.o.d locald = a(paramd);
    b(locald, paramae);
    return locald;
  }
  
  public b.a.a.a.o.d a(b.a.a.a.o.d paramd, af paramaf)
  {
    a.a(paramaf, "Status line");
    b.a.a.a.o.d locald = a(paramd);
    b(locald, paramaf);
    return locald;
  }
  
  public b.a.a.a.o.d a(b.a.a.a.o.d paramd, e parame)
  {
    Object localObject = "Header";
    a.a(parame, (String)localObject);
    boolean bool = parame instanceof b.a.a.a.d;
    if (bool)
    {
      parame = (b.a.a.a.d)parame;
      localObject = parame.a();
    }
    for (;;)
    {
      return (b.a.a.a.o.d)localObject;
      localObject = a(paramd);
      b((b.a.a.a.o.d)localObject, parame);
    }
  }
  
  protected void b(b.a.a.a.o.d paramd, ae paramae)
  {
    char c = ' ';
    Object localObject = paramae.a();
    String str = paramae.c();
    int i = ((String)localObject).length() + 1;
    int j = str.length();
    i = i + j + 1;
    ac localac = paramae.b();
    j = a(localac);
    i += j;
    paramd.b(i);
    paramd.a((String)localObject);
    paramd.a(c);
    paramd.a(str);
    paramd.a(c);
    localObject = paramae.b();
    a(paramd, (ac)localObject);
  }
  
  protected void b(b.a.a.a.o.d paramd, af paramaf)
  {
    char c = ' ';
    Object localObject = paramaf.a();
    int i = a((ac)localObject) + 1 + 3 + 1;
    String str = paramaf.c();
    if (str != null)
    {
      int j = str.length();
      i += j;
    }
    paramd.b(i);
    localObject = paramaf.a();
    a(paramd, (ac)localObject);
    paramd.a(c);
    i = paramaf.b();
    localObject = Integer.toString(i);
    paramd.a((String)localObject);
    paramd.a(c);
    if (str != null) {
      paramd.a(str);
    }
  }
  
  protected void b(b.a.a.a.o.d paramd, e parame)
  {
    String str1 = parame.c();
    String str2 = parame.d();
    int i = str1.length() + 2;
    if (str2 != null)
    {
      int j = str2.length();
      i += j;
    }
    paramd.b(i);
    paramd.a(str1);
    String str3 = ": ";
    paramd.a(str3);
    if (str2 != null) {
      paramd.a(str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */