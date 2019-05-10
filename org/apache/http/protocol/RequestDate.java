package org.apache.http.protocol;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.util.Args;

public class RequestDate
  implements HttpRequestInterceptor
{
  private static final HttpDateGenerator DATE_GENERATOR;
  
  static
  {
    HttpDateGenerator localHttpDateGenerator = new org/apache/http/protocol/HttpDateGenerator;
    localHttpDateGenerator.<init>();
    DATE_GENERATOR = localHttpDateGenerator;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    String str1 = "HTTP request";
    Args.notNull(paramHttpRequest, str1);
    boolean bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    if (bool)
    {
      str1 = "Date";
      bool = ((HttpRequest)paramHttpRequest).containsHeader(str1);
      if (!bool)
      {
        str1 = DATE_GENERATOR.getCurrentDate();
        String str2 = "Date";
        ((HttpRequest)paramHttpRequest).setHeader(str2, str1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestDate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */