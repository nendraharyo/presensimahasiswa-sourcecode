package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultRoutePlanner
  implements HttpRoutePlanner
{
  private final SchemePortResolver schemePortResolver;
  
  public DefaultRoutePlanner(SchemePortResolver paramSchemePortResolver)
  {
    if (paramSchemePortResolver != null) {}
    for (;;)
    {
      this.schemePortResolver = paramSchemePortResolver;
      return;
      paramSchemePortResolver = DefaultSchemePortResolver.INSTANCE;
    }
  }
  
  protected HttpHost determineProxy(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return null;
  }
  
  public HttpRoute determineRoute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Object localObject1 = "Request";
    Args.notNull(paramHttpRequest, (String)localObject1);
    if (paramHttpHost == null)
    {
      localObject1 = new org/apache/http/ProtocolException;
      ((ProtocolException)localObject1).<init>("Target host is not specified");
      throw ((Throwable)localObject1);
    }
    localObject1 = HttpClientContext.adapt(paramHttpContext).getRequestConfig();
    InetAddress localInetAddress = ((RequestConfig)localObject1).getLocalAddress();
    localObject1 = ((RequestConfig)localObject1).getProxy();
    if (localObject1 == null) {
      localObject1 = determineProxy(paramHttpHost, paramHttpRequest, paramHttpContext);
    }
    int i = paramHttpHost.getPort();
    if (i <= 0) {}
    for (;;)
    {
      boolean bool;
      try
      {
        localObject3 = new org/apache/http/HttpHost;
        String str1 = paramHttpHost.getHostName();
        SchemePortResolver localSchemePortResolver = this.schemePortResolver;
        int j = localSchemePortResolver.resolve(paramHttpHost);
        String str2 = paramHttpHost.getSchemeName();
        ((HttpHost)localObject3).<init>(str1, j, str2);
        paramHttpHost = (HttpHost)localObject3;
        localObject3 = paramHttpHost.getSchemeName();
        str1 = "https";
        bool = ((String)localObject3).equalsIgnoreCase(str1);
        if (localObject1 == null)
        {
          localObject1 = new org/apache/http/conn/routing/HttpRoute;
          ((HttpRoute)localObject1).<init>(paramHttpHost, localInetAddress, bool);
          return (HttpRoute)localObject1;
        }
      }
      catch (UnsupportedSchemeException localUnsupportedSchemeException)
      {
        localObject3 = new org/apache/http/HttpException;
        localObject2 = localUnsupportedSchemeException.getMessage();
        ((HttpException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      Object localObject3 = new org/apache/http/conn/routing/HttpRoute;
      ((HttpRoute)localObject3).<init>(paramHttpHost, localInetAddress, (HttpHost)localObject2, bool);
      Object localObject2 = localObject3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultRoutePlanner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */