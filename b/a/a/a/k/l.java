package b.a.a.a.k;

import b.a.a.a.o.a;
import b.a.a.a.o.g;
import b.a.a.a.y;
import java.io.Serializable;

public class l
  implements y, Serializable, Cloneable
{
  private final String a;
  private final String b;
  
  public l(String paramString1, String paramString2)
  {
    String str = (String)a.a(paramString1, "Name");
    this.a = str;
    this.b = paramString2;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof y;
      if (bool2)
      {
        paramObject = (l)paramObject;
        String str1 = this.a;
        String str2 = ((l)paramObject).a;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          str1 = this.b;
          str2 = ((l)paramObject).b;
          bool2 = g.a(str1, str2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    String str = this.a;
    int i = g.a(17, str);
    str = this.b;
    return g.a(i, str);
  }
  
  public String toString()
  {
    String str = this.b;
    if (str == null) {}
    StringBuilder localStringBuilder;
    for (str = this.a;; str = localStringBuilder.toString())
    {
      return str;
      int i = this.a.length() + 1;
      int j = this.b.length();
      i += j;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      str = this.a;
      localStringBuilder.append(str);
      localStringBuilder.append("=");
      str = this.b;
      localStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */