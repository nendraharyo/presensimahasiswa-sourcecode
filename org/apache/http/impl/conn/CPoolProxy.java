package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;

class CPoolProxy
  implements ManagedHttpClientConnection, HttpContext
{
  private volatile CPoolEntry poolEntry;
  
  CPoolProxy(CPoolEntry paramCPoolEntry)
  {
    this.poolEntry = paramCPoolEntry;
  }
  
  public static CPoolEntry detach(HttpClientConnection paramHttpClientConnection)
  {
    return getProxy(paramHttpClientConnection).detach();
  }
  
  public static CPoolEntry getPoolEntry(HttpClientConnection paramHttpClientConnection)
  {
    Object localObject = getProxy(paramHttpClientConnection).getPoolEntry();
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/conn/ConnectionShutdownException;
      ((ConnectionShutdownException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (CPoolEntry)localObject;
  }
  
  private static CPoolProxy getProxy(HttpClientConnection paramHttpClientConnection)
  {
    Object localObject1 = CPoolProxy.class;
    boolean bool = ((Class)localObject1).isInstance(paramHttpClientConnection);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unexpected connection proxy class: ");
      Class localClass = paramHttpClientConnection.getClass();
      localObject2 = localClass;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (CPoolProxy)CPoolProxy.class.cast(paramHttpClientConnection);
  }
  
  public static HttpClientConnection newProxy(CPoolEntry paramCPoolEntry)
  {
    CPoolProxy localCPoolProxy = new org/apache/http/impl/conn/CPoolProxy;
    localCPoolProxy.<init>(paramCPoolEntry);
    return localCPoolProxy;
  }
  
  public void bind(Socket paramSocket)
  {
    getValidConnection().bind(paramSocket);
  }
  
  public void close()
  {
    CPoolEntry localCPoolEntry = this.poolEntry;
    if (localCPoolEntry != null) {
      localCPoolEntry.closeConnection();
    }
  }
  
  CPoolEntry detach()
  {
    CPoolEntry localCPoolEntry = this.poolEntry;
    this.poolEntry = null;
    return localCPoolEntry;
  }
  
  public void flush()
  {
    getValidConnection().flush();
  }
  
  public Object getAttribute(String paramString)
  {
    Object localObject = getValidConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).getAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  ManagedHttpClientConnection getConnection()
  {
    Object localObject = this.poolEntry;
    if (localObject == null) {}
    for (localObject = null;; localObject = (ManagedHttpClientConnection)((CPoolEntry)localObject).getConnection()) {
      return (ManagedHttpClientConnection)localObject;
    }
  }
  
  public String getId()
  {
    return getValidConnection().getId();
  }
  
  public InetAddress getLocalAddress()
  {
    return getValidConnection().getLocalAddress();
  }
  
  public int getLocalPort()
  {
    return getValidConnection().getLocalPort();
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return getValidConnection().getMetrics();
  }
  
  CPoolEntry getPoolEntry()
  {
    return this.poolEntry;
  }
  
  public InetAddress getRemoteAddress()
  {
    return getValidConnection().getRemoteAddress();
  }
  
  public int getRemotePort()
  {
    return getValidConnection().getRemotePort();
  }
  
  public SSLSession getSSLSession()
  {
    return getValidConnection().getSSLSession();
  }
  
  public Socket getSocket()
  {
    return getValidConnection().getSocket();
  }
  
  public int getSocketTimeout()
  {
    return getValidConnection().getSocketTimeout();
  }
  
  ManagedHttpClientConnection getValidConnection()
  {
    Object localObject = getConnection();
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/conn/ConnectionShutdownException;
      ((ConnectionShutdownException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (ManagedHttpClientConnection)localObject;
  }
  
  public boolean isOpen()
  {
    boolean bool1 = false;
    CPoolEntry localCPoolEntry = this.poolEntry;
    if (localCPoolEntry != null)
    {
      boolean bool2 = localCPoolEntry.isClosed();
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public boolean isResponseAvailable(int paramInt)
  {
    return getValidConnection().isResponseAvailable(paramInt);
  }
  
  public boolean isStale()
  {
    ManagedHttpClientConnection localManagedHttpClientConnection = getConnection();
    if (localManagedHttpClientConnection != null) {}
    for (boolean bool = localManagedHttpClientConnection.isStale();; bool = true) {
      return bool;
    }
  }
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    getValidConnection().receiveResponseEntity(paramHttpResponse);
  }
  
  public HttpResponse receiveResponseHeader()
  {
    return getValidConnection().receiveResponseHeader();
  }
  
  public Object removeAttribute(String paramString)
  {
    Object localObject = getValidConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool) {}
    for (localObject = ((HttpContext)localObject).removeAttribute(paramString);; localObject = null) {
      return localObject;
    }
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    getValidConnection().sendRequestEntity(paramHttpEntityEnclosingRequest);
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    getValidConnection().sendRequestHeader(paramHttpRequest);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    Object localObject = getValidConnection();
    boolean bool = localObject instanceof HttpContext;
    if (bool)
    {
      localObject = (HttpContext)localObject;
      ((HttpContext)localObject).setAttribute(paramString, paramObject);
    }
  }
  
  public void setSocketTimeout(int paramInt)
  {
    getValidConnection().setSocketTimeout(paramInt);
  }
  
  public void shutdown()
  {
    CPoolEntry localCPoolEntry = this.poolEntry;
    if (localCPoolEntry != null) {
      localCPoolEntry.shutdownConnection();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("CPoolProxy{");
    Object localObject = getConnection();
    if (localObject != null) {
      localStringBuilder.append(localObject);
    }
    for (;;)
    {
      localStringBuilder.append('}');
      return localStringBuilder.toString();
      localObject = "detached";
      localStringBuilder.append((String)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\CPoolProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */