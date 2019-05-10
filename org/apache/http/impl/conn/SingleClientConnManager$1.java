package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;

class SingleClientConnManager$1
  implements ClientConnectionRequest
{
  SingleClientConnManager$1(SingleClientConnManager paramSingleClientConnManager, HttpRoute paramHttpRoute, Object paramObject) {}
  
  public void abortRequest() {}
  
  public ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit)
  {
    SingleClientConnManager localSingleClientConnManager = this.this$0;
    HttpRoute localHttpRoute = this.val$route;
    Object localObject = this.val$state;
    return localSingleClientConnManager.getConnection(localHttpRoute, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SingleClientConnManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */