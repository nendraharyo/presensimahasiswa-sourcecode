package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.routing.HttpRoute;

class BasicHttpClientConnectionManager$1
  implements ConnectionRequest
{
  BasicHttpClientConnectionManager$1(BasicHttpClientConnectionManager paramBasicHttpClientConnectionManager, HttpRoute paramHttpRoute, Object paramObject) {}
  
  public boolean cancel()
  {
    return false;
  }
  
  public HttpClientConnection get(long paramLong, TimeUnit paramTimeUnit)
  {
    BasicHttpClientConnectionManager localBasicHttpClientConnectionManager = this.this$0;
    HttpRoute localHttpRoute = this.val$route;
    Object localObject = this.val$state;
    return localBasicHttpClientConnectionManager.getConnection(localHttpRoute, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\BasicHttpClientConnectionManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */