package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class RequestUserAgent
  implements HttpRequestInterceptor
{
  private final String userAgent;
  
  public RequestUserAgent()
  {
    this(null);
  }
  
  public RequestUserAgent(String paramString)
  {
    this.userAgent = paramString;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    String str = "User-Agent";
    boolean bool = paramHttpRequest.containsHeader(str);
    if (!bool)
    {
      bool = false;
      str = null;
      Object localObject = paramHttpRequest.getParams();
      if (localObject != null) {
        str = (String)((HttpParams)localObject).getParameter("http.useragent");
      }
      if (str == null) {
        str = this.userAgent;
      }
      if (str != null)
      {
        localObject = "User-Agent";
        paramHttpRequest.addHeader((String)localObject, str);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestUserAgent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */