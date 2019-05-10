package b.a.a.a.k;

import b.a.a.a.f;
import b.a.a.a.o.a;
import b.a.a.a.o.g;
import b.a.a.a.y;

public class c
  implements f, Cloneable
{
  private final String a;
  private final String b;
  private final y[] c;
  
  public c(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }
  
  public c(String paramString1, String paramString2, y[] paramArrayOfy)
  {
    Object localObject = (String)a.a(paramString1, "Name");
    this.a = ((String)localObject);
    this.b = paramString2;
    if (paramArrayOfy != null) {}
    for (this.c = paramArrayOfy;; this.c = ((y[])localObject))
    {
      return;
      localObject = new y[0];
    }
  }
  
  public y a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public y a(String paramString)
  {
    a.a(paramString, "Name");
    y[] arrayOfy = this.c;
    int i = arrayOfy.length;
    int j = 0;
    y localy = null;
    int k = 0;
    if (k < i)
    {
      localy = arrayOfy[k];
      String str = localy.a();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return localy;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localy = null;
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public y[] c()
  {
    return (y[])this.c.clone();
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public int d()
  {
    return this.c.length;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof f;
      if (bool2)
      {
        paramObject = (c)paramObject;
        Object localObject1 = this.a;
        Object localObject2 = ((c)paramObject).a;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.b;
          localObject2 = ((c)paramObject).b;
          bool2 = g.a(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.c;
            localObject2 = ((c)paramObject).c;
            bool2 = g.a((Object[])localObject1, (Object[])localObject2);
            if (bool2) {
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
    String str = this.a;
    int i = g.a(17, str);
    str = this.b;
    int j = g.a(i, str);
    y[] arrayOfy = this.c;
    int k = arrayOfy.length;
    i = 0;
    while (i < k)
    {
      y localy = arrayOfy[i];
      j = g.a(j, localy);
      i += 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = this.a;
    localStringBuilder.append(str1);
    str1 = this.b;
    if (str1 != null)
    {
      localStringBuilder.append("=");
      str1 = this.b;
      localStringBuilder.append(str1);
    }
    y[] arrayOfy = this.c;
    int i = arrayOfy.length;
    int j = 0;
    str1 = null;
    while (j < i)
    {
      y localy = arrayOfy[j];
      String str2 = "; ";
      localStringBuilder.append(str2);
      localStringBuilder.append(localy);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */