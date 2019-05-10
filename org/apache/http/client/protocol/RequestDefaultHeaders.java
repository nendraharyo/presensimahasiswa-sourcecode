package org.apache.http.client.protocol;

import java.util.Collection;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestDefaultHeaders
  implements HttpRequestInterceptor
{
  private final Collection defaultHeaders;
  
  public RequestDefaultHeaders()
  {
    this(null);
  }
  
  public RequestDefaultHeaders(Collection paramCollection)
  {
    this.defaultHeaders = paramCollection;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = paramHttpRequest.getRequestLine().getMethod();
    Object localObject2 = "CONNECT";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool) {}
    do
    {
      return;
      localObject1 = paramHttpRequest.getParams();
      localObject2 = "http.default-headers";
      localObject1 = (Collection)((HttpParams)localObject1).getParameter((String)localObject2);
      if (localObject1 == null) {
        localObject1 = this.defaultHeaders;
      }
    } while (localObject1 == null);
    localObject2 = ((Collection)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Header)((Iterator)localObject2).next();
      paramHttpRequest.addHeader((Header)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestDefaultHeaders.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */