package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestClientConnControl
  implements HttpRequestInterceptor
{
  private static final String PROXY_CONN_DIRECTIVE = "Proxy-Connection";
  private final Log log;
  
  public RequestClientConnControl()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject = paramHttpRequest.getRequestLine().getMethod();
    String str1 = "CONNECT";
    boolean bool1 = ((String)localObject).equalsIgnoreCase(str1);
    if (bool1)
    {
      localObject = "Proxy-Connection";
      str1 = "Keep-Alive";
      paramHttpRequest.setHeader((String)localObject, str1);
    }
    for (;;)
    {
      return;
      localObject = HttpClientContext.adapt(paramHttpContext).getHttpRoute();
      if (localObject == null)
      {
        localObject = this.log;
        str1 = "Connection route not set in the context";
        ((Log)localObject).debug(str1);
      }
      else
      {
        int i = ((RouteInfo)localObject).getHopCount();
        int k = 1;
        boolean bool2;
        if (i != k)
        {
          bool2 = ((RouteInfo)localObject).isTunnelled();
          if (!bool2) {}
        }
        else
        {
          str1 = "Connection";
          bool2 = paramHttpRequest.containsHeader(str1);
          if (!bool2)
          {
            str1 = "Connection";
            String str2 = "Keep-Alive";
            paramHttpRequest.addHeader(str1, str2);
          }
        }
        int j = ((RouteInfo)localObject).getHopCount();
        k = 2;
        if (j == k)
        {
          bool1 = ((RouteInfo)localObject).isTunnelled();
          if (!bool1)
          {
            localObject = "Proxy-Connection";
            bool1 = paramHttpRequest.containsHeader((String)localObject);
            if (!bool1)
            {
              localObject = "Proxy-Connection";
              str1 = "Keep-Alive";
              paramHttpRequest.addHeader((String)localObject, str1);
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestClientConnControl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */