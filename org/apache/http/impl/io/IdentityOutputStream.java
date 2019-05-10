package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

public class IdentityOutputStream
  extends OutputStream
{
  private boolean closed = false;
  private final SessionOutputBuffer out;
  
  public IdentityOutputStream(SessionOutputBuffer paramSessionOutputBuffer)
  {
    SessionOutputBuffer localSessionOutputBuffer = (SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session output buffer");
    this.out = localSessionOutputBuffer;
  }
  
  public void close()
  {
    boolean bool = this.closed;
    if (!bool)
    {
      bool = true;
      this.closed = bool;
      SessionOutputBuffer localSessionOutputBuffer = this.out;
      localSessionOutputBuffer.flush();
    }
  }
  
  public void flush()
  {
    this.out.flush();
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.closed;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted write to closed stream.");
      throw localIOException;
    }
    this.out.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.closed;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted write to closed stream.");
      throw localIOException;
    }
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\IdentityOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */