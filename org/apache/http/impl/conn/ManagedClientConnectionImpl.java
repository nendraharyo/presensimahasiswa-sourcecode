package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

class ManagedClientConnectionImpl
  implements ManagedClientConnection
{
  private volatile long duration;
  private final ClientConnectionManager manager;
  private final ClientConnectionOperator operator;
  private volatile HttpPoolEntry poolEntry;
  private volatile boolean reusable;
  
  ManagedClientConnectionImpl(ClientConnectionManager paramClientConnectionManager, ClientConnectionOperator paramClientConnectionOperator, HttpPoolEntry paramHttpPoolEntry)
  {
    Args.notNull(paramClientConnectionManager, "Connection manager");
    Args.notNull(paramClientConnectionOperator, "Connection operator");
    Args.notNull(paramHttpPoolEntry, "HTTP pool entry");
    this.manager = paramClientConnectionManager;
    this.operator = paramClientConnectionOperator;
    this.poolEntry = paramHttpPoolEntry;
    this.reusable = false;
    this.duration = Long.MAX_VALUE;
  }
  
  private OperatedClientConnection ensureConnection()
  {
    Object localObject = this.poolEntry;
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/conn/ConnectionShutdownException;
      ((ConnectionShutdownException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (OperatedClientConnection)((HttpPoolEntry)localObject).getConnection();
  }
  
  private HttpPoolEntry ensurePoolEntry()
  {
    Object localObject = this.poolEntry;
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/conn/ConnectionShutdownException;
      ((ConnectionShutdownException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (HttpPoolEntry)localObject;
  }
  
  private OperatedClientConnection getConnection()
  {
    Object localObject = this.poolEntry;
    if (localObject == null) {}
    for (localObject = null;; localObject = (OperatedClientConnection)((HttpPoolEntry)localObject).getConnection()) {
      return (OperatedClientConnection)localObject;
    }
  }
  
  /* Error */
  public void abortConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	org/apache/http/impl/conn/ManagedClientConnectionImpl:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aconst_null
    //   15: astore_1
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 40	org/apache/http/impl/conn/ManagedClientConnectionImpl:reusable	Z
    //   21: aload_0
    //   22: getfield 38	org/apache/http/impl/conn/ManagedClientConnectionImpl:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 53	org/apache/http/impl/conn/HttpPoolEntry:getConnection	()Ljava/lang/Object;
    //   30: astore_1
    //   31: aload_1
    //   32: checkcast 55	org/apache/http/conn/OperatedClientConnection
    //   35: astore_1
    //   36: aload_1
    //   37: invokeinterface 58 1 0
    //   42: aload_0
    //   43: getfield 34	org/apache/http/impl/conn/ManagedClientConnectionImpl:manager	Lorg/apache/http/conn/ClientConnectionManager;
    //   46: astore_1
    //   47: aload_0
    //   48: getfield 44	org/apache/http/impl/conn/ManagedClientConnectionImpl:duration	J
    //   51: lstore_2
    //   52: getstatic 64	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   55: astore 4
    //   57: aload_1
    //   58: aload_0
    //   59: lload_2
    //   60: aload 4
    //   62: invokeinterface 70 5 0
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_0
    //   70: aconst_null
    //   71: putfield 38	org/apache/http/impl/conn/ManagedClientConnectionImpl:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   74: aload_0
    //   75: monitorexit
    //   76: goto -63 -> 13
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -43 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	ManagedClientConnectionImpl
    //   6	63	1	localObject1	Object
    //   79	4	1	localObject2	Object
    //   84	1	1	localIOException	java.io.IOException
    //   51	9	2	l	long
    //   55	6	4	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	79	finally
    //   11	13	79	finally
    //   17	21	79	finally
    //   21	25	79	finally
    //   26	30	79	finally
    //   31	35	79	finally
    //   36	42	79	finally
    //   42	46	79	finally
    //   47	51	79	finally
    //   52	55	79	finally
    //   60	67	79	finally
    //   70	74	79	finally
    //   74	76	79	finally
    //   80	82	79	finally
    //   36	42	84	java/io/IOException
  }
  
  public void bind(Socket paramSocket)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void close()
  {
    Object localObject = this.poolEntry;
    if (localObject != null)
    {
      OperatedClientConnection localOperatedClientConnection = (OperatedClientConnection)((HttpPoolEntry)localObject).getConnection();
      localObject = ((HttpPoolEntry)localObject).getTracker();
      ((RouteTracker)localObject).reset();
      localOperatedClientConnection.close();
    }
  }
  
  HttpPoolEntry detach()
  {
    HttpPoolEntry localHttpPoolEntry = this.poolEntry;
    this.poolEntry = null;
    return localHttpPoolEntry;
  }
  
  public void flush()
  {
    ensureConnection().flush();
  }
  
  public Object getAttribute(String paramString)
  {
    Object localObject = ensureConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).getAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  public String getId()
  {
    return null;
  }
  
  public InetAddress getLocalAddress()
  {
    return ensureConnection().getLocalAddress();
  }
  
  public int getLocalPort()
  {
    return ensureConnection().getLocalPort();
  }
  
  public ClientConnectionManager getManager()
  {
    return this.manager;
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return ensureConnection().getMetrics();
  }
  
  HttpPoolEntry getPoolEntry()
  {
    return this.poolEntry;
  }
  
  public InetAddress getRemoteAddress()
  {
    return ensureConnection().getRemoteAddress();
  }
  
  public int getRemotePort()
  {
    return ensureConnection().getRemotePort();
  }
  
  public HttpRoute getRoute()
  {
    return ensurePoolEntry().getEffectiveRoute();
  }
  
  public SSLSession getSSLSession()
  {
    Object localObject = ensureConnection().getSocket();
    boolean bool = localObject instanceof SSLSocket;
    if (bool) {}
    for (localObject = ((SSLSocket)localObject).getSession();; localObject = null) {
      return (SSLSession)localObject;
    }
  }
  
  public Socket getSocket()
  {
    return ensureConnection().getSocket();
  }
  
  public int getSocketTimeout()
  {
    return ensureConnection().getSocketTimeout();
  }
  
  public Object getState()
  {
    return ensurePoolEntry().getState();
  }
  
  public boolean isMarkedReusable()
  {
    return this.reusable;
  }
  
  public boolean isOpen()
  {
    OperatedClientConnection localOperatedClientConnection = getConnection();
    boolean bool;
    if (localOperatedClientConnection != null) {
      bool = localOperatedClientConnection.isOpen();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOperatedClientConnection = null;
    }
  }
  
  public boolean isResponseAvailable(int paramInt)
  {
    return ensureConnection().isResponseAvailable(paramInt);
  }
  
  public boolean isSecure()
  {
    return ensureConnection().isSecure();
  }
  
  public boolean isStale()
  {
    OperatedClientConnection localOperatedClientConnection = getConnection();
    if (localOperatedClientConnection != null) {}
    for (boolean bool = localOperatedClientConnection.isStale();; bool = true) {
      return bool;
    }
  }
  
  public void layerProtocol(HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    try
    {
      localObject1 = this.poolEntry;
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/conn/ConnectionShutdownException;
        ((ConnectionShutdownException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.poolEntry;
    Object localObject6 = ((HttpPoolEntry)localObject3).getTracker();
    localObject3 = "Route tracker";
    Asserts.notNull(localObject6, (String)localObject3);
    boolean bool = ((RouteTracker)localObject6).isConnected();
    Object localObject7 = "Connection not open";
    Asserts.check(bool, (String)localObject7);
    bool = ((RouteTracker)localObject6).isTunnelled();
    localObject7 = "Protocol layering without a tunnel not supported";
    Asserts.check(bool, (String)localObject7);
    bool = ((RouteTracker)localObject6).isLayered();
    if (!bool) {
      bool = true;
    }
    Object localObject5;
    for (;;)
    {
      localObject7 = "Multiple protocol layering not supported";
      Asserts.check(bool, (String)localObject7);
      localObject6 = ((RouteTracker)localObject6).getTargetHost();
      localObject3 = this.poolEntry;
      localObject3 = ((HttpPoolEntry)localObject3).getConnection();
      localObject3 = (OperatedClientConnection)localObject3;
      localObject7 = this.operator;
      ((ClientConnectionOperator)localObject7).updateSecureConnection((OperatedClientConnection)localObject3, (HttpHost)localObject6, paramHttpContext, paramHttpParams);
      try
      {
        localObject6 = this.poolEntry;
        if (localObject6 != null) {
          break;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool = false;
      localObject5 = null;
    }
    localObject6 = this.poolEntry;
    localObject6 = ((HttpPoolEntry)localObject6).getTracker();
    bool = ((OperatedClientConnection)localObject5).isSecure();
    ((RouteTracker)localObject6).layerProtocol(bool);
  }
  
  public void markReusable()
  {
    this.reusable = true;
  }
  
  public void open(HttpRoute paramHttpRoute, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpRoute, "Route");
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    try
    {
      localObject1 = this.poolEntry;
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/conn/ConnectionShutdownException;
        ((ConnectionShutdownException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.poolEntry;
    localObject3 = ((HttpPoolEntry)localObject3).getTracker();
    Object localObject6 = "Route tracker";
    Asserts.notNull(localObject3, (String)localObject6);
    boolean bool1 = ((RouteTracker)localObject3).isConnected();
    HttpHost localHttpHost1;
    if (!bool1)
    {
      bool1 = true;
      localObject6 = "Connection already open";
      Asserts.check(bool1, (String)localObject6);
      localObject3 = this.poolEntry;
      localObject6 = ((HttpPoolEntry)localObject3).getConnection();
      localObject6 = (OperatedClientConnection)localObject6;
      localHttpHost1 = paramHttpRoute.getProxyHost();
      localObject3 = this.operator;
      if (localHttpHost1 == null) {
        break label207;
      }
    }
    label207:
    for (HttpHost localHttpHost2 = localHttpHost1;; localHttpHost2 = paramHttpRoute.getTargetHost())
    {
      InetAddress localInetAddress = paramHttpRoute.getLocalAddress();
      ((ClientConnectionOperator)localObject3).openConnection((OperatedClientConnection)localObject6, localHttpHost2, localInetAddress, paramHttpContext, paramHttpParams);
      try
      {
        localObject3 = this.poolEntry;
        if (localObject3 != null) {
          break label216;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool1 = false;
      localObject5 = null;
      break;
    }
    label216:
    Object localObject5 = this.poolEntry;
    localObject5 = ((HttpPoolEntry)localObject5).getTracker();
    boolean bool2;
    if (localHttpHost1 == null)
    {
      bool2 = ((OperatedClientConnection)localObject6).isSecure();
      ((RouteTracker)localObject5).connectTarget(bool2);
    }
    for (;;)
    {
      return;
      bool2 = ((OperatedClientConnection)localObject6).isSecure();
      ((RouteTracker)localObject5).connectProxy(localHttpHost1, bool2);
    }
  }
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    ensureConnection().receiveResponseEntity(paramHttpResponse);
  }
  
  public HttpResponse receiveResponseHeader()
  {
    return ensureConnection().receiveResponseHeader();
  }
  
  /* Error */
  public void releaseConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	org/apache/http/impl/conn/ManagedClientConnectionImpl:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 34	org/apache/http/impl/conn/ManagedClientConnectionImpl:manager	Lorg/apache/http/conn/ClientConnectionManager;
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 44	org/apache/http/impl/conn/ManagedClientConnectionImpl:duration	J
    //   23: lstore_2
    //   24: getstatic 64	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   27: astore 4
    //   29: aload_1
    //   30: aload_0
    //   31: lload_2
    //   32: aload 4
    //   34: invokeinterface 70 5 0
    //   39: aconst_null
    //   40: astore_1
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield 38	org/apache/http/impl/conn/ManagedClientConnectionImpl:poolEntry	Lorg/apache/http/impl/conn/HttpPoolEntry;
    //   46: aload_0
    //   47: monitorexit
    //   48: goto -35 -> 13
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	ManagedClientConnectionImpl
    //   6	35	1	localObject1	Object
    //   51	4	1	localObject2	Object
    //   23	9	2	l	long
    //   27	6	4	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	51	finally
    //   11	13	51	finally
    //   14	18	51	finally
    //   19	23	51	finally
    //   24	27	51	finally
    //   32	39	51	finally
    //   42	46	51	finally
    //   46	48	51	finally
    //   52	54	51	finally
  }
  
  public Object removeAttribute(String paramString)
  {
    Object localObject = ensureConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).removeAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    ensureConnection().sendRequestEntity(paramHttpEntityEnclosingRequest);
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    ensureConnection().sendRequestHeader(paramHttpRequest);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    Object localObject = ensureConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool)
    {
      localObject = (HttpContext)localObject;
      ((HttpContext)localObject).setAttribute(paramString, paramObject);
    }
  }
  
  public void setIdleDuration(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      l = paramTimeUnit.toMillis(paramLong);
    }
    for (this.duration = l;; this.duration = l)
    {
      return;
      l = -1;
    }
  }
  
  public void setSocketTimeout(int paramInt)
  {
    ensureConnection().setSocketTimeout(paramInt);
  }
  
  public void setState(Object paramObject)
  {
    ensurePoolEntry().setState(paramObject);
  }
  
  public void shutdown()
  {
    Object localObject = this.poolEntry;
    if (localObject != null)
    {
      OperatedClientConnection localOperatedClientConnection = (OperatedClientConnection)((HttpPoolEntry)localObject).getConnection();
      localObject = ((HttpPoolEntry)localObject).getTracker();
      ((RouteTracker)localObject).reset();
      localOperatedClientConnection.shutdown();
    }
  }
  
  public void tunnelProxy(HttpHost paramHttpHost, boolean paramBoolean, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpHost, "Next proxy");
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    try
    {
      localObject1 = this.poolEntry;
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/conn/ConnectionShutdownException;
        ((ConnectionShutdownException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.poolEntry;
    localObject3 = ((HttpPoolEntry)localObject3).getTracker();
    String str = "Route tracker";
    Asserts.notNull(localObject3, str);
    boolean bool = ((RouteTracker)localObject3).isConnected();
    str = "Connection not open";
    Asserts.check(bool, str);
    localObject3 = this.poolEntry;
    localObject3 = ((HttpPoolEntry)localObject3).getConnection();
    localObject3 = (OperatedClientConnection)localObject3;
    str = null;
    ((OperatedClientConnection)localObject3).update(null, paramHttpHost, paramBoolean, paramHttpParams);
    try
    {
      localObject3 = this.poolEntry;
      if (localObject3 == null)
      {
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
    }
    finally {}
    Object localObject5 = this.poolEntry;
    localObject5 = ((HttpPoolEntry)localObject5).getTracker();
    ((RouteTracker)localObject5).tunnelProxy(paramHttpHost, paramBoolean);
  }
  
  public void tunnelTarget(boolean paramBoolean, HttpParams paramHttpParams)
  {
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    try
    {
      localObject1 = this.poolEntry;
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/impl/conn/ConnectionShutdownException;
        ((ConnectionShutdownException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.poolEntry;
    Object localObject6 = ((HttpPoolEntry)localObject3).getTracker();
    localObject3 = "Route tracker";
    Asserts.notNull(localObject6, (String)localObject3);
    boolean bool = ((RouteTracker)localObject6).isConnected();
    String str = "Connection not open";
    Asserts.check(bool, str);
    bool = ((RouteTracker)localObject6).isTunnelled();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      str = "Connection is already tunnelled";
      Asserts.check(bool, str);
      localObject6 = ((RouteTracker)localObject6).getTargetHost();
      localObject3 = this.poolEntry;
      localObject3 = ((HttpPoolEntry)localObject3).getConnection();
      localObject3 = (OperatedClientConnection)localObject3;
      str = null;
      ((OperatedClientConnection)localObject3).update(null, (HttpHost)localObject6, paramBoolean, paramHttpParams);
      try
      {
        localObject3 = this.poolEntry;
        if (localObject3 != null) {
          break;
        }
        localObject3 = new java/io/InterruptedIOException;
        ((InterruptedIOException)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
      finally {}
      bool = false;
      localObject5 = null;
    }
    Object localObject5 = this.poolEntry;
    localObject5 = ((HttpPoolEntry)localObject5).getTracker();
    ((RouteTracker)localObject5).tunnelTarget(paramBoolean);
  }
  
  public void unmarkReusable()
  {
    this.reusable = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\ManagedClientConnectionImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */