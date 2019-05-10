package org.apache.http.impl;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class SocketHttpServerConnection
  extends AbstractHttpServerConnection
  implements HttpInetConnection
{
  private volatile boolean open;
  private volatile Socket socket = null;
  
  private static void formatAddress(StringBuilder paramStringBuilder, SocketAddress paramSocketAddress)
  {
    boolean bool = paramSocketAddress instanceof InetSocketAddress;
    Object localObject;
    if (bool)
    {
      paramSocketAddress = (InetSocketAddress)paramSocketAddress;
      localObject = paramSocketAddress.getAddress();
      if (localObject != null)
      {
        localObject = paramSocketAddress.getAddress().getHostAddress();
        localObject = paramStringBuilder.append(localObject).append(':');
        int i = paramSocketAddress.getPort();
        ((StringBuilder)localObject).append(i);
      }
    }
    for (;;)
    {
      return;
      localObject = paramSocketAddress.getAddress();
      break;
      paramStringBuilder.append(paramSocketAddress);
    }
  }
  
  protected void assertNotOpen()
  {
    boolean bool = this.open;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Asserts.check(bool, "Connection is already open");
      return;
    }
  }
  
  protected void assertOpen()
  {
    Asserts.check(this.open, "Connection is not open");
  }
  
  protected void bind(Socket paramSocket, HttpParams paramHttpParams)
  {
    Args.notNull(paramSocket, "Socket");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.socket = paramSocket;
    int i = paramHttpParams.getIntParameter("http.socket.buffer-size", -1);
    SessionInputBuffer localSessionInputBuffer = createSessionInputBuffer(paramSocket, i, paramHttpParams);
    SessionOutputBuffer localSessionOutputBuffer = createSessionOutputBuffer(paramSocket, i, paramHttpParams);
    init(localSessionInputBuffer, localSessionOutputBuffer, paramHttpParams);
    this.open = true;
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 47	org/apache/http/impl/SocketHttpServerConnection:open	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +4 -> 12
    //   11: return
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield 47	org/apache/http/impl/SocketHttpServerConnection:open	Z
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield 47	org/apache/http/impl/SocketHttpServerConnection:open	Z
    //   22: aload_0
    //   23: getfield 16	org/apache/http/impl/SocketHttpServerConnection:socket	Ljava/net/Socket;
    //   26: astore_1
    //   27: aload_0
    //   28: invokevirtual 91	org/apache/http/impl/SocketHttpServerConnection:doFlush	()V
    //   31: aload_1
    //   32: invokevirtual 96	java/net/Socket:shutdownOutput	()V
    //   35: aload_1
    //   36: invokevirtual 99	java/net/Socket:shutdownInput	()V
    //   39: aload_1
    //   40: invokevirtual 102	java/net/Socket:close	()V
    //   43: goto -32 -> 11
    //   46: astore_3
    //   47: aload_1
    //   48: invokevirtual 102	java/net/Socket:close	()V
    //   51: aload_3
    //   52: athrow
    //   53: astore_3
    //   54: goto -19 -> 35
    //   57: astore_3
    //   58: goto -19 -> 39
    //   61: astore_3
    //   62: goto -23 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	SocketHttpServerConnection
    //   1	47	1	localSocket	Socket
    //   6	2	2	bool	boolean
    //   46	6	3	localObject	Object
    //   53	1	3	localIOException1	java.io.IOException
    //   57	1	3	localIOException2	java.io.IOException
    //   61	1	3	localUnsupportedOperationException	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   27	31	46	finally
    //   31	35	46	finally
    //   35	39	46	finally
    //   31	35	53	java/io/IOException
    //   35	39	57	java/io/IOException
    //   31	35	61	java/lang/UnsupportedOperationException
    //   35	39	61	java/lang/UnsupportedOperationException
  }
  
  protected SessionInputBuffer createSessionInputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    SocketInputBuffer localSocketInputBuffer = new org/apache/http/impl/io/SocketInputBuffer;
    localSocketInputBuffer.<init>(paramSocket, paramInt, paramHttpParams);
    return localSocketInputBuffer;
  }
  
  protected SessionOutputBuffer createSessionOutputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    SocketOutputBuffer localSocketOutputBuffer = new org/apache/http/impl/io/SocketOutputBuffer;
    localSocketOutputBuffer.<init>(paramSocket, paramInt, paramHttpParams);
    return localSocketOutputBuffer;
  }
  
  public InetAddress getLocalAddress()
  {
    Object localObject = this.socket;
    if (localObject != null) {}
    for (localObject = this.socket.getLocalAddress();; localObject = null) {
      return (InetAddress)localObject;
    }
  }
  
  public int getLocalPort()
  {
    Socket localSocket = this.socket;
    if (localSocket != null) {
      localSocket = this.socket;
    }
    for (int i = localSocket.getLocalPort();; i = -1) {
      return i;
    }
  }
  
  public InetAddress getRemoteAddress()
  {
    Object localObject = this.socket;
    if (localObject != null) {}
    for (localObject = this.socket.getInetAddress();; localObject = null) {
      return (InetAddress)localObject;
    }
  }
  
  public int getRemotePort()
  {
    Socket localSocket = this.socket;
    if (localSocket != null) {
      localSocket = this.socket;
    }
    for (int i = localSocket.getPort();; i = -1) {
      return i;
    }
  }
  
  protected Socket getSocket()
  {
    return this.socket;
  }
  
  public int getSocketTimeout()
  {
    int i = -1;
    Socket localSocket = this.socket;
    if (localSocket != null) {}
    try
    {
      localSocket = this.socket;
      i = localSocket.getSoTimeout();
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
    return i;
  }
  
  public boolean isOpen()
  {
    return this.open;
  }
  
  public void setSocketTimeout(int paramInt)
  {
    assertOpen();
    Socket localSocket = this.socket;
    if (localSocket != null) {}
    try
    {
      localSocket = this.socket;
      localSocket.setSoTimeout(paramInt);
      return;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public void shutdown()
  {
    this.open = false;
    Socket localSocket = this.socket;
    if (localSocket != null) {
      localSocket.close();
    }
  }
  
  public String toString()
  {
    Object localObject1 = this.socket;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      SocketAddress localSocketAddress = this.socket.getRemoteSocketAddress();
      Object localObject2 = this.socket.getLocalSocketAddress();
      if ((localSocketAddress != null) && (localObject2 != null))
      {
        formatAddress((StringBuilder)localObject1, (SocketAddress)localObject2);
        localObject2 = "<->";
        ((StringBuilder)localObject1).append((String)localObject2);
        formatAddress((StringBuilder)localObject1, localSocketAddress);
      }
    }
    for (localObject1 = ((StringBuilder)localObject1).toString();; localObject1 = super.toString()) {
      return (String)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\SocketHttpServerConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */