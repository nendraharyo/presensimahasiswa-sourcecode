package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class NTUserPrincipal
  implements Serializable, Principal
{
  private static final long serialVersionUID = -6870169797924406894L;
  private final String domain;
  private final String ntname;
  private final String username;
  
  public NTUserPrincipal(String paramString1, String paramString2)
  {
    Object localObject = "User name";
    Args.notNull(paramString2, (String)localObject);
    this.username = paramString2;
    int i;
    if (paramString1 != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString1.toUpperCase((Locale)localObject);
      this.domain = ((String)localObject);
      localObject = this.domain;
      if (localObject == null) {
        break label131;
      }
      localObject = this.domain;
      i = ((String)localObject).length();
      if (i <= 0) {
        break label131;
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.domain;
      ((StringBuilder)localObject).append(str);
      char c = '\\';
      ((StringBuilder)localObject).append(c);
      str = this.username;
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
    }
    for (this.ntname = ((String)localObject);; this.ntname = ((String)localObject))
    {
      return;
      i = 0;
      localObject = null;
      this.domain = null;
      break;
      label131:
      localObject = this.username;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof NTUserPrincipal;
      if (bool2)
      {
        paramObject = (NTUserPrincipal)paramObject;
        String str1 = this.username;
        String str2 = ((NTUserPrincipal)paramObject).username;
        bool2 = LangUtils.equals(str1, str2);
        if (bool2)
        {
          str1 = this.domain;
          str2 = ((NTUserPrincipal)paramObject).domain;
          bool2 = LangUtils.equals(str1, str2);
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
    return this.domain;
  }
  
  public String getName()
  {
    return this.ntname;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public int hashCode()
  {
    String str = this.username;
    int i = LangUtils.hashCode(17, str);
    str = this.domain;
    return LangUtils.hashCode(i, str);
  }
  
  public String toString()
  {
    return this.ntname;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\NTUserPrincipal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */