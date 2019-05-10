package org.apache.http.client.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

public class RequestAcceptEncoding
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    String str1 = "Accept-Encoding";
    boolean bool = paramHttpRequest.containsHeader(str1);
    if (!bool)
    {
      str1 = "Accept-Encoding";
      String str2 = "gzip,deflate";
      paramHttpRequest.addHeader(str1, str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestAcceptEncoding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */