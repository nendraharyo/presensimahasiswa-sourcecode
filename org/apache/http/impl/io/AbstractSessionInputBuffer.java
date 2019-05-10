package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractSessionInputBuffer
  implements BufferInfo, SessionInputBuffer
{
  private boolean ascii;
  private byte[] buffer;
  private int bufferlen;
  private int bufferpos;
  private CharBuffer cbuf;
  private Charset charset;
  private CharsetDecoder decoder;
  private InputStream instream;
  private ByteArrayBuffer linebuffer;
  private int maxLineLen;
  private HttpTransportMetricsImpl metrics;
  private int minChunkLimit;
  private CodingErrorAction onMalformedCharAction;
  private CodingErrorAction onUnmappableCharAction;
  
  private int appendDecoded(CharArrayBuffer paramCharArrayBuffer, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    boolean bool1 = paramByteBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return i;
      Object localObject1 = this.decoder;
      if (localObject1 == null)
      {
        localObject1 = this.charset.newDecoder();
        this.decoder = ((CharsetDecoder)localObject1);
        localObject1 = this.decoder;
        localObject2 = this.onMalformedCharAction;
        ((CharsetDecoder)localObject1).onMalformedInput((CodingErrorAction)localObject2);
        localObject1 = this.decoder;
        localObject2 = this.onUnmappableCharAction;
        ((CharsetDecoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject2);
      }
      localObject1 = this.cbuf;
      if (localObject1 == null)
      {
        int j = 1024;
        localObject1 = CharBuffer.allocate(j);
        this.cbuf = ((CharBuffer)localObject1);
      }
      localObject1 = this.decoder;
      ((CharsetDecoder)localObject1).reset();
      for (;;)
      {
        boolean bool2 = paramByteBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject1 = this.decoder;
        localObject2 = this.cbuf;
        boolean bool3 = true;
        localObject1 = ((CharsetDecoder)localObject1).decode(paramByteBuffer, (CharBuffer)localObject2, bool3);
        k = handleDecodingResult((CoderResult)localObject1, paramCharArrayBuffer, paramByteBuffer);
        i += k;
      }
      localObject1 = this.decoder;
      Object localObject2 = this.cbuf;
      localObject1 = ((CharsetDecoder)localObject1).flush((CharBuffer)localObject2);
      int k = handleDecodingResult((CoderResult)localObject1, paramCharArrayBuffer, paramByteBuffer);
      i += k;
      localObject1 = this.cbuf;
      ((CharBuffer)localObject1).clear();
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
    Object localObject2;
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
    boolean bool = this.ascii;
    if (bool)
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
    Object localObject;
    if (paramInt > i)
    {
      localObject = this.buffer;
      int k = paramInt + -1;
      j = localObject[k];
      k = 13;
      if (j == k) {
        paramInt += -1;
      }
    }
    j = paramInt - i;
    boolean bool = this.ascii;
    byte[] arrayOfByte;
    if (bool)
    {
      arrayOfByte = this.buffer;
      paramCharArrayBuffer.append(arrayOfByte, i, j);
    }
    for (;;)
    {
      return j;
      arrayOfByte = this.buffer;
      localObject = ByteBuffer.wrap(arrayOfByte, i, j);
      j = appendDecoded(paramCharArrayBuffer, (ByteBuffer)localObject);
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
  
  public int available()
  {
    int i = capacity();
    int j = length();
    return i - j;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  protected HttpTransportMetricsImpl createTransportMetrics()
  {
    HttpTransportMetricsImpl localHttpTransportMetricsImpl = new org/apache/http/impl/io/HttpTransportMetricsImpl;
    localHttpTransportMetricsImpl.<init>();
    return localHttpTransportMetricsImpl;
  }
  
  protected int fillBuffer()
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
        arrayOfByte2 = this.buffer;
        System.arraycopy(arrayOfByte1, m, arrayOfByte2, 0, j);
      }
      this.bufferpos = 0;
      this.bufferlen = j;
    }
    int k = this.bufferlen;
    byte[] arrayOfByte3 = this.buffer;
    j = arrayOfByte3.length - k;
    InputStream localInputStream = this.instream;
    byte[] arrayOfByte2 = this.buffer;
    j = localInputStream.read(arrayOfByte2, k, j);
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
  
  protected boolean hasBufferedData()
  {
    int i = this.bufferpos;
    int k = this.bufferlen;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected void init(InputStream paramInputStream, int paramInt, HttpParams paramHttpParams)
  {
    int i = 0;
    Charset localCharset = null;
    Args.notNull(paramInputStream, "Input stream");
    Args.notNegative(paramInt, "Buffer size");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.instream = paramInputStream;
    Object localObject = new byte[paramInt];
    this.buffer = ((byte[])localObject);
    this.bufferpos = 0;
    this.bufferlen = 0;
    localObject = new org/apache/http/util/ByteArrayBuffer;
    ((ByteArrayBuffer)localObject).<init>(paramInt);
    this.linebuffer = ((ByteArrayBuffer)localObject);
    localObject = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    if (localObject != null)
    {
      localObject = Charset.forName((String)localObject);
      this.charset = ((Charset)localObject);
      localObject = this.charset;
      localCharset = Consts.ASCII;
      boolean bool = ((Charset)localObject).equals(localCharset);
      this.ascii = bool;
      this.decoder = null;
      int j = paramHttpParams.getIntParameter("http.connection.max-line-length", -1);
      this.maxLineLen = j;
      i = 512;
      j = paramHttpParams.getIntParameter("http.connection.min-chunk-limit", i);
      this.minChunkLimit = j;
      localObject = createTransportMetrics();
      this.metrics = ((HttpTransportMetricsImpl)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.malformed.input.action");
      if (localObject == null) {
        break label242;
      }
      label202:
      this.onMalformedCharAction = ((CodingErrorAction)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.unmappable.input.action");
      if (localObject == null) {
        break label250;
      }
    }
    for (;;)
    {
      this.onUnmappableCharAction = ((CodingErrorAction)localObject);
      return;
      localObject = Consts.ASCII;
      break;
      label242:
      localObject = CodingErrorAction.REPORT;
      break label202;
      label250:
      localObject = CodingErrorAction.REPORT;
    }
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
    InputStream localInputStream;
    if (paramArrayOfByte == null)
    {
      i = 0;
      localInputStream = null;
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
          localInputStream = this.instream;
          i = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
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
        n = this.maxLineLen;
        if (n <= 0) {
          break;
        }
        ByteArrayBuffer localByteArrayBuffer = this.linebuffer;
        n = localByteArrayBuffer.length();
        i1 = this.maxLineLen;
        if (n < i1) {
          break;
        }
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Maximum line length limit exceeded");
        throw ((Throwable)localObject1);
        bool3 = hasBufferedData();
        if (bool3)
        {
          m = this.bufferlen;
          n = this.bufferpos;
          m -= n;
          localByteArrayBuffer = this.linebuffer;
          localObject2 = this.buffer;
          int i3 = this.bufferpos;
          localByteArrayBuffer.append((byte[])localObject2, i3, m);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\AbstractSessionInputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */