package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.util.Args;

public class BasicPoolEntry
  extends AbstractPoolEntry
{
  private final long created;
  private long expiry;
  private long updated;
  private final long validUntil;
  
  public BasicPoolEntry(ClientConnectionOperator paramClientConnectionOperator, HttpRoute paramHttpRoute)
  {
    this(paramClientConnectionOperator, paramHttpRoute, -1, localTimeUnit);
  }
  
  public BasicPoolEntry(ClientConnectionOperator paramClientConnectionOperator, HttpRoute paramHttpRoute, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramClientConnectionOperator, paramHttpRoute);
    String str = "HTTP route";
    Args.notNull(paramHttpRoute, str);
    long l1 = System.currentTimeMillis();
    this.created = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    if (bool)
    {
      l1 = this.created;
      long l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
    }
    for (this.validUntil = l1;; this.validUntil = l1)
    {
      l1 = this.validUntil;
      this.expiry = l1;
      return;
      l1 = Long.MAX_VALUE;
    }
  }
  
  public BasicPoolEntry(ClientConnectionOperator paramClientConnectionOperator, HttpRoute paramHttpRoute, ReferenceQueue paramReferenceQueue)
  {
    super(paramClientConnectionOperator, paramHttpRoute);
    Args.notNull(paramHttpRoute, "HTTP route");
    long l = System.currentTimeMillis();
    this.created = l;
    this.validUntil = Long.MAX_VALUE;
    l = this.validUntil;
    this.expiry = l;
  }
  
  protected final OperatedClientConnection getConnection()
  {
    return this.connection;
  }
  
  public long getCreated()
  {
    return this.created;
  }
  
  public long getExpiry()
  {
    return this.expiry;
  }
  
  protected final HttpRoute getPlannedRoute()
  {
    return this.route;
  }
  
  public long getUpdated()
  {
    return this.updated;
  }
  
  public long getValidUntil()
  {
    return this.validUntil;
  }
  
  protected final BasicPoolEntryRef getWeakRef()
  {
    return null;
  }
  
  public boolean isExpired(long paramLong)
  {
    long l = this.expiry;
    boolean bool = paramLong < l;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void shutdownEntry()
  {
    super.shutdownEntry();
  }
  
  public void updateExpiry(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = System.currentTimeMillis();
    this.updated = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    long l2;
    if (bool)
    {
      l1 = this.updated;
      l2 = paramTimeUnit.toMillis(paramLong);
    }
    for (l1 += l2;; l1 = Long.MAX_VALUE)
    {
      l1 = Math.min(this.validUntil, l1);
      this.expiry = l1;
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\BasicPoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */