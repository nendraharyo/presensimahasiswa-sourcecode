package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;

public class ResourceBitmapDecoder
  implements ResourceDecoder
{
  private final BitmapPool bitmapPool;
  private final ResourceDrawableDecoder drawableDecoder;
  
  public ResourceBitmapDecoder(ResourceDrawableDecoder paramResourceDrawableDecoder, BitmapPool paramBitmapPool)
  {
    this.drawableDecoder = paramResourceDrawableDecoder;
    this.bitmapPool = paramBitmapPool;
  }
  
  public Resource decode(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject = this.drawableDecoder.decode(paramUri, paramInt1, paramInt2, paramOptions);
    if (localObject == null) {}
    BitmapPool localBitmapPool;
    for (localObject = null;; localObject = DrawableToBitmapConverter.convert(localBitmapPool, (Drawable)localObject, paramInt1, paramInt2))
    {
      return (Resource)localObject;
      localObject = (Drawable)((Resource)localObject).get();
      localBitmapPool = this.bitmapPool;
    }
  }
  
  public boolean handles(Uri paramUri, Options paramOptions)
  {
    String str = paramUri.getScheme();
    return "android.resource".equals(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\ResourceBitmapDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */