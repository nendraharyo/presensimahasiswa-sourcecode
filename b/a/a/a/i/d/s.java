package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.o.a;
import java.util.Locale;
import java.util.StringTokenizer;

public class s
  extends f
{
  private static boolean a(String paramString)
  {
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toUpperCase((Locale)localObject);
    String str = ".COM";
    boolean bool1 = ((String)localObject).endsWith(str);
    if (!bool1)
    {
      str = ".EDU";
      bool1 = ((String)localObject).endsWith(str);
      if (!bool1)
      {
        str = ".NET";
        bool1 = ((String)localObject).endsWith(str);
        if (!bool1)
        {
          str = ".GOV";
          bool1 = ((String)localObject).endsWith(str);
          if (!bool1)
          {
            str = ".MIL";
            bool1 = ((String)localObject).endsWith(str);
            if (!bool1)
            {
              str = ".ORG";
              bool1 = ((String)localObject).endsWith(str);
              if (!bool1)
              {
                str = ".INT";
                bool2 = ((String)localObject).endsWith(str);
                if (!bool2) {
                  break label109;
                }
              }
            }
          }
        }
      }
    }
    boolean bool2 = true;
    for (;;)
    {
      return bool2;
      label109:
      bool2 = false;
      localObject = null;
    }
  }
  
  public void a(b paramb, e parame)
  {
    super.a(paramb, parame);
    Object localObject1 = parame.a();
    String str = paramb.f();
    Object localObject2 = ".";
    boolean bool1 = ((String)localObject1).contains((CharSequence)localObject2);
    if (bool1)
    {
      localObject1 = new java/util/StringTokenizer;
      localObject2 = ".";
      ((StringTokenizer)localObject1).<init>(str, (String)localObject2);
      int i = ((StringTokenizer)localObject1).countTokens();
      boolean bool2 = a(str);
      int j;
      if (bool2)
      {
        j = 2;
        if (i < j)
        {
          localObject1 = new b/a/a/a/f/g;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Domain attribute \"" + str + "\" violates the Netscape cookie specification for " + "special domains";
          ((g)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        j = 3;
        if (i < j)
        {
          localObject1 = new b/a/a/a/f/g;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Domain attribute \"" + str + "\" violates the Netscape cookie specification";
          ((g)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
  }
  
  public boolean b(b paramb, e parame)
  {
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    String str1 = parame.a();
    String str2 = paramb.f();
    boolean bool;
    if (str2 == null)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      bool = str1.endsWith(str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */