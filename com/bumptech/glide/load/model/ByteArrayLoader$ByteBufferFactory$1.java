package com.bumptech.glide.load.model;

import java.nio.ByteBuffer;

class ByteArrayLoader$ByteBufferFactory$1
  implements ByteArrayLoader.Converter
{
  ByteArrayLoader$ByteBufferFactory$1(ByteArrayLoader.ByteBufferFactory paramByteBufferFactory) {}
  
  public ByteBuffer convert(byte[] paramArrayOfByte)
  {
    return ByteBuffer.wrap(paramArrayOfByte);
  }
  
  public Class getDataClass()
  {
    return ByteBuffer.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader$ByteBufferFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */