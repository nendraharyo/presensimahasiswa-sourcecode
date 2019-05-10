package org.apache.http.impl;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class DefaultHttpServerConnection
  extends SocketHttpServerConnection
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
    int j = paramHttpParams.getIntParameter(str, -1);
    if (j >= 0)
    {
      if (j > 0)
      {
        bool3 = bool1;
        paramSocket.setSoLinger(bool3, j);
      }
    }
    else if (j >= 0) {
      if (j <= 0) {
        break label140;
      }
    }
    for (;;)
    {
      paramSocket.setSoLinger(bool1, j);
      super.bind(paramSocket, paramHttpParams);
      return;
      bool3 = false;
      str = null;
      break;
      label140:
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultHttpServerConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */