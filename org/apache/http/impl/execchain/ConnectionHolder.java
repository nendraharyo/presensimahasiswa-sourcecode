package org.apache.http.impl.execchain;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpClientConnectionManager;

class ConnectionHolder
  implements Closeable, Cancellable, ConnectionReleaseTrigger
{
  private final Log log;
  private final HttpClientConnection managedConn;
  private final HttpClientConnectionManager manager;
  private volatile boolean released;
  private volatile boolean reusable;
  private volatile Object state;
  private volatile TimeUnit tunit;
  private volatile long validDuration;
  
  public ConnectionHolder(Log paramLog, HttpClientConnectionManager paramHttpClientConnectionManager, HttpClientConnection paramHttpClientConnection)
  {
    this.log = paramLog;
    this.manager = paramHttpClientConnectionManager;
    this.managedConn = paramHttpClientConnection;
  }
  
  public void abortConnection()
  {
    synchronized (this.managedConn)
    {
      boolean bool1 = this.released;
      if (bool1) {
        return;
      }
      bool1 = true;
      this.released = bool1;
      try
      {
        Object localObject1 = this.managedConn;
        ((HttpClientConnection)localObject1).shutdown();
        localObject1 = this.log;
        localObject4 = "Connection discarded";
        ((Log)localObject1).debug(localObject4);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject4 = this.log;
          boolean bool2 = ((Log)localObject4).isDebugEnabled();
          if (bool2)
          {
            localObject4 = this.log;
            localObject5 = localIOException.getMessage();
            ((Log)localObject4).debug(localObject5, localIOException);
          }
          localObject4 = this.manager;
          localObject5 = this.managedConn;
          l = 0L;
          localTimeUnit = TimeUnit.MILLISECONDS;
          ((HttpClientConnectionManager)localObject4).releaseConnection((HttpClientConnection)localObject5, null, l, localTimeUnit);
        }
      }
      finally
      {
        Object localObject4 = this.manager;
        Object localObject5 = this.managedConn;
        long l = 0L;
        TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
        ((HttpClientConnectionManager)localObject4).releaseConnection((HttpClientConnection)localObject5, null, l, localTimeUnit);
      }
    }
  }
  
  public boolean cancel()
  {
    boolean bool = this.released;
    Log localLog = this.log;
    String str = "Cancelling request execution";
    localLog.debug(str);
    abortConnection();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void close()
  {
    abortConnection();
  }
  
  public boolean isReleased()
  {
    return this.released;
  }
  
  public boolean isReusable()
  {
    return this.reusable;
  }
  
  public void markNonReusable()
  {
    this.reusable = false;
  }
  
  public void markReusable()
  {
    this.reusable = true;
  }
  
  public void releaseConnection()
  {
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      long l;
      TimeUnit localTimeUnit;
      synchronized (this.managedConn)
      {
        boolean bool1 = this.released;
        if (bool1) {
          return;
        }
        bool1 = true;
        this.released = bool1;
        bool1 = this.reusable;
        if (bool1)
        {
          localObject1 = this.manager;
          localObject2 = this.managedConn;
          localObject3 = this.state;
          l = this.validDuration;
          localTimeUnit = this.tunit;
          ((HttpClientConnectionManager)localObject1).releaseConnection((HttpClientConnection)localObject2, localObject3, l, localTimeUnit);
        }
      }
      try
      {
        Object localObject5 = this.managedConn;
        ((HttpClientConnection)localObject5).close();
        localObject5 = this.log;
        localObject1 = "Connection discarded";
        ((Log)localObject5).debug(localObject1);
        localObject1 = this.manager;
        localObject2 = this.managedConn;
        localObject3 = null;
        l = 0L;
        localTimeUnit = TimeUnit.MILLISECONDS;
        ((HttpClientConnectionManager)localObject1).releaseConnection((HttpClientConnection)localObject2, null, l, localTimeUnit);
      }
      catch (IOException localIOException)
      {
        localObject1 = this.log;
        boolean bool2 = ((Log)localObject1).isDebugEnabled();
        if (bool2)
        {
          localObject1 = this.log;
          localObject2 = localIOException.getMessage();
          ((Log)localObject1).debug(localObject2, localIOException);
        }
        localObject1 = this.manager;
        localObject2 = this.managedConn;
        localObject3 = null;
        l = 0L;
        localTimeUnit = TimeUnit.MILLISECONDS;
        ((HttpClientConnectionManager)localObject1).releaseConnection((HttpClientConnection)localObject2, null, l, localTimeUnit);
      }
      finally
      {
        localObject1 = this.manager;
        localObject2 = this.managedConn;
        localObject3 = null;
        l = 0L;
        localTimeUnit = TimeUnit.MILLISECONDS;
        ((HttpClientConnectionManager)localObject1).releaseConnection((HttpClientConnection)localObject2, null, l, localTimeUnit);
      }
    }
  }
  
  public void setState(Object paramObject)
  {
    this.state = paramObject;
  }
  
  public void setValidFor(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (this.managedConn)
    {
      this.validDuration = paramLong;
      this.tunit = paramTimeUnit;
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\ConnectionHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */