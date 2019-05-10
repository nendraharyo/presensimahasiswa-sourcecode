package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

public class RequestConnControl
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    String str1 = paramHttpRequest.getRequestLine().getMethod();
    String str2 = "CONNECT";
    boolean bool = str1.equalsIgnoreCase(str2);
    if (bool) {}
    for (;;)
    {
      return;
      str1 = "Connection";
      bool = paramHttpRequest.containsHeader(str1);
      if (!bool)
      {
        str1 = "Connection";
        str2 = "Keep-Alive";
        paramHttpRequest.addHeader(str1, str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestConnControl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */