package org.apache.http.impl.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionManagerFactory;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.BasicClientConnectionManager;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.impl.cookie.IgnoreSpecFactory;
import org.apache.http.impl.cookie.NetscapeDraftSpecFactory;
import org.apache.http.impl.cookie.RFC2109SpecFactory;
import org.apache.http.impl.cookie.RFC2965SpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;

public abstract class AbstractHttpClient
  extends CloseableHttpClient
{
  private BackoffManager backoffManager;
  private ClientConnectionManager connManager;
  private ConnectionBackoffStrategy connectionBackoffStrategy;
  private CookieStore cookieStore;
  private CredentialsProvider credsProvider;
  private HttpParams defaultParams;
  private ConnectionKeepAliveStrategy keepAliveStrategy;
  private final Log log;
  private BasicHttpProcessor mutableProcessor;
  private ImmutableHttpProcessor protocolProcessor;
  private AuthenticationStrategy proxyAuthStrategy;
  private RedirectStrategy redirectStrategy;
  private HttpRequestExecutor requestExec;
  private HttpRequestRetryHandler retryHandler;
  private ConnectionReuseStrategy reuseStrategy;
  private HttpRoutePlanner routePlanner;
  private AuthSchemeRegistry supportedAuthSchemes;
  private CookieSpecRegistry supportedCookieSpecs;
  private AuthenticationStrategy targetAuthStrategy;
  private UserTokenHandler userTokenHandler;
  
  protected AbstractHttpClient(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    this.defaultParams = paramHttpParams;
    this.connManager = paramClientConnectionManager;
  }
  
  private HttpProcessor getProtocolProcessor()
  {
    int i = 0;
    ImmutableHttpProcessor localImmutableHttpProcessor1 = null;
    try
    {
      ImmutableHttpProcessor localImmutableHttpProcessor2 = this.protocolProcessor;
      if (localImmutableHttpProcessor2 == null)
      {
        BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
        int j = localBasicHttpProcessor.getRequestInterceptorCount();
        HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = new HttpRequestInterceptor[j];
        int k = 0;
        localImmutableHttpProcessor2 = null;
        Object localObject2;
        while (k < j)
        {
          localObject2 = localBasicHttpProcessor.getRequestInterceptor(k);
          arrayOfHttpRequestInterceptor[k] = localObject2;
          k += 1;
        }
        k = localBasicHttpProcessor.getResponseInterceptorCount();
        HttpResponseInterceptor[] arrayOfHttpResponseInterceptor = new HttpResponseInterceptor[k];
        while (i < k)
        {
          localObject2 = localBasicHttpProcessor.getResponseInterceptor(i);
          arrayOfHttpResponseInterceptor[i] = localObject2;
          i += 1;
        }
        localImmutableHttpProcessor1 = new org/apache/http/protocol/ImmutableHttpProcessor;
        localImmutableHttpProcessor1.<init>(arrayOfHttpRequestInterceptor, arrayOfHttpResponseInterceptor);
        this.protocolProcessor = localImmutableHttpProcessor1;
      }
      localImmutableHttpProcessor1 = this.protocolProcessor;
      return localImmutableHttpProcessor1;
    }
    finally {}
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.addInterceptor(paramHttpRequestInterceptor);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.addInterceptor(paramHttpRequestInterceptor, paramInt);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.addInterceptor(paramHttpResponseInterceptor);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.addInterceptor(paramHttpResponseInterceptor, paramInt);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void clearRequestInterceptors()
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.clearRequestInterceptors();
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void clearResponseInterceptors()
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.clearResponseInterceptors();
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void close()
  {
    getConnectionManager().shutdown();
  }
  
  protected AuthSchemeRegistry createAuthSchemeRegistry()
  {
    AuthSchemeRegistry localAuthSchemeRegistry = new org/apache/http/auth/AuthSchemeRegistry;
    localAuthSchemeRegistry.<init>();
    Object localObject = new org/apache/http/impl/auth/BasicSchemeFactory;
    ((BasicSchemeFactory)localObject).<init>();
    localAuthSchemeRegistry.register("Basic", (AuthSchemeFactory)localObject);
    localObject = new org/apache/http/impl/auth/DigestSchemeFactory;
    ((DigestSchemeFactory)localObject).<init>();
    localAuthSchemeRegistry.register("Digest", (AuthSchemeFactory)localObject);
    localObject = new org/apache/http/impl/auth/NTLMSchemeFactory;
    ((NTLMSchemeFactory)localObject).<init>();
    localAuthSchemeRegistry.register("NTLM", (AuthSchemeFactory)localObject);
    localObject = new org/apache/http/impl/auth/SPNegoSchemeFactory;
    ((SPNegoSchemeFactory)localObject).<init>();
    localAuthSchemeRegistry.register("negotiate", (AuthSchemeFactory)localObject);
    localObject = new org/apache/http/impl/auth/KerberosSchemeFactory;
    ((KerberosSchemeFactory)localObject).<init>();
    localAuthSchemeRegistry.register("Kerberos", (AuthSchemeFactory)localObject);
    return localAuthSchemeRegistry;
  }
  
  protected ClientConnectionManager createClientConnectionManager()
  {
    Object localObject1 = SchemeRegistryFactory.createDefault();
    HttpParams localHttpParams = getParams();
    Object localObject2 = null;
    Object localObject4 = (String)localHttpParams.getParameter("http.connection-manager.factory-class-name");
    if (localObject4 != null) {}
    for (;;)
    {
      try
      {
        localObject2 = Class.forName((String)localObject4);
        localObject2 = ((Class)localObject2).newInstance();
        Object localObject6 = localObject2;
        localObject6 = (ClientConnectionManagerFactory)localObject2;
        localObject4 = localObject6;
        if (localObject4 != null)
        {
          localObject4 = ((ClientConnectionManagerFactory)localObject4).newInstance(localHttpParams, (SchemeRegistry)localObject1);
          return (ClientConnectionManager)localObject4;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        localObject3 = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = "Invalid class name: " + (String)localObject4;
        ((IllegalStateException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject3 = new java/lang/IllegalAccessError;
        String str = localIllegalAccessException.getMessage();
        ((IllegalAccessError)localObject3).<init>(str);
        throw ((Throwable)localObject3);
      }
      catch (InstantiationException localInstantiationException)
      {
        Object localObject3 = new java/lang/InstantiationError;
        localObject5 = localInstantiationException.getMessage();
        ((InstantiationError)localObject3).<init>((String)localObject5);
        throw ((Throwable)localObject3);
      }
      Object localObject5 = new org/apache/http/impl/conn/BasicClientConnectionManager;
      ((BasicClientConnectionManager)localObject5).<init>((SchemeRegistry)localObject1);
      continue;
      localObject5 = null;
    }
  }
  
  protected RequestDirector createClientRequestDirector(HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectHandler paramRedirectHandler, AuthenticationHandler paramAuthenticationHandler1, AuthenticationHandler paramAuthenticationHandler2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    DefaultRequestDirector localDefaultRequestDirector = new org/apache/http/impl/client/DefaultRequestDirector;
    localDefaultRequestDirector.<init>(paramHttpRequestExecutor, paramClientConnectionManager, paramConnectionReuseStrategy, paramConnectionKeepAliveStrategy, paramHttpRoutePlanner, paramHttpProcessor, paramHttpRequestRetryHandler, paramRedirectHandler, paramAuthenticationHandler1, paramAuthenticationHandler2, paramUserTokenHandler, paramHttpParams);
    return localDefaultRequestDirector;
  }
  
  protected RequestDirector createClientRequestDirector(HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectStrategy paramRedirectStrategy, AuthenticationHandler paramAuthenticationHandler1, AuthenticationHandler paramAuthenticationHandler2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    DefaultRequestDirector localDefaultRequestDirector = new org/apache/http/impl/client/DefaultRequestDirector;
    Log localLog = this.log;
    localDefaultRequestDirector.<init>(localLog, paramHttpRequestExecutor, paramClientConnectionManager, paramConnectionReuseStrategy, paramConnectionKeepAliveStrategy, paramHttpRoutePlanner, paramHttpProcessor, paramHttpRequestRetryHandler, paramRedirectStrategy, paramAuthenticationHandler1, paramAuthenticationHandler2, paramUserTokenHandler, paramHttpParams);
    return localDefaultRequestDirector;
  }
  
  protected RequestDirector createClientRequestDirector(HttpRequestExecutor paramHttpRequestExecutor, ClientConnectionManager paramClientConnectionManager, ConnectionReuseStrategy paramConnectionReuseStrategy, ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy, HttpRoutePlanner paramHttpRoutePlanner, HttpProcessor paramHttpProcessor, HttpRequestRetryHandler paramHttpRequestRetryHandler, RedirectStrategy paramRedirectStrategy, AuthenticationStrategy paramAuthenticationStrategy1, AuthenticationStrategy paramAuthenticationStrategy2, UserTokenHandler paramUserTokenHandler, HttpParams paramHttpParams)
  {
    DefaultRequestDirector localDefaultRequestDirector = new org/apache/http/impl/client/DefaultRequestDirector;
    Log localLog = this.log;
    localDefaultRequestDirector.<init>(localLog, paramHttpRequestExecutor, paramClientConnectionManager, paramConnectionReuseStrategy, paramConnectionKeepAliveStrategy, paramHttpRoutePlanner, paramHttpProcessor, paramHttpRequestRetryHandler, paramRedirectStrategy, paramAuthenticationStrategy1, paramAuthenticationStrategy2, paramUserTokenHandler, paramHttpParams);
    return localDefaultRequestDirector;
  }
  
  protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy()
  {
    DefaultConnectionKeepAliveStrategy localDefaultConnectionKeepAliveStrategy = new org/apache/http/impl/client/DefaultConnectionKeepAliveStrategy;
    localDefaultConnectionKeepAliveStrategy.<init>();
    return localDefaultConnectionKeepAliveStrategy;
  }
  
  protected ConnectionReuseStrategy createConnectionReuseStrategy()
  {
    DefaultConnectionReuseStrategy localDefaultConnectionReuseStrategy = new org/apache/http/impl/DefaultConnectionReuseStrategy;
    localDefaultConnectionReuseStrategy.<init>();
    return localDefaultConnectionReuseStrategy;
  }
  
  protected CookieSpecRegistry createCookieSpecRegistry()
  {
    CookieSpecRegistry localCookieSpecRegistry = new org/apache/http/cookie/CookieSpecRegistry;
    localCookieSpecRegistry.<init>();
    Object localObject = new org/apache/http/impl/cookie/BestMatchSpecFactory;
    ((BestMatchSpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("best-match", (CookieSpecFactory)localObject);
    localObject = new org/apache/http/impl/cookie/BrowserCompatSpecFactory;
    ((BrowserCompatSpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("compatibility", (CookieSpecFactory)localObject);
    localObject = new org/apache/http/impl/cookie/NetscapeDraftSpecFactory;
    ((NetscapeDraftSpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("netscape", (CookieSpecFactory)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2109SpecFactory;
    ((RFC2109SpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("rfc2109", (CookieSpecFactory)localObject);
    localObject = new org/apache/http/impl/cookie/RFC2965SpecFactory;
    ((RFC2965SpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("rfc2965", (CookieSpecFactory)localObject);
    localObject = new org/apache/http/impl/cookie/IgnoreSpecFactory;
    ((IgnoreSpecFactory)localObject).<init>();
    localCookieSpecRegistry.register("ignoreCookies", (CookieSpecFactory)localObject);
    return localCookieSpecRegistry;
  }
  
  protected CookieStore createCookieStore()
  {
    BasicCookieStore localBasicCookieStore = new org/apache/http/impl/client/BasicCookieStore;
    localBasicCookieStore.<init>();
    return localBasicCookieStore;
  }
  
  protected CredentialsProvider createCredentialsProvider()
  {
    BasicCredentialsProvider localBasicCredentialsProvider = new org/apache/http/impl/client/BasicCredentialsProvider;
    localBasicCredentialsProvider.<init>();
    return localBasicCredentialsProvider;
  }
  
  protected HttpContext createHttpContext()
  {
    BasicHttpContext localBasicHttpContext = new org/apache/http/protocol/BasicHttpContext;
    localBasicHttpContext.<init>();
    Object localObject = getConnectionManager().getSchemeRegistry();
    localBasicHttpContext.setAttribute("http.scheme-registry", localObject);
    localObject = getAuthSchemes();
    localBasicHttpContext.setAttribute("http.authscheme-registry", localObject);
    localObject = getCookieSpecs();
    localBasicHttpContext.setAttribute("http.cookiespec-registry", localObject);
    localObject = getCookieStore();
    localBasicHttpContext.setAttribute("http.cookie-store", localObject);
    localObject = getCredentialsProvider();
    localBasicHttpContext.setAttribute("http.auth.credentials-provider", localObject);
    return localBasicHttpContext;
  }
  
  protected abstract HttpParams createHttpParams();
  
  protected abstract BasicHttpProcessor createHttpProcessor();
  
  protected HttpRequestRetryHandler createHttpRequestRetryHandler()
  {
    DefaultHttpRequestRetryHandler localDefaultHttpRequestRetryHandler = new org/apache/http/impl/client/DefaultHttpRequestRetryHandler;
    localDefaultHttpRequestRetryHandler.<init>();
    return localDefaultHttpRequestRetryHandler;
  }
  
  protected HttpRoutePlanner createHttpRoutePlanner()
  {
    DefaultHttpRoutePlanner localDefaultHttpRoutePlanner = new org/apache/http/impl/conn/DefaultHttpRoutePlanner;
    SchemeRegistry localSchemeRegistry = getConnectionManager().getSchemeRegistry();
    localDefaultHttpRoutePlanner.<init>(localSchemeRegistry);
    return localDefaultHttpRoutePlanner;
  }
  
  protected AuthenticationHandler createProxyAuthenticationHandler()
  {
    DefaultProxyAuthenticationHandler localDefaultProxyAuthenticationHandler = new org/apache/http/impl/client/DefaultProxyAuthenticationHandler;
    localDefaultProxyAuthenticationHandler.<init>();
    return localDefaultProxyAuthenticationHandler;
  }
  
  protected AuthenticationStrategy createProxyAuthenticationStrategy()
  {
    ProxyAuthenticationStrategy localProxyAuthenticationStrategy = new org/apache/http/impl/client/ProxyAuthenticationStrategy;
    localProxyAuthenticationStrategy.<init>();
    return localProxyAuthenticationStrategy;
  }
  
  protected RedirectHandler createRedirectHandler()
  {
    DefaultRedirectHandler localDefaultRedirectHandler = new org/apache/http/impl/client/DefaultRedirectHandler;
    localDefaultRedirectHandler.<init>();
    return localDefaultRedirectHandler;
  }
  
  protected HttpRequestExecutor createRequestExecutor()
  {
    HttpRequestExecutor localHttpRequestExecutor = new org/apache/http/protocol/HttpRequestExecutor;
    localHttpRequestExecutor.<init>();
    return localHttpRequestExecutor;
  }
  
  protected AuthenticationHandler createTargetAuthenticationHandler()
  {
    DefaultTargetAuthenticationHandler localDefaultTargetAuthenticationHandler = new org/apache/http/impl/client/DefaultTargetAuthenticationHandler;
    localDefaultTargetAuthenticationHandler.<init>();
    return localDefaultTargetAuthenticationHandler;
  }
  
  protected AuthenticationStrategy createTargetAuthenticationStrategy()
  {
    TargetAuthenticationStrategy localTargetAuthenticationStrategy = new org/apache/http/impl/client/TargetAuthenticationStrategy;
    localTargetAuthenticationStrategy.<init>();
    return localTargetAuthenticationStrategy;
  }
  
  protected UserTokenHandler createUserTokenHandler()
  {
    DefaultUserTokenHandler localDefaultUserTokenHandler = new org/apache/http/impl/client/DefaultUserTokenHandler;
    localDefaultUserTokenHandler.<init>();
    return localDefaultUserTokenHandler;
  }
  
  protected HttpParams determineParams(HttpRequest paramHttpRequest)
  {
    ClientParamsStack localClientParamsStack = new org/apache/http/impl/client/ClientParamsStack;
    HttpParams localHttpParams1 = getParams();
    HttpParams localHttpParams2 = paramHttpRequest.getParams();
    localClientParamsStack.<init>(null, localHttpParams1, localHttpParams2, null);
    return localClientParamsStack;
  }
  
  /* Error */
  protected final org.apache.http.client.methods.CloseableHttpResponse doExecute(org.apache.http.HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    // Byte code:
    //   0: ldc_w 365
    //   3: astore 4
    //   5: aload_2
    //   6: aload 4
    //   8: invokestatic 371	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: invokevirtual 375	org/apache/http/impl/client/AbstractHttpClient:createHttpContext	()Lorg/apache/http/protocol/HttpContext;
    //   18: astore 4
    //   20: aload_3
    //   21: ifnonnull +235 -> 256
    //   24: aload 4
    //   26: astore 5
    //   28: aload_0
    //   29: aload_2
    //   30: invokevirtual 379	org/apache/http/impl/client/AbstractHttpClient:determineParams	(Lorg/apache/http/HttpRequest;)Lorg/apache/http/params/HttpParams;
    //   33: astore 6
    //   35: aload 6
    //   37: invokestatic 385	org/apache/http/client/params/HttpClientParamConfig:getRequestConfig	(Lorg/apache/http/params/HttpParams;)Lorg/apache/http/client/config/RequestConfig;
    //   40: astore 4
    //   42: ldc_w 387
    //   45: astore 7
    //   47: aload 5
    //   49: aload 7
    //   51: aload 4
    //   53: invokeinterface 304 3 0
    //   58: aload_0
    //   59: invokevirtual 391	org/apache/http/impl/client/AbstractHttpClient:getRequestExecutor	()Lorg/apache/http/protocol/HttpRequestExecutor;
    //   62: astore 7
    //   64: aload_0
    //   65: invokevirtual 120	org/apache/http/impl/client/AbstractHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   68: astore 8
    //   70: aload_0
    //   71: invokevirtual 395	org/apache/http/impl/client/AbstractHttpClient:getConnectionReuseStrategy	()Lorg/apache/http/ConnectionReuseStrategy;
    //   74: astore 9
    //   76: aload_0
    //   77: invokevirtual 399	org/apache/http/impl/client/AbstractHttpClient:getConnectionKeepAliveStrategy	()Lorg/apache/http/conn/ConnectionKeepAliveStrategy;
    //   80: astore 10
    //   82: aload_0
    //   83: invokevirtual 403	org/apache/http/impl/client/AbstractHttpClient:getRoutePlanner	()Lorg/apache/http/conn/routing/HttpRoutePlanner;
    //   86: astore 11
    //   88: aload_0
    //   89: invokespecial 407	org/apache/http/impl/client/AbstractHttpClient:getProtocolProcessor	()Lorg/apache/http/protocol/HttpProcessor;
    //   92: astore 12
    //   94: aload_0
    //   95: invokevirtual 411	org/apache/http/impl/client/AbstractHttpClient:getHttpRequestRetryHandler	()Lorg/apache/http/client/HttpRequestRetryHandler;
    //   98: astore 13
    //   100: aload_0
    //   101: invokevirtual 415	org/apache/http/impl/client/AbstractHttpClient:getRedirectStrategy	()Lorg/apache/http/client/RedirectStrategy;
    //   104: astore 14
    //   106: aload_0
    //   107: invokevirtual 419	org/apache/http/impl/client/AbstractHttpClient:getTargetAuthenticationStrategy	()Lorg/apache/http/client/AuthenticationStrategy;
    //   110: astore 15
    //   112: aload_0
    //   113: invokevirtual 422	org/apache/http/impl/client/AbstractHttpClient:getProxyAuthenticationStrategy	()Lorg/apache/http/client/AuthenticationStrategy;
    //   116: astore 16
    //   118: aload_0
    //   119: invokevirtual 426	org/apache/http/impl/client/AbstractHttpClient:getUserTokenHandler	()Lorg/apache/http/client/UserTokenHandler;
    //   122: astore 17
    //   124: aload_0
    //   125: astore 4
    //   127: aload_0
    //   128: aload 7
    //   130: aload 8
    //   132: aload 9
    //   134: aload 10
    //   136: aload 11
    //   138: aload 12
    //   140: aload 13
    //   142: aload 14
    //   144: aload 15
    //   146: aload 16
    //   148: aload 17
    //   150: aload 6
    //   152: invokevirtual 430	org/apache/http/impl/client/AbstractHttpClient:createClientRequestDirector	(Lorg/apache/http/protocol/HttpRequestExecutor;Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/ConnectionReuseStrategy;Lorg/apache/http/conn/ConnectionKeepAliveStrategy;Lorg/apache/http/conn/routing/HttpRoutePlanner;Lorg/apache/http/protocol/HttpProcessor;Lorg/apache/http/client/HttpRequestRetryHandler;Lorg/apache/http/client/RedirectStrategy;Lorg/apache/http/client/AuthenticationStrategy;Lorg/apache/http/client/AuthenticationStrategy;Lorg/apache/http/client/UserTokenHandler;Lorg/apache/http/params/HttpParams;)Lorg/apache/http/client/RequestDirector;
    //   155: astore 7
    //   157: aload_0
    //   158: invokevirtual 403	org/apache/http/impl/client/AbstractHttpClient:getRoutePlanner	()Lorg/apache/http/conn/routing/HttpRoutePlanner;
    //   161: astore 8
    //   163: aload_0
    //   164: invokevirtual 434	org/apache/http/impl/client/AbstractHttpClient:getConnectionBackoffStrategy	()Lorg/apache/http/client/ConnectionBackoffStrategy;
    //   167: astore 9
    //   169: aload_0
    //   170: invokevirtual 438	org/apache/http/impl/client/AbstractHttpClient:getBackoffManager	()Lorg/apache/http/client/BackoffManager;
    //   173: astore 10
    //   175: aload_0
    //   176: monitorexit
    //   177: aload 9
    //   179: ifnull +282 -> 461
    //   182: aload 10
    //   184: ifnull +277 -> 461
    //   187: aload_1
    //   188: ifnull +95 -> 283
    //   191: aload_1
    //   192: astore 4
    //   194: aload 8
    //   196: aload 4
    //   198: aload_2
    //   199: aload 5
    //   201: invokeinterface 444 4 0
    //   206: astore 8
    //   208: aload 7
    //   210: aload_1
    //   211: aload_2
    //   212: aload 5
    //   214: invokeinterface 450 4 0
    //   219: astore 4
    //   221: aload 4
    //   223: invokestatic 456	org/apache/http/impl/client/CloseableHttpResponseProxy:newProxy	(Lorg/apache/http/HttpResponse;)Lorg/apache/http/client/methods/CloseableHttpResponse;
    //   226: astore 4
    //   228: aload 9
    //   230: aload 4
    //   232: invokeinterface 462 2 0
    //   237: istore 18
    //   239: iload 18
    //   241: ifeq +208 -> 449
    //   244: aload 10
    //   246: aload 8
    //   248: invokeinterface 468 2 0
    //   253: aload 4
    //   255: areturn
    //   256: new 470	org/apache/http/protocol/DefaultedHttpContext
    //   259: astore 7
    //   261: aload 7
    //   263: aload_3
    //   264: aload 4
    //   266: invokespecial 473	org/apache/http/protocol/DefaultedHttpContext:<init>	(Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/protocol/HttpContext;)V
    //   269: aload 7
    //   271: astore 5
    //   273: goto -245 -> 28
    //   276: astore 4
    //   278: aload_0
    //   279: monitorexit
    //   280: aload 4
    //   282: athrow
    //   283: aload_0
    //   284: aload_2
    //   285: invokevirtual 379	org/apache/http/impl/client/AbstractHttpClient:determineParams	(Lorg/apache/http/HttpRequest;)Lorg/apache/http/params/HttpParams;
    //   288: astore 4
    //   290: ldc_w 475
    //   293: astore 11
    //   295: aload 4
    //   297: aload 11
    //   299: invokeinterface 175 2 0
    //   304: astore 4
    //   306: aload 4
    //   308: checkcast 477	org/apache/http/HttpHost
    //   311: astore 4
    //   313: goto -119 -> 194
    //   316: astore 4
    //   318: aload 9
    //   320: aload 4
    //   322: invokeinterface 480 2 0
    //   327: istore 18
    //   329: iload 18
    //   331: ifeq +12 -> 343
    //   334: aload 10
    //   336: aload 8
    //   338: invokeinterface 468 2 0
    //   343: aload 4
    //   345: athrow
    //   346: astore 4
    //   348: new 482	org/apache/http/client/ClientProtocolException
    //   351: astore 7
    //   353: aload 7
    //   355: aload 4
    //   357: invokespecial 485	org/apache/http/client/ClientProtocolException:<init>	(Ljava/lang/Throwable;)V
    //   360: aload 7
    //   362: athrow
    //   363: astore 4
    //   365: aload 9
    //   367: aload 4
    //   369: invokeinterface 480 2 0
    //   374: istore 18
    //   376: iload 18
    //   378: ifeq +12 -> 390
    //   381: aload 10
    //   383: aload 8
    //   385: invokeinterface 468 2 0
    //   390: aload 4
    //   392: instanceof 487
    //   395: istore 18
    //   397: iload 18
    //   399: ifeq +13 -> 412
    //   402: aload 4
    //   404: checkcast 487	org/apache/http/HttpException
    //   407: astore 4
    //   409: aload 4
    //   411: athrow
    //   412: aload 4
    //   414: instanceof 489
    //   417: istore 18
    //   419: iload 18
    //   421: ifeq +13 -> 434
    //   424: aload 4
    //   426: checkcast 489	java/io/IOException
    //   429: astore 4
    //   431: aload 4
    //   433: athrow
    //   434: new 491	java/lang/reflect/UndeclaredThrowableException
    //   437: astore 7
    //   439: aload 7
    //   441: aload 4
    //   443: invokespecial 492	java/lang/reflect/UndeclaredThrowableException:<init>	(Ljava/lang/Throwable;)V
    //   446: aload 7
    //   448: athrow
    //   449: aload 10
    //   451: aload 8
    //   453: invokeinterface 495 2 0
    //   458: goto -205 -> 253
    //   461: aload 7
    //   463: aload_1
    //   464: aload_2
    //   465: aload 5
    //   467: invokeinterface 450 4 0
    //   472: astore 4
    //   474: aload 4
    //   476: invokestatic 456	org/apache/http/impl/client/CloseableHttpResponseProxy:newProxy	(Lorg/apache/http/HttpResponse;)Lorg/apache/http/client/methods/CloseableHttpResponse;
    //   479: astore 4
    //   481: goto -228 -> 253
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	484	0	this	AbstractHttpClient
    //   0	484	1	paramHttpHost	org.apache.http.HttpHost
    //   0	484	2	paramHttpRequest	HttpRequest
    //   0	484	3	paramHttpContext	HttpContext
    //   3	262	4	localObject1	Object
    //   276	5	4	localObject2	Object
    //   288	24	4	localObject3	Object
    //   316	28	4	localRuntimeException	RuntimeException
    //   346	10	4	localHttpException	org.apache.http.HttpException
    //   363	40	4	localException	Exception
    //   407	73	4	localObject4	Object
    //   26	440	5	localObject5	Object
    //   33	118	6	localHttpParams	HttpParams
    //   45	417	7	localObject6	Object
    //   68	384	8	localObject7	Object
    //   74	292	9	localObject8	Object
    //   80	370	10	localObject9	Object
    //   86	212	11	localObject10	Object
    //   92	47	12	localHttpProcessor	HttpProcessor
    //   98	43	13	localHttpRequestRetryHandler	HttpRequestRetryHandler
    //   104	39	14	localRedirectStrategy	RedirectStrategy
    //   110	35	15	localAuthenticationStrategy1	AuthenticationStrategy
    //   116	31	16	localAuthenticationStrategy2	AuthenticationStrategy
    //   122	27	17	localUserTokenHandler	UserTokenHandler
    //   237	183	18	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	276	finally
    //   29	33	276	finally
    //   35	40	276	finally
    //   51	58	276	finally
    //   58	62	276	finally
    //   64	68	276	finally
    //   70	74	276	finally
    //   76	80	276	finally
    //   82	86	276	finally
    //   88	92	276	finally
    //   94	98	276	finally
    //   100	104	276	finally
    //   106	110	276	finally
    //   112	116	276	finally
    //   118	122	276	finally
    //   150	155	276	finally
    //   157	161	276	finally
    //   163	167	276	finally
    //   169	173	276	finally
    //   175	177	276	finally
    //   256	259	276	finally
    //   264	269	276	finally
    //   278	280	276	finally
    //   212	219	316	java/lang/RuntimeException
    //   221	226	316	java/lang/RuntimeException
    //   199	206	346	org/apache/http/HttpException
    //   212	219	346	org/apache/http/HttpException
    //   221	226	346	org/apache/http/HttpException
    //   230	237	346	org/apache/http/HttpException
    //   246	253	346	org/apache/http/HttpException
    //   284	288	346	org/apache/http/HttpException
    //   297	304	346	org/apache/http/HttpException
    //   306	311	346	org/apache/http/HttpException
    //   320	327	346	org/apache/http/HttpException
    //   336	343	346	org/apache/http/HttpException
    //   343	346	346	org/apache/http/HttpException
    //   367	374	346	org/apache/http/HttpException
    //   383	390	346	org/apache/http/HttpException
    //   402	407	346	org/apache/http/HttpException
    //   409	412	346	org/apache/http/HttpException
    //   424	429	346	org/apache/http/HttpException
    //   431	434	346	org/apache/http/HttpException
    //   434	437	346	org/apache/http/HttpException
    //   441	446	346	org/apache/http/HttpException
    //   446	449	346	org/apache/http/HttpException
    //   451	458	346	org/apache/http/HttpException
    //   465	472	346	org/apache/http/HttpException
    //   474	479	346	org/apache/http/HttpException
    //   212	219	363	java/lang/Exception
    //   221	226	363	java/lang/Exception
  }
  
  public final AuthSchemeRegistry getAuthSchemes()
  {
    try
    {
      AuthSchemeRegistry localAuthSchemeRegistry = this.supportedAuthSchemes;
      if (localAuthSchemeRegistry == null)
      {
        localAuthSchemeRegistry = createAuthSchemeRegistry();
        this.supportedAuthSchemes = localAuthSchemeRegistry;
      }
      localAuthSchemeRegistry = this.supportedAuthSchemes;
      return localAuthSchemeRegistry;
    }
    finally {}
  }
  
  public final BackoffManager getBackoffManager()
  {
    try
    {
      BackoffManager localBackoffManager = this.backoffManager;
      return localBackoffManager;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ConnectionBackoffStrategy getConnectionBackoffStrategy()
  {
    try
    {
      ConnectionBackoffStrategy localConnectionBackoffStrategy = this.connectionBackoffStrategy;
      return localConnectionBackoffStrategy;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy()
  {
    try
    {
      ConnectionKeepAliveStrategy localConnectionKeepAliveStrategy = this.keepAliveStrategy;
      if (localConnectionKeepAliveStrategy == null)
      {
        localConnectionKeepAliveStrategy = createConnectionKeepAliveStrategy();
        this.keepAliveStrategy = localConnectionKeepAliveStrategy;
      }
      localConnectionKeepAliveStrategy = this.keepAliveStrategy;
      return localConnectionKeepAliveStrategy;
    }
    finally {}
  }
  
  public final ClientConnectionManager getConnectionManager()
  {
    try
    {
      ClientConnectionManager localClientConnectionManager = this.connManager;
      if (localClientConnectionManager == null)
      {
        localClientConnectionManager = createClientConnectionManager();
        this.connManager = localClientConnectionManager;
      }
      localClientConnectionManager = this.connManager;
      return localClientConnectionManager;
    }
    finally {}
  }
  
  public final ConnectionReuseStrategy getConnectionReuseStrategy()
  {
    try
    {
      ConnectionReuseStrategy localConnectionReuseStrategy = this.reuseStrategy;
      if (localConnectionReuseStrategy == null)
      {
        localConnectionReuseStrategy = createConnectionReuseStrategy();
        this.reuseStrategy = localConnectionReuseStrategy;
      }
      localConnectionReuseStrategy = this.reuseStrategy;
      return localConnectionReuseStrategy;
    }
    finally {}
  }
  
  public final CookieSpecRegistry getCookieSpecs()
  {
    try
    {
      CookieSpecRegistry localCookieSpecRegistry = this.supportedCookieSpecs;
      if (localCookieSpecRegistry == null)
      {
        localCookieSpecRegistry = createCookieSpecRegistry();
        this.supportedCookieSpecs = localCookieSpecRegistry;
      }
      localCookieSpecRegistry = this.supportedCookieSpecs;
      return localCookieSpecRegistry;
    }
    finally {}
  }
  
  public final CookieStore getCookieStore()
  {
    try
    {
      CookieStore localCookieStore = this.cookieStore;
      if (localCookieStore == null)
      {
        localCookieStore = createCookieStore();
        this.cookieStore = localCookieStore;
      }
      localCookieStore = this.cookieStore;
      return localCookieStore;
    }
    finally {}
  }
  
  public final CredentialsProvider getCredentialsProvider()
  {
    try
    {
      CredentialsProvider localCredentialsProvider = this.credsProvider;
      if (localCredentialsProvider == null)
      {
        localCredentialsProvider = createCredentialsProvider();
        this.credsProvider = localCredentialsProvider;
      }
      localCredentialsProvider = this.credsProvider;
      return localCredentialsProvider;
    }
    finally {}
  }
  
  protected final BasicHttpProcessor getHttpProcessor()
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = this.mutableProcessor;
      if (localBasicHttpProcessor == null)
      {
        localBasicHttpProcessor = createHttpProcessor();
        this.mutableProcessor = localBasicHttpProcessor;
      }
      localBasicHttpProcessor = this.mutableProcessor;
      return localBasicHttpProcessor;
    }
    finally {}
  }
  
  public final HttpRequestRetryHandler getHttpRequestRetryHandler()
  {
    try
    {
      HttpRequestRetryHandler localHttpRequestRetryHandler = this.retryHandler;
      if (localHttpRequestRetryHandler == null)
      {
        localHttpRequestRetryHandler = createHttpRequestRetryHandler();
        this.retryHandler = localHttpRequestRetryHandler;
      }
      localHttpRequestRetryHandler = this.retryHandler;
      return localHttpRequestRetryHandler;
    }
    finally {}
  }
  
  public final HttpParams getParams()
  {
    try
    {
      HttpParams localHttpParams = this.defaultParams;
      if (localHttpParams == null)
      {
        localHttpParams = createHttpParams();
        this.defaultParams = localHttpParams;
      }
      localHttpParams = this.defaultParams;
      return localHttpParams;
    }
    finally {}
  }
  
  public final AuthenticationHandler getProxyAuthenticationHandler()
  {
    try
    {
      AuthenticationHandler localAuthenticationHandler = createProxyAuthenticationHandler();
      return localAuthenticationHandler;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final AuthenticationStrategy getProxyAuthenticationStrategy()
  {
    try
    {
      AuthenticationStrategy localAuthenticationStrategy = this.proxyAuthStrategy;
      if (localAuthenticationStrategy == null)
      {
        localAuthenticationStrategy = createProxyAuthenticationStrategy();
        this.proxyAuthStrategy = localAuthenticationStrategy;
      }
      localAuthenticationStrategy = this.proxyAuthStrategy;
      return localAuthenticationStrategy;
    }
    finally {}
  }
  
  public final RedirectHandler getRedirectHandler()
  {
    try
    {
      RedirectHandler localRedirectHandler = createRedirectHandler();
      return localRedirectHandler;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final RedirectStrategy getRedirectStrategy()
  {
    try
    {
      Object localObject1 = this.redirectStrategy;
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/client/DefaultRedirectStrategy;
        ((DefaultRedirectStrategy)localObject1).<init>();
        this.redirectStrategy = ((RedirectStrategy)localObject1);
      }
      localObject1 = this.redirectStrategy;
      return (RedirectStrategy)localObject1;
    }
    finally {}
  }
  
  public final HttpRequestExecutor getRequestExecutor()
  {
    try
    {
      HttpRequestExecutor localHttpRequestExecutor = this.requestExec;
      if (localHttpRequestExecutor == null)
      {
        localHttpRequestExecutor = createRequestExecutor();
        this.requestExec = localHttpRequestExecutor;
      }
      localHttpRequestExecutor = this.requestExec;
      return localHttpRequestExecutor;
    }
    finally {}
  }
  
  public HttpRequestInterceptor getRequestInterceptor(int paramInt)
  {
    try
    {
      Object localObject1 = getHttpProcessor();
      localObject1 = ((BasicHttpProcessor)localObject1).getRequestInterceptor(paramInt);
      return (HttpRequestInterceptor)localObject1;
    }
    finally {}
  }
  
  public int getRequestInterceptorCount()
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      int i = localBasicHttpProcessor.getRequestInterceptorCount();
      return i;
    }
    finally {}
  }
  
  public HttpResponseInterceptor getResponseInterceptor(int paramInt)
  {
    try
    {
      Object localObject1 = getHttpProcessor();
      localObject1 = ((BasicHttpProcessor)localObject1).getResponseInterceptor(paramInt);
      return (HttpResponseInterceptor)localObject1;
    }
    finally {}
  }
  
  public int getResponseInterceptorCount()
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      int i = localBasicHttpProcessor.getResponseInterceptorCount();
      return i;
    }
    finally {}
  }
  
  public final HttpRoutePlanner getRoutePlanner()
  {
    try
    {
      HttpRoutePlanner localHttpRoutePlanner = this.routePlanner;
      if (localHttpRoutePlanner == null)
      {
        localHttpRoutePlanner = createHttpRoutePlanner();
        this.routePlanner = localHttpRoutePlanner;
      }
      localHttpRoutePlanner = this.routePlanner;
      return localHttpRoutePlanner;
    }
    finally {}
  }
  
  public final AuthenticationHandler getTargetAuthenticationHandler()
  {
    try
    {
      AuthenticationHandler localAuthenticationHandler = createTargetAuthenticationHandler();
      return localAuthenticationHandler;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final AuthenticationStrategy getTargetAuthenticationStrategy()
  {
    try
    {
      AuthenticationStrategy localAuthenticationStrategy = this.targetAuthStrategy;
      if (localAuthenticationStrategy == null)
      {
        localAuthenticationStrategy = createTargetAuthenticationStrategy();
        this.targetAuthStrategy = localAuthenticationStrategy;
      }
      localAuthenticationStrategy = this.targetAuthStrategy;
      return localAuthenticationStrategy;
    }
    finally {}
  }
  
  public final UserTokenHandler getUserTokenHandler()
  {
    try
    {
      UserTokenHandler localUserTokenHandler = this.userTokenHandler;
      if (localUserTokenHandler == null)
      {
        localUserTokenHandler = createUserTokenHandler();
        this.userTokenHandler = localUserTokenHandler;
      }
      localUserTokenHandler = this.userTokenHandler;
      return localUserTokenHandler;
    }
    finally {}
  }
  
  public void removeRequestInterceptorByClass(Class paramClass)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.removeRequestInterceptorByClass(paramClass);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void removeResponseInterceptorByClass(Class paramClass)
  {
    try
    {
      BasicHttpProcessor localBasicHttpProcessor = getHttpProcessor();
      localBasicHttpProcessor.removeResponseInterceptorByClass(paramClass);
      localBasicHttpProcessor = null;
      this.protocolProcessor = null;
      return;
    }
    finally {}
  }
  
  public void setAuthSchemes(AuthSchemeRegistry paramAuthSchemeRegistry)
  {
    try
    {
      this.supportedAuthSchemes = paramAuthSchemeRegistry;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setBackoffManager(BackoffManager paramBackoffManager)
  {
    try
    {
      this.backoffManager = paramBackoffManager;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setConnectionBackoffStrategy(ConnectionBackoffStrategy paramConnectionBackoffStrategy)
  {
    try
    {
      this.connectionBackoffStrategy = paramConnectionBackoffStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setCookieSpecs(CookieSpecRegistry paramCookieSpecRegistry)
  {
    try
    {
      this.supportedCookieSpecs = paramCookieSpecRegistry;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setCookieStore(CookieStore paramCookieStore)
  {
    try
    {
      this.cookieStore = paramCookieStore;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setCredentialsProvider(CredentialsProvider paramCredentialsProvider)
  {
    try
    {
      this.credsProvider = paramCredentialsProvider;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setHttpRequestRetryHandler(HttpRequestRetryHandler paramHttpRequestRetryHandler)
  {
    try
    {
      this.retryHandler = paramHttpRequestRetryHandler;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setKeepAliveStrategy(ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy)
  {
    try
    {
      this.keepAliveStrategy = paramConnectionKeepAliveStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setParams(HttpParams paramHttpParams)
  {
    try
    {
      this.defaultParams = paramHttpParams;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setProxyAuthenticationHandler(AuthenticationHandler paramAuthenticationHandler)
  {
    try
    {
      AuthenticationStrategyAdaptor localAuthenticationStrategyAdaptor = new org/apache/http/impl/client/AuthenticationStrategyAdaptor;
      localAuthenticationStrategyAdaptor.<init>(paramAuthenticationHandler);
      this.proxyAuthStrategy = localAuthenticationStrategyAdaptor;
      return;
    }
    finally {}
  }
  
  public void setProxyAuthenticationStrategy(AuthenticationStrategy paramAuthenticationStrategy)
  {
    try
    {
      this.proxyAuthStrategy = paramAuthenticationStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setRedirectHandler(RedirectHandler paramRedirectHandler)
  {
    try
    {
      DefaultRedirectStrategyAdaptor localDefaultRedirectStrategyAdaptor = new org/apache/http/impl/client/DefaultRedirectStrategyAdaptor;
      localDefaultRedirectStrategyAdaptor.<init>(paramRedirectHandler);
      this.redirectStrategy = localDefaultRedirectStrategyAdaptor;
      return;
    }
    finally {}
  }
  
  public void setRedirectStrategy(RedirectStrategy paramRedirectStrategy)
  {
    try
    {
      this.redirectStrategy = paramRedirectStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setReuseStrategy(ConnectionReuseStrategy paramConnectionReuseStrategy)
  {
    try
    {
      this.reuseStrategy = paramConnectionReuseStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setRoutePlanner(HttpRoutePlanner paramHttpRoutePlanner)
  {
    try
    {
      this.routePlanner = paramHttpRoutePlanner;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setTargetAuthenticationHandler(AuthenticationHandler paramAuthenticationHandler)
  {
    try
    {
      AuthenticationStrategyAdaptor localAuthenticationStrategyAdaptor = new org/apache/http/impl/client/AuthenticationStrategyAdaptor;
      localAuthenticationStrategyAdaptor.<init>(paramAuthenticationHandler);
      this.targetAuthStrategy = localAuthenticationStrategyAdaptor;
      return;
    }
    finally {}
  }
  
  public void setTargetAuthenticationStrategy(AuthenticationStrategy paramAuthenticationStrategy)
  {
    try
    {
      this.targetAuthStrategy = paramAuthenticationStrategy;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setUserTokenHandler(UserTokenHandler paramUserTokenHandler)
  {
    try
    {
      this.userTokenHandler = paramUserTokenHandler;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AbstractHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */