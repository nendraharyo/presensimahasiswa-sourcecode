package org.apache.http.auth;

import org.apache.http.HttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

class AuthSchemeRegistry$1
  implements AuthSchemeProvider
{
  AuthSchemeRegistry$1(AuthSchemeRegistry paramAuthSchemeRegistry, String paramString) {}
  
  public AuthScheme create(HttpContext paramHttpContext)
  {
    Object localObject = (HttpRequest)paramHttpContext.getAttribute("http.request");
    AuthSchemeRegistry localAuthSchemeRegistry = this.this$0;
    String str = this.val$name;
    localObject = ((HttpRequest)localObject).getParams();
    return localAuthSchemeRegistry.getAuthScheme(str, (HttpParams)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthSchemeRegistry$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */