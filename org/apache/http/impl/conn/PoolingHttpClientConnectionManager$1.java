package org.apache.http.impl.conn;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionRequest;

class PoolingHttpClientConnectionManager$1
  implements ConnectionRequest
{
  PoolingHttpClientConnectionManager$1(PoolingHttpClientConnectionManager paramPoolingHttpClientConnectionManager, Future paramFuture) {}
  
  public boolean cancel()
  {
    return this.val$future.cancel(true);
  }
  
  public HttpClientConnection get(long paramLong, TimeUnit paramTimeUnit)
  {
    PoolingHttpClientConnectionManager localPoolingHttpClientConnectionManager = this.this$0;
    Future localFuture = this.val$future;
    return localPoolingHttpClientConnectionManager.leaseConnection(localFuture, paramLong, paramTimeUnit);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\PoolingHttpClientConnectionManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */