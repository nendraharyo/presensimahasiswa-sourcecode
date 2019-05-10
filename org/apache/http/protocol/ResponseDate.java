package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

public class ResponseDate
  implements HttpResponseInterceptor
{
  private static final HttpDateGenerator DATE_GENERATOR;
  
  static
  {
    HttpDateGenerator localHttpDateGenerator = new org/apache/http/protocol/HttpDateGenerator;
    localHttpDateGenerator.<init>();
    DATE_GENERATOR = localHttpDateGenerator;
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    Object localObject = paramHttpResponse.getStatusLine();
    int i = ((StatusLine)localObject).getStatusCode();
    int j = 200;
    if (i >= j)
    {
      localObject = "Date";
      boolean bool = paramHttpResponse.containsHeader((String)localObject);
      if (!bool)
      {
        localObject = DATE_GENERATOR.getCurrentDate();
        String str = "Date";
        paramHttpResponse.setHeader(str, (String)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ResponseDate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */