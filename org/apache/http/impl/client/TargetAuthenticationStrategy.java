package org.apache.http.impl.client;

import java.util.Collection;
import org.apache.http.client.config.RequestConfig;

public class TargetAuthenticationStrategy
  extends AuthenticationStrategyImpl
{
  public static final TargetAuthenticationStrategy INSTANCE;
  
  static
  {
    TargetAuthenticationStrategy localTargetAuthenticationStrategy = new org/apache/http/impl/client/TargetAuthenticationStrategy;
    localTargetAuthenticationStrategy.<init>();
    INSTANCE = localTargetAuthenticationStrategy;
  }
  
  public TargetAuthenticationStrategy()
  {
    super(401, "WWW-Authenticate");
  }
  
  Collection getPreferredAuthSchemes(RequestConfig paramRequestConfig)
  {
    return paramRequestConfig.getTargetPreferredAuthSchemes();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\TargetAuthenticationStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */