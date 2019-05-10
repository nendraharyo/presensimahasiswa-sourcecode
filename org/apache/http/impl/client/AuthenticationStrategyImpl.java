package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

abstract class AuthenticationStrategyImpl
  implements AuthenticationStrategy
{
  private static final List DEFAULT_SCHEME_PRIORITY;
  private final int challengeCode;
  private final String headerName;
  private final Log log;
  
  static
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "negotiate";
    arrayOfString[1] = "Kerberos";
    arrayOfString[2] = "NTLM";
    arrayOfString[3] = "Digest";
    arrayOfString[4] = "Basic";
    DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(arrayOfString));
  }
  
  AuthenticationStrategyImpl(int paramInt, String paramString)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    this.challengeCode = paramInt;
    this.headerName = paramString;
  }
  
  public void authFailed(HttpHost paramHttpHost, AuthScheme paramAuthScheme, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpHost, "Host");
    Args.notNull(paramHttpContext, "HTTP context");
    AuthCache localAuthCache = HttpClientContext.adapt(paramHttpContext).getAuthCache();
    if (localAuthCache != null)
    {
      Log localLog = this.log;
      boolean bool = localLog.isDebugEnabled();
      if (bool)
      {
        localLog = this.log;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Clearing cached auth scheme for ";
        localObject = str + paramHttpHost;
        localLog.debug(localObject);
      }
      localAuthCache.remove(paramHttpHost);
    }
  }
  
  public void authSucceeded(HttpHost paramHttpHost, AuthScheme paramAuthScheme, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpHost, "Host");
    Args.notNull(paramAuthScheme, "Auth scheme");
    Object localObject1 = "HTTP context";
    Args.notNull(paramHttpContext, (String)localObject1);
    Object localObject2 = HttpClientContext.adapt(paramHttpContext);
    boolean bool1 = isCachable(paramAuthScheme);
    if (bool1)
    {
      localObject1 = ((HttpClientContext)localObject2).getAuthCache();
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/client/BasicAuthCache;
        ((BasicAuthCache)localObject1).<init>();
        ((HttpClientContext)localObject2).setAuthCache((AuthCache)localObject1);
      }
      localObject2 = this.log;
      boolean bool2 = ((Log)localObject2).isDebugEnabled();
      if (bool2)
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
    Args.notNull(paramHttpResponse, "HTTP response");
    Object localObject1 = this.headerName;
    Header[] arrayOfHeader = paramHttpResponse.getHeaders((String)localObject1);
    HashMap localHashMap = new java/util/HashMap;
    int i = arrayOfHeader.length;
    localHashMap.<init>(i);
    int k = arrayOfHeader.length;
    int j;
    for (int m = 0; m < k; m = j)
    {
      Header localHeader = arrayOfHeader[m];
      boolean bool1 = localHeader instanceof FormattedHeader;
      if (bool1)
      {
        localObject1 = localHeader;
        localObject2 = ((FormattedHeader)localHeader).getBuffer();
        localObject1 = localHeader;
        localObject1 = (FormattedHeader)localHeader;
        j = ((FormattedHeader)localObject1).getValuePos();
      }
      for (;;)
      {
        int n = ((CharArrayBuffer)localObject2).length();
        if (j >= n) {
          break;
        }
        boolean bool2 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
        continue;
        localObject2 = localHeader.getValue();
        if (localObject2 == null)
        {
          localObject1 = new org/apache/http/auth/MalformedChallengeException;
          ((MalformedChallengeException)localObject1).<init>("Header value is null");
          throw ((Throwable)localObject1);
        }
        localObject1 = new org/apache/http/util/CharArrayBuffer;
        i1 = ((String)localObject2).length();
        ((CharArrayBuffer)localObject1).<init>(i1);
        ((CharArrayBuffer)localObject1).append((String)localObject2);
        localObject2 = localObject1;
        j = 0;
        localObject1 = null;
      }
      int i1 = j;
      for (;;)
      {
        int i2 = ((CharArrayBuffer)localObject2).length();
        if (i1 >= i2) {
          break;
        }
        boolean bool3 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(i1));
        if (bool3) {
          break;
        }
        i1 += 1;
      }
      localObject1 = ((CharArrayBuffer)localObject2).substring(j, i1);
      Object localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localHashMap.put(localObject1, localHeader);
      j = m + 1;
    }
    return localHashMap;
  }
  
  abstract Collection getPreferredAuthSchemes(RequestConfig paramRequestConfig);
  
  public boolean isAuthenticationRequested(HttpHost paramHttpHost, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int k = this.challengeCode;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localStatusLine = null;
    }
  }
  
  protected boolean isCachable(AuthScheme paramAuthScheme)
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
  
  public Queue select(Map paramMap, HttpHost paramHttpHost, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramMap, "Map of auth challenges");
    Args.notNull(paramHttpHost, "Host");
    Args.notNull(paramHttpResponse, "HTTP response");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = HttpClientContext.adapt(paramHttpContext);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    Lookup localLookup = ((HttpClientContext)localObject1).getAuthSchemeRegistry();
    Object localObject2;
    if (localLookup == null)
    {
      localObject1 = this.log;
      localObject2 = "Auth scheme registry not set in the context";
      ((Log)localObject1).debug(localObject2);
      localObject1 = localLinkedList;
    }
    for (;;)
    {
      return (Queue)localObject1;
      CredentialsProvider localCredentialsProvider = ((HttpClientContext)localObject1).getCredentialsProvider();
      if (localCredentialsProvider == null)
      {
        localObject1 = this.log;
        localObject2 = "Credentials provider not set in the context";
        ((Log)localObject1).debug(localObject2);
        localObject1 = localLinkedList;
      }
      else
      {
        localObject1 = ((HttpClientContext)localObject1).getRequestConfig();
        localObject1 = getPreferredAuthSchemes((RequestConfig)localObject1);
        if (localObject1 == null) {
          localObject1 = DEFAULT_SCHEME_PRIORITY;
        }
        localObject2 = this.log;
        boolean bool1 = ((Log)localObject2).isDebugEnabled();
        Object localObject3;
        if (bool1)
        {
          localObject2 = this.log;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Authentication schemes in the order of preference: ";
          localObject3 = (String)localObject4 + localObject1;
          ((Log)localObject2).debug(localObject3);
        }
        Object localObject4 = ((Collection)localObject1).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (String)((Iterator)localObject4).next();
          localObject2 = Locale.ENGLISH;
          localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
          localObject2 = (Header)paramMap.get(localObject2);
          String str1;
          if (localObject2 != null)
          {
            localObject3 = (AuthSchemeProvider)localLookup.lookup((String)localObject1);
            if (localObject3 == null)
            {
              localObject2 = this.log;
              bool1 = ((Log)localObject2).isWarnEnabled();
              if (bool1)
              {
                localObject2 = this.log;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                str1 = "Authentication scheme ";
                localObject1 = ((StringBuilder)localObject3).append(str1).append((String)localObject1);
                localObject3 = " not supported";
                localObject1 = (String)localObject3;
                ((Log)localObject2).warn(localObject1);
              }
            }
            else
            {
              localObject1 = ((AuthSchemeProvider)localObject3).create(paramHttpContext);
              ((AuthScheme)localObject1).processChallenge((Header)localObject2);
              localObject2 = new org/apache/http/auth/AuthScope;
              localObject3 = paramHttpHost.getHostName();
              int i = paramHttpHost.getPort();
              String str2 = ((AuthScheme)localObject1).getRealm();
              String str3 = ((AuthScheme)localObject1).getSchemeName();
              ((AuthScope)localObject2).<init>((String)localObject3, i, str2, str3);
              localObject2 = localCredentialsProvider.getCredentials((AuthScope)localObject2);
              if (localObject2 != null)
              {
                localObject3 = new org/apache/http/auth/AuthOption;
                ((AuthOption)localObject3).<init>((AuthScheme)localObject1, (Credentials)localObject2);
                localLinkedList.add(localObject3);
              }
            }
          }
          else
          {
            localObject2 = this.log;
            bool1 = ((Log)localObject2).isDebugEnabled();
            if (bool1)
            {
              localObject2 = this.log;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              str1 = "Challenge for ";
              localObject1 = ((StringBuilder)localObject3).append(str1).append((String)localObject1);
              localObject3 = " authentication scheme not available";
              localObject1 = (String)localObject3;
              ((Log)localObject2).debug(localObject1);
            }
          }
        }
        localObject1 = localLinkedList;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AuthenticationStrategyImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */