package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option.CacheKeyUpdater;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

class VideoDecoder$1
  implements Option.CacheKeyUpdater
{
  private final ByteBuffer buffer;
  
  VideoDecoder$1()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    this.buffer = localByteBuffer;
  }
  
  public void update(byte[] paramArrayOfByte, Long paramLong, MessageDigest paramMessageDigest)
  {
    paramMessageDigest.update(paramArrayOfByte);
    synchronized (this.buffer)
    {
      Object localObject1 = this.buffer;
      ((ByteBuffer)localObject1).position(0);
      localObject1 = this.buffer;
      long l = paramLong.longValue();
      localObject1 = ((ByteBuffer)localObject1).putLong(l);
      localObject1 = ((ByteBuffer)localObject1).array();
      paramMessageDigest.update((byte[])localObject1);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoDecoder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */