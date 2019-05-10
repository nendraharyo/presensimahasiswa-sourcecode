package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class UsernamePasswordCredentials
  implements Serializable, Credentials
{
  private static final long serialVersionUID = 243343858802739403L;
  private final String password;
  private final BasicUserPrincipal principal;
  
  public UsernamePasswordCredentials(String paramString)
  {
    Object localObject = "Username:password string";
    Args.notNull(paramString, (String)localObject);
    int i = paramString.indexOf(':');
    if (i >= 0)
    {
      BasicUserPrincipal localBasicUserPrincipal = new org/apache/http/auth/BasicUserPrincipal;
      String str = paramString.substring(0, i);
      localBasicUserPrincipal.<init>(str);
      this.principal = localBasicUserPrincipal;
      i += 1;
      localObject = paramString.substring(i);
    }
    for (this.password = ((String)localObject);; this.password = null)
    {
      return;
      localObject = new org/apache/http/auth/BasicUserPrincipal;
      ((BasicUserPrincipal)localObject).<init>(paramString);
      this.principal = ((BasicUserPrincipal)localObject);
      i = 0;
      localObject = null;
    }
  }
  
  public UsernamePasswordCredentials(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Username");
    BasicUserPrincipal localBasicUserPrincipal = new org/apache/http/auth/BasicUserPrincipal;
    localBasicUserPrincipal.<init>(paramString1);
    this.principal = localBasicUserPrincipal;
    this.password = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof UsernamePasswordCredentials;
      if (bool2)
      {
        paramObject = (UsernamePasswordCredentials)paramObject;
        BasicUserPrincipal localBasicUserPrincipal1 = this.principal;
        BasicUserPrincipal localBasicUserPrincipal2 = ((UsernamePasswordCredentials)paramObject).principal;
        bool2 = LangUtils.equals(localBasicUserPrincipal1, localBasicUserPrincipal2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getUserName()
  {
    return this.principal.getName();
  }
  
  public Principal getUserPrincipal()
  {
    return this.principal;
  }
  
  public int hashCode()
  {
    return this.principal.hashCode();
  }
  
  public String toString()
  {
    return this.principal.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\UsernamePasswordCredentials.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */