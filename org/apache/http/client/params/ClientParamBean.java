package org.apache.http.client.params;

import java.util.Collection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

public class ClientParamBean
  extends HttpAbstractParamBean
{
  public ClientParamBean(HttpParams paramHttpParams)
  {
    super(paramHttpParams);
  }
  
  public void setAllowCircularRedirects(boolean paramBoolean)
  {
    this.params.setBooleanParameter("http.protocol.allow-circular-redirects", paramBoolean);
  }
  
  public void setConnectionManagerFactoryClassName(String paramString)
  {
    this.params.setParameter("http.connection-manager.factory-class-name", paramString);
  }
  
  public void setConnectionManagerTimeout(long paramLong)
  {
    this.params.setLongParameter("http.conn-manager.timeout", paramLong);
  }
  
  public void setCookiePolicy(String paramString)
  {
    this.params.setParameter("http.protocol.cookie-policy", paramString);
  }
  
  public void setDefaultHeaders(Collection paramCollection)
  {
    this.params.setParameter("http.default-headers", paramCollection);
  }
  
  public void setDefaultHost(HttpHost paramHttpHost)
  {
    this.params.setParameter("http.default-host", paramHttpHost);
  }
  
  public void setHandleAuthentication(boolean paramBoolean)
  {
    this.params.setBooleanParameter("http.protocol.handle-authentication", paramBoolean);
  }
  
  public void setHandleRedirects(boolean paramBoolean)
  {
    this.params.setBooleanParameter("http.protocol.handle-redirects", paramBoolean);
  }
  
  public void setMaxRedirects(int paramInt)
  {
    this.params.setIntParameter("http.protocol.max-redirects", paramInt);
  }
  
  public void setRejectRelativeRedirect(boolean paramBoolean)
  {
    this.params.setBooleanParameter("http.protocol.reject-relative-redirect", paramBoolean);
  }
  
  public void setVirtualHost(HttpHost paramHttpHost)
  {
    this.params.setParameter("http.virtual-host", paramHttpHost);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\params\ClientParamBean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */