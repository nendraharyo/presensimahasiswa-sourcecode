package org.apache.http.impl.client;

import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultProxyAuthenticationHandler
  extends AbstractAuthenticationHandler
{
  protected List getAuthPreferences(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Object localObject = paramHttpResponse.getParams();
    String str = "http.auth.proxy-scheme-pref";
    localObject = (List)((HttpParams)localObject).getParameter(str);
    if (localObject != null) {}
    for (;;)
    {
      return (List)localObject;
      localObject = super.getAuthPreferences(paramHttpResponse, paramHttpContext);
    }
  }
  
  public Map getChallenges(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Proxy-Authenticate");
    return parseChallenges(arrayOfHeader);
  }
  
  public boolean isAuthenticationRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int k = 407;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localStatusLine = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultProxyAuthenticationHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */