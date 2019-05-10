package org.apache.http.impl.io;

import java.io.InputStream;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

public class IdentityInputStream
  extends InputStream
{
  private boolean closed = false;
  private final SessionInputBuffer in;
  
  public IdentityInputStream(SessionInputBuffer paramSessionInputBuffer)
  {
    SessionInputBuffer localSessionInputBuffer = (SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer");
    this.in = localSessionInputBuffer;
  }
  
  public int available()
  {
    Object localObject = this.in;
    boolean bool = localObject instanceof BufferInfo;
    int i;
    if (bool)
    {
      localObject = (BufferInfo)this.in;
      i = ((BufferInfo)localObject).length();
    }
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  public void close()
  {
    this.closed = true;
  }
  
  public int read()
  {
    boolean bool = this.closed;
    if (bool) {}
    SessionInputBuffer localSessionInputBuffer;
    for (int i = -1;; i = localSessionInputBuffer.read())
    {
      return i;
      localSessionInputBuffer = this.in;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.closed;
    if (bool) {}
    SessionInputBuffer localSessionInputBuffer;
    for (int i = -1;; i = localSessionInputBuffer.read(paramArrayOfByte, paramInt1, paramInt2))
    {
      return i;
      localSessionInputBuffer = this.in;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\IdentityInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */