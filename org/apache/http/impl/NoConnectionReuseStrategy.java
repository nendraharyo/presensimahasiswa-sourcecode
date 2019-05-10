package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

public class NoConnectionReuseStrategy
  implements ConnectionReuseStrategy
{
  public static final NoConnectionReuseStrategy INSTANCE;
  
  static
  {
    NoConnectionReuseStrategy localNoConnectionReuseStrategy = new org/apache/http/impl/NoConnectionReuseStrategy;
    localNoConnectionReuseStrategy.<init>();
    INSTANCE = localNoConnectionReuseStrategy;
  }
  
  public boolean keepAlive(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\NoConnectionReuseStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */