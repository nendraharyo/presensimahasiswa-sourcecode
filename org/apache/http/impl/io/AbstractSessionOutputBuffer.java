package org.apache.http.impl.io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractSessionOutputBuffer
  implements BufferInfo, SessionOutputBuffer
{
  private static final byte[] CRLF;
  private boolean ascii;
  private ByteBuffer bbuf;
  private ByteArrayBuffer buffer;
  private Charset charset;
  private CharsetEncoder encoder;
  private HttpTransportMetricsImpl metrics;
  private int minChunkLimit;
  private CodingErrorAction onMalformedCharAction;
  private CodingErrorAction onUnmappableCharAction;
  private OutputStream outstream;
  
  static
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = 13;
    arrayOfByte[1] = 10;
    CRLF = arrayOfByte;
  }
  
  public AbstractSessionOutputBuffer() {}
  
  protected AbstractSessionOutputBuffer(OutputStream paramOutputStream, int paramInt1, Charset paramCharset, int paramInt2, CodingErrorAction paramCodingErrorAction1, CodingErrorAction paramCodingErrorAction2)
  {
    Args.notNull(paramOutputStream, "Input stream");
    Args.notNegative(paramInt1, "Buffer size");
    this.outstream = paramOutputStream;
    Object localObject = new org/apache/http/util/ByteArrayBuffer;
    ((ByteArrayBuffer)localObject).<init>(paramInt1);
    this.buffer = ((ByteArrayBuffer)localObject);
    if (paramCharset != null)
    {
      this.charset = paramCharset;
      localObject = this.charset;
      Charset localCharset = Consts.ASCII;
      boolean bool = ((Charset)localObject).equals(localCharset);
      this.ascii = bool;
      bool = false;
      localObject = null;
      this.encoder = null;
      if (paramInt2 < 0) {
        break label139;
      }
      label91:
      this.minChunkLimit = paramInt2;
      localObject = createTransportMetrics();
      this.metrics = ((HttpTransportMetricsImpl)localObject);
      if (paramCodingErrorAction1 == null) {
        break label147;
      }
      label114:
      this.onMalformedCharAction = paramCodingErrorAction1;
      if (paramCodingErrorAction2 == null) {
        break label155;
      }
    }
    for (;;)
    {
      this.onUnmappableCharAction = paramCodingErrorAction2;
      return;
      paramCharset = Consts.ASCII;
      break;
      label139:
      paramInt2 = 512;
      break label91;
      label147:
      paramCodingErrorAction1 = CodingErrorAction.REPORT;
      break label114;
      label155:
      paramCodingErrorAction2 = CodingErrorAction.REPORT;
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
  
  private void writeEncoded(CharBuffer paramCharBuffer)
  {
    boolean bool1 = paramCharBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.encoder;
      if (localObject1 == null)
      {
        localObject1 = this.charset.newEncoder();
        this.encoder = ((CharsetEncoder)localObject1);
        localObject1 = this.encoder;
        localObject2 = this.onMalformedCharAction;
        ((CharsetEncoder)localObject1).onMalformedInput((CodingErrorAction)localObject2);
        localObject1 = this.encoder;
        localObject2 = this.onUnmappableCharAction;
        ((CharsetEncoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject2);
      }
      localObject1 = this.bbuf;
      if (localObject1 == null)
      {
        int i = 1024;
        localObject1 = ByteBuffer.allocate(i);
        this.bbuf = ((ByteBuffer)localObject1);
      }
      localObject1 = this.encoder;
      ((CharsetEncoder)localObject1).reset();
      for (;;)
      {
        boolean bool2 = paramCharBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject1 = this.encoder;
        localObject2 = this.bbuf;
        boolean bool3 = true;
        localObject1 = ((CharsetEncoder)localObject1).encode(paramCharBuffer, (ByteBuffer)localObject2, bool3);
        handleEncodingResult((CoderResult)localObject1);
      }
      localObject1 = this.encoder;
      Object localObject2 = this.bbuf;
      localObject1 = ((CharsetEncoder)localObject1).flush((ByteBuffer)localObject2);
      handleEncodingResult((CoderResult)localObject1);
      localObject1 = this.bbuf;
      ((ByteBuffer)localObject1).clear();
    }
  }
  
  public int available()
  {
    int i = capacity();
    int j = length();
    return i - j;
  }
  
  public int capacity()
  {
    return this.buffer.capacity();
  }
  
  protected HttpTransportMetricsImpl createTransportMetrics()
  {
    HttpTransportMetricsImpl localHttpTransportMetricsImpl = new org/apache/http/impl/io/HttpTransportMetricsImpl;
    localHttpTransportMetricsImpl.<init>();
    return localHttpTransportMetricsImpl;
  }
  
  public void flush()
  {
    flushBuffer();
    this.outstream.flush();
  }
  
  protected void flushBuffer()
  {
    ByteArrayBuffer localByteArrayBuffer = this.buffer;
    int i = localByteArrayBuffer.length();
    if (i > 0)
    {
      Object localObject = this.outstream;
      byte[] arrayOfByte = this.buffer.buffer();
      ((OutputStream)localObject).write(arrayOfByte, 0, i);
      this.buffer.clear();
      localObject = this.metrics;
      long l = i;
      ((HttpTransportMetricsImpl)localObject).incrementBytesTransferred(l);
    }
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.metrics;
  }
  
  protected void init(OutputStream paramOutputStream, int paramInt, HttpParams paramHttpParams)
  {
    Args.notNull(paramOutputStream, "Input stream");
    Args.notNegative(paramInt, "Buffer size");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.outstream = paramOutputStream;
    Object localObject = new org/apache/http/util/ByteArrayBuffer;
    ((ByteArrayBuffer)localObject).<init>(paramInt);
    this.buffer = ((ByteArrayBuffer)localObject);
    localObject = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    if (localObject != null)
    {
      localObject = Charset.forName((String)localObject);
      this.charset = ((Charset)localObject);
      localObject = this.charset;
      Charset localCharset = Consts.ASCII;
      boolean bool = ((Charset)localObject).equals(localCharset);
      this.ascii = bool;
      this.encoder = null;
      int j = 512;
      int i = paramHttpParams.getIntParameter("http.connection.min-chunk-limit", j);
      this.minChunkLimit = i;
      localObject = createTransportMetrics();
      this.metrics = ((HttpTransportMetricsImpl)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.malformed.input.action");
      if (localObject == null) {
        break label197;
      }
      label158:
      this.onMalformedCharAction = ((CodingErrorAction)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.unmappable.input.action");
      if (localObject == null) {
        break label205;
      }
    }
    for (;;)
    {
      this.onUnmappableCharAction = ((CodingErrorAction)localObject);
      return;
      localObject = Consts.ASCII;
      break;
      label197:
      localObject = CodingErrorAction.REPORT;
      break label158;
      label205:
      localObject = CodingErrorAction.REPORT;
    }
  }
  
  public int length()
  {
    return this.buffer.length();
  }
  
  public void write(int paramInt)
  {
    ByteArrayBuffer localByteArrayBuffer = this.buffer;
    boolean bool = localByteArrayBuffer.isFull();
    if (bool) {
      flushBuffer();
    }
    this.buffer.append(paramInt);
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
      int i = this.minChunkLimit;
      if (paramInt2 <= i)
      {
        localObject = this.buffer;
        i = ((ByteArrayBuffer)localObject).capacity();
        if (paramInt2 <= i) {}
      }
      else
      {
        flushBuffer();
        this.outstream.write(paramArrayOfByte, paramInt1, paramInt2);
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
        int j = this.ascii;
        if (j != 0)
        {
          j = 0;
          localObject = null;
          for (;;)
          {
            int m = paramString.length();
            if (j >= m) {
              break;
            }
            int n = paramString.charAt(j);
            write(n);
            int k;
            j += 1;
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
      boolean bool1 = this.ascii;
      if (bool1)
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
          boolean bool2 = localByteArrayBuffer2.isFull();
          if (bool2) {
            flushBuffer();
          }
          i += k;
          j -= k;
        }
      }
      Object localObject = paramCharArrayBuffer.buffer();
      int k = paramCharArrayBuffer.length();
      localObject = CharBuffer.wrap((char[])localObject, 0, k);
      writeEncoded((CharBuffer)localObject);
      localObject = CRLF;
      write((byte[])localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\AbstractSessionOutputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */