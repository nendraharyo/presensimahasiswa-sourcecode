package b.a.a.a.e.c;

import b.a.a.a.l.e;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

class k
  implements j
{
  private final l a;
  
  k(l paraml)
  {
    this.a = paraml;
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, e parame)
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
    return this.a.connectSocket(paramSocket, str, i, localInetAddress, j, parame);
  }
  
  public Socket createSocket(e parame)
  {
    return this.a.createSocket();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    l locall1;
    if (paramObject == null)
    {
      bool = false;
      locall1 = null;
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
        bool = paramObject instanceof k;
        if (bool)
        {
          locall1 = this.a;
          paramObject = (k)paramObject;
          l locall2 = ((k)paramObject).a;
          bool = locall1.equals(locall2);
        }
        else
        {
          locall1 = this.a;
          bool = locall1.equals(paramObject);
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    return this.a.isSecure(paramSocket);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\c\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */