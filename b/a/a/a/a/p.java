package b.a.a.a.a;

import b.a.a.a.o.g;
import java.io.Serializable;
import java.security.Principal;

public class p
  implements m, Serializable
{
  private final q a;
  private final String b;
  private final String c;
  
  public Principal a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.a.b();
  }
  
  public String d()
  {
    return this.a.a();
  }
  
  public String e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof p;
      if (bool2)
      {
        paramObject = (p)paramObject;
        Object localObject1 = this.a;
        Object localObject2 = ((p)paramObject).a;
        bool2 = g.a(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.c;
          localObject2 = ((p)paramObject).c;
          bool2 = g.a(localObject1, localObject2);
          if (bool2) {
            continue;
          }
        }
      }
      bool1 = false;
    }
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = g.a(17, localObject);
    localObject = this.c;
    return g.a(i, localObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[principal: ");
    Object localObject = this.a;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][workstation: ");
    localObject = this.c;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */