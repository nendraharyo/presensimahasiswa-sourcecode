package org.apache.http.impl.conn.tsccm;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

class RouteSpecificPool$1
  implements ConnPerRoute
{
  RouteSpecificPool$1(RouteSpecificPool paramRouteSpecificPool) {}
  
  public int getMaxForRoute(HttpRoute paramHttpRoute)
  {
    return this.this$0.maxEntries;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\RouteSpecificPool$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */