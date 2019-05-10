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

public class SocketHttpClientConnection
  extends AbstractHttpClientConnection
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
    //   0: aload_0
    //   1: getfield 47	org/apache/http/impl/SocketHttpClientConnection:open	Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifne +4 -> 10
    //   9: return
    //   10: iconst_0
    //   11: istore_1
    //   12: aconst_null
    //   13: astore_2
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 47	org/apache/http/impl/SocketHttpClientConnection:open	Z
    //   19: aload_0
    //   20: getfield 16	org/apache/http/impl/SocketHttpClientConnection:socket	Ljava/net/Socket;
    //   23: astore_3
    //   24: aload_0
    //   25: invokevirtual 91	org/apache/http/impl/SocketHttpClientConnection:doFlush	()V
    //   28: aload_3
    //   29: invokevirtual 96	java/net/Socket:shutdownOutput	()V
    //   32: aload_3
    //   33: invokevirtual 99	java/net/Socket:shutdownInput	()V
    //   36: aload_3
    //   37: invokevirtual 102	java/net/Socket:close	()V
    //   40: goto -31 -> 9
    //   43: astore_2
    //   44: aload_3
    //   45: invokevirtual 102	java/net/Socket:close	()V
    //   48: aload_2
    //   49: athrow
    //   50: astore_2
    //   51: goto -19 -> 32
    //   54: astore_2
    //   55: goto -19 -> 36
    //   58: astore_2
    //   59: goto -23 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	SocketHttpClientConnection
    //   4	8	1	bool	boolean
    //   13	1	2	localObject1	Object
    //   43	6	2	localObject2	Object
    //   50	1	2	localIOException1	java.io.IOException
    //   54	1	2	localIOException2	java.io.IOException
    //   58	1	2	localUnsupportedOperationException	UnsupportedOperationException
    //   23	22	3	localSocket	Socket
    // Exception table:
    //   from	to	target	type
    //   24	28	43	finally
    //   28	32	43	finally
    //   32	36	43	finally
    //   28	32	50	java/io/IOException
    //   32	36	54	java/io/IOException
    //   28	32	58	java/lang/UnsupportedOperationException
    //   32	36	58	java/lang/UnsupportedOperationException
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\SocketHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */