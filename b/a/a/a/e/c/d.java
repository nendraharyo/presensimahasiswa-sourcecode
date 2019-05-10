package b.a.a.a.e.c;

import b.a.a.a.e.f;
import b.a.a.a.l.c;
import b.a.a.a.l.e;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class d
  implements j, l
{
  private final a a = null;
  
  public static d a()
  {
    d locald = new b/a/a/a/e/c/d;
    locald.<init>();
    return locald;
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, e parame)
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
      localObject = this.a;
      if (localObject == null) {
        break label86;
      }
    }
    label86:
    for (Object localObject = this.a.a(paramString);; localObject = InetAddress.getByName(paramString))
    {
      InetSocketAddress localInetSocketAddress2 = new java/net/InetSocketAddress;
      localInetSocketAddress2.<init>((InetAddress)localObject, paramInt1);
      return connectSocket(paramSocket, localInetSocketAddress2, localInetSocketAddress1, parame);
      paramInt2 = 0;
      break;
    }
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, e parame)
  {
    b.a.a.a.o.a.a(paramInetSocketAddress1, "Remote address");
    String str = "HTTP parameters";
    b.a.a.a.o.a.a(parame, str);
    if (paramSocket == null) {
      paramSocket = createSocket();
    }
    if (paramInetSocketAddress2 != null)
    {
      boolean bool = c.b(parame);
      paramSocket.setReuseAddress(bool);
      paramSocket.bind(paramInetSocketAddress2);
    }
    int i = c.e(parame);
    int j = c.a(parame);
    try
    {
      paramSocket.setSoTimeout(j);
      paramSocket.connect(paramInetSocketAddress1, i);
      return paramSocket;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      f localf = new b/a/a/a/e/f;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Connect to " + paramInetSocketAddress1 + " timed out";
      localf.<init>((String)localObject);
      throw localf;
    }
  }
  
  public Socket createSocket()
  {
    Socket localSocket = new java/net/Socket;
    localSocket.<init>();
    return localSocket;
  }
  
  public Socket createSocket(e parame)
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\c\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */