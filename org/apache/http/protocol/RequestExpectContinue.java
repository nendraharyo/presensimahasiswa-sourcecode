package org.apache.http.protocol;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class RequestExpectContinue
  implements HttpRequestInterceptor
{
  private final boolean activeByDefault;
  
  public RequestExpectContinue()
  {
    this(false);
  }
  
  public RequestExpectContinue(boolean paramBoolean)
  {
    this.activeByDefault = paramBoolean;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = "Expect";
    boolean bool1 = paramHttpRequest.containsHeader((String)localObject1);
    if (!bool1)
    {
      bool1 = paramHttpRequest instanceof HttpEntityEnclosingRequest;
      if (bool1)
      {
        Object localObject2 = ((HttpRequest)paramHttpRequest).getRequestLine().getProtocolVersion();
        localObject1 = paramHttpRequest;
        localObject1 = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
        if (localObject1 != null)
        {
          long l1 = ((HttpEntity)localObject1).getContentLength();
          long l2 = 0L;
          bool1 = l1 < l2;
          if (bool1)
          {
            localObject1 = HttpVersion.HTTP_1_0;
            bool1 = ((ProtocolVersion)localObject2).lessEquals((ProtocolVersion)localObject1);
            if (!bool1)
            {
              localObject1 = ((HttpRequest)paramHttpRequest).getParams();
              localObject2 = "http.protocol.expect-continue";
              boolean bool2 = this.activeByDefault;
              bool1 = ((HttpParams)localObject1).getBooleanParameter((String)localObject2, bool2);
              if (bool1)
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestExpectContinue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */