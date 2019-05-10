package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import java.nio.ByteBuffer;

public class ByteBufferRewinder$Factory
  implements DataRewinder.Factory
{
  public DataRewinder build(ByteBuffer paramByteBuffer)
  {
    ByteBufferRewinder localByteBufferRewinder = new com/bumptech/glide/load/resource/bytes/ByteBufferRewinder;
    localByteBufferRewinder.<init>(paramByteBuffer);
    return localByteBufferRewinder;
  }
  
  public Class getDataClass()
  {
    return ByteBuffer.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bytes\ByteBufferRewinder$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */