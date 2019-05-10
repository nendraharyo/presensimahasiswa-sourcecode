package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class ExifOrientationStream
  extends FilterInputStream
{
  private static final byte[] EXIF_SEGMENT;
  private static final int ORIENTATION_POSITION = SEGMENT_LENGTH + 2;
  private static final int SEGMENT_LENGTH = 0;
  private static final int SEGMENT_START_POSITION = 2;
  private final byte orientation;
  private int position;
  
  static
  {
    byte[] arrayOfByte = new byte[29];
    arrayOfByte[0] = -1;
    arrayOfByte[1] = -31;
    arrayOfByte[2] = 0;
    arrayOfByte[3] = 28;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 120;
    arrayOfByte[6] = 105;
    arrayOfByte[7] = 102;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 0;
    arrayOfByte[10] = 77;
    arrayOfByte[11] = 77;
    arrayOfByte[12] = 0;
    arrayOfByte[13] = 0;
    arrayOfByte[14] = 0;
    arrayOfByte[15] = 0;
    arrayOfByte[16] = 0;
    arrayOfByte[17] = 8;
    arrayOfByte[18] = 0;
    arrayOfByte[19] = 1;
    arrayOfByte[20] = 1;
    arrayOfByte[21] = 18;
    arrayOfByte[22] = 0;
    arrayOfByte[23] = 2;
    arrayOfByte[24] = 0;
    arrayOfByte[25] = 0;
    arrayOfByte[26] = 0;
    arrayOfByte[27] = 1;
    arrayOfByte[28] = 0;
    EXIF_SEGMENT = arrayOfByte;
    SEGMENT_LENGTH = EXIF_SEGMENT.length;
  }
  
  public ExifOrientationStream(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    int i = -1;
    if (paramInt >= i)
    {
      i = 8;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Cannot add invalid orientation: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    i = (byte)paramInt;
    this.orientation = i;
  }
  
  public void mark(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
  {
    int i = this.position;
    int j = 2;
    if (i >= j)
    {
      i = this.position;
      j = ORIENTATION_POSITION;
      if (i <= j) {}
    }
    else
    {
      i = super.read();
    }
    for (;;)
    {
      j = -1;
      if (i != j)
      {
        j = this.position + 1;
        this.position = j;
      }
      return i;
      i = this.position;
      j = ORIENTATION_POSITION;
      if (i == j)
      {
        i = this.orientation;
      }
      else
      {
        byte[] arrayOfByte = EXIF_SEGMENT;
        j = this.position + -2;
        i = arrayOfByte[j] & 0xFF;
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.position;
    int j = ORIENTATION_POSITION;
    if (i > j) {
      i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      if (i > 0)
      {
        j = this.position + i;
        this.position = j;
      }
      return i;
      i = this.position;
      j = ORIENTATION_POSITION;
      if (i == j)
      {
        i = this.orientation;
        paramArrayOfByte[paramInt1] = i;
        i = 1;
      }
      else
      {
        i = this.position;
        j = 2;
        if (i < j)
        {
          i = this.position;
          i = 2 - i;
          i = super.read(paramArrayOfByte, paramInt1, i);
        }
        else
        {
          i = ORIENTATION_POSITION;
          j = this.position;
          i = Math.min(i - j, paramInt2);
          byte[] arrayOfByte = EXIF_SEGMENT;
          int k = this.position + -2;
          System.arraycopy(arrayOfByte, k, paramArrayOfByte, paramInt1, i);
        }
      }
    }
  }
  
  public void reset()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public long skip(long paramLong)
  {
    long l1 = super.skip(paramLong);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      l2 = this.position + l1;
      int i = (int)l2;
      this.position = i;
    }
    return l1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\ExifOrientationStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */