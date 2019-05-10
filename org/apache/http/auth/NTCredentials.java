package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class NTCredentials
  implements Serializable, Credentials
{
  private static final long serialVersionUID = -7385699315228907265L;
  private final String password;
  private final NTUserPrincipal principal;
  private final String workstation;
  
  public NTCredentials(String paramString)
  {
    String str2 = "Username:password string";
    Args.notNull(paramString, str2);
    int i = 58;
    int j = paramString.indexOf(i);
    Object localObject;
    if (j >= 0)
    {
      str2 = paramString.substring(0, j);
      j += 1;
      localObject = paramString.substring(j);
      this.password = ((String)localObject);
      paramString = str2;
      i = paramString.indexOf('/');
      if (i < 0) {
        break label140;
      }
      localObject = new org/apache/http/auth/NTUserPrincipal;
      str1 = paramString.substring(0, i);
      Locale localLocale = Locale.ENGLISH;
      str1 = str1.toUpperCase(localLocale);
      i += 1;
      str2 = paramString.substring(i);
      ((NTUserPrincipal)localObject).<init>(str1, str2);
    }
    for (this.principal = ((NTUserPrincipal)localObject);; this.principal = ((NTUserPrincipal)localObject))
    {
      this.workstation = null;
      return;
      this.password = null;
      break;
      label140:
      localObject = new org/apache/http/auth/NTUserPrincipal;
      i += 1;
      str2 = paramString.substring(i);
      ((NTUserPrincipal)localObject).<init>(null, str2);
    }
  }
  
  public NTCredentials(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Args.notNull(paramString1, "User name");
    Object localObject = new org/apache/http/auth/NTUserPrincipal;
    ((NTUserPrincipal)localObject).<init>(paramString4, paramString1);
    this.principal = ((NTUserPrincipal)localObject);
    this.password = paramString2;
    if (paramString3 != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString3.toUpperCase((Locale)localObject);
    }
    for (this.workstation = ((String)localObject);; this.workstation = null)
    {
      return;
      localObject = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof NTCredentials;
      if (bool2)
      {
        paramObject = (NTCredentials)paramObject;
        Object localObject1 = this.principal;
        Object localObject2 = ((NTCredentials)paramObject).principal;
        bool2 = LangUtils.equals(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.workstation;
          localObject2 = ((NTCredentials)paramObject).workstation;
          bool2 = LangUtils.equals(localObject1, localObject2);
          if (bool2) {
            continue;
          }
        }
      }
      bool1 = false;
    }
  }
  
  public String getDomain()
  {
    return this.principal.getDomain();
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getUserName()
  {
    return this.principal.getUsername();
  }
  
  public Principal getUserPrincipal()
  {
    return this.principal;
  }
  
  public String getWorkstation()
  {
    return this.workstation;
  }
  
  public int hashCode()
  {
    Object localObject = this.principal;
    int i = LangUtils.hashCode(17, localObject);
    localObject = this.workstation;
    return LangUtils.hashCode(i, localObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[principal: ");
    Object localObject = this.principal;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][workstation: ");
    localObject = this.workstation;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\NTCredentials.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */