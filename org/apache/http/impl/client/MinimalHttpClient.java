package org.apache.http.impl.client;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.execchain.MinimalClientExec;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;

class MinimalHttpClient
  extends CloseableHttpClient
{
  private final HttpClientConnectionManager connManager;
  private final HttpParams params;
  private final MinimalClientExec requestExecutor;
  
  public MinimalHttpClient(HttpClientConnectionManager paramHttpClientConnectionManager)
  {
    Object localObject = (HttpClientConnectionManager)Args.notNull(paramHttpClientConnectionManager, "HTTP connection manager");
    this.connManager = ((HttpClientConnectionManager)localObject);
    localObject = new org/apache/http/impl/execchain/MinimalClientExec;
    HttpRequestExecutor localHttpRequestExecutor = new org/apache/http/protocol/HttpRequestExecutor;
    localHttpRequestExecutor.<init>();
    DefaultConnectionReuseStrategy localDefaultConnectionReuseStrategy = DefaultConnectionReuseStrategy.INSTANCE;
    DefaultConnectionKeepAliveStrategy localDefaultConnectionKeepAliveStrategy = DefaultConnectionKeepAliveStrategy.INSTANCE;
    ((MinimalClientExec)localObject).<init>(localHttpRequestExecutor, paramHttpClientConnectionManager, localDefaultConnectionReuseStrategy, localDefaultConnectionKeepAliveStrategy);
    this.requestExecutor = ((MinimalClientExec)localObject);
    localObject = new org/apache/http/params/BasicHttpParams;
    ((BasicHttpParams)localObject).<init>();
    this.params = ((HttpParams)localObject);
  }
  
  public void close()
  {
    this.connManager.shutdown();
  }
  
  protected CloseableHttpResponse doExecute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    ClientProtocolException localClientProtocolException = null;
    Args.notNull(paramHttpHost, "Target host");
    Object localObject1 = "HTTP request";
    Args.notNull(paramHttpRequest, (String)localObject1);
    boolean bool = paramHttpRequest instanceof HttpExecutionAware;
    if (bool)
    {
      localObject1 = paramHttpRequest;
      localObject1 = (HttpExecutionAware)paramHttpRequest;
    }
    for (Object localObject3 = localObject1;; localObject3 = null) {
      for (;;)
      {
        try
        {
          HttpRequestWrapper localHttpRequestWrapper = HttpRequestWrapper.wrap((HttpRequest)paramHttpRequest);
          if (paramHttpContext != null)
          {
            HttpClientContext localHttpClientContext = HttpClientContext.adapt(paramHttpContext);
            HttpRoute localHttpRoute = new org/apache/http/conn/routing/HttpRoute;
            localHttpRoute.<init>(paramHttpHost);
            bool = paramHttpRequest instanceof Configurable;
            if (bool)
            {
              paramHttpRequest = (Configurable)paramHttpRequest;
              localObject1 = paramHttpRequest.getConfig();
              if (localObject1 != null) {
                localHttpClientContext.setRequestConfig((RequestConfig)localObject1);
              }
              localObject1 = this.requestExecutor;
              return ((MinimalClientExec)localObject1).execute(localHttpRoute, localHttpRequestWrapper, localHttpClientContext, (HttpExecutionAware)localObject3);
            }
          }
          else
          {
            paramHttpContext = new org/apache/http/protocol/BasicHttpContext;
            paramHttpContext.<init>();
            continue;
          }
          bool = false;
        }
        catch (HttpException localHttpException)
        {
          localClientProtocolException = new org/apache/http/client/ClientProtocolException;
          localClientProtocolException.<init>(localHttpException);
          throw localClientProtocolException;
        }
        Object localObject2 = null;
      }
    }
  }
  
  public ClientConnectionManager getConnectionManager()
  {
    MinimalHttpClient.1 local1 = new org/apache/http/impl/client/MinimalHttpClient$1;
    local1.<init>(this);
    return local1;
  }
  
  public HttpParams getParams()
  {
    return this.params;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\MinimalHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */