package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractClientConnAdapter
  implements ManagedClientConnection, HttpContext
{
  private final ClientConnectionManager connManager;
  private volatile long duration;
  private volatile boolean markedReusable;
  private volatile boolean released;
  private volatile OperatedClientConnection wrappedConnection;
  
  protected AbstractClientConnAdapter(ClientConnectionManager paramClientConnectionManager, OperatedClientConnection paramOperatedClientConnection)
  {
    this.connManager = paramClientConnectionManager;
    this.wrappedConnection = paramOperatedClientConnection;
    this.markedReusable = false;
    this.released = false;
    this.duration = Long.MAX_VALUE;
  }
  
  /* Error */
  public void abortConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	org/apache/http/impl/conn/AbstractClientConnAdapter:released	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 29	org/apache/http/impl/conn/AbstractClientConnAdapter:released	Z
    //   21: aload_0
    //   22: invokevirtual 37	org/apache/http/impl/conn/AbstractClientConnAdapter:unmarkReusable	()V
    //   25: aload_0
    //   26: invokevirtual 40	org/apache/http/impl/conn/AbstractClientConnAdapter:shutdown	()V
    //   29: aload_0
    //   30: getfield 23	org/apache/http/impl/conn/AbstractClientConnAdapter:connManager	Lorg/apache/http/conn/ClientConnectionManager;
    //   33: astore_2
    //   34: aload_0
    //   35: getfield 33	org/apache/http/impl/conn/AbstractClientConnAdapter:duration	J
    //   38: lstore_3
    //   39: getstatic 46	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   42: astore 5
    //   44: aload_2
    //   45: aload_0
    //   46: lload_3
    //   47: aload 5
    //   49: invokeinterface 52 5 0
    //   54: goto -43 -> 11
    //   57: astore_2
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_2
    //   61: athrow
    //   62: astore_2
    //   63: goto -34 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	AbstractClientConnAdapter
    //   6	12	1	bool	boolean
    //   33	12	2	localClientConnectionManager	ClientConnectionManager
    //   57	4	2	localObject	Object
    //   62	1	2	localIOException	java.io.IOException
    //   38	9	3	l	long
    //   42	6	5	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	57	finally
    //   17	21	57	finally
    //   21	25	57	finally
    //   25	29	57	finally
    //   29	33	57	finally
    //   34	38	57	finally
    //   39	42	57	finally
    //   47	54	57	finally
    //   25	29	62	java/io/IOException
  }
  
  protected final void assertNotAborted()
  {
    boolean bool = isReleased();
    if (bool)
    {
      InterruptedIOException localInterruptedIOException = new java/io/InterruptedIOException;
      localInterruptedIOException.<init>("Connection has been shut down");
      throw localInterruptedIOException;
    }
  }
  
  protected final void assertValid(OperatedClientConnection paramOperatedClientConnection)
  {
    boolean bool = isReleased();
    if ((bool) || (paramOperatedClientConnection == null))
    {
      ConnectionShutdownException localConnectionShutdownException = new org/apache/http/impl/conn/ConnectionShutdownException;
      localConnectionShutdownException.<init>();
      throw localConnectionShutdownException;
    }
  }
  
  public void bind(Socket paramSocket)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  protected void detach()
  {
    Object localObject1 = null;
    try
    {
      this.wrappedConnection = null;
      long l = Long.MAX_VALUE;
      this.duration = l;
      return;
    }
    finally {}
  }
  
  public void flush()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    localOperatedClientConnection.flush();
  }
  
  public Object getAttribute(String paramString)
  {
    Object localObject = getWrappedConnection();
    assertValid((OperatedClientConnection)localObject);
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).getAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  public InetAddress getLocalAddress()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getLocalAddress();
  }
  
  public int getLocalPort()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getLocalPort();
  }
  
  protected ClientConnectionManager getManager()
  {
    return this.connManager;
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getMetrics();
  }
  
  public InetAddress getRemoteAddress()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getRemoteAddress();
  }
  
  public int getRemotePort()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getRemotePort();
  }
  
  public SSLSession getSSLSession()
  {
    Object localObject1 = null;
    Object localObject2 = getWrappedConnection();
    assertValid((OperatedClientConnection)localObject2);
    boolean bool = isOpen();
    if (!bool) {
      return (SSLSession)localObject1;
    }
    localObject2 = ((OperatedClientConnection)localObject2).getSocket();
    bool = localObject2 instanceof SSLSocket;
    if (bool) {}
    for (localObject2 = ((SSLSocket)localObject2).getSession();; localObject2 = null)
    {
      localObject1 = localObject2;
      break;
    }
  }
  
  public Socket getSocket()
  {
    Object localObject = getWrappedConnection();
    assertValid((OperatedClientConnection)localObject);
    boolean bool = isOpen();
    if (!bool) {}
    for (localObject = null;; localObject = ((OperatedClientConnection)localObject).getSocket()) {
      return (Socket)localObject;
    }
  }
  
  public int getSocketTimeout()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.getSocketTimeout();
  }
  
  protected OperatedClientConnection getWrappedConnection()
  {
    return this.wrappedConnection;
  }
  
  public boolean isMarkedReusable()
  {
    return this.markedReusable;
  }
  
  public boolean isOpen()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    boolean bool;
    if (localOperatedClientConnection == null)
    {
      bool = false;
      localOperatedClientConnection = null;
    }
    for (;;)
    {
      return bool;
      bool = localOperatedClientConnection.isOpen();
    }
  }
  
  protected boolean isReleased()
  {
    return this.released;
  }
  
  public boolean isResponseAvailable(int paramInt)
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.isResponseAvailable(paramInt);
  }
  
  public boolean isSecure()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    return localOperatedClientConnection.isSecure();
  }
  
  public boolean isStale()
  {
    boolean bool1 = true;
    boolean bool2 = isReleased();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
      if (localOperatedClientConnection != null) {
        bool1 = localOperatedClientConnection.isStale();
      }
    }
  }
  
  public void markReusable()
  {
    this.markedReusable = true;
  }
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    unmarkReusable();
    localOperatedClientConnection.receiveResponseEntity(paramHttpResponse);
  }
  
  public HttpResponse receiveResponseHeader()
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    unmarkReusable();
    return localOperatedClientConnection.receiveResponseHeader();
  }
  
  /* Error */
  public void releaseConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	org/apache/http/impl/conn/AbstractClientConnAdapter:released	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_1
    //   15: istore_1
    //   16: aload_0
    //   17: iload_1
    //   18: putfield 29	org/apache/http/impl/conn/AbstractClientConnAdapter:released	Z
    //   21: aload_0
    //   22: getfield 23	org/apache/http/impl/conn/AbstractClientConnAdapter:connManager	Lorg/apache/http/conn/ClientConnectionManager;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 33	org/apache/http/impl/conn/AbstractClientConnAdapter:duration	J
    //   30: lstore_3
    //   31: getstatic 46	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   34: astore 5
    //   36: aload_2
    //   37: aload_0
    //   38: lload_3
    //   39: aload 5
    //   41: invokeinterface 52 5 0
    //   46: goto -35 -> 11
    //   49: astore_2
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_2
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	AbstractClientConnAdapter
    //   6	12	1	bool	boolean
    //   25	12	2	localClientConnectionManager	ClientConnectionManager
    //   49	4	2	localObject	Object
    //   30	9	3	l	long
    //   34	6	5	localTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	6	49	finally
    //   17	21	49	finally
    //   21	25	49	finally
    //   26	30	49	finally
    //   31	34	49	finally
    //   39	46	49	finally
  }
  
  public Object removeAttribute(String paramString)
  {
    Object localObject = getWrappedConnection();
    assertValid((OperatedClientConnection)localObject);
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).removeAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    unmarkReusable();
    localOperatedClientConnection.sendRequestEntity(paramHttpEntityEnclosingRequest);
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    unmarkReusable();
    localOperatedClientConnection.sendRequestHeader(paramHttpRequest);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    Object localObject = getWrappedConnection();
    assertValid((OperatedClientConnection)localObject);
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
    OperatedClientConnection localOperatedClientConnection = getWrappedConnection();
    assertValid(localOperatedClientConnection);
    localOperatedClientConnection.setSocketTimeout(paramInt);
  }
  
  public void unmarkReusable()
  {
    this.markedReusable = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\AbstractClientConnAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */