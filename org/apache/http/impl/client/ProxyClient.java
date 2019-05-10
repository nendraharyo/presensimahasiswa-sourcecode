package org.apache.http.impl.client;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.ManagedHttpClientConnectionFactory;
import org.apache.http.impl.execchain.TunnelRefusedException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

public class ProxyClient
{
  private final AuthSchemeRegistry authSchemeRegistry;
  private final HttpAuthenticator authenticator;
  private final HttpConnectionFactory connFactory;
  private final ConnectionConfig connectionConfig;
  private final HttpProcessor httpProcessor;
  private final AuthState proxyAuthState;
  private final ProxyAuthenticationStrategy proxyAuthStrategy;
  private final RequestConfig requestConfig;
  private final HttpRequestExecutor requestExec;
  private final ConnectionReuseStrategy reuseStrategy;
  
  public ProxyClient()
  {
    this(null, null, null);
  }
  
  public ProxyClient(RequestConfig paramRequestConfig)
  {
    this(null, null, paramRequestConfig);
  }
  
  public ProxyClient(HttpConnectionFactory paramHttpConnectionFactory, ConnectionConfig paramConnectionConfig, RequestConfig paramRequestConfig)
  {
    if (paramHttpConnectionFactory != null)
    {
      this.connFactory = paramHttpConnectionFactory;
      if (paramConnectionConfig == null) {
        break label332;
      }
      label17:
      this.connectionConfig = paramConnectionConfig;
      if (paramRequestConfig == null) {
        break label339;
      }
    }
    for (;;)
    {
      this.requestConfig = paramRequestConfig;
      Object localObject1 = new org/apache/http/protocol/ImmutableHttpProcessor;
      HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = new HttpRequestInterceptor[3];
      Object localObject2 = new org/apache/http/protocol/RequestTargetHost;
      ((RequestTargetHost)localObject2).<init>();
      arrayOfHttpRequestInterceptor[0] = localObject2;
      localObject2 = new org/apache/http/client/protocol/RequestClientConnControl;
      ((RequestClientConnControl)localObject2).<init>();
      arrayOfHttpRequestInterceptor[1] = localObject2;
      localObject2 = new org/apache/http/protocol/RequestUserAgent;
      ((RequestUserAgent)localObject2).<init>();
      arrayOfHttpRequestInterceptor[2] = localObject2;
      ((ImmutableHttpProcessor)localObject1).<init>(arrayOfHttpRequestInterceptor);
      this.httpProcessor = ((HttpProcessor)localObject1);
      localObject1 = new org/apache/http/protocol/HttpRequestExecutor;
      ((HttpRequestExecutor)localObject1).<init>();
      this.requestExec = ((HttpRequestExecutor)localObject1);
      localObject1 = new org/apache/http/impl/client/ProxyAuthenticationStrategy;
      ((ProxyAuthenticationStrategy)localObject1).<init>();
      this.proxyAuthStrategy = ((ProxyAuthenticationStrategy)localObject1);
      localObject1 = new org/apache/http/impl/auth/HttpAuthenticator;
      ((HttpAuthenticator)localObject1).<init>();
      this.authenticator = ((HttpAuthenticator)localObject1);
      localObject1 = new org/apache/http/auth/AuthState;
      ((AuthState)localObject1).<init>();
      this.proxyAuthState = ((AuthState)localObject1);
      localObject1 = new org/apache/http/auth/AuthSchemeRegistry;
      ((AuthSchemeRegistry)localObject1).<init>();
      this.authSchemeRegistry = ((AuthSchemeRegistry)localObject1);
      localObject1 = this.authSchemeRegistry;
      Object localObject3 = new org/apache/http/impl/auth/BasicSchemeFactory;
      ((BasicSchemeFactory)localObject3).<init>();
      ((AuthSchemeRegistry)localObject1).register("Basic", (AuthSchemeFactory)localObject3);
      localObject1 = this.authSchemeRegistry;
      localObject3 = new org/apache/http/impl/auth/DigestSchemeFactory;
      ((DigestSchemeFactory)localObject3).<init>();
      ((AuthSchemeRegistry)localObject1).register("Digest", (AuthSchemeFactory)localObject3);
      localObject1 = this.authSchemeRegistry;
      localObject3 = new org/apache/http/impl/auth/NTLMSchemeFactory;
      ((NTLMSchemeFactory)localObject3).<init>();
      ((AuthSchemeRegistry)localObject1).register("NTLM", (AuthSchemeFactory)localObject3);
      localObject1 = this.authSchemeRegistry;
      localObject3 = new org/apache/http/impl/auth/SPNegoSchemeFactory;
      ((SPNegoSchemeFactory)localObject3).<init>();
      ((AuthSchemeRegistry)localObject1).register("negotiate", (AuthSchemeFactory)localObject3);
      localObject1 = this.authSchemeRegistry;
      localObject3 = new org/apache/http/impl/auth/KerberosSchemeFactory;
      ((KerberosSchemeFactory)localObject3).<init>();
      ((AuthSchemeRegistry)localObject1).register("Kerberos", (AuthSchemeFactory)localObject3);
      localObject1 = new org/apache/http/impl/DefaultConnectionReuseStrategy;
      ((DefaultConnectionReuseStrategy)localObject1).<init>();
      this.reuseStrategy = ((ConnectionReuseStrategy)localObject1);
      return;
      paramHttpConnectionFactory = ManagedHttpClientConnectionFactory.INSTANCE;
      break;
      label332:
      paramConnectionConfig = ConnectionConfig.DEFAULT;
      break label17;
      label339:
      paramRequestConfig = RequestConfig.DEFAULT;
    }
  }
  
  public ProxyClient(HttpParams paramHttpParams)
  {
    this(null, localConnectionConfig, localRequestConfig);
  }
  
  public AuthSchemeRegistry getAuthSchemeRegistry()
  {
    return this.authSchemeRegistry;
  }
  
  public HttpParams getParams()
  {
    BasicHttpParams localBasicHttpParams = new org/apache/http/params/BasicHttpParams;
    localBasicHttpParams.<init>();
    return localBasicHttpParams;
  }
  
  public Socket tunnel(HttpHost paramHttpHost1, HttpHost paramHttpHost2, Credentials paramCredentials)
  {
    Args.notNull(paramHttpHost1, "Proxy host");
    Args.notNull(paramHttpHost2, "Target host");
    Object localObject1 = "Credentials";
    Args.notNull(paramCredentials, (String)localObject1);
    int i = paramHttpHost2.getPort();
    Object localObject2;
    int m;
    Object localObject3;
    if (i <= 0)
    {
      localObject2 = new org/apache/http/HttpHost;
      localObject1 = paramHttpHost2.getHostName();
      m = 80;
      localObject3 = paramHttpHost2.getSchemeName();
      ((HttpHost)localObject2).<init>((String)localObject1, m, (String)localObject3);
    }
    for (;;)
    {
      localObject1 = new org/apache/http/conn/routing/HttpRoute;
      Object localObject4 = this.requestConfig.getLocalAddress();
      AuthState localAuthState = null;
      Object localObject5 = RouteInfo.TunnelType.TUNNELLED;
      Object localObject6 = RouteInfo.LayerType.PLAIN;
      localObject3 = paramHttpHost1;
      ((HttpRoute)localObject1).<init>((HttpHost)localObject2, (InetAddress)localObject4, paramHttpHost1, false, (RouteInfo.TunnelType)localObject5, (RouteInfo.LayerType)localObject6);
      localObject4 = this.connFactory;
      localObject3 = this.connectionConfig;
      localObject4 = ((HttpConnectionFactory)localObject4).create(localObject1, (ConnectionConfig)localObject3);
      localObject6 = localObject4;
      localObject6 = (ManagedHttpClientConnection)localObject4;
      localObject5 = new org/apache/http/protocol/BasicHttpContext;
      ((BasicHttpContext)localObject5).<init>();
      BasicHttpRequest localBasicHttpRequest = new org/apache/http/message/BasicHttpRequest;
      localObject2 = ((HttpHost)localObject2).toHostString();
      localObject3 = HttpVersion.HTTP_1_1;
      localBasicHttpRequest.<init>("CONNECT", (String)localObject2, (ProtocolVersion)localObject3);
      localObject2 = new org/apache/http/impl/client/BasicCredentialsProvider;
      ((BasicCredentialsProvider)localObject2).<init>();
      localObject4 = new org/apache/http/auth/AuthScope;
      ((AuthScope)localObject4).<init>(paramHttpHost1);
      ((BasicCredentialsProvider)localObject2).setCredentials((AuthScope)localObject4, paramCredentials);
      ((HttpContext)localObject5).setAttribute("http.target_host", paramHttpHost2);
      ((HttpContext)localObject5).setAttribute("http.connection", localObject6);
      ((HttpContext)localObject5).setAttribute("http.request", localBasicHttpRequest);
      ((HttpContext)localObject5).setAttribute("http.route", localObject1);
      localObject4 = this.proxyAuthState;
      ((HttpContext)localObject5).setAttribute("http.auth.proxy-scope", localObject4);
      ((HttpContext)localObject5).setAttribute("http.auth.credentials-provider", localObject2);
      localObject2 = this.authSchemeRegistry;
      ((HttpContext)localObject5).setAttribute("http.authscheme-registry", localObject2);
      localObject2 = this.requestConfig;
      ((HttpContext)localObject5).setAttribute("http.request-config", localObject2);
      localObject1 = this.requestExec;
      localObject2 = this.httpProcessor;
      ((HttpRequestExecutor)localObject1).preProcess(localBasicHttpRequest, (HttpProcessor)localObject2, (HttpContext)localObject5);
      boolean bool1 = ((ManagedHttpClientConnection)localObject6).isOpen();
      if (!bool1)
      {
        localObject1 = new java/net/Socket;
        localObject2 = paramHttpHost1.getHostName();
        m = paramHttpHost1.getPort();
        ((Socket)localObject1).<init>((String)localObject2, m);
        ((ManagedHttpClientConnection)localObject6).bind((Socket)localObject1);
      }
      localObject1 = this.authenticator;
      localObject2 = this.proxyAuthState;
      ((HttpAuthenticator)localObject1).generateAuthResponse(localBasicHttpRequest, (AuthState)localObject2, (HttpContext)localObject5);
      localObject4 = this.requestExec.execute(localBasicHttpRequest, (HttpClientConnection)localObject6, (HttpContext)localObject5);
      localObject1 = ((HttpResponse)localObject4).getStatusLine();
      int j = ((StatusLine)localObject1).getStatusCode();
      int n = 200;
      if (j < n)
      {
        localObject1 = new org/apache/http/HttpException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unexpected response to CONNECT request: ");
        localObject4 = ((HttpResponse)localObject4).getStatusLine();
        localObject2 = localObject4;
        ((HttpException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = this.authenticator;
      localObject3 = this.proxyAuthStrategy;
      localAuthState = this.proxyAuthState;
      localObject2 = paramHttpHost1;
      boolean bool2 = ((HttpAuthenticator)localObject1).isAuthenticationRequested(paramHttpHost1, (HttpResponse)localObject4, (AuthenticationStrategy)localObject3, localAuthState, (HttpContext)localObject5);
      if (bool2)
      {
        localObject1 = this.authenticator;
        localObject3 = this.proxyAuthStrategy;
        localAuthState = this.proxyAuthState;
        bool2 = ((HttpAuthenticator)localObject1).handleAuthChallenge(paramHttpHost1, (HttpResponse)localObject4, (AuthenticationStrategy)localObject3, localAuthState, (HttpContext)localObject5);
        if (bool2)
        {
          localObject1 = this.reuseStrategy;
          bool2 = ((ConnectionReuseStrategy)localObject1).keepAlive((HttpResponse)localObject4, (HttpContext)localObject5);
          if (bool2)
          {
            localObject1 = ((HttpResponse)localObject4).getEntity();
            EntityUtils.consume((HttpEntity)localObject1);
          }
          for (;;)
          {
            localObject1 = "Proxy-Authorization";
            localBasicHttpRequest.removeHeaders((String)localObject1);
            break;
            ((ManagedHttpClientConnection)localObject6).close();
          }
        }
      }
      localObject1 = ((HttpResponse)localObject4).getStatusLine();
      int k = ((StatusLine)localObject1).getStatusCode();
      n = 299;
      if (k > n)
      {
        localObject1 = ((HttpResponse)localObject4).getEntity();
        if (localObject1 != null)
        {
          localObject2 = new org/apache/http/entity/BufferedHttpEntity;
          ((BufferedHttpEntity)localObject2).<init>((HttpEntity)localObject1);
          ((HttpResponse)localObject4).setEntity((HttpEntity)localObject2);
        }
        ((ManagedHttpClientConnection)localObject6).close();
        localObject1 = new org/apache/http/impl/execchain/TunnelRefusedException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("CONNECT refused by proxy: ");
        localObject3 = ((HttpResponse)localObject4).getStatusLine();
        localObject2 = localObject3;
        ((TunnelRefusedException)localObject1).<init>((String)localObject2, (HttpResponse)localObject4);
        throw ((Throwable)localObject1);
      }
      return ((ManagedHttpClientConnection)localObject6).getSocket();
      localObject2 = paramHttpHost2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\ProxyClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */