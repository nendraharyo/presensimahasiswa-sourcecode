package org.apache.http.impl.client;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;

class InternalHttpClient$1
  implements ClientConnectionManager
{
  InternalHttpClient$1(InternalHttpClient paramInternalHttpClient) {}
  
  public void closeExpiredConnections()
  {
    InternalHttpClient.access$000(this.this$0).closeExpiredConnections();
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    InternalHttpClient.access$000(this.this$0).closeIdleConnections(paramLong, paramTimeUnit);
  }
  
  public SchemeRegistry getSchemeRegistry()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void shutdown()
  {
    InternalHttpClient.access$000(this.this$0).shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\InternalHttpClient$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */