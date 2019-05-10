package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.OutputStream;

public final class BufferedOutputStream
  extends OutputStream
{
  private ArrayPool arrayPool;
  private byte[] buffer;
  private int index;
  private final OutputStream out;
  
  public BufferedOutputStream(OutputStream paramOutputStream, ArrayPool paramArrayPool)
  {
    this(paramOutputStream, paramArrayPool, 65536);
  }
  
  BufferedOutputStream(OutputStream paramOutputStream, ArrayPool paramArrayPool, int paramInt)
  {
    this.out = paramOutputStream;
    this.arrayPool = paramArrayPool;
    byte[] arrayOfByte = (byte[])paramArrayPool.get(paramInt, byte[].class);
    this.buffer = arrayOfByte;
  }
  
  private void flushBuffer()
  {
    int i = this.index;
    if (i > 0)
    {
      OutputStream localOutputStream = this.out;
      byte[] arrayOfByte = this.buffer;
      int j = this.index;
      localOutputStream.write(arrayOfByte, 0, j);
      this.index = 0;
    }
  }
  
  private void maybeFlushBuffer()
  {
    int i = this.index;
    byte[] arrayOfByte = this.buffer;
    int j = arrayOfByte.length;
    if (i == j) {
      flushBuffer();
    }
  }
  
  private void release()
  {
    Object localObject = this.buffer;
    if (localObject != null)
    {
      localObject = this.arrayPool;
      byte[] arrayOfByte = this.buffer;
      ((ArrayPool)localObject).put(arrayOfByte);
      localObject = null;
      this.buffer = null;
    }
  }
  
  public void close()
  {
    try
    {
      flush();
      this.out.close();
      release();
      return;
    }
    finally
    {
      this.out.close();
    }
  }
  
  public void flush()
  {
    flushBuffer();
    this.out.flush();
  }
  
  public void write(int paramInt)
  {
    byte[] arrayOfByte = this.buffer;
    int i = this.index;
    int j = i + 1;
    this.index = j;
    j = (byte)paramInt;
    arrayOfByte[i] = j;
    maybeFlushBuffer();
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    OutputStream localOutputStream = null;
    int j = paramInt2 - i;
    int k = paramInt1 + i;
    int m = this.index;
    byte[] arrayOfByte;
    if (m == 0)
    {
      arrayOfByte = this.buffer;
      m = arrayOfByte.length;
      if (j >= m)
      {
        localOutputStream = this.out;
        localOutputStream.write(paramArrayOfByte, k, j);
      }
    }
    for (;;)
    {
      return;
      m = this.buffer.length;
      int n = this.index;
      m -= n;
      j = Math.min(j, m);
      arrayOfByte = this.buffer;
      n = this.index;
      System.arraycopy(paramArrayOfByte, k, arrayOfByte, n, j);
      k = this.index + j;
      this.index = k;
      i += j;
      maybeFlushBuffer();
      if (i < paramInt2) {
        break;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\BufferedOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */