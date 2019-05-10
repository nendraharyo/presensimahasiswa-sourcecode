package org.apache.http.client.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestExpectContinue
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = "Expect";
    boolean bool = paramHttpRequest.containsHeader((String)localObject1);
    if (!bool)
    {
      bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
      if (bool)
      {
        Object localObject2 = ((HttpRequest)paramHttpRequest).getRequestLine().getProtocolVersion();
        localObject1 = paramHttpRequest;
        localObject1 = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
        if (localObject1 != null)
        {
          long l1 = ((HttpEntity)localObject1).getContentLength();
          long l2 = 0L;
          bool = l1 < l2;
          if (bool)
          {
            localObject1 = HttpVersion.HTTP_1_0;
            bool = ((ProtocolVersion)localObject2).lessEquals((ProtocolVersion)localObject1);
            if (!bool)
            {
              localObject1 = HttpClientContext.adapt(paramHttpContext).getRequestConfig();
              bool = ((RequestConfig)localObject1).isExpectContinueEnabled();
              if (bool)
              {
                localObject1 = "Expect";
                localObject2 = "100-continue";
                ((HttpRequest)paramHttpRequest).addHeader((String)localObject1, (String)localObject2);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestExpectContinue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */