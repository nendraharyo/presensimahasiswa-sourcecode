package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class DefaultHttpRoutePlanner
  implements HttpRoutePlanner
{
  protected final SchemeRegistry schemeRegistry;
  
  public DefaultHttpRoutePlanner(SchemeRegistry paramSchemeRegistry)
  {
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    this.schemeRegistry = paramSchemeRegistry;
  }
  
  public HttpRoute determineRoute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = ConnRouteParams.getForcedRoute(paramHttpRequest.getParams());
    if (localObject1 != null) {}
    for (;;)
    {
      return (HttpRoute)localObject1;
      Asserts.notNull(paramHttpHost, "Target host");
      Object localObject3 = ConnRouteParams.getLocalAddress(paramHttpRequest.getParams());
      localObject1 = paramHttpRequest.getParams();
      HttpHost localHttpHost = ConnRouteParams.getDefaultProxy((HttpParams)localObject1);
      boolean bool;
      try
      {
        localObject1 = this.schemeRegistry;
        String str = paramHttpHost.getSchemeName();
        localObject1 = ((SchemeRegistry)localObject1).getScheme(str);
        bool = ((Scheme)localObject1).isLayered();
        if (localHttpHost == null)
        {
          localObject1 = new org/apache/http/conn/routing/HttpRoute;
          ((HttpRoute)localObject1).<init>(paramHttpHost, (InetAddress)localObject3, bool);
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        localObject3 = new org/apache/http/HttpException;
        localObject2 = localIllegalStateException.getMessage();
        ((HttpException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      Object localObject2 = new org/apache/http/conn/routing/HttpRoute;
      ((HttpRoute)localObject2).<init>(paramHttpHost, (InetAddress)localObject3, localHttpHost, bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultHttpRoutePlanner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */