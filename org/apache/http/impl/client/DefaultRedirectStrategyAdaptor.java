package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

class DefaultRedirectStrategyAdaptor
  implements RedirectStrategy
{
  private final RedirectHandler handler;
  
  public DefaultRedirectStrategyAdaptor(RedirectHandler paramRedirectHandler)
  {
    this.handler = paramRedirectHandler;
  }
  
  public RedirectHandler getHandler()
  {
    return this.handler;
  }
  
  public HttpUriRequest getRedirect(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    URI localURI = this.handler.getLocationURI(paramHttpResponse, paramHttpContext);
    Object localObject = paramHttpRequest.getRequestLine().getMethod();
    String str = "HEAD";
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (bool)
    {
      localObject = new org/apache/http/client/methods/HttpHead;
      ((HttpHead)localObject).<init>(localURI);
    }
    for (;;)
    {
      return (HttpUriRequest)localObject;
      localObject = new org/apache/http/client/methods/HttpGet;
      ((HttpGet)localObject).<init>(localURI);
    }
  }
  
  public boolean isRedirected(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return this.handler.isRedirectRequested(paramHttpResponse, paramHttpContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultRedirectStrategyAdaptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */