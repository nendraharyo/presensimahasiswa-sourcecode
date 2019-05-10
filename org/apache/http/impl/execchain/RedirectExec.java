package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

public class RedirectExec
  implements ClientExecChain
{
  private final Log log;
  private final RedirectStrategy redirectStrategy;
  private final ClientExecChain requestExecutor;
  private final HttpRoutePlanner routePlanner;
  
  public RedirectExec(ClientExecChain paramClientExecChain, HttpRoutePlanner paramHttpRoutePlanner, RedirectStrategy paramRedirectStrategy)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramClientExecChain, "HTTP client request executor");
    Args.notNull(paramHttpRoutePlanner, "HTTP route planner");
    Args.notNull(paramRedirectStrategy, "HTTP redirect strategy");
    this.requestExecutor = paramClientExecChain;
    this.routePlanner = paramHttpRoutePlanner;
    this.redirectStrategy = paramRedirectStrategy;
  }
  
  public CloseableHttpResponse execute(HttpRoute paramHttpRoute, HttpRequestWrapper paramHttpRequestWrapper, HttpClientContext paramHttpClientContext, HttpExecutionAware paramHttpExecutionAware)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Args.notNull(paramHttpRequestWrapper, "HTTP request");
    Args.notNull(paramHttpClientContext, "HTTP context");
    Object localObject1 = paramHttpClientContext.getRedirectLocations();
    if (localObject1 != null) {
      ((List)localObject1).clear();
    }
    RequestConfig localRequestConfig = paramHttpClientContext.getRequestConfig();
    int i = localRequestConfig.getMaxRedirects();
    int j;
    if (i > 0)
    {
      i = localRequestConfig.getMaxRedirects();
      j = i;
    }
    Object localObject6;
    CloseableHttpResponse localCloseableHttpResponse;
    for (;;)
    {
      i = 0;
      localObject1 = null;
      Object localObject5 = paramHttpRequestWrapper;
      localObject6 = this.requestExecutor;
      localCloseableHttpResponse = ((ClientExecChain)localObject6).execute(paramHttpRoute, (HttpRequestWrapper)localObject5, paramHttpClientContext, paramHttpExecutionAware);
      try
      {
        boolean bool2 = localRequestConfig.isRedirectsEnabled();
        if (bool2)
        {
          localObject6 = this.redirectStrategy;
          bool2 = ((RedirectStrategy)localObject6).isRedirected((HttpRequest)localObject5, localCloseableHttpResponse, paramHttpClientContext);
          if (bool2) {
            if (i >= j)
            {
              localObject1 = new org/apache/http/client/RedirectException;
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              localObject6 = "Maximum redirects (";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject5 = ((StringBuilder)localObject5).append(j);
              localObject7 = ") exceeded";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
              localObject5 = ((StringBuilder)localObject5).toString();
              ((RedirectException)localObject1).<init>((String)localObject5);
              throw ((Throwable)localObject1);
            }
          }
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        localCloseableHttpResponse.close();
        throw localRuntimeException;
        i = 50;
        j = i;
        continue;
        k = i + 1;
        Object localObject2 = this.redirectStrategy;
        localObject2 = ((RedirectStrategy)localObject2).getRedirect((HttpRequest)localObject5, localCloseableHttpResponse, paramHttpClientContext);
        localObject5 = ((HttpRequest)localObject2).headerIterator();
        boolean bool3 = ((HeaderIterator)localObject5).hasNext();
        if (!bool3)
        {
          localObject5 = paramHttpRequestWrapper.getOriginal();
          localObject5 = ((HttpRequest)localObject5).getAllHeaders();
          ((HttpRequest)localObject2).setHeaders((Header[])localObject5);
        }
        localObject5 = HttpRequestWrapper.wrap((HttpRequest)localObject2);
        bool1 = localObject5 instanceof HttpEntityEnclosingRequest;
        if (bool1)
        {
          Object localObject8 = localObject5;
          localObject8 = (HttpEntityEnclosingRequest)localObject5;
          localObject2 = localObject8;
          RequestEntityProxy.enhance((HttpEntityEnclosingRequest)localObject8);
        }
        localObject2 = ((HttpRequestWrapper)localObject5).getURI();
        localObject9 = URIUtils.extractHost((URI)localObject2);
        if (localObject9 == null)
        {
          localObject5 = new org/apache/http/ProtocolException;
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>();
          localObject6 = "Redirect URI does not specify a valid host name: ";
          localObject7 = ((StringBuilder)localObject7).append((String)localObject6);
          localObject2 = ((StringBuilder)localObject7).append(localObject2);
          localObject2 = ((StringBuilder)localObject2).toString();
          ((ProtocolException)localObject5).<init>((String)localObject2);
          throw ((Throwable)localObject5);
        }
      }
      catch (IOException localIOException1)
      {
        int k;
        localCloseableHttpResponse.close();
        throw localIOException1;
        Object localObject10 = paramHttpRoute.getTargetHost();
        boolean bool4 = ((HttpHost)localObject10).equals(localObject9);
        Object localObject11;
        if (!bool4)
        {
          localObject10 = paramHttpClientContext.getTargetAuthState();
          String str;
          if (localObject10 != null)
          {
            localObject11 = this.log;
            str = "Resetting target auth state";
            ((Log)localObject11).debug(str);
            ((AuthState)localObject10).reset();
          }
          localObject10 = paramHttpClientContext.getProxyAuthState();
          if (localObject10 != null)
          {
            localObject11 = ((AuthState)localObject10).getAuthScheme();
            if (localObject11 != null)
            {
              boolean bool5 = ((AuthScheme)localObject11).isConnectionBased();
              if (bool5)
              {
                localObject11 = this.log;
                str = "Resetting proxy auth state";
                ((Log)localObject11).debug(str);
                ((AuthState)localObject10).reset();
              }
            }
          }
        }
        localObject10 = this.routePlanner;
        paramHttpRoute = ((HttpRoutePlanner)localObject10).determineRoute((HttpHost)localObject9, (HttpRequest)localObject5, paramHttpClientContext);
        Object localObject9 = this.log;
        boolean bool6 = ((Log)localObject9).isDebugEnabled();
        if (bool6)
        {
          localObject9 = this.log;
          localObject10 = new java/lang/StringBuilder;
          ((StringBuilder)localObject10).<init>();
          localObject11 = "Redirecting to '";
          localObject10 = ((StringBuilder)localObject10).append((String)localObject11);
          localObject3 = ((StringBuilder)localObject10).append(localIOException1);
          localObject10 = "' via ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject10);
          localObject3 = ((StringBuilder)localObject3).append(paramHttpRoute);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((Log)localObject9).debug(localObject3);
        }
        Object localObject3 = localCloseableHttpResponse.getEntity();
        EntityUtils.consume((HttpEntity)localObject3);
        localCloseableHttpResponse.close();
        boolean bool1 = k;
      }
      catch (HttpException localHttpException)
      {
        try
        {
          localObject5 = localCloseableHttpResponse.getEntity();
          EntityUtils.consume((HttpEntity)localObject5);
        }
        catch (IOException localIOException2)
        {
          for (;;)
          {
            Object localObject7 = this.log;
            localObject6 = "I/O error while releasing connection";
            ((Log)localObject7).debug(localObject6, localIOException2);
            localCloseableHttpResponse.close();
          }
        }
        finally
        {
          localCloseableHttpResponse.close();
        }
        throw localHttpException;
      }
    }
    return localCloseableHttpResponse;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\RedirectExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */