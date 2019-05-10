package org.apache.http.impl.conn;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;

class PoolingClientConnectionManager$1
  implements ClientConnectionRequest
{
  PoolingClientConnectionManager$1(PoolingClientConnectionManager paramPoolingClientConnectionManager, Future paramFuture) {}
  
  public void abortRequest()
  {
    this.val$future.cancel(true);
  }
  
  public ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit)
  {
    PoolingClientConnectionManager localPoolingClientConnectionManager = this.this$0;
    Future localFuture = this.val$future;
    return localPoolingClientConnectionManager.leaseConnection(localFuture, paramLong, paramTimeUnit);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\PoolingClientConnectionManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */