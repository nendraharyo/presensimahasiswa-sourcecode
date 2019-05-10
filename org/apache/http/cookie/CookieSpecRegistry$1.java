package org.apache.http.cookie;

import org.apache.http.HttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

class CookieSpecRegistry$1
  implements CookieSpecProvider
{
  CookieSpecRegistry$1(CookieSpecRegistry paramCookieSpecRegistry, String paramString) {}
  
  public CookieSpec create(HttpContext paramHttpContext)
  {
    Object localObject = (HttpRequest)paramHttpContext.getAttribute("http.request");
    CookieSpecRegistry localCookieSpecRegistry = this.this$0;
    String str = this.val$name;
    localObject = ((HttpRequest)localObject).getParams();
    return localCookieSpecRegistry.getCookieSpec(str, (HttpParams)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\CookieSpecRegistry$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */