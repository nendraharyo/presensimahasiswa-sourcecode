package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.conn.HttpRoutedConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestProxyAuthentication
  extends RequestAuthenticationBase
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = "Proxy-Authorization";
    boolean bool1 = paramHttpRequest.containsHeader((String)localObject1);
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = (HttpRoutedConnection)paramHttpContext.getAttribute("http.connection");
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = this.log;
        localObject2 = "HTTP connection not set in the context";
        ((Log)localObject1).debug(localObject2);
      }
      else
      {
        localObject1 = ((HttpRoutedConnection)localObject1).getRoute();
        bool1 = ((HttpRoute)localObject1).isTunnelled();
        if (!bool1)
        {
          localObject1 = (AuthState)paramHttpContext.getAttribute("http.auth.proxy-scope");
          if (localObject1 == null)
          {
            localObject1 = this.log;
            localObject2 = "Proxy auth state not set in the context";
            ((Log)localObject1).debug(localObject2);
          }
          else
          {
            localObject2 = this.log;
            boolean bool2 = ((Log)localObject2).isDebugEnabled();
            if (bool2)
            {
              localObject2 = this.log;
              Object localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Proxy auth state: ");
              AuthProtocolState localAuthProtocolState = ((AuthState)localObject1).getState();
              localObject3 = localAuthProtocolState;
              ((Log)localObject2).debug(localObject3);
            }
            process((AuthState)localObject1, paramHttpRequest, paramHttpContext);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestProxyAuthentication.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */