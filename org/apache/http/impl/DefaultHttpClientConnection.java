package org.apache.http.impl;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class DefaultHttpClientConnection
  extends SocketHttpClientConnection
{
  public void bind(Socket paramSocket, HttpParams paramHttpParams)
  {
    boolean bool1 = true;
    Args.notNull(paramSocket, "Socket");
    Args.notNull(paramHttpParams, "HTTP parameters");
    assertNotOpen();
    boolean bool2 = paramHttpParams.getBooleanParameter("http.tcp.nodelay", bool1);
    paramSocket.setTcpNoDelay(bool2);
    int i = paramHttpParams.getIntParameter("http.socket.timeout", 0);
    paramSocket.setSoTimeout(i);
    boolean bool3 = paramHttpParams.getBooleanParameter("http.socket.keepalive", false);
    paramSocket.setKeepAlive(bool3);
    String str = "http.socket.linger";
    int k = -1;
    int j = paramHttpParams.getIntParameter(str, k);
    if (j >= 0) {
      if (j <= 0) {
        break label114;
      }
    }
    for (;;)
    {
      paramSocket.setSoLinger(bool1, j);
      super.bind(paramSocket, paramHttpParams);
      return;
      label114:
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */