package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream
  extends FilterInputStream
{
  private volatile byte[] buf;
  private final ArrayPool byteArrayPool;
  private int count;
  private int marklimit;
  private int markpos = -1;
  private int pos;
  
  public RecyclableBufferedInputStream(InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    this(paramInputStream, paramArrayPool, 65536);
  }
  
  RecyclableBufferedInputStream(InputStream paramInputStream, ArrayPool paramArrayPool, int paramInt)
  {
    super(paramInputStream);
    this.byteArrayPool = paramArrayPool;
    byte[] arrayOfByte = (byte[])paramArrayPool.get(paramInt, byte[].class);
    this.buf = arrayOfByte;
  }
  
  private int fillbuf(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = -1;
    int j = this.markpos;
    int k;
    if (j != i)
    {
      j = this.pos;
      k = this.markpos;
      j -= k;
      k = this.marklimit;
      if (j < k) {}
    }
    else
    {
      j = paramInputStream.read(paramArrayOfByte);
      if (j > 0)
      {
        this.markpos = i;
        this.pos = 0;
        this.count = j;
      }
      return j;
    }
    j = this.markpos;
    if (j == 0)
    {
      j = this.marklimit;
      k = paramArrayOfByte.length;
      if (j > k)
      {
        j = this.count;
        k = paramArrayOfByte.length;
        if (j == k)
        {
          j = paramArrayOfByte.length * 2;
          k = this.marklimit;
          if (j > k) {
            j = this.marklimit;
          }
          ArrayPool localArrayPool = this.byteArrayPool;
          Class localClass = byte[].class;
          byte[] arrayOfByte = (byte[])localArrayPool.get(j, localClass);
          k = paramArrayOfByte.length;
          System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, k);
          this.buf = arrayOfByte;
          localArrayPool = this.byteArrayPool;
          localArrayPool.put(paramArrayOfByte);
          paramArrayOfByte = arrayOfByte;
          label210:
          j = this.pos;
          k = this.markpos;
          j -= k;
          this.pos = j;
          this.markpos = 0;
          this.count = 0;
          j = this.pos;
          k = paramArrayOfByte.length;
          i = this.pos;
          k -= i;
          k = paramInputStream.read(paramArrayOfByte, j, k);
          if (k > 0) {
            break label346;
          }
        }
      }
    }
    label346:
    for (j = this.pos;; j = this.pos + k)
    {
      this.count = j;
      j = k;
      break;
      j = this.markpos;
      if (j <= 0) {
        break label210;
      }
      j = this.markpos;
      k = paramArrayOfByte.length;
      i = this.markpos;
      k -= i;
      System.arraycopy(paramArrayOfByte, j, paramArrayOfByte, 0, k);
      break label210;
    }
  }
  
  private static IOException streamClosed()
  {
    IOException localIOException = new java/io/IOException;
    localIOException.<init>("BufferedInputStream is closed");
    throw localIOException;
  }
  
  public int available()
  {
    try
    {
      Object localObject1 = this.in;
      byte[] arrayOfByte = this.buf;
      if ((arrayOfByte == null) || (localObject1 == null))
      {
        localObject1 = streamClosed();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    int i = this.count;
    int j = this.pos;
    i -= j;
    int k = ((InputStream)localObject2).available() + i;
    return k;
  }
  
  public void close()
  {
    Object localObject = this.buf;
    if (localObject != null)
    {
      localObject = this.byteArrayPool;
      byte[] arrayOfByte = this.buf;
      ((ArrayPool)localObject).put(arrayOfByte);
      this.buf = null;
    }
    localObject = this.in;
    this.in = null;
    if (localObject != null) {
      ((InputStream)localObject).close();
    }
  }
  
  public void fixMarkLimit()
  {
    try
    {
      byte[] arrayOfByte = this.buf;
      int i = arrayOfByte.length;
      this.marklimit = i;
      return;
    }
    finally {}
  }
  
  public void mark(int paramInt)
  {
    try
    {
      int i = this.marklimit;
      i = Math.max(i, paramInt);
      this.marklimit = i;
      i = this.pos;
      this.markpos = i;
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
    int i = -1;
    byte[] arrayOfByte;
    Object localObject1;
    try
    {
      arrayOfByte = this.buf;
      localObject1 = this.in;
      if ((arrayOfByte == null) || (localObject1 == null))
      {
        IOException localIOException1 = streamClosed();
        throw localIOException1;
      }
    }
    finally {}
    int j = this.pos;
    int k = this.count;
    int m;
    if (j >= k)
    {
      m = fillbuf((InputStream)localObject1, arrayOfByte);
      if (m != i) {}
    }
    for (;;)
    {
      return i;
      localObject1 = this.buf;
      if (arrayOfByte != localObject1)
      {
        arrayOfByte = this.buf;
        if (arrayOfByte == null)
        {
          IOException localIOException2 = streamClosed();
          throw localIOException2;
        }
      }
      m = this.count;
      j = this.pos;
      m -= j;
      if (m > 0)
      {
        i = this.pos;
        m = i + 1;
        this.pos = m;
        i = arrayOfByte[i] & 0xFF;
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    byte[] arrayOfByte1;
    try
    {
      arrayOfByte1 = this.buf;
      if (arrayOfByte1 == null)
      {
        IOException localIOException1 = streamClosed();
        throw localIOException1;
      }
    }
    finally {}
    IOException localIOException2;
    if (paramInt2 == 0)
    {
      i = 0;
      localIOException2 = null;
      return i;
    }
    InputStream localInputStream = this.in;
    if (localInputStream == null)
    {
      localIOException2 = streamClosed();
      throw localIOException2;
    }
    int j = this.pos;
    int k = this.count;
    if (j < k)
    {
      j = this.count;
      k = this.pos;
      j -= k;
      if (j >= paramInt2) {
        j = paramInt2;
      }
      for (;;)
      {
        k = this.pos;
        System.arraycopy(arrayOfByte1, k, paramArrayOfByte, paramInt1, j);
        k = this.pos + j;
        this.pos = k;
        if (j != paramInt2)
        {
          k = localInputStream.available();
          if (k != 0) {
            break label191;
          }
        }
        i = j;
        break;
        j = this.count;
        k = this.pos;
        j -= k;
      }
      label191:
      paramInt1 += j;
      k = paramInt2 - j;
    }
    for (;;)
    {
      j = this.markpos;
      if (j == i)
      {
        j = arrayOfByte1.length;
        if (k >= j)
        {
          j = localInputStream.read(paramArrayOfByte, paramInt1, k);
          if (j != i) {
            break label392;
          }
          if (k == paramInt2) {
            break;
          }
          i = paramInt2 - k;
          break;
          k = paramInt2;
          continue;
        }
      }
      j = fillbuf(localInputStream, arrayOfByte1);
      if (j == i)
      {
        if (k == paramInt2) {
          break;
        }
        i = paramInt2 - k;
        break;
      }
      byte[] arrayOfByte2 = this.buf;
      if (arrayOfByte1 != arrayOfByte2)
      {
        arrayOfByte1 = this.buf;
        if (arrayOfByte1 == null)
        {
          localIOException2 = streamClosed();
          throw localIOException2;
        }
      }
      j = this.count;
      int m = this.pos;
      j -= m;
      if (j >= k) {
        j = k;
      }
      for (;;)
      {
        m = this.pos;
        System.arraycopy(arrayOfByte1, m, paramArrayOfByte, paramInt1, j);
        m = this.pos + j;
        this.pos = m;
        label392:
        k -= j;
        if (k != 0) {
          break label432;
        }
        i = paramInt2;
        break;
        j = this.count;
        m = this.pos;
        j -= m;
      }
      label432:
      m = localInputStream.available();
      if (m == 0)
      {
        i = paramInt2 - k;
        break;
      }
      paramInt1 += j;
    }
  }
  
  public void release()
  {
    try
    {
      Object localObject1 = this.buf;
      if (localObject1 != null)
      {
        localObject1 = this.byteArrayPool;
        byte[] arrayOfByte = this.buf;
        ((ArrayPool)localObject1).put(arrayOfByte);
        localObject1 = null;
        this.buf = null;
      }
      return;
    }
    finally {}
  }
  
  public void reset()
  {
    Object localObject3;
    try
    {
      Object localObject1 = this.buf;
      if (localObject1 == null)
      {
        localObject1 = new java/io/IOException;
        localObject3 = "Stream is closed";
        ((IOException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    int i = -1;
    int j = this.markpos;
    if (i == j)
    {
      RecyclableBufferedInputStream.InvalidMarkException localInvalidMarkException = new com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream$InvalidMarkException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = "Mark has been invalidated, pos: ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      int k = this.pos;
      localObject3 = ((StringBuilder)localObject3).append(k);
      str = " markLimit: ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      k = this.marklimit;
      localObject3 = ((StringBuilder)localObject3).append(k);
      localObject3 = ((StringBuilder)localObject3).toString();
      localInvalidMarkException.<init>((String)localObject3);
      throw localInvalidMarkException;
    }
    i = this.markpos;
    this.pos = i;
  }
  
  public long skip(long paramLong)
  {
    int i = -1;
    long l1 = 1L;
    boolean bool1 = paramLong < l1;
    if (bool1) {
      paramLong = 0L;
    }
    for (;;)
    {
      return paramLong;
      byte[] arrayOfByte;
      try
      {
        arrayOfByte = this.buf;
        if (arrayOfByte == null)
        {
          IOException localIOException1 = streamClosed();
          throw localIOException1;
        }
      }
      finally {}
      InputStream localInputStream = this.in;
      if (localInputStream == null)
      {
        IOException localIOException2 = streamClosed();
        throw localIOException2;
      }
      int j = this.count;
      int m = this.pos;
      l1 = j - m;
      boolean bool2 = l1 < paramLong;
      int k;
      if (!bool2)
      {
        l1 = this.pos + paramLong;
        k = (int)l1;
        this.pos = k;
      }
      else
      {
        k = this.count;
        l1 = k;
        int n = this.pos;
        long l2 = n;
        l1 -= l2;
        n = this.count;
        this.pos = n;
        n = this.markpos;
        if (n != i)
        {
          l2 = this.marklimit;
          boolean bool3 = paramLong < l2;
          if (!bool3)
          {
            int i1 = fillbuf(localInputStream, arrayOfByte);
            if (i1 == i)
            {
              paramLong = l1;
              continue;
            }
            i1 = this.count;
            int i3 = this.pos;
            l3 = i1 - i3;
            l2 = paramLong - l1;
            boolean bool4 = l3 < l2;
            if (!bool4)
            {
              i2 = this.pos;
              l3 = i2 + paramLong;
              l1 = l3 - l1;
              k = (int)l1;
              this.pos = k;
              continue;
            }
            int i2 = this.count;
            l3 = i2;
            l1 += l3;
            i2 = this.pos;
            l3 = i2;
            paramLong = l1 - l3;
            k = this.count;
            this.pos = k;
            continue;
          }
        }
        l2 = paramLong - l1;
        long l3 = localInputStream.skip(l2);
        paramLong = l1 + l3;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\RecyclableBufferedInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */