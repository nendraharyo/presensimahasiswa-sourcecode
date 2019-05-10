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
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class ProxySelectorRoutePlanner
  implements HttpRoutePlanner
{
  protected ProxySelector proxySelector;
  protected final SchemeRegistry schemeRegistry;
  
  public ProxySelectorRoutePlanner(SchemeRegistry paramSchemeRegistry, ProxySelector paramProxySelector)
  {
    Args.notNull(paramSchemeRegistry, "SchemeRegistry");
    this.schemeRegistry = paramSchemeRegistry;
    this.proxySelector = paramProxySelector;
  }
  
  protected Proxy chooseProxy(List paramList, HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notEmpty(paramList, "List of proxies");
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
      int[] arrayOfInt = ProxySelectorRoutePlanner.1.$SwitchMap$java$net$Proxy$Type;
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
  
  protected HttpHost determineProxy(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject3 = this.proxySelector;
    if (localObject3 == null) {
      localObject3 = ProxySelector.getDefault();
    }
    if (localObject3 == null) {}
    for (;;)
    {
      return (HttpHost)localObject1;
      try
      {
        localObject4 = new java/net/URI;
        Object localObject5 = paramHttpHost.toURI();
        ((URI)localObject4).<init>((String)localObject5);
        localObject3 = ((ProxySelector)localObject3).select((URI)localObject4);
        localObject3 = chooseProxy((List)localObject3, paramHttpHost, paramHttpRequest, paramHttpContext);
        localObject4 = ((Proxy)localObject3).type();
        localObject5 = Proxy.Type.HTTP;
        if (localObject4 != localObject5) {
          continue;
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
      localObject3 = new org/apache/http/HttpHost;
      Object localObject4 = getHost((InetSocketAddress)localObject2);
      int i = ((InetSocketAddress)localObject2).getPort();
      ((HttpHost)localObject3).<init>((String)localObject4, i);
      localObject2 = localObject3;
    }
  }
  
  public HttpRoute determineRoute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject = ConnRouteParams.getForcedRoute(paramHttpRequest.getParams());
    if (localObject != null) {}
    for (;;)
    {
      return (HttpRoute)localObject;
      Asserts.notNull(paramHttpHost, "Target host");
      InetAddress localInetAddress = ConnRouteParams.getLocalAddress(paramHttpRequest.getParams());
      HttpHost localHttpHost = determineProxy(paramHttpHost, paramHttpRequest, paramHttpContext);
      localObject = this.schemeRegistry;
      String str = paramHttpHost.getSchemeName();
      localObject = ((SchemeRegistry)localObject).getScheme(str);
      boolean bool = ((Scheme)localObject).isLayered();
      if (localHttpHost == null)
      {
        localObject = new org/apache/http/conn/routing/HttpRoute;
        ((HttpRoute)localObject).<init>(paramHttpHost, localInetAddress, bool);
      }
      else
      {
        localObject = new org/apache/http/conn/routing/HttpRoute;
        ((HttpRoute)localObject).<init>(paramHttpHost, localInetAddress, localHttpHost, bool);
      }
    }
  }
  
  protected String getHost(InetSocketAddress paramInetSocketAddress)
  {
    boolean bool = paramInetSocketAddress.isUnresolved();
    if (bool) {}
    for (String str = paramInetSocketAddress.getHostName();; str = paramInetSocketAddress.getAddress().getHostAddress()) {
      return str;
    }
  }
  
  public ProxySelector getProxySelector()
  {
    return this.proxySelector;
  }
  
  public void setProxySelector(ProxySelector paramProxySelector)
  {
    this.proxySelector = paramProxySelector;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\ProxySelectorRoutePlanner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */