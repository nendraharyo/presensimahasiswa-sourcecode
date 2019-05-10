package b.a.a.a.a;

import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.io.Serializable;
import java.security.Principal;

public class r
  implements m, Serializable
{
  private final j a;
  private final String b;
  
  public r(String paramString)
  {
    Object localObject = "Username:password string";
    a.a(paramString, (String)localObject);
    int i = paramString.indexOf(':');
    if (i >= 0)
    {
      j localj = new b/a/a/a/a/j;
      String str = paramString.substring(0, i);
      localj.<init>(str);
      this.a = localj;
      i += 1;
      localObject = paramString.substring(i);
    }
    for (this.b = ((String)localObject);; this.b = null)
    {
      return;
      localObject = new b/a/a/a/a/j;
      ((j)localObject).<init>(paramString);
      this.a = ((j)localObject);
      i = 0;
      localObject = null;
    }
  }
  
  public r(String paramString1, String paramString2)
  {
    a.a(paramString1, "Username");
    j localj = new b/a/a/a/a/j;
    localj.<init>(paramString1);
    this.a = localj;
    this.b = paramString2;
  }
  
  public Principal a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof r;
      if (bool2)
      {
        paramObject = (r)paramObject;
        j localj1 = this.a;
        j localj2 = ((r)paramObject).a;
        bool2 = g.a(localj1, localj2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */