package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option.CacheKeyUpdater;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

class VideoDecoder$2
  implements Option.CacheKeyUpdater
{
  private final ByteBuffer buffer;
  
  VideoDecoder$2()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    this.buffer = localByteBuffer;
  }
  
  public void update(byte[] paramArrayOfByte, Integer paramInteger, MessageDigest paramMessageDigest)
  {
    if (paramInteger == null) {}
    for (;;)
    {
      return;
      paramMessageDigest.update(paramArrayOfByte);
      synchronized (this.buffer)
      {
        Object localObject1 = this.buffer;
        int i = 0;
        ((ByteBuffer)localObject1).position(0);
        localObject1 = this.buffer;
        i = paramInteger.intValue();
        localObject1 = ((ByteBuffer)localObject1).putInt(i);
        localObject1 = ((ByteBuffer)localObject1).array();
        paramMessageDigest.update((byte[])localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoDecoder$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */