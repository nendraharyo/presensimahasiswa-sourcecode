package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

class SocketFactoryAdaptor
  implements SocketFactory
{
  private final SchemeSocketFactory factory;
  
  SocketFactoryAdaptor(SchemeSocketFactory paramSchemeSocketFactory)
  {
    this.factory = paramSchemeSocketFactory;
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    InetSocketAddress localInetSocketAddress1 = null;
    if ((paramInetAddress != null) || (paramInt2 > 0))
    {
      localInetSocketAddress1 = new java/net/InetSocketAddress;
      if (paramInt2 <= 0) {
        break label68;
      }
    }
    for (;;)
    {
      localInetSocketAddress1.<init>(paramInetAddress, paramInt2);
      InetAddress localInetAddress = InetAddress.getByName(paramString);
      InetSocketAddress localInetSocketAddress2 = new java/net/InetSocketAddress;
      localInetSocketAddress2.<init>(localInetAddress, paramInt1);
      return this.factory.connectSocket(paramSocket, localInetSocketAddress2, localInetSocketAddress1, paramHttpParams);
      label68:
      paramInt2 = 0;
    }
  }
  
  public Socket createSocket()
  {
    BasicHttpParams localBasicHttpParams = new org/apache/http/params/BasicHttpParams;
    localBasicHttpParams.<init>();
    return this.factory.createSocket(localBasicHttpParams);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    SchemeSocketFactory localSchemeSocketFactory1;
    if (paramObject == null)
    {
      bool = false;
      localSchemeSocketFactory1 = null;
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
        bool = paramObject instanceof SocketFactoryAdaptor;
        if (bool)
        {
          localSchemeSocketFactory1 = this.factory;
          paramObject = (SocketFactoryAdaptor)paramObject;
          SchemeSocketFactory localSchemeSocketFactory2 = ((SocketFactoryAdaptor)paramObject).factory;
          bool = localSchemeSocketFactory1.equals(localSchemeSocketFactory2);
        }
        else
        {
          localSchemeSocketFactory1 = this.factory;
          bool = localSchemeSocketFactory1.equals(paramObject);
        }
      }
    }
  }
  
  public SchemeSocketFactory getFactory()
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\scheme\SocketFactoryAdaptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */