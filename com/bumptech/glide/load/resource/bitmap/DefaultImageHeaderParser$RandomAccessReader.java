package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class DefaultImageHeaderParser$RandomAccessReader
{
  private final ByteBuffer data;
  
  DefaultImageHeaderParser$RandomAccessReader(byte[] paramArrayOfByte, int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    localByteBuffer = (ByteBuffer)localByteBuffer.order(localByteOrder).limit(paramInt);
    this.data = localByteBuffer;
  }
  
  private boolean isAvailable(int paramInt1, int paramInt2)
  {
    ByteBuffer localByteBuffer = this.data;
    int i = localByteBuffer.remaining() - paramInt1;
    if (i >= paramInt2) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = 0;
      localByteBuffer = null;
    }
  }
  
  short getInt16(int paramInt)
  {
    boolean bool = isAvailable(paramInt, 2);
    ByteBuffer localByteBuffer;
    if (bool) {
      localByteBuffer = this.data;
    }
    for (short s = localByteBuffer.getShort(paramInt);; s = -1) {
      return s;
    }
  }
  
  int getInt32(int paramInt)
  {
    boolean bool = isAvailable(paramInt, 4);
    ByteBuffer localByteBuffer;
    if (bool) {
      localByteBuffer = this.data;
    }
    for (int i = localByteBuffer.getInt(paramInt);; i = -1) {
      return i;
    }
  }
  
  int length()
  {
    return this.data.remaining();
  }
  
  void order(ByteOrder paramByteOrder)
  {
    this.data.order(paramByteOrder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DefaultImageHeaderParser$RandomAccessReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */