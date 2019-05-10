package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;

class HttpService$HttpRequestHandlerResolverAdapter
  implements HttpRequestHandlerMapper
{
  private final HttpRequestHandlerResolver resolver;
  
  public HttpService$HttpRequestHandlerResolverAdapter(HttpRequestHandlerResolver paramHttpRequestHandlerResolver)
  {
    this.resolver = paramHttpRequestHandlerResolver;
  }
  
  public HttpRequestHandler lookup(HttpRequest paramHttpRequest)
  {
    HttpRequestHandlerResolver localHttpRequestHandlerResolver = this.resolver;
    String str = paramHttpRequest.getRequestLine().getUri();
    return localHttpRequestHandlerResolver.lookup(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpService$HttpRequestHandlerResolverAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */