package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class RequestTargetAuthentication
  extends RequestAuthenticationBase
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpContext, "HTTP context");
    Object localObject1 = paramHttpRequest.getRequestLine().getMethod();
    Object localObject2 = "CONNECT";
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = "Authorization";
      bool1 = paramHttpRequest.containsHeader((String)localObject1);
      if (!bool1)
      {
        localObject1 = (AuthState)paramHttpContext.getAttribute("http.auth.target-scope");
        if (localObject1 == null)
        {
          localObject1 = this.log;
          localObject2 = "Target auth state not set in the context";
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
            localObject3 = ((StringBuilder)localObject3).append("Target auth state: ");
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\protocol\RequestTargetAuthentication.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */