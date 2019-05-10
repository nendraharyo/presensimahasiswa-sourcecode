package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;

class CPool
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
  
  public CPool(ConnFactory paramConnFactory, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramConnFactory, paramInt1, paramInt2);
    Log localLog = LogFactory.getLog(CPool.class);
    this.log = localLog;
    this.timeToLive = paramLong;
    this.tunit = paramTimeUnit;
  }
  
  protected CPoolEntry createEntry(HttpRoute paramHttpRoute, ManagedHttpClientConnection paramManagedHttpClientConnection)
  {
    String str = Long.toString(COUNTER.getAndIncrement());
    CPoolEntry localCPoolEntry = new org/apache/http/impl/conn/CPoolEntry;
    Log localLog = this.log;
    long l = this.timeToLive;
    TimeUnit localTimeUnit = this.tunit;
    localCPoolEntry.<init>(localLog, str, paramHttpRoute, paramManagedHttpClientConnection, l, localTimeUnit);
    return localCPoolEntry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\CPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */