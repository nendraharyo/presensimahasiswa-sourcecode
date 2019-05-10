package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class BrowserCompatSpecFactory
  implements CookieSpecFactory, CookieSpecProvider
{
  private final String[] datepatterns;
  private final BrowserCompatSpecFactory.SecurityLevel securityLevel;
  
  public BrowserCompatSpecFactory()
  {
    this(null, localSecurityLevel);
  }
  
  public BrowserCompatSpecFactory(String[] paramArrayOfString)
  {
    this(null, localSecurityLevel);
  }
  
  public BrowserCompatSpecFactory(String[] paramArrayOfString, BrowserCompatSpecFactory.SecurityLevel paramSecurityLevel)
  {
    this.datepatterns = paramArrayOfString;
    this.securityLevel = paramSecurityLevel;
  }
  
  public CookieSpec create(HttpContext paramHttpContext)
  {
    BrowserCompatSpec localBrowserCompatSpec = new org/apache/http/impl/cookie/BrowserCompatSpec;
    String[] arrayOfString = this.datepatterns;
    localBrowserCompatSpec.<init>(arrayOfString);
    return localBrowserCompatSpec;
  }
  
  public CookieSpec newInstance(HttpParams paramHttpParams)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramHttpParams != null)
    {
      localObject2 = (Collection)paramHttpParams.getParameter("http.protocol.cookie-datepatterns");
      if (localObject2 == null) {
        break label98;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label98:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = new org/apache/http/impl/cookie/BrowserCompatSpec;
      BrowserCompatSpecFactory.SecurityLevel localSecurityLevel = this.securityLevel;
      ((BrowserCompatSpec)localObject1).<init>((String[])localObject2, localSecurityLevel);
      localObject2 = localObject1;
      for (;;)
      {
        return (CookieSpec)localObject2;
        localObject2 = new org/apache/http/impl/cookie/BrowserCompatSpec;
        localSecurityLevel = this.securityLevel;
        ((BrowserCompatSpec)localObject2).<init>(null, localSecurityLevel);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BrowserCompatSpecFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */