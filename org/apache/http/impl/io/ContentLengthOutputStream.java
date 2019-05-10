package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

public class ContentLengthOutputStream
  extends OutputStream
{
  private boolean closed = false;
  private final long contentLength;
  private final SessionOutputBuffer out;
  private long total = 0L;
  
  public ContentLengthOutputStream(SessionOutputBuffer paramSessionOutputBuffer, long paramLong)
  {
    SessionOutputBuffer localSessionOutputBuffer = (SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session output buffer");
    this.out = localSessionOutputBuffer;
    long l = Args.notNegative(paramLong, "Content length");
    this.contentLength = l;
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
    Object localObject;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    long l1 = this.total;
    long l2 = this.contentLength;
    bool = l1 < l2;
    if (bool)
    {
      localObject = this.out;
      ((SessionOutputBuffer)localObject).write(paramInt);
      l1 = this.total;
      l2 = 1L;
      l1 += l2;
      this.total = l1;
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = this.closed;
    Object localObject;
    if (bool1)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    long l1 = this.total;
    long l2 = this.contentLength;
    bool1 = l1 < l2;
    if (bool1)
    {
      l1 = this.contentLength;
      l2 = this.total;
      l1 -= l2;
      l2 = paramInt2;
      boolean bool2 = l2 < l1;
      if (bool2) {
        paramInt2 = (int)l1;
      }
      localObject = this.out;
      ((SessionOutputBuffer)localObject).write(paramArrayOfByte, paramInt1, paramInt2);
      l1 = this.total;
      l2 = paramInt2;
      l1 += l2;
      this.total = l1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\ContentLengthOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */