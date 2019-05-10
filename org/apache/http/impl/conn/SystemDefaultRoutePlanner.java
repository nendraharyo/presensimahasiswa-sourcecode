package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;

public class SystemDefaultRoutePlanner
  extends DefaultRoutePlanner
{
  private final ProxySelector proxySelector;
  
  public SystemDefaultRoutePlanner(ProxySelector paramProxySelector)
  {
    this(null, paramProxySelector);
  }
  
  public SystemDefaultRoutePlanner(SchemePortResolver paramSchemePortResolver, ProxySelector paramProxySelector)
  {
    super(paramSchemePortResolver);
    if (paramProxySelector != null) {}
    for (;;)
    {
      this.proxySelector = paramProxySelector;
      return;
      paramProxySelector = ProxySelector.getDefault();
    }
  }
  
  private Proxy chooseProxy(List paramList)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    while (localObject1 == null)
    {
      j = paramList.size();
      if (k >= j) {
        break;
      }
      localObject2 = (Proxy)paramList.get(k);
      int[] arrayOfInt = SystemDefaultRoutePlanner.1.$SwitchMap$java$net$Proxy$Type;
      Proxy.Type localType = ((Proxy)localObject2).type();
      int m = localType.ordinal();
      int n = arrayOfInt[m];
      switch (n)
      {
      default: 
        localObject2 = localObject1;
      }
      i = k + 1;
      k = i;
      localObject1 = localObject2;
    }
    if (localObject1 == null) {
      localObject1 = Proxy.NO_PROXY;
    }
    return (Proxy)localObject1;
  }
  
  private String getHost(InetSocketAddress paramInetSocketAddress)
  {
    boolean bool = paramInetSocketAddress.isUnresolved();
    if (bool) {}
    for (String str = paramInetSocketAddress.getHostName();; str = paramInetSocketAddress.getAddress().getHostAddress()) {
      return str;
    }
  }
  
  protected HttpHost determineProxy(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    try
    {
      Object localObject1 = new java/net/URI;
      localObject3 = paramHttpHost.toURI();
      ((URI)localObject1).<init>((String)localObject3);
      localObject1 = this.proxySelector.select((URI)localObject1);
      localObject3 = chooseProxy((List)localObject1);
      boolean bool = false;
      localObject1 = null;
      localObject4 = ((Proxy)localObject3).type();
      Proxy.Type localType = Proxy.Type.HTTP;
      if (localObject4 != localType) {
        break label222;
      }
      localObject1 = ((Proxy)localObject3).address();
      bool = localObject1 instanceof InetSocketAddress;
      if (!bool)
      {
        localObject1 = new org/apache/http/HttpException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Unable to handle non-Inet proxy address: ");
        localObject3 = ((Proxy)localObject3).address();
        localObject3 = localObject3;
        ((HttpException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      localObject3 = new org/apache/http/HttpException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Cannot convert host to URI: " + paramHttpHost;
      ((HttpException)localObject3).<init>((String)localObject4, localURISyntaxException);
      throw ((Throwable)localObject3);
    }
    Object localObject2 = (InetSocketAddress)((Proxy)localObject3).address();
    Object localObject3 = new org/apache/http/HttpHost;
    Object localObject4 = getHost((InetSocketAddress)localObject2);
    int i = ((InetSocketAddress)localObject2).getPort();
    ((HttpHost)localObject3).<init>((String)localObject4, i);
    localObject2 = localObject3;
    label222:
    return (HttpHost)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SystemDefaultRoutePlanner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */