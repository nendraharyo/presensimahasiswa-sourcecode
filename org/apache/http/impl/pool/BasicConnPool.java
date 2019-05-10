package org.apache.http.impl.pool;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;

public class BasicConnPool
  extends AbstractConnPool
{
  private static final AtomicLong COUNTER;
  
  static
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>();
    COUNTER = localAtomicLong;
  }
  
  public BasicConnPool()
  {
    super(localBasicConnFactory, 2, 20);
  }
  
  public BasicConnPool(SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    super(localBasicConnFactory, 2, 20);
  }
  
  public BasicConnPool(HttpParams paramHttpParams)
  {
    super(localBasicConnFactory, 2, 20);
  }
  
  public BasicConnPool(ConnFactory paramConnFactory)
  {
    super(paramConnFactory, 2, 20);
  }
  
  protected BasicPoolEntry createEntry(HttpHost paramHttpHost, HttpClientConnection paramHttpClientConnection)
  {
    BasicPoolEntry localBasicPoolEntry = new org/apache/http/impl/pool/BasicPoolEntry;
    String str = Long.toString(COUNTER.getAndIncrement());
    localBasicPoolEntry.<init>(str, paramHttpHost, paramHttpClientConnection);
    return localBasicPoolEntry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\pool\BasicConnPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */