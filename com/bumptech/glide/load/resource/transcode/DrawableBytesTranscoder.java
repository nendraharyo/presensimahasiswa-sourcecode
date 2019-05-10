package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

public final class DrawableBytesTranscoder
  implements ResourceTranscoder
{
  private final ResourceTranscoder bitmapBytesTranscoder;
  private final BitmapPool bitmapPool;
  private final ResourceTranscoder gifDrawableBytesTranscoder;
  
  public DrawableBytesTranscoder(BitmapPool paramBitmapPool, ResourceTranscoder paramResourceTranscoder1, ResourceTranscoder paramResourceTranscoder2)
  {
    this.bitmapPool = paramBitmapPool;
    this.bitmapBytesTranscoder = paramResourceTranscoder1;
    this.gifDrawableBytesTranscoder = paramResourceTranscoder2;
  }
  
  private static Resource toGifDrawableResource(Resource paramResource)
  {
    return paramResource;
  }
  
  public Resource transcode(Resource paramResource, Options paramOptions)
  {
    Object localObject1 = (Drawable)paramResource.get();
    boolean bool1 = localObject1 instanceof BitmapDrawable;
    Object localObject2;
    if (bool1)
    {
      localObject2 = this.bitmapBytesTranscoder;
      localObject1 = ((BitmapDrawable)localObject1).getBitmap();
      BitmapPool localBitmapPool = this.bitmapPool;
      localObject1 = BitmapResource.obtain((Bitmap)localObject1, localBitmapPool);
      localObject1 = ((ResourceTranscoder)localObject2).transcode((Resource)localObject1, paramOptions);
    }
    for (;;)
    {
      return (Resource)localObject1;
      boolean bool2 = localObject1 instanceof GifDrawable;
      if (bool2)
      {
        localObject1 = this.gifDrawableBytesTranscoder;
        localObject2 = toGifDrawableResource(paramResource);
        localObject1 = ((ResourceTranscoder)localObject1).transcode((Resource)localObject2, paramOptions);
      }
      else
      {
        bool2 = false;
        localObject1 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\DrawableBytesTranscoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */