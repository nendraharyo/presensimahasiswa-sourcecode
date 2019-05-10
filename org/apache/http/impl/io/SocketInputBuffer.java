package org.apache.http.impl.io;

import java.io.InputStream;
import java.net.Socket;
import org.apache.http.io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public class SocketInputBuffer
  extends AbstractSessionInputBuffer
  implements EofSensor
{
  private boolean eof;
  private final Socket socket;
  
  public SocketInputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    Args.notNull(paramSocket, "Socket");
    this.socket = paramSocket;
    int j = 0;
    InputStream localInputStream = null;
    this.eof = false;
    if (paramInt < 0) {}
    for (j = paramSocket.getReceiveBufferSize();; j = paramInt)
    {
      if (j < i) {}
      for (;;)
      {
        localInputStream = paramSocket.getInputStream();
        init(localInputStream, i, paramHttpParams);
        return;
        i = j;
      }
    }
  }
  
  protected int fillBuffer()
  {
    int i = super.fillBuffer();
    int j = -1;
    if (i == j) {}
    for (j = 1;; j = 0)
    {
      this.eof = j;
      return i;
    }
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    boolean bool = hasBufferedData();
    Socket localSocket1;
    int i;
    if (!bool)
    {
      localSocket1 = this.socket;
      i = localSocket1.getSoTimeout();
    }
    try
    {
      localSocket1 = this.socket;
      localSocket1.setSoTimeout(paramInt);
      fillBuffer();
      bool = hasBufferedData();
      Socket localSocket2 = this.socket;
      localSocket2.setSoTimeout(i);
      return bool;
    }
    finally
    {
      this.socket.setSoTimeout(i);
    }
  }
  
  public boolean isEof()
  {
    return this.eof;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\SocketInputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */