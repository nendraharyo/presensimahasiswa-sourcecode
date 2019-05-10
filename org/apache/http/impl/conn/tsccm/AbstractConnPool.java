package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.IdleConnectionHandler;
import org.apache.http.util.Args;

public abstract class AbstractConnPool
{
  protected IdleConnectionHandler idleConnHandler;
  protected volatile boolean isShutDown;
  protected Set issuedConnections;
  protected Set leasedConnections;
  private final Log log;
  protected int numConnections;
  protected final Lock poolLock;
  protected ReferenceQueue refQueue;
  
  protected AbstractConnPool()
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.leasedConnections = ((Set)localObject);
    localObject = new org/apache/http/impl/conn/IdleConnectionHandler;
    ((IdleConnectionHandler)localObject).<init>();
    this.idleConnHandler = ((IdleConnectionHandler)localObject);
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.poolLock = ((Lock)localObject);
  }
  
  protected void closeConnection(OperatedClientConnection paramOperatedClientConnection)
  {
    if (paramOperatedClientConnection != null) {}
    try
    {
      paramOperatedClientConnection.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log localLog = this.log;
        String str = "I/O error closing connection";
        localLog.debug(str, localIOException);
      }
    }
  }
  
  public void closeExpiredConnections()
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.idleConnHandler;
      ((IdleConnectionHandler)localObject1).closeExpiredConnections();
      return;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    Args.notNull(paramTimeUnit, "Time unit");
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.idleConnHandler;
      long l = paramTimeUnit.toMillis(paramLong);
      ((IdleConnectionHandler)localObject1).closeIdleConnections(l);
      return;
    }
    finally
    {
      this.poolLock.unlock();
    }
  }
  
  public abstract void deleteClosedConnections();
  
  public void enableConnectionGC() {}
  
  public abstract void freeEntry(BasicPoolEntry paramBasicPoolEntry, boolean paramBoolean, long paramLong, TimeUnit paramTimeUnit);
  
  public final BasicPoolEntry getEntry(HttpRoute paramHttpRoute, Object paramObject, long paramLong, TimeUnit paramTimeUnit)
  {
    return requestPoolEntry(paramHttpRoute, paramObject).getPoolEntry(paramLong, paramTimeUnit);
  }
  
  protected abstract void handleLostEntry(HttpRoute paramHttpRoute);
  
  public void handleReference(Reference paramReference) {}
  
  public abstract PoolEntryRequest requestPoolEntry(HttpRoute paramHttpRoute, Object paramObject);
  
  public void shutdown()
  {
    Object localObject1 = this.poolLock;
    ((Lock)localObject1).lock();
    for (;;)
    {
      try
      {
        bool = this.isShutDown;
        if (bool)
        {
          localObject1 = this.poolLock;
          ((Lock)localObject1).unlock();
          return;
        }
        localObject1 = this.leasedConnections;
        Iterator localIterator = ((Set)localObject1).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject1 = localIterator.next();
          localObject1 = (BasicPoolEntry)localObject1;
          localIterator.remove();
          localObject1 = ((BasicPoolEntry)localObject1).getConnection();
          closeConnection((OperatedClientConnection)localObject1);
          continue;
        }
        localObject3 = this.idleConnHandler;
      }
      finally
      {
        this.poolLock.unlock();
      }
      ((IdleConnectionHandler)localObject3).removeAll();
      boolean bool = true;
      this.isShutDown = bool;
      Object localObject3 = this.poolLock;
      ((Lock)localObject3).unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\AbstractConnPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */