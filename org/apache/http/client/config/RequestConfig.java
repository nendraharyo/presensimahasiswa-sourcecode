package org.apache.http.client.config;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;

public class RequestConfig
  implements Cloneable
{
  public static final RequestConfig DEFAULT;
  private final boolean authenticationEnabled;
  private final boolean circularRedirectsAllowed;
  private final int connectTimeout;
  private final int connectionRequestTimeout;
  private final String cookieSpec;
  private final boolean expectContinueEnabled;
  private final InetAddress localAddress;
  private final int maxRedirects;
  private final HttpHost proxy;
  private final Collection proxyPreferredAuthSchemes;
  private final boolean redirectsEnabled;
  private final boolean relativeRedirectsAllowed;
  private final int socketTimeout;
  private final boolean staleConnectionCheckEnabled;
  private final Collection targetPreferredAuthSchemes;
  
  static
  {
    RequestConfig.Builder localBuilder = new org/apache/http/client/config/RequestConfig$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  RequestConfig(boolean paramBoolean1, HttpHost paramHttpHost, InetAddress paramInetAddress, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt1, boolean paramBoolean6, Collection paramCollection1, Collection paramCollection2, int paramInt2, int paramInt3, int paramInt4)
  {
    this.expectContinueEnabled = paramBoolean1;
    this.proxy = paramHttpHost;
    this.localAddress = paramInetAddress;
    this.staleConnectionCheckEnabled = paramBoolean2;
    this.cookieSpec = paramString;
    this.redirectsEnabled = paramBoolean3;
    this.relativeRedirectsAllowed = paramBoolean4;
    this.circularRedirectsAllowed = paramBoolean5;
    this.maxRedirects = paramInt1;
    this.authenticationEnabled = paramBoolean6;
    this.targetPreferredAuthSchemes = paramCollection1;
    this.proxyPreferredAuthSchemes = paramCollection2;
    this.connectionRequestTimeout = paramInt2;
    this.connectTimeout = paramInt3;
    this.socketTimeout = paramInt4;
  }
  
  public static RequestConfig.Builder copy(RequestConfig paramRequestConfig)
  {
    RequestConfig.Builder localBuilder = new org/apache/http/client/config/RequestConfig$Builder;
    localBuilder.<init>();
    boolean bool1 = paramRequestConfig.isExpectContinueEnabled();
    localBuilder = localBuilder.setExpectContinueEnabled(bool1);
    Object localObject = paramRequestConfig.getProxy();
    localBuilder = localBuilder.setProxy((HttpHost)localObject);
    localObject = paramRequestConfig.getLocalAddress();
    localBuilder = localBuilder.setLocalAddress((InetAddress)localObject);
    bool1 = paramRequestConfig.isStaleConnectionCheckEnabled();
    localBuilder = localBuilder.setStaleConnectionCheckEnabled(bool1);
    localObject = paramRequestConfig.getCookieSpec();
    localBuilder = localBuilder.setCookieSpec((String)localObject);
    bool1 = paramRequestConfig.isRedirectsEnabled();
    localBuilder = localBuilder.setRedirectsEnabled(bool1);
    bool1 = paramRequestConfig.isRelativeRedirectsAllowed();
    localBuilder = localBuilder.setRelativeRedirectsAllowed(bool1);
    bool1 = paramRequestConfig.isCircularRedirectsAllowed();
    localBuilder = localBuilder.setCircularRedirectsAllowed(bool1);
    int i = paramRequestConfig.getMaxRedirects();
    localBuilder = localBuilder.setMaxRedirects(i);
    boolean bool2 = paramRequestConfig.isAuthenticationEnabled();
    localBuilder = localBuilder.setAuthenticationEnabled(bool2);
    localObject = paramRequestConfig.getTargetPreferredAuthSchemes();
    localBuilder = localBuilder.setTargetPreferredAuthSchemes((Collection)localObject);
    localObject = paramRequestConfig.getProxyPreferredAuthSchemes();
    localBuilder = localBuilder.setProxyPreferredAuthSchemes((Collection)localObject);
    int j = paramRequestConfig.getConnectionRequestTimeout();
    localBuilder = localBuilder.setConnectionRequestTimeout(j);
    j = paramRequestConfig.getConnectTimeout();
    localBuilder = localBuilder.setConnectTimeout(j);
    j = paramRequestConfig.getSocketTimeout();
    return localBuilder.setSocketTimeout(j);
  }
  
  public static RequestConfig.Builder custom()
  {
    RequestConfig.Builder localBuilder = new org/apache/http/client/config/RequestConfig$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  protected RequestConfig clone()
  {
    return (RequestConfig)super.clone();
  }
  
  public int getConnectTimeout()
  {
    return this.connectTimeout;
  }
  
  public int getConnectionRequestTimeout()
  {
    return this.connectionRequestTimeout;
  }
  
  public String getCookieSpec()
  {
    return this.cookieSpec;
  }
  
  public InetAddress getLocalAddress()
  {
    return this.localAddress;
  }
  
  public int getMaxRedirects()
  {
    return this.maxRedirects;
  }
  
  public HttpHost getProxy()
  {
    return this.proxy;
  }
  
  public Collection getProxyPreferredAuthSchemes()
  {
    return this.proxyPreferredAuthSchemes;
  }
  
  public int getSocketTimeout()
  {
    return this.socketTimeout;
  }
  
  public Collection getTargetPreferredAuthSchemes()
  {
    return this.targetPreferredAuthSchemes;
  }
  
  public boolean isAuthenticationEnabled()
  {
    return this.authenticationEnabled;
  }
  
  public boolean isCircularRedirectsAllowed()
  {
    return this.circularRedirectsAllowed;
  }
  
  public boolean isExpectContinueEnabled()
  {
    return this.expectContinueEnabled;
  }
  
  public boolean isRedirectsEnabled()
  {
    return this.redirectsEnabled;
  }
  
  public boolean isRelativeRedirectsAllowed()
  {
    return this.relativeRedirectsAllowed;
  }
  
  public boolean isStaleConnectionCheckEnabled()
  {
    return this.staleConnectionCheckEnabled;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", expectContinueEnabled=");
    boolean bool1 = this.expectContinueEnabled;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", proxy=");
    Object localObject = this.proxy;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", localAddress=");
    localObject = this.localAddress;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", staleConnectionCheckEnabled=");
    bool1 = this.staleConnectionCheckEnabled;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", cookieSpec=");
    localObject = this.cookieSpec;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", redirectsEnabled=");
    bool1 = this.redirectsEnabled;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", relativeRedirectsAllowed=");
    bool1 = this.relativeRedirectsAllowed;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", maxRedirects=");
    int i = this.maxRedirects;
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", circularRedirectsAllowed=");
    boolean bool2 = this.circularRedirectsAllowed;
    localStringBuilder2.append(bool2);
    localStringBuilder2 = localStringBuilder1.append(", authenticationEnabled=");
    bool2 = this.authenticationEnabled;
    localStringBuilder2.append(bool2);
    localStringBuilder2 = localStringBuilder1.append(", targetPreferredAuthSchemes=");
    localObject = this.targetPreferredAuthSchemes;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", proxyPreferredAuthSchemes=");
    localObject = this.proxyPreferredAuthSchemes;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", connectionRequestTimeout=");
    int j = this.connectionRequestTimeout;
    localStringBuilder2.append(j);
    localStringBuilder2 = localStringBuilder1.append(", connectTimeout=");
    j = this.connectTimeout;
    localStringBuilder2.append(j);
    localStringBuilder2 = localStringBuilder1.append(", socketTimeout=");
    j = this.socketTimeout;
    localStringBuilder2.append(j);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\config\RequestConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */