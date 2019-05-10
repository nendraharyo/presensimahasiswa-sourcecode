package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.BasicManagedEntity;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

public class DefaultRequestDirector
  implements RequestDirector
{
  private final HttpAuthenticator authenticator;
  protected final ClientConnectionManager connManager;
  private int execCount;
  protected final HttpProcessor httpProcessor;
  protected final ConnectionKeepAliveStrategy keepAliveStrategy;
  private final Log log;
  protected ManagedClientConnection managedConn;
  private final int maxRedirects;
  protected final HttpParams params;
  protected final AuthenticationHandler proxyAuthHandler;
  protected final AuthState proxyAuthState;
  protected final AuthenticationStrategy proxyAuthStrategy;
  private int redirectCount;
  protected final RedirectHandler redirectHandler;
  protected final RedirectStrategy redirectStrategy;
  protected final HttpRequestExecutor requestExec;
  protected final HttpRequestRetryHandler retryHandler;
  protected final ConnectionReuseStrategy reuseStrategy;
  protected final HttpRoutePlanner routePlanner;
  protected final AuthenticationHandler targetAuthHandler;
  protected final AuthState targetAuthState;
  protected final AuthenticationStrategy targetAuthStrategy;
  protected final UserTokenHandler userTokenHandler;
  private HttpHost virtualHost;
  
  public DefaultRequestDirector(Log paramLog, HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectStrategy paramRedirectStrategy, AuthenticationHandler paramAuthenticationHandler1, AuthenticationHandler paramAuthenticationHandler2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    this(localLog, paramHttpRequestExecutor, paramClientConnectionManager, paramConnectionReuseStrategy, paramConnectionKeepAliveStrategy, paramHttpRoutePlanner, paramHttpProcessor, paramHttpRequestRetryHandler, paramRedirectStrategy, localAuthenticationStrategyAdaptor1, localAuthenticationStrategyAdaptor2, paramUserTokenHandler, paramHttpParams);
  }
  
  public DefaultRequestDirector(Log paramLog, HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectStrategy paramRedirectStrategy, AuthenticationStrategy paramAuthenticationStrategy1, AuthenticationStrategy paramAuthenticationStrategy2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    Args.notNull(paramLog, "Log");
    Args.notNull(paramHttpRequestExecutor, "Request executor");
    Args.notNull(paramClientConnectionManager, "Client connection manager");
    Args.notNull(paramConnectionReuseStrategy, "Connection reuse strategy");
    Args.notNull(paramConnectionKeepAliveStrategy, "Connection keep alive strategy");
    Args.notNull(paramHttpRoutePlanner, "Route planner");
    Args.notNull(paramHttpProcessor, "HTTP protocol processor");
    Args.notNull(paramHttpRequestRetryHandler, "HTTP request retry handler");
    Args.notNull(paramRedirectStrategy, "Redirect strategy");
    Args.notNull(paramAuthenticationStrategy1, "Target authentication strategy");
    Args.notNull(paramAuthenticationStrategy2, "Proxy authentication strategy");
    Args.notNull(paramUserTokenHandler, "User token handler");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.log = paramLog;
    Object localObject = new org/apache/http/impl/client/HttpAuthenticator;
    ((HttpAuthenticator)localObject).<init>(paramLog);
    this.authenticator = ((HttpAuthenticator)localObject);
    this.requestExec = paramHttpRequestExecutor;
    this.connManager = paramClientConnectionManager;
    this.reuseStrategy = paramConnectionReuseStrategy;
    this.keepAliveStrategy = paramConnectionKeepAliveStrategy;
    this.routePlanner = paramHttpRoutePlanner;
    this.httpProcessor = paramHttpProcessor;
    this.retryHandler = paramHttpRequestRetryHandler;
    this.redirectStrategy = paramRedirectStrategy;
    this.targetAuthStrategy = paramAuthenticationStrategy1;
    this.proxyAuthStrategy = paramAuthenticationStrategy2;
    this.userTokenHandler = paramUserTokenHandler;
    this.params = paramHttpParams;
    boolean bool = paramRedirectStrategy instanceof DefaultRedirectStrategyAdaptor;
    if (bool)
    {
      paramRedirectStrategy = (DefaultRedirectStrategyAdaptor)paramRedirectStrategy;
      localObject = paramRedirectStrategy.getHandler();
      this.redirectHandler = ((RedirectHandler)localObject);
      bool = paramAuthenticationStrategy1 instanceof AuthenticationStrategyAdaptor;
      if (!bool) {
        break label376;
      }
      paramAuthenticationStrategy1 = (AuthenticationStrategyAdaptor)paramAuthenticationStrategy1;
      localObject = paramAuthenticationStrategy1.getHandler();
      this.targetAuthHandler = ((AuthenticationHandler)localObject);
      label261:
      bool = paramAuthenticationStrategy2 instanceof AuthenticationStrategyAdaptor;
      if (!bool) {
        break label390;
      }
      paramAuthenticationStrategy2 = (AuthenticationStrategyAdaptor)paramAuthenticationStrategy2;
      localObject = paramAuthenticationStrategy2.getHandler();
    }
    for (this.proxyAuthHandler = ((AuthenticationHandler)localObject);; this.proxyAuthHandler = null)
    {
      this.managedConn = null;
      this.execCount = 0;
      this.redirectCount = 0;
      localObject = new org/apache/http/auth/AuthState;
      ((AuthState)localObject).<init>();
      this.targetAuthState = ((AuthState)localObject);
      localObject = new org/apache/http/auth/AuthState;
      ((AuthState)localObject).<init>();
      this.proxyAuthState = ((AuthState)localObject);
      int i = this.params.getIntParameter("http.protocol.max-redirects", 100);
      this.maxRedirects = i;
      return;
      i = 0;
      localObject = null;
      this.redirectHandler = null;
      break;
      label376:
      i = 0;
      localObject = null;
      this.targetAuthHandler = null;
      break label261;
      label390:
      i = 0;
      localObject = null;
    }
  }
  
  public DefaultRequestDirector(HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectHandler paramRedirectHandler, AuthenticationHandler paramAuthenticationHandler1, AuthenticationHandler paramAuthenticationHandler2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    this(localLog, paramHttpRequestExecutor, paramClientConnectionManager, paramConnectionReuseStrategy, paramConnectionKeepAliveStrategy, paramHttpRoutePlanner, paramHttpProcessor, paramHttpRequestRetryHandler, localDefaultRedirectStrategyAdaptor, localAuthenticationStrategyAdaptor1, localAuthenticationStrategyAdaptor2, paramUserTokenHandler, paramHttpParams);
  }
  
  private void abortConnection()
  {
    ManagedClientConnection localManagedClientConnection = this.managedConn;
    if (localManagedClientConnection != null)
    {
      Object localObject1 = null;
      this.managedConn = null;
    }
    try
    {
      localManagedClientConnection.abortConnection();
    }
    catch (IOException localIOException2)
    {
      try
      {
        for (;;)
        {
          localManagedClientConnection.releaseConnection();
          return;
          localIOException2 = localIOException2;
          localObject2 = this.log;
          boolean bool = ((Log)localObject2).isDebugEnabled();
          if (bool)
          {
            localObject2 = this.log;
            String str = localIOException2.getMessage();
            ((Log)localObject2).debug(str, localIOException2);
          }
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          Log localLog = this.log;
          Object localObject2 = "Error releasing connection";
          localLog.debug(localObject2, localIOException1);
        }
      }
    }
  }
  
  private void tryConnect(RoutedRequest paramRoutedRequest, HttpContext paramHttpContext)
  {
    HttpRoute localHttpRoute = paramRoutedRequest.getRoute();
    RequestWrapper localRequestWrapper = paramRoutedRequest.getRequest();
    int i = 0;
    for (;;)
    {
      Object localObject1 = "http.request";
      paramHttpContext.setAttribute((String)localObject1, localRequestWrapper);
      i += 1;
      try
      {
        localObject1 = this.managedConn;
        boolean bool1 = ((ManagedClientConnection)localObject1).isOpen();
        Object localObject2;
        if (!bool1)
        {
          localObject1 = this.managedConn;
          localObject2 = this.params;
          ((ManagedClientConnection)localObject1).open(localHttpRoute, paramHttpContext, (HttpParams)localObject2);
        }
        for (;;)
        {
          establishRoute(localHttpRoute, paramHttpContext);
          return;
          localObject1 = this.managedConn;
          localObject2 = this.params;
          int j = HttpConnectionParams.getSoTimeout((HttpParams)localObject2);
          ((ManagedClientConnection)localObject1).setSocketTimeout(j);
        }
        try
        {
          localObject2 = this.managedConn;
          ((ManagedClientConnection)localObject2).close();
        }
        catch (IOException localIOException2)
        {
          boolean bool2;
          Object localObject3;
          String str;
          Log localLog;
          for (;;) {}
        }
      }
      catch (IOException localIOException1) {}
      localObject2 = this.retryHandler;
      bool2 = ((HttpRequestRetryHandler)localObject2).retryRequest(localIOException1, i, paramHttpContext);
      if (!bool2) {
        break;
      }
      localObject2 = this.log;
      bool2 = ((Log)localObject2).isInfoEnabled();
      if (bool2)
      {
        localObject2 = this.log;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("I/O exception (");
        str = localIOException1.getClass().getName();
        localObject3 = ((StringBuilder)localObject3).append(str).append(") caught when connecting to ").append(localHttpRoute).append(": ");
        str = localIOException1.getMessage();
        localObject3 = str;
        ((Log)localObject2).info(localObject3);
        localObject2 = this.log;
        bool2 = ((Log)localObject2).isDebugEnabled();
        if (bool2)
        {
          localObject2 = this.log;
          localObject3 = localIOException1.getMessage();
          ((Log)localObject2).debug(localObject3, localIOException1);
        }
        localLog = this.log;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Retrying connect to ";
        localObject2 = (String)localObject3 + localHttpRoute;
        localLog.info(localObject2);
      }
    }
    throw localLog;
  }
  
  private HttpResponse tryExecute(RoutedRequest paramRoutedRequest, HttpContext paramHttpContext)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = paramRoutedRequest.getRequest();
    Object localObject3 = paramRoutedRequest.getRoute();
    boolean bool2 = false;
    Object localObject4 = null;
    for (;;)
    {
      int i = this.execCount + 1;
      this.execCount = i;
      ((RequestWrapper)localObject2).incrementExecCount();
      boolean bool3 = ((RequestWrapper)localObject2).isRepeatable();
      if (!bool3)
      {
        localObject1 = this.log;
        localObject2 = "Cannot retry non-repeatable request";
        ((Log)localObject1).debug(localObject2);
        if (localObject4 != null)
        {
          localObject1 = new org/apache/http/client/NonRepeatableRequestException;
          ((NonRepeatableRequestException)localObject1).<init>("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", (Throwable)localObject4);
          throw ((Throwable)localObject1);
        }
        localObject4 = new org/apache/http/client/NonRepeatableRequestException;
        ((NonRepeatableRequestException)localObject4).<init>("Cannot retry request with a non-repeatable request entity.");
        throw ((Throwable)localObject4);
      }
      try
      {
        localObject4 = this.managedConn;
        bool2 = ((ManagedClientConnection)localObject4).isOpen();
        Object localObject5;
        Object localObject6;
        int j;
        if (!bool2)
        {
          bool2 = ((HttpRoute)localObject3).isTunnelled();
          if (!bool2)
          {
            localObject4 = this.log;
            localObject5 = "Reopening the direct connection.";
            ((Log)localObject4).debug(localObject5);
            localObject4 = this.managedConn;
            localObject5 = this.params;
            ((ManagedClientConnection)localObject4).open((HttpRoute)localObject3, paramHttpContext, (HttpParams)localObject5);
          }
        }
        else
        {
          localObject4 = this.log;
          bool2 = ((Log)localObject4).isDebugEnabled();
          if (bool2)
          {
            localObject4 = this.log;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "Attempt ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            j = this.execCount;
            localObject5 = ((StringBuilder)localObject5).append(j);
            localObject6 = " to execute request";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            ((Log)localObject4).debug(localObject5);
          }
          localObject4 = this.requestExec;
          localObject5 = this.managedConn;
          localObject1 = ((HttpRequestExecutor)localObject4).execute((HttpRequest)localObject2, (HttpClientConnection)localObject5, paramHttpContext);
        }
        for (;;)
        {
          return (HttpResponse)localObject1;
          localObject4 = this.log;
          localObject5 = "Proxied connection. Need to start over.";
          ((Log)localObject4).debug(localObject5);
        }
        try
        {
          localObject5 = this.managedConn;
          ((ManagedClientConnection)localObject5).close();
        }
        catch (IOException localIOException2)
        {
          String str;
          StackTraceElement[] arrayOfStackTraceElement;
          for (;;) {}
        }
      }
      catch (IOException localIOException1)
      {
        localObject5 = this.log;
        localObject6 = "Closing the connection.";
        ((Log)localObject5).debug(localObject6);
      }
      localObject5 = this.retryHandler;
      j = ((RequestWrapper)localObject2).getExecCount();
      bool3 = ((HttpRequestRetryHandler)localObject5).retryRequest(localIOException1, j, paramHttpContext);
      if (!bool3) {
        break;
      }
      localObject5 = this.log;
      bool3 = ((Log)localObject5).isInfoEnabled();
      if (bool3)
      {
        localObject5 = this.log;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject6 = ((StringBuilder)localObject6).append("I/O exception (");
        str = localIOException1.getClass().getName();
        localObject6 = ((StringBuilder)localObject6).append(str).append(") caught when processing request to ").append(localObject3).append(": ");
        str = localIOException1.getMessage();
        localObject6 = str;
        ((Log)localObject5).info(localObject6);
      }
      localObject5 = this.log;
      bool3 = ((Log)localObject5).isDebugEnabled();
      if (bool3)
      {
        localObject5 = this.log;
        localObject6 = localIOException1.getMessage();
        ((Log)localObject5).debug(localObject6, localIOException1);
      }
      localObject5 = this.log;
      bool3 = ((Log)localObject5).isInfoEnabled();
      if (bool3)
      {
        localObject5 = this.log;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        str = "Retrying request to ";
        localObject6 = str + localObject3;
        ((Log)localObject5).info(localObject6);
      }
    }
    bool1 = localIOException1 instanceof NoHttpResponseException;
    if (bool1)
    {
      localObject1 = new org/apache/http/NoHttpResponseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = ((HttpRoute)localObject3).getTargetHost().toHostString();
      localObject2 = (String)localObject3 + " failed to respond";
      ((NoHttpResponseException)localObject1).<init>((String)localObject2);
      arrayOfStackTraceElement = ((IOException)localIOException1).getStackTrace();
      ((NoHttpResponseException)localObject1).setStackTrace(arrayOfStackTraceElement);
      throw ((Throwable)localObject1);
    }
    throw arrayOfStackTraceElement;
  }
  
  private RequestWrapper wrapRequest(HttpRequest paramHttpRequest)
  {
    boolean bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    Object localObject;
    if (bool)
    {
      localObject = new org/apache/http/impl/client/EntityEnclosingRequestWrapper;
      paramHttpRequest = (HttpEntityEnclosingRequest)paramHttpRequest;
      ((EntityEnclosingRequestWrapper)localObject).<init>(paramHttpRequest);
    }
    for (;;)
    {
      return (RequestWrapper)localObject;
      localObject = new org/apache/http/impl/client/RequestWrapper;
      ((RequestWrapper)localObject).<init>(paramHttpRequest);
    }
  }
  
  protected HttpRequest createConnectRequest(HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Object localObject1 = paramHttpRoute.getTargetHost();
    Object localObject2 = ((HttpHost)localObject1).getHostName();
    int i = ((HttpHost)localObject1).getPort();
    if (i < 0)
    {
      localObject3 = this.connManager.getSchemeRegistry();
      localObject1 = ((HttpHost)localObject1).getSchemeName();
      localObject3 = ((SchemeRegistry)localObject3).getScheme((String)localObject1);
      i = ((Scheme)localObject3).getDefaultPort();
    }
    localObject1 = new java/lang/StringBuilder;
    int j = ((String)localObject2).length() + 6;
    ((StringBuilder)localObject1).<init>(j);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(':');
    Object localObject3 = Integer.toString(i);
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject3 = ((StringBuilder)localObject1).toString();
    localObject1 = HttpProtocolParams.getVersion(this.params);
    localObject2 = new org/apache/http/message/BasicHttpRequest;
    ((BasicHttpRequest)localObject2).<init>("CONNECT", (String)localObject3, (ProtocolVersion)localObject1);
    return (HttpRequest)localObject2;
  }
  
  protected boolean createTunnelToProxy(HttpRoute paramHttpRoute, int paramInt, HttpContext paramHttpContext)
  {
    HttpException localHttpException = new org/apache/http/HttpException;
    localHttpException.<init>("Proxy chains are not supported.");
    throw localHttpException;
  }
  
  protected boolean createTunnelToTarget(HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Object localObject1 = paramHttpRoute.getProxyHost();
    HttpHost localHttpHost = paramHttpRoute.getTargetHost();
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      localObject2 = this.managedConn;
      boolean bool1 = ((ManagedClientConnection)localObject2).isOpen();
      if (!bool1)
      {
        localObject2 = this.managedConn;
        localObject3 = this.params;
        ((ManagedClientConnection)localObject2).open(paramHttpRoute, paramHttpContext, (HttpParams)localObject3);
      }
      localObject2 = createConnectRequest(paramHttpRoute, paramHttpContext);
      localObject3 = this.params;
      ((HttpRequest)localObject2).setParams((HttpParams)localObject3);
      paramHttpContext.setAttribute("http.target_host", localHttpHost);
      paramHttpContext.setAttribute("http.route", paramHttpRoute);
      paramHttpContext.setAttribute("http.proxy_host", localObject1);
      localObject4 = this.managedConn;
      paramHttpContext.setAttribute("http.connection", localObject4);
      paramHttpContext.setAttribute("http.request", localObject2);
      localObject3 = this.requestExec;
      localObject4 = this.httpProcessor;
      ((HttpRequestExecutor)localObject3).preProcess((HttpRequest)localObject2, (HttpProcessor)localObject4, paramHttpContext);
      localObject3 = this.requestExec;
      localObject4 = this.managedConn;
      localObject3 = ((HttpRequestExecutor)localObject3).execute((HttpRequest)localObject2, (HttpClientConnection)localObject4, paramHttpContext);
      localObject2 = this.params;
      ((HttpResponse)localObject3).setParams((HttpParams)localObject2);
      localObject2 = this.requestExec;
      localObject4 = this.httpProcessor;
      ((HttpRequestExecutor)localObject2).postProcess((HttpResponse)localObject3, (HttpProcessor)localObject4, paramHttpContext);
      localObject2 = ((HttpResponse)localObject3).getStatusLine();
      int i = ((StatusLine)localObject2).getStatusCode();
      int k = 200;
      if (i < k)
      {
        localObject2 = new org/apache/http/HttpException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Unexpected response to CONNECT request: ");
        localObject3 = ((HttpResponse)localObject3).getStatusLine();
        localObject1 = localObject3;
        ((HttpException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.params;
      boolean bool2 = HttpClientParams.isAuthenticating((HttpParams)localObject2);
      if (bool2)
      {
        localObject2 = this.authenticator;
        localObject4 = this.proxyAuthStrategy;
        AuthState localAuthState = this.proxyAuthState;
        bool2 = ((HttpAuthenticator)localObject2).isAuthenticationRequested((HttpHost)localObject1, (HttpResponse)localObject3, (AuthenticationStrategy)localObject4, localAuthState, paramHttpContext);
        if (!bool2) {
          break;
        }
        localObject2 = this.authenticator;
        localObject4 = this.proxyAuthStrategy;
        localAuthState = this.proxyAuthState;
        bool2 = ((HttpAuthenticator)localObject2).authenticate((HttpHost)localObject1, (HttpResponse)localObject3, (AuthenticationStrategy)localObject4, localAuthState, paramHttpContext);
        if (!bool2) {
          break;
        }
        localObject2 = this.reuseStrategy;
        bool2 = ((ConnectionReuseStrategy)localObject2).keepAlive((HttpResponse)localObject3, paramHttpContext);
        if (bool2)
        {
          localObject2 = this.log;
          localObject4 = "Connection kept alive";
          ((Log)localObject2).debug(localObject4);
          localObject2 = ((HttpResponse)localObject3).getEntity();
          EntityUtils.consume((HttpEntity)localObject2);
        }
        else
        {
          localObject2 = this.managedConn;
          ((ManagedClientConnection)localObject2).close();
        }
      }
    }
    Object localObject2 = ((HttpResponse)localObject3).getStatusLine();
    int j = ((StatusLine)localObject2).getStatusCode();
    int m = 299;
    if (j > m)
    {
      localObject2 = ((HttpResponse)localObject3).getEntity();
      if (localObject2 != null)
      {
        localObject1 = new org/apache/http/entity/BufferedHttpEntity;
        ((BufferedHttpEntity)localObject1).<init>((HttpEntity)localObject2);
        ((HttpResponse)localObject3).setEntity((HttpEntity)localObject1);
      }
      this.managedConn.close();
      localObject2 = new org/apache/http/impl/client/TunnelRefusedException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("CONNECT refused by proxy: ");
      localObject4 = ((HttpResponse)localObject3).getStatusLine();
      localObject1 = localObject4;
      ((TunnelRefusedException)localObject2).<init>((String)localObject1, (HttpResponse)localObject3);
      throw ((Throwable)localObject2);
    }
    this.managedConn.markReusable();
    return false;
  }
  
  protected HttpRoute determineRoute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    HttpRoutePlanner localHttpRoutePlanner = this.routePlanner;
    if (paramHttpHost != null) {}
    for (;;)
    {
      return localHttpRoutePlanner.determineRoute(paramHttpHost, paramHttpRequest, paramHttpContext);
      Object localObject = paramHttpRequest.getParams();
      String str = "http.default-host";
      localObject = (HttpHost)((HttpParams)localObject).getParameter(str);
      paramHttpHost = (HttpHost)localObject;
    }
  }
  
  protected void establishRoute(HttpRoute paramHttpRoute, HttpContext paramHttpContext)
  {
    Object localObject1 = new org/apache/http/conn/routing/BasicRouteDirector;
    ((BasicRouteDirector)localObject1).<init>();
    Object localObject2 = this.managedConn.getRoute();
    int i = ((HttpRouteDirector)localObject1).nextStep(paramHttpRoute, (RouteInfo)localObject2);
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown step indicator " + i + " from RouteDirector.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
    case 2: 
      localObject2 = this.managedConn;
      localObject3 = this.params;
      ((ManagedClientConnection)localObject2).open(paramHttpRoute, paramHttpContext, (HttpParams)localObject3);
    case 0: 
    case 3: 
    case 4: 
    case 5: 
      while (i <= 0)
      {
        return;
        boolean bool1 = createTunnelToTarget(paramHttpRoute, paramHttpContext);
        this.log.debug("Tunnel to target created.");
        localObject3 = this.managedConn;
        Object localObject4 = this.params;
        ((ManagedClientConnection)localObject3).tunnelTarget(bool1, (HttpParams)localObject4);
        continue;
        int j = ((HttpRoute)localObject2).getHopCount() + -1;
        boolean bool2 = createTunnelToProxy(paramHttpRoute, j, paramHttpContext);
        this.log.debug("Tunnel to proxy created.");
        localObject4 = this.managedConn;
        localObject2 = paramHttpRoute.getHopTarget(j);
        HttpParams localHttpParams = this.params;
        ((ManagedClientConnection)localObject4).tunnelProxy((HttpHost)localObject2, bool2, localHttpParams);
        continue;
        localObject2 = this.managedConn;
        localObject3 = this.params;
        ((ManagedClientConnection)localObject2).layerProtocol(paramHttpContext, (HttpParams)localObject3);
      }
    }
    localObject1 = new org/apache/http/HttpException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject2 = "Unable to establish route: planned = " + paramHttpRoute + "; current = " + localObject2;
    ((HttpException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    int i = 0;
    Object localObject1 = null;
    int j = -1;
    Object localObject2 = this.targetAuthState;
    Object localObject3 = paramHttpContext;
    paramHttpContext.setAttribute("http.auth.target-scope", localObject2);
    localObject2 = this.proxyAuthState;
    paramHttpContext.setAttribute("http.auth.proxy-scope", localObject2);
    localObject2 = wrapRequest(paramHttpRequest);
    Object localObject4 = this.params;
    ((RequestWrapper)localObject2).setParams((HttpParams)localObject4);
    Object localObject8 = determineRoute(paramHttpHost, (HttpRequest)localObject2, paramHttpContext);
    localObject4 = ((RequestWrapper)localObject2).getParams();
    Object localObject9 = "http.virtual-host";
    localObject4 = (HttpHost)((HttpParams)localObject4).getParameter((String)localObject9);
    this.virtualHost = ((HttpHost)localObject4);
    localObject4 = this.virtualHost;
    Object localObject11;
    if (localObject4 != null)
    {
      localObject4 = this.virtualHost;
      k = ((HttpHost)localObject4).getPort();
      if (k == j)
      {
        if (paramHttpHost == null) {
          break label714;
        }
        localObject4 = paramHttpHost;
        k = ((HttpHost)localObject4).getPort();
        if (k != j)
        {
          localObject9 = new org/apache/http/HttpHost;
          localObject10 = this.virtualHost.getHostName();
          localObject11 = this.virtualHost.getSchemeName();
          ((HttpHost)localObject9).<init>((String)localObject10, k, (String)localObject11);
          this.virtualHost = ((HttpHost)localObject9);
        }
      }
    }
    localObject9 = new org/apache/http/impl/client/RoutedRequest;
    ((RoutedRequest)localObject9).<init>((RequestWrapper)localObject2, (HttpRoute)localObject8);
    int k = 0;
    localObject4 = null;
    j = 0;
    Object localObject10 = null;
    label226:
    if (i == 0) {}
    for (;;)
    {
      try
      {
        localObject8 = ((RoutedRequest)localObject9).getRequest();
        localObject11 = ((RoutedRequest)localObject9).getRoute();
        localObject4 = "http.user-token";
        localObject3 = paramHttpContext;
        localObject2 = paramHttpContext.getAttribute((String)localObject4);
        localObject4 = this.managedConn;
        if (localObject4 == null)
        {
          localObject4 = this.connManager;
          localObject12 = ((ClientConnectionManager)localObject4).requestConnection((HttpRoute)localObject11, localObject2);
          bool2 = paramHttpRequest instanceof AbortableHttpRequest;
          if (bool2)
          {
            localObject3 = paramHttpRequest;
            localObject3 = (AbortableHttpRequest)paramHttpRequest;
            localObject4 = localObject3;
            ((AbortableHttpRequest)localObject3).setConnectionRequest((ClientConnectionRequest)localObject12);
          }
          localObject4 = this.params;
          l1 = HttpClientParams.getConnectionManagerTimeout((HttpParams)localObject4);
        }
        try
        {
          localObject4 = TimeUnit.MILLISECONDS;
          localObject4 = ((ClientConnectionRequest)localObject12).getConnection(l1, (TimeUnit)localObject4);
          this.managedConn = ((ManagedClientConnection)localObject4);
          localObject4 = this.params;
          bool2 = HttpConnectionParams.isStaleCheckingEnabled((HttpParams)localObject4);
          if (bool2)
          {
            localObject4 = this.managedConn;
            bool2 = ((ManagedClientConnection)localObject4).isOpen();
            if (bool2)
            {
              localObject4 = this.log;
              localObject12 = "Stale connection check";
              ((Log)localObject4).debug(localObject12);
              localObject4 = this.managedConn;
              bool2 = ((ManagedClientConnection)localObject4).isStale();
              if (bool2)
              {
                localObject4 = this.log;
                localObject12 = "Stale connection detected";
                ((Log)localObject4).debug(localObject12);
                localObject4 = this.managedConn;
                ((ManagedClientConnection)localObject4).close();
              }
            }
          }
          bool2 = paramHttpRequest instanceof AbortableHttpRequest;
          if (bool2)
          {
            localObject3 = paramHttpRequest;
            localObject3 = (AbortableHttpRequest)paramHttpRequest;
            localObject4 = localObject3;
            localObject12 = this.managedConn;
            ((AbortableHttpRequest)localObject3).setReleaseTrigger((ConnectionReleaseTrigger)localObject12);
          }
          localObject3 = paramHttpContext;
        }
        catch (InterruptedException localInterruptedException)
        {
          label714:
          Object localObject5 = Thread.currentThread();
          ((Thread)localObject5).interrupt();
          localObject5 = new java/io/InterruptedIOException;
          ((InterruptedIOException)localObject5).<init>();
          throw ((Throwable)localObject5);
        }
        try
        {
          tryConnect((RoutedRequest)localObject9, paramHttpContext);
          localObject4 = ((RequestWrapper)localObject8).getURI();
          localObject4 = ((URI)localObject4).getUserInfo();
          if (localObject4 != null)
          {
            localObject12 = this.targetAuthState;
            localObject13 = new org/apache/http/impl/auth/BasicScheme;
            ((BasicScheme)localObject13).<init>();
            localObject14 = new org/apache/http/auth/UsernamePasswordCredentials;
            ((UsernamePasswordCredentials)localObject14).<init>((String)localObject4);
            ((AuthState)localObject12).update((AuthScheme)localObject13, (Credentials)localObject14);
          }
          localObject4 = this.virtualHost;
          if (localObject4 == null) {
            continue;
          }
          paramHttpHost = this.virtualHost;
          if (paramHttpHost == null) {
            paramHttpHost = ((HttpRoute)localObject11).getTargetHost();
          }
          ((RequestWrapper)localObject8).resetHeaders();
          rewriteRequestURI((RequestWrapper)localObject8, (HttpRoute)localObject11);
          localObject4 = "http.target_host";
          localObject3 = paramHttpContext;
          paramHttpContext.setAttribute((String)localObject4, paramHttpHost);
          localObject4 = "http.route";
          paramHttpContext.setAttribute((String)localObject4, localObject11);
          localObject4 = "http.connection";
          localObject11 = this.managedConn;
          paramHttpContext.setAttribute((String)localObject4, localObject11);
          localObject4 = this.requestExec;
          localObject11 = this.httpProcessor;
          ((HttpRequestExecutor)localObject4).preProcess((HttpRequest)localObject8, (HttpProcessor)localObject11, paramHttpContext);
          localObject8 = tryExecute((RoutedRequest)localObject9, paramHttpContext);
          if (localObject8 != null) {
            continue;
          }
          localObject4 = localObject8;
        }
        catch (TunnelRefusedException localTunnelRefusedException)
        {
          localObject2 = this.log;
          bool3 = ((Log)localObject2).isDebugEnabled();
          if (!bool3) {
            continue;
          }
          localObject2 = this.log;
          localObject1 = localTunnelRefusedException.getMessage();
          ((Log)localObject2).debug(localObject1);
          localObject6 = localTunnelRefusedException.getResponse();
        }
        localObject4 = ((HttpRoute)localObject8).getTargetHost();
      }
      catch (ConnectionShutdownException localConnectionShutdownException)
      {
        boolean bool2;
        long l1;
        Object localObject13;
        Object localObject14;
        localObject2 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject2).<init>("Connection has been shut down");
        ((InterruptedIOException)localObject2).initCause(localConnectionShutdownException);
        throw ((Throwable)localObject2);
        boolean bool3;
        if (localObject6 != null)
        {
          localObject2 = ((HttpResponse)localObject6).getEntity();
          if (localObject2 != null)
          {
            localObject2 = ((HttpResponse)localObject6).getEntity();
            bool3 = ((HttpEntity)localObject2).isStreaming();
            if (bool3) {
              continue;
            }
          }
        }
        if (j != 0)
        {
          localObject2 = this.managedConn;
          ((ManagedClientConnection)localObject2).markReusable();
        }
        releaseConnection();
        return (HttpResponse)localObject6;
        Object localObject6 = ((RequestWrapper)localObject8).getURI();
        boolean bool4 = ((URI)localObject6).isAbsolute();
        if (!bool4) {
          continue;
        }
        paramHttpHost = URIUtils.extractHost((URI)localObject6);
        continue;
        localObject6 = this.params;
        ((HttpResponse)localObject8).setParams((HttpParams)localObject6);
        localObject6 = this.requestExec;
        localObject10 = this.httpProcessor;
        ((HttpRequestExecutor)localObject6).postProcess((HttpResponse)localObject8, (HttpProcessor)localObject10, paramHttpContext);
        localObject6 = this.reuseStrategy;
        bool1 = ((ConnectionReuseStrategy)localObject6).keepAlive((HttpResponse)localObject8, paramHttpContext);
        if (bool1)
        {
          localObject6 = this.keepAliveStrategy;
          long l2 = ((ConnectionKeepAliveStrategy)localObject6).getKeepAliveDuration((HttpResponse)localObject8, paramHttpContext);
          localObject6 = this.log;
          bool2 = ((Log)localObject6).isDebugEnabled();
          if (bool2)
          {
            l1 = 0L;
            bool2 = l2 < l1;
            if (bool2)
            {
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject13 = "for ";
              localObject6 = ((StringBuilder)localObject6).append((String)localObject13);
              localObject6 = ((StringBuilder)localObject6).append(l2);
              localObject13 = " ";
              localObject6 = ((StringBuilder)localObject6).append((String)localObject13);
              localObject13 = TimeUnit.MILLISECONDS;
              localObject6 = ((StringBuilder)localObject6).append(localObject13);
              localObject6 = ((StringBuilder)localObject6).toString();
              localObject13 = this.log;
              localObject14 = new java/lang/StringBuilder;
              ((StringBuilder)localObject14).<init>();
              String str = "Connection can be kept alive ";
              localObject14 = ((StringBuilder)localObject14).append(str);
              localObject6 = ((StringBuilder)localObject14).append((String)localObject6);
              localObject6 = ((StringBuilder)localObject6).toString();
              ((Log)localObject13).debug(localObject6);
            }
          }
          else
          {
            localObject6 = this.managedConn;
            localObject13 = TimeUnit.MILLISECONDS;
            ((ManagedClientConnection)localObject6).setIdleDuration(l2, (TimeUnit)localObject13);
          }
        }
        else
        {
          localObject3 = paramHttpContext;
          localObject6 = handleResponse((RoutedRequest)localObject9, (HttpResponse)localObject8, paramHttpContext);
          if (localObject6 != null) {
            continue;
          }
          bool2 = true;
          i = bool2;
          localObject6 = this.managedConn;
          if (localObject6 != null)
          {
            if (localObject2 != null) {
              break label1663;
            }
            localObject6 = this.userTokenHandler;
            localObject3 = paramHttpContext;
            localObject6 = ((UserTokenHandler)localObject6).getUserToken(paramHttpContext);
            localObject2 = "http.user-token";
            paramHttpContext.setAttribute((String)localObject2, localObject6);
            if (localObject6 != null)
            {
              localObject2 = this.managedConn;
              ((ManagedClientConnection)localObject2).setState(localObject6);
            }
          }
          localObject6 = localObject8;
          break label226;
        }
        localObject6 = "indefinitely";
        continue;
        if (bool1)
        {
          localObject11 = ((HttpResponse)localObject8).getEntity();
          EntityUtils.consume((HttpEntity)localObject11);
          localObject11 = this.managedConn;
          ((ManagedClientConnection)localObject11).markReusable();
          localObject11 = ((RoutedRequest)localObject6).getRoute();
          localObject9 = ((RoutedRequest)localObject9).getRoute();
          boolean bool5 = ((HttpRoute)localObject11).equals(localObject9);
          if (!bool5) {
            releaseConnection();
          }
          localObject9 = localObject6;
          continue;
        }
        localObject11 = this.managedConn;
        ((ManagedClientConnection)localObject11).close();
        localObject11 = this.proxyAuthState;
        localObject11 = ((AuthState)localObject11).getState();
        Object localObject12 = AuthProtocolState.CHALLENGED;
        int m = ((AuthProtocolState)localObject11).compareTo((Enum)localObject12);
        if (m > 0)
        {
          localObject11 = this.proxyAuthState;
          localObject11 = ((AuthState)localObject11).getAuthScheme();
          if (localObject11 != null)
          {
            localObject11 = this.proxyAuthState;
            localObject11 = ((AuthState)localObject11).getAuthScheme();
            boolean bool6 = ((AuthScheme)localObject11).isConnectionBased();
            if (bool6)
            {
              localObject11 = this.log;
              localObject12 = "Resetting proxy auth state";
              ((Log)localObject11).debug(localObject12);
              localObject11 = this.proxyAuthState;
              ((AuthState)localObject11).reset();
            }
          }
        }
        localObject11 = this.targetAuthState;
        localObject11 = ((AuthState)localObject11).getState();
        localObject12 = AuthProtocolState.CHALLENGED;
        int n = ((AuthProtocolState)localObject11).compareTo((Enum)localObject12);
        if (n <= 0) {
          continue;
        }
        localObject11 = this.targetAuthState;
        localObject11 = ((AuthState)localObject11).getAuthScheme();
        if (localObject11 == null) {
          continue;
        }
        localObject11 = this.targetAuthState;
        localObject11 = ((AuthState)localObject11).getAuthScheme();
        boolean bool7 = ((AuthScheme)localObject11).isConnectionBased();
        if (!bool7) {
          continue;
        }
        localObject11 = this.log;
        localObject12 = "Resetting target auth state";
        ((Log)localObject11).debug(localObject12);
        localObject11 = this.targetAuthState;
        ((AuthState)localObject11).reset();
        continue;
      }
      catch (HttpException localHttpException)
      {
        boolean bool1;
        abortConnection();
        throw localHttpException;
        localObject2 = localHttpException.getEntity();
        localObject1 = new org/apache/http/conn/BasicManagedEntity;
        localObject9 = this.managedConn;
        ((BasicManagedEntity)localObject1).<init>((HttpEntity)localObject2, (ManagedClientConnection)localObject9, bool1);
        localHttpException.setEntity((HttpEntity)localObject1);
        continue;
      }
      catch (IOException localIOException)
      {
        abortConnection();
        throw localIOException;
      }
      catch (RuntimeException localRuntimeException)
      {
        abortConnection();
        throw localRuntimeException;
      }
      label1663:
      Object localObject7 = localObject2;
    }
  }
  
  protected RoutedRequest handleResponse(RoutedRequest paramRoutedRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    HttpRoute localHttpRoute = paramRoutedRequest.getRoute();
    RequestWrapper localRequestWrapper = paramRoutedRequest.getRequest();
    HttpParams localHttpParams = localRequestWrapper.getParams();
    boolean bool1 = HttpClientParams.isAuthenticating(localHttpParams);
    Object localObject1;
    int j;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      localObject1 = (HttpHost)paramHttpContext.getAttribute("http.target_host");
      if (localObject1 == null) {
        localObject1 = localHttpRoute.getTargetHost();
      }
      j = ((HttpHost)localObject1).getPort();
      if (j >= 0) {
        break label795;
      }
      localObject2 = this.connManager.getSchemeRegistry().getScheme((HttpHost)localObject1);
      localObject3 = new org/apache/http/HttpHost;
      localObject4 = ((HttpHost)localObject1).getHostName();
      int k = ((Scheme)localObject2).getDefaultPort();
      localObject1 = ((HttpHost)localObject1).getSchemeName();
      ((HttpHost)localObject3).<init>((String)localObject4, k, (String)localObject1);
    }
    for (;;)
    {
      localObject1 = this.authenticator;
      localObject4 = this.targetAuthStrategy;
      Object localObject5 = this.targetAuthState;
      localObject2 = paramHttpResponse;
      Object localObject6 = paramHttpContext;
      bool1 = ((HttpAuthenticator)localObject1).isAuthenticationRequested((HttpHost)localObject3, paramHttpResponse, (AuthenticationStrategy)localObject4, (AuthState)localObject5, paramHttpContext);
      localObject4 = localHttpRoute.getProxyHost();
      if (localObject4 == null) {
        localObject4 = localHttpRoute.getTargetHost();
      }
      localObject2 = this.authenticator;
      localObject6 = this.proxyAuthStrategy;
      Object localObject7 = this.proxyAuthState;
      localObject5 = paramHttpResponse;
      Object localObject8 = paramHttpContext;
      boolean bool3 = ((HttpAuthenticator)localObject2).isAuthenticationRequested((HttpHost)localObject4, paramHttpResponse, (AuthenticationStrategy)localObject6, (AuthState)localObject7, paramHttpContext);
      if (bool1)
      {
        localObject5 = this.authenticator;
        localObject8 = this.targetAuthStrategy;
        AuthState localAuthState = this.targetAuthState;
        localObject6 = localObject3;
        localObject7 = paramHttpResponse;
        bool1 = ((HttpAuthenticator)localObject5).authenticate((HttpHost)localObject3, paramHttpResponse, (AuthenticationStrategy)localObject8, localAuthState, paramHttpContext);
        if (!bool1) {}
      }
      for (;;)
      {
        return paramRoutedRequest;
        if (bool3)
        {
          localObject2 = this.authenticator;
          localObject6 = this.proxyAuthStrategy;
          localObject7 = this.proxyAuthState;
          localObject5 = paramHttpResponse;
          localObject8 = paramHttpContext;
          bool1 = ((HttpAuthenticator)localObject2).authenticate((HttpHost)localObject4, paramHttpResponse, (AuthenticationStrategy)localObject6, (AuthState)localObject7, paramHttpContext);
          if (bool1) {}
        }
        else
        {
          bool1 = HttpClientParams.isRedirecting(localHttpParams);
          if (bool1)
          {
            localObject1 = this.redirectStrategy;
            bool1 = ((RedirectStrategy)localObject1).isRedirected(localRequestWrapper, paramHttpResponse, paramHttpContext);
            if (bool1)
            {
              int i = this.redirectCount;
              j = this.maxRedirects;
              if (i >= j)
              {
                localObject1 = new org/apache/http/client/RedirectException;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject3 = ((StringBuilder)localObject3).append("Maximum redirects (");
                int m = this.maxRedirects;
                localObject3 = m + ") exceeded";
                ((RedirectException)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
              }
              i = this.redirectCount + 1;
              this.redirectCount = i;
              i = 0;
              this.virtualHost = null;
              localObject1 = this.redirectStrategy.getRedirect(localRequestWrapper, paramHttpResponse, paramHttpContext);
              localObject3 = localRequestWrapper.getOriginal().getAllHeaders();
              ((HttpUriRequest)localObject1).setHeaders((Header[])localObject3);
              localObject3 = ((HttpUriRequest)localObject1).getURI();
              localObject2 = URIUtils.extractHost((URI)localObject3);
              if (localObject2 == null)
              {
                localObject1 = new org/apache/http/ProtocolException;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject3 = "Redirect URI does not specify a valid host name: " + localObject3;
                ((ProtocolException)localObject1).<init>((String)localObject3);
                throw ((Throwable)localObject1);
              }
              localObject4 = localHttpRoute.getTargetHost();
              boolean bool4 = ((HttpHost)localObject4).equals(localObject2);
              if (!bool4)
              {
                localObject4 = this.log;
                localObject5 = "Resetting target auth state";
                ((Log)localObject4).debug(localObject5);
                this.targetAuthState.reset();
                localObject4 = this.proxyAuthState.getAuthScheme();
                if (localObject4 != null)
                {
                  bool4 = ((AuthScheme)localObject4).isConnectionBased();
                  if (bool4)
                  {
                    localObject4 = this.log;
                    localObject5 = "Resetting proxy auth state";
                    ((Log)localObject4).debug(localObject5);
                    localObject4 = this.proxyAuthState;
                    ((AuthState)localObject4).reset();
                  }
                }
              }
              localObject1 = wrapRequest((HttpRequest)localObject1);
              ((RequestWrapper)localObject1).setParams(localHttpParams);
              localObject2 = determineRoute((HttpHost)localObject2, (HttpRequest)localObject1, paramHttpContext);
              paramRoutedRequest = new org/apache/http/impl/client/RoutedRequest;
              paramRoutedRequest.<init>((RequestWrapper)localObject1, (HttpRoute)localObject2);
              localObject1 = this.log;
              boolean bool2 = ((Log)localObject1).isDebugEnabled();
              if (!bool2) {
                continue;
              }
              localObject1 = this.log;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject5 = "Redirecting to '";
              localObject3 = ((StringBuilder)localObject4).append((String)localObject5).append(localObject3);
              localObject4 = "' via ";
              localObject3 = (String)localObject4 + localObject2;
              ((Log)localObject1).debug(localObject3);
              continue;
            }
          }
          paramRoutedRequest = null;
        }
      }
      label795:
      localObject3 = localObject1;
    }
  }
  
  protected void releaseConnection()
  {
    try
    {
      ManagedClientConnection localManagedClientConnection = this.managedConn;
      localManagedClientConnection.releaseConnection();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log localLog = this.log;
        String str = "IOException releasing connection";
        localLog.debug(str, localIOException);
      }
    }
    this.managedConn = null;
  }
  
  /* Error */
  protected void rewriteRequestURI(RequestWrapper paramRequestWrapper, HttpRoute paramHttpRoute)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 668	org/apache/http/impl/client/RequestWrapper:getURI	()Ljava/net/URI;
    //   4: astore_3
    //   5: aload_2
    //   6: invokevirtual 436	org/apache/http/conn/routing/HttpRoute:getProxyHost	()Lorg/apache/http/HttpHost;
    //   9: astore 4
    //   11: aload 4
    //   13: ifnull +57 -> 70
    //   16: aload_2
    //   17: invokevirtual 314	org/apache/http/conn/routing/HttpRoute:isTunnelled	()Z
    //   20: istore 5
    //   22: iload 5
    //   24: ifne +46 -> 70
    //   27: aload_3
    //   28: invokevirtual 726	java/net/URI:isAbsolute	()Z
    //   31: istore 5
    //   33: iload 5
    //   35: ifne +27 -> 62
    //   38: aload_2
    //   39: invokevirtual 347	org/apache/http/conn/routing/HttpRoute:getTargetHost	()Lorg/apache/http/HttpHost;
    //   42: astore 4
    //   44: iconst_1
    //   45: istore 6
    //   47: aload_3
    //   48: aload 4
    //   50: iload 6
    //   52: invokestatic 867	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   55: astore_3
    //   56: aload_1
    //   57: aload_3
    //   58: invokevirtual 871	org/apache/http/impl/client/RequestWrapper:setURI	(Ljava/net/URI;)V
    //   61: return
    //   62: aload_3
    //   63: invokestatic 874	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;)Ljava/net/URI;
    //   66: astore_3
    //   67: goto -11 -> 56
    //   70: aload_3
    //   71: invokevirtual 726	java/net/URI:isAbsolute	()Z
    //   74: istore 5
    //   76: iload 5
    //   78: ifeq +23 -> 101
    //   81: iconst_0
    //   82: istore 5
    //   84: aconst_null
    //   85: astore 4
    //   87: iconst_1
    //   88: istore 6
    //   90: aload_3
    //   91: aconst_null
    //   92: iload 6
    //   94: invokestatic 867	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   97: astore_3
    //   98: goto -42 -> 56
    //   101: aload_3
    //   102: invokestatic 874	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;)Ljava/net/URI;
    //   105: astore_3
    //   106: goto -50 -> 56
    //   109: astore_3
    //   110: new 853	org/apache/http/ProtocolException
    //   113: astore 4
    //   115: new 253	java/lang/StringBuilder
    //   118: astore 7
    //   120: aload 7
    //   122: invokespecial 254	java/lang/StringBuilder:<init>	()V
    //   125: aload 7
    //   127: ldc_w 876
    //   130: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: astore 7
    //   135: aload_1
    //   136: invokevirtual 880	org/apache/http/impl/client/RequestWrapper:getRequestLine	()Lorg/apache/http/RequestLine;
    //   139: invokeinterface 885 1 0
    //   144: astore 8
    //   146: aload 7
    //   148: aload 8
    //   150: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: astore 7
    //   158: aload 4
    //   160: aload 7
    //   162: aload_3
    //   163: invokespecial 886	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload 4
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	DefaultRequestDirector
    //   0	169	1	paramRequestWrapper	RequestWrapper
    //   0	169	2	paramHttpRoute	HttpRoute
    //   4	102	3	localURI	URI
    //   109	54	3	localURISyntaxException	java.net.URISyntaxException
    //   9	158	4	localObject1	Object
    //   20	63	5	bool1	boolean
    //   45	48	6	bool2	boolean
    //   118	43	7	localObject2	Object
    //   144	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	109	java/net/URISyntaxException
    //   5	9	109	java/net/URISyntaxException
    //   16	20	109	java/net/URISyntaxException
    //   27	31	109	java/net/URISyntaxException
    //   38	42	109	java/net/URISyntaxException
    //   50	55	109	java/net/URISyntaxException
    //   57	61	109	java/net/URISyntaxException
    //   62	66	109	java/net/URISyntaxException
    //   70	74	109	java/net/URISyntaxException
    //   92	97	109	java/net/URISyntaxException
    //   101	105	109	java/net/URISyntaxException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultRequestDirector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */