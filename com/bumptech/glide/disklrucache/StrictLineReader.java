package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

class StrictLineReader
  implements Closeable
{
  private static final byte CR = 13;
  private static final byte LF = 10;
  private byte[] buf;
  private final Charset charset;
  private int end;
  private final InputStream in;
  private int pos;
  
  public StrictLineReader(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream == null) || (paramCharset == null))
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    if (paramInt < 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("capacity <= 0");
      throw ((Throwable)localObject);
    }
    Object localObject = Util.US_ASCII;
    boolean bool = paramCharset.equals(localObject);
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Unsupported encoding");
      throw ((Throwable)localObject);
    }
    this.in = paramInputStream;
    this.charset = paramCharset;
    localObject = new byte[paramInt];
    this.buf = ((byte[])localObject);
  }
  
  public StrictLineReader(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void fillBuf()
  {
    Object localObject = this.in;
    byte[] arrayOfByte1 = this.buf;
    byte[] arrayOfByte2 = this.buf;
    int i = arrayOfByte2.length;
    int j = ((InputStream)localObject).read(arrayOfByte1, 0, i);
    int k = -1;
    if (j == k)
    {
      localObject = new java/io/EOFException;
      ((EOFException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.pos = 0;
    this.end = j;
  }
  
  public void close()
  {
    synchronized (this.in)
    {
      Object localObject1 = this.buf;
      if (localObject1 != null)
      {
        localObject1 = null;
        this.buf = null;
        localObject1 = this.in;
        ((InputStream)localObject1).close();
      }
      return;
    }
  }
  
  public boolean hasUnterminatedLine()
  {
    int i = this.end;
    int k = -1;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String readLine()
  {
    int i = 10;
    synchronized (this.in)
    {
      Object localObject1 = this.buf;
      if (localObject1 == null)
      {
        localObject1 = new java/io/IOException;
        localObject4 = "LineReader is closed";
        ((IOException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    int j = this.pos;
    int k = this.end;
    if (j >= k) {
      fillBuf();
    }
    int m = this.pos;
    for (;;)
    {
      j = this.end;
      if (m == j) {
        break;
      }
      localObject3 = this.buf;
      j = localObject3[m];
      if (j == i)
      {
        j = this.pos;
        if (m != j)
        {
          localObject3 = this.buf;
          k = m + -1;
          j = localObject3[k];
          k = 13;
          if (j == k) {
            j = m + -1;
          }
        }
        for (k = j;; k = m)
        {
          localObject3 = new java/lang/String;
          byte[] arrayOfByte1 = this.buf;
          n = this.pos;
          i = this.pos;
          k -= i;
          Object localObject5 = this.charset;
          localObject5 = ((Charset)localObject5).name();
          ((String)localObject3).<init>(arrayOfByte1, n, k, (String)localObject5);
          k = m + 1;
          this.pos = k;
          return (String)localObject3;
        }
      }
      m += 1;
    }
    Object localObject4 = new com/bumptech/glide/disklrucache/StrictLineReader$1;
    j = this.end;
    m = this.pos;
    j = j - m + 80;
    ((StrictLineReader.1)localObject4).<init>(this, j);
    label269:
    Object localObject3 = this.buf;
    m = this.pos;
    int i1 = this.end;
    int n = this.pos;
    i1 -= n;
    ((ByteArrayOutputStream)localObject4).write((byte[])localObject3, m, i1);
    j = -1;
    this.end = j;
    fillBuf();
    j = this.pos;
    for (;;)
    {
      m = this.end;
      if (j == m) {
        break label269;
      }
      byte[] arrayOfByte2 = this.buf;
      m = arrayOfByte2[j];
      if (m == i)
      {
        m = this.pos;
        if (j != m)
        {
          arrayOfByte2 = this.buf;
          i1 = this.pos;
          n = this.pos;
          n = j - n;
          ((ByteArrayOutputStream)localObject4).write(arrayOfByte2, i1, n);
        }
        j += 1;
        this.pos = j;
        localObject3 = ((ByteArrayOutputStream)localObject4).toString();
        break;
      }
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\StrictLineReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */