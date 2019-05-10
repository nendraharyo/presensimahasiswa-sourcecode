package b.a.a.a.e.c;

import b.a.a.a.o.a;
import java.util.Locale;

public final class e
{
  private final String a;
  private final j b;
  private final int c;
  private final boolean d;
  private String e;
  
  public e(String paramString, int paramInt, j paramj)
  {
    Object localObject = "Scheme name";
    a.a(paramString, (String)localObject);
    boolean bool;
    if (paramInt > 0)
    {
      int j = (char)-1;
      if (paramInt <= j)
      {
        j = i;
        String str = "Port is invalid";
        a.a(j, str);
        a.a(paramj, "Socket factory");
        localObject = Locale.ENGLISH;
        localObject = paramString.toLowerCase((Locale)localObject);
        this.a = ((String)localObject);
        this.c = paramInt;
        bool = paramj instanceof f;
        if (!bool) {
          break label113;
        }
        this.d = i;
        this.b = ((j)paramj);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label113:
      bool = paramj instanceof b;
      if (bool)
      {
        this.d = i;
        localObject = new b/a/a/a/e/c/h;
        paramj = (b)paramj;
        ((h)localObject).<init>(paramj);
        this.b = ((j)localObject);
      }
      else
      {
        this.d = false;
        this.b = paramj;
      }
    }
  }
  
  public e(String paramString, l paraml, int paramInt)
  {
    a.a(paramString, "Scheme name");
    Object localObject = "Socket factory";
    a.a(paraml, (String)localObject);
    boolean bool;
    if (paramInt > 0)
    {
      int j = (char)-1;
      if (paramInt <= j)
      {
        j = i;
        String str = "Port is invalid";
        a.a(j, str);
        localObject = Locale.ENGLISH;
        localObject = paramString.toLowerCase((Locale)localObject);
        this.a = ((String)localObject);
        bool = paraml instanceof c;
        if (!bool) {
          break label127;
        }
        localObject = new b/a/a/a/e/c/g;
        paraml = (c)paraml;
        ((g)localObject).<init>(paraml);
        this.b = ((j)localObject);
      }
    }
    for (this.d = i;; this.d = false)
    {
      this.c = paramInt;
      return;
      bool = false;
      localObject = null;
      break;
      label127:
      localObject = new b/a/a/a/e/c/k;
      ((k)localObject).<init>(paraml);
      this.b = ((j)localObject);
    }
  }
  
  public final int a()
  {
    return this.c;
  }
  
  public final int a(int paramInt)
  {
    if (paramInt <= 0) {
      paramInt = this.c;
    }
    return paramInt;
  }
  
  public final j b()
  {
    return this.b;
  }
  
  public final String c()
  {
    return this.a;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof e;
      if (bool2)
      {
        paramObject = (e)paramObject;
        String str1 = this.a;
        String str2 = ((e)paramObject).a;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.c;
          int j = ((e)paramObject).c;
          if (i == j)
          {
            boolean bool3 = this.d;
            boolean bool4 = ((e)paramObject).d;
            if (bool3 == bool4) {
              continue;
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.c;
    int j = b.a.a.a.o.g.a(17, i);
    String str = this.a;
    j = b.a.a.a.o.g.a(j, str);
    boolean bool = this.d;
    return b.a.a.a.o.g.a(j, bool);
  }
  
  public final String toString()
  {
    Object localObject = this.e;
    if (localObject == null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.a;
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(':');
      int i = this.c;
      str = Integer.toString(i);
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
      this.e = ((String)localObject);
    }
    return this.e;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\c\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */