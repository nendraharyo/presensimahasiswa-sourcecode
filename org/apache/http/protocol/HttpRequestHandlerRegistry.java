package org.apache.http.protocol;

import java.util.Map;
import org.apache.http.util.Args;

public class HttpRequestHandlerRegistry
  implements HttpRequestHandlerResolver
{
  private final UriPatternMatcher matcher;
  
  public HttpRequestHandlerRegistry()
  {
    UriPatternMatcher localUriPatternMatcher = new org/apache/http/protocol/UriPatternMatcher;
    localUriPatternMatcher.<init>();
    this.matcher = localUriPatternMatcher;
  }
  
  public Map getHandlers()
  {
    return this.matcher.getObjects();
  }
  
  public HttpRequestHandler lookup(String paramString)
  {
    return (HttpRequestHandler)this.matcher.lookup(paramString);
  }
  
  public void register(String paramString, HttpRequestHandler paramHttpRequestHandler)
  {
    Args.notNull(paramString, "URI request pattern");
    Args.notNull(paramHttpRequestHandler, "Request handler");
    this.matcher.register(paramString, paramHttpRequestHandler);
  }
  
  public void setHandlers(Map paramMap)
  {
    this.matcher.setObjects(paramMap);
  }
  
  public void unregister(String paramString)
  {
    this.matcher.unregister(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpRequestHandlerRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */