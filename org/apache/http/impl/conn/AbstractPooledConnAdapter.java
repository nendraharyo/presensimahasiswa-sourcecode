package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractPooledConnAdapter
  extends AbstractClientConnAdapter
{
  protected volatile AbstractPoolEntry poolEntry;
  
  protected AbstractPooledConnAdapter(ClientConnectionManager paramClientConnectionManager, AbstractPoolEntry paramAbstractPoolEntry)
  {
    super(paramClientConnectionManager, localOperatedClientConnection);
    this.poolEntry = paramAbstractPoolEntry;
  }
  
  protected final void assertAttached()
  {
    Object localObject = this.poolEntry;
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/conn/ConnectionShutdownException;
      ((ConnectionShutdownException)localObject).<init>();
      throw ((Throwable)localObject);
    }
  }
  
  protected void assertValid(AbstractPoolEntry paramAbstractPoolEntry)
  {
    boolean bool = isReleased();
    if ((bool) || (paramAbstractPoolEntry == null))
    {
      ConnectionShutdownException localConnectionShutdownException = new org/apache/http/impl/conn/ConnectionShutdownException;
      localConnectionShutdownException.<init>();
      throw localConnectionShutdownException;
    }
  }
  
  public void close()
  {
    Object localObject = getPoolEntry();
    if (localObject != null) {
      ((AbstractPoolEntry)localObject).shutdownEntry();
    }
    localObject = getWrappedConnection();
    if (localObject != null) {
      ((OperatedClientConnection)localObject).close();
    }
  }
  
  protected void detach()
  {
    Object localObject1 = null;
    try
    {
      this.poolEntry = null;
      super.detach();
      return;
    }
    finally {}
  }
  
  public String getId()
  {
    return null;
  }
  
  protected AbstractPoolEntry getPoolEntry()
  {
    return this.poolEntry;
  }
  
  public HttpRoute getRoute()
  {
    Object localObject = getPoolEntry();
    assertValid((AbstractPoolEntry)localObject);
    RouteTracker localRouteTracker = ((AbstractPoolEntry)localObject).tracker;
    if (localRouteTracker == null) {}
    for (localObject = null;; localObject = ((AbstractPoolEntry)localObject).tracker.toRoute()) {
      return (HttpRoute)localObject;
    }
  }
  
  public Object getState()
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    return localAbstractPoolEntry.getState();
  }
  
  public void layerProtocol(HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    localAbstractPoolEntry.layerProtocol(paramHttpContext, paramHttpParams);
  }
  
  public void open(HttpRoute paramHttpRoute, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    localAbstractPoolEntry.open(paramHttpRoute, paramHttpContext, paramHttpParams);
  }
  
  public void setState(Object paramObject)
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    localAbstractPoolEntry.setState(paramObject);
  }
  
  public void shutdown()
  {
    Object localObject = getPoolEntry();
    if (localObject != null) {
      ((AbstractPoolEntry)localObject).shutdownEntry();
    }
    localObject = getWrappedConnection();
    if (localObject != null) {
      ((OperatedClientConnection)localObject).shutdown();
    }
  }
  
  public void tunnelProxy(HttpHost paramHttpHost, boolean paramBoolean, HttpParams paramHttpParams)
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    localAbstractPoolEntry.tunnelProxy(paramHttpHost, paramBoolean, paramHttpParams);
  }
  
  public void tunnelTarget(boolean paramBoolean, HttpParams paramHttpParams)
  {
    AbstractPoolEntry localAbstractPoolEntry = getPoolEntry();
    assertValid(localAbstractPoolEntry);
    localAbstractPoolEntry.tunnelTarget(paramBoolean, paramHttpParams);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\AbstractPooledConnAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */