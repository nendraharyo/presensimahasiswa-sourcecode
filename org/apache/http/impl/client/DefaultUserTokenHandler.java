package org.apache.http.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpConnection;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;

public class DefaultUserTokenHandler
  implements UserTokenHandler
{
  public static final DefaultUserTokenHandler INSTANCE;
  
  static
  {
    DefaultUserTokenHandler localDefaultUserTokenHandler = new org/apache/http/impl/client/DefaultUserTokenHandler;
    localDefaultUserTokenHandler.<init>();
    INSTANCE = localDefaultUserTokenHandler;
  }
  
  private static Principal getAuthPrincipal(AuthState paramAuthState)
  {
    Object localObject = paramAuthState.getAuthScheme();
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = ((AuthScheme)localObject).isComplete();
      if (bool1)
      {
        bool2 = ((AuthScheme)localObject).isConnectionBased();
        if (bool2)
        {
          localObject = paramAuthState.getCredentials();
          if (localObject == null) {}
        }
      }
    }
    for (localObject = ((Credentials)localObject).getUserPrincipal();; localObject = null)
    {
      return (Principal)localObject;
      bool2 = false;
    }
  }
  
  public Object getUserToken(HttpContext paramHttpContext)
  {
    Object localObject = HttpClientContext.adapt(paramHttpContext);
    Principal localPrincipal = null;
    AuthState localAuthState = ((HttpClientContext)localObject).getTargetAuthState();
    if (localAuthState != null)
    {
      localPrincipal = getAuthPrincipal(localAuthState);
      if (localPrincipal == null) {
        localPrincipal = getAuthPrincipal(((HttpClientContext)localObject).getProxyAuthState());
      }
    }
    if (localPrincipal == null)
    {
      localObject = ((HttpClientContext)localObject).getConnection();
      boolean bool = ((HttpConnection)localObject).isOpen();
      if (bool)
      {
        bool = localObject instanceof ManagedHttpClientConnection;
        if (bool)
        {
          localObject = ((ManagedHttpClientConnection)localObject).getSSLSession();
          if (localObject == null) {}
        }
      }
    }
    for (localObject = ((SSLSession)localObject).getLocalPrincipal();; localObject = localPrincipal) {
      return localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultUserTokenHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */