package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import java.io.IOException;

class StreamBitmapDecoder$UntrustedCallbacks
  implements Downsampler.DecodeCallbacks
{
  private final RecyclableBufferedInputStream bufferedStream;
  private final ExceptionCatchingInputStream exceptionStream;
  
  StreamBitmapDecoder$UntrustedCallbacks(RecyclableBufferedInputStream paramRecyclableBufferedInputStream, ExceptionCatchingInputStream paramExceptionCatchingInputStream)
  {
    this.bufferedStream = paramRecyclableBufferedInputStream;
    this.exceptionStream = paramExceptionCatchingInputStream;
  }
  
  public void onDecodeComplete(BitmapPool paramBitmapPool, Bitmap paramBitmap)
  {
    IOException localIOException = this.exceptionStream.getException();
    if (localIOException != null)
    {
      if (paramBitmap != null) {
        paramBitmapPool.put(paramBitmap);
      }
      throw localIOException;
    }
  }
  
  public void onObtainBounds()
  {
    this.bufferedStream.fixMarkLimit();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\StreamBitmapDecoder$UntrustedCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */