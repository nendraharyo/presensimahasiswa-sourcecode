package b.a.a.a.e.c;

import b.a.a.a.l.e;
import java.net.InetSocketAddress;
import java.net.Socket;

class h
  implements f
{
  private final b a;
  
  h(b paramb)
  {
    this.a = paramb;
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, e parame)
  {
    return this.a.connectSocket(paramSocket, paramInetSocketAddress1, paramInetSocketAddress2, parame);
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, e parame)
  {
    return this.a.createLayeredSocket(paramSocket, paramString, paramInt, true);
  }
  
  public Socket createSocket(e parame)
  {
    return this.a.createSocket(parame);
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    return this.a.isSecure(paramSocket);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\c\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */