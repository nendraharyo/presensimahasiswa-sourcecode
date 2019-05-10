package org.apache.http.impl.client;

import java.util.Collection;
import org.apache.http.client.config.RequestConfig;

public class ProxyAuthenticationStrategy
  extends AuthenticationStrategyImpl
{
  public static final ProxyAuthenticationStrategy INSTANCE;
  
  static
  {
    ProxyAuthenticationStrategy localProxyAuthenticationStrategy = new org/apache/http/impl/client/ProxyAuthenticationStrategy;
    localProxyAuthenticationStrategy.<init>();
    INSTANCE = localProxyAuthenticationStrategy;
  }
  
  public ProxyAuthenticationStrategy()
  {
    super(407, "Proxy-Authenticate");
  }
  
  Collection getPreferredAuthSchemes(RequestConfig paramRequestConfig)
  {
    return paramRequestConfig.getProxyPreferredAuthSchemes();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\ProxyAuthenticationStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */