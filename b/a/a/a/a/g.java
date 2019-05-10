package b.a.a.a.a;

import b.a.a.a.n;
import java.util.Locale;

public class g
{
  public static final String a = null;
  public static final String b = null;
  public static final String c = null;
  public static final g d;
  private final String e;
  private final String f;
  private final String g;
  private final int h;
  
  static
  {
    g localg = new b/a/a/a/a/g;
    String str1 = a;
    String str2 = b;
    String str3 = c;
    localg.<init>(str1, -1, str2, str3);
    d = localg;
  }
  
  public g(n paramn, String paramString1, String paramString2)
  {
    this(str, i, paramString1, paramString2);
  }
  
  public g(String paramString, int paramInt)
  {
    this(paramString, paramInt, str1, str2);
  }
  
  public g(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (paramString1 == null)
    {
      localObject = a;
      this.g = ((String)localObject);
      if (paramInt < 0) {
        paramInt = -1;
      }
      this.h = paramInt;
      if (paramString2 == null) {
        paramString2 = b;
      }
      this.f = paramString2;
      if (paramString3 != null) {
        break label76;
      }
    }
    for (Object localObject = c;; localObject = paramString3.toUpperCase((Locale)localObject))
    {
      this.e = ((String)localObject);
      return;
      localObject = Locale.ENGLISH;
      localObject = paramString1.toLowerCase((Locale)localObject);
      break;
      label76:
      localObject = Locale.ENGLISH;
    }
  }
  
  public int a(g paramg)
  {
    int i = -1;
    int j = 0;
    String str1 = this.e;
    String str2 = paramg.e;
    boolean bool1 = b.a.a.a.o.g.a(str1, str2);
    if (bool1)
    {
      j = 1;
      str1 = this.f;
      str2 = paramg.f;
      bool1 = b.a.a.a.o.g.a(str1, str2);
      if (!bool1) {
        break label159;
      }
      j += 2;
      label62:
      int k = this.h;
      int n = paramg.h;
      if (k != n) {
        break label200;
      }
      j += 4;
      label85:
      str1 = this.g;
      str2 = paramg.g;
      boolean bool2 = b.a.a.a.o.g.a(str1, str2);
      if (!bool2) {
        break label229;
      }
      j += 8;
    }
    for (;;)
    {
      return j;
      str1 = this.e;
      str2 = c;
      if (str1 == str2) {
        break;
      }
      str1 = paramg.e;
      str2 = c;
      if (str1 == str2) {
        break;
      }
      j = i;
      continue;
      label159:
      str1 = this.f;
      str2 = b;
      if (str1 == str2) {
        break label62;
      }
      str1 = paramg.f;
      str2 = b;
      if (str1 == str2) {
        break label62;
      }
      j = i;
      continue;
      label200:
      int m = this.h;
      if (m == i) {
        break label85;
      }
      m = paramg.h;
      if (m == i) {
        break label85;
      }
      j = i;
      continue;
      label229:
      str1 = this.g;
      str2 = a;
      if (str1 != str2)
      {
        str1 = paramg.g;
        str2 = a;
        if (str1 != str2) {
          j = i;
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == null) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        boolean bool2 = paramObject instanceof g;
        if (!bool2)
        {
          bool1 = super.equals(paramObject);
        }
        else
        {
          paramObject = (g)paramObject;
          String str1 = this.g;
          String str2 = ((g)paramObject).g;
          bool2 = b.a.a.a.o.g.a(str1, str2);
          if (bool2)
          {
            int i = this.h;
            int j = ((g)paramObject).h;
            if (i == j)
            {
              str1 = this.f;
              str2 = ((g)paramObject).f;
              boolean bool3 = b.a.a.a.o.g.a(str1, str2);
              if (bool3)
              {
                str1 = this.e;
                str2 = ((g)paramObject).e;
                bool3 = b.a.a.a.o.g.a(str1, str2);
                if (bool3) {
                  continue;
                }
              }
            }
          }
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    String str = this.g;
    int i = b.a.a.a.o.g.a(17, str);
    int j = this.h;
    i = b.a.a.a.o.g.a(i, j);
    str = this.f;
    i = b.a.a.a.o.g.a(i, str);
    str = this.e;
    return b.a.a.a.o.g.a(i, str);
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.e;
    if (str != null)
    {
      str = this.e;
      Locale localLocale = Locale.ENGLISH;
      str = str.toUpperCase(localLocale);
      localStringBuilder.append(str);
      char c2 = ' ';
      localStringBuilder.append(c2);
    }
    str = this.f;
    if (str != null)
    {
      localStringBuilder.append(c1);
      str = this.f;
      localStringBuilder.append(str);
      localStringBuilder.append(c1);
    }
    for (;;)
    {
      str = this.g;
      if (str != null)
      {
        localStringBuilder.append('@');
        str = this.g;
        localStringBuilder.append(str);
        int i = this.h;
        if (i >= 0)
        {
          localStringBuilder.append(':');
          i = this.h;
          localStringBuilder.append(i);
        }
      }
      return localStringBuilder.toString();
      str = "<any realm>";
      localStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */