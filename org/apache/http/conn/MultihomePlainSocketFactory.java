package org.apache.http.conn;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public final class MultihomePlainSocketFactory
  implements SocketFactory
{
  private static final MultihomePlainSocketFactory DEFAULT_FACTORY;
  
  static
  {
    MultihomePlainSocketFactory localMultihomePlainSocketFactory = new org/apache/http/conn/MultihomePlainSocketFactory;
    localMultihomePlainSocketFactory.<init>();
    DEFAULT_FACTORY = localMultihomePlainSocketFactory;
  }
  
  public static MultihomePlainSocketFactory getSocketFactory()
  {
    return DEFAULT_FACTORY;
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    Args.notNull(paramString, "Target host");
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    if (paramSocket == null) {}
    Object localObject2;
    for (Socket localSocket = createSocket();; localObject2 = paramSocket)
    {
      int i;
      Object localObject3;
      boolean bool;
      Iterator localIterator;
      if ((paramInetAddress != null) || (paramInt2 > 0))
      {
        localObject1 = new java/net/InetSocketAddress;
        if (paramInt2 > 0)
        {
          ((InetSocketAddress)localObject1).<init>(paramInetAddress, paramInt2);
          localSocket.bind((SocketAddress)localObject1);
        }
      }
      else
      {
        i = HttpConnectionParams.getConnectionTimeout(paramHttpParams);
        localObject1 = InetAddress.getAllByName(paramString);
        localObject3 = new java/util/ArrayList;
        int j = localObject1.length;
        ((ArrayList)localObject3).<init>(j);
        localObject1 = Arrays.asList((Object[])localObject1);
        ((List)localObject3).addAll((Collection)localObject1);
        Collections.shuffle((List)localObject3);
        bool = false;
        localObject1 = null;
        localIterator = ((List)localObject3).iterator();
        localObject3 = localSocket;
        localSocket = null;
      }
      for (;;)
      {
        bool = localIterator.hasNext();
        if (bool) {
          localObject1 = (InetAddress)localIterator.next();
        }
        try
        {
          InetSocketAddress localInetSocketAddress = new java/net/InetSocketAddress;
          localInetSocketAddress.<init>((InetAddress)localObject1, paramInt1);
          ((Socket)localObject3).connect(localInetSocketAddress, i);
          if (localSocket == null) {
            break label273;
          }
          throw localSocket;
        }
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          localObject2 = new org/apache/http/conn/ConnectTimeoutException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = "Connect to " + localObject1 + " timed out";
          ((ConnectTimeoutException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        catch (IOException localIOException)
        {
          localObject2 = new java/net/Socket;
          ((Socket)localObject2).<init>();
          localObject3 = localObject2;
          localObject2 = localIOException;
        }
        paramInt2 = 0;
        break;
      }
      label273:
      return (Socket)localObject3;
    }
  }
  
  public Socket createSocket()
  {
    Socket localSocket = new java/net/Socket;
    localSocket.<init>();
    return localSocket;
  }
  
  public final boolean isSecure(Socket paramSocket)
  {
    String str = "Socket";
    Args.notNull(paramSocket, str);
    boolean bool = paramSocket.isClosed();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      Asserts.check(bool, "Socket is closed");
      return false;
      bool = false;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\MultihomePlainSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */