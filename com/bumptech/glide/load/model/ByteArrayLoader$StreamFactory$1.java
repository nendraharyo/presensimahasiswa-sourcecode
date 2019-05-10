package com.bumptech.glide.load.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ByteArrayLoader$StreamFactory$1
  implements ByteArrayLoader.Converter
{
  ByteArrayLoader$StreamFactory$1(ByteArrayLoader.StreamFactory paramStreamFactory) {}
  
  public InputStream convert(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    return localByteArrayInputStream;
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteArrayLoader$StreamFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */