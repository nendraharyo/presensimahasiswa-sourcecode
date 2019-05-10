package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public abstract class AbstractPoolEntry
{
  protected final ClientConnectionOperator connOperator;
  protected final OperatedClientConnection connection;
  protected volatile HttpRoute route;
  protected volatile Object state;
  protected volatile RouteTracker tracker;
  
  protected AbstractPoolEntry(ClientConnectionOperator paramClientConnectionOperator, HttpRoute paramHttpRoute)
  {
    Args.notNull(paramClientConnectionOperator, "Connection operator");
    this.connOperator = paramClientConnectionOperator;
    OperatedClientConnection localOperatedClientConnection = paramClientConnectionOperator.createConnection();
    this.connection = localOperatedClientConnection;
    this.route = paramHttpRoute;
    this.tracker = null;
  }
  
  public Object getState()
  {
    return this.state;
  }
  
  public void layerProtocol(HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    Asserts.notNull(this.tracker, "Route tracker");
    Asserts.check(this.tracker.isConnected(), "Connection not open");
    boolean bool1 = this.tracker.isTunnelled();
    Object localObject1 = "Protocol layering without a tunnel not supported";
    Asserts.check(bool1, (String)localObject1);
    Object localObject2 = this.tracker;
    bool1 = ((RouteTracker)localObject2).isLayered();
    if (!bool1) {
      bool1 = true;
    }
    for (;;)
    {
      Asserts.check(bool1, "Multiple protocol layering not supported");
      localObject2 = this.tracker.getTargetHost();
      localObject1 = this.connOperator;
      OperatedClientConnection localOperatedClientConnection = this.connection;
      ((ClientConnectionOperator)localObject1).updateSecureConnection(localOperatedClientConnection, (HttpHost)localObject2, paramHttpContext, paramHttpParams);
      localObject2 = this.tracker;
      boolean bool2 = this.connection.isSecure();
      ((RouteTracker)localObject2).layerProtocol(bool2);
      return;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public void open(HttpRoute paramHttpRoute, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpRoute, "Route");
    Args.notNull(paramHttpParams, "HTTP parameters");
    Object localObject1 = this.tracker;
    boolean bool1;
    Object localObject2;
    HttpHost localHttpHost1;
    if (localObject1 != null)
    {
      localObject1 = this.tracker;
      bool1 = ((RouteTracker)localObject1).isConnected();
      if (!bool1)
      {
        bool1 = true;
        localObject2 = "Connection already open";
        Asserts.check(bool1, (String)localObject2);
      }
    }
    else
    {
      localObject1 = new org/apache/http/conn/routing/RouteTracker;
      ((RouteTracker)localObject1).<init>(paramHttpRoute);
      this.tracker = ((RouteTracker)localObject1);
      localHttpHost1 = paramHttpRoute.getProxyHost();
      localObject1 = this.connOperator;
      localObject2 = this.connection;
      if (localHttpHost1 == null) {
        break label157;
      }
    }
    label157:
    for (HttpHost localHttpHost2 = localHttpHost1;; localHttpHost2 = paramHttpRoute.getTargetHost())
    {
      InetAddress localInetAddress = paramHttpRoute.getLocalAddress();
      ((ClientConnectionOperator)localObject1).openConnection((OperatedClientConnection)localObject2, localHttpHost2, localInetAddress, paramHttpContext, paramHttpParams);
      localObject1 = this.tracker;
      if (localObject1 != null) {
        break label166;
      }
      localObject1 = new java/io/InterruptedIOException;
      ((InterruptedIOException)localObject1).<init>("Request aborted");
      throw ((Throwable)localObject1);
      bool1 = false;
      localObject1 = null;
      break;
    }
    label166:
    boolean bool2;
    if (localHttpHost1 == null)
    {
      localObject2 = this.connection;
      bool2 = ((OperatedClientConnection)localObject2).isSecure();
      ((RouteTracker)localObject1).connectTarget(bool2);
    }
    for (;;)
    {
      return;
      localObject2 = this.connection;
      bool2 = ((OperatedClientConnection)localObject2).isSecure();
      ((RouteTracker)localObject1).connectProxy(localHttpHost1, bool2);
    }
  }
  
  public void setState(Object paramObject)
  {
    this.state = paramObject;
  }
  
  protected void shutdownEntry()
  {
    this.tracker = null;
    this.state = null;
  }
  
  public void tunnelProxy(HttpHost paramHttpHost, boolean paramBoolean, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpHost, "Next proxy");
    Args.notNull(paramHttpParams, "Parameters");
    Asserts.notNull(this.tracker, "Route tracker");
    Asserts.check(this.tracker.isConnected(), "Connection not open");
    this.connection.update(null, paramHttpHost, paramBoolean, paramHttpParams);
    this.tracker.tunnelProxy(paramHttpHost, paramBoolean);
  }
  
  public void tunnelTarget(boolean paramBoolean, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    Asserts.notNull(this.tracker, "Route tracker");
    boolean bool = this.tracker.isConnected();
    String str = "Connection not open";
    Asserts.check(bool, str);
    Object localObject = this.tracker;
    bool = ((RouteTracker)localObject).isTunnelled();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      Asserts.check(bool, "Connection is already tunnelled");
      localObject = this.connection;
      HttpHost localHttpHost = this.tracker.getTargetHost();
      ((OperatedClientConnection)localObject).update(null, localHttpHost, paramBoolean, paramHttpParams);
      this.tracker.tunnelTarget(paramBoolean);
      return;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\AbstractPoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */