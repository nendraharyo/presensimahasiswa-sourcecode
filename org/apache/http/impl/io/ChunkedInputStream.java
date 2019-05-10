package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class ChunkedInputStream
  extends InputStream
{
  private static final int BUFFER_SIZE = 2048;
  private static final int CHUNK_CRLF = 3;
  private static final int CHUNK_DATA = 2;
  private static final int CHUNK_LEN = 1;
  private final CharArrayBuffer buffer;
  private int chunkSize;
  private boolean closed = false;
  private boolean eof = false;
  private Header[] footers;
  private final SessionInputBuffer in;
  private int pos;
  private int state;
  
  public ChunkedInputStream(SessionInputBuffer paramSessionInputBuffer)
  {
    Object localObject = new Header[0];
    this.footers = ((Header[])localObject);
    localObject = (SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer");
    this.in = ((SessionInputBuffer)localObject);
    this.pos = 0;
    localObject = new org/apache/http/util/CharArrayBuffer;
    ((CharArrayBuffer)localObject).<init>(16);
    this.buffer = ((CharArrayBuffer)localObject);
    this.state = 1;
  }
  
  private int getChunkSize()
  {
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    int k = this.state;
    Object localObject2;
    CharArrayBuffer localCharArrayBuffer;
    switch (k)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Inconsistent codec state");
      throw ((Throwable)localObject1);
    case 3: 
      this.buffer.clear();
      localObject2 = this.in;
      localCharArrayBuffer = this.buffer;
      k = ((SessionInputBuffer)localObject2).readLine(localCharArrayBuffer);
      if (k != i) {
        break;
      }
    }
    for (;;)
    {
      return j;
      localObject2 = this.buffer;
      int m = ((CharArrayBuffer)localObject2).isEmpty();
      if (m == 0)
      {
        localObject1 = new org/apache/http/MalformedChunkCodingException;
        ((MalformedChunkCodingException)localObject1).<init>("Unexpected content at the end of chunk");
        throw ((Throwable)localObject1);
      }
      m = 1;
      this.state = m;
      this.buffer.clear();
      localObject2 = this.in;
      localCharArrayBuffer = this.buffer;
      int n = ((SessionInputBuffer)localObject2).readLine(localCharArrayBuffer);
      if (n == i) {
        continue;
      }
      localObject1 = this.buffer;
      n = 59;
      j = ((CharArrayBuffer)localObject1).indexOf(n);
      if (j < 0)
      {
        localObject1 = this.buffer;
        j = ((CharArrayBuffer)localObject1).length();
      }
      try
      {
        localObject2 = this.buffer;
        localCharArrayBuffer = null;
        localObject1 = ((CharArrayBuffer)localObject2).substringTrimmed(0, j);
        n = 16;
        j = Integer.parseInt((String)localObject1, n);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        MalformedChunkCodingException localMalformedChunkCodingException = new org/apache/http/MalformedChunkCodingException;
        localMalformedChunkCodingException.<init>("Bad chunk header");
        throw localMalformedChunkCodingException;
      }
    }
  }
  
  private void nextChunk()
  {
    int i = getChunkSize();
    this.chunkSize = i;
    i = this.chunkSize;
    if (i < 0)
    {
      localMalformedChunkCodingException = new org/apache/http/MalformedChunkCodingException;
      localMalformedChunkCodingException.<init>("Negative chunk size");
      throw localMalformedChunkCodingException;
    }
    this.state = 2;
    MalformedChunkCodingException localMalformedChunkCodingException = null;
    this.pos = 0;
    i = this.chunkSize;
    if (i == 0)
    {
      i = 1;
      this.eof = i;
      parseTrailerHeaders();
    }
  }
  
  private void parseTrailerHeaders()
  {
    try
    {
      Object localObject1 = this.in;
      int i = -1;
      int j = -1;
      str = null;
      localObject1 = AbstractMessageParser.parseHeaders((SessionInputBuffer)localObject1, i, j, null);
      this.footers = ((Header[])localObject1);
      return;
    }
    catch (HttpException localHttpException)
    {
      MalformedChunkCodingException localMalformedChunkCodingException = new org/apache/http/MalformedChunkCodingException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid footer: ");
      String str = localHttpException.getMessage();
      localObject2 = str;
      localMalformedChunkCodingException.<init>((String)localObject2);
      localMalformedChunkCodingException.initCause(localHttpException);
      throw localMalformedChunkCodingException;
    }
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
      int j = this.chunkSize;
      int k = this.pos;
      j -= k;
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
      bool2 = this.eof;
      if (!bool2)
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
      this.eof = bool1;
      this.closed = bool1;
    }
  }
  
  public Header[] getFooters()
  {
    return (Header[])this.footers.clone();
  }
  
  public int read()
  {
    int i = -1;
    boolean bool1 = this.closed;
    if (bool1)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted read from closed stream.");
      throw localIOException;
    }
    bool1 = this.eof;
    if (bool1) {}
    for (;;)
    {
      return i;
      int j = this.state;
      int m = 2;
      if (j != m)
      {
        nextChunk();
        boolean bool2 = this.eof;
        if (bool2) {}
      }
      else
      {
        SessionInputBuffer localSessionInputBuffer = this.in;
        int k = localSessionInputBuffer.read();
        if (k != i)
        {
          i = this.pos + 1;
          this.pos = i;
          i = this.pos;
          m = this.chunkSize;
          if (i >= m)
          {
            i = 3;
            this.state = i;
          }
        }
        i = k;
      }
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
    boolean bool1 = this.closed;
    if (bool1)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    bool1 = this.eof;
    if (bool1) {}
    for (;;)
    {
      return i;
      int j = this.state;
      m = 2;
      if (j != m)
      {
        nextChunk();
        boolean bool2 = this.eof;
        if (bool2) {}
      }
      else
      {
        localObject2 = this.in;
        m = this.chunkSize;
        int n = this.pos;
        m -= n;
        m = Math.min(paramInt2, m);
        int k = ((SessionInputBuffer)localObject2).read(paramArrayOfByte, paramInt1, m);
        if (k == i) {
          break;
        }
        i = this.pos + k;
        this.pos = i;
        i = this.pos;
        m = this.chunkSize;
        if (i >= m)
        {
          i = 3;
          this.state = i;
        }
        i = k;
      }
    }
    this.eof = true;
    Object localObject1 = new org/apache/http/TruncatedChunkException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Truncated chunk ( expected size: ");
    int m = this.chunkSize;
    localObject2 = ((StringBuilder)localObject2).append(m).append("; actual size: ");
    m = this.pos;
    localObject2 = m + ")";
    ((TruncatedChunkException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\ChunkedInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */