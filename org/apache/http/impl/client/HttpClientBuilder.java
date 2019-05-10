package org.apache.http.impl.client;

import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestExpectContinue;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.impl.cookie.IgnoreSpecFactory;
import org.apache.http.impl.cookie.NetscapeDraftSpecFactory;
import org.apache.http.impl.cookie.RFC2109SpecFactory;
import org.apache.http.impl.cookie.RFC2965SpecFactory;
import org.apache.http.impl.execchain.BackoffStrategyExec;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.impl.execchain.ProtocolExec;
import org.apache.http.impl.execchain.RedirectExec;
import org.apache.http.impl.execchain.RetryExec;
import org.apache.http.impl.execchain.ServiceUnavailableRetryExec;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.TextUtils;
import org.apache.http.util.VersionInfo;

public class HttpClientBuilder
{
  static final String DEFAULT_USER_AGENT;
  private boolean authCachingDisabled;
  private Lookup authSchemeRegistry;
  private boolean automaticRetriesDisabled;
  private BackoffManager backoffManager;
  private List closeables;
  private HttpClientConnectionManager connManager;
  private ConnectionBackoffStrategy connectionBackoffStrategy;
  private boolean connectionStateDisabled;
  private boolean contentCompressionDisabled;
  private boolean cookieManagementDisabled;
  private Lookup cookieSpecRegistry;
  private CookieStore cookieStore;
  private CredentialsProvider credentialsProvider;
  private ConnectionConfig defaultConnectionConfig;
  private Collection defaultHeaders;
  private RequestConfig defaultRequestConfig;
  private SocketConfig defaultSocketConfig;
  private X509HostnameVerifier hostnameVerifier;
  private HttpProcessor httpprocessor;
  private ConnectionKeepAliveStrategy keepAliveStrategy;
  private int maxConnPerRoute = 0;
  private int maxConnTotal = 0;
  private HttpHost proxy;
  private AuthenticationStrategy proxyAuthStrategy;
  private boolean redirectHandlingDisabled;
  private RedirectStrategy redirectStrategy;
  private HttpRequestExecutor requestExec;
  private LinkedList requestFirst;
  private LinkedList requestLast;
  private LinkedList responseFirst;
  private LinkedList responseLast;
  private HttpRequestRetryHandler retryHandler;
  private ConnectionReuseStrategy reuseStrategy;
  private HttpRoutePlanner routePlanner;
  private SchemePortResolver schemePortResolver;
  private ServiceUnavailableRetryStrategy serviceUnavailStrategy;
  private LayeredConnectionSocketFactory sslSocketFactory;
  private SSLContext sslcontext;
  private boolean systemProperties;
  private AuthenticationStrategy targetAuthStrategy;
  private String userAgent;
  private UserTokenHandler userTokenHandler;
  
  static
  {
    Object localObject1 = HttpClientBuilder.class.getClassLoader();
    Object localObject2 = VersionInfo.loadVersionInfo("org.apache.http.client", (ClassLoader)localObject1);
    if (localObject2 != null) {}
    for (localObject2 = ((VersionInfo)localObject2).getRelease();; localObject2 = "UNAVAILABLE")
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      DEFAULT_USER_AGENT = "Apache-HttpClient/" + (String)localObject2 + " (java 1.5)";
      return;
    }
  }
  
  public static HttpClientBuilder create()
  {
    HttpClientBuilder localHttpClientBuilder = new org/apache/http/impl/client/HttpClientBuilder;
    localHttpClientBuilder.<init>();
    return localHttpClientBuilder;
  }
  
  private static String[] split(String paramString)
  {
    boolean bool = TextUtils.isBlank(paramString);
    if (bool) {
      bool = false;
    }
    for (String[] arrayOfString = null;; arrayOfString = paramString.split(" *, *")) {
      return arrayOfString;
    }
  }
  
  protected void addCloseable(Closeable paramCloseable)
  {
    if (paramCloseable == null) {}
    for (;;)
    {
      return;
      Object localObject = this.closeables;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.closeables = ((List)localObject);
      }
      localObject = this.closeables;
      ((List)localObject).add(paramCloseable);
    }
  }
  
  public final HttpClientBuilder addInterceptorFirst(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return this;
      LinkedList localLinkedList = this.requestFirst;
      if (localLinkedList == null)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        this.requestFirst = localLinkedList;
      }
      localLinkedList = this.requestFirst;
      localLinkedList.addFirst(paramHttpRequestInterceptor);
    }
  }
  
  public final HttpClientBuilder addInterceptorFirst(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return this;
      LinkedList localLinkedList = this.responseFirst;
      if (localLinkedList == null)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        this.responseFirst = localLinkedList;
      }
      localLinkedList = this.responseFirst;
      localLinkedList.addFirst(paramHttpResponseInterceptor);
    }
  }
  
  public final HttpClientBuilder addInterceptorLast(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return this;
      LinkedList localLinkedList = this.requestLast;
      if (localLinkedList == null)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        this.requestLast = localLinkedList;
      }
      localLinkedList = this.requestLast;
      localLinkedList.addLast(paramHttpRequestInterceptor);
    }
  }
  
  public final HttpClientBuilder addInterceptorLast(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return this;
      LinkedList localLinkedList = this.responseLast;
      if (localLinkedList == null)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        this.responseLast = localLinkedList;
      }
      localLinkedList = this.responseLast;
      localLinkedList.addLast(paramHttpResponseInterceptor);
    }
  }
  
  public CloseableHttpClient build()
  {
    ArrayList localArrayList = null;
    Object localObject1 = this.requestExec;
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/protocol/HttpRequestExecutor;
      ((HttpRequestExecutor)localObject1).<init>();
    }
    Object localObject2 = this.connManager;
    Object localObject3;
    boolean bool1;
    Object localObject4;
    if (localObject2 == null)
    {
      localObject3 = this.sslSocketFactory;
      if (localObject3 == null)
      {
        bool1 = this.systemProperties;
        if (!bool1) {
          break label642;
        }
        localObject3 = split(System.getProperty("https.protocols"));
        localObject2 = localObject3;
        bool1 = this.systemProperties;
        if (!bool1) {
          break label647;
        }
        localObject3 = split(System.getProperty("https.cipherSuites"));
        localObject4 = localObject3;
        label88:
        localObject3 = this.hostnameVerifier;
        if (localObject3 != null) {
          break label1945;
        }
        localObject3 = SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
      }
    }
    label142:
    label413:
    label417:
    label492:
    label642:
    label647:
    label719:
    label727:
    label735:
    label1200:
    label1787:
    label1918:
    label1926:
    label1939:
    label1945:
    for (Object localObject5 = localObject3;; localObject5 = localObject3)
    {
      localObject3 = this.sslcontext;
      Object localObject6;
      boolean bool2;
      Object localObject7;
      Object localObject8;
      if (localObject3 != null)
      {
        localObject3 = new org/apache/http/conn/ssl/SSLConnectionSocketFactory;
        localObject6 = this.sslcontext;
        ((SSLConnectionSocketFactory)localObject3).<init>((SSLContext)localObject6, (String[])localObject2, (String[])localObject4, (X509HostnameVerifier)localObject5);
        localObject2 = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager;
        localObject4 = RegistryBuilder.create();
        localObject6 = PlainConnectionSocketFactory.getSocketFactory();
        localObject4 = ((RegistryBuilder)localObject4).register("http", localObject6);
        localObject5 = "https";
        localObject3 = ((RegistryBuilder)localObject4).register((String)localObject5, localObject3).build();
        ((PoolingHttpClientConnectionManager)localObject2).<init>((Registry)localObject3);
        localObject3 = this.defaultSocketConfig;
        if (localObject3 != null)
        {
          localObject3 = this.defaultSocketConfig;
          ((PoolingHttpClientConnectionManager)localObject2).setDefaultSocketConfig((SocketConfig)localObject3);
        }
        localObject3 = this.defaultConnectionConfig;
        if (localObject3 != null)
        {
          localObject3 = this.defaultConnectionConfig;
          ((PoolingHttpClientConnectionManager)localObject2).setDefaultConnectionConfig((ConnectionConfig)localObject3);
        }
        bool1 = this.systemProperties;
        if (bool1)
        {
          localObject3 = System.getProperty("http.keepAlive", "true");
          localObject4 = "true";
          bool1 = ((String)localObject4).equalsIgnoreCase((String)localObject3);
          if (bool1)
          {
            localObject4 = "5";
            localObject3 = System.getProperty("http.maxConnections", (String)localObject4);
            i = Integer.parseInt((String)localObject3);
            ((PoolingHttpClientConnectionManager)localObject2).setDefaultMaxPerRoute(i);
            i *= 2;
            ((PoolingHttpClientConnectionManager)localObject2).setMaxTotal(i);
          }
        }
        int i = this.maxConnTotal;
        if (i > 0)
        {
          i = this.maxConnTotal;
          ((PoolingHttpClientConnectionManager)localObject2).setMaxTotal(i);
        }
        i = this.maxConnPerRoute;
        if (i > 0)
        {
          i = this.maxConnPerRoute;
          ((PoolingHttpClientConnectionManager)localObject2).setDefaultMaxPerRoute(i);
        }
        localObject4 = this.reuseStrategy;
        if (localObject4 == null)
        {
          bool2 = this.systemProperties;
          if (!bool2) {
            break label727;
          }
          localObject3 = System.getProperty("http.keepAlive", "true");
          localObject4 = "true";
          bool2 = ((String)localObject4).equalsIgnoreCase((String)localObject3);
          if (!bool2) {
            break label719;
          }
          localObject3 = DefaultConnectionReuseStrategy.INSTANCE;
          localObject4 = localObject3;
        }
        localObject5 = this.keepAliveStrategy;
        if (localObject5 == null) {
          localObject5 = DefaultConnectionKeepAliveStrategy.INSTANCE;
        }
        localObject6 = this.targetAuthStrategy;
        if (localObject6 == null) {
          localObject6 = TargetAuthenticationStrategy.INSTANCE;
        }
        localObject7 = this.proxyAuthStrategy;
        if (localObject7 == null) {
          localObject7 = ProxyAuthenticationStrategy.INSTANCE;
        }
        localObject8 = this.userTokenHandler;
        if (localObject8 == null)
        {
          bool2 = this.connectionStateDisabled;
          if (bool2) {
            break label735;
          }
          localObject8 = DefaultUserTokenHandler.INSTANCE;
        }
        localObject3 = new org/apache/http/impl/execchain/MainClientExec;
        ((MainClientExec)localObject3).<init>((HttpRequestExecutor)localObject1, (HttpClientConnectionManager)localObject2, (ConnectionReuseStrategy)localObject4, (ConnectionKeepAliveStrategy)localObject5, (AuthenticationStrategy)localObject6, (AuthenticationStrategy)localObject7, (UserTokenHandler)localObject8);
        localObject4 = decorateMainExec((ClientExecChain)localObject3);
        localObject3 = this.httpprocessor;
        if (localObject3 != null) {
          break label1200;
        }
        localObject3 = this.userAgent;
        if (localObject3 != null) {
          break label1939;
        }
        boolean bool3 = this.systemProperties;
        if (bool3) {
          localObject3 = System.getProperty("http.agent");
        }
        if (localObject3 != null) {
          break label1939;
        }
        localObject3 = DEFAULT_USER_AGENT;
      }
      for (localObject1 = localObject3;; localObject1 = localObject3)
      {
        localObject5 = HttpProcessorBuilder.create();
        localObject3 = this.requestFirst;
        boolean bool5;
        if (localObject3 != null)
        {
          localObject3 = this.requestFirst;
          localObject6 = ((LinkedList)localObject3).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject6).hasNext();
            if (!bool2) {
              break;
            }
            localObject3 = (HttpRequestInterceptor)((Iterator)localObject6).next();
            ((HttpProcessorBuilder)localObject5).addFirst((HttpRequestInterceptor)localObject3);
          }
          localObject2 = null;
          break;
          bool5 = false;
          localObject4 = null;
          break label88;
          bool2 = this.systemProperties;
          if (bool2)
          {
            localObject6 = new org/apache/http/conn/ssl/SSLConnectionSocketFactory;
            localObject3 = (SSLSocketFactory)SSLSocketFactory.getDefault();
            ((SSLConnectionSocketFactory)localObject6).<init>((SSLSocketFactory)localObject3, (String[])localObject2, (String[])localObject4, (X509HostnameVerifier)localObject5);
            localObject3 = localObject6;
            break label142;
          }
          localObject3 = new org/apache/http/conn/ssl/SSLConnectionSocketFactory;
          localObject2 = SSLContexts.createDefault();
          ((SSLConnectionSocketFactory)localObject3).<init>((SSLContext)localObject2, (X509HostnameVerifier)localObject5);
          break label142;
          localObject3 = NoConnectionReuseStrategy.INSTANCE;
          break label413;
          localObject4 = DefaultConnectionReuseStrategy.INSTANCE;
          break label417;
          localObject8 = NoopUserTokenHandler.INSTANCE;
          break label492;
        }
        localObject3 = this.responseFirst;
        if (localObject3 != null)
        {
          localObject3 = this.responseFirst;
          localObject6 = ((LinkedList)localObject3).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject6).hasNext();
            if (!bool2) {
              break;
            }
            localObject3 = (HttpResponseInterceptor)((Iterator)localObject6).next();
            ((HttpProcessorBuilder)localObject5).addFirst((HttpResponseInterceptor)localObject3);
          }
        }
        localObject3 = new HttpRequestInterceptor[6];
        localObject7 = new org/apache/http/client/protocol/RequestDefaultHeaders;
        localObject8 = this.defaultHeaders;
        ((RequestDefaultHeaders)localObject7).<init>((Collection)localObject8);
        localObject3[0] = localObject7;
        localObject7 = new org/apache/http/protocol/RequestContent;
        ((RequestContent)localObject7).<init>();
        localObject3[1] = localObject7;
        localObject7 = new org/apache/http/protocol/RequestTargetHost;
        ((RequestTargetHost)localObject7).<init>();
        localObject3[2] = localObject7;
        localObject7 = new org/apache/http/client/protocol/RequestClientConnControl;
        ((RequestClientConnControl)localObject7).<init>();
        localObject3[3] = localObject7;
        int k = 4;
        localObject7 = new org/apache/http/protocol/RequestUserAgent;
        ((RequestUserAgent)localObject7).<init>((String)localObject1);
        localObject3[k] = localObject7;
        int j = 5;
        localObject6 = new org/apache/http/client/protocol/RequestExpectContinue;
        ((RequestExpectContinue)localObject6).<init>();
        localObject3[j] = localObject6;
        ((HttpProcessorBuilder)localObject5).addAll((HttpRequestInterceptor[])localObject3);
        bool2 = this.cookieManagementDisabled;
        if (!bool2)
        {
          localObject3 = new org/apache/http/client/protocol/RequestAddCookies;
          ((RequestAddCookies)localObject3).<init>();
          ((HttpProcessorBuilder)localObject5).add((HttpRequestInterceptor)localObject3);
        }
        bool2 = this.contentCompressionDisabled;
        if (!bool2)
        {
          localObject3 = new org/apache/http/client/protocol/RequestAcceptEncoding;
          ((RequestAcceptEncoding)localObject3).<init>();
          ((HttpProcessorBuilder)localObject5).add((HttpRequestInterceptor)localObject3);
        }
        bool2 = this.authCachingDisabled;
        if (!bool2)
        {
          localObject3 = new org/apache/http/client/protocol/RequestAuthCache;
          ((RequestAuthCache)localObject3).<init>();
          ((HttpProcessorBuilder)localObject5).add((HttpRequestInterceptor)localObject3);
        }
        bool2 = this.cookieManagementDisabled;
        if (!bool2)
        {
          localObject3 = new org/apache/http/client/protocol/ResponseProcessCookies;
          ((ResponseProcessCookies)localObject3).<init>();
          ((HttpProcessorBuilder)localObject5).add((HttpResponseInterceptor)localObject3);
        }
        bool2 = this.contentCompressionDisabled;
        if (!bool2)
        {
          localObject3 = new org/apache/http/client/protocol/ResponseContentEncoding;
          ((ResponseContentEncoding)localObject3).<init>();
          ((HttpProcessorBuilder)localObject5).add((HttpResponseInterceptor)localObject3);
        }
        localObject3 = this.requestLast;
        if (localObject3 != null)
        {
          localObject3 = this.requestLast;
          localObject1 = ((LinkedList)localObject3).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject1).hasNext();
            if (!bool2) {
              break;
            }
            localObject3 = (HttpRequestInterceptor)((Iterator)localObject1).next();
            ((HttpProcessorBuilder)localObject5).addLast((HttpRequestInterceptor)localObject3);
          }
        }
        localObject3 = this.responseLast;
        if (localObject3 != null)
        {
          localObject3 = this.responseLast;
          localObject1 = ((LinkedList)localObject3).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject1).hasNext();
            if (!bool2) {
              break;
            }
            localObject3 = (HttpResponseInterceptor)((Iterator)localObject1).next();
            ((HttpProcessorBuilder)localObject5).addLast((HttpResponseInterceptor)localObject3);
          }
        }
        localObject3 = ((HttpProcessorBuilder)localObject5).build();
        localObject1 = new org/apache/http/impl/execchain/ProtocolExec;
        ((ProtocolExec)localObject1).<init>((ClientExecChain)localObject4, (HttpProcessor)localObject3);
        localObject4 = decorateProtocolExec((ClientExecChain)localObject1);
        bool2 = this.automaticRetriesDisabled;
        if (!bool2)
        {
          localObject3 = this.retryHandler;
          if (localObject3 == null) {
            localObject3 = DefaultHttpRequestRetryHandler.INSTANCE;
          }
          localObject1 = new org/apache/http/impl/execchain/RetryExec;
          ((RetryExec)localObject1).<init>((ClientExecChain)localObject4, (HttpRequestRetryHandler)localObject3);
        }
        for (localObject3 = localObject1;; localObject3 = localObject4)
        {
          localObject4 = this.routePlanner;
          if (localObject4 == null)
          {
            localObject1 = this.schemePortResolver;
            if (localObject1 == null) {
              localObject1 = DefaultSchemePortResolver.INSTANCE;
            }
            localObject4 = this.proxy;
            if (localObject4 != null)
            {
              localObject4 = new org/apache/http/impl/conn/DefaultProxyRoutePlanner;
              localObject5 = this.proxy;
              ((DefaultProxyRoutePlanner)localObject4).<init>((HttpHost)localObject5, (SchemePortResolver)localObject1);
            }
          }
          else
          {
            boolean bool4 = this.redirectHandlingDisabled;
            if (!bool4)
            {
              localObject1 = this.redirectStrategy;
              if (localObject1 == null) {
                localObject1 = DefaultRedirectStrategy.INSTANCE;
              }
              localObject5 = new org/apache/http/impl/execchain/RedirectExec;
              ((RedirectExec)localObject5).<init>((ClientExecChain)localObject3, (HttpRoutePlanner)localObject4, (RedirectStrategy)localObject1);
              localObject3 = localObject5;
            }
            localObject5 = this.serviceUnavailStrategy;
            if (localObject5 != null)
            {
              localObject1 = new org/apache/http/impl/execchain/ServiceUnavailableRetryExec;
              ((ServiceUnavailableRetryExec)localObject1).<init>((ClientExecChain)localObject3, (ServiceUnavailableRetryStrategy)localObject5);
              localObject3 = localObject1;
            }
            localObject5 = this.backoffManager;
            localObject6 = this.connectionBackoffStrategy;
            if ((localObject5 == null) || (localObject6 == null)) {
              break label1926;
            }
            localObject1 = new org/apache/http/impl/execchain/BackoffStrategyExec;
            ((BackoffStrategyExec)localObject1).<init>((ClientExecChain)localObject3, (ConnectionBackoffStrategy)localObject6, (BackoffManager)localObject5);
          }
          for (;;)
          {
            localObject6 = this.authSchemeRegistry;
            if (localObject6 == null)
            {
              localObject3 = RegistryBuilder.create();
              localObject6 = new org/apache/http/impl/auth/BasicSchemeFactory;
              ((BasicSchemeFactory)localObject6).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("Basic", localObject6);
              localObject6 = new org/apache/http/impl/auth/DigestSchemeFactory;
              ((DigestSchemeFactory)localObject6).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("Digest", localObject6);
              localObject6 = new org/apache/http/impl/auth/NTLMSchemeFactory;
              ((NTLMSchemeFactory)localObject6).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("NTLM", localObject6);
              localObject6 = new org/apache/http/impl/auth/SPNegoSchemeFactory;
              ((SPNegoSchemeFactory)localObject6).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("negotiate", localObject6);
              localObject5 = "Kerberos";
              localObject6 = new org/apache/http/impl/auth/KerberosSchemeFactory;
              ((KerberosSchemeFactory)localObject6).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register((String)localObject5, localObject6);
              localObject6 = ((RegistryBuilder)localObject3).build();
            }
            localObject5 = this.cookieSpecRegistry;
            if (localObject5 == null)
            {
              localObject3 = RegistryBuilder.create();
              localObject7 = new org/apache/http/impl/cookie/BestMatchSpecFactory;
              ((BestMatchSpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("best-match", localObject7);
              localObject7 = new org/apache/http/impl/cookie/RFC2965SpecFactory;
              ((RFC2965SpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("standard", localObject7);
              localObject7 = new org/apache/http/impl/cookie/BrowserCompatSpecFactory;
              ((BrowserCompatSpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("compatibility", localObject7);
              localObject7 = new org/apache/http/impl/cookie/NetscapeDraftSpecFactory;
              ((NetscapeDraftSpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("netscape", localObject7);
              localObject7 = new org/apache/http/impl/cookie/IgnoreSpecFactory;
              ((IgnoreSpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("ignoreCookies", localObject7);
              localObject7 = new org/apache/http/impl/cookie/RFC2109SpecFactory;
              ((RFC2109SpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("rfc2109", localObject7);
              localObject7 = new org/apache/http/impl/cookie/RFC2965SpecFactory;
              ((RFC2965SpecFactory)localObject7).<init>();
              localObject3 = ((RegistryBuilder)localObject3).register("rfc2965", localObject7);
              localObject5 = ((RegistryBuilder)localObject3).build();
            }
            localObject7 = this.cookieStore;
            if (localObject7 == null)
            {
              localObject7 = new org/apache/http/impl/client/BasicCookieStore;
              ((BasicCookieStore)localObject7).<init>();
            }
            localObject8 = this.credentialsProvider;
            if (localObject8 == null)
            {
              bool2 = this.systemProperties;
              if (bool2)
              {
                localObject8 = new org/apache/http/impl/client/SystemDefaultCredentialsProvider;
                ((SystemDefaultCredentialsProvider)localObject8).<init>();
              }
            }
            else
            {
              localObject3 = new org/apache/http/impl/client/InternalHttpClient;
              localRequestConfig = this.defaultRequestConfig;
              if (localRequestConfig == null) {
                break label1918;
              }
            }
            for (RequestConfig localRequestConfig = this.defaultRequestConfig;; localRequestConfig = RequestConfig.DEFAULT)
            {
              List localList = this.closeables;
              if (localList != null)
              {
                localArrayList = new java/util/ArrayList;
                localList = this.closeables;
                localArrayList.<init>(localList);
              }
              ((InternalHttpClient)localObject3).<init>((ClientExecChain)localObject1, (HttpClientConnectionManager)localObject2, (HttpRoutePlanner)localObject4, (Lookup)localObject5, (Lookup)localObject6, (CookieStore)localObject7, (CredentialsProvider)localObject8, localRequestConfig, localArrayList);
              return (CloseableHttpClient)localObject3;
              bool5 = this.systemProperties;
              if (bool5)
              {
                localObject4 = new org/apache/http/impl/conn/SystemDefaultRoutePlanner;
                localObject5 = ProxySelector.getDefault();
                ((SystemDefaultRoutePlanner)localObject4).<init>((SchemePortResolver)localObject1, (ProxySelector)localObject5);
                break;
              }
              localObject4 = new org/apache/http/impl/conn/DefaultRoutePlanner;
              ((DefaultRoutePlanner)localObject4).<init>((SchemePortResolver)localObject1);
              break;
              localObject8 = new org/apache/http/impl/client/BasicCredentialsProvider;
              ((BasicCredentialsProvider)localObject8).<init>();
              break label1787;
            }
            localObject1 = localObject3;
          }
        }
      }
    }
  }
  
  protected ClientExecChain decorateMainExec(ClientExecChain paramClientExecChain)
  {
    return paramClientExecChain;
  }
  
  protected ClientExecChain decorateProtocolExec(ClientExecChain paramClientExecChain)
  {
    return paramClientExecChain;
  }
  
  public final HttpClientBuilder disableAuthCaching()
  {
    this.authCachingDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder disableAutomaticRetries()
  {
    this.automaticRetriesDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder disableConnectionState()
  {
    this.connectionStateDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder disableContentCompression()
  {
    this.contentCompressionDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder disableCookieManagement()
  {
    this.cookieManagementDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder disableRedirectHandling()
  {
    this.redirectHandlingDisabled = true;
    return this;
  }
  
  public final HttpClientBuilder setBackoffManager(BackoffManager paramBackoffManager)
  {
    this.backoffManager = paramBackoffManager;
    return this;
  }
  
  public final HttpClientBuilder setConnectionBackoffStrategy(ConnectionBackoffStrategy paramConnectionBackoffStrategy)
  {
    this.connectionBackoffStrategy = paramConnectionBackoffStrategy;
    return this;
  }
  
  public final HttpClientBuilder setConnectionManager(HttpClientConnectionManager paramHttpClientConnectionManager)
  {
    this.connManager = paramHttpClientConnectionManager;
    return this;
  }
  
  public final HttpClientBuilder setConnectionReuseStrategy(ConnectionReuseStrategy paramConnectionReuseStrategy)
  {
    this.reuseStrategy = paramConnectionReuseStrategy;
    return this;
  }
  
  public final HttpClientBuilder setDefaultAuthSchemeRegistry(Lookup paramLookup)
  {
    this.authSchemeRegistry = paramLookup;
    return this;
  }
  
  public final HttpClientBuilder setDefaultConnectionConfig(ConnectionConfig paramConnectionConfig)
  {
    this.defaultConnectionConfig = paramConnectionConfig;
    return this;
  }
  
  public final HttpClientBuilder setDefaultCookieSpecRegistry(Lookup paramLookup)
  {
    this.cookieSpecRegistry = paramLookup;
    return this;
  }
  
  public final HttpClientBuilder setDefaultCookieStore(CookieStore paramCookieStore)
  {
    this.cookieStore = paramCookieStore;
    return this;
  }
  
  public final HttpClientBuilder setDefaultCredentialsProvider(CredentialsProvider paramCredentialsProvider)
  {
    this.credentialsProvider = paramCredentialsProvider;
    return this;
  }
  
  public final HttpClientBuilder setDefaultHeaders(Collection paramCollection)
  {
    this.defaultHeaders = paramCollection;
    return this;
  }
  
  public final HttpClientBuilder setDefaultRequestConfig(RequestConfig paramRequestConfig)
  {
    this.defaultRequestConfig = paramRequestConfig;
    return this;
  }
  
  public final HttpClientBuilder setDefaultSocketConfig(SocketConfig paramSocketConfig)
  {
    this.defaultSocketConfig = paramSocketConfig;
    return this;
  }
  
  public final HttpClientBuilder setHostnameVerifier(X509HostnameVerifier paramX509HostnameVerifier)
  {
    this.hostnameVerifier = paramX509HostnameVerifier;
    return this;
  }
  
  public final HttpClientBuilder setHttpProcessor(HttpProcessor paramHttpProcessor)
  {
    this.httpprocessor = paramHttpProcessor;
    return this;
  }
  
  public final HttpClientBuilder setKeepAliveStrategy(ConnectionKeepAliveStrategy paramConnectionKeepAliveStrategy)
  {
    this.keepAliveStrategy = paramConnectionKeepAliveStrategy;
    return this;
  }
  
  public final HttpClientBuilder setMaxConnPerRoute(int paramInt)
  {
    this.maxConnPerRoute = paramInt;
    return this;
  }
  
  public final HttpClientBuilder setMaxConnTotal(int paramInt)
  {
    this.maxConnTotal = paramInt;
    return this;
  }
  
  public final HttpClientBuilder setProxy(HttpHost paramHttpHost)
  {
    this.proxy = paramHttpHost;
    return this;
  }
  
  public final HttpClientBuilder setProxyAuthenticationStrategy(AuthenticationStrategy paramAuthenticationStrategy)
  {
    this.proxyAuthStrategy = paramAuthenticationStrategy;
    return this;
  }
  
  public final HttpClientBuilder setRedirectStrategy(RedirectStrategy paramRedirectStrategy)
  {
    this.redirectStrategy = paramRedirectStrategy;
    return this;
  }
  
  public final HttpClientBuilder setRequestExecutor(HttpRequestExecutor paramHttpRequestExecutor)
  {
    this.requestExec = paramHttpRequestExecutor;
    return this;
  }
  
  public final HttpClientBuilder setRetryHandler(HttpRequestRetryHandler paramHttpRequestRetryHandler)
  {
    this.retryHandler = paramHttpRequestRetryHandler;
    return this;
  }
  
  public final HttpClientBuilder setRoutePlanner(HttpRoutePlanner paramHttpRoutePlanner)
  {
    this.routePlanner = paramHttpRoutePlanner;
    return this;
  }
  
  public final HttpClientBuilder setSSLSocketFactory(LayeredConnectionSocketFactory paramLayeredConnectionSocketFactory)
  {
    this.sslSocketFactory = paramLayeredConnectionSocketFactory;
    return this;
  }
  
  public final HttpClientBuilder setSchemePortResolver(SchemePortResolver paramSchemePortResolver)
  {
    this.schemePortResolver = paramSchemePortResolver;
    return this;
  }
  
  public final HttpClientBuilder setServiceUnavailableRetryStrategy(ServiceUnavailableRetryStrategy paramServiceUnavailableRetryStrategy)
  {
    this.serviceUnavailStrategy = paramServiceUnavailableRetryStrategy;
    return this;
  }
  
  public final HttpClientBuilder setSslcontext(SSLContext paramSSLContext)
  {
    this.sslcontext = paramSSLContext;
    return this;
  }
  
  public final HttpClientBuilder setTargetAuthenticationStrategy(AuthenticationStrategy paramAuthenticationStrategy)
  {
    this.targetAuthStrategy = paramAuthenticationStrategy;
    return this;
  }
  
  public final HttpClientBuilder setUserAgent(String paramString)
  {
    this.userAgent = paramString;
    return this;
  }
  
  public final HttpClientBuilder setUserTokenHandler(UserTokenHandler paramUserTokenHandler)
  {
    this.userTokenHandler = paramUserTokenHandler;
    return this;
  }
  
  public final HttpClientBuilder useSystemProperties()
  {
    this.systemProperties = true;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\HttpClientBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */