package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.InputStream;

public class MarkEnforcingInputStream
  extends FilterInputStream
{
  private static final int END_OF_STREAM = 255;
  private static final int UNSET = Integer.MIN_VALUE;
  private int availableBytes = -1 << -1;
  
  public MarkEnforcingInputStream(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  private long getBytesToRead(long paramLong)
  {
    int i = this.availableBytes;
    if (i == 0) {
      paramLong = -1;
    }
    for (;;)
    {
      return paramLong;
      i = this.availableBytes;
      int k = -1 << -1;
      if (i != k)
      {
        long l = this.availableBytes;
        boolean bool = paramLong < l;
        if (bool)
        {
          int j = this.availableBytes;
          paramLong = j;
        }
      }
    }
  }
  
  private void updateAvailableBytesAfterRead(long paramLong)
  {
    int i = this.availableBytes;
    int k = -1 << -1;
    if (i != k)
    {
      long l = -1;
      boolean bool = paramLong < l;
      if (bool)
      {
        l = this.availableBytes - paramLong;
        int j = (int)l;
        this.availableBytes = j;
      }
    }
  }
  
  public int available()
  {
    int i = this.availableBytes;
    int j = -1 << -1;
    if (i == j) {}
    for (i = super.available();; i = Math.min(i, j))
    {
      return i;
      i = this.availableBytes;
      j = super.available();
    }
  }
  
  public void mark(int paramInt)
  {
    try
    {
      super.mark(paramInt);
      this.availableBytes = paramInt;
      return;
    }
    finally {}
  }
  
  public int read()
  {
    long l1 = 1L;
    long l2 = getBytesToRead(l1);
    long l3 = -1;
    boolean bool = l2 < l3;
    int i;
    if (!bool) {
      i = -1;
    }
    for (;;)
    {
      return i;
      i = super.read();
      updateAvailableBytesAfterRead(l1);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    long l = paramInt2;
    l = getBytesToRead(l);
    int j = (int)l;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = super.read(paramArrayOfByte, paramInt1, j);
      l = i;
      updateAvailableBytesAfterRead(l);
    }
  }
  
  public void reset()
  {
    try
    {
      super.reset();
      int i = -1 << -1;
      this.availableBytes = i;
      return;
    }
    finally {}
  }
  
  public long skip(long paramLong)
  {
    long l1 = getBytesToRead(paramLong);
    long l2 = -1;
    boolean bool = l1 < l2;
    if (!bool) {
      l1 = 0L;
    }
    for (;;)
    {
      return l1;
      l1 = super.skip(l1);
      updateAvailableBytesAfterRead(l1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\MarkEnforcingInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */