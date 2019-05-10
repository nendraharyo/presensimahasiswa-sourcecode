package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBitmapDecoder
  implements ResourceDecoder
{
  private final Downsampler downsampler;
  
  public ByteBufferBitmapDecoder(Downsampler paramDownsampler)
  {
    this.downsampler = paramDownsampler;
  }
  
  public Resource decode(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, Options paramOptions)
  {
    InputStream localInputStream = ByteBufferUtil.toStream(paramByteBuffer);
    return this.downsampler.decode(localInputStream, paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(ByteBuffer paramByteBuffer, Options paramOptions)
  {
    return this.downsampler.handles(paramByteBuffer);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\ByteBufferBitmapDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */