package org.apache.http.conn.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;

public class PlainConnectionSocketFactory
  implements ConnectionSocketFactory
{
  public static final PlainConnectionSocketFactory INSTANCE;
  
  static
  {
    PlainConnectionSocketFactory localPlainConnectionSocketFactory = new org/apache/http/conn/socket/PlainConnectionSocketFactory;
    localPlainConnectionSocketFactory.<init>();
    INSTANCE = localPlainConnectionSocketFactory;
  }
  
  public static PlainConnectionSocketFactory getSocketFactory()
  {
    return INSTANCE;
  }
  
  public Socket connectSocket(int paramInt, Socket paramSocket, HttpHost paramHttpHost, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpContext paramHttpContext)
  {
    if (paramSocket != null) {}
    for (;;)
    {
      if (paramInetSocketAddress2 != null) {
        paramSocket.bind(paramInetSocketAddress2);
      }
      try
      {
        paramSocket.connect(paramInetSocketAddress1, paramInt);
        return paramSocket;
      }
      catch (IOException localIOException1) {}
      paramSocket = createSocket(paramHttpContext);
    }
    try
    {
      paramSocket.close();
      throw localIOException1;
    }
    catch (IOException localIOException2)
    {
      for (;;) {}
    }
  }
  
  public Socket createSocket(HttpContext paramHttpContext)
  {
    Socket localSocket = new java/net/Socket;
    localSocket.<init>();
    return localSocket;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\socket\PlainConnectionSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */