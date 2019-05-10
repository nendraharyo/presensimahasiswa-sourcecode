package org.apache.http.impl.client;

import org.apache.http.conn.routing.HttpRoute;

public class RoutedRequest
{
  protected final RequestWrapper request;
  protected final HttpRoute route;
  
  public RoutedRequest(RequestWrapper paramRequestWrapper, HttpRoute paramHttpRoute)
  {
    this.request = paramRequestWrapper;
    this.route = paramHttpRoute;
  }
  
  public final RequestWrapper getRequest()
  {
    return this.request;
  }
  
  public final HttpRoute getRoute()
  {
    return this.route;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\RoutedRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */