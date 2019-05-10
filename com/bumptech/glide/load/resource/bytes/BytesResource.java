package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class BytesResource
  implements Resource
{
  private final byte[] bytes;
  
  public BytesResource(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = (byte[])Preconditions.checkNotNull(paramArrayOfByte);
    this.bytes = arrayOfByte;
  }
  
  public byte[] get()
  {
    return this.bytes;
  }
  
  public Class getResourceClass()
  {
    return byte[].class;
  }
  
  public int getSize()
  {
    return this.bytes.length;
  }
  
  public void recycle() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bytes\BytesResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */