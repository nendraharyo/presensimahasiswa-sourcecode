package org.apache.http.protocol;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

public class RequestTargetHost
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = HttpCoreContext.adapt(paramHttpContext);
    ProtocolVersion localProtocolVersion = paramHttpRequest.getRequestLine().getProtocolVersion();
    Object localObject2 = paramHttpRequest.getRequestLine().getMethod();
    Object localObject3 = "CONNECT";
    boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject3);
    if (bool1)
    {
      localObject2 = HttpVersion.HTTP_1_0;
      bool1 = localProtocolVersion.lessEquals((ProtocolVersion)localObject2);
      if (!bool1) {}
    }
    do
    {
      return;
      localObject2 = "Host";
      bool1 = paramHttpRequest.containsHeader((String)localObject2);
    } while (bool1);
    localObject3 = ((HttpCoreContext)localObject1).getTargetHost();
    boolean bool2;
    if (localObject3 == null)
    {
      localObject2 = ((HttpCoreContext)localObject1).getConnection();
      bool2 = localObject2 instanceof HttpInetConnection;
      if (!bool2) {
        break label236;
      }
      localObject1 = localObject2;
      localObject1 = ((HttpInetConnection)localObject2).getRemoteAddress();
      localObject2 = (HttpInetConnection)localObject2;
      int i = ((HttpInetConnection)localObject2).getRemotePort();
      if (localObject1 == null) {
        break label236;
      }
      localObject3 = new org/apache/http/HttpHost;
      localObject1 = ((InetAddress)localObject1).getHostName();
      ((HttpHost)localObject3).<init>((String)localObject1, i);
    }
    label236:
    for (localObject1 = localObject3;; localObject1 = localObject3)
    {
      if (localObject1 == null)
      {
        localObject1 = HttpVersion.HTTP_1_0;
        bool2 = localProtocolVersion.lessEquals((ProtocolVersion)localObject1);
        if (bool2) {
          break;
        }
        localObject1 = new org/apache/http/ProtocolException;
        ((ProtocolException)localObject1).<init>("Target host missing");
        throw ((Throwable)localObject1);
        localObject1 = localObject3;
      }
      localObject2 = "Host";
      localObject1 = ((HttpHost)localObject1).toHostString();
      paramHttpRequest.addHeader((String)localObject2, (String)localObject1);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\RequestTargetHost.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */