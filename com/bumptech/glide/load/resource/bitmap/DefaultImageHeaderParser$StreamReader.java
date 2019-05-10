package com.bumptech.glide.load.resource.bitmap;

import java.io.InputStream;

final class DefaultImageHeaderParser$StreamReader
  implements DefaultImageHeaderParser.Reader
{
  private final InputStream is;
  
  DefaultImageHeaderParser$StreamReader(InputStream paramInputStream)
  {
    this.is = paramInputStream;
  }
  
  public int getByte()
  {
    return this.is.read();
  }
  
  public int getUInt16()
  {
    int i = this.is.read() << 8 & 0xFF00;
    int j = this.is.read() & 0xFF;
    return i | j;
  }
  
  public short getUInt8()
  {
    return (short)(this.is.read() & 0xFF);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    while (i > 0)
    {
      InputStream localInputStream = this.is;
      int j = paramInt - i;
      int k = localInputStream.read(paramArrayOfByte, j, i);
      j = -1;
      if (k == j) {
        break;
      }
      i -= k;
    }
    return paramInt - i;
  }
  
  public long skip(long paramLong)
  {
    long l1 = 0L;
    boolean bool1 = paramLong < l1;
    if (bool1)
    {
      l2 = l1;
      return l2;
    }
    long l2 = paramLong;
    for (;;)
    {
      boolean bool2 = l2 < l1;
      if (bool2)
      {
        InputStream localInputStream = this.is;
        l3 = localInputStream.skip(l2);
        boolean bool3 = l3 < l1;
        if (bool3)
        {
          l2 -= l3;
          continue;
        }
        localInputStream = this.is;
        int i = localInputStream.read();
        int j = -1;
        if (i != j) {}
      }
      else
      {
        l2 = paramLong - l2;
        break;
      }
      long l3 = 1L;
      l2 -= l3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DefaultImageHeaderParser$StreamReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */