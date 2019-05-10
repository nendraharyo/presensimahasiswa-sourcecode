package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestAuthCache
  implements HttpRequestInterceptor
{
  private final Log log;
  
  public RequestAuthCache()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  private void doPreemptiveAuth(HttpHost paramHttpHost, AuthScheme paramAuthScheme, AuthState paramAuthState, CredentialsProvider paramCredentialsProvider)
  {
    Object localObject1 = paramAuthScheme.getSchemeName();
    Object localObject2 = this.log;
    boolean bool = ((Log)localObject2).isDebugEnabled();
    if (bool)
    {
      localObject2 = this.log;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Re-using cached '").append((String)localObject1);
      String str = "' auth scheme for ";
      localObject3 = str + paramHttpHost;
      ((Log)localObject2).debug(localObject3);
    }
    localObject2 = new org/apache/http/auth/AuthScope;
    Object localObject3 = AuthScope.ANY_REALM;
    ((AuthScope)localObject2).<init>(paramHttpHost, (String)localObject3, (String)localObject1);
    localObject1 = paramCredentialsProvider.getCredentials((AuthScope)localObject2);
    if (localObject1 != null)
    {
      localObject2 = "BASIC";
      localObject3 = paramAuthScheme.getSchemeName();
      bool = ((String)localObject2).equalsIgnoreCase((String)localObject3);
      if (bool)
      {
        localObject2 = AuthProtocolState.CHALLENGED;
        paramAuthState.setState((AuthProtocolState)localObject2);
        paramAuthState.update(paramAuthScheme, (Credentials)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject2 = AuthProtocolState.SUCCESS;
      paramAuthState.setState((AuthProtocolState)localObject2);
      break;
      localObject1 = this.log;
      localObject2 = "No credentials for preemptive authentication";
      ((Log)localObject1).debug(localObject2);
    }
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = "HTTP context";
    Args.notNull(paramHttpContext, (String)localObject1);
    Object localObject2 = HttpClientContext.adapt(paramHttpContext);
    AuthCache localAuthCache = ((HttpClientContext)localObject2).getAuthCache();
    Object localObject3;
    if (localAuthCache == null)
    {
      localObject1 = this.log;
      localObject3 = "Auth cache not set in the context";
      ((Log)localObject1).debug(localObject3);
    }
    CredentialsProvider localCredentialsProvider;
    Object localObject4;
    for (;;)
    {
      return;
      localCredentialsProvider = ((HttpClientContext)localObject2).getCredentialsProvider();
      if (localCredentialsProvider == null)
      {
        localObject1 = this.log;
        localObject3 = "Credentials provider not set in the context";
        ((Log)localObject1).debug(localObject3);
      }
      else
      {
        localObject4 = ((HttpClientContext)localObject2).getHttpRoute();
        if (localObject4 == null)
        {
          localObject1 = this.log;
          localObject3 = "Route info not set in the context";
          ((Log)localObject1).debug(localObject3);
        }
        else
        {
          localObject3 = ((HttpClientContext)localObject2).getTargetHost();
          if (localObject3 != null) {
            break;
          }
          localObject1 = this.log;
          localObject3 = "Target host not set in the context";
          ((Log)localObject1).debug(localObject3);
        }
      }
    }
    int i = ((HttpHost)localObject3).getPort();
    Object localObject5;
    Object localObject6;
    if (i < 0)
    {
      localObject1 = new org/apache/http/HttpHost;
      localObject5 = ((HttpHost)localObject3).getHostName();
      localObject6 = ((RouteInfo)localObject4).getTargetHost();
      int j = ((HttpHost)localObject6).getPort();
      localObject3 = ((HttpHost)localObject3).getSchemeName();
      ((HttpHost)localObject1).<init>((String)localObject5, j, (String)localObject3);
    }
    for (;;)
    {
      localObject3 = ((HttpClientContext)localObject2).getTargetAuthState();
      if (localObject3 != null)
      {
        localObject5 = ((AuthState)localObject3).getState();
        localObject6 = AuthProtocolState.UNCHALLENGED;
        if (localObject5 == localObject6)
        {
          localObject5 = localAuthCache.get((HttpHost)localObject1);
          if (localObject5 != null) {
            doPreemptiveAuth((HttpHost)localObject1, (AuthScheme)localObject5, (AuthState)localObject3, localCredentialsProvider);
          }
        }
      }
      localObject1 = ((RouteInfo)localObject4).getProxyHost();
      localObject3 = ((HttpClientContext)localObject2).getProxyAuthState();
      if ((localObject1 == null) || (localObject3 == null)) {
        break;
      }
      localObject2 = ((AuthState)localObject3).getState();
      localObject4 = AuthProtocolState.UNCHALLENGED;
      if (localObject2 != localObject4) {
        break;
      }
      localObject2 = localAuthCache.get((HttpHost)localObject1);
      if (localObject2 == null) {
        break;
      }
      doPreemptiveAuth((HttpHost)localObject1, (AuthScheme)localObject2, (AuthState)localObject3, localCredentialsProvider);
      break;
      localObject1 = localObject3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestAuthCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */