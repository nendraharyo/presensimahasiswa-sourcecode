package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class ThreadSafeClientConnManager
  implements ClientConnectionManager
{
  protected final ClientConnectionOperator connOperator;
  protected final ConnPerRouteBean connPerRoute;
  protected final AbstractConnPool connectionPool;
  private final Log log;
  protected final ConnPoolByRoute pool;
  protected final SchemeRegistry schemeRegistry;
  
  public ThreadSafeClientConnManager()
  {
    this(localSchemeRegistry);
  }
  
  public ThreadSafeClientConnManager(SchemeRegistry paramSchemeRegistry)
  {
    this(paramSchemeRegistry, -1, localTimeUnit);
  }
  
  public ThreadSafeClientConnManager(SchemeRegistry paramSchemeRegistry, long paramLong, TimeUnit paramTimeUnit)
  {
    this(paramSchemeRegistry, paramLong, paramTimeUnit, localConnPerRouteBean);
  }
  
  public ThreadSafeClientConnManager(SchemeRegistry paramSchemeRegistry, long paramLong, TimeUnit paramTimeUnit, ConnPerRouteBean paramConnPerRouteBean)
  {
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    this.schemeRegistry = paramSchemeRegistry;
    this.connPerRoute = paramConnPerRouteBean;
    localObject = createConnectionOperator(paramSchemeRegistry);
    this.connOperator = ((ClientConnectionOperator)localObject);
    localObject = createConnectionPool(paramLong, paramTimeUnit);
    this.pool = ((ConnPoolByRoute)localObject);
    localObject = this.pool;
    this.connectionPool = ((AbstractConnPool)localObject);
  }
  
  public ThreadSafeClientConnManager(HttpParams paramHttpParams, SchemeRegistry paramSchemeRegistry)
  {
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    this.schemeRegistry = paramSchemeRegistry;
    localObject = new org/apache/http/conn/params/ConnPerRouteBean;
    ((ConnPerRouteBean)localObject).<init>();
    this.connPerRoute = ((ConnPerRouteBean)localObject);
    localObject = createConnectionOperator(paramSchemeRegistry);
    this.connOperator = ((ClientConnectionOperator)localObject);
    localObject = (ConnPoolByRoute)createConnectionPool(paramHttpParams);
    this.pool = ((ConnPoolByRoute)localObject);
    localObject = this.pool;
    this.connectionPool = ((AbstractConnPool)localObject);
  }
  
  public void closeExpiredConnections()
  {
    this.log.debug("Closing expired connections");
    this.pool.closeExpiredConnections();
  }
  
  public void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit)
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Closing connections idle longer than ").append(paramLong);
      String str = " ";
      localObject = str + paramTimeUnit;
      localLog.debug(localObject);
    }
    this.pool.closeIdleConnections(paramLong, paramTimeUnit);
  }
  
  protected ClientConnectionOperator createConnectionOperator(SchemeRegistry paramSchemeRegistry)
  {
    DefaultClientConnectionOperator localDefaultClientConnectionOperator = new org/apache/http/impl/conn/DefaultClientConnectionOperator;
    localDefaultClientConnectionOperator.<init>(paramSchemeRegistry);
    return localDefaultClientConnectionOperator;
  }
  
  protected AbstractConnPool createConnectionPool(HttpParams paramHttpParams)
  {
    ConnPoolByRoute localConnPoolByRoute = new org/apache/http/impl/conn/tsccm/ConnPoolByRoute;
    ClientConnectionOperator localClientConnectionOperator = this.connOperator;
    localConnPoolByRoute.<init>(localClientConnectionOperator, paramHttpParams);
    return localConnPoolByRoute;
  }
  
  protected ConnPoolByRoute createConnectionPool(long paramLong, TimeUnit paramTimeUnit)
  {
    ConnPoolByRoute localConnPoolByRoute = new org/apache/http/impl/conn/tsccm/ConnPoolByRoute;
    ClientConnectionOperator localClientConnectionOperator = this.connOperator;
    ConnPerRouteBean localConnPerRouteBean = this.connPerRoute;
    localConnPoolByRoute.<init>(localClientConnectionOperator, localConnPerRouteBean, 20, paramLong, paramTimeUnit);
    return localConnPoolByRoute;
  }
  
  protected void finalize()
  {
    try
    {
      shutdown();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public int getConnectionsInPool()
  {
    return this.pool.getConnectionsInPool();
  }
  
  public int getConnectionsInPool(HttpRoute paramHttpRoute)
  {
    return this.pool.getConnectionsInPool(paramHttpRoute);
  }
  
  public int getDefaultMaxPerRoute()
  {
    return this.connPerRoute.getDefaultMaxPerRoute();
  }
  
  public int getMaxForRoute(HttpRoute paramHttpRoute)
  {
    return this.connPerRoute.getMaxForRoute(paramHttpRoute);
  }
  
  public int getMaxTotal()
  {
    return this.pool.getMaxTotalConnections();
  }
  
  public SchemeRegistry getSchemeRegistry()
  {
    return this.schemeRegistry;
  }
  
  public void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = paramManagedClientConnection instanceof BasicPooledConnAdapter;
    Object localObject1 = "Connection class mismatch, connection not obtained from this manager";
    Args.check(bool1, (String)localObject1);
    paramManagedClientConnection = (BasicPooledConnAdapter)paramManagedClientConnection;
    Object localObject2 = paramManagedClientConnection.getPoolEntry();
    if (localObject2 != null)
    {
      localObject2 = paramManagedClientConnection.getManager();
      if (localObject2 != this) {
        break label82;
      }
      bool1 = true;
      localObject1 = "Connection not obtained from this manager";
      Asserts.check(bool1, (String)localObject1);
    }
    Object localObject5;
    label82:
    boolean bool2;
    for (;;)
    {
      try
      {
        localObject5 = paramManagedClientConnection.getPoolEntry();
        localObject5 = (BasicPoolEntry)localObject5;
        if (localObject5 == null)
        {
          return;
          bool1 = false;
          localObject2 = null;
          break;
        }
      }
      finally {}
      try
      {
        bool1 = paramManagedClientConnection.isOpen();
        if (bool1)
        {
          bool1 = paramManagedClientConnection.isMarkedReusable();
          if (!bool1) {
            paramManagedClientConnection.shutdown();
          }
        }
        bool2 = paramManagedClientConnection.isMarkedReusable();
        localObject2 = this.log;
        bool1 = ((Log)localObject2).isDebugEnabled();
        if (bool1)
        {
          if (!bool2) {
            break label201;
          }
          localObject2 = this.log;
          localObject1 = "Released connection is reusable.";
          ((Log)localObject2).debug(localObject1);
        }
        paramManagedClientConnection.detach();
        localObject1 = this.pool;
        ((ConnPoolByRoute)localObject1).freeEntry((BasicPoolEntry)localObject5, bool2, paramLong, paramTimeUnit);
      }
      catch (IOException localIOException)
      {
        Log localLog1;
        localObject1 = this.log;
        bool3 = ((Log)localObject1).isDebugEnabled();
        if (!bool3) {
          break label266;
        }
        localObject1 = this.log;
        str1 = "Exception shutting down released connection.";
        ((Log)localObject1).debug(str1, localIOException);
        bool2 = paramManagedClientConnection.isMarkedReusable();
        localLog2 = this.log;
        bool1 = localLog2.isDebugEnabled();
        if (!bool1) {
          break label316;
        }
        if (!bool2) {
          break label341;
        }
        localLog2 = this.log;
        localObject1 = "Released connection is reusable.";
        localLog2.debug(localObject1);
        for (;;)
        {
          paramManagedClientConnection.detach();
          localObject1 = this.pool;
          ((ConnPoolByRoute)localObject1).freeEntry((BasicPoolEntry)localObject5, bool2, paramLong, paramTimeUnit);
          break;
          localLog2 = this.log;
          localObject1 = "Released connection is not reusable.";
          localLog2.debug(localObject1);
        }
      }
      finally
      {
        bool2 = paramManagedClientConnection.isMarkedReusable();
        localObject1 = this.log;
        bool3 = ((Log)localObject1).isDebugEnabled();
        if (!bool3) {
          break label415;
        }
        if (!bool2) {
          break label440;
        }
        localObject1 = this.log;
        str2 = "Released connection is reusable.";
        ((Log)localObject1).debug(str2);
      }
      continue;
      label201:
      localLog1 = this.log;
      localObject1 = "Released connection is not reusable.";
      localLog1.debug(localObject1);
    }
    for (;;)
    {
      boolean bool3;
      String str1;
      label266:
      Log localLog2;
      label316:
      label341:
      label415:
      paramManagedClientConnection.detach();
      localObject1 = this.pool;
      ((ConnPoolByRoute)localObject1).freeEntry((BasicPoolEntry)localObject5, bool2, paramLong, paramTimeUnit);
      throw ((Throwable)localObject4);
      label440:
      localObject1 = this.log;
      String str2 = "Released connection is not reusable.";
      ((Log)localObject1).debug(str2);
    }
  }
  
  public ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject)
  {
    PoolEntryRequest localPoolEntryRequest = this.pool.requestPoolEntry(paramHttpRoute, paramObject);
    ThreadSafeClientConnManager.1 local1 = new org/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager$1;
    local1.<init>(this, localPoolEntryRequest, paramHttpRoute);
    return local1;
  }
  
  public void setDefaultMaxPerRoute(int paramInt)
  {
    this.connPerRoute.setDefaultMaxPerRoute(paramInt);
  }
  
  public void setMaxForRoute(HttpRoute paramHttpRoute, int paramInt)
  {
    this.connPerRoute.setMaxForRoute(paramHttpRoute, paramInt);
  }
  
  public void setMaxTotal(int paramInt)
  {
    this.pool.setMaxTotalConnections(paramInt);
  }
  
  public void shutdown()
  {
    this.log.debug("Shutting down");
    this.pool.shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\ThreadSafeClientConnManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */