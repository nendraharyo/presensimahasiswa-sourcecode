package org.apache.http.impl.client;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

class AuthenticationStrategyAdaptor
  implements AuthenticationStrategy
{
  private final AuthenticationHandler handler;
  private final Log log;
  
  public AuthenticationStrategyAdaptor(AuthenticationHandler paramAuthenticationHandler)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    this.handler = paramAuthenticationHandler;
  }
  
  private boolean isCachable(AuthScheme paramAuthScheme)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramAuthScheme != null)
    {
      bool2 = paramAuthScheme.isComplete();
      if (bool2) {
        break label19;
      }
    }
    for (;;)
    {
      return bool1;
      label19:
      String str1 = paramAuthScheme.getSchemeName();
      String str2 = "Basic";
      boolean bool3 = str1.equalsIgnoreCase(str2);
      if (!bool3)
      {
        str2 = "Digest";
        bool2 = str1.equalsIgnoreCase(str2);
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public void authFailed(HttpHost paramHttpHost, AuthScheme paramAuthScheme, HttpContext paramHttpContext)
  {
    AuthCache localAuthCache = (AuthCache)paramHttpContext.getAttribute("http.auth.auth-cache");
    if (localAuthCache == null) {}
    for (;;)
    {
      return;
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
      localAuthCache.remove(paramHttpHost);
    }
  }
  
  public void authSucceeded(HttpHost paramHttpHost, AuthScheme paramAuthScheme, HttpContext paramHttpContext)
  {
    Object localObject1 = (AuthCache)paramHttpContext.getAttribute("http.auth.auth-cache");
    boolean bool = isCachable(paramAuthScheme);
    if (bool)
    {
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/client/BasicAuthCache;
        ((BasicAuthCache)localObject1).<init>();
        localObject2 = "http.auth.auth-cache";
        paramHttpContext.setAttribute((String)localObject2, localObject1);
      }
      Object localObject2 = this.log;
      bool = ((Log)localObject2).isDebugEnabled();
      if (bool)
      {
        localObject2 = this.log;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Caching '");
        String str = paramAuthScheme.getSchemeName();
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = "' auth scheme for ";
        localObject3 = str + paramHttpHost;
        ((Log)localObject2).debug(localObject3);
      }
      ((AuthCache)localObject1).put(paramHttpHost, paramAuthScheme);
    }
  }
  
  public Map getChallenges(HttpHost paramHttpHost, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return this.handler.getChallenges(paramHttpResponse, paramHttpContext);
  }
  
  public AuthenticationHandler getHandler()
  {
    return this.handler;
  }
  
  public boolean isAuthenticationRequested(HttpHost paramHttpHost, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return this.handler.isAuthenticationRequested(paramHttpResponse, paramHttpContext);
  }
  
  public Queue select(Map paramMap, HttpHost paramHttpHost, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramMap, "Map of auth challenges");
    Args.notNull(paramHttpHost, "Host");
    Args.notNull(paramHttpResponse, "HTTP response");
    Args.notNull(paramHttpContext, "HTTP context");
    LinkedList localLinkedList1 = new java/util/LinkedList;
    localLinkedList1.<init>();
    Object localObject1 = (CredentialsProvider)paramHttpContext.getAttribute("http.auth.credentials-provider");
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.log;
      localObject2 = "Credentials provider not set in the context";
      ((Log)localObject1).debug(localObject2);
      localObject1 = localLinkedList1;
    }
    for (;;)
    {
      return (Queue)localObject1;
      try
      {
        localObject2 = this.handler;
        localObject3 = ((AuthenticationHandler)localObject2).selectScheme(paramMap, paramHttpResponse, paramHttpContext);
        localObject2 = ((AuthScheme)localObject3).getSchemeName();
        Object localObject4 = Locale.ENGLISH;
        localObject2 = ((String)localObject2).toLowerCase((Locale)localObject4);
        localObject2 = (Header)paramMap.get(localObject2);
        ((AuthScheme)localObject3).processChallenge((Header)localObject2);
        localObject2 = new org/apache/http/auth/AuthScope;
        localObject4 = paramHttpHost.getHostName();
        int i = paramHttpHost.getPort();
        String str1 = ((AuthScheme)localObject3).getRealm();
        String str2 = ((AuthScheme)localObject3).getSchemeName();
        ((AuthScope)localObject2).<init>((String)localObject4, i, str1, str2);
        localObject1 = ((CredentialsProvider)localObject1).getCredentials((AuthScope)localObject2);
        if (localObject1 != null)
        {
          localObject2 = new org/apache/http/auth/AuthOption;
          ((AuthOption)localObject2).<init>((AuthScheme)localObject3, (Credentials)localObject1);
          localLinkedList1.add(localObject2);
        }
        localObject1 = localLinkedList1;
      }
      catch (AuthenticationException localAuthenticationException)
      {
        Object localObject3;
        localObject2 = this.log;
        boolean bool = ((Log)localObject2).isWarnEnabled();
        if (bool)
        {
          localObject2 = this.log;
          localObject3 = localAuthenticationException.getMessage();
          ((Log)localObject2).warn(localObject3, localAuthenticationException);
        }
        LinkedList localLinkedList2 = localLinkedList1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AuthenticationStrategyAdaptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */