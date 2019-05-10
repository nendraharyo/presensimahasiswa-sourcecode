package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class ResponseAuthCache
  implements HttpResponseInterceptor
{
  private final Log log;
  
  public ResponseAuthCache()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  private void cache(AuthCache paramAuthCache, HttpHost paramHttpHost, AuthScheme paramAuthScheme)
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Caching '");
      String str = paramAuthScheme.getSchemeName();
      localObject = ((StringBuilder)localObject).append(str);
      str = "' auth scheme for ";
      localObject = str + paramHttpHost;
      localLog.debug(localObject);
    }
    paramAuthCache.put(paramHttpHost, paramAuthScheme);
  }
  
  private boolean isCachable(AuthState paramAuthState)
  {
    boolean bool1 = false;
    Object localObject = paramAuthState.getAuthScheme();
    boolean bool2;
    if (localObject != null)
    {
      bool2 = ((AuthScheme)localObject).isComplete();
      if (bool2) {
        break label26;
      }
    }
    for (;;)
    {
      return bool1;
      label26:
      localObject = ((AuthScheme)localObject).getSchemeName();
      String str = "Basic";
      bool2 = ((String)localObject).equalsIgnoreCase(str);
      if (!bool2)
      {
        str = "Digest";
        boolean bool3 = ((String)localObject).equalsIgnoreCase(str);
        if (!bool3) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  private void uncache(AuthCache paramAuthCache, HttpHost paramHttpHost, AuthScheme paramAuthScheme)
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Removing from cache '");
      String str = paramAuthScheme.getSchemeName();
      localObject = ((StringBuilder)localObject).append(str);
      str = "' auth scheme for ";
      localObject = str + paramHttpHost;
      localLog.debug(localObject);
    }
    paramAuthCache.remove(paramHttpHost);
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP request");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = (AuthCache)paramHttpContext.getAttribute("http.auth.auth-cache");
    Object localObject2 = (HttpHost)paramHttpContext.getAttribute("http.target_host");
    Object localObject3 = (AuthState)paramHttpContext.getAttribute("http.auth.target-scope");
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int k;
    if ((localObject2 != null) && (localObject3 != null))
    {
      localObject4 = this.log;
      boolean bool1 = ((Log)localObject4).isDebugEnabled();
      if (bool1)
      {
        localObject4 = this.log;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Target auth state: ");
        localObject6 = ((AuthState)localObject3).getState();
        localObject5 = localObject6;
        ((Log)localObject4).debug(localObject5);
      }
      bool1 = isCachable((AuthState)localObject3);
      if (bool1)
      {
        localObject4 = (SchemeRegistry)paramHttpContext.getAttribute("http.scheme-registry");
        k = ((HttpHost)localObject2).getPort();
        if (k < 0)
        {
          localObject5 = ((SchemeRegistry)localObject4).getScheme((HttpHost)localObject2);
          localObject4 = new org/apache/http/HttpHost;
          localObject6 = ((HttpHost)localObject2).getHostName();
          int m = ((HttpHost)localObject2).getPort();
          k = ((Scheme)localObject5).resolvePort(m);
          localObject2 = ((HttpHost)localObject2).getSchemeName();
          ((HttpHost)localObject4).<init>((String)localObject6, k, (String)localObject2);
          localObject2 = localObject4;
        }
        if (localObject1 == null)
        {
          localObject1 = new org/apache/http/impl/client/BasicAuthCache;
          ((BasicAuthCache)localObject1).<init>();
          localObject4 = "http.auth.auth-cache";
          paramHttpContext.setAttribute((String)localObject4, localObject1);
        }
        localObject4 = ResponseAuthCache.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
        localObject5 = ((AuthState)localObject3).getState();
        k = ((AuthProtocolState)localObject5).ordinal();
        int i = localObject4[k];
        switch (i)
        {
        default: 
          localObject3 = localObject1;
        }
      }
    }
    for (;;)
    {
      label311:
      localObject1 = (HttpHost)paramHttpContext.getAttribute("http.proxy_host");
      localObject2 = (AuthState)paramHttpContext.getAttribute("http.auth.proxy-scope");
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject4 = this.log;
        boolean bool2 = ((Log)localObject4).isDebugEnabled();
        if (bool2)
        {
          localObject4 = this.log;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Proxy auth state: ");
          localObject6 = ((AuthState)localObject2).getState();
          localObject5 = localObject6;
          ((Log)localObject4).debug(localObject5);
        }
        bool2 = isCachable((AuthState)localObject2);
        if (bool2)
        {
          if (localObject3 == null)
          {
            localObject3 = new org/apache/http/impl/client/BasicAuthCache;
            ((BasicAuthCache)localObject3).<init>();
            localObject4 = "http.auth.auth-cache";
            paramHttpContext.setAttribute((String)localObject4, localObject3);
          }
          localObject4 = ResponseAuthCache.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
          localObject5 = ((AuthState)localObject2).getState();
          k = ((AuthProtocolState)localObject5).ordinal();
          int j = localObject4[k];
          switch (j)
          {
          }
        }
      }
      for (;;)
      {
        return;
        localObject3 = ((AuthState)localObject3).getAuthScheme();
        cache((AuthCache)localObject1, (HttpHost)localObject2, (AuthScheme)localObject3);
        localObject3 = localObject1;
        break label311;
        localObject3 = ((AuthState)localObject3).getAuthScheme();
        uncache((AuthCache)localObject1, (HttpHost)localObject2, (AuthScheme)localObject3);
        break;
        localObject2 = ((AuthState)localObject2).getAuthScheme();
        cache((AuthCache)localObject3, (HttpHost)localObject1, (AuthScheme)localObject2);
        continue;
        localObject2 = ((AuthState)localObject2).getAuthScheme();
        uncache((AuthCache)localObject3, (HttpHost)localObject1, (AuthScheme)localObject2);
      }
      localObject3 = localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\ResponseAuthCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */