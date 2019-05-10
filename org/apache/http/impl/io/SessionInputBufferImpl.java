package org.apache.http.impl.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

public class SessionInputBufferImpl
  implements BufferInfo, SessionInputBuffer
{
  private final byte[] buffer;
  private int bufferlen;
  private int bufferpos;
  private CharBuffer cbuf;
  private final MessageConstraints constraints;
  private final CharsetDecoder decoder;
  private InputStream instream;
  private final ByteArrayBuffer linebuffer;
  private final HttpTransportMetricsImpl metrics;
  private final int minChunkLimit;
  
  public SessionInputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt)
  {
    this(paramHttpTransportMetricsImpl, paramInt, paramInt, null, null);
  }
  
  public SessionInputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt1, int paramInt2, MessageConstraints paramMessageConstraints, CharsetDecoder paramCharsetDecoder)
  {
    Args.notNull(paramHttpTransportMetricsImpl, "HTTP transport metrcis");
    Args.positive(paramInt1, "Buffer size");
    this.metrics = paramHttpTransportMetricsImpl;
    Object localObject = new byte[paramInt1];
    this.buffer = ((byte[])localObject);
    this.bufferpos = 0;
    this.bufferlen = 0;
    if (paramInt2 >= 0)
    {
      this.minChunkLimit = paramInt2;
      if (paramMessageConstraints == null) {
        break label95;
      }
    }
    for (;;)
    {
      this.constraints = paramMessageConstraints;
      localObject = new org/apache/http/util/ByteArrayBuffer;
      ((ByteArrayBuffer)localObject).<init>(paramInt1);
      this.linebuffer = ((ByteArrayBuffer)localObject);
      this.decoder = paramCharsetDecoder;
      return;
      paramInt2 = 512;
      break;
      label95:
      paramMessageConstraints = MessageConstraints.DEFAULT;
    }
  }
  
  private int appendDecoded(CharArrayBuffer paramCharArrayBuffer, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    boolean bool1 = paramByteBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return i;
      Object localObject = this.cbuf;
      if (localObject == null)
      {
        int j = 1024;
        localObject = CharBuffer.allocate(j);
        this.cbuf = ((CharBuffer)localObject);
      }
      localObject = this.decoder;
      ((CharsetDecoder)localObject).reset();
      for (;;)
      {
        boolean bool2 = paramByteBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject = this.decoder;
        localCharBuffer = this.cbuf;
        boolean bool3 = true;
        localObject = ((CharsetDecoder)localObject).decode(paramByteBuffer, localCharBuffer, bool3);
        k = handleDecodingResult((CoderResult)localObject, paramCharArrayBuffer, paramByteBuffer);
        i += k;
      }
      localObject = this.decoder;
      CharBuffer localCharBuffer = this.cbuf;
      localObject = ((CharsetDecoder)localObject).flush(localCharBuffer);
      int k = handleDecodingResult((CoderResult)localObject, paramCharArrayBuffer, paramByteBuffer);
      i += k;
      localObject = this.cbuf;
      ((CharBuffer)localObject).clear();
    }
  }
  
  private int handleDecodingResult(CoderResult paramCoderResult, CharArrayBuffer paramCharArrayBuffer, ByteBuffer paramByteBuffer)
  {
    boolean bool1 = paramCoderResult.isError();
    if (bool1) {
      paramCoderResult.throwException();
    }
    this.cbuf.flip();
    CharBuffer localCharBuffer1 = this.cbuf;
    int i = localCharBuffer1.remaining();
    for (;;)
    {
      CharBuffer localCharBuffer2 = this.cbuf;
      boolean bool2 = localCharBuffer2.hasRemaining();
      if (!bool2) {
        break;
      }
      localCharBuffer2 = this.cbuf;
      char c = localCharBuffer2.get();
      paramCharArrayBuffer.append(c);
    }
    this.cbuf.compact();
    return i;
  }
  
  private int lineFromLineBuffer(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject1 = this.linebuffer;
    int i = ((ByteArrayBuffer)localObject1).length();
    if (i > 0)
    {
      localObject2 = this.linebuffer;
      int j = i + -1;
      int k = ((ByteArrayBuffer)localObject2).byteAt(j);
      j = 10;
      if (k == j) {
        i += -1;
      }
      if (i > 0)
      {
        localObject2 = this.linebuffer;
        j = i + -1;
        k = ((ByteArrayBuffer)localObject2).byteAt(j);
        j = 13;
        if (k == j) {
          i += -1;
        }
      }
    }
    Object localObject2 = this.decoder;
    if (localObject2 == null)
    {
      localObject2 = this.linebuffer;
      paramCharArrayBuffer.append((ByteArrayBuffer)localObject2, 0, i);
    }
    for (;;)
    {
      this.linebuffer.clear();
      return i;
      localObject2 = this.linebuffer.buffer();
      localObject1 = ByteBuffer.wrap((byte[])localObject2, 0, i);
      i = appendDecoded(paramCharArrayBuffer, (ByteBuffer)localObject1);
    }
  }
  
  private int lineFromReadBuffer(CharArrayBuffer paramCharArrayBuffer, int paramInt)
  {
    int i = this.bufferpos;
    int j = paramInt + 1;
    this.bufferpos = j;
    Object localObject1;
    if (paramInt > i)
    {
      localObject1 = this.buffer;
      int k = paramInt + -1;
      j = localObject1[k];
      k = 13;
      if (j == k) {
        paramInt += -1;
      }
    }
    j = paramInt - i;
    Object localObject2 = this.decoder;
    if (localObject2 == null)
    {
      localObject2 = this.buffer;
      paramCharArrayBuffer.append((byte[])localObject2, i, j);
    }
    for (;;)
    {
      return j;
      localObject2 = this.buffer;
      localObject1 = ByteBuffer.wrap((byte[])localObject2, i, j);
      j = appendDecoded(paramCharArrayBuffer, (ByteBuffer)localObject1);
    }
  }
  
  private int locateLF()
  {
    int i = this.bufferpos;
    int j = this.bufferlen;
    if (i < j)
    {
      byte[] arrayOfByte = this.buffer;
      j = arrayOfByte[i];
      int k = 10;
      if (j != k) {}
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      i = -1;
    }
  }
  
  private int streamRead(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Asserts.notNull(this.instream, "Input stream");
    return this.instream.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int available()
  {
    int i = capacity();
    int j = length();
    return i - j;
  }
  
  public void bind(InputStream paramInputStream)
  {
    this.instream = paramInputStream;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public void clear()
  {
    this.bufferpos = 0;
    this.bufferlen = 0;
  }
  
  public int fillBuffer()
  {
    int i = -1;
    int j = this.bufferpos;
    if (j > 0)
    {
      j = this.bufferlen;
      k = this.bufferpos;
      j -= k;
      if (j > 0)
      {
        byte[] arrayOfByte1 = this.buffer;
        int m = this.bufferpos;
        byte[] arrayOfByte2 = this.buffer;
        System.arraycopy(arrayOfByte1, m, arrayOfByte2, 0, j);
      }
      this.bufferpos = 0;
      this.bufferlen = j;
    }
    int k = this.bufferlen;
    byte[] arrayOfByte3 = this.buffer;
    j = arrayOfByte3.length - k;
    byte[] arrayOfByte4 = this.buffer;
    j = streamRead(arrayOfByte4, k, j);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = k + j;
      this.bufferlen = i;
      HttpTransportMetricsImpl localHttpTransportMetricsImpl = this.metrics;
      long l = j;
      localHttpTransportMetricsImpl.incrementBytesTransferred(l);
      i = j;
    }
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  public boolean hasBufferedData()
  {
    int i = this.bufferpos;
    int k = this.bufferlen;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isBound()
  {
    InputStream localInputStream = this.instream;
    boolean bool;
    if (localInputStream != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localInputStream = null;
    }
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    return hasBufferedData();
  }
  
  public int length()
  {
    int i = this.bufferlen;
    int j = this.bufferpos;
    return i - j;
  }
  
  public int read()
  {
    int i = -1;
    int j;
    do
    {
      boolean bool = hasBufferedData();
      if (bool) {
        break;
      }
      j = fillBuffer();
    } while (j != i);
    for (;;)
    {
      return i;
      byte[] arrayOfByte = this.buffer;
      j = this.bufferpos;
      int k = j + 1;
      this.bufferpos = k;
      i = arrayOfByte[j] & 0xFF;
    }
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return i;
      int j = paramArrayOfByte.length;
      i = read(paramArrayOfByte, 0, j);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramArrayOfByte == null) {
      i = 0;
    }
    for (;;)
    {
      return i;
      boolean bool1 = hasBufferedData();
      int j;
      Object localObject;
      int m;
      if (bool1)
      {
        i = this.bufferlen;
        j = this.bufferpos;
        i -= j;
        i = Math.min(paramInt2, i);
        localObject = this.buffer;
        m = this.bufferpos;
        System.arraycopy(localObject, m, paramArrayOfByte, paramInt1, i);
        j = this.bufferpos + i;
        this.bufferpos = j;
      }
      else
      {
        j = this.minChunkLimit;
        if (paramInt2 > j)
        {
          i = streamRead(paramArrayOfByte, paramInt1, paramInt2);
          if (i > 0)
          {
            localObject = this.metrics;
            long l = i;
            ((HttpTransportMetricsImpl)localObject).incrementBytesTransferred(l);
          }
        }
        else
        {
          do
          {
            boolean bool2 = hasBufferedData();
            if (bool2) {
              break;
            }
            k = fillBuffer();
          } while (k != i);
          continue;
          i = this.bufferlen;
          int k = this.bufferpos;
          i -= k;
          i = Math.min(paramInt2, i);
          localObject = this.buffer;
          m = this.bufferpos;
          System.arraycopy(localObject, m, paramArrayOfByte, paramInt1, i);
          k = this.bufferpos + i;
          this.bufferpos = k;
        }
      }
    }
  }
  
  public int readLine(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = -1;
    Object localObject1 = "Char array buffer";
    Args.notNull(paramCharArrayBuffer, (String)localObject1);
    boolean bool1 = true;
    boolean bool3 = false;
    int n;
    int j;
    if (bool1)
    {
      n = locateLF();
      if (n != i)
      {
        localObject1 = this.linebuffer;
        bool1 = ((ByteArrayBuffer)localObject1).isEmpty();
        if (bool1) {
          j = lineFromReadBuffer(paramCharArrayBuffer, n);
        }
      }
    }
    for (;;)
    {
      return j;
      j = n + 1;
      int i1 = this.bufferpos;
      j -= i1;
      Object localObject2 = this.linebuffer;
      byte[] arrayOfByte = this.buffer;
      int i2 = this.bufferpos;
      ((ByteArrayBuffer)localObject2).append(arrayOfByte, i2, j);
      j = n + 1;
      this.bufferpos = j;
      j = 0;
      localObject1 = null;
      int m;
      for (;;)
      {
        Object localObject3 = this.constraints;
        n = ((MessageConstraints)localObject3).getMaxLineLength();
        if (n <= 0) {
          break;
        }
        localObject2 = this.linebuffer;
        i1 = ((ByteArrayBuffer)localObject2).length();
        if (i1 < n) {
          break;
        }
        localObject1 = new org/apache/http/MessageConstraintException;
        ((MessageConstraintException)localObject1).<init>("Maximum line length limit exceeded");
        throw ((Throwable)localObject1);
        bool3 = hasBufferedData();
        if (bool3)
        {
          m = this.bufferlen;
          n = this.bufferpos;
          m -= n;
          localObject3 = this.linebuffer;
          localObject2 = this.buffer;
          int i3 = this.bufferpos;
          ((ByteArrayBuffer)localObject3).append((byte[])localObject2, i3, m);
          m = this.bufferlen;
          this.bufferpos = m;
        }
        m = fillBuffer();
        if (m == i)
        {
          j = 0;
          localObject1 = null;
        }
      }
      if (m == i)
      {
        localObject1 = this.linebuffer;
        boolean bool2 = ((ByteArrayBuffer)localObject1).isEmpty();
        if (bool2)
        {
          bool2 = i;
          continue;
        }
      }
      int k = lineFromLineBuffer(paramCharArrayBuffer);
    }
  }
  
  public String readLine()
  {
    Object localObject = new org/apache/http/util/CharArrayBuffer;
    ((CharArrayBuffer)localObject).<init>(64);
    int i = readLine((CharArrayBuffer)localObject);
    int j = -1;
    if (i != j) {}
    for (localObject = ((CharArrayBuffer)localObject).toString();; localObject = null) {
      return (String)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\SessionInputBufferImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */