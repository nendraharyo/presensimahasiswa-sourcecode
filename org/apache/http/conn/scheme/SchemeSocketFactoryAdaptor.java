package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

class SchemeSocketFactoryAdaptor
  implements SchemeSocketFactory
{
  private final SocketFactory factory;
  
  SchemeSocketFactoryAdaptor(SocketFactory paramSocketFactory)
  {
    this.factory = paramSocketFactory;
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpParams paramHttpParams)
  {
    String str = paramInetSocketAddress1.getHostName();
    int i = paramInetSocketAddress1.getPort();
    InetAddress localInetAddress = null;
    int j = 0;
    if (paramInetSocketAddress2 != null)
    {
      localInetAddress = paramInetSocketAddress2.getAddress();
      j = paramInetSocketAddress2.getPort();
    }
    return this.factory.connectSocket(paramSocket, str, i, localInetAddress, j, paramHttpParams);
  }
  
  public Socket createSocket(HttpParams paramHttpParams)
  {
    return this.factory.createSocket();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    SocketFactory localSocketFactory1;
    if (paramObject == null)
    {
      bool = false;
      localSocketFactory1 = null;
    }
    for (;;)
    {
      return bool;
      if (this == paramObject)
      {
        bool = true;
      }
      else
      {
        bool = paramObject instanceof SchemeSocketFactoryAdaptor;
        if (bool)
        {
          localSocketFactory1 = this.factory;
          paramObject = (SchemeSocketFactoryAdaptor)paramObject;
          SocketFactory localSocketFactory2 = ((SchemeSocketFactoryAdaptor)paramObject).factory;
          bool = localSocketFactory1.equals(localSocketFactory2);
        }
        else
        {
          localSocketFactory1 = this.factory;
          bool = localSocketFactory1.equals(paramObject);
        }
      }
    }
  }
  
  public SocketFactory getFactory()
  {
    return this.factory;
  }
  
  public int hashCode()
  {
    return this.factory.hashCode();
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    return this.factory.isSecure(paramSocket);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\scheme\SchemeSocketFactoryAdaptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */