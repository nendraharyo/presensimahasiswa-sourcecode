package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

public class ConnRouteParamBean
  extends HttpAbstractParamBean
{
  public ConnRouteParamBean(HttpParams paramHttpParams)
  {
    super(paramHttpParams);
  }
  
  public void setDefaultProxy(HttpHost paramHttpHost)
  {
    this.params.setParameter("http.route.default-proxy", paramHttpHost);
  }
  
  public void setForcedRoute(HttpRoute paramHttpRoute)
  {
    this.params.setParameter("http.route.forced-route", paramHttpRoute);
  }
  
  public void setLocalAddress(InetAddress paramInetAddress)
  {
    this.params.setParameter("http.route.local-address", paramInetAddress);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\params\ConnRouteParamBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */