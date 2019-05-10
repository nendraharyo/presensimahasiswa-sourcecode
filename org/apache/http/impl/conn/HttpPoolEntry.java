package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;

class HttpPoolEntry
  extends PoolEntry
{
  private final Log log;
  private final RouteTracker tracker;
  
  public HttpPoolEntry(Log paramLog, String paramString, HttpRoute paramHttpRoute, OperatedClientConnection paramOperatedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramString, paramHttpRoute, paramOperatedClientConnection, paramLong, paramTimeUnit);
    this.log = paramLog;
    localObject = new org/apache/http/conn/routing/RouteTracker;
    ((RouteTracker)localObject).<init>(paramHttpRoute);
    this.tracker = ((RouteTracker)localObject);
  }
  
  public void close()
  {
    OperatedClientConnection localOperatedClientConnection = (OperatedClientConnection)getConnection();
    try
    {
      localOperatedClientConnection.close();
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
  
  HttpRoute getEffectiveRoute()
  {
    return this.tracker.toRoute();
  }
  
  HttpRoute getPlannedRoute()
  {
    return (HttpRoute)getRoute();
  }
  
  RouteTracker getTracker()
  {
    return this.tracker;
  }
  
  public boolean isClosed()
  {
    OperatedClientConnection localOperatedClientConnection = (OperatedClientConnection)getConnection();
    boolean bool = localOperatedClientConnection.isOpen();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOperatedClientConnection = null;
    }
  }
  
  public boolean isExpired(long paramLong)
  {
    boolean bool1 = super.isExpired(paramLong);
    if (bool1)
    {
      Log localLog = this.log;
      boolean bool2 = localLog.isDebugEnabled();
      if (bool2)
      {
        localLog = this.log;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Connection ").append(this).append(" expired @ ");
        Date localDate = new java/util/Date;
        long l = getExpiry();
        localDate.<init>(l);
        localObject = localDate;
        localLog.debug(localObject);
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\HttpPoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */