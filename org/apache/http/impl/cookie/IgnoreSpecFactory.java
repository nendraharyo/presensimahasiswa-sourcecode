package org.apache.http.impl.cookie;

import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class IgnoreSpecFactory
  implements CookieSpecFactory, CookieSpecProvider
{
  public CookieSpec create(HttpContext paramHttpContext)
  {
    IgnoreSpec localIgnoreSpec = new org/apache/http/impl/cookie/IgnoreSpec;
    localIgnoreSpec.<init>();
    return localIgnoreSpec;
  }
  
  public CookieSpec newInstance(HttpParams paramHttpParams)
  {
    IgnoreSpec localIgnoreSpec = new org/apache/http/impl/cookie/IgnoreSpec;
    localIgnoreSpec.<init>();
    return localIgnoreSpec;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\IgnoreSpecFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */