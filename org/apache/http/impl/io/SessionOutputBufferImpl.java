package org.apache.http.impl.io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

public class SessionOutputBufferImpl
  implements BufferInfo, SessionOutputBuffer
{
  private static final byte[] CRLF;
  private ByteBuffer bbuf;
  private final ByteArrayBuffer buffer;
  private final CharsetEncoder encoder;
  private final int fragementSizeHint;
  private final HttpTransportMetricsImpl metrics;
  private OutputStream outstream;
  
  static
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = 13;
    arrayOfByte[1] = 10;
    CRLF = arrayOfByte;
  }
  
  public SessionOutputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt)
  {
    this(paramHttpTransportMetricsImpl, paramInt, paramInt, null);
  }
  
  public SessionOutputBufferImpl(HttpTransportMetricsImpl paramHttpTransportMetricsImpl, int paramInt1, int paramInt2, CharsetEncoder paramCharsetEncoder)
  {
    Args.positive(paramInt1, "Buffer size");
    Args.notNull(paramHttpTransportMetricsImpl, "HTTP transport metrcis");
    this.metrics = paramHttpTransportMetricsImpl;
    ByteArrayBuffer localByteArrayBuffer = new org/apache/http/util/ByteArrayBuffer;
    localByteArrayBuffer.<init>(paramInt1);
    this.buffer = localByteArrayBuffer;
    if (paramInt2 >= 0) {}
    for (;;)
    {
      this.fragementSizeHint = paramInt2;
      this.encoder = paramCharsetEncoder;
      return;
      paramInt2 = 0;
    }
  }
  
  private void flushBuffer()
  {
    ByteArrayBuffer localByteArrayBuffer = this.buffer;
    int i = localByteArrayBuffer.length();
    if (i > 0)
    {
      Object localObject = this.buffer.buffer();
      streamWrite((byte[])localObject, 0, i);
      this.buffer.clear();
      localObject = this.metrics;
      long l = i;
      ((HttpTransportMetricsImpl)localObject).incrementBytesTransferred(l);
    }
  }
  
  private void flushStream()
  {
    OutputStream localOutputStream = this.outstream;
    if (localOutputStream != null)
    {
      localOutputStream = this.outstream;
      localOutputStream.flush();
    }
  }
  
  private void handleEncodingResult(CoderResult paramCoderResult)
  {
    boolean bool = paramCoderResult.isError();
    if (bool) {
      paramCoderResult.throwException();
    }
    ByteBuffer localByteBuffer = this.bbuf;
    localByteBuffer.flip();
    for (;;)
    {
      localByteBuffer = this.bbuf;
      bool = localByteBuffer.hasRemaining();
      if (!bool) {
        break;
      }
      localByteBuffer = this.bbuf;
      int i = localByteBuffer.get();
      write(i);
    }
    this.bbuf.compact();
  }
  
  private void streamWrite(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Asserts.notNull(this.outstream, "Output stream");
    this.outstream.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private void writeEncoded(CharBuffer paramCharBuffer)
  {
    boolean bool1 = paramCharBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return;
      Object localObject = this.bbuf;
      if (localObject == null)
      {
        int i = 1024;
        localObject = ByteBuffer.allocate(i);
        this.bbuf = ((ByteBuffer)localObject);
      }
      localObject = this.encoder;
      ((CharsetEncoder)localObject).reset();
      for (;;)
      {
        boolean bool2 = paramCharBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject = this.encoder;
        localByteBuffer = this.bbuf;
        boolean bool3 = true;
        localObject = ((CharsetEncoder)localObject).encode(paramCharBuffer, localByteBuffer, bool3);
        handleEncodingResult((CoderResult)localObject);
      }
      localObject = this.encoder;
      ByteBuffer localByteBuffer = this.bbuf;
      localObject = ((CharsetEncoder)localObject).flush(localByteBuffer);
      handleEncodingResult((CoderResult)localObject);
      localObject = this.bbuf;
      ((ByteBuffer)localObject).clear();
    }
  }
  
  public int available()
  {
    int i = capacity();
    int j = length();
    return i - j;
  }
  
  public void bind(OutputStream paramOutputStream)
  {
    this.outstream = paramOutputStream;
  }
  
  public int capacity()
  {
    return this.buffer.capacity();
  }
  
  public void flush()
  {
    flushBuffer();
    flushStream();
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  public boolean isBound()
  {
    OutputStream localOutputStream = this.outstream;
    boolean bool;
    if (localOutputStream != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOutputStream = null;
    }
  }
  
  public int length()
  {
    return this.buffer.length();
  }
  
  public void write(int paramInt)
  {
    int i = this.fragementSizeHint;
    Object localObject;
    if (i > 0)
    {
      localObject = this.buffer;
      boolean bool = ((ByteArrayBuffer)localObject).isFull();
      if (bool) {
        flushBuffer();
      }
      localObject = this.buffer;
      ((ByteArrayBuffer)localObject).append(paramInt);
    }
    for (;;)
    {
      return;
      flushBuffer();
      localObject = this.outstream;
      ((OutputStream)localObject).write(paramInt);
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i = paramArrayOfByte.length;
      write(paramArrayOfByte, 0, i);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i = this.fragementSizeHint;
      if (paramInt2 <= i)
      {
        localObject = this.buffer;
        i = ((ByteArrayBuffer)localObject).capacity();
        if (paramInt2 <= i) {}
      }
      else
      {
        flushBuffer();
        streamWrite(paramArrayOfByte, paramInt1, paramInt2);
        localObject = this.metrics;
        long l = paramInt2;
        ((HttpTransportMetricsImpl)localObject).incrementBytesTransferred(l);
        continue;
      }
      Object localObject = this.buffer;
      i = ((ByteArrayBuffer)localObject).capacity();
      ByteArrayBuffer localByteArrayBuffer = this.buffer;
      int j = localByteArrayBuffer.length();
      i -= j;
      if (paramInt2 > i) {
        flushBuffer();
      }
      localObject = this.buffer;
      ((ByteArrayBuffer)localObject).append(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public void writeLine(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      int i = paramString.length();
      if (i > 0)
      {
        localObject = this.encoder;
        if (localObject == null)
        {
          i = 0;
          localObject = null;
          for (;;)
          {
            int j = paramString.length();
            if (i >= j) {
              break;
            }
            j = paramString.charAt(i);
            write(j);
            i += 1;
          }
        }
        localObject = CharBuffer.wrap(paramString);
        writeEncoded((CharBuffer)localObject);
      }
      Object localObject = CRLF;
      write((byte[])localObject);
    }
  }
  
  public void writeLine(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 0;
    if (paramCharArrayBuffer == null) {}
    for (;;)
    {
      return;
      Object localObject = this.encoder;
      if (localObject == null)
      {
        int j = paramCharArrayBuffer.length();
        while (j > 0)
        {
          ByteArrayBuffer localByteArrayBuffer1 = this.buffer;
          k = localByteArrayBuffer1.capacity();
          ByteArrayBuffer localByteArrayBuffer2 = this.buffer;
          int m = localByteArrayBuffer2.length();
          k = Math.min(k - m, j);
          if (k > 0)
          {
            localByteArrayBuffer2 = this.buffer;
            localByteArrayBuffer2.append(paramCharArrayBuffer, i, k);
          }
          localByteArrayBuffer2 = this.buffer;
          boolean bool = localByteArrayBuffer2.isFull();
          if (bool) {
            flushBuffer();
          }
          i += k;
          j -= k;
        }
      }
      localObject = paramCharArrayBuffer.buffer();
      int k = paramCharArrayBuffer.length();
      localObject = CharBuffer.wrap((char[])localObject, 0, k);
      writeEncoded((CharBuffer)localObject);
      localObject = CRLF;
      write((byte[])localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\SessionOutputBufferImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */