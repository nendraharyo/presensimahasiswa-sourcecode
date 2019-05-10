package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.Queue;

class ByteBufferGifDecoder$GifHeaderParserPool
{
  private final Queue pool;
  
  ByteBufferGifDecoder$GifHeaderParserPool()
  {
    Queue localQueue = Util.createQueue(0);
    this.pool = localQueue;
  }
  
  GifHeaderParser obtain(ByteBuffer paramByteBuffer)
  {
    try
    {
      Object localObject1 = this.pool;
      localObject1 = ((Queue)localObject1).poll();
      localObject1 = (GifHeaderParser)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/gifdecoder/GifHeaderParser;
        ((GifHeaderParser)localObject1).<init>();
      }
      localObject1 = ((GifHeaderParser)localObject1).setData(paramByteBuffer);
      return (GifHeaderParser)localObject1;
    }
    finally {}
  }
  
  void release(GifHeaderParser paramGifHeaderParser)
  {
    try
    {
      paramGifHeaderParser.clear();
      Queue localQueue = this.pool;
      localQueue.offer(paramGifHeaderParser);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\ByteBufferGifDecoder$GifHeaderParserPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */