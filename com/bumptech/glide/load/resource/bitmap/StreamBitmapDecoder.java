package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.InputStream;

public class StreamBitmapDecoder
  implements ResourceDecoder
{
  private final ArrayPool byteArrayPool;
  private final Downsampler downsampler;
  
  public StreamBitmapDecoder(Downsampler paramDownsampler, ArrayPool paramArrayPool)
  {
    this.downsampler = paramDownsampler;
    this.byteArrayPool = paramArrayPool;
  }
  
  public Resource decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions)
  {
    boolean bool = paramInputStream instanceof RecyclableBufferedInputStream;
    Object localObject1;
    if (bool)
    {
      paramInputStream = (RecyclableBufferedInputStream)paramInputStream;
      bool = false;
      localObject1 = null;
      i = 0;
    }
    for (;;)
    {
      localExceptionCatchingInputStream = ExceptionCatchingInputStream.obtain(paramInputStream);
      Object localObject3 = new com/bumptech/glide/util/MarkEnforcingInputStream;
      ((MarkEnforcingInputStream)localObject3).<init>(localExceptionCatchingInputStream);
      StreamBitmapDecoder.UntrustedCallbacks localUntrustedCallbacks = new com/bumptech/glide/load/resource/bitmap/StreamBitmapDecoder$UntrustedCallbacks;
      localUntrustedCallbacks.<init>(paramInputStream, localExceptionCatchingInputStream);
      try
      {
        localObject1 = this.downsampler;
        localObject1 = ((Downsampler)localObject1).decode((InputStream)localObject3, paramInt1, paramInt2, paramOptions, localUntrustedCallbacks);
        return (Resource)localObject1;
      }
      finally
      {
        localExceptionCatchingInputStream.release();
        if (i == 0) {
          break;
        }
        paramInputStream.release();
      }
      localObject3 = new com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream;
      localObject1 = this.byteArrayPool;
      ((RecyclableBufferedInputStream)localObject3).<init>(paramInputStream, (ArrayPool)localObject1);
      bool = true;
      i = bool;
      paramInputStream = (InputStream)localObject3;
    }
  }
  
  public boolean handles(InputStream paramInputStream, Options paramOptions)
  {
    return this.downsampler.handles(paramInputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\StreamBitmapDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */