package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.c;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import b.a.a.a.f.n;
import java.util.StringTokenizer;

public class ad
  implements c
{
  private static boolean a(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool = false;
    int i = paramArrayOfInt.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        int k = paramArrayOfInt[j];
        if (paramInt == k) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  private static int[] a(String paramString)
  {
    Object localObject1 = new java/util/StringTokenizer;
    ((StringTokenizer)localObject1).<init>(paramString, ",");
    Object localObject2 = new int[((StringTokenizer)localObject1).countTokens()];
    int i = 0;
    l locall = null;
    for (;;)
    {
      try
      {
        boolean bool = ((StringTokenizer)localObject1).hasMoreTokens();
        if (!bool) {
          break;
        }
        String str2 = ((StringTokenizer)localObject1).nextToken();
        str2 = str2.trim();
        int j = Integer.parseInt(str2);
        localObject2[i] = j;
        j = localObject2[i];
        if (j < 0)
        {
          locall = new b/a/a/a/f/l;
          localObject1 = "Invalid Port attribute.";
          locall.<init>((String)localObject1);
          throw locall;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject1 = new b/a/a/a/f/l;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Invalid Port attribute: ");
        String str1 = localNumberFormatException.getMessage();
        str1 = str1;
        ((l)localObject1).<init>(str1);
        throw ((Throwable)localObject1);
      }
      i += 1;
    }
    return (int[])localObject2;
  }
  
  public void a(b paramb, e parame)
  {
    b.a.a.a.o.a.a(paramb, "Cookie");
    Object localObject = "Cookie origin";
    b.a.a.a.o.a.a(parame, (String)localObject);
    int i = parame.c();
    boolean bool = paramb instanceof b.a.a.a.f.a;
    if (bool)
    {
      localObject = paramb;
      localObject = (b.a.a.a.f.a)paramb;
      String str = "port";
      bool = ((b.a.a.a.f.a)localObject).b(str);
      if (bool)
      {
        localObject = ((b)paramb).h();
        bool = a(i, (int[])localObject);
        if (!bool)
        {
          localObject = new b/a/a/a/f/g;
          ((g)localObject).<init>("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
          throw ((Throwable)localObject);
        }
      }
    }
  }
  
  public void a(m paramm, String paramString)
  {
    Object localObject = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject);
    boolean bool = paramm instanceof n;
    if (bool)
    {
      paramm = (n)paramm;
      if (paramString != null)
      {
        localObject = paramString.trim();
        int i = ((String)localObject).length();
        if (i > 0)
        {
          localObject = a(paramString);
          paramm.a((int[])localObject);
        }
      }
    }
  }
  
  public boolean b(b paramb, e parame)
  {
    b.a.a.a.o.a.a(paramb, "Cookie");
    Object localObject = "Cookie origin";
    b.a.a.a.o.a.a(parame, (String)localObject);
    int i = parame.c();
    boolean bool = paramb instanceof b.a.a.a.f.a;
    if (bool)
    {
      localObject = paramb;
      localObject = (b.a.a.a.f.a)paramb;
      String str = "port";
      bool = ((b.a.a.a.f.a)localObject).b(str);
      if (bool)
      {
        localObject = ((b)paramb).h();
        if (localObject == null)
        {
          bool = false;
          localObject = null;
        }
      }
    }
    for (;;)
    {
      return bool;
      localObject = ((b)paramb).h();
      bool = a(i, (int[])localObject);
      if (!bool)
      {
        bool = false;
        localObject = null;
      }
      else
      {
        bool = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\ad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */