package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;

class HttpConnPool
  extends AbstractConnPool
{
  private static final AtomicLong COUNTER;
  private final Log log;
  private final long timeToLive;
  private final TimeUnit tunit;
  
  static
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>();
    COUNTER = localAtomicLong;
  }
  
  public HttpConnPool(Log paramLog, ClientConnectionOperator paramClientConnectionOperator, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit)
  {
    super(localInternalConnFactory, paramInt1, paramInt2);
    this.log = paramLog;
    this.timeToLive = paramLong;
    this.tunit = paramTimeUnit;
  }
  
  protected HttpPoolEntry createEntry(HttpRoute paramHttpRoute, OperatedClientConnection paramOperatedClientConnection)
  {
    String str = Long.toString(COUNTER.getAndIncrement());
    HttpPoolEntry localHttpPoolEntry = new org/apache/http/impl/conn/HttpPoolEntry;
    Log localLog = this.log;
    long l = this.timeToLive;
    TimeUnit localTimeUnit = this.tunit;
    localHttpPoolEntry.<init>(localLog, str, paramHttpRoute, paramOperatedClientConnection, l, localTimeUnit);
    return localHttpPoolEntry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\HttpConnPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */