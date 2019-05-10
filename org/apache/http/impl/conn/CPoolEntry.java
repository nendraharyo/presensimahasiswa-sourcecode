package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.PoolEntry;

class CPoolEntry
  extends PoolEntry
{
  private final Log log;
  private volatile boolean routeComplete;
  
  public CPoolEntry(Log paramLog, String paramString, HttpRoute paramHttpRoute, ManagedHttpClientConnection paramManagedHttpClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    super(paramString, paramHttpRoute, paramManagedHttpClientConnection, paramLong, paramTimeUnit);
    this.log = paramLog;
  }
  
  public void close()
  {
    try
    {
      closeConnection();
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
  
  public void closeConnection()
  {
    ((HttpClientConnection)getConnection()).close();
  }
  
  public boolean isClosed()
  {
    HttpClientConnection localHttpClientConnection = (HttpClientConnection)getConnection();
    boolean bool = localHttpClientConnection.isOpen();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localHttpClientConnection = null;
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
  
  public boolean isRouteComplete()
  {
    return this.routeComplete;
  }
  
  public void markRouteComplete()
  {
    this.routeComplete = true;
  }
  
  public void shutdownConnection()
  {
    ((HttpClientConnection)getConnection()).shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\CPoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */