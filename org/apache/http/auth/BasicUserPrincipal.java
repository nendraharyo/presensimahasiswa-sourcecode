package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public final class BasicUserPrincipal
  implements Serializable, Principal
{
  private static final long serialVersionUID = -2266305184969850467L;
  private final String username;
  
  public BasicUserPrincipal(String paramString)
  {
    Args.notNull(paramString, "User name");
    this.username = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof BasicUserPrincipal;
      if (bool2)
      {
        paramObject = (BasicUserPrincipal)paramObject;
        String str1 = this.username;
        String str2 = ((BasicUserPrincipal)paramObject).username;
        bool2 = LangUtils.equals(str1, str2);
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
    return this.username;
  }
  
  public int hashCode()
  {
    String str = this.username;
    return LangUtils.hashCode(17, str);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[principal: ");
    String str = this.username;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\BasicUserPrincipal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */