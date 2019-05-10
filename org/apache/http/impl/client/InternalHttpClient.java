package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthState;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpParamsNames;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

class InternalHttpClient
  extends CloseableHttpClient
{
  private final Lookup authSchemeRegistry;
  private final List closeables;
  private final HttpClientConnectionManager connManager;
  private final Lookup cookieSpecRegistry;
  private final CookieStore cookieStore;
  private final CredentialsProvider credentialsProvider;
  private final RequestConfig defaultConfig;
  private final ClientExecChain execChain;
  private final Log log;
  private final HttpRoutePlanner routePlanner;
  
  public InternalHttpClient(ClientExecChain paramClientExecChain, HttpClientConnectionManager paramHttpClientConnectionManager, HttpRoutePlanner paramHttpRoutePlanner, Lookup paramLookup1, Lookup paramLookup2, CookieStore paramCookieStore, CredentialsProvider paramCredentialsProvider, RequestConfig paramRequestConfig, List paramList)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramClientExecChain, "HTTP client exec chain");
    Args.notNull(paramHttpClientConnectionManager, "HTTP connection manager");
    Args.notNull(paramHttpRoutePlanner, "HTTP route planner");
    this.execChain = paramClientExecChain;
    this.connManager = paramHttpClientConnectionManager;
    this.routePlanner = paramHttpRoutePlanner;
    this.cookieSpecRegistry = paramLookup1;
    this.authSchemeRegistry = paramLookup2;
    this.cookieStore = paramCookieStore;
    this.credentialsProvider = paramCredentialsProvider;
    this.defaultConfig = paramRequestConfig;
    this.closeables = paramList;
  }
  
  private HttpRoute determineRoute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    String str;
    if (paramHttpHost == null)
    {
      localObject = paramHttpRequest.getParams();
      str = "http.default-host";
    }
    for (Object localObject = (HttpHost)((HttpParams)localObject).getParameter(str);; localObject = paramHttpHost) {
      return this.routePlanner.determineRoute((HttpHost)localObject, paramHttpRequest, paramHttpContext);
    }
  }
  
  private void setupContext(HttpClientContext paramHttpClientContext)
  {
    Object localObject1 = paramHttpClientContext.getAttribute("http.auth.target-scope");
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "http.auth.target-scope";
      localObject2 = new org/apache/http/auth/AuthState;
      ((AuthState)localObject2).<init>();
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.auth.proxy-scope");
    if (localObject1 == null)
    {
      localObject1 = "http.auth.proxy-scope";
      localObject2 = new org/apache/http/auth/AuthState;
      ((AuthState)localObject2).<init>();
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.authscheme-registry");
    if (localObject1 == null)
    {
      localObject1 = "http.authscheme-registry";
      localObject2 = this.authSchemeRegistry;
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.cookiespec-registry");
    if (localObject1 == null)
    {
      localObject1 = "http.cookiespec-registry";
      localObject2 = this.cookieSpecRegistry;
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.cookie-store");
    if (localObject1 == null)
    {
      localObject1 = "http.cookie-store";
      localObject2 = this.cookieStore;
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.auth.credentials-provider");
    if (localObject1 == null)
    {
      localObject1 = "http.auth.credentials-provider";
      localObject2 = this.credentialsProvider;
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
    localObject1 = paramHttpClientContext.getAttribute("http.request-config");
    if (localObject1 == null)
    {
      localObject1 = "http.request-config";
      localObject2 = this.defaultConfig;
      paramHttpClientContext.setAttribute((String)localObject1, localObject2);
    }
  }
  
  public void close()
  {
    this.connManager.shutdown();
    Object localObject = this.closeables;
    if (localObject != null)
    {
      localObject = this.closeables;
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Closeable)localIterator.next();
        try
        {
          ((Closeable)localObject).close();
        }
        catch (IOException localIOException)
        {
          Log localLog = this.log;
          String str = localIOException.getMessage();
          localLog.error(str, localIOException);
        }
      }
    }
  }
  
  protected CloseableHttpResponse doExecute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    RequestConfig localRequestConfig1 = null;
    Object localObject1 = "HTTP request";
    Args.notNull(paramHttpRequest, (String)localObject1);
    boolean bool = paramHttpRequest instanceof HttpExecutionAware;
    if (bool)
    {
      localObject1 = paramHttpRequest;
      localObject1 = (HttpExecutionAware)paramHttpRequest;
    }
    for (Object localObject2 = localObject1;; localObject2 = null) {
      for (;;)
      {
        try
        {
          HttpRequestWrapper localHttpRequestWrapper = HttpRequestWrapper.wrap((HttpRequest)paramHttpRequest);
          Object localObject4;
          if (paramHttpContext != null)
          {
            HttpClientContext localHttpClientContext = HttpClientContext.adapt(paramHttpContext);
            bool = paramHttpRequest instanceof Configurable;
            Object localObject3;
            if (bool)
            {
              localObject3 = paramHttpRequest;
              localObject3 = (Configurable)paramHttpRequest;
              localObject1 = localObject3;
              localRequestConfig1 = ((Configurable)localObject3).getConfig();
            }
            if (localRequestConfig1 != null) {
              break label255;
            }
            localObject4 = ((HttpRequest)paramHttpRequest).getParams();
            bool = localObject4 instanceof HttpParamsNames;
            if (bool)
            {
              localObject3 = localObject4;
              localObject3 = (HttpParamsNames)localObject4;
              localObject1 = localObject3;
              localObject1 = ((HttpParamsNames)localObject3).getNames();
              bool = ((Set)localObject1).isEmpty();
              if (bool) {
                break label255;
              }
              localObject1 = HttpClientParamConfig.getRequestConfig((HttpParams)localObject4);
              if (localObject1 != null) {
                localHttpClientContext.setRequestConfig((RequestConfig)localObject1);
              }
              setupContext(localHttpClientContext);
              localObject1 = determineRoute(paramHttpHost, localHttpRequestWrapper, localHttpClientContext);
              localObject4 = this.execChain;
              return ((ClientExecChain)localObject4).execute((HttpRoute)localObject1, localHttpRequestWrapper, localHttpClientContext, (HttpExecutionAware)localObject2);
            }
          }
          else
          {
            paramHttpContext = new org/apache/http/protocol/BasicHttpContext;
            paramHttpContext.<init>();
            continue;
          }
          localRequestConfig2 = HttpClientParamConfig.getRequestConfig((HttpParams)localObject4);
        }
        catch (HttpException localHttpException)
        {
          localObject4 = new org/apache/http/client/ClientProtocolException;
          ((ClientProtocolException)localObject4).<init>(localHttpException);
          throw ((Throwable)localObject4);
        }
        continue;
        label255:
        RequestConfig localRequestConfig2 = localRequestConfig1;
      }
    }
  }
  
  public ClientConnectionManager getConnectionManager()
  {
    InternalHttpClient.1 local1 = new org/apache/http/impl/client/InternalHttpClient$1;
    local1.<init>(this);
    return local1;
  }
  
  public HttpParams getParams()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\InternalHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */