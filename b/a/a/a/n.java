package b.a.a.a;

import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

public final class n
  implements Serializable, Cloneable
{
  protected final String a;
  protected final String b;
  protected final int c;
  protected final String d;
  protected final InetAddress e;
  
  public n(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }
  
  public n(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = (String)a.b(paramString1, "Host name");
    this.a = ((String)localObject);
    localObject = Locale.ENGLISH;
    localObject = paramString1.toLowerCase((Locale)localObject);
    this.b = ((String)localObject);
    if (paramString2 != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString2.toLowerCase((Locale)localObject);
    }
    for (this.d = ((String)localObject);; this.d = ((String)localObject))
    {
      this.c = paramInt;
      this.e = null;
      return;
      localObject = "http";
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public String d()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.d;
    localStringBuilder.append(str);
    localStringBuilder.append("://");
    str = this.a;
    localStringBuilder.append(str);
    int i = this.c;
    int j = -1;
    if (i != j)
    {
      localStringBuilder.append(':');
      i = this.c;
      str = Integer.toString(i);
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public String e()
  {
    int i = this.c;
    int j = -1;
    if (i != j)
    {
      localObject = new java/lang/StringBuilder;
      j = this.a.length() + 6;
      ((StringBuilder)localObject).<init>(j);
      String str = this.a;
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(":");
      j = this.c;
      str = Integer.toString(j);
      ((StringBuilder)localObject).append(str);
    }
    for (Object localObject = ((StringBuilder)localObject).toString();; localObject = this.a) {
      return (String)localObject;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof n;
      if (bool2)
      {
        paramObject = (n)paramObject;
        String str1 = this.b;
        String str2 = ((n)paramObject).b;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.c;
          int j = ((n)paramObject).c;
          if (i == j)
          {
            str1 = this.d;
            str2 = ((n)paramObject).d;
            boolean bool3 = str1.equals(str2);
            if (bool3) {
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
    String str = this.b;
    int i = g.a(17, str);
    int j = this.c;
    i = g.a(i, j);
    str = this.d;
    return g.a(i, str);
  }
  
  public String toString()
  {
    return d();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */