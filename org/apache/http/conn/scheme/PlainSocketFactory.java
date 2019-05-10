package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class PlainSocketFactory
  implements SchemeSocketFactory, SocketFactory
{
  private final HostNameResolver nameResolver;
  
  public PlainSocketFactory()
  {
    this.nameResolver = null;
  }
  
  public PlainSocketFactory(HostNameResolver paramHostNameResolver)
  {
    this.nameResolver = paramHostNameResolver;
  }
  
  public static PlainSocketFactory getSocketFactory()
  {
    PlainSocketFactory localPlainSocketFactory = new org/apache/http/conn/scheme/PlainSocketFactory;
    localPlainSocketFactory.<init>();
    return localPlainSocketFactory;
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    InetSocketAddress localInetSocketAddress1 = null;
    if ((paramInetAddress != null) || (paramInt2 > 0))
    {
      localInetSocketAddress1 = new java/net/InetSocketAddress;
      if (paramInt2 > 0) {
        localInetSocketAddress1.<init>(paramInetAddress, paramInt2);
      }
    }
    else
    {
      localObject = this.nameResolver;
      if (localObject == null) {
        break label86;
      }
    }
    label86:
    for (Object localObject = this.nameResolver.resolve(paramString);; localObject = InetAddress.getByName(paramString))
    {
      InetSocketAddress localInetSocketAddress2 = new java/net/InetSocketAddress;
      localInetSocketAddress2.<init>((InetAddress)localObject, paramInt1);
      return connectSocket(paramSocket, localInetSocketAddress2, localInetSocketAddress1, paramHttpParams);
      paramInt2 = 0;
      break;
    }
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpParams paramHttpParams)
  {
    Args.notNull(paramInetSocketAddress1, "Remote address");
    String str = "HTTP parameters";
    Args.notNull(paramHttpParams, str);
    if (paramSocket == null) {
      paramSocket = createSocket();
    }
    if (paramInetSocketAddress2 != null)
    {
      boolean bool = HttpConnectionParams.getSoReuseaddr(paramHttpParams);
      paramSocket.setReuseAddress(bool);
      paramSocket.bind(paramInetSocketAddress2);
    }
    int i = HttpConnectionParams.getConnectionTimeout(paramHttpParams);
    int j = HttpConnectionParams.getSoTimeout(paramHttpParams);
    try
    {
      paramSocket.setSoTimeout(j);
      paramSocket.connect(paramInetSocketAddress1, i);
      return paramSocket;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      ConnectTimeoutException localConnectTimeoutException = new org/apache/http/conn/ConnectTimeoutException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Connect to " + paramInetSocketAddress1 + " timed out";
      localConnectTimeoutException.<init>((String)localObject);
      throw localConnectTimeoutException;
    }
  }
  
  public Socket createSocket()
  {
    Socket localSocket = new java/net/Socket;
    localSocket.<init>();
    return localSocket;
  }
  
  public Socket createSocket(HttpParams paramHttpParams)
  {
    Socket localSocket = new java/net/Socket;
    localSocket.<init>();
    return localSocket;
  }
  
  public final boolean isSecure(Socket paramSocket)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\scheme\PlainSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */