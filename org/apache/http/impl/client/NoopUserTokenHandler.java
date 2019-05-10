package org.apache.http.impl.client;

import org.apache.http.client.UserTokenHandler;
import org.apache.http.protocol.HttpContext;

public class NoopUserTokenHandler
  implements UserTokenHandler
{
  public static final NoopUserTokenHandler INSTANCE;
  
  static
  {
    NoopUserTokenHandler localNoopUserTokenHandler = new org/apache/http/impl/client/NoopUserTokenHandler;
    localNoopUserTokenHandler.<init>();
    INSTANCE = localNoopUserTokenHandler;
  }
  
  public Object getUserToken(HttpContext paramHttpContext)
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\NoopUserTokenHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */