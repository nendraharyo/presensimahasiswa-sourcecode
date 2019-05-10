package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultProxyRoutePlanner
  extends DefaultRoutePlanner
{
  private final HttpHost proxy;
  
  public DefaultProxyRoutePlanner(HttpHost paramHttpHost)
  {
    this(paramHttpHost, null);
  }
  
  public DefaultProxyRoutePlanner(HttpHost paramHttpHost, SchemePortResolver paramSchemePortResolver)
  {
    super(paramSchemePortResolver);
    HttpHost localHttpHost = (HttpHost)Args.notNull(paramHttpHost, "Proxy host");
    this.proxy = localHttpHost;
  }
  
  protected HttpHost determineProxy(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return this.proxy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultProxyRoutePlanner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */