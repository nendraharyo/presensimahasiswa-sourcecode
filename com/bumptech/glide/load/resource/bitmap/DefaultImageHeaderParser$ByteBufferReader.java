package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class DefaultImageHeaderParser$ByteBufferReader
  implements DefaultImageHeaderParser.Reader
{
  private final ByteBuffer byteBuffer;
  
  DefaultImageHeaderParser$ByteBufferReader(ByteBuffer paramByteBuffer)
  {
    this.byteBuffer = paramByteBuffer;
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    paramByteBuffer.order(localByteOrder);
  }
  
  public int getByte()
  {
    ByteBuffer localByteBuffer = this.byteBuffer;
    int i = localByteBuffer.remaining();
    int j = 1;
    if (i < j) {}
    for (i = -1;; i = localByteBuffer.get())
    {
      return i;
      localByteBuffer = this.byteBuffer;
    }
  }
  
  public int getUInt16()
  {
    int i = getByte() << 8 & 0xFF00;
    int j = getByte() & 0xFF;
    return i | j;
  }
  
  public short getUInt8()
  {
    return (short)(getByte() & 0xFF);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt)
  {
    ByteBuffer localByteBuffer1 = this.byteBuffer;
    int i = localByteBuffer1.remaining();
    i = Math.min(paramInt, i);
    if (i == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      ByteBuffer localByteBuffer2 = this.byteBuffer;
      localByteBuffer2.get(paramArrayOfByte, 0, i);
    }
  }
  
  public long skip(long paramLong)
  {
    int i = (int)Math.min(this.byteBuffer.remaining(), paramLong);
    ByteBuffer localByteBuffer = this.byteBuffer;
    int j = this.byteBuffer.position() + i;
    localByteBuffer.position(j);
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DefaultImageHeaderParser$ByteBufferReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */