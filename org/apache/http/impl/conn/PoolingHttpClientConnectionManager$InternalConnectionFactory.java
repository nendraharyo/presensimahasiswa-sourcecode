package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnFactory;

class PoolingHttpClientConnectionManager$InternalConnectionFactory
  implements ConnFactory
{
  private final PoolingHttpClientConnectionManager.ConfigData configData;
  private final HttpConnectionFactory connFactory;
  
  PoolingHttpClientConnectionManager$InternalConnectionFactory(PoolingHttpClientConnectionManager.ConfigData paramConfigData, HttpConnectionFactory paramHttpConnectionFactory)
  {
    if (paramConfigData != null)
    {
      this.configData = paramConfigData;
      if (paramHttpConnectionFactory == null) {
        break label34;
      }
    }
    for (;;)
    {
      this.connFactory = paramHttpConnectionFactory;
      return;
      paramConfigData = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager$ConfigData;
      paramConfigData.<init>();
      break;
      label34:
      paramHttpConnectionFactory = ManagedHttpClientConnectionFactory.INSTANCE;
    }
  }
  
  public ManagedHttpClientConnection create(HttpRoute paramHttpRoute)
  {
    Object localObject = null;
    HttpHost localHttpHost = paramHttpRoute.getProxyHost();
    if (localHttpHost != null)
    {
      localObject = this.configData;
      localHttpHost = paramHttpRoute.getProxyHost();
      localObject = ((PoolingHttpClientConnectionManager.ConfigData)localObject).getConnectionConfig(localHttpHost);
    }
    if (localObject == null)
    {
      localObject = this.configData;
      localHttpHost = paramHttpRoute.getTargetHost();
      localObject = ((PoolingHttpClientConnectionManager.ConfigData)localObject).getConnectionConfig(localHttpHost);
    }
    if (localObject == null) {
      localObject = this.configData.getDefaultConnectionConfig();
    }
    if (localObject == null) {
      localObject = ConnectionConfig.DEFAULT;
    }
    return (ManagedHttpClientConnection)this.connFactory.create(paramHttpRoute, (ConnectionConfig)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\PoolingHttpClientConnectionManager$InternalConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */