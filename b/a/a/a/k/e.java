package b.a.a.a.k;

import b.a.a.a.f;
import b.a.a.a.o.a;
import b.a.a.a.o.d;
import b.a.a.a.y;

public class e
{
  public static final e a;
  public static final e b;
  
  static
  {
    e locale = new b/a/a/a/k/e;
    locale.<init>();
    a = locale;
    locale = new b/a/a/a/k/e;
    locale.<init>();
    b = locale;
  }
  
  protected int a(f paramf)
  {
    int i = 0;
    int j;
    String str1;
    if (paramf == null)
    {
      j = 0;
      str1 = null;
    }
    for (;;)
    {
      return j;
      str1 = paramf.a();
      j = str1.length();
      String str2 = paramf.b();
      if (str2 != null)
      {
        k = str2.length() + 3;
        j += k;
      }
      int k = paramf.d();
      if (k > 0) {
        while (i < k)
        {
          y localy = paramf.a(i);
          int m = a(localy) + 2;
          j += m;
          i += 1;
        }
      }
    }
  }
  
  protected int a(y paramy)
  {
    int i;
    String str1;
    if (paramy == null)
    {
      i = 0;
      str1 = null;
    }
    for (;;)
    {
      return i;
      str1 = paramy.a();
      i = str1.length();
      String str2 = paramy.b();
      if (str2 != null)
      {
        int j = str2.length() + 3;
        i += j;
      }
    }
  }
  
  protected int a(y[] paramArrayOfy)
  {
    int i = 0;
    int j;
    int k;
    if (paramArrayOfy != null)
    {
      j = paramArrayOfy.length;
      k = 1;
      if (j >= k) {
        break label20;
      }
    }
    for (;;)
    {
      return i;
      label20:
      j = (paramArrayOfy.length + -1) * 2;
      int m = paramArrayOfy.length;
      i = j;
      j = 0;
      while (j < m)
      {
        y localy = paramArrayOfy[j];
        k = a(localy) + i;
        j += 1;
        i = k;
      }
    }
  }
  
  public d a(d paramd, f paramf, boolean paramBoolean)
  {
    String str = "Header element";
    a.a(paramf, str);
    int i = a(paramf);
    if (paramd == null)
    {
      paramd = new b/a/a/a/o/d;
      paramd.<init>(i);
    }
    for (;;)
    {
      str = paramf.a();
      paramd.a(str);
      str = paramf.b();
      if (str != null)
      {
        char c = '=';
        paramd.a(c);
        a(paramd, str, paramBoolean);
      }
      int j = paramf.d();
      if (j <= 0) {
        break;
      }
      i = 0;
      str = null;
      while (i < j)
      {
        paramd.a("; ");
        y localy = paramf.a(i);
        a(paramd, localy, paramBoolean);
        i += 1;
      }
      paramd.b(i);
    }
    return paramd;
  }
  
  public d a(d paramd, y paramy, boolean paramBoolean)
  {
    String str = "Name / value pair";
    a.a(paramy, str);
    int i = a(paramy);
    if (paramd == null)
    {
      paramd = new b/a/a/a/o/d;
      paramd.<init>(i);
    }
    for (;;)
    {
      str = paramy.a();
      paramd.a(str);
      str = paramy.b();
      if (str != null)
      {
        char c = '=';
        paramd.a(c);
        a(paramd, str, paramBoolean);
      }
      return paramd;
      paramd.b(i);
    }
  }
  
  public d a(d paramd, y[] paramArrayOfy, boolean paramBoolean)
  {
    String str = "Header parameter array";
    a.a(paramArrayOfy, str);
    int i = a(paramArrayOfy);
    if (paramd == null)
    {
      paramd = new b/a/a/a/o/d;
      paramd.<init>(i);
    }
    for (;;)
    {
      i = 0;
      str = null;
      for (;;)
      {
        int j = paramArrayOfy.length;
        if (i >= j) {
          break;
        }
        if (i > 0)
        {
          localObject = "; ";
          paramd.a((String)localObject);
        }
        Object localObject = paramArrayOfy[i];
        a(paramd, (y)localObject, paramBoolean);
        i += 1;
      }
      paramd.b(i);
    }
    return paramd;
  }
  
  protected void a(d paramd, String paramString, boolean paramBoolean)
  {
    char c1 = '"';
    int i = 0;
    int j;
    if (!paramBoolean)
    {
      j = 0;
      for (;;)
      {
        int k = paramString.length();
        if ((j >= k) || (paramBoolean)) {
          break;
        }
        char c2 = paramString.charAt(j);
        paramBoolean = a(c2);
        j += 1;
      }
    }
    if (paramBoolean) {
      paramd.a(c1);
    }
    for (;;)
    {
      j = paramString.length();
      if (i >= j) {
        break;
      }
      j = paramString.charAt(i);
      boolean bool = b(j);
      if (bool)
      {
        char c3 = '\\';
        paramd.a(c3);
      }
      paramd.a(j);
      i += 1;
    }
    if (paramBoolean) {
      paramd.a(c1);
    }
  }
  
  protected boolean a(char paramChar)
  {
    String str = " ;,:@()<>\\\"/[]?={}\t";
    int i = str.indexOf(paramChar);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  protected boolean b(char paramChar)
  {
    String str = "\"\\";
    int i = str.indexOf(paramChar);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */