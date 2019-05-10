package org.apache.http.conn.params;

import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public final class ConnManagerParams
  implements ConnManagerPNames
{
  private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE;
  public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;
  
  static
  {
    ConnManagerParams.1 local1 = new org/apache/http/conn/params/ConnManagerParams$1;
    local1.<init>();
    DEFAULT_CONN_PER_ROUTE = local1;
  }
  
  public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    ConnPerRoute localConnPerRoute = (ConnPerRoute)paramHttpParams.getParameter("http.conn-manager.max-per-route");
    if (localConnPerRoute == null) {
      localConnPerRoute = DEFAULT_CONN_PER_ROUTE;
    }
    return localConnPerRoute;
  }
  
  public static int getMaxTotalConnections(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    return paramHttpParams.getIntParameter("http.conn-manager.max-total", 20);
  }
  
  public static long getTimeout(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    return paramHttpParams.getLongParameter("http.conn-manager.timeout", 0L);
  }
  
  public static void setMaxConnectionsPerRoute(HttpParams paramHttpParams, ConnPerRoute paramConnPerRoute)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.conn-manager.max-per-route", paramConnPerRoute);
  }
  
  public static void setMaxTotalConnections(HttpParams paramHttpParams, int paramInt)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setIntParameter("http.conn-manager.max-total", paramInt);
  }
  
  public static void setTimeout(HttpParams paramHttpParams, long paramLong)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setLongParameter("http.conn-manager.timeout", paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\params\ConnManagerParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */