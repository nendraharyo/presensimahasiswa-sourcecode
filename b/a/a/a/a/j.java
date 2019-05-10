package b.a.a.a.a;

import b.a.a.a.o.a;
import b.a.a.a.o.g;
import java.io.Serializable;
import java.security.Principal;

public final class j
  implements Serializable, Principal
{
  private final String a;
  
  public j(String paramString)
  {
    a.a(paramString, "User name");
    this.a = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof j;
      if (bool2)
      {
        paramObject = (j)paramObject;
        String str1 = this.a;
        String str2 = ((j)paramObject).a;
        bool2 = g.a(str1, str2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String getName()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    String str = this.a;
    return g.a(17, str);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[principal: ");
    String str = this.a;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */