package org.apache.http.impl.io;

import java.io.OutputStream;
import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class SocketOutputBuffer
  extends AbstractSessionOutputBuffer
{
  public SocketOutputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    Object localObject = "Socket";
    Args.notNull(paramSocket, (String)localObject);
    if (paramInt < 0) {}
    for (int j = paramSocket.getSendBufferSize();; j = paramInt)
    {
      if (j < i) {}
      for (;;)
      {
        localObject = paramSocket.getOutputStream();
        init((OutputStream)localObject, i, paramHttpParams);
        return;
        i = j;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\SocketOutputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */