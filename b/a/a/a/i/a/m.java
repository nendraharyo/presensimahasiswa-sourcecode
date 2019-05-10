package b.a.a.a.i.a;

import b.a.a.a.a.o;
import b.a.a.a.c;
import b.a.a.a.k.r;
import b.a.a.a.k.u;
import b.a.a.a.l.e;
import b.a.a.a.o.d;
import b.a.a.a.q;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class m
  extends a
{
  private final Map a;
  private final Charset b;
  
  public m(Charset paramCharset)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
    if (paramCharset != null) {}
    for (;;)
    {
      this.b = paramCharset;
      return;
      paramCharset = c.b;
    }
  }
  
  String a(q paramq)
  {
    Object localObject = paramq.getParams();
    String str = "http.auth.credential-charset";
    localObject = (String)((e)localObject).a(str);
    if (localObject == null) {
      localObject = g().name();
    }
    return (String)localObject;
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {}
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = (String)((Map)localObject1).get(localObject2))
    {
      return (String)localObject1;
      localObject1 = this.a;
      localObject2 = Locale.ENGLISH;
      localObject2 = paramString.toLowerCase((Locale)localObject2);
    }
  }
  
  protected void a(d paramd, int paramInt1, int paramInt2)
  {
    Object localObject1 = b.a.a.a.k.f.b;
    Object localObject2 = new b/a/a/a/k/u;
    int i = paramd.c();
    ((u)localObject2).<init>(paramInt1, i);
    localObject2 = ((r)localObject1).a(paramd, (u)localObject2);
    int j = localObject2.length;
    if (j == 0)
    {
      localObject1 = new b/a/a/a/a/o;
      ((o)localObject1).<init>("Authentication challenge is empty");
      throw ((Throwable)localObject1);
    }
    this.a.clear();
    i = localObject2.length;
    j = 0;
    localObject1 = null;
    while (j < i)
    {
      String str1 = localObject2[j];
      Map localMap = this.a;
      String str2 = str1.a();
      Locale localLocale = Locale.ENGLISH;
      str2 = str2.toLowerCase(localLocale);
      str1 = str1.b();
      localMap.put(str2, str1);
      j += 1;
    }
  }
  
  public String b()
  {
    return a("realm");
  }
  
  public Charset g()
  {
    return this.b;
  }
  
  protected Map h()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */