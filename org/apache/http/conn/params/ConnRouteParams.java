package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class ConnRouteParams
  implements ConnRoutePNames
{
  public static final HttpHost NO_HOST;
  public static final HttpRoute NO_ROUTE;
  
  static
  {
    Object localObject = new org/apache/http/HttpHost;
    ((HttpHost)localObject).<init>("127.0.0.255", 0, "no-host");
    NO_HOST = (HttpHost)localObject;
    localObject = new org/apache/http/conn/routing/HttpRoute;
    HttpHost localHttpHost = NO_HOST;
    ((HttpRoute)localObject).<init>(localHttpHost);
    NO_ROUTE = (HttpRoute)localObject;
  }
  
  public static HttpHost getDefaultProxy(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "Parameters");
    HttpHost localHttpHost1 = (HttpHost)paramHttpParams.getParameter("http.route.default-proxy");
    if (localHttpHost1 != null)
    {
      HttpHost localHttpHost2 = NO_HOST;
      boolean bool = localHttpHost2.equals(localHttpHost1);
      if (bool) {
        localHttpHost1 = null;
      }
    }
    return localHttpHost1;
  }
  
  public static HttpRoute getForcedRoute(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "Parameters");
    HttpRoute localHttpRoute1 = (HttpRoute)paramHttpParams.getParameter("http.route.forced-route");
    if (localHttpRoute1 != null)
    {
      HttpRoute localHttpRoute2 = NO_ROUTE;
      boolean bool = localHttpRoute2.equals(localHttpRoute1);
      if (bool) {
        localHttpRoute1 = null;
      }
    }
    return localHttpRoute1;
  }
  
  public static InetAddress getLocalAddress(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "Parameters");
    return (InetAddress)paramHttpParams.getParameter("http.route.local-address");
  }
  
  public static void setDefaultProxy(HttpParams paramHttpParams, HttpHost paramHttpHost)
  {
    Args.notNull(paramHttpParams, "Parameters");
    paramHttpParams.setParameter("http.route.default-proxy", paramHttpHost);
  }
  
  public static void setForcedRoute(HttpParams paramHttpParams, HttpRoute paramHttpRoute)
  {
    Args.notNull(paramHttpParams, "Parameters");
    paramHttpParams.setParameter("http.route.forced-route", paramHttpRoute);
  }
  
  public static void setLocalAddress(HttpParams paramHttpParams, InetAddress paramInetAddress)
  {
    Args.notNull(paramHttpParams, "Parameters");
    paramHttpParams.setParameter("http.route.local-address", paramInetAddress);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\params\ConnRouteParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */