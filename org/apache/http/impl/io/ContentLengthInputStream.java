package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

public class ContentLengthInputStream
  extends InputStream
{
  private static final int BUFFER_SIZE = 2048;
  private boolean closed = false;
  private final long contentLength;
  private SessionInputBuffer in = null;
  private long pos = 0L;
  
  public ContentLengthInputStream(SessionInputBuffer paramSessionInputBuffer, long paramLong)
  {
    SessionInputBuffer localSessionInputBuffer = (SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer");
    this.in = localSessionInputBuffer;
    long l = Args.notNegative(paramLong, "Content length");
    this.contentLength = l;
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
      long l1 = this.contentLength;
      long l2 = this.pos;
      l1 -= l2;
      int j = (int)l1;
      i = Math.min(i, j);
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
    boolean bool1 = true;
    boolean bool2 = this.closed;
    if (!bool2) {}
    try
    {
      long l1 = this.pos;
      long l2 = this.contentLength;
      bool2 = l1 < l2;
      if (bool2)
      {
        int i = 2048;
        byte[] arrayOfByte = new byte[i];
        int j;
        do
        {
          j = read(arrayOfByte);
        } while (j >= 0);
      }
      return;
    }
    finally
    {
      this.closed = bool1;
    }
  }
  
  public int read()
  {
    int i = -1;
    boolean bool2 = this.closed;
    Object localObject1;
    if (bool2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    long l1 = this.pos;
    long l2 = this.contentLength;
    bool2 = l1 < l2;
    if (!bool2) {}
    for (;;)
    {
      return i;
      Object localObject2 = this.in;
      int j = ((SessionInputBuffer)localObject2).read();
      if (j == i)
      {
        l1 = this.pos;
        l2 = this.contentLength;
        bool1 = l1 < l2;
        if (bool1)
        {
          localObject1 = new org/apache/http/ConnectionClosedException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Premature end of Content-Length delimited message body (expected: ");
          l1 = this.contentLength;
          localObject2 = ((StringBuilder)localObject2).append(l1).append("; received: ");
          l1 = this.pos;
          localObject2 = l1;
          ((ConnectionClosedException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        l1 = this.pos;
        l2 = 1L;
        l1 += l2;
        this.pos = l1;
      }
      boolean bool1 = j;
    }
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return read(paramArrayOfByte, 0, i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool2 = this.closed;
    Object localObject1;
    if (bool2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    long l1 = this.pos;
    long l2 = this.contentLength;
    bool2 = l1 < l2;
    if (!bool2) {}
    for (;;)
    {
      return i;
      l1 = this.pos;
      l2 = paramInt2;
      l1 += l2;
      l2 = this.contentLength;
      bool2 = l1 < l2;
      if (bool2)
      {
        l1 = this.contentLength;
        l2 = this.pos;
        l1 -= l2;
        paramInt2 = (int)l1;
      }
      Object localObject2 = this.in;
      int j = ((SessionInputBuffer)localObject2).read(paramArrayOfByte, paramInt1, paramInt2);
      if (j == i)
      {
        l1 = this.pos;
        l2 = this.contentLength;
        bool1 = l1 < l2;
        if (bool1)
        {
          localObject1 = new org/apache/http/ConnectionClosedException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Premature end of Content-Length delimited message body (expected: ");
          l1 = this.contentLength;
          localObject2 = ((StringBuilder)localObject2).append(l1).append("; received: ");
          l1 = this.pos;
          localObject2 = l1;
          ((ConnectionClosedException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      if (j > 0)
      {
        l1 = this.pos;
        l2 = j;
        l1 += l2;
        this.pos = l1;
      }
      boolean bool1 = j;
    }
  }
  
  public long skip(long paramLong)
  {
    long l1 = 0L;
    boolean bool1 = paramLong < l1;
    if (!bool1) {
      return l1;
    }
    int i = 2048;
    byte[] arrayOfByte = new byte[i];
    long l2 = this.contentLength;
    long l3 = this.pos;
    l2 -= l3;
    l3 = Math.min(paramLong, l2);
    l2 = l1;
    for (;;)
    {
      boolean bool2 = l3 < l1;
      int j;
      if (bool2)
      {
        l4 = Math.min(2048L, l3);
        int k = (int)l4;
        j = read(arrayOfByte, 0, k);
        k = -1;
        if (j != k) {}
      }
      else
      {
        l1 = l2;
        break;
      }
      long l4 = j;
      l2 += l4;
      l4 = j;
      l3 -= l4;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\ContentLengthInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */