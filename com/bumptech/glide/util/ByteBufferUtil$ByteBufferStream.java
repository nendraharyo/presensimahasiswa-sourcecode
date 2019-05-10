package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

class ByteBufferUtil$ByteBufferStream
  extends InputStream
{
  private static final int UNSET = 255;
  private final ByteBuffer byteBuffer;
  private int markPos = -1;
  
  ByteBufferUtil$ByteBufferStream(ByteBuffer paramByteBuffer)
  {
    this.byteBuffer = paramByteBuffer;
  }
  
  public int available()
  {
    return this.byteBuffer.remaining();
  }
  
  public void mark(int paramInt)
  {
    try
    {
      ByteBuffer localByteBuffer = this.byteBuffer;
      int i = localByteBuffer.position();
      this.markPos = i;
      return;
    }
    finally {}
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    ByteBuffer localByteBuffer = this.byteBuffer;
    boolean bool = localByteBuffer.hasRemaining();
    if (!bool) {}
    for (int i = -1;; i = localByteBuffer.get())
    {
      return i;
      localByteBuffer = this.byteBuffer;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ByteBuffer localByteBuffer1 = this.byteBuffer;
    boolean bool = localByteBuffer1.hasRemaining();
    int i;
    if (!bool) {
      i = -1;
    }
    for (;;)
    {
      return i;
      i = available();
      i = Math.min(paramInt2, i);
      ByteBuffer localByteBuffer2 = this.byteBuffer;
      localByteBuffer2.get(paramArrayOfByte, paramInt1, i);
    }
  }
  
  public void reset()
  {
    try
    {
      int i = this.markPos;
      j = -1;
      if (i == j)
      {
        IOException localIOException = new java/io/IOException;
        String str = "Cannot reset to unset mark position";
        localIOException.<init>(str);
        throw localIOException;
      }
    }
    finally {}
    ByteBuffer localByteBuffer = this.byteBuffer;
    int j = this.markPos;
    localByteBuffer.position(j);
  }
  
  public long skip(long paramLong)
  {
    ByteBuffer localByteBuffer1 = this.byteBuffer;
    boolean bool = localByteBuffer1.hasRemaining();
    long l1;
    if (!bool) {
      l1 = -1;
    }
    for (;;)
    {
      return l1;
      int i = available();
      l1 = i;
      l1 = Math.min(paramLong, l1);
      ByteBuffer localByteBuffer2 = this.byteBuffer;
      ByteBuffer localByteBuffer3 = this.byteBuffer;
      long l2 = localByteBuffer3.position() + l1;
      int j = (int)l2;
      localByteBuffer2.position(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ByteBufferUtil$ByteBufferStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */