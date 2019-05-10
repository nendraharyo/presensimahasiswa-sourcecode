package org.apache.http.client.config;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;

public class RequestConfig$Builder
{
  private boolean authenticationEnabled;
  private boolean circularRedirectsAllowed;
  private int connectTimeout;
  private int connectionRequestTimeout;
  private String cookieSpec;
  private boolean expectContinueEnabled;
  private InetAddress localAddress;
  private int maxRedirects;
  private HttpHost proxy;
  private Collection proxyPreferredAuthSchemes;
  private boolean redirectsEnabled;
  private boolean relativeRedirectsAllowed;
  private int socketTimeout;
  private boolean staleConnectionCheckEnabled;
  private Collection targetPreferredAuthSchemes;
  
  RequestConfig$Builder()
  {
    this.staleConnectionCheckEnabled = bool;
    this.redirectsEnabled = bool;
    this.maxRedirects = 50;
    this.relativeRedirectsAllowed = bool;
    this.authenticationEnabled = bool;
    this.connectionRequestTimeout = i;
    this.connectTimeout = i;
    this.socketTimeout = i;
  }
  
  public RequestConfig build()
  {
    RequestConfig localRequestConfig = new org/apache/http/client/config/RequestConfig;
    boolean bool1 = this.expectContinueEnabled;
    HttpHost localHttpHost = this.proxy;
    InetAddress localInetAddress = this.localAddress;
    boolean bool2 = this.staleConnectionCheckEnabled;
    String str = this.cookieSpec;
    boolean bool3 = this.redirectsEnabled;
    boolean bool4 = this.relativeRedirectsAllowed;
    boolean bool5 = this.circularRedirectsAllowed;
    int i = this.maxRedirects;
    boolean bool6 = this.authenticationEnabled;
    Collection localCollection1 = this.targetPreferredAuthSchemes;
    Collection localCollection2 = this.proxyPreferredAuthSchemes;
    int j = this.connectionRequestTimeout;
    int k = this.connectTimeout;
    int m = this.socketTimeout;
    localRequestConfig.<init>(bool1, localHttpHost, localInetAddress, bool2, str, bool3, bool4, bool5, i, bool6, localCollection1, localCollection2, j, k, m);
    return localRequestConfig;
  }
  
  public Builder setAuthenticationEnabled(boolean paramBoolean)
  {
    this.authenticationEnabled = paramBoolean;
    return this;
  }
  
  public Builder setCircularRedirectsAllowed(boolean paramBoolean)
  {
    this.circularRedirectsAllowed = paramBoolean;
    return this;
  }
  
  public Builder setConnectTimeout(int paramInt)
  {
    this.connectTimeout = paramInt;
    return this;
  }
  
  public Builder setConnectionRequestTimeout(int paramInt)
  {
    this.connectionRequestTimeout = paramInt;
    return this;
  }
  
  public Builder setCookieSpec(String paramString)
  {
    this.cookieSpec = paramString;
    return this;
  }
  
  public Builder setExpectContinueEnabled(boolean paramBoolean)
  {
    this.expectContinueEnabled = paramBoolean;
    return this;
  }
  
  public Builder setLocalAddress(InetAddress paramInetAddress)
  {
    this.localAddress = paramInetAddress;
    return this;
  }
  
  public Builder setMaxRedirects(int paramInt)
  {
    this.maxRedirects = paramInt;
    return this;
  }
  
  public Builder setProxy(HttpHost paramHttpHost)
  {
    this.proxy = paramHttpHost;
    return this;
  }
  
  public Builder setProxyPreferredAuthSchemes(Collection paramCollection)
  {
    this.proxyPreferredAuthSchemes = paramCollection;
    return this;
  }
  
  public Builder setRedirectsEnabled(boolean paramBoolean)
  {
    this.redirectsEnabled = paramBoolean;
    return this;
  }
  
  public Builder setRelativeRedirectsAllowed(boolean paramBoolean)
  {
    this.relativeRedirectsAllowed = paramBoolean;
    return this;
  }
  
  public Builder setSocketTimeout(int paramInt)
  {
    this.socketTimeout = paramInt;
    return this;
  }
  
  public Builder setStaleConnectionCheckEnabled(boolean paramBoolean)
  {
    this.staleConnectionCheckEnabled = paramBoolean;
    return this;
  }
  
  public Builder setTargetPreferredAuthSchemes(Collection paramCollection)
  {
    this.targetPreferredAuthSchemes = paramCollection;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\config\RequestConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */