package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

public class UriHttpRequestHandlerMapper
  implements HttpRequestHandlerMapper
{
  private final UriPatternMatcher matcher;
  
  public UriHttpRequestHandlerMapper()
  {
    this(localUriPatternMatcher);
  }
  
  protected UriHttpRequestHandlerMapper(UriPatternMatcher paramUriPatternMatcher)
  {
    UriPatternMatcher localUriPatternMatcher = (UriPatternMatcher)Args.notNull(paramUriPatternMatcher, "Pattern matcher");
    this.matcher = localUriPatternMatcher;
  }
  
  protected String getRequestPath(HttpRequest paramHttpRequest)
  {
    int i = -1;
    String str1 = paramHttpRequest.getRequestLine().getUri();
    String str2 = "?";
    int j = str1.indexOf(str2);
    if (j != i) {
      str1 = str1.substring(0, j);
    }
    for (;;)
    {
      return str1;
      str2 = "#";
      j = str1.indexOf(str2);
      if (j != i) {
        str1 = str1.substring(0, j);
      }
    }
  }
  
  public HttpRequestHandler lookup(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    UriPatternMatcher localUriPatternMatcher = this.matcher;
    String str = getRequestPath(paramHttpRequest);
    return (HttpRequestHandler)localUriPatternMatcher.lookup(str);
  }
  
  public void register(String paramString, HttpRequestHandler paramHttpRequestHandler)
  {
    Args.notNull(paramString, "Pattern");
    Args.notNull(paramHttpRequestHandler, "Handler");
    this.matcher.register(paramString, paramHttpRequestHandler);
  }
  
  public void unregister(String paramString)
  {
    this.matcher.unregister(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\UriHttpRequestHandlerMapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */