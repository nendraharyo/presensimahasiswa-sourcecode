package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.util.Args;

public class ResponseServer
  implements HttpResponseInterceptor
{
  private final String originServer;
  
  public ResponseServer()
  {
    this(null);
  }
  
  public ResponseServer(String paramString)
  {
    this.originServer = paramString;
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    String str1 = "Server";
    boolean bool = paramHttpResponse.containsHeader(str1);
    if (!bool)
    {
      str1 = this.originServer;
      if (str1 != null)
      {
        str1 = "Server";
        String str2 = this.originServer;
        paramHttpResponse.addHeader(str1, str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ResponseServer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */