package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;

public final class GifFrameResourceDecoder
  implements ResourceDecoder
{
  private final BitmapPool bitmapPool;
  
  public GifFrameResourceDecoder(BitmapPool paramBitmapPool)
  {
    this.bitmapPool = paramBitmapPool;
  }
  
  public Resource decode(GifDecoder paramGifDecoder, int paramInt1, int paramInt2, Options paramOptions)
  {
    Bitmap localBitmap = paramGifDecoder.getNextFrame();
    BitmapPool localBitmapPool = this.bitmapPool;
    return BitmapResource.obtain(localBitmap, localBitmapPool);
  }
  
  public boolean handles(GifDecoder paramGifDecoder, Options paramOptions)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifFrameResourceDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */