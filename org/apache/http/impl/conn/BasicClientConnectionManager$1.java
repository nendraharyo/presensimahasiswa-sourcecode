package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;

class BasicClientConnectionManager$1
  implements ClientConnectionRequest
{
  BasicClientConnectionManager$1(BasicClientConnectionManager paramBasicClientConnectionManager, HttpRoute paramHttpRoute, Object paramObject) {}
  
  public void abortRequest() {}
  
  public ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit)
  {
    BasicClientConnectionManager localBasicClientConnectionManager = this.this$0;
    HttpRoute localHttpRoute = this.val$route;
    Object localObject = this.val$state;
    return localBasicClientConnectionManager.getConnection(localHttpRoute, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\BasicClientConnectionManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */