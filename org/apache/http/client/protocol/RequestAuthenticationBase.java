package org.apache.http.client.protocol;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

abstract class RequestAuthenticationBase
  implements HttpRequestInterceptor
{
  final Log log;
  
  public RequestAuthenticationBase()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  private Header authenticate(AuthScheme paramAuthScheme, Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Object localObject = "Auth scheme";
    Asserts.notNull(paramAuthScheme, (String)localObject);
    boolean bool = paramAuthScheme instanceof ContextAwareAuthScheme;
    if (bool) {
      paramAuthScheme = (ContextAwareAuthScheme)paramAuthScheme;
    }
    for (localObject = paramAuthScheme.authenticate(paramCredentials, paramHttpRequest, paramHttpContext);; localObject = paramAuthScheme.authenticate(paramCredentials, paramHttpRequest)) {
      return (Header)localObject;
    }
  }
  
  private void ensureAuthScheme(AuthScheme paramAuthScheme)
  {
    Asserts.notNull(paramAuthScheme, "Auth scheme");
  }
  
  void process(AuthState paramAuthState, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    localObject1 = paramAuthState.getAuthScheme();
    Object localObject2 = paramAuthState.getCredentials();
    localObject3 = RequestAuthenticationBase.1.$SwitchMap$org$apache$http$auth$AuthProtocolState;
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
          localObject2 = authenticate((AuthScheme)localObject1, (Credentials)localObject2, paramHttpRequest, paramHttpContext);
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
            localObject2 = authenticate((AuthScheme)localObject1, (Credentials)localObject2, paramHttpRequest, paramHttpContext);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestAuthenticationBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */