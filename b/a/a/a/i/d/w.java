package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import b.a.a.a.o.a;
import java.util.Locale;

public class w
  implements c
{
  public void a(b paramb, e parame)
  {
    int i = -1;
    int j = 46;
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    Object localObject1 = parame.a();
    String str = paramb.f();
    if (str == null)
    {
      localObject1 = new b/a/a/a/f/g;
      ((g)localObject1).<init>("Cookie domain may not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool1 = str.equals(localObject1);
    if (!bool1)
    {
      int k = str.indexOf(j);
      StringBuilder localStringBuilder;
      if (k == i)
      {
        localObject2 = new b/a/a/a/f/g;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Domain attribute \"" + str + "\" does not match the host \"" + (String)localObject1 + "\"";
        ((g)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      Object localObject2 = ".";
      boolean bool2 = str.startsWith((String)localObject2);
      if (!bool2)
      {
        localObject1 = new b/a/a/a/f/g;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: domain must start with a dot";
        ((g)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
      int m = str.indexOf(j, 1);
      if (m >= 0)
      {
        n = str.length() + -1;
        if (m != n) {}
      }
      else
      {
        localObject1 = new b/a/a/a/f/g;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: domain must contain an embedded dot";
        ((g)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
      localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      boolean bool3 = ((String)localObject1).endsWith(str);
      if (!bool3)
      {
        localObject2 = new b/a/a/a/f/g;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Illegal domain attribute \"" + str + "\". Domain of origin: \"" + (String)localObject1 + "\"";
        ((g)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      bool3 = false;
      localObject2 = null;
      int n = ((String)localObject1).length();
      int i1 = str.length();
      n -= i1;
      localObject1 = ((String)localObject1).substring(0, n);
      int i2 = ((String)localObject1).indexOf(j);
      if (i2 != i)
      {
        localObject1 = new b/a/a/a/f/g;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Domain attribute \"" + str + "\" violates RFC 2109: host minus domain may not contain any dots";
        ((g)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public void a(m paramm, String paramString)
  {
    Object localObject = "Cookie";
    a.a(paramm, (String)localObject);
    if (paramString == null)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Missing value for domain attribute");
      throw ((Throwable)localObject);
    }
    localObject = paramString.trim();
    int i = ((String)localObject).length();
    if (i == 0)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Blank value for domain attribute");
      throw ((Throwable)localObject);
    }
    paramm.d(paramString);
  }
  
  public boolean b(b paramb, e parame)
  {
    boolean bool1 = false;
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    String str1 = parame.a();
    String str2 = paramb.f();
    if (str2 == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = str1.equals(str2);
      if (!bool2)
      {
        String str3 = ".";
        bool2 = str2.startsWith(str3);
        if (bool2)
        {
          boolean bool3 = str1.endsWith(str2);
          if (!bool3) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */