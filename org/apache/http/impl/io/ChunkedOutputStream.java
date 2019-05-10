package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

public class ChunkedOutputStream
  extends OutputStream
{
  private final byte[] cache;
  private int cachePosition = 0;
  private boolean closed = false;
  private final SessionOutputBuffer out;
  private boolean wroteLastChunk = false;
  
  public ChunkedOutputStream(int paramInt, SessionOutputBuffer paramSessionOutputBuffer)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.cache = arrayOfByte;
    this.out = paramSessionOutputBuffer;
  }
  
  public ChunkedOutputStream(SessionOutputBuffer paramSessionOutputBuffer)
  {
    this(2048, paramSessionOutputBuffer);
  }
  
  public ChunkedOutputStream(SessionOutputBuffer paramSessionOutputBuffer, int paramInt)
  {
    this(paramInt, paramSessionOutputBuffer);
  }
  
  public void close()
  {
    boolean bool = this.closed;
    if (!bool)
    {
      bool = true;
      this.closed = bool;
      finish();
      SessionOutputBuffer localSessionOutputBuffer = this.out;
      localSessionOutputBuffer.flush();
    }
  }
  
  public void finish()
  {
    boolean bool = this.wroteLastChunk;
    if (!bool)
    {
      flushCache();
      writeClosingChunk();
      bool = true;
      this.wroteLastChunk = bool;
    }
  }
  
  public void flush()
  {
    flushCache();
    this.out.flush();
  }
  
  protected void flushCache()
  {
    int i = this.cachePosition;
    if (i > 0)
    {
      SessionOutputBuffer localSessionOutputBuffer = this.out;
      int j = this.cachePosition;
      Object localObject = Integer.toHexString(j);
      localSessionOutputBuffer.writeLine((String)localObject);
      localSessionOutputBuffer = this.out;
      localObject = this.cache;
      int k = this.cachePosition;
      localSessionOutputBuffer.write((byte[])localObject, 0, k);
      localSessionOutputBuffer = this.out;
      localObject = "";
      localSessionOutputBuffer.writeLine((String)localObject);
      this.cachePosition = 0;
    }
  }
  
  protected void flushCacheWithAppend(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    SessionOutputBuffer localSessionOutputBuffer = this.out;
    Object localObject = Integer.toHexString(this.cachePosition + paramInt2);
    localSessionOutputBuffer.writeLine((String)localObject);
    localSessionOutputBuffer = this.out;
    localObject = this.cache;
    int i = this.cachePosition;
    localSessionOutputBuffer.write((byte[])localObject, 0, i);
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    this.out.writeLine("");
    this.cachePosition = 0;
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.closed;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.cache;
    int j = this.cachePosition;
    int k = (byte)paramInt;
    localObject[j] = k;
    int i = this.cachePosition + 1;
    this.cachePosition = i;
    i = this.cachePosition;
    byte[] arrayOfByte = this.cache;
    j = arrayOfByte.length;
    if (i == j) {
      flushCache();
    }
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
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.cache;
    int i = localObject.length;
    int j = this.cachePosition;
    i -= j;
    if (paramInt2 >= i) {
      flushCacheWithAppend(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      localObject = this.cache;
      j = this.cachePosition;
      System.arraycopy(paramArrayOfByte, paramInt1, localObject, j, paramInt2);
      i = this.cachePosition + paramInt2;
      this.cachePosition = i;
    }
  }
  
  protected void writeClosingChunk()
  {
    this.out.writeLine("0");
    this.out.writeLine("");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\ChunkedOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */