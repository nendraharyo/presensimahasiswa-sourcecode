package b.a.a.a;

import b.a.a.a.o.a;
import java.io.Serializable;

public class ac
  implements Serializable, Cloneable
{
  protected final String d;
  protected final int e;
  protected final int f;
  
  public ac(String paramString, int paramInt1, int paramInt2)
  {
    String str = (String)a.a(paramString, "Protocol name");
    this.d = str;
    int i = a.b(paramInt1, "Protocol minor version");
    this.e = i;
    i = a.b(paramInt2, "Protocol minor version");
    this.f = i;
  }
  
  public ac a(int paramInt1, int paramInt2)
  {
    int i = this.e;
    if (paramInt1 == i)
    {
      i = this.f;
      if (paramInt2 != i) {}
    }
    for (;;)
    {
      return this;
      ac localac = new b/a/a/a/ac;
      String str = this.d;
      localac.<init>(str, paramInt1, paramInt2);
      this = localac;
    }
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public boolean a(ac paramac)
  {
    String str1;
    boolean bool;
    if (paramac != null)
    {
      str1 = this.d;
      String str2 = paramac.d;
      bool = str1.equals(str2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public final int b()
  {
    return this.e;
  }
  
  public int b(ac paramac)
  {
    a.a(paramac, "Protocol version");
    String str1 = this.d;
    String str2 = paramac.d;
    boolean bool = str1.equals(str2);
    str2 = "Versions for different protocols cannot be compared: %s %s";
    int j = 2;
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = this;
    int k = 1;
    arrayOfObject[k] = paramac;
    a.a(bool, str2, arrayOfObject);
    int i = b();
    int m = paramac.b();
    i -= m;
    if (i == 0)
    {
      i = c();
      m = paramac.c();
      i -= m;
    }
    return i;
  }
  
  public final int c()
  {
    return this.f;
  }
  
  public final boolean c(ac paramac)
  {
    boolean bool = a(paramac);
    if (bool)
    {
      i = b(paramac);
      if (i > 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ac;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ac)paramObject;
        String str1 = this.d;
        String str2 = ((ac)paramObject).d;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.e;
          int j = ((ac)paramObject).e;
          if (i == j)
          {
            i = this.f;
            j = ((ac)paramObject).f;
            if (i == j) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = this.d.hashCode();
    int j = this.e * 100000;
    i ^= j;
    j = this.f;
    return i ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.d;
    localStringBuilder.append(str);
    localStringBuilder.append('/');
    str = Integer.toString(this.e);
    localStringBuilder.append(str);
    localStringBuilder.append('.');
    str = Integer.toString(this.f);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */