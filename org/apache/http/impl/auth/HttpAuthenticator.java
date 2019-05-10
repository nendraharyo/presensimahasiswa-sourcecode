package org.apache.http.impl.auth;

import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

public class HttpAuthenticator
{
  private final Log log;
  
  public HttpAuthenticator()
  {
    this(null);
  }
  
  public HttpAuthenticator(Log paramLog)
  {
    if (paramLog != null) {}
    for (;;)
    {
      this.log = paramLog;
      return;
      Class localClass = getClass();
      paramLog = LogFactory.getLog(localClass);
    }
  }
  
  private Header doAuth(AuthScheme paramAuthScheme, Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    boolean bool = paramAuthScheme instanceof ContextAwareAuthScheme;
    if (bool) {
      paramAuthScheme = (ContextAwareAuthScheme)paramAuthScheme;
    }
    for (Header localHeader = paramAuthScheme.authenticate(paramCredentials, paramHttpRequest, paramHttpContext);; localHeader = paramAuthScheme.authenticate(paramCredentials, paramHttpRequest)) {
      return localHeader;
    }
  }
  
  private void ensureAuthScheme(AuthScheme paramAuthScheme)
  {
    Asserts.notNull(paramAuthScheme, "Auth scheme");
  }
  
  public void generateAuthResponse(HttpRequest paramHttpRequest, AuthState paramAuthState, HttpContext paramHttpContext)
  {
    localObject1 = paramAuthState.getAuthScheme();
    Object localObject2 = paramAuthState.getCredentials();
    localObject3 = HttpAuthenticator.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
    localObject4 = paramAuthState.getState();
    int i = ((AuthProtocolState)localObject4).ordinal();
    int j = localObject3[i];
    switch (j)
    {
    }
    for (;;)
    {
      if (localObject1 != null) {}
      for (;;)
      {
        try
        {
          localObject2 = doAuth((AuthScheme)localObject1, (Credentials)localObject2, paramHttpRequest, paramHttpContext);
          paramHttpRequest.addHeader((Header)localObject2);
          return;
        }
        catch (AuthenticationException localAuthenticationException2)
        {
          localObject3 = this.log;
          boolean bool2 = ((Log)localObject3).isErrorEnabled();
          if (!bool2) {
            continue;
          }
          localObject3 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject1 = ((StringBuilder)localObject4).append(localObject1);
          localObject4 = " authentication error: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          String str2 = localAuthenticationException2.getMessage();
          str2 = str2;
          ((Log)localObject3).error(str2);
          continue;
        }
        ensureAuthScheme((AuthScheme)localObject1);
        bool2 = ((AuthScheme)localObject1).isConnectionBased();
        if (!bool2) {
          break;
        }
      }
      localObject3 = paramAuthState.getAuthOptions();
      if (localObject3 != null) {
        for (;;)
        {
          boolean bool3 = ((Queue)localObject3).isEmpty();
          if (bool3) {
            break;
          }
          localObject2 = (AuthOption)((Queue)localObject3).remove();
          localObject1 = ((AuthOption)localObject2).getAuthScheme();
          localObject2 = ((AuthOption)localObject2).getCredentials();
          paramAuthState.update((AuthScheme)localObject1, (Credentials)localObject2);
          localObject4 = this.log;
          boolean bool1 = ((Log)localObject4).isDebugEnabled();
          Object localObject5;
          if (bool1)
          {
            localObject4 = this.log;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject5 = ((StringBuilder)localObject5).append("Generating response to an authentication challenge using ");
            String str3 = ((AuthScheme)localObject1).getSchemeName();
            localObject5 = ((StringBuilder)localObject5).append(str3);
            str3 = " scheme";
            localObject5 = str3;
            ((Log)localObject4).debug(localObject5);
          }
          try
          {
            localObject2 = doAuth((AuthScheme)localObject1, (Credentials)localObject2, paramHttpRequest, paramHttpContext);
            paramHttpRequest.addHeader((Header)localObject2);
          }
          catch (AuthenticationException localAuthenticationException1)
          {
            localObject4 = this.log;
            bool1 = ((Log)localObject4).isWarnEnabled();
          }
          if (bool1)
          {
            localObject4 = this.log;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject1 = ((StringBuilder)localObject5).append(localObject1);
            localObject5 = " authentication error: ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            String str1 = localAuthenticationException1.getMessage();
            str1 = str1;
            ((Log)localObject4).warn(str1);
          }
        }
      }
      ensureAuthScheme((AuthScheme)localObject1);
    }
  }
  
  public boolean handleAuthChallenge(HttpHost paramHttpHost, HttpResponse paramHttpResponse, AuthenticationStrategy paramAuthenticationStrategy, AuthState paramAuthState, HttpContext paramHttpContext)
  {
    i = 1;
    try
    {
      localObject1 = this.log;
      bool1 = ((Log)localObject1).isDebugEnabled();
      if (bool1)
      {
        localObject1 = this.log;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = paramHttpHost.toHostString();
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = " requested authentication";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((Log)localObject1).debug(localObject3);
      }
      localObject3 = paramAuthenticationStrategy.getChallenges(paramHttpHost, paramHttpResponse, paramHttpContext);
      bool1 = ((Map)localObject3).isEmpty();
      if (!bool1) {
        break label137;
      }
      localObject1 = this.log;
      localObject5 = "Response contains no authentication challenges";
      ((Log)localObject1).debug(localObject5);
      bool1 = false;
      localObject1 = null;
    }
    catch (MalformedChallengeException localMalformedChallengeException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool1;
        Object localObject3;
        Object localObject4;
        label137:
        Object localObject6;
        int k;
        Object localObject5 = this.log;
        i = ((Log)localObject5).isWarnEnabled();
        if (i != 0)
        {
          localObject5 = this.log;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Malformed challenge: ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject2 = localMalformedChallengeException.getMessage();
          localObject2 = (String)localObject2;
          ((Log)localObject5).warn(localObject2);
        }
        paramAuthState.reset();
        int j = 0;
        Object localObject2 = null;
        continue;
        if (localObject4 == null)
        {
          localObject2 = this.log;
          localObject5 = "Auth scheme is null";
          ((Log)localObject2).debug(localObject5);
          j = 0;
          localObject2 = null;
          paramAuthenticationStrategy.authFailed(paramHttpHost, null, paramHttpContext);
          paramAuthState.reset();
          localObject2 = AuthProtocolState.FAILURE;
          paramAuthState.setState((AuthProtocolState)localObject2);
          j = 0;
          localObject2 = null;
        }
        else if (localObject4 != null)
        {
          localObject2 = ((AuthScheme)localObject4).getSchemeName();
          localObject6 = Locale.ENGLISH;
          localObject2 = ((String)localObject2).toLowerCase((Locale)localObject6);
          localObject2 = ((Map)localObject3).get(localObject2);
          localObject2 = (Header)localObject2;
          boolean bool2;
          if (localObject2 != null)
          {
            localObject3 = this.log;
            localObject6 = "Authorization challenge processed";
            ((Log)localObject3).debug(localObject6);
            ((AuthScheme)localObject4).processChallenge((Header)localObject2);
            bool2 = ((AuthScheme)localObject4).isComplete();
            if (bool2)
            {
              localObject2 = this.log;
              localObject5 = "Authentication failed";
              ((Log)localObject2).debug(localObject5);
              localObject2 = paramAuthState.getAuthScheme();
              paramAuthenticationStrategy.authFailed(paramHttpHost, (AuthScheme)localObject2, paramHttpContext);
              paramAuthState.reset();
              localObject2 = AuthProtocolState.FAILURE;
              paramAuthState.setState((AuthProtocolState)localObject2);
              bool2 = false;
              localObject2 = null;
            }
            else
            {
              localObject2 = AuthProtocolState.HANDSHAKE;
              paramAuthState.setState((AuthProtocolState)localObject2);
              bool2 = i;
            }
          }
          else
          {
            paramAuthState.reset();
            continue;
            bool2 = false;
            localObject2 = null;
          }
        }
      }
    }
    return bool1;
    localObject4 = paramAuthState.getAuthScheme();
    localObject1 = HttpAuthenticator.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
    localObject6 = paramAuthState.getState();
    k = ((AuthProtocolState)localObject6).ordinal();
    j = localObject1[k];
    switch (j)
    {
    default: 
    case 4: 
    case 3: 
      for (;;)
      {
        localObject1 = paramAuthenticationStrategy.select((Map)localObject3, paramHttpHost, paramHttpResponse, paramHttpContext);
        if (localObject1 == null) {
          break label700;
        }
        boolean bool3 = ((Queue)localObject1).isEmpty();
        if (bool3) {
          break label700;
        }
        localObject3 = this.log;
        bool3 = ((Log)localObject3).isDebugEnabled();
        if (bool3)
        {
          localObject3 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject6 = "Selected authentication options: ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
          localObject4 = ((StringBuilder)localObject4).append(localObject1);
          localObject4 = ((StringBuilder)localObject4).toString();
          ((Log)localObject3).debug(localObject4);
        }
        localObject3 = AuthProtocolState.CHALLENGED;
        paramAuthState.setState((AuthProtocolState)localObject3);
        paramAuthState.update((Queue)localObject1);
        j = i;
        break;
        j = 0;
        localObject1 = null;
        break;
        paramAuthState.reset();
      }
    }
  }
  
  public boolean isAuthenticationRequested(HttpHost paramHttpHost, HttpResponse paramHttpResponse, AuthenticationStrategy paramAuthenticationStrategy, AuthState paramAuthState, HttpContext paramHttpContext)
  {
    boolean bool = paramAuthenticationStrategy.isAuthenticationRequested(paramHttpHost, paramHttpResponse, paramHttpContext);
    if (bool)
    {
      this.log.debug("Authentication required");
      localObject1 = paramAuthState.getState();
      localObject2 = AuthProtocolState.SUCCESS;
      if (localObject1 == localObject2)
      {
        localObject1 = paramAuthState.getAuthScheme();
        paramAuthenticationStrategy.authFailed(paramHttpHost, (AuthScheme)localObject1, paramHttpContext);
      }
      bool = true;
      return bool;
    }
    Object localObject1 = HttpAuthenticator.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
    Object localObject2 = paramAuthState.getState();
    int j = ((AuthProtocolState)localObject2).ordinal();
    int i = localObject1[j];
    switch (i)
    {
    default: 
      localObject1 = AuthProtocolState.UNCHALLENGED;
      paramAuthState.setState((AuthProtocolState)localObject1);
    }
    for (;;)
    {
      i = 0;
      localObject1 = null;
      break;
      localObject1 = this.log;
      localObject2 = "Authentication succeeded";
      ((Log)localObject1).debug(localObject2);
      localObject1 = AuthProtocolState.SUCCESS;
      paramAuthState.setState((AuthProtocolState)localObject1);
      localObject1 = paramAuthState.getAuthScheme();
      paramAuthenticationStrategy.authSucceeded(paramHttpHost, (AuthScheme)localObject1, paramHttpContext);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\HttpAuthenticator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */