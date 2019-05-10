package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import java.util.Locale;

public class ac
  implements c
{
  public void a(b paramb, e parame)
  {
    int i = 46;
    b.a.a.a.o.a.a(paramb, "Cookie");
    b.a.a.a.o.a.a(parame, "Cookie origin");
    Object localObject1 = parame.a();
    Object localObject2 = Locale.ENGLISH;
    localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
    localObject1 = paramb.f();
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/f/g;
      ((g)localObject1).<init>("Invalid cookie state: domain not specified");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramb.f();
    Object localObject3 = Locale.ENGLISH;
    localObject3 = ((String)localObject1).toLowerCase((Locale)localObject3);
    boolean bool1 = paramb instanceof b.a.a.a.f.a;
    String str;
    if (bool1)
    {
      localObject1 = paramb;
      localObject1 = (b.a.a.a.f.a)paramb;
      str = "domain";
      bool1 = ((b.a.a.a.f.a)localObject1).b(str);
      if (bool1)
      {
        localObject1 = ".";
        bool1 = ((String)localObject3).startsWith((String)localObject1);
        if (!bool1)
        {
          localObject1 = new b/a/a/a/f/g;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
          localObject3 = ((b)paramb).f();
          localObject2 = (String)localObject3 + "\" violates RFC 2109: domain must start with a dot";
          ((g)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        int j = ((String)localObject3).indexOf(i, 1);
        if (j >= 0)
        {
          m = ((String)localObject3).length() + -1;
          if (j != m) {}
        }
        else
        {
          localObject1 = ".local";
          bool2 = ((String)localObject3).equals(localObject1);
          if (!bool2)
          {
            localObject1 = new b/a/a/a/f/g;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
            localObject3 = ((b)paramb).f();
            localObject2 = (String)localObject3 + "\" violates RFC 2965: the value contains no embedded dots " + "and the value is not .local";
            ((g)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        boolean bool2 = a((String)localObject2, (String)localObject3);
        if (!bool2)
        {
          localObject1 = new b/a/a/a/f/g;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
          localObject3 = ((b)paramb).f();
          localObject2 = (String)localObject3 + "\" violates RFC 2965: effective host name does not " + "domain-match domain attribute.";
          ((g)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        int m = ((String)localObject2).length();
        int n = ((String)localObject3).length();
        n = m - n;
        localObject1 = ((String)localObject2).substring(0, n);
        int k = ((String)localObject1).indexOf(i);
        int i1 = -1;
        if (k == i1) {
          return;
        }
        localObject1 = new b/a/a/a/f/g;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Domain attribute \"");
        localObject3 = ((b)paramb).f();
        localObject2 = (String)localObject3 + "\" violates RFC 2965: " + "effective host minus domain may not contain any dots";
        ((g)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = ((b)paramb).f();
    boolean bool3 = ((String)localObject1).equals(localObject2);
    if (!bool3)
    {
      localObject1 = new b/a/a/a/f/g;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Illegal domain attribute: \"");
      str = ((b)paramb).f();
      localObject2 = str + "\"." + "Domain of origin: \"" + (String)localObject2 + "\"";
      ((g)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public void a(m paramm, String paramString)
  {
    Object localObject1 = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new b/a/a/a/f/l;
      ((l)localObject1).<init>("Missing value for domain attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramString.trim();
    int i = ((String)localObject1).length();
    if (i == 0)
    {
      localObject1 = new b/a/a/a/f/l;
      ((l)localObject1).<init>("Blank value for domain attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = Locale.ENGLISH;
    localObject1 = paramString.toLowerCase((Locale)localObject1);
    Object localObject2 = ".";
    boolean bool = paramString.startsWith((String)localObject2);
    if (!bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      char c = '.';
      localObject2 = ((StringBuilder)localObject2).append(c);
      localObject1 = (String)localObject1;
    }
    paramm.d((String)localObject1);
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    boolean bool = paramString1.equals(paramString2);
    String str;
    if (!bool)
    {
      str = ".";
      bool = paramString2.startsWith(str);
      if (bool)
      {
        bool = paramString1.endsWith(paramString2);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public boolean b(b paramb, e parame)
  {
    boolean bool1 = false;
    b.a.a.a.o.a.a(paramb, "Cookie");
    b.a.a.a.o.a.a(parame, "Cookie origin");
    String str = parame.a();
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    localObject = paramb.f();
    boolean bool2 = a(str, (String)localObject);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      int i = str.length();
      int j = ((String)localObject).length();
      j = i - j;
      str = str.substring(0, j);
      int k = str.indexOf('.');
      j = -1;
      if (k == j) {
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */