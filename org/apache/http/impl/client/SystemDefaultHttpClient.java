package org.apache.http.impl.client;

import java.net.ProxySelector;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;

public class SystemDefaultHttpClient
  extends DefaultHttpClient
{
  public SystemDefaultHttpClient()
  {
    super(null, null);
  }
  
  public SystemDefaultHttpClient(HttpParams paramHttpParams)
  {
    super(null, paramHttpParams);
  }
  
  protected ClientConnectionManager createClientConnectionManager()
  {
    PoolingClientConnectionManager localPoolingClientConnectionManager = new org/apache/http/impl/conn/PoolingClientConnectionManager;
    Object localObject = SchemeRegistryFactory.createSystemDefault();
    localPoolingClientConnectionManager.<init>((SchemeRegistry)localObject);
    localObject = System.getProperty("http.keepAlive", "true");
    String str = "true";
    boolean bool = str.equalsIgnoreCase((String)localObject);
    if (bool)
    {
      str = "5";
      localObject = System.getProperty("http.maxConnections", str);
      int i = Integer.parseInt((String)localObject);
      localPoolingClientConnectionManager.setDefaultMaxPerRoute(i);
      i *= 2;
      localPoolingClientConnectionManager.setMaxTotal(i);
    }
    return localPoolingClientConnectionManager;
  }
  
  protected ConnectionReuseStrategy createConnectionReuseStrategy()
  {
    Object localObject = System.getProperty("http.keepAlive", "true");
    String str = "true";
    boolean bool = str.equalsIgnoreCase((String)localObject);
    if (bool)
    {
      localObject = new org/apache/http/impl/DefaultConnectionReuseStrategy;
      ((DefaultConnectionReuseStrategy)localObject).<init>();
    }
    for (;;)
    {
      return (ConnectionReuseStrategy)localObject;
      localObject = new org/apache/http/impl/NoConnectionReuseStrategy;
      ((NoConnectionReuseStrategy)localObject).<init>();
    }
  }
  
  protected HttpRoutePlanner createHttpRoutePlanner()
  {
    ProxySelectorRoutePlanner localProxySelectorRoutePlanner = new org/apache/http/impl/conn/ProxySelectorRoutePlanner;
    SchemeRegistry localSchemeRegistry = getConnectionManager().getSchemeRegistry();
    ProxySelector localProxySelector = ProxySelector.getDefault();
    localProxySelectorRoutePlanner.<init>(localSchemeRegistry, localProxySelector);
    return localProxySelectorRoutePlanner;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\SystemDefaultHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */