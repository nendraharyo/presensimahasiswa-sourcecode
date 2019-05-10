package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import b.a.a.a.o.a;

public class f
  implements c
{
  public void a(b paramb, e parame)
  {
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    String str = parame.a();
    Object localObject1 = paramb.f();
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/f/g;
      ((g)localObject1).<init>("Cookie domain may not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = ".";
    int i = str.contains((CharSequence)localObject2);
    boolean bool;
    StringBuilder localStringBuilder;
    if (i != 0)
    {
      i = str.endsWith((String)localObject1);
      if (i == 0)
      {
        localObject2 = ".";
        i = ((String)localObject1).startsWith((String)localObject2);
        if (i != 0)
        {
          i = 1;
          int j = ((String)localObject1).length();
          localObject1 = ((String)localObject1).substring(i, j);
        }
        bool = str.equals(localObject1);
        if (!bool)
        {
          localObject2 = new b/a/a/a/f/g;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject1 = "Illegal domain attribute \"" + (String)localObject1 + "\". Domain of origin: \"" + str + "\"";
          ((g)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
    }
    else
    {
      bool = str.equals(localObject1);
      if (!bool)
      {
        localObject2 = new b/a/a/a/f/g;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Illegal domain attribute \"" + (String)localObject1 + "\". Domain of origin: \"" + str + "\"";
        ((g)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
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
    int i = 1;
    float f = Float.MIN_VALUE;
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    String str1 = parame.a();
    String str2 = paramb.f();
    if (str2 == null) {}
    for (;;)
    {
      return bool1;
      bool2 = str1.equals(str2);
      if (!bool2) {
        break;
      }
      bool1 = i;
    }
    Object localObject = ".";
    boolean bool2 = str2.startsWith((String)localObject);
    if (!bool2)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      char c = '.';
      localObject = ((StringBuilder)localObject).append(c);
      str2 = str2;
    }
    bool2 = str1.endsWith(str2);
    boolean bool3;
    if (!bool2)
    {
      str2 = str2.substring(i);
      bool3 = str1.equals(str2);
      if (!bool3) {}
    }
    else
    {
      bool3 = i;
    }
    for (;;)
    {
      bool1 = bool3;
      break;
      bool3 = false;
      str2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */