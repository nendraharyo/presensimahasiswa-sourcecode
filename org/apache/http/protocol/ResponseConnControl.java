package org.apache.http.protocol;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

public class ResponseConnControl
  implements HttpResponseInterceptor
{
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    Object localObject1 = HttpCoreContext.adapt(paramHttpContext);
    Object localObject2 = paramHttpResponse.getStatusLine();
    int i = ((StatusLine)localObject2).getStatusCode();
    int j = 400;
    if (i != j)
    {
      j = 408;
      if (i != j)
      {
        j = 411;
        if (i != j)
        {
          j = 413;
          if (i != j)
          {
            j = 414;
            if (i != j)
            {
              j = 503;
              if (i != j)
              {
                j = 501;
                if (i != j) {
                  break label130;
                }
              }
            }
          }
        }
      }
    }
    localObject1 = "Connection";
    localObject2 = "Close";
    paramHttpResponse.setHeader((String)localObject1, (String)localObject2);
    for (;;)
    {
      return;
      label130:
      localObject2 = paramHttpResponse.getFirstHeader("Connection");
      Object localObject3;
      boolean bool1;
      if (localObject2 != null)
      {
        localObject3 = "Close";
        localObject2 = ((Header)localObject2).getValue();
        bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
        if (bool1) {}
      }
      else
      {
        localObject2 = paramHttpResponse.getEntity();
        if (localObject2 != null)
        {
          localObject3 = paramHttpResponse.getStatusLine().getProtocolVersion();
          long l1 = ((HttpEntity)localObject2).getContentLength();
          long l2 = 0L;
          boolean bool2 = l1 < l2;
          if (bool2)
          {
            bool1 = ((HttpEntity)localObject2).isChunked();
            if (bool1)
            {
              localObject2 = HttpVersion.HTTP_1_0;
              bool1 = ((ProtocolVersion)localObject3).lessEquals((ProtocolVersion)localObject2);
              if (!bool1) {}
            }
            else
            {
              localObject1 = "Connection";
              localObject2 = "Close";
              paramHttpResponse.setHeader((String)localObject1, (String)localObject2);
              continue;
            }
          }
        }
        localObject1 = ((HttpCoreContext)localObject1).getRequest();
        if (localObject1 != null)
        {
          localObject2 = ((HttpRequest)localObject1).getFirstHeader("Connection");
          if (localObject2 != null)
          {
            localObject1 = "Connection";
            localObject2 = ((Header)localObject2).getValue();
            paramHttpResponse.setHeader((String)localObject1, (String)localObject2);
          }
          else
          {
            localObject1 = ((HttpRequest)localObject1).getProtocolVersion();
            localObject2 = HttpVersion.HTTP_1_0;
            boolean bool3 = ((ProtocolVersion)localObject1).lessEquals((ProtocolVersion)localObject2);
            if (bool3)
            {
              localObject1 = "Connection";
              localObject2 = "Close";
              paramHttpResponse.setHeader((String)localObject1, (String)localObject2);
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ResponseConnControl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */